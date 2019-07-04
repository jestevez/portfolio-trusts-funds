

--DROP  PROCEDURE  GPSQLWEB.procCountValora

CREATE PROCEDURE  GPSQLWEB.procCountValora (
     IN P_VLOEMP varchar(2),
 IN P_VLODEL varchar(2),
 IN P_VLOCOA varchar(12),
 IN P_VLOCON bigint,
 IN P_VLONOM varchar(40),
 IN P_VLOUNI double,
 IN P_VLOLIQ varchar(1),
 IN P_VLODIV INTEGER,
 IN P_VLOCLS varchar(1),
 IN P_VLOISI varchar(12),
 IN P_VLOCAT varchar(5),
 IN P_VLOCBE bigint,
 IN P_VLOFIS bigint,
 IN P_VLOIIN bigint,
 IN P_VLONMI INTEGER,
 IN P_VLOFIN bigint,
 IN P_VLOPIN double,
 IN P_VLOIAM bigint,
 IN P_VLONMA INTEGER,
 IN P_VLOFAM bigint,
 IN P_VLOPAM double,
 IN P_VLOTAM varchar(1),
 IN P_VLOMAM varchar(1),
 IN P_VLOUDE bigint,
 IN P_VLOUCA bigint,
 IN P_VLOOUC bigint,
 IN P_VLOBEL varchar(1),
 IN P_VLOFUI bigint,
 IN P_VLOFUA bigint,
 IN P_VLOFON double,
 IN P_VLOSE1 double,
 IN P_VLOSE2 bigint,
 IN P_VLOCME bigint,
 IN P_VLOFAC double,
 IN P_VLOGAR double,
 IN P_VLOGAD double,
 IN P_VLOCBR double,
 IN P_VLOTUN varchar(20),
 IN P_VLOHOR varchar(20),
 IN P_VLOTIP varchar(5),
 IN P_VLOSPR double,
 IN P_VLOTFO INTEGER,
 IN P_VLOTAS double,

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
    
        
        IF P_VLOCON IS NOT NULL AND length(P_VLOCON)>0 THEN
            SET P_VLOCON = UPPER(TRIM(P_VLOCON));
            SET WhereClause = WhereClause || ' AND VLOCON LIKE ''%'|| P_VLOCON ||'%'' ';
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
    
        
        IF P_VLOCBE IS NOT NULL AND length(P_VLOCBE)>0 THEN
            SET P_VLOCBE = UPPER(TRIM(P_VLOCBE));
            SET WhereClause = WhereClause || ' AND VLOCBE LIKE ''%'|| P_VLOCBE ||'%'' ';
        END IF;
    
        
        IF P_VLOFIS IS NOT NULL AND length(P_VLOFIS)>0 THEN
            SET P_VLOFIS = UPPER(TRIM(P_VLOFIS));
            SET WhereClause = WhereClause || ' AND VLOFIS LIKE ''%'|| P_VLOFIS ||'%'' ';
        END IF;
    
        
        IF P_VLOIIN IS NOT NULL AND length(P_VLOIIN)>0 THEN
            SET P_VLOIIN = UPPER(TRIM(P_VLOIIN));
            SET WhereClause = WhereClause || ' AND VLOIIN LIKE ''%'|| P_VLOIIN ||'%'' ';
        END IF;
    
        
        IF P_VLONMI > 0 THEN
            SET WhereClause = WhereClause || ' AND VLONMI = '|| P_VLONMI ||' ';
        END IF;
    
        
        IF P_VLOFIN IS NOT NULL AND length(P_VLOFIN)>0 THEN
            SET P_VLOFIN = UPPER(TRIM(P_VLOFIN));
            SET WhereClause = WhereClause || ' AND VLOFIN LIKE ''%'|| P_VLOFIN ||'%'' ';
        END IF;
    
        
        IF P_VLOPIN IS NOT NULL AND length(P_VLOPIN)>0 THEN
            SET P_VLOPIN = UPPER(TRIM(P_VLOPIN));
            SET WhereClause = WhereClause || ' AND VLOPIN LIKE ''%'|| P_VLOPIN ||'%'' ';
        END IF;
    
        
        IF P_VLOIAM IS NOT NULL AND length(P_VLOIAM)>0 THEN
            SET P_VLOIAM = UPPER(TRIM(P_VLOIAM));
            SET WhereClause = WhereClause || ' AND VLOIAM LIKE ''%'|| P_VLOIAM ||'%'' ';
        END IF;
    
        
        IF P_VLONMA > 0 THEN
            SET WhereClause = WhereClause || ' AND VLONMA = '|| P_VLONMA ||' ';
        END IF;
    
        
        IF P_VLOFAM IS NOT NULL AND length(P_VLOFAM)>0 THEN
            SET P_VLOFAM = UPPER(TRIM(P_VLOFAM));
            SET WhereClause = WhereClause || ' AND VLOFAM LIKE ''%'|| P_VLOFAM ||'%'' ';
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
    
        
        IF P_VLOUDE IS NOT NULL AND length(P_VLOUDE)>0 THEN
            SET P_VLOUDE = UPPER(TRIM(P_VLOUDE));
            SET WhereClause = WhereClause || ' AND VLOUDE LIKE ''%'|| P_VLOUDE ||'%'' ';
        END IF;
    
        
        IF P_VLOUCA IS NOT NULL AND length(P_VLOUCA)>0 THEN
            SET P_VLOUCA = UPPER(TRIM(P_VLOUCA));
            SET WhereClause = WhereClause || ' AND VLOUCA LIKE ''%'|| P_VLOUCA ||'%'' ';
        END IF;
    
        
        IF P_VLOOUC IS NOT NULL AND length(P_VLOOUC)>0 THEN
            SET P_VLOOUC = UPPER(TRIM(P_VLOOUC));
            SET WhereClause = WhereClause || ' AND VLOOUC LIKE ''%'|| P_VLOOUC ||'%'' ';
        END IF;
    
        
        IF P_VLOBEL IS NOT NULL AND length(P_VLOBEL)>0 THEN
            SET P_VLOBEL = UPPER(TRIM(P_VLOBEL));
            SET WhereClause = WhereClause || ' AND VLOBEL LIKE ''%'|| P_VLOBEL ||'%'' ';
        END IF;
    
        
        IF P_VLOFUI IS NOT NULL AND length(P_VLOFUI)>0 THEN
            SET P_VLOFUI = UPPER(TRIM(P_VLOFUI));
            SET WhereClause = WhereClause || ' AND VLOFUI LIKE ''%'|| P_VLOFUI ||'%'' ';
        END IF;
    
        
        IF P_VLOFUA IS NOT NULL AND length(P_VLOFUA)>0 THEN
            SET P_VLOFUA = UPPER(TRIM(P_VLOFUA));
            SET WhereClause = WhereClause || ' AND VLOFUA LIKE ''%'|| P_VLOFUA ||'%'' ';
        END IF;
    
        
        IF P_VLOFON IS NOT NULL AND length(P_VLOFON)>0 THEN
            SET P_VLOFON = UPPER(TRIM(P_VLOFON));
            SET WhereClause = WhereClause || ' AND VLOFON LIKE ''%'|| P_VLOFON ||'%'' ';
        END IF;
    
        
        IF P_VLOSE1 IS NOT NULL AND length(P_VLOSE1)>0 THEN
            SET P_VLOSE1 = UPPER(TRIM(P_VLOSE1));
            SET WhereClause = WhereClause || ' AND VLOSE1 LIKE ''%'|| P_VLOSE1 ||'%'' ';
        END IF;
    
        
        IF P_VLOSE2 IS NOT NULL AND length(P_VLOSE2)>0 THEN
            SET P_VLOSE2 = UPPER(TRIM(P_VLOSE2));
            SET WhereClause = WhereClause || ' AND VLOSE2 LIKE ''%'|| P_VLOSE2 ||'%'' ';
        END IF;
    
        
        IF P_VLOCME IS NOT NULL AND length(P_VLOCME)>0 THEN
            SET P_VLOCME = UPPER(TRIM(P_VLOCME));
            SET WhereClause = WhereClause || ' AND VLOCME LIKE ''%'|| P_VLOCME ||'%'' ';
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
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.VALORA  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountValora', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountValora('','','','','','','',0,'','','','','','',0,'','','',0,'','','','','','','','','','','','','','','','','','','','','','',0,'', '', '', '')
