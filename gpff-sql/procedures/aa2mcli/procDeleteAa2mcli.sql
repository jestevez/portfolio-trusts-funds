--DROP PROCEDURE GPSQLWEB.procDeleteAa2mcli

CREATE PROCEDURE GPSQLWEB.procDeleteAa2mcli (
    IN P_CLICLA BIGINT,
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
BEGIN
    Declare StringSQL Varchar(32000) Not Null Default '';
    Declare V_CANT INT DEFAULT 0;
    Declare V_CLITC1 NUMERIC(2 , 0);
    Declare V_CLIEMP CHAR(2);
    Declare V_CLIDEL CHAR(2);
    Declare V_CLIFEB DECIMAL(8 , 0);
    Declare V_CLITC2 NUMERIC(3 , 0);
    Declare V_AREA CHAR(4);

    SELECT 
        CAST (YEAR(current timestamp) || substr( digits (MONTH(current timestamp)),9) || substr( digits (DAY(current timestamp)),9) AS DECIMAL(8,0))
         INTO V_CLIFEB FROM SYSIBM.SYSDUMMY1;

    SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.AA2MCLI WHERE CLICLA = P_CLICLA;

    IF V_CANT > 1 THEN
          SET P_MSGCODE = 9001;
          SET StringSQL = '9001 - HAY MAS DE UN REGISTRO CON LA CLAVE PRIMARIA';
          CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Eliminar', 'procDeleteAa2mcli', StringSQL);
          RETURN;
    END IF;

    IF V_CANT = 0 THEN
          SET P_MSGCODE = 9000;
          SET StringSQL = '9000 - NO HAY REGISTROS QUE MODIFICAR';
          CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Eliminar', 'procDeleteAa2mcli', StringSQL);
          RETURN;
    END IF;

    UPDATE GPDATWEB.AA2MCLI SET CLIREG='E', CLIFEB = V_CLIFEB WHERE CLICLA = P_CLICLA;
    SET P_MSGCODE = 0;
    Set StringSQL = 'UPDATE GPDATWEB.AA2MCLI SET CLIREG=''E'', CLIFEB = '''|| V_CLIFEB ||'''  WHERE CLICLA =  '''|| P_CLICLA ||''';';
    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Eliminar', 'procDeleteAa2mcli', StringSQL);

    SELECT CLITC1, CLIEMP, CLIDEL, CLITC2 INTO V_CLITC1, V_CLIEMP, V_CLIDEL, V_CLITC2 FROM GPDATWEB.AA2MCLI WHERE CLICLA = P_CLICLA;

    --Si es Suprimir (Dar de Baja) y CLITC1 <> 2:
    --Marcar el campo CLIREG='E' y actualizar
    --Hay que actualizar el campo ejecutar el programa CRECTA7 
    IF V_CLITC1 <> 2 THEN
        --UPDATE GPDATWEB.AA2MCLI SET CLIREG='E' WHERE CLICLA = P_CLICLA;
        CALL GPSQLWEB.PROCCLCRECTA7(V_CLIEMP, V_CLIDEL, P_CLICLA);
        SET P_MSGCODE = 0;
    END IF;

    set V_AREA =  V_CLIEMP || V_CLIDEL;

    --Si es Nuevo y CLITC1 = 50:
    --Hay que ejecutar el programa CTLFO2PMP
    IF V_CLITC1 = 50 THEN
        CALL GPSQLWEB.PROCCLCTLFO2PM(V_AREA, P_CLICLA, V_CLITC2);
        SET P_MSGCODE = 0;
    END IF;

END
GO
