--DROP  PROCEDURE  GPSQLWEB.procReadCarfiusf

CREATE PROCEDURE  GPSQLWEB.procReadCarfiusf (
    IN P_USUARF varchar(10),
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500)
)
RESULT SETS 1
LANGUAGE SQL
BEGIN
    Declare StringSQL Varchar(32000) Not Null Default '';  
    Declare C1 Cursor With Return For stmt;    
    Set StringSQL = 'SELECT TIPO FROM GPDATWEB.CARFIUSF WHERE USUARF = ''' || UPPER(P_USUARF) || ''' '; 
    Prepare stmt From StringSQL; 
    Open C1;
    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadCarfiusf', StringSQL);
END
GO

--call GPSQLWEB.procReadCarfiusf ('','','','','','', 1, 10, '', '', '', '')
