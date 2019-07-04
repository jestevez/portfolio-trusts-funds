
--DROP PROCEDURE GPSQLWEB.procDeleteContrato

CREATE PROCEDURE GPSQLWEB.procDeleteContrato (
    IN P_ROWID BIGINT,
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
BEGIN
Declare StringSQL Varchar(32000) Not Null Default '';
  Declare V_CANT INT DEFAULT 0;
  
  SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.CONTRATO WHERE RRN(GPDATWEB.CONTRATO) = P_ROWID;

  IF V_CANT > 1 THEN
	SET P_MSGCODE = 9001;
        SET StringSQL = '9001 - HAY MAS DE UN REGISTRO CON LA CLAVE PRIMARIA';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Eliminar', 'procDeleteContrato', StringSQL);
        RETURN;
  END IF;

  IF V_CANT = 0 THEN
	SET P_MSGCODE = 9000;
        SET StringSQL = '9000 - NO HAY REGISTROS QUE MODIFICAR';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Eliminar', 'procDeleteContrato', StringSQL);
        RETURN;
  END IF;
  
  DELETE FROM GPDATWEB.CONTRATO WHERE RRN(GPDATWEB.CONTRATO) = P_ROWID;
  SET P_MSGCODE = 0;
  Set StringSQL = 'DELETE FROM GPDATWEB.CONTRATO WHERE RRN(GPDATWEB.CONTRATO) = '''|| P_ROWID || ''';';
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Eliminar', 'procDeleteContrato', StringSQL);
END
GO
