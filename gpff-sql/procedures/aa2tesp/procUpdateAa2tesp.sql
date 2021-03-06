
-- DROP PROCEDURE GPSQLWEB.procUpdateAa2tesp
    
CREATE PROCEDURE GPSQLWEB.procUpdateAa2tesp
(
    IN P_ROWID BIGINT,
 IN P_ESPEMP varchar(2),
 IN P_ESPDEL varchar(2),
 IN P_ESPCLA BIGINT,
 IN P_ESPTIP double,

    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Default '';
  Declare V_CANT INT DEFAULT 0;
  
  SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.AA2TESP WHERE RRN(GPDATWEB.AA2TESP) =  P_ROWID ;

  IF V_CANT > 1 THEN
	SET P_MSGCODE = 9001;
        SET StringSQL = '9001 - HAY MAS DE UN REGISTRO CON LA CLAVE PRIMARIA';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateAa2tesp', StringSQL);
        RETURN;
  END IF;

  IF V_CANT = 0 THEN
	SET P_MSGCODE = 9000;
        SET StringSQL = '9000 - NO HAY REGISTROS QUE MODIFICAR CODIGO';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateAa2tesp', StringSQL);
        RETURN;
  END IF;

  UPDATE GPDATWEB.AA2TESP SET ESPEMP= P_ESPEMP , ESPDEL= P_ESPDEL , ESPCLA= P_ESPCLA , ESPTIP= P_ESPTIP  WHERE RRN(GPDATWEB.AA2TESP) =  P_ROWID ;
  SET P_MSGCODE = 0;    
  Set StringSQL = 'UPDATE GPDATWEB.AA2TESP SET ESPEMP= '''||P_ESPEMP || ''' , ESPDEL= '''||P_ESPDEL || ''' , ESPCLA= '''||P_ESPCLA || ''' , ESPTIP= '''||P_ESPTIP || '''  WHERE RRN(GPDATWEB.AA2TESP) = '''|| P_ROWID || ''';';
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateAa2tesp', StringSQL);
END
GO


