--DROP  PROCEDURE  GPSQLWEB.procReadAa2tpais

CREATE PROCEDURE  GPSQLWEB.procReadAa2tpais (
IN P_PAICLA bigint,
IN P_PAINOM varchar(40) ,
IN P_PAICTR INTEGER ,
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
    
        
        IF P_PAICLA IS NOT NULL AND length(P_PAICLA)>0 THEN
            SET P_PAICLA = UPPER(TRIM(P_PAICLA));
            SET WhereClause = WhereClause || ' AND PAICLA LIKE ''%'|| P_PAICLA ||'%'' ';
        END IF;
    
        
        IF P_PAINOM IS NOT NULL AND length(P_PAINOM)>0 THEN
            SET P_PAINOM = UPPER(TRIM(P_PAINOM));
            SET WhereClause = WhereClause || ' AND PAINOM LIKE ''%'|| P_PAINOM ||'%'' ';
        END IF;
    
        
        IF P_PAICTR > 0 THEN
            SET WhereClause = WhereClause || ' AND PAICTR = '|| P_PAICTR ||' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, PAICLA ,PAINOM ,PAICTR  FROM GPDATWEB.AA2TPAIS  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT  PAICLA ,PAINOM ,PAICTR  FROM  GPDATWEB.AA2TPAIS WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT  PAICLA ,PAINOM ,PAICTR  FROM  GPDATWEB.AA2TPAIS WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadAa2tpais', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadAa2tpais ('','',0, 1, 10, '', '', '', '')
