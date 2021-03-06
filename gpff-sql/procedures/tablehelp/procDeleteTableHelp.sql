
--DROP PROCEDURE GPSQLWEB.procDeleteTableHelp

CREATE PROCEDURE GPSQLWEB.procDeleteTableHelp (
    IN P_ID INTEGER,
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500)
)
LANGUAGE SQL
BEGIN
Declare StringSQL Varchar(32000) Not Null Default '';
DELETE FROM GPSQLWEB.TABLEHELP WHERE ID = P_ID;
Set StringSQL = 'DELETE FROM GPSQLWEB.TABLEHELP WHERE ID = '''|| P_ID ||''';';
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Eliminar', 'procDeleteTableHelp', StringSQL);
END
GO
