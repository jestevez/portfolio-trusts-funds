

--DROP  PROCEDURE  GPSQLWEB.procReadPerfil

CREATE PROCEDURE  GPSQLWEB.procReadPerfil (
    IN P_PRFPRF varchar(10) ,
    IN P_PRFNOM varchar(45) ,
    IN P_PRFCED varchar(12) ,
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
    IF P_PRFPRF IS NOT NULL AND length(P_PRFPRF)>0 THEN
        SET P_PRFPRF = UPPER(TRIM(P_PRFPRF));
        SET WhereClause = WhereClause || ' AND PRFPRF = '''|| P_PRFPRF ||''' ';
    END IF;   
    IF P_PRFNOM IS NOT NULL AND length(P_PRFNOM)>0 THEN
        SET P_PRFNOM = UPPER(TRIM(P_PRFNOM));
        SET WhereClause = WhereClause || ' AND PRFNOM LIKE ''%'|| P_PRFNOM ||'%'' ';
    END IF;    
    IF P_PRFCED IS NOT NULL AND length(P_PRFCED)>0 THEN
        SET P_PRFCED = UPPER(TRIM(P_PRFCED));
        SET WhereClause = WhereClause || ' AND PRFCED LIKE ''%'|| P_PRFCED ||'%'' ';
    END IF;

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, PRFPRF ,PRFNOM ,PRFCED  FROM GPDATWEB.PERFIL  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT  PRFPRF ,PRFNOM ,PRFCED  FROM  GPDATWEB.PERFIL WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT  PRFPRF ,PRFNOM ,PRFCED  FROM  GPDATWEB.PERFIL WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadPerfil', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadPerfil ('','','', 1, 10, '', '', '', '')
