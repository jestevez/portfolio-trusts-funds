--DROP  PROCEDURE  GPSQLWEB.procCountAa2tdih

CREATE PROCEDURE  GPSQLWEB.procCountAa2tdih (
IN P_DIHCLA bigint,
IN P_DIHNOM varchar(40),
IN P_DIHABR varchar(3),
IN P_DIHCCO double,
IN P_DIHCVE double,
IN P_DIHFIX double,
IN P_DIHCTA varchar(12),
IN P_DIHFIB double,
IN P_DIHFEH bigint,
IN P_DIHFEG bigint,
IN P_DIHHOR bigint,
IN P_DIHPAN varchar(10),
IN P_DIHUSU varchar(10),
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
        
        IF P_DIHCLA IS NOT NULL AND length(P_DIHCLA)>0 THEN
            SET P_DIHCLA = UPPER(TRIM(P_DIHCLA));
            SET WhereClause = WhereClause || ' AND DIHCLA LIKE ''%'|| P_DIHCLA ||'%'' ';
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
    
        
        IF P_DIHFEH IS NOT NULL AND length(P_DIHFEH)>0 THEN
            SET P_DIHFEH = UPPER(TRIM(P_DIHFEH));
            SET WhereClause = WhereClause || ' AND DIHFEH LIKE ''%'|| P_DIHFEH ||'%'' ';
        END IF;
    
        
        IF P_DIHFEG IS NOT NULL AND length(P_DIHFEG)>0 THEN
            SET P_DIHFEG = UPPER(TRIM(P_DIHFEG));
            SET WhereClause = WhereClause || ' AND DIHFEG LIKE ''%'|| P_DIHFEG ||'%'' ';
        END IF;
    
        
        IF P_DIHHOR IS NOT NULL AND length(P_DIHHOR)>0 THEN
            SET P_DIHHOR = UPPER(TRIM(P_DIHHOR));
            SET WhereClause = WhereClause || ' AND DIHHOR LIKE ''%'|| P_DIHHOR ||'%'' ';
        END IF;
    
        
        IF P_DIHPAN IS NOT NULL AND length(P_DIHPAN)>0 THEN
            SET P_DIHPAN = UPPER(TRIM(P_DIHPAN));
            SET WhereClause = WhereClause || ' AND DIHPAN LIKE ''%'|| P_DIHPAN ||'%'' ';
        END IF;
    
        
        IF P_DIHUSU IS NOT NULL AND length(P_DIHUSU)>0 THEN
            SET P_DIHUSU = UPPER(TRIM(P_DIHUSU));
            SET WhereClause = WhereClause || ' AND DIHUSU LIKE ''%'|| P_DIHUSU ||'%'' ';
        END IF;
    
	Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.AA2TDIH  WHERE 1=1 ' || WhereClause; 
	PREPARE stmt1 FROM StringSQL;
	CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountAa2tdih', StringSQL);
	OPEN c1;
	    FETCH c1 into total;
	CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountAa2tdih('','','','','','','','','','','','','', '', '', '')
