
    
--DROP PROCEDURE GPSQLWEB.procCreateAa2tpais
    
CREATE PROCEDURE GPSQLWEB.procCreateAa2tpais
(
   IN P_PAINOM VARCHAR(40),
                 IN P_PAICTR INTEGER,
                
  IN P_USERNAME VARCHAR(50),
  IN P_IPADDRESS VARCHAR(255),
  IN P_USERAGENT VARCHAR(500),
  OUT P_PAICLA BIGINT
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Default '';
  
        SELECT  COALESCE(MAX(PAICLA), 0) +1 INTO P_PAICLA FROM GPDATWEB.AA2TPAIS;
        INSERT INTO GPDATWEB.AA2TPAIS (PAICLA, PAINOM ,PAICTR ) VALUES (P_PAICLA,  P_PAINOM , P_PAICTR );

  Set StringSQL = 'INSERT INTO GPDATWEB.AA2TPAIS (PAICLA PAINOM ,PAICTR ) VALUES (''' || P_PAICLA  ||''' ,  '''|| P_PAINOM || ''' , '''|| P_PAICTR || ''' )'; 
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateAa2tpais', StringSQL);
END
GO


