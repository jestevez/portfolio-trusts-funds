

--DROP  PROCEDURE  GPSQLWEB.procReadTabsdb

CREATE PROCEDURE  GPSQLWEB.procReadTabsdb (
IN P_TSBMOD varchar(3) ,
IN P_TSBDIN INTEGER ,
IN P_TSBTIN INTEGER ,
IN P_TSBCIN INTEGER ,
IN P_TSBNSI INTEGER ,
IN P_TSBCRE INTEGER ,
IN P_TSBIDI INTEGER ,

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
    
        
        IF P_TSBMOD IS NOT NULL AND length(P_TSBMOD)>0 THEN
            SET P_TSBMOD = UPPER(TRIM(P_TSBMOD));
            SET WhereClause = WhereClause || ' AND TSBMOD LIKE ''%'|| P_TSBMOD ||'%'' ';
        END IF;
    
        
        IF P_TSBDIN > 0 THEN
            SET WhereClause = WhereClause || ' AND TSBDIN = '|| P_TSBDIN ||' ';
        END IF;
    
        
        IF P_TSBTIN > 0 THEN
            SET WhereClause = WhereClause || ' AND TSBTIN = '|| P_TSBTIN ||' ';
        END IF;
    
        
        IF P_TSBCIN > 0 THEN
            SET WhereClause = WhereClause || ' AND TSBCIN = '|| P_TSBCIN ||' ';
        END IF;
    
        
        IF P_TSBNSI > 0 THEN
            SET WhereClause = WhereClause || ' AND TSBNSI = '|| P_TSBNSI ||' ';
        END IF;
    
        
        IF P_TSBCRE > 0 THEN
            SET WhereClause = WhereClause || ' AND TSBCRE = '|| P_TSBCRE ||' ';
        END IF;
    
        
        IF P_TSBIDI > 0 THEN
            SET WhereClause = WhereClause || ' AND TSBIDI = '|| P_TSBIDI ||' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, TSBMOD ,TSBDIN ,TSBTIN ,TSBCIN ,TSBNSI ,TSBCRE ,TSBIDI  FROM GPDATWEB.TABSDB  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT  TSBMOD ,TSBDIN ,TSBTIN ,TSBCIN ,TSBNSI ,TSBCRE ,TSBIDI  FROM  GPDATWEB.TABSDB WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT  TSBMOD ,TSBDIN ,TSBTIN ,TSBCIN ,TSBNSI ,TSBCRE ,TSBIDI  FROM  GPDATWEB.TABSDB WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadTabsdb', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadTabsdb ('',0,0,0,0,0,0, 1, 10, '', '', '', '')
