--DROP  PROCEDURE  GPSQLWEB.procReadAa2tdih

CREATE PROCEDURE  GPSQLWEB.procReadAa2tdih (
IN P_DIHCLA BIGINT ,
IN P_DIHNOM varchar(40) ,
IN P_DIHABR varchar(3) ,
IN P_DIHCCO double ,
IN P_DIHCVE double ,
IN P_DIHFIX double ,
IN P_DIHCTA varchar(12) ,
IN P_DIHFIB double ,
IN P_DIHFEH BIGINT ,
IN P_DIHFEG BIGINT ,
IN P_DIHHOR BIGINT ,
IN P_DIHPAN varchar(10) ,
IN P_DIHUSU varchar(10) ,
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
    
        
        IF P_DIHCLA > 0 THEN
            SET WhereClause = WhereClause || ' AND DIHCLA = '|| P_DIHCLA ||' ';
        END IF;
    
        
        IF P_DIHNOM IS NOT NULL AND length(P_DIHNOM)>0 THEN
            SET P_DIHNOM = UPPER(TRIM(P_DIHNOM));
            SET WhereClause = WhereClause || ' AND DIHNOM LIKE ''%'|| P_DIHNOM ||'%'' ';
        END IF;
    
        
        IF P_DIHABR IS NOT NULL AND length(P_DIHABR)>0 THEN
            SET P_DIHABR = UPPER(TRIM(P_DIHABR));
            SET WhereClause = WhereClause || ' AND DIHABR LIKE ''%'|| P_DIHABR ||'%'' ';
        END IF;
    
        
        IF P_DIHCCO IS NOT NULL AND length(P_DIHCCO)>0 THEN
            SET P_DIHCCO = UPPER(TRIM(P_DIHCCO));
            SET WhereClause = WhereClause || ' AND DIHCCO LIKE ''%'|| P_DIHCCO ||'%'' ';
        END IF;
    
        
        IF P_DIHCVE IS NOT NULL AND length(P_DIHCVE)>0 THEN
            SET P_DIHCVE = UPPER(TRIM(P_DIHCVE));
            SET WhereClause = WhereClause || ' AND DIHCVE LIKE ''%'|| P_DIHCVE ||'%'' ';
        END IF;
    
        
        IF P_DIHFIX IS NOT NULL AND length(P_DIHFIX)>0 THEN
            SET P_DIHFIX = UPPER(TRIM(P_DIHFIX));
            SET WhereClause = WhereClause || ' AND DIHFIX LIKE ''%'|| P_DIHFIX ||'%'' ';
        END IF;
    
        
        IF P_DIHCTA IS NOT NULL AND length(P_DIHCTA)>0 THEN
            SET P_DIHCTA = UPPER(TRIM(P_DIHCTA));
            SET WhereClause = WhereClause || ' AND DIHCTA LIKE ''%'|| P_DIHCTA ||'%'' ';
        END IF;
    
        
        IF P_DIHFIB IS NOT NULL AND length(P_DIHFIB)>0 THEN
            SET P_DIHFIB = UPPER(TRIM(P_DIHFIB));
            SET WhereClause = WhereClause || ' AND DIHFIB LIKE ''%'|| P_DIHFIB ||'%'' ';
        END IF;
    
        
        IF P_DIHFEH > 0 THEN
            SET WhereClause = WhereClause || ' AND DIHFEH = '|| P_DIHFEH ||' ';
        END IF;
    
        
        IF P_DIHFEG > 0 THEN
            SET WhereClause = WhereClause || ' AND DIHFEG = '|| P_DIHFEG ||' ';
        END IF;
    
        
        IF P_DIHHOR > 0 THEN
            SET WhereClause = WhereClause || ' AND DIHHOR = '|| P_DIHHOR ||' ';
        END IF;
    
        
        IF P_DIHPAN IS NOT NULL AND length(P_DIHPAN)>0 THEN
            SET P_DIHPAN = UPPER(TRIM(P_DIHPAN));
            SET WhereClause = WhereClause || ' AND DIHPAN LIKE ''%'|| P_DIHPAN ||'%'' ';
        END IF;
    
        
        IF P_DIHUSU IS NOT NULL AND length(P_DIHUSU)>0 THEN
            SET P_DIHUSU = UPPER(TRIM(P_DIHUSU));
            SET WhereClause = WhereClause || ' AND DIHUSU LIKE ''%'|| P_DIHUSU ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, DIHCLA ,DIHNOM ,DIHABR ,DIHCCO ,DIHCVE ,DIHFIX ,DIHCTA ,DIHFIB ,DIHFEH ,DIHFEG ,DIHHOR ,DIHPAN ,DIHUSU  FROM GPDATWEB.AA2TDIH  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT  DIHCLA ,DIHNOM ,DIHABR ,DIHCCO ,DIHCVE ,DIHFIX ,DIHCTA ,DIHFIB ,DIHFEH ,DIHFEG ,DIHHOR ,DIHPAN ,DIHUSU  FROM  GPDATWEB.AA2TDIH WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT  DIHCLA ,DIHNOM ,DIHABR ,DIHCCO ,DIHCVE ,DIHFIX ,DIHCTA ,DIHFIB ,DIHFEH ,DIHFEG ,DIHHOR ,DIHPAN ,DIHUSU  FROM  GPDATWEB.AA2TDIH WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadAa2tdih', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadAa2tdih (0,'','','','','','','',0,0,0,'','', 1, 10, '', '', '', '')
