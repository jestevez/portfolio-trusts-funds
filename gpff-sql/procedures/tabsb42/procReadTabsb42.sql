

--DROP  PROCEDURE  GPSQLWEB.procReadTabsb42

CREATE PROCEDURE  GPSQLWEB.procReadTabsb42 (
     IN P_T42COD INTEGER ,
 IN P_T42NOM varchar(50) ,

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
    
        
        IF P_T42COD > 0 THEN
            SET WhereClause = WhereClause || ' AND T42COD = '|| P_T42COD ||' ';
        END IF;
    
        
        IF P_T42NOM IS NOT NULL AND length(P_T42NOM)>0 THEN
            SET P_T42NOM = UPPER(TRIM(P_T42NOM));
            SET WhereClause = WhereClause || ' AND T42NOM LIKE ''%'|| P_T42NOM ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, T42COD ,T42NOM  FROM GPDATWEB.TABSB42  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT  T42COD ,T42NOM  FROM  GPDATWEB.TABSB42 WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT  T42COD ,T42NOM  FROM  GPDATWEB.TABSB42 WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadTabsb42', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadTabsb42 (0,'', 1, 10, '', '', '', '')
