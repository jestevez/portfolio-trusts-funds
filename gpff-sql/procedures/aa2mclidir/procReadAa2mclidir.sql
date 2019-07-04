

--DROP  PROCEDURE  GPSQLWEB.procReadAa2mclidir

CREATE PROCEDURE  GPSQLWEB.procReadAa2mclidir (
    IN P_ROWID BIGINT,
 IN P_CLINIF varchar(12) ,
 IN P_CLIDIR varchar(225) ,

    IN P_FIRSTRESULT INTEGER,
    IN P_MAXRESULT INTEGER,
    IN P_SORT VARCHAR(255),
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500)
)
RESULT SETS 1
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Not Null Default '';
  Declare WhereClause Varchar(32000) Not Null Default '';
  Declare SortClause Varchar(32000) Not Null Default '';
  Declare C1 Cursor With Return For stmt;

    IF P_SORT IS NOT NULL AND LENGTH(P_SORT) > 0 THEN
        Set SortClause = ' ORDER BY ' || P_SORT ;
    END IF;

    -- WHERE CLAUSE
    
        IF P_ROWID IS NOT NULL AND P_ROWID>0 THEN
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.AA2MCLIDIR) =' || P_ROWID ;
        END IF;
        
        IF P_CLINIF IS NOT NULL AND length(P_CLINIF)>0 THEN
            SET P_CLINIF = UPPER(TRIM(P_CLINIF));
            SET WhereClause = WhereClause || ' AND CLINIF LIKE ''%'|| P_CLINIF ||'%'' ';
        END IF;
    
        
        IF P_CLIDIR IS NOT NULL AND length(P_CLIDIR)>0 THEN
            SET P_CLIDIR = UPPER(TRIM(P_CLIDIR));
            SET WhereClause = WhereClause || ' AND CLIDIR LIKE ''%'|| P_CLIDIR ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.AA2MCLIDIR) as ROWID,CLINIF ,CLIDIR  FROM GPDATWEB.AA2MCLIDIR  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AA2MCLIDIR) as ROWID,CLINIF ,CLIDIR  FROM  GPDATWEB.AA2MCLIDIR WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AA2MCLIDIR) as ROWID,CLINIF ,CLIDIR  FROM  GPDATWEB.AA2MCLIDIR WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadAa2mclidir', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadAa2mclidir ('','', 1, 10, '', '', '', '')
