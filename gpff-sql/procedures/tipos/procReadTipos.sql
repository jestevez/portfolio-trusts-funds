--DROP  PROCEDURE  GPSQLWEB.procReadTipos
CREATE PROCEDURE  GPSQLWEB.procReadTipos (
IN P_TIPO decimal(2,0) ,
IN P_TIPDES varchar(40) ,
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
        
        IF P_TIPO IS NOT NULL AND length(P_TIPO)>0 THEN
            SET P_TIPO = UPPER(TRIM(P_TIPO));
            SET WhereClause = WhereClause || ' AND TIPO LIKE ''%'|| P_TIPO ||'%'' ';
        END IF;
    
        
        IF P_TIPDES IS NOT NULL AND length(P_TIPDES)>0 THEN
            SET P_TIPDES = UPPER(TRIM(P_TIPDES));
            SET WhereClause = WhereClause || ' AND TIPDES LIKE ''%'|| P_TIPDES ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, TIPO ,TIPDES  FROM GPDATWEB.TIPOS  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT  TIPO ,TIPDES  FROM  GPDATWEB.TIPOS WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT  TIPO ,TIPDES  FROM  GPDATWEB.TIPOS WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadTipos', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadTipos ('','', 1, 10, '', '', '', '')
