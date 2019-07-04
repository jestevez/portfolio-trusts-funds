--DROP  PROCEDURE  GPSQLWEB.procReadAa2ato

CREATE PROCEDURE  GPSQLWEB.procReadAa2ato (
    IN P_ROWID BIGINT,
    IN P_ATOEMP varchar(2) ,
    IN P_ATODEL varchar(2) ,
    IN P_ATOFEC INTEGER ,
    IN P_ATODTO INTEGER ,
    IN P_ATONRO BIGINT ,
    IN P_ATODIV INTEGER ,
    IN P_ATOCTA BIGINT ,
    IN P_ATOIMD double ,
    IN P_ATOIMP double ,
    IN P_ATOCON varchar(3) ,
    IN P_ATOVAL BIGINT ,
    IN P_ATODH varchar(1) ,
    IN P_ATOFCO BIGINT ,
    IN P_ATOMAT varchar(1) ,
    IN P_ATOBAJ varchar(1) ,
    IN P_ATOUSU varchar(6) ,
    IN P_ATOCLI BIGINT ,
    IN P_ATOCOY BIGINT ,
    IN P_ATOVAY BIGINT ,
    IN P_ATORE1 varchar(3) ,
    IN P_ATORE2 BIGINT ,
    IN P_ATODPR varchar(1) ,
    IN P_ATOBVI BIGINT ,
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
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.AA2ATO) =' || P_ROWID ;
        END IF;
        
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
    
        
        IF P_ATONRO > 0 THEN
            SET WhereClause = WhereClause || ' AND ATONRO = '|| P_ATONRO ||' ';
        END IF;
    
        
        IF P_ATODIV > 0 THEN
            SET WhereClause = WhereClause || ' AND ATODIV = '|| P_ATODIV ||' ';
        END IF;
    
        
        IF P_ATOCTA > 0 THEN
            SET WhereClause = WhereClause || ' AND ATOCTA = '|| P_ATOCTA ||' ';
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
    
        
        IF P_ATOVAL > 0 THEN
            SET WhereClause = WhereClause || ' AND ATOVAL = '|| P_ATOVAL ||' ';
        END IF;
    
        
        IF P_ATODH IS NOT NULL AND length(P_ATODH)>0 THEN
            SET P_ATODH = UPPER(TRIM(P_ATODH));
            SET WhereClause = WhereClause || ' AND ATODH LIKE ''%'|| P_ATODH ||'%'' ';
        END IF;
    
        
        IF P_ATOFCO > 0 THEN
            SET WhereClause = WhereClause || ' AND ATOFCO = '|| P_ATOFCO ||' ';
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
    
        
        IF P_ATOCLI > 0 THEN
            SET WhereClause = WhereClause || ' AND ATOCLI = '|| P_ATOCLI ||' ';
        END IF;
    
        
        IF P_ATOCOY > 0 THEN
            SET WhereClause = WhereClause || ' AND ATOCOY = '|| P_ATOCOY ||' ';
        END IF;
    
        
        IF P_ATOVAY > 0 THEN
            SET WhereClause = WhereClause || ' AND ATOVAY = '|| P_ATOVAY ||' ';
        END IF;
    
        
        IF P_ATORE1 IS NOT NULL AND length(P_ATORE1)>0 THEN
            SET P_ATORE1 = UPPER(TRIM(P_ATORE1));
            SET WhereClause = WhereClause || ' AND ATORE1 LIKE ''%'|| P_ATORE1 ||'%'' ';
        END IF;
    
        
        IF P_ATORE2 > 0 THEN
            SET WhereClause = WhereClause || ' AND ATORE2 = '|| P_ATORE2 ||' ';
        END IF;
    
        
        IF P_ATODPR IS NOT NULL AND length(P_ATODPR)>0 THEN
            SET P_ATODPR = UPPER(TRIM(P_ATODPR));
            SET WhereClause = WhereClause || ' AND ATODPR LIKE ''%'|| P_ATODPR ||'%'' ';
        END IF;
    
        
        IF P_ATOBVI > 0 THEN
            SET WhereClause = WhereClause || ' AND ATOBVI = '|| P_ATOBVI ||' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, RRN(GPDATWEB.AA2ATO) as ROWID, ATOEMP ,ATODEL ,ATOFEC ,ATODTO ,ATONRO ,ATODIV ,ATOCTA ,ATOIMD ,ATOIMP ,ATOCON ,ATOVAL ,ATODH ,ATOFCO ,ATOMAT ,ATOBAJ ,ATOUSU ,ATOCLI ,ATOCOY ,ATOVAY ,ATORE1 ,ATORE2 ,ATODPR ,ATOBVI  FROM GPDATWEB.AA2ATO  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT RRN(GPDATWEB.AA2ATO) as ROWID, ATOEMP ,ATODEL ,ATOFEC ,ATODTO ,ATONRO ,ATODIV ,ATOCTA ,ATOIMD ,ATOIMP ,ATOCON ,ATOVAL ,ATODH ,ATOFCO ,ATOMAT ,ATOBAJ ,ATOUSU ,ATOCLI ,ATOCOY ,ATOVAY ,ATORE1 ,ATORE2 ,ATODPR ,ATOBVI  FROM  GPDATWEB.AA2ATO WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT RRN(GPDATWEB.AA2ATO) as ROWID, ATOEMP ,ATODEL ,ATOFEC ,ATODTO ,ATONRO ,ATODIV ,ATOCTA ,ATOIMD ,ATOIMP ,ATOCON ,ATOVAL ,ATODH ,ATOFCO ,ATOMAT ,ATOBAJ ,ATOUSU ,ATOCLI ,ATOCOY ,ATOVAY ,ATORE1 ,ATORE2 ,ATODPR ,ATOBVI  FROM  GPDATWEB.AA2ATO WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadAa2ato', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadAa2ato ('','',0,0,0,0,0,'','','',0,'',0,'','','',0,0,0,'',0,'',0, 1, 10, '', '', '', '')
