--DROP  PROCEDURE  GPSQLWEB.procReadPerfil2

CREATE PROCEDURE  GPSQLWEB.procReadPerfil2 (
    IN P_PRFPRF varchar(10),
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500)
)
RESULT SETS 1
LANGUAGE SQL
BEGIN
    Declare StringSQL Varchar(32000) Not Null Default '';  
    Declare C1 Cursor With Return For stmt;    
    Set StringSQL = 'SELECT PRFARE FROM GPDATWEB.PERFIL2 WHERE PRFPRF = ''' || UPPER(P_PRFPRF) || ''' '; 
    Prepare stmt From StringSQL; 
    Open C1;
    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadPerfil2', StringSQL);
END
GO

--call GPSQLWEB.procReadPerfil2 ('','','','','','', 1, 10, '', '', '', '')
