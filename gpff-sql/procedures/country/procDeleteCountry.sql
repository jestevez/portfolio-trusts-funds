
--DROP PROCEDURE GPSQLWEB.procDeleteCountry

CREATE PROCEDURE GPSQLWEB.procDeleteCountry (
    IN P_PAICLA INTEGER,
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500)
)
LANGUAGE SQL
BEGIN
Declare StringSQL Varchar(32000) Not Null Default '';
DELETE FROM GPDATBAAG.AA2TPAIS WHERE PAICLA = P_PAICLA;
Set StringSQL = 'DELETE FROM GPDATBAAG.AA2TPAIS WHERE PAICLA = '''|| P_PAICLA ||''';';
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Eliminar', 'procDeleteCountry', StringSQL);
END
GO
