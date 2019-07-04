

--DROP  PROCEDURE  GPSQLWEB.procReadAa2ttpro

CREATE PROCEDURE  GPSQLWEB.procReadAa2ttpro (
    IN P_ROWID BIGINT,
 IN P_PROEMP varchar(2) ,
 IN P_PRODEL varchar(2) ,
 IN P_PROCLA NUMERIC(15 , 0) ,
 IN P_PRONOM varchar(40) ,

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
    ELSE 
        Set SortClause = ' order by substring(PROCLA, 12, 3) ';
    END IF;

    -- WHERE CLAUSE
    
        IF P_ROWID IS NOT NULL AND P_ROWID>0 THEN
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.AA2TTPRO) =' || P_ROWID ;
        END IF;
        
        IF P_PROEMP IS NOT NULL AND length(P_PROEMP)>0 THEN
            SET P_PROEMP = UPPER(TRIM(P_PROEMP));
            SET WhereClause = WhereClause || ' AND PROEMP LIKE ''%'|| P_PROEMP ||'%'' ';
        END IF;
    
        
        IF P_PRODEL IS NOT NULL AND length(P_PRODEL)>0 THEN
            SET P_PRODEL = UPPER(TRIM(P_PRODEL));
            SET WhereClause = WhereClause || ' AND PRODEL LIKE ''%'|| P_PRODEL ||'%'' ';
        END IF;
    
        
        IF P_PROCLA > 0 THEN
            SET WhereClause = WhereClause || ' AND PROCLA = '|| P_PROCLA ||' ';
        END IF;
    
        
        IF P_PRONOM IS NOT NULL AND length(P_PRONOM)>0 THEN
            SET P_PRONOM = UPPER(TRIM(P_PRONOM));
            SET WhereClause = WhereClause || ' AND PRONOM LIKE ''%'|| P_PRONOM ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.AA2TTPRO) as ROWID,PROEMP ,PRODEL ,PROCLA ,PRONOM  FROM GPDATWEB.AA2TTPRO  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AA2TTPRO) as ROWID,PROEMP ,PRODEL ,PROCLA ,PRONOM  FROM  GPDATWEB.AA2TTPRO WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AA2TTPRO) as ROWID,PROEMP ,PRODEL ,PROCLA ,PRONOM  FROM  GPDATWEB.AA2TTPRO WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadAa2ttpro', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadAa2ttpro ('','',0,'', 1, 10, '', '', '', '')
