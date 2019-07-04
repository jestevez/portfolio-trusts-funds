

--DROP  PROCEDURE  GPSQLWEB.procCountAa2ato

CREATE PROCEDURE  GPSQLWEB.procCountAa2ato (
     IN P_ATOEMP varchar(2),
 IN P_ATODEL varchar(2),
 IN P_ATOFEC INTEGER,
 IN P_ATODTO INTEGER,
 IN P_ATONRO bigint,
 IN P_ATODIV INTEGER,
 IN P_ATOCTA bigint,
 IN P_ATOIMD double,
 IN P_ATOIMP double,
 IN P_ATOCON varchar(3),
 IN P_ATOVAL bigint,
 IN P_ATODH varchar(1),
 IN P_ATOFCO bigint,
 IN P_ATOMAT varchar(1),
 IN P_ATOBAJ varchar(1),
 IN P_ATOUSU varchar(6),
 IN P_ATOCLI bigint,
 IN P_ATOCOY bigint,
 IN P_ATOVAY bigint,
 IN P_ATORE1 varchar(3),
 IN P_ATORE2 bigint,
 IN P_ATODPR varchar(1),
 IN P_ATOBVI bigint,

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

        
        IF P_ATOEMP IS NOT NULL AND length(P_ATOEMP)>0 THEN
            SET P_ATOEMP = UPPER(TRIM(P_ATOEMP));
            SET WhereClause = WhereClause || ' AND ATOEMP LIKE ''%'|| P_ATOEMP ||'%'' ';
        END IF;
    
        
        IF P_ATODEL IS NOT NULL AND length(P_ATODEL)>0 THEN
            SET P_ATODEL = UPPER(TRIM(P_ATODEL));
            SET WhereClause = WhereClause || ' AND ATODEL LIKE ''%'|| P_ATODEL ||'%'' ';
        END IF;
    
        
        IF P_ATOFEC > 0 THEN
            SET WhereClause = WhereClause || ' AND ATOFEC = '|| P_ATOFEC ||' ';
        END IF;
    
        
        IF P_ATODTO > 0 THEN
            SET WhereClause = WhereClause || ' AND ATODTO = '|| P_ATODTO ||' ';
        END IF;
    
        
        IF P_ATONRO IS NOT NULL AND length(P_ATONRO)>0 THEN
            SET P_ATONRO = UPPER(TRIM(P_ATONRO));
            SET WhereClause = WhereClause || ' AND ATONRO LIKE ''%'|| P_ATONRO ||'%'' ';
        END IF;
    
        
        IF P_ATODIV > 0 THEN
            SET WhereClause = WhereClause || ' AND ATODIV = '|| P_ATODIV ||' ';
        END IF;
    
        
        IF P_ATOCTA IS NOT NULL AND length(P_ATOCTA)>0 THEN
            SET P_ATOCTA = UPPER(TRIM(P_ATOCTA));
            SET WhereClause = WhereClause || ' AND ATOCTA LIKE ''%'|| P_ATOCTA ||'%'' ';
        END IF;
    
        
        IF P_ATOIMD IS NOT NULL AND length(P_ATOIMD)>0 THEN
            SET P_ATOIMD = UPPER(TRIM(P_ATOIMD));
            SET WhereClause = WhereClause || ' AND ATOIMD LIKE ''%'|| P_ATOIMD ||'%'' ';
        END IF;
    
        
        IF P_ATOIMP IS NOT NULL AND length(P_ATOIMP)>0 THEN
            SET P_ATOIMP = UPPER(TRIM(P_ATOIMP));
            SET WhereClause = WhereClause || ' AND ATOIMP LIKE ''%'|| P_ATOIMP ||'%'' ';
        END IF;
    
        
        IF P_ATOCON IS NOT NULL AND length(P_ATOCON)>0 THEN
            SET P_ATOCON = UPPER(TRIM(P_ATOCON));
            SET WhereClause = WhereClause || ' AND ATOCON LIKE ''%'|| P_ATOCON ||'%'' ';
        END IF;
    
        
        IF P_ATOVAL IS NOT NULL AND length(P_ATOVAL)>0 THEN
            SET P_ATOVAL = UPPER(TRIM(P_ATOVAL));
            SET WhereClause = WhereClause || ' AND ATOVAL LIKE ''%'|| P_ATOVAL ||'%'' ';
        END IF;
    
        
        IF P_ATODH IS NOT NULL AND length(P_ATODH)>0 THEN
            SET P_ATODH = UPPER(TRIM(P_ATODH));
            SET WhereClause = WhereClause || ' AND ATODH LIKE ''%'|| P_ATODH ||'%'' ';
        END IF;
    
        
        IF P_ATOFCO IS NOT NULL AND length(P_ATOFCO)>0 THEN
            SET P_ATOFCO = UPPER(TRIM(P_ATOFCO));
            SET WhereClause = WhereClause || ' AND ATOFCO LIKE ''%'|| P_ATOFCO ||'%'' ';
        END IF;
    
        
        IF P_ATOMAT IS NOT NULL AND length(P_ATOMAT)>0 THEN
            SET P_ATOMAT = UPPER(TRIM(P_ATOMAT));
            SET WhereClause = WhereClause || ' AND ATOMAT LIKE ''%'|| P_ATOMAT ||'%'' ';
        END IF;
    
        
        IF P_ATOBAJ IS NOT NULL AND length(P_ATOBAJ)>0 THEN
            SET P_ATOBAJ = UPPER(TRIM(P_ATOBAJ));
            SET WhereClause = WhereClause || ' AND ATOBAJ LIKE ''%'|| P_ATOBAJ ||'%'' ';
        END IF;
    
        
        IF P_ATOUSU IS NOT NULL AND length(P_ATOUSU)>0 THEN
            SET P_ATOUSU = UPPER(TRIM(P_ATOUSU));
            SET WhereClause = WhereClause || ' AND ATOUSU LIKE ''%'|| P_ATOUSU ||'%'' ';
        END IF;
    
        
        IF P_ATOCLI IS NOT NULL AND length(P_ATOCLI)>0 THEN
            SET P_ATOCLI = UPPER(TRIM(P_ATOCLI));
            SET WhereClause = WhereClause || ' AND ATOCLI LIKE ''%'|| P_ATOCLI ||'%'' ';
        END IF;
    
        
        IF P_ATOCOY IS NOT NULL AND length(P_ATOCOY)>0 THEN
            SET P_ATOCOY = UPPER(TRIM(P_ATOCOY));
            SET WhereClause = WhereClause || ' AND ATOCOY LIKE ''%'|| P_ATOCOY ||'%'' ';
        END IF;
    
        
        IF P_ATOVAY IS NOT NULL AND length(P_ATOVAY)>0 THEN
            SET P_ATOVAY = UPPER(TRIM(P_ATOVAY));
            SET WhereClause = WhereClause || ' AND ATOVAY LIKE ''%'|| P_ATOVAY ||'%'' ';
        END IF;
    
        
        IF P_ATORE1 IS NOT NULL AND length(P_ATORE1)>0 THEN
            SET P_ATORE1 = UPPER(TRIM(P_ATORE1));
            SET WhereClause = WhereClause || ' AND ATORE1 LIKE ''%'|| P_ATORE1 ||'%'' ';
        END IF;
    
        
        IF P_ATORE2 IS NOT NULL AND length(P_ATORE2)>0 THEN
            SET P_ATORE2 = UPPER(TRIM(P_ATORE2));
            SET WhereClause = WhereClause || ' AND ATORE2 LIKE ''%'|| P_ATORE2 ||'%'' ';
        END IF;
    
        
        IF P_ATODPR IS NOT NULL AND length(P_ATODPR)>0 THEN
            SET P_ATODPR = UPPER(TRIM(P_ATODPR));
            SET WhereClause = WhereClause || ' AND ATODPR LIKE ''%'|| P_ATODPR ||'%'' ';
        END IF;
    
        
        IF P_ATOBVI IS NOT NULL AND length(P_ATOBVI)>0 THEN
            SET P_ATOBVI = UPPER(TRIM(P_ATOBVI));
            SET WhereClause = WhereClause || ' AND ATOBVI LIKE ''%'|| P_ATOBVI ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.AA2ATO  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountAa2ato', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountAa2ato('','',0,0,'',0,'','','','','','','','','','','','','','','','','', '', '', '')
