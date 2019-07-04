

--DROP  PROCEDURE  GPSQLWEB.procReadValora

CREATE PROCEDURE  GPSQLWEB.procReadValora (
     IN P_VLOEMP varchar(2) ,
 IN P_VLODEL varchar(2) ,
 IN P_VLOCOA varchar(12) ,
 IN P_VLOCON BIGINT ,
 IN P_VLONOM varchar(40) ,
 IN P_VLOUNI double ,
 IN P_VLOLIQ varchar(1) ,
 IN P_VLODIV INTEGER ,
 IN P_VLOCLS varchar(1) ,
 IN P_VLOISI varchar(12) ,
 IN P_VLOCAT varchar(5) ,
 IN P_VLOCBE BIGINT ,
 IN P_VLOFIS BIGINT ,
 IN P_VLOIIN BIGINT ,
 IN P_VLONMI INTEGER ,
 IN P_VLOFIN BIGINT ,
 IN P_VLOPIN double ,
 IN P_VLOIAM BIGINT ,
 IN P_VLONMA INTEGER ,
 IN P_VLOFAM BIGINT ,
 IN P_VLOPAM double ,
 IN P_VLOTAM varchar(1) ,
 IN P_VLOMAM varchar(1) ,
 IN P_VLOUDE BIGINT ,
 IN P_VLOUCA BIGINT ,
 IN P_VLOOUC BIGINT ,
 IN P_VLOBEL varchar(1) ,
 IN P_VLOFUI BIGINT ,
 IN P_VLOFUA BIGINT ,
 IN P_VLOFON double ,
 IN P_VLOSE1 double ,
 IN P_VLOSE2 BIGINT ,
 IN P_VLOCME BIGINT ,
 IN P_VLOFAC double ,
 IN P_VLOGAR double ,
 IN P_VLOGAD double ,
 IN P_VLOCBR double ,
 IN P_VLOTUN varchar(20) ,
 IN P_VLOHOR varchar(20) ,
 IN P_VLOTIP varchar(5) ,
 IN P_VLOSPR double ,
 IN P_VLOTFO INTEGER ,
 IN P_VLOTAS double ,

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
    
        
        IF P_VLOEMP IS NOT NULL AND length(P_VLOEMP)>0 THEN
            SET P_VLOEMP = UPPER(TRIM(P_VLOEMP));
            SET WhereClause = WhereClause || ' AND VLOEMP = '''|| P_VLOEMP ||''' ';
        END IF;
    
        
        IF P_VLODEL IS NOT NULL AND length(P_VLODEL)>0 THEN
            SET P_VLODEL = UPPER(TRIM(P_VLODEL));
            SET WhereClause = WhereClause || ' AND VLODEL = '''|| P_VLODEL ||''' ';
        END IF;
    
        
        IF P_VLOCOA IS NOT NULL AND length(P_VLOCOA)>0 THEN
            SET P_VLOCOA = UPPER(TRIM(P_VLOCOA));
            SET WhereClause = WhereClause || ' AND VLOCOA = '''|| P_VLOCOA ||''' ';
        END IF;
    
        
        IF P_VLOCON > 0 THEN
            SET WhereClause = WhereClause || ' AND VLOCON = '|| P_VLOCON ||' ';
        END IF;
    
        
        IF P_VLONOM IS NOT NULL AND length(P_VLONOM)>0 THEN
            SET P_VLONOM = UPPER(TRIM(P_VLONOM));
            SET WhereClause = WhereClause || ' AND VLONOM LIKE ''%'|| P_VLONOM ||'%'' ';
        END IF;
    
        
        IF P_VLOUNI IS NOT NULL AND length(P_VLOUNI)>0 THEN
            SET P_VLOUNI = UPPER(TRIM(P_VLOUNI));
            SET WhereClause = WhereClause || ' AND VLOUNI LIKE ''%'|| P_VLOUNI ||'%'' ';
        END IF;
    
        
        IF P_VLOLIQ IS NOT NULL AND length(P_VLOLIQ)>0 THEN
            SET P_VLOLIQ = UPPER(TRIM(P_VLOLIQ));
            SET WhereClause = WhereClause || ' AND VLOLIQ LIKE ''%'|| P_VLOLIQ ||'%'' ';
        END IF;
    
        
        IF P_VLODIV > 0 THEN
            SET WhereClause = WhereClause || ' AND VLODIV = '|| P_VLODIV ||' ';
        END IF;
    
        
        IF P_VLOCLS IS NOT NULL AND length(P_VLOCLS)>0 THEN
            SET P_VLOCLS = UPPER(TRIM(P_VLOCLS));
            SET WhereClause = WhereClause || ' AND VLOCLS LIKE ''%'|| P_VLOCLS ||'%'' ';
        END IF;
    
        
        IF P_VLOISI IS NOT NULL AND length(P_VLOISI)>0 THEN
            SET P_VLOISI = UPPER(TRIM(P_VLOISI));
            SET WhereClause = WhereClause || ' AND VLOISI LIKE ''%'|| P_VLOISI ||'%'' ';
        END IF;
    
        
        IF P_VLOCAT IS NOT NULL AND length(P_VLOCAT)>0 THEN
            SET P_VLOCAT = UPPER(TRIM(P_VLOCAT));
            SET WhereClause = WhereClause || ' AND VLOCAT LIKE ''%'|| P_VLOCAT ||'%'' ';
        END IF;
    
        
        IF P_VLOCBE > 0 THEN
            SET WhereClause = WhereClause || ' AND VLOCBE = '|| P_VLOCBE ||' ';
        END IF;
    
        
        IF P_VLOFIS > 0 THEN
            SET WhereClause = WhereClause || ' AND VLOFIS = '|| P_VLOFIS ||' ';
        END IF;
    
        
        IF P_VLOIIN > 0 THEN
            SET WhereClause = WhereClause || ' AND VLOIIN = '|| P_VLOIIN ||' ';
        END IF;
    
        
        IF P_VLONMI > 0 THEN
            SET WhereClause = WhereClause || ' AND VLONMI = '|| P_VLONMI ||' ';
        END IF;
    
        
        IF P_VLOFIN > 0 THEN
            SET WhereClause = WhereClause || ' AND VLOFIN = '|| P_VLOFIN ||' ';
        END IF;
    
        
        IF P_VLOPIN IS NOT NULL AND length(P_VLOPIN)>0 THEN
            SET P_VLOPIN = UPPER(TRIM(P_VLOPIN));
            SET WhereClause = WhereClause || ' AND VLOPIN LIKE ''%'|| P_VLOPIN ||'%'' ';
        END IF;
    
        
        IF P_VLOIAM > 0 THEN
            SET WhereClause = WhereClause || ' AND VLOIAM = '|| P_VLOIAM ||' ';
        END IF;
    
        
        IF P_VLONMA > 0 THEN
            SET WhereClause = WhereClause || ' AND VLONMA = '|| P_VLONMA ||' ';
        END IF;
    
        
        IF P_VLOFAM > 0 THEN
            SET WhereClause = WhereClause || ' AND VLOFAM = '|| P_VLOFAM ||' ';
        END IF;
    
        
        IF P_VLOPAM IS NOT NULL AND length(P_VLOPAM)>0 THEN
            SET P_VLOPAM = UPPER(TRIM(P_VLOPAM));
            SET WhereClause = WhereClause || ' AND VLOPAM LIKE ''%'|| P_VLOPAM ||'%'' ';
        END IF;
    
        
        IF P_VLOTAM IS NOT NULL AND length(P_VLOTAM)>0 THEN
            SET P_VLOTAM = UPPER(TRIM(P_VLOTAM));
            SET WhereClause = WhereClause || ' AND VLOTAM LIKE ''%'|| P_VLOTAM ||'%'' ';
        END IF;
    
        
        IF P_VLOMAM IS NOT NULL AND length(P_VLOMAM)>0 THEN
            SET P_VLOMAM = UPPER(TRIM(P_VLOMAM));
            SET WhereClause = WhereClause || ' AND VLOMAM LIKE ''%'|| P_VLOMAM ||'%'' ';
        END IF;
    
        
        IF P_VLOUDE > 0 THEN
            SET WhereClause = WhereClause || ' AND VLOUDE = '|| P_VLOUDE ||' ';
        END IF;
    
        
        IF P_VLOUCA > 0 THEN
            SET WhereClause = WhereClause || ' AND VLOUCA = '|| P_VLOUCA ||' ';
        END IF;
    
        
        IF P_VLOOUC > 0 THEN
            SET WhereClause = WhereClause || ' AND VLOOUC = '|| P_VLOOUC ||' ';
        END IF;
    
        
        IF P_VLOBEL IS NOT NULL AND length(P_VLOBEL)>0 THEN
            SET P_VLOBEL = UPPER(TRIM(P_VLOBEL));
            SET WhereClause = WhereClause || ' AND VLOBEL LIKE ''%'|| P_VLOBEL ||'%'' ';
        END IF;
    
        
        IF P_VLOFUI > 0 THEN
            SET WhereClause = WhereClause || ' AND VLOFUI = '|| P_VLOFUI ||' ';
        END IF;
    
        
        IF P_VLOFUA > 0 THEN
            SET WhereClause = WhereClause || ' AND VLOFUA = '|| P_VLOFUA ||' ';
        END IF;
    
        
        IF P_VLOFON IS NOT NULL AND length(P_VLOFON)>0 THEN
            SET P_VLOFON = UPPER(TRIM(P_VLOFON));
            SET WhereClause = WhereClause || ' AND VLOFON LIKE ''%'|| P_VLOFON ||'%'' ';
        END IF;
    
        
        IF P_VLOSE1 IS NOT NULL AND length(P_VLOSE1)>0 THEN
            SET P_VLOSE1 = UPPER(TRIM(P_VLOSE1));
            SET WhereClause = WhereClause || ' AND VLOSE1 LIKE ''%'|| P_VLOSE1 ||'%'' ';
        END IF;
    
        
        IF P_VLOSE2 > 0 THEN
            SET WhereClause = WhereClause || ' AND VLOSE2 = '|| P_VLOSE2 ||' ';
        END IF;
    
        
        IF P_VLOCME > 0 THEN
            SET WhereClause = WhereClause || ' AND VLOCME = '|| P_VLOCME ||' ';
        END IF;
    
        
        IF P_VLOFAC IS NOT NULL AND length(P_VLOFAC)>0 THEN
            SET P_VLOFAC = UPPER(TRIM(P_VLOFAC));
            SET WhereClause = WhereClause || ' AND VLOFAC LIKE ''%'|| P_VLOFAC ||'%'' ';
        END IF;
    
        
        IF P_VLOGAR IS NOT NULL AND length(P_VLOGAR)>0 THEN
            SET P_VLOGAR = UPPER(TRIM(P_VLOGAR));
            SET WhereClause = WhereClause || ' AND VLOGAR LIKE ''%'|| P_VLOGAR ||'%'' ';
        END IF;
    
        
        IF P_VLOGAD IS NOT NULL AND length(P_VLOGAD)>0 THEN
            SET P_VLOGAD = UPPER(TRIM(P_VLOGAD));
            SET WhereClause = WhereClause || ' AND VLOGAD LIKE ''%'|| P_VLOGAD ||'%'' ';
        END IF;
    
        
        IF P_VLOCBR IS NOT NULL AND length(P_VLOCBR)>0 THEN
            SET P_VLOCBR = UPPER(TRIM(P_VLOCBR));
            SET WhereClause = WhereClause || ' AND VLOCBR LIKE ''%'|| P_VLOCBR ||'%'' ';
        END IF;
    
        
        IF P_VLOTUN IS NOT NULL AND length(P_VLOTUN)>0 THEN
            SET P_VLOTUN = UPPER(TRIM(P_VLOTUN));
            SET WhereClause = WhereClause || ' AND VLOTUN LIKE ''%'|| P_VLOTUN ||'%'' ';
        END IF;
    
        
        IF P_VLOHOR IS NOT NULL AND length(P_VLOHOR)>0 THEN
            SET P_VLOHOR = UPPER(TRIM(P_VLOHOR));
            SET WhereClause = WhereClause || ' AND VLOHOR LIKE ''%'|| P_VLOHOR ||'%'' ';
        END IF;
    
        
        IF P_VLOTIP IS NOT NULL AND length(P_VLOTIP)>0 THEN
            SET P_VLOTIP = UPPER(TRIM(P_VLOTIP));
            SET WhereClause = WhereClause || ' AND VLOTIP LIKE ''%'|| P_VLOTIP ||'%'' ';
        END IF;
    
        
        IF P_VLOSPR IS NOT NULL AND length(P_VLOSPR)>0 THEN
            SET P_VLOSPR = UPPER(TRIM(P_VLOSPR));
            SET WhereClause = WhereClause || ' AND VLOSPR LIKE ''%'|| P_VLOSPR ||'%'' ';
        END IF;
    
        
        IF P_VLOTFO > 0 THEN
            SET WhereClause = WhereClause || ' AND VLOTFO = '|| P_VLOTFO ||' ';
        END IF;
    
        
        IF P_VLOTAS IS NOT NULL AND length(P_VLOTAS)>0 THEN
            SET P_VLOTAS = UPPER(TRIM(P_VLOTAS));
            SET WhereClause = WhereClause || ' AND VLOTAS LIKE ''%'|| P_VLOTAS ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, VLOEMP ,VLODEL ,VLOCOA ,VLOCON ,VLONOM ,VLOUNI ,VLOLIQ ,VLODIV ,VLOCLS ,VLOISI ,VLOCAT ,VLOCBE ,VLOFIS ,VLOIIN ,VLONMI ,VLOFIN ,VLOPIN ,VLOIAM ,VLONMA ,VLOFAM ,VLOPAM ,VLOTAM ,VLOMAM ,VLOUDE ,VLOUCA ,VLOOUC ,VLOBEL ,VLOFUI ,VLOFUA ,VLOFON ,VLOSE1 ,VLOSE2 ,VLOCME ,VLOFAC ,VLOGAR ,VLOGAD ,VLOCBR ,VLOTUN ,VLOHOR ,VLOTIP ,VLOSPR ,VLOTFO ,VLOTAS  FROM GPDATWEB.VALORA  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT  VLOEMP ,VLODEL ,VLOCOA ,VLOCON ,VLONOM ,VLOUNI ,VLOLIQ ,VLODIV ,VLOCLS ,VLOISI ,VLOCAT ,VLOCBE ,VLOFIS ,VLOIIN ,VLONMI ,VLOFIN ,VLOPIN ,VLOIAM ,VLONMA ,VLOFAM ,VLOPAM ,VLOTAM ,VLOMAM ,VLOUDE ,VLOUCA ,VLOOUC ,VLOBEL ,VLOFUI ,VLOFUA ,VLOFON ,VLOSE1 ,VLOSE2 ,VLOCME ,VLOFAC ,VLOGAR ,VLOGAD ,VLOCBR ,VLOTUN ,VLOHOR ,VLOTIP ,VLOSPR ,VLOTFO ,VLOTAS  FROM  GPDATWEB.VALORA WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT  VLOEMP ,VLODEL ,VLOCOA ,VLOCON ,VLONOM ,VLOUNI ,VLOLIQ ,VLODIV ,VLOCLS ,VLOISI ,VLOCAT ,VLOCBE ,VLOFIS ,VLOIIN ,VLONMI ,VLOFIN ,VLOPIN ,VLOIAM ,VLONMA ,VLOFAM ,VLOPAM ,VLOTAM ,VLOMAM ,VLOUDE ,VLOUCA ,VLOOUC ,VLOBEL ,VLOFUI ,VLOFUA ,VLOFON ,VLOSE1 ,VLOSE2 ,VLOCME ,VLOFAC ,VLOGAR ,VLOGAD ,VLOCBR ,VLOTUN ,VLOHOR ,VLOTIP ,VLOSPR ,VLOTFO ,VLOTAS  FROM  GPDATWEB.VALORA WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    --CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadValora', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadValora ('','','',0,'','','',0,'','','',0,0,0,0,0,'',0,0,0,'','','',0,0,0,'',0,0,'','',0,0,'','','','','','','','',0,'', 1, 10, '', '', '', '')
