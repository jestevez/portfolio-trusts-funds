--DROP PROCEDURE GPSQLWEB.procDeleteTabfp

CREATE PROCEDURE GPSQLWEB.procDeleteTabfp (
    IN P_CODIGO INTEGER,
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT P_MSGCODE INT
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Not Null Default '';
  Declare V_CANT INT DEFAULT 0;

  SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.TABFP WHERE CODIGO= P_CODIGO;
 
  IF V_CANT > 1 THEN
	SET P_MSGCODE = 9001;
        SET StringSQL = '9001 - HAY MAS DE UN REGISTRO CON LA CLAVE PRIMARIA  CODIGO '|| P_CODIGO;
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Eliminar', 'procDeleteTabfp', StringSQL);
        RETURN;
  END IF;
  IF V_CANT = 0 THEN
	SET P_MSGCODE = 9000;
        SET StringSQL = '9000 - NO HAY REGISTROS QUE MODIFICAR CODIGO '|| P_CODIGO;
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Eliminar', 'procDeleteTabfp', StringSQL);
        RETURN;
  END IF;

  DELETE FROM GPDATWEB.TABFP WHERE CODIGO = P_CODIGO;
	SET P_MSGCODE = 0;
	Set StringSQL = 'DELETE FROM GPDATWEB.TABFP WHERE CODIGO = '''|| P_CODIGO ||''';';
	CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Eliminar', 'procDeleteTabfp', StringSQL);
END
GO