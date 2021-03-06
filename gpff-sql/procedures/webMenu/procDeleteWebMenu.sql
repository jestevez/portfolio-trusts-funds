
    
--DROP PROCEDURE GPPGMWEB.procDeleteWebMenu

CREATE PROCEDURE GPPGMWEB.procDeleteWebMenu (
    IN P_ID INTEGER,
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500)
)
LANGUAGE SQL
BEGIN
Declare StringSQL Varchar(32000) Not Null Default '';
DELETE FROM GPPGMWEB.WEBMENU WHERE ID = P_ID;
Set StringSQL = 'DELETE FROM GPPGMWEB.WEBMENU WHERE ID = '''|| P_ID ||''';';
CALL GPPGMWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Eliminar', 'procDeleteWebMenu', StringSQL);
END
GO