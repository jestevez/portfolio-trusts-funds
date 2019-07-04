

--DROP  PROCEDURE  GPSQLWEB.procCountAa2mclidir

CREATE PROCEDURE  GPSQLWEB.procCountAa2mclidir (
     IN P_CLINIF varchar(12),
 IN P_CLIDIR varchar(225),

    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(32000),
    OUT TOTAL INTEGER
)
RESULT SETS 1
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Not Null Default '';
  Declare WhereClause Varchar(32000) Not Null Default '';
  Declare SortClause Varchar(32000) Not Null Default '';
  Declare C1 Cursor With Return For stmt1;

-- WHERE CLAUSE

        
        IF P_CLINIF IS NOT NULL AND length(P_CLINIF)>0 THEN
            SET P_CLINIF = UPPER(TRIM(P_CLINIF));
            SET WhereClause = WhereClause || ' AND CLINIF LIKE ''%'|| P_CLINIF ||'%'' ';
        END IF;
    
        
        IF P_CLIDIR IS NOT NULL AND length(P_CLIDIR)>0 THEN
            SET P_CLIDIR = UPPER(TRIM(P_CLIDIR));
            SET WhereClause = WhereClause || ' AND CLIDIR LIKE ''%'|| P_CLIDIR ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.AA2MCLIDIR  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountAa2mclidir', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountAa2mclidir('','', '', '', '')
