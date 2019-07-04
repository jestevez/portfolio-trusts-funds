--DROP  PROCEDURE  GPSQLWEB.procMaxCliclaAa2mcli

CREATE PROCEDURE  GPSQLWEB.procMaxCliclaAa2mcli (
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT P_MAXCLICLA BIGINT
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Not Null Default '';
  
  SELECT COALESCE( MAX(CLICLA) , 0) INTO P_MAXCLICLA FROM  GPDATWEB.AA2MCLI;

  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procMaxCliclaAa2mcli', StringSQL);
    

END
GO

--call GPSQLWEB.procMaxCliclaAa2mcli ('','',0,'',0,0,'','','','','','','','',0,'',0,0,0,'',0,0,0,'','','',0,0,0,'','','','','',0,'','',0,'','',0,'',0,'','',0,0,'',0,0,'', 1, 10, '', '', '', '')
