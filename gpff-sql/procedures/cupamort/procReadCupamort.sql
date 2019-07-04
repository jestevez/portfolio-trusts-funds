--DROP  PROCEDURE  GPSQLWEB.procReadCupamort

CREATE PROCEDURE  GPSQLWEB.procReadCupamort (
    IN P_ROWID BIGINT,
    IN P_CUPEMP VARCHAR(2),
    IN P_CUPDEL VARCHAR(2),
    IN P_CUPTIP VARCHAR(1),
    IN P_CUPVAL VARCHAR(12),
    IN P_CUPFEC DECIMAL(8 , 0),
    IN P_CUPMNT NUMERIC(8 , 5),
    IN P_CUPIMP DECIMAL(15 , 2),
    IN P_CUPCOB DECIMAL(8 , 0),
    IN P_CUPVEN VARCHAR(1),
    IN P_CUPMCB VARCHAR(1),
    IN P_CUPCBT VARCHAR(1),
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
    ELSE
        Set SortClause = ' ORDER BY CUPFEC DESC';
    END IF;

    -- WHERE CLAUSE
    IF P_ROWID IS NOT NULL AND P_ROWID>0 THEN
        SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.CUPAMORT) =' || P_ROWID ;
    END IF;

    IF P_CUPEMP IS NOT NULL AND length(P_CUPEMP)>0 THEN
        SET P_CUPEMP = UPPER(TRIM(P_CUPEMP));
        SET WhereClause = WhereClause || ' AND CUPEMP = '''|| P_CUPEMP ||''' ';
    END IF;


    IF P_CUPDEL IS NOT NULL AND length(P_CUPDEL)>0 THEN
        SET P_CUPDEL = UPPER(TRIM(P_CUPDEL));
        SET WhereClause = WhereClause || ' AND CUPDEL = '''|| P_CUPDEL ||''' ';
    END IF;


    IF P_CUPTIP IS NOT NULL AND length(P_CUPTIP)>0 THEN
        SET P_CUPTIP = UPPER(TRIM(P_CUPTIP));
        SET WhereClause = WhereClause || ' AND CUPTIP LIKE ''%'|| P_CUPTIP ||'%'' ';
    END IF;


    IF P_CUPVAL IS NOT NULL AND length(P_CUPVAL)>0 THEN
        SET P_CUPVAL = UPPER(TRIM(P_CUPVAL));
        SET WhereClause = WhereClause || ' AND CUPVAL = '''|| P_CUPVAL ||''' ';
    END IF;


    IF P_CUPFEC > 0 THEN
        SET WhereClause = WhereClause || ' AND CUPFEC = '|| P_CUPFEC ||' ';
    END IF;


    IF P_CUPMNT IS NOT NULL AND length(P_CUPMNT)>0 THEN
        SET P_CUPMNT = UPPER(TRIM(P_CUPMNT));
        SET WhereClause = WhereClause || ' AND CUPMNT LIKE ''%'|| P_CUPMNT ||'%'' ';
    END IF;


    IF P_CUPIMP IS NOT NULL AND length(P_CUPIMP)>0 THEN
        SET P_CUPIMP = UPPER(TRIM(P_CUPIMP));
        SET WhereClause = WhereClause || ' AND CUPIMP LIKE ''%'|| P_CUPIMP ||'%'' ';
    END IF;


    IF P_CUPCOB > 0 THEN
        SET WhereClause = WhereClause || ' AND CUPCOB = '|| P_CUPCOB ||' ';
    END IF;


    IF P_CUPVEN IS NOT NULL AND length(P_CUPVEN)>0 THEN
        SET P_CUPVEN = UPPER(TRIM(P_CUPVEN));
        SET WhereClause = WhereClause || ' AND CUPVEN LIKE ''%'|| P_CUPVEN ||'%'' ';
    END IF;


    IF P_CUPMCB IS NOT NULL AND length(P_CUPMCB)>0 THEN
        SET P_CUPMCB = UPPER(TRIM(P_CUPMCB));
        SET WhereClause = WhereClause || ' AND CUPMCB LIKE ''%'|| P_CUPMCB ||'%'' ';
    END IF;


    IF P_CUPCBT IS NOT NULL AND length(P_CUPCBT)>0 THEN
        SET P_CUPCBT = UPPER(TRIM(P_CUPCBT));
        SET WhereClause = WhereClause || ' AND CUPCBT LIKE ''%'|| P_CUPCBT ||'%'' ';
    END IF;


    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.CUPAMORT) as ROWID,CUPEMP ,CUPDEL ,CUPTIP ,CUPVAL ,CUPFEC ,CUPMNT ,CUPIMP ,CUPCOB ,CUPVEN ,CUPMCB ,CUPCBT  FROM GPDATWEB.CUPAMORT  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT RRN(GPDATWEB.CUPAMORT) as ROWID,CUPEMP ,CUPDEL ,CUPTIP ,CUPVAL ,CUPFEC ,CUPMNT ,CUPIMP ,CUPCOB ,CUPVEN ,CUPMCB ,CUPCBT  FROM  GPDATWEB.CUPAMORT WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT RRN(GPDATWEB.CUPAMORT) as ROWID,CUPEMP ,CUPDEL ,CUPTIP ,CUPVAL ,CUPFEC ,CUPMNT ,CUPIMP ,CUPCOB ,CUPVEN ,CUPMCB ,CUPCBT  FROM  GPDATWEB.CUPAMORT WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadCupamort', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadCupamort ('','','','',0,'','',0,'','','', 1, 10, '', '', '', '')
