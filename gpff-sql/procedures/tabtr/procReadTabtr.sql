--DROP  PROCEDURE  GPSQLWEB.procReadTabtr

CREATE PROCEDURE  GPSQLWEB.procReadTabtr (
IN P_CODIGO INTEGER ,
IN P_TEXTO varchar(30) ,
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
    
        
        IF P_CODIGO > 0 THEN
            SET WhereClause = WhereClause || ' AND CODIGO = '|| P_CODIGO ||' ';
        END IF;
    
        
        IF P_TEXTO IS NOT NULL AND length(P_TEXTO)>0 THEN
            SET P_TEXTO = UPPER(TRIM(P_TEXTO));
            SET WhereClause = WhereClause || ' AND TEXTO LIKE ''%'|| P_TEXTO ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, CODIGO ,TEXTO  FROM GPDATWEB.TABTR  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT  CODIGO ,TEXTO  FROM  GPDATWEB.TABTR WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT  CODIGO ,TEXTO  FROM  GPDATWEB.TABTR WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadTabtr', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadTabtr (0,'', 1, 10, '', '', '', '')
