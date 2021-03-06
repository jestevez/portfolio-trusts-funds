
-- DROP PROCEDURE GPSQLWEB.procUpdateTabsb42
    
CREATE PROCEDURE GPSQLWEB.procUpdateTabsb42
(
     IN P_T42COD INTEGER,
            IN P_T42NOM VARCHAR(50),
           
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Default '';
  Declare V_CANT INT DEFAULT 0;
  
  SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.TABSB42 WHERE T42COD = P_T42COD;

  IF V_CANT > 1 THEN
	SET P_MSGCODE = 9001;
        SET StringSQL = '9001 - HAY MAS DE UN REGISTRO CON LA CLAVE PRIMARIA';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateTabsb42', StringSQL);
        RETURN;
  END IF;

  IF V_CANT = 0 THEN
	SET P_MSGCODE = 9000;
        SET StringSQL = '9000 - NO HAY REGISTROS QUE MODIFICAR CODIGO';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateTabsb42', StringSQL);
        RETURN;
  END IF;

  UPDATE GPDATWEB.TABSB42 SET T42NOM= P_T42NOM  WHERE T42COD= P_T42COD ;
  SET P_MSGCODE = 0;    
  Set StringSQL = 'UPDATE GPDATWEB.TABSB42 SET T42NOM= '''||P_T42NOM || '''  WHERE T42COD= '''||P_T42COD|| ''' ;';
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateTabsb42', StringSQL);
END
GO


