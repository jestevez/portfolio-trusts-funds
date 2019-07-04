

--DROP  PROCEDURE  GPSQLWEB.procReadCgmaxmin

CREATE PROCEDURE  GPSQLWEB.procReadCgmaxmin (
    IN P_ROWID BIGINT,
 IN P_CGMEMP varchar(2) ,
 IN P_CGMDEL
 varchar(2) ,
 IN P_CGMFMT INTEGER ,
 IN P_CGMNCT INTEGER ,
 IN P_CGMCLI INTEGER ,
 IN P_CGMCOD INTEGER ,
 IN P_CGMMAX double ,
 IN P_CGMMIN double ,
 IN P_CGMDS1 double ,
 IN P_CGMHS1 double ,
 IN P_CGMPR1 double ,
 IN P_CGMDS2 double ,
 IN P_CGMHS2 double ,
 IN P_CGMPR2 double ,
 IN P_CGMDS3 double ,
 IN P_CGMHS3 double ,
 IN P_CGMPR3 double ,
 IN P_CGMDS4 double ,
 IN P_CGMHS4 double ,
 IN P_CGMPR4 double ,
 IN P_CGMDS5 double ,
 IN P_CGMHS5 double ,
 IN P_CGMPR5 double ,
 IN P_CGMDS6 double ,
 IN P_CGMHS6 double ,
 IN P_CGMPR6 double ,

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
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.CGMAXMIN) =' || P_ROWID ;
        END IF;
        
        IF P_CGMEMP IS NOT NULL AND length(P_CGMEMP)>0 THEN
            SET P_CGMEMP = UPPER(TRIM(P_CGMEMP));
            SET WhereClause = WhereClause || ' AND CGMEMP LIKE ''%'|| P_CGMEMP ||'%'' ';
        END IF;
    
        
        IF P_CGMDEL
 IS NOT NULL AND length(P_CGMDEL
)>0 THEN
            SET P_CGMDEL
 = UPPER(TRIM(P_CGMDEL
));
            SET WhereClause = WhereClause || ' AND CGMDEL
 LIKE ''%'|| P_CGMDEL
 ||'%'' ';
        END IF;
    
        
        IF P_CGMFMT > 0 THEN
            SET WhereClause = WhereClause || ' AND CGMFMT = '|| P_CGMFMT ||' ';
        END IF;
    
        
        IF P_CGMNCT > 0 THEN
            SET WhereClause = WhereClause || ' AND CGMNCT = '|| P_CGMNCT ||' ';
        END IF;
    
        
        IF P_CGMCLI > 0 THEN
            SET WhereClause = WhereClause || ' AND CGMCLI = '|| P_CGMCLI ||' ';
        END IF;
    
        
        IF P_CGMCOD > 0 THEN
            SET WhereClause = WhereClause || ' AND CGMCOD = '|| P_CGMCOD ||' ';
        END IF;
    
        
        IF P_CGMMAX IS NOT NULL AND length(P_CGMMAX)>0 THEN
            SET P_CGMMAX = UPPER(TRIM(P_CGMMAX));
            SET WhereClause = WhereClause || ' AND CGMMAX LIKE ''%'|| P_CGMMAX ||'%'' ';
        END IF;
    
        
        IF P_CGMMIN IS NOT NULL AND length(P_CGMMIN)>0 THEN
            SET P_CGMMIN = UPPER(TRIM(P_CGMMIN));
            SET WhereClause = WhereClause || ' AND CGMMIN LIKE ''%'|| P_CGMMIN ||'%'' ';
        END IF;
    
        
        IF P_CGMDS1 IS NOT NULL AND length(P_CGMDS1)>0 THEN
            SET P_CGMDS1 = UPPER(TRIM(P_CGMDS1));
            SET WhereClause = WhereClause || ' AND CGMDS1 LIKE ''%'|| P_CGMDS1 ||'%'' ';
        END IF;
    
        
        IF P_CGMHS1 IS NOT NULL AND length(P_CGMHS1)>0 THEN
            SET P_CGMHS1 = UPPER(TRIM(P_CGMHS1));
            SET WhereClause = WhereClause || ' AND CGMHS1 LIKE ''%'|| P_CGMHS1 ||'%'' ';
        END IF;
    
        
        IF P_CGMPR1 IS NOT NULL AND length(P_CGMPR1)>0 THEN
            SET P_CGMPR1 = UPPER(TRIM(P_CGMPR1));
            SET WhereClause = WhereClause || ' AND CGMPR1 LIKE ''%'|| P_CGMPR1 ||'%'' ';
        END IF;
    
        
        IF P_CGMDS2 IS NOT NULL AND length(P_CGMDS2)>0 THEN
            SET P_CGMDS2 = UPPER(TRIM(P_CGMDS2));
            SET WhereClause = WhereClause || ' AND CGMDS2 LIKE ''%'|| P_CGMDS2 ||'%'' ';
        END IF;
    
        
        IF P_CGMHS2 IS NOT NULL AND length(P_CGMHS2)>0 THEN
            SET P_CGMHS2 = UPPER(TRIM(P_CGMHS2));
            SET WhereClause = WhereClause || ' AND CGMHS2 LIKE ''%'|| P_CGMHS2 ||'%'' ';
        END IF;
    
        
        IF P_CGMPR2 IS NOT NULL AND length(P_CGMPR2)>0 THEN
            SET P_CGMPR2 = UPPER(TRIM(P_CGMPR2));
            SET WhereClause = WhereClause || ' AND CGMPR2 LIKE ''%'|| P_CGMPR2 ||'%'' ';
        END IF;
    
        
        IF P_CGMDS3 IS NOT NULL AND length(P_CGMDS3)>0 THEN
            SET P_CGMDS3 = UPPER(TRIM(P_CGMDS3));
            SET WhereClause = WhereClause || ' AND CGMDS3 LIKE ''%'|| P_CGMDS3 ||'%'' ';
        END IF;
    
        
        IF P_CGMHS3 IS NOT NULL AND length(P_CGMHS3)>0 THEN
            SET P_CGMHS3 = UPPER(TRIM(P_CGMHS3));
            SET WhereClause = WhereClause || ' AND CGMHS3 LIKE ''%'|| P_CGMHS3 ||'%'' ';
        END IF;
    
        
        IF P_CGMPR3 IS NOT NULL AND length(P_CGMPR3)>0 THEN
            SET P_CGMPR3 = UPPER(TRIM(P_CGMPR3));
            SET WhereClause = WhereClause || ' AND CGMPR3 LIKE ''%'|| P_CGMPR3 ||'%'' ';
        END IF;
    
        
        IF P_CGMDS4 IS NOT NULL AND length(P_CGMDS4)>0 THEN
            SET P_CGMDS4 = UPPER(TRIM(P_CGMDS4));
            SET WhereClause = WhereClause || ' AND CGMDS4 LIKE ''%'|| P_CGMDS4 ||'%'' ';
        END IF;
    
        
        IF P_CGMHS4 IS NOT NULL AND length(P_CGMHS4)>0 THEN
            SET P_CGMHS4 = UPPER(TRIM(P_CGMHS4));
            SET WhereClause = WhereClause || ' AND CGMHS4 LIKE ''%'|| P_CGMHS4 ||'%'' ';
        END IF;
    
        
        IF P_CGMPR4 IS NOT NULL AND length(P_CGMPR4)>0 THEN
            SET P_CGMPR4 = UPPER(TRIM(P_CGMPR4));
            SET WhereClause = WhereClause || ' AND CGMPR4 LIKE ''%'|| P_CGMPR4 ||'%'' ';
        END IF;
    
        
        IF P_CGMDS5 IS NOT NULL AND length(P_CGMDS5)>0 THEN
            SET P_CGMDS5 = UPPER(TRIM(P_CGMDS5));
            SET WhereClause = WhereClause || ' AND CGMDS5 LIKE ''%'|| P_CGMDS5 ||'%'' ';
        END IF;
    
        
        IF P_CGMHS5 IS NOT NULL AND length(P_CGMHS5)>0 THEN
            SET P_CGMHS5 = UPPER(TRIM(P_CGMHS5));
            SET WhereClause = WhereClause || ' AND CGMHS5 LIKE ''%'|| P_CGMHS5 ||'%'' ';
        END IF;
    
        
        IF P_CGMPR5 IS NOT NULL AND length(P_CGMPR5)>0 THEN
            SET P_CGMPR5 = UPPER(TRIM(P_CGMPR5));
            SET WhereClause = WhereClause || ' AND CGMPR5 LIKE ''%'|| P_CGMPR5 ||'%'' ';
        END IF;
    
        
        IF P_CGMDS6 IS NOT NULL AND length(P_CGMDS6)>0 THEN
            SET P_CGMDS6 = UPPER(TRIM(P_CGMDS6));
            SET WhereClause = WhereClause || ' AND CGMDS6 LIKE ''%'|| P_CGMDS6 ||'%'' ';
        END IF;
    
        
        IF P_CGMHS6 IS NOT NULL AND length(P_CGMHS6)>0 THEN
            SET P_CGMHS6 = UPPER(TRIM(P_CGMHS6));
            SET WhereClause = WhereClause || ' AND CGMHS6 LIKE ''%'|| P_CGMHS6 ||'%'' ';
        END IF;
    
        
        IF P_CGMPR6 IS NOT NULL AND length(P_CGMPR6)>0 THEN
            SET P_CGMPR6 = UPPER(TRIM(P_CGMPR6));
            SET WhereClause = WhereClause || ' AND CGMPR6 LIKE ''%'|| P_CGMPR6 ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.CGMAXMIN) as ROWID,CGMEMP ,CGMDEL
 ,CGMFMT ,CGMNCT ,CGMCLI ,CGMCOD ,CGMMAX ,CGMMIN ,CGMDS1 ,CGMHS1 ,CGMPR1 ,CGMDS2 ,CGMHS2 ,CGMPR2 ,CGMDS3 ,CGMHS3 ,CGMPR3 ,CGMDS4 ,CGMHS4 ,CGMPR4 ,CGMDS5 ,CGMHS5 ,CGMPR5 ,CGMDS6 ,CGMHS6 ,CGMPR6  FROM GPDATWEB.CGMAXMIN  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(GPDATWEB.CGMAXMIN) as ROWID,CGMEMP ,CGMDEL
 ,CGMFMT ,CGMNCT ,CGMCLI ,CGMCOD ,CGMMAX ,CGMMIN ,CGMDS1 ,CGMHS1 ,CGMPR1 ,CGMDS2 ,CGMHS2 ,CGMPR2 ,CGMDS3 ,CGMHS3 ,CGMPR3 ,CGMDS4 ,CGMHS4 ,CGMPR4 ,CGMDS5 ,CGMHS5 ,CGMPR5 ,CGMDS6 ,CGMHS6 ,CGMPR6  FROM  GPDATWEB.CGMAXMIN WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(GPDATWEB.CGMAXMIN) as ROWID,CGMEMP ,CGMDEL
 ,CGMFMT ,CGMNCT ,CGMCLI ,CGMCOD ,CGMMAX ,CGMMIN ,CGMDS1 ,CGMHS1 ,CGMPR1 ,CGMDS2 ,CGMHS2 ,CGMPR2 ,CGMDS3 ,CGMHS3 ,CGMPR3 ,CGMDS4 ,CGMHS4 ,CGMPR4 ,CGMDS5 ,CGMHS5 ,CGMPR5 ,CGMDS6 ,CGMHS6 ,CGMPR6  FROM  GPDATWEB.CGMAXMIN WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadCgmaxmin', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadCgmaxmin ('','',0,0,0,0,'','','','','','','','','','','','','','','','','','','','', 1, 10, '', '', '', '')
