

--DROP  PROCEDURE  GPSQLWEB.procReadAa2cta

CREATE PROCEDURE  GPSQLWEB.procReadAa2cta (
    IN P_ROWID BIGINT,
 IN P_CTAEMP VARCHAR(2),
    IN P_CTADEL VARCHAR(2),
    IN P_CTADIV NUMERIC(3 , 0),
    IN P_CTAGEN VARCHAR(12),
    IN P_CTACTE NUMERIC(14 , 0),
    IN P_CTACAT NUMERIC(2 , 0),
    IN P_CTASUB NUMERIC(2 , 0),
    IN P_CTATCT VARCHAR(1),
    IN P_CTANOM VARCHAR(40),
    IN P_CTAMDD DECIMAL(15 , 2),
    IN P_CTAMDC DECIMAL(15 , 2),
    IN P_CTAMED DECIMAL(15 , 2),
    IN P_CTAMEC DECIMAL(15 , 2),
    IN P_CTAAPE DECIMAL(7 , 0),
    IN P_CTAULM DECIMAL(7 , 0),
    IN P_CTACAN DECIMAL(7 , 0),
    IN P_CTABLO DECIMAL(7 , 0),
    IN P_CTALIQ VARCHAR(1),
    IN P_CTAFRL VARCHAR(1),
    IN P_CTAIID DECIMAL(6 , 0),
    IN P_CTAFID DECIMAL(6 , 0),
    IN P_CTATDB VARCHAR(2),
    IN P_CTASDB VARCHAR(1),
    IN P_CTAIND DECIMAL(5 , 3),
    IN P_CTAIMD DECIMAL(5 , 3),
    IN P_CTAIXD DECIMAL(5 , 3),
    IN P_CTAIIC DECIMAL(6 , 0),
    IN P_CTAFIC DECIMAL(6 , 0),
    IN P_CTATCR VARCHAR(2),
    IN P_CTASCR VARCHAR(1),
    IN P_CTAINC DECIMAL(5 , 3),
    IN P_CTAIMC DECIMAL(5 , 3),
    IN P_CTAIXC DECIMAL(5 , 3),
    IN P_CTALIM DECIMAL(11 , 0),
    IN P_CTAIEX DECIMAL(5 , 3),
    IN P_CTACOM DECIMAL(5 , 3),
    IN P_CTALCD DECIMAL(14 , 0),
    IN P_CTALCC DECIMAL(14 , 0),
    IN P_CTAILC DECIMAL(6 , 0),
    IN P_CTAILD DECIMAL(6 , 0),
    IN P_CTAAID DECIMAL(9 , 0),
    IN P_CTAAIA DECIMAL(9 , 0),
    IN P_CTAARE DECIMAL(9 , 0),
    IN P_CTABL1 DECIMAL(3 , 0),
    IN P_CTABL2 DECIMAL(3 , 0),
    IN P_CTABCD DECIMAL(8 , 0),
    IN P_CTABCC DECIMAL(8 , 0),
    IN P_CTABBD DECIMAL(10 , 0),
    IN P_CTABBC DECIMAL(10 , 0),
    IN P_CTABSD DECIMAL(10 , 0),
    IN P_CTABSC DECIMAL(10 , 0),
    IN P_CTASFD DECIMAL(15 , 2),
    IN P_CTASFP DECIMAL(15 , 2),
    IN P_CTASDI DECIMAL(15 , 2),
    IN P_CTASPT DECIMAL(15 , 2),
    IN P_CTASVD DECIMAL(15 , 2),
    IN P_CTASVP DECIMAL(15 , 2),
    IN P_CTABL4 VARCHAR(1),
    IN P_CTAFRE VARCHAR(1),
    IN P_CTASIT VARCHAR(1),
    IN P_CTARES DECIMAL(5 , 0),
    IN P_CTACGE VARCHAR(1),
    IN P_CTAADD DECIMAL(15 , 2),
    IN P_CTAADC DECIMAL(15 , 2),
    IN P_CTAAPD DECIMAL(15 , 2),
    IN P_CTAAPC DECIMAL(15 , 2),
    IN P_CTADPR VARCHAR(16),
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
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.AA2CTA) =' || P_ROWID ;
        END IF;
        
        IF P_CTAEMP IS NOT NULL AND length(P_CTAEMP)>0 THEN
            SET P_CTAEMP = UPPER(TRIM(P_CTAEMP));
            SET WhereClause = WhereClause || ' AND CTAEMP = '''|| P_CTAEMP ||''' ';
        END IF;
    
        
        IF P_CTADEL IS NOT NULL AND length(P_CTADEL)>0 THEN
            SET P_CTADEL = UPPER(TRIM(P_CTADEL));
            SET WhereClause = WhereClause || ' AND CTADEL = '''|| P_CTADEL ||''' ';
        END IF;
    
        
        IF P_CTADIV > 0 THEN
            SET WhereClause = WhereClause || ' AND CTADIV = '|| P_CTADIV ||' ';
        END IF;
    
        
        IF P_CTAGEN IS NOT NULL AND length(P_CTAGEN)>0 THEN
            SET P_CTAGEN = UPPER(TRIM(P_CTAGEN));
            SET WhereClause = WhereClause || ' AND CTAGEN LIKE ''%'|| P_CTAGEN ||'%'' ';
        END IF;
    
        
        IF P_CTACTE > 0 THEN
            SET WhereClause = WhereClause || ' AND CTACTE = '|| P_CTACTE ||' ';
        ELSE 
            SET WhereClause = WhereClause || ' AND CTACTE = 0  ';
        END IF;
    
        
        IF P_CTACAT > 0 THEN
            SET WhereClause = WhereClause || ' AND CTACAT = '|| P_CTACAT ||' ';
        END IF;
    
        
        IF P_CTASUB > 0 THEN
            SET WhereClause = WhereClause || ' AND CTASUB = '|| P_CTASUB ||' ';
        END IF;
    
        
        IF P_CTATCT IS NOT NULL AND length(P_CTATCT)>0 THEN
            SET P_CTATCT = UPPER(TRIM(P_CTATCT));
            SET WhereClause = WhereClause || ' AND CTATCT LIKE ''%'|| P_CTATCT ||'%'' ';
        END IF;
    
        
        IF P_CTANOM IS NOT NULL AND length(P_CTANOM)>0 THEN
            SET P_CTANOM = UPPER(TRIM(P_CTANOM));
            SET WhereClause = WhereClause || ' AND CTANOM LIKE ''%'|| P_CTANOM ||'%'' ';
        END IF;
    
        
        IF P_CTAMDD IS NOT NULL AND length(P_CTAMDD)>0 THEN
            SET P_CTAMDD = UPPER(TRIM(P_CTAMDD));
            SET WhereClause = WhereClause || ' AND CTAMDD LIKE ''%'|| P_CTAMDD ||'%'' ';
        END IF;
    
        
        IF P_CTAMDC IS NOT NULL AND length(P_CTAMDC)>0 THEN
            SET P_CTAMDC = UPPER(TRIM(P_CTAMDC));
            SET WhereClause = WhereClause || ' AND CTAMDC LIKE ''%'|| P_CTAMDC ||'%'' ';
        END IF;
    
        
        IF P_CTAMED IS NOT NULL AND length(P_CTAMED)>0 THEN
            SET P_CTAMED = UPPER(TRIM(P_CTAMED));
            SET WhereClause = WhereClause || ' AND CTAMED LIKE ''%'|| P_CTAMED ||'%'' ';
        END IF;
    
        
        IF P_CTAMEC IS NOT NULL AND length(P_CTAMEC)>0 THEN
            SET P_CTAMEC = UPPER(TRIM(P_CTAMEC));
            SET WhereClause = WhereClause || ' AND CTAMEC LIKE ''%'|| P_CTAMEC ||'%'' ';
        END IF;
    
        
        IF P_CTAAPE > 0 THEN
            SET WhereClause = WhereClause || ' AND CTAAPE = '|| P_CTAAPE ||' ';
        END IF;
    
        
        IF P_CTAULM > 0 THEN
            SET WhereClause = WhereClause || ' AND CTAULM = '|| P_CTAULM ||' ';
        END IF;
    
        
        IF P_CTACAN > 0 THEN
            SET WhereClause = WhereClause || ' AND CTACAN = '|| P_CTACAN ||' ';
        END IF;
    
        
        IF P_CTABLO > 0 THEN
            SET WhereClause = WhereClause || ' AND CTABLO = '|| P_CTABLO ||' ';
        END IF;
    
        
        IF P_CTALIQ IS NOT NULL AND length(P_CTALIQ)>0 THEN
            SET P_CTALIQ = UPPER(TRIM(P_CTALIQ));
            SET WhereClause = WhereClause || ' AND CTALIQ LIKE ''%'|| P_CTALIQ ||'%'' ';
        END IF;
    
        
        IF P_CTAFRL IS NOT NULL AND length(P_CTAFRL)>0 THEN
            SET P_CTAFRL = UPPER(TRIM(P_CTAFRL));
            SET WhereClause = WhereClause || ' AND CTAFRL LIKE ''%'|| P_CTAFRL ||'%'' ';
        END IF;
    
        
        IF P_CTAIID > 0 THEN
            SET WhereClause = WhereClause || ' AND CTAIID = '|| P_CTAIID ||' ';
        END IF;
    
        
        IF P_CTAFID > 0 THEN
            SET WhereClause = WhereClause || ' AND CTAFID = '|| P_CTAFID ||' ';
        END IF;
    
        
        IF P_CTATDB IS NOT NULL AND length(P_CTATDB)>0 THEN
            SET P_CTATDB = UPPER(TRIM(P_CTATDB));
            SET WhereClause = WhereClause || ' AND CTATDB LIKE ''%'|| P_CTATDB ||'%'' ';
        END IF;
    
        
        IF P_CTASDB IS NOT NULL AND length(P_CTASDB)>0 THEN
            SET P_CTASDB = UPPER(TRIM(P_CTASDB));
            SET WhereClause = WhereClause || ' AND CTASDB LIKE ''%'|| P_CTASDB ||'%'' ';
        END IF;
    
        
        IF P_CTAIND IS NOT NULL AND length(P_CTAIND)>0 THEN
            SET P_CTAIND = UPPER(TRIM(P_CTAIND));
            SET WhereClause = WhereClause || ' AND CTAIND LIKE ''%'|| P_CTAIND ||'%'' ';
        END IF;
    
        
        IF P_CTAIMD IS NOT NULL AND length(P_CTAIMD)>0 THEN
            SET P_CTAIMD = UPPER(TRIM(P_CTAIMD));
            SET WhereClause = WhereClause || ' AND CTAIMD LIKE ''%'|| P_CTAIMD ||'%'' ';
        END IF;
    
        
        IF P_CTAIXD IS NOT NULL AND length(P_CTAIXD)>0 THEN
            SET P_CTAIXD = UPPER(TRIM(P_CTAIXD));
            SET WhereClause = WhereClause || ' AND CTAIXD LIKE ''%'|| P_CTAIXD ||'%'' ';
        END IF;
    
        
        IF P_CTAIIC > 0 THEN
            SET WhereClause = WhereClause || ' AND CTAIIC = '|| P_CTAIIC ||' ';
        END IF;
    
        
        IF P_CTAFIC > 0 THEN
            SET WhereClause = WhereClause || ' AND CTAFIC = '|| P_CTAFIC ||' ';
        END IF;
    
        
        IF P_CTATCR IS NOT NULL AND length(P_CTATCR)>0 THEN
            SET P_CTATCR = UPPER(TRIM(P_CTATCR));
            SET WhereClause = WhereClause || ' AND CTATCR LIKE ''%'|| P_CTATCR ||'%'' ';
        END IF;
    
        
        IF P_CTASCR IS NOT NULL AND length(P_CTASCR)>0 THEN
            SET P_CTASCR = UPPER(TRIM(P_CTASCR));
            SET WhereClause = WhereClause || ' AND CTASCR LIKE ''%'|| P_CTASCR ||'%'' ';
        END IF;
    
        
        IF P_CTAINC IS NOT NULL AND length(P_CTAINC)>0 THEN
            SET P_CTAINC = UPPER(TRIM(P_CTAINC));
            SET WhereClause = WhereClause || ' AND CTAINC LIKE ''%'|| P_CTAINC ||'%'' ';
        END IF;
    
        
        IF P_CTAIMC IS NOT NULL AND length(P_CTAIMC)>0 THEN
            SET P_CTAIMC = UPPER(TRIM(P_CTAIMC));
            SET WhereClause = WhereClause || ' AND CTAIMC LIKE ''%'|| P_CTAIMC ||'%'' ';
        END IF;
    
        
        IF P_CTAIXC IS NOT NULL AND length(P_CTAIXC)>0 THEN
            SET P_CTAIXC = UPPER(TRIM(P_CTAIXC));
            SET WhereClause = WhereClause || ' AND CTAIXC LIKE ''%'|| P_CTAIXC ||'%'' ';
        END IF;
    
        
        IF P_CTALIM > 0 THEN
            SET WhereClause = WhereClause || ' AND CTALIM = '|| P_CTALIM ||' ';
        END IF;
    
        
        IF P_CTAIEX IS NOT NULL AND length(P_CTAIEX)>0 THEN
            SET P_CTAIEX = UPPER(TRIM(P_CTAIEX));
            SET WhereClause = WhereClause || ' AND CTAIEX LIKE ''%'|| P_CTAIEX ||'%'' ';
        END IF;
    
        
        IF P_CTACOM IS NOT NULL AND length(P_CTACOM)>0 THEN
            SET P_CTACOM = UPPER(TRIM(P_CTACOM));
            SET WhereClause = WhereClause || ' AND CTACOM LIKE ''%'|| P_CTACOM ||'%'' ';
        END IF;
    
        
        IF P_CTALCD > 0 THEN
            SET WhereClause = WhereClause || ' AND CTALCD = '|| P_CTALCD ||' ';
        END IF;
    
        
        IF P_CTALCC > 0 THEN
            SET WhereClause = WhereClause || ' AND CTALCC = '|| P_CTALCC ||' ';
        END IF;
    
        
        IF P_CTAILC > 0 THEN
            SET WhereClause = WhereClause || ' AND CTAILC = '|| P_CTAILC ||' ';
        END IF;
    
        
        IF P_CTAILD > 0 THEN
            SET WhereClause = WhereClause || ' AND CTAILD = '|| P_CTAILD ||' ';
        END IF;
    
        
        IF P_CTAAID > 0 THEN
            SET WhereClause = WhereClause || ' AND CTAAID = '|| P_CTAAID ||' ';
        END IF;
    
        
        IF P_CTAAIA > 0 THEN
            SET WhereClause = WhereClause || ' AND CTAAIA = '|| P_CTAAIA ||' ';
        END IF;
    
        
        IF P_CTAARE > 0 THEN
            SET WhereClause = WhereClause || ' AND CTAARE = '|| P_CTAARE ||' ';
        END IF;
    
        
        IF P_CTABL1 > 0 THEN
            SET WhereClause = WhereClause || ' AND CTABL1 = '|| P_CTABL1 ||' ';
        END IF;
    
        
        IF P_CTABL2 > 0 THEN
            SET WhereClause = WhereClause || ' AND CTABL2 = '|| P_CTABL2 ||' ';
        END IF;
    
        
        IF P_CTABCD > 0 THEN
            SET WhereClause = WhereClause || ' AND CTABCD = '|| P_CTABCD ||' ';
        END IF;
    
        
        IF P_CTABCC > 0 THEN
            SET WhereClause = WhereClause || ' AND CTABCC = '|| P_CTABCC ||' ';
        END IF;
    
        
        IF P_CTABBD > 0 THEN
            SET WhereClause = WhereClause || ' AND CTABBD = '|| P_CTABBD ||' ';
        END IF;
    
        
        IF P_CTABBC > 0 THEN
            SET WhereClause = WhereClause || ' AND CTABBC = '|| P_CTABBC ||' ';
        END IF;
    
        
        IF P_CTABSD > 0 THEN
            SET WhereClause = WhereClause || ' AND CTABSD = '|| P_CTABSD ||' ';
        END IF;
    
        
        IF P_CTABSC > 0 THEN
            SET WhereClause = WhereClause || ' AND CTABSC = '|| P_CTABSC ||' ';
        END IF;
    
        
        IF P_CTASFD IS NOT NULL AND length(P_CTASFD)>0 THEN
            SET P_CTASFD = UPPER(TRIM(P_CTASFD));
            SET WhereClause = WhereClause || ' AND CTASFD LIKE ''%'|| P_CTASFD ||'%'' ';
        END IF;
    
        
        IF P_CTASFP IS NOT NULL AND length(P_CTASFP)>0 THEN
            SET P_CTASFP = UPPER(TRIM(P_CTASFP));
            SET WhereClause = WhereClause || ' AND CTASFP LIKE ''%'|| P_CTASFP ||'%'' ';
        END IF;
    
        
        IF P_CTASDI IS NOT NULL AND length(P_CTASDI)>0 THEN
            SET P_CTASDI = UPPER(TRIM(P_CTASDI));
            SET WhereClause = WhereClause || ' AND CTASDI LIKE ''%'|| P_CTASDI ||'%'' ';
        END IF;
    
        
        IF P_CTASPT IS NOT NULL AND length(P_CTASPT)>0 THEN
            SET P_CTASPT = UPPER(TRIM(P_CTASPT));
            SET WhereClause = WhereClause || ' AND CTASPT LIKE ''%'|| P_CTASPT ||'%'' ';
        END IF;
    
        
        IF P_CTASVD IS NOT NULL AND length(P_CTASVD)>0 THEN
            SET P_CTASVD = UPPER(TRIM(P_CTASVD));
            SET WhereClause = WhereClause || ' AND CTASVD LIKE ''%'|| P_CTASVD ||'%'' ';
        END IF;
    
        
        IF P_CTASVP IS NOT NULL AND length(P_CTASVP)>0 THEN
            SET P_CTASVP = UPPER(TRIM(P_CTASVP));
            SET WhereClause = WhereClause || ' AND CTASVP LIKE ''%'|| P_CTASVP ||'%'' ';
        END IF;
    
        
        IF P_CTABL4 IS NOT NULL AND length(P_CTABL4)>0 THEN
            SET P_CTABL4 = UPPER(TRIM(P_CTABL4));
            SET WhereClause = WhereClause || ' AND CTABL4 LIKE ''%'|| P_CTABL4 ||'%'' ';
        END IF;
    
        
        IF P_CTAFRE IS NOT NULL AND length(P_CTAFRE)>0 THEN
            SET P_CTAFRE = UPPER(TRIM(P_CTAFRE));
            SET WhereClause = WhereClause || ' AND CTAFRE LIKE ''%'|| P_CTAFRE ||'%'' ';
        END IF;
    
        
        IF P_CTASIT IS NOT NULL AND length(P_CTASIT)>0 THEN
            SET P_CTASIT = UPPER(TRIM(P_CTASIT));
            SET WhereClause = WhereClause || ' AND CTASIT LIKE ''%'|| P_CTASIT ||'%'' ';
        END IF;
    
        
        IF P_CTARES > 0 THEN
            SET WhereClause = WhereClause || ' AND CTARES = '|| P_CTARES ||' ';
        END IF;
    
        
        IF P_CTACGE IS NOT NULL AND length(P_CTACGE)>0 THEN
            SET P_CTACGE = UPPER(TRIM(P_CTACGE));
            SET WhereClause = WhereClause || ' AND CTACGE LIKE ''%'|| P_CTACGE ||'%'' ';
        END IF;
    
        
        IF P_CTAADD IS NOT NULL AND length(P_CTAADD)>0 THEN
            SET P_CTAADD = UPPER(TRIM(P_CTAADD));
            SET WhereClause = WhereClause || ' AND CTAADD LIKE ''%'|| P_CTAADD ||'%'' ';
        END IF;
    
        
        IF P_CTAADC IS NOT NULL AND length(P_CTAADC)>0 THEN
            SET P_CTAADC = UPPER(TRIM(P_CTAADC));
            SET WhereClause = WhereClause || ' AND CTAADC LIKE ''%'|| P_CTAADC ||'%'' ';
        END IF;
    
        
        IF P_CTAAPD IS NOT NULL AND length(P_CTAAPD)>0 THEN
            SET P_CTAAPD = UPPER(TRIM(P_CTAAPD));
            SET WhereClause = WhereClause || ' AND CTAAPD LIKE ''%'|| P_CTAAPD ||'%'' ';
        END IF;
    
        
        IF P_CTAAPC IS NOT NULL AND length(P_CTAAPC)>0 THEN
            SET P_CTAAPC = UPPER(TRIM(P_CTAAPC));
            SET WhereClause = WhereClause || ' AND CTAAPC LIKE ''%'|| P_CTAAPC ||'%'' ';
        END IF;
    
        
        IF P_CTADPR IS NOT NULL AND length(P_CTADPR)>0 THEN
            SET P_CTADPR = UPPER(TRIM(P_CTADPR));
            SET WhereClause = WhereClause || ' AND CTADPR LIKE ''%'|| P_CTADPR ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.AA2CTA) as ROWID,CTAEMP ,CTADEL ,CTADIV ,CTAGEN ,CTACTE ,CTACAT ,CTASUB ,CTATCT ,CTANOM ,CTAMDD ,CTAMDC ,CTAMED ,CTAMEC ,CTAAPE ,CTAULM ,CTACAN ,CTABLO ,CTALIQ ,CTAFRL ,CTAIID ,CTAFID ,CTATDB ,CTASDB ,CTAIND ,CTAIMD ,CTAIXD ,CTAIIC ,CTAFIC ,CTATCR ,CTASCR ,CTAINC ,CTAIMC ,CTAIXC ,CTALIM ,CTAIEX ,CTACOM ,CTALCD ,CTALCC ,CTAILC ,CTAILD ,CTAAID ,CTAAIA ,CTAARE ,CTABL1 ,CTABL2 ,CTABCD ,CTABCC ,CTABBD ,CTABBC ,CTABSD ,CTABSC ,CTASFD ,CTASFP ,CTASDI ,CTASPT ,CTASVD ,CTASVP ,CTABL4 ,CTAFRE ,CTASIT ,CTARES ,CTACGE ,CTAADD ,CTAADC ,CTAAPD ,CTAAPC ,CTADPR  FROM GPDATWEB.AA2CTA  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AA2CTA) as ROWID,CTAEMP ,CTADEL ,CTADIV ,CTAGEN ,CTACTE ,CTACAT ,CTASUB ,CTATCT ,CTANOM ,CTAMDD ,CTAMDC ,CTAMED ,CTAMEC ,CTAAPE ,CTAULM ,CTACAN ,CTABLO ,CTALIQ ,CTAFRL ,CTAIID ,CTAFID ,CTATDB ,CTASDB ,CTAIND ,CTAIMD ,CTAIXD ,CTAIIC ,CTAFIC ,CTATCR ,CTASCR ,CTAINC ,CTAIMC ,CTAIXC ,CTALIM ,CTAIEX ,CTACOM ,CTALCD ,CTALCC ,CTAILC ,CTAILD ,CTAAID ,CTAAIA ,CTAARE ,CTABL1 ,CTABL2 ,CTABCD ,CTABCC ,CTABBD ,CTABBC ,CTABSD ,CTABSC ,CTASFD ,CTASFP ,CTASDI ,CTASPT ,CTASVD ,CTASVP ,CTABL4 ,CTAFRE ,CTASIT ,CTARES ,CTACGE ,CTAADD ,CTAADC ,CTAAPD ,CTAAPC ,CTADPR  FROM  GPDATWEB.AA2CTA WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AA2CTA) as ROWID,CTAEMP ,CTADEL ,CTADIV ,CTAGEN ,CTACTE ,CTACAT ,CTASUB ,CTATCT ,CTANOM ,CTAMDD ,CTAMDC ,CTAMED ,CTAMEC ,CTAAPE ,CTAULM ,CTACAN ,CTABLO ,CTALIQ ,CTAFRL ,CTAIID ,CTAFID ,CTATDB ,CTASDB ,CTAIND ,CTAIMD ,CTAIXD ,CTAIIC ,CTAFIC ,CTATCR ,CTASCR ,CTAINC ,CTAIMC ,CTAIXC ,CTALIM ,CTAIEX ,CTACOM ,CTALCD ,CTALCC ,CTAILC ,CTAILD ,CTAAID ,CTAAIA ,CTAARE ,CTABL1 ,CTABL2 ,CTABCD ,CTABCC ,CTABBD ,CTABBC ,CTABSD ,CTABSC ,CTASFD ,CTASFP ,CTASDI ,CTASPT ,CTASVD ,CTASVP ,CTABL4 ,CTAFRE ,CTASIT ,CTARES ,CTACGE ,CTAADD ,CTAADC ,CTAAPD ,CTAAPC ,CTADPR  FROM  GPDATWEB.AA2CTA WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    --CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadAa2cta', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadAa2cta ('','',0,'',0,0,0,'','','','','','',0,0,0,0,'','',0,0,'','','','','',0,0,'','','','','',0,'','',0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,'','','','','','','','','',0,'','','','','','', 1, 10, '', '', '', '')
