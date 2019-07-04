

--DROP  PROCEDURE  GPSQLWEB.procReadAa2mcli

CREATE PROCEDURE  GPSQLWEB.procReadAa2mcli (
IN P_CLIEMP varchar(2) ,
IN P_CLIDEL varchar(2) ,
IN P_CLICLA BIGINT ,
IN P_CLINIF varchar(12) ,
IN P_CLIASO BIGINT ,
IN P_CLIANA BIGINT ,
IN P_CLINOM varchar(20) ,
IN P_CLIAPE varchar(15) ,
IN P_CLIAP2 varchar(15) ,
IN P_CLICAL varchar(2) ,
IN P_CLIDI1 varchar(30) ,
IN P_CLIDI2 varchar(30) ,
IN P_CLIPOS varchar(9) ,
IN P_CLIPRO varchar(25) ,
IN P_CLIPAI INTEGER ,
IN P_CLIPOB varchar(27) ,
IN P_CLIGES INTEGER ,
IN P_CLITC1 INTEGER ,
IN P_CLICLS INTEGER ,
IN P_CLISEX varchar(1) ,
IN P_CLITEL BIGINT ,
IN P_CLITE2 BIGINT ,
IN P_CLITE3 BIGINT ,
IN P_CLIFAX varchar(15) ,
IN P_CLIFA2 varchar(15) ,
IN P_CLIFA3 varchar(15) ,
IN P_CLITC2 INTEGER ,
IN P_CLIRES INTEGER ,
IN P_CLICOR BIGINT ,
IN P_CLITCO varchar(1) ,
IN P_CLIEXC varchar(1) ,
IN P_CLIOBS varchar(50) ,
IN P_CLIREG varchar(1) ,
IN P_CLIOCU varchar(1) ,
IN P_CLIGRU INTEGER ,
IN P_CLIPAS varchar(1) ,
IN P_CLIORD varchar(15) ,
IN P_CLINUM INTEGER ,
IN P_CLICRE varchar(6) ,
IN P_CLITID varchar(1) ,
IN P_CLINAC INTEGER ,
IN P_CLIMEF varchar(10) ,
IN P_CLIESC INTEGER ,
IN P_CLIGID varchar(6) ,
IN P_CLIDPR varchar(16) ,
IN P_CLIDAT BIGINT ,
IN P_CLIVOZ INTEGER ,
IN P_CLIDPD varchar(16) ,
IN P_CLIFEA BIGINT ,
IN P_CLIFEB BIGINT ,
IN P_CLIUSU varchar(10) ,

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
    
        /*
        IF P_CLIEMP IS NOT NULL AND length(P_CLIEMP)>0 THEN
            SET P_CLIEMP = UPPER(TRIM(P_CLIEMP));
            SET WhereClause = WhereClause || ' AND CLIEMP LIKE ''%'|| P_CLIEMP ||'%'' ';
        END IF;
    
        
        IF P_CLIDEL IS NOT NULL AND length(P_CLIDEL)>0 THEN
            SET P_CLIDEL = UPPER(TRIM(P_CLIDEL));
            SET WhereClause = WhereClause || ' AND CLIDEL LIKE ''%'|| P_CLIDEL ||'%'' ';
        END IF;
        */
        
        IF P_CLICLA > 0 THEN
            SET WhereClause = WhereClause || ' AND CLICLA = '|| P_CLICLA ||' ';
        END IF;
    
        
        IF P_CLINIF IS NOT NULL AND length(P_CLINIF)>0 THEN
            SET P_CLINIF = UPPER(TRIM(P_CLINIF));
            SET WhereClause = WhereClause || ' AND CLINIF LIKE ''%'|| P_CLINIF ||'%'' ';
        END IF;
    
        
        IF P_CLIASO > 0 THEN
            SET WhereClause = WhereClause || ' AND CLIASO = '|| P_CLIASO ||' ';
        END IF;
    
        /*
        IF P_CLIANA > 0 THEN
            SET WhereClause = WhereClause || ' AND CLIANA = '|| P_CLIANA ||' ';
        END IF;
        */
        
        IF P_CLINOM IS NOT NULL AND length(P_CLINOM)>0 THEN
            SET P_CLINOM = UPPER(TRIM(P_CLINOM));
            SET WhereClause = WhereClause || ' AND ( CLINOM LIKE ''%'|| P_CLINOM ||'%'' OR CLIAPE LIKE ''%'|| P_CLINOM ||'%'' OR CLIAP2 LIKE ''%'|| P_CLINOM ||'%'' )';
        END IF;
    
        /*
        IF P_CLIAPE IS NOT NULL AND length(P_CLIAPE)>0 THEN
            SET P_CLIAPE = UPPER(TRIM(P_CLIAPE));
            SET WhereClause = WhereClause || ' AND CLIAPE LIKE ''%'|| P_CLIAPE ||'%'' ';
        END IF;
    
        
        IF P_CLIAP2 IS NOT NULL AND length(P_CLIAP2)>0 THEN
            SET P_CLIAP2 = UPPER(TRIM(P_CLIAP2));
            SET WhereClause = WhereClause || ' AND CLIAP2 LIKE ''%'|| P_CLIAP2 ||'%'' ';
        END IF;
    
        
        IF P_CLICAL IS NOT NULL AND length(P_CLICAL)>0 THEN
            SET P_CLICAL = UPPER(TRIM(P_CLICAL));
            SET WhereClause = WhereClause || ' AND CLICAL LIKE ''%'|| P_CLICAL ||'%'' ';
        END IF;
    
        
        IF P_CLIDI1 IS NOT NULL AND length(P_CLIDI1)>0 THEN
            SET P_CLIDI1 = UPPER(TRIM(P_CLIDI1));
            SET WhereClause = WhereClause || ' AND CLIDI1 LIKE ''%'|| P_CLIDI1 ||'%'' ';
        END IF;
    
        
        IF P_CLIDI2 IS NOT NULL AND length(P_CLIDI2)>0 THEN
            SET P_CLIDI2 = UPPER(TRIM(P_CLIDI2));
            SET WhereClause = WhereClause || ' AND CLIDI2 LIKE ''%'|| P_CLIDI2 ||'%'' ';
        END IF;
    
        
        IF P_CLIPOS IS NOT NULL AND length(P_CLIPOS)>0 THEN
            SET P_CLIPOS = UPPER(TRIM(P_CLIPOS));
            SET WhereClause = WhereClause || ' AND CLIPOS LIKE ''%'|| P_CLIPOS ||'%'' ';
        END IF;
    
        
        IF P_CLIPRO IS NOT NULL AND length(P_CLIPRO)>0 THEN
            SET P_CLIPRO = UPPER(TRIM(P_CLIPRO));
            SET WhereClause = WhereClause || ' AND CLIPRO LIKE ''%'|| P_CLIPRO ||'%'' ';
        END IF;
    
        
        IF P_CLIPAI > 0 THEN
            SET WhereClause = WhereClause || ' AND CLIPAI = '|| P_CLIPAI ||' ';
        END IF;
    
        
        IF P_CLIPOB IS NOT NULL AND length(P_CLIPOB)>0 THEN
            SET P_CLIPOB = UPPER(TRIM(P_CLIPOB));
            SET WhereClause = WhereClause || ' AND CLIPOB LIKE ''%'|| P_CLIPOB ||'%'' ';
        END IF;
    
        
        IF P_CLIGES > 0 THEN
            SET WhereClause = WhereClause || ' AND CLIGES = '|| P_CLIGES ||' ';
        END IF;
        */
        
        IF P_CLITC1 > 0 THEN
            SET WhereClause = WhereClause || ' AND CLITC1 = '|| P_CLITC1 ||' ';
        END IF;
    
        
        IF P_CLICLS > 0 THEN
            SET WhereClause = WhereClause || ' AND CLICLS = '|| P_CLICLS ||' ';
        END IF;
    
        /*
        IF P_CLISEX IS NOT NULL AND length(P_CLISEX)>0 THEN
            SET P_CLISEX = UPPER(TRIM(P_CLISEX));
            SET WhereClause = WhereClause || ' AND CLISEX LIKE ''%'|| P_CLISEX ||'%'' ';
        END IF;
    
        
        IF P_CLITEL > 0 THEN
            SET WhereClause = WhereClause || ' AND CLITEL = '|| P_CLITEL ||' ';
        END IF;
    
        
        IF P_CLITE2 > 0 THEN
            SET WhereClause = WhereClause || ' AND CLITE2 = '|| P_CLITE2 ||' ';
        END IF;
    
        
        IF P_CLITE3 > 0 THEN
            SET WhereClause = WhereClause || ' AND CLITE3 = '|| P_CLITE3 ||' ';
        END IF;
    
        
        IF P_CLIFAX IS NOT NULL AND length(P_CLIFAX)>0 THEN
            SET P_CLIFAX = UPPER(TRIM(P_CLIFAX));
            SET WhereClause = WhereClause || ' AND CLIFAX LIKE ''%'|| P_CLIFAX ||'%'' ';
        END IF;
    
        
        IF P_CLIFA2 IS NOT NULL AND length(P_CLIFA2)>0 THEN
            SET P_CLIFA2 = UPPER(TRIM(P_CLIFA2));
            SET WhereClause = WhereClause || ' AND CLIFA2 LIKE ''%'|| P_CLIFA2 ||'%'' ';
        END IF;
    
        
        IF P_CLIFA3 IS NOT NULL AND length(P_CLIFA3)>0 THEN
            SET P_CLIFA3 = UPPER(TRIM(P_CLIFA3));
            SET WhereClause = WhereClause || ' AND CLIFA3 LIKE ''%'|| P_CLIFA3 ||'%'' ';
        END IF;
    
        
        IF P_CLITC2 > 0 THEN
            SET WhereClause = WhereClause || ' AND CLITC2 = '|| P_CLITC2 ||' ';
        END IF;
    
        
        IF P_CLIRES > 0 THEN
            SET WhereClause = WhereClause || ' AND CLIRES = '|| P_CLIRES ||' ';
        END IF;
    
        
        IF P_CLICOR > 0 THEN
            SET WhereClause = WhereClause || ' AND CLICOR = '|| P_CLICOR ||' ';
        END IF;
    
        
        IF P_CLITCO IS NOT NULL AND length(P_CLITCO)>0 THEN
            SET P_CLITCO = UPPER(TRIM(P_CLITCO));
            SET WhereClause = WhereClause || ' AND CLITCO LIKE ''%'|| P_CLITCO ||'%'' ';
        END IF;
    
        
        IF P_CLIEXC IS NOT NULL AND length(P_CLIEXC)>0 THEN
            SET P_CLIEXC = UPPER(TRIM(P_CLIEXC));
            SET WhereClause = WhereClause || ' AND CLIEXC LIKE ''%'|| P_CLIEXC ||'%'' ';
        END IF;
    
        
        IF P_CLIOBS IS NOT NULL AND length(P_CLIOBS)>0 THEN
            SET P_CLIOBS = UPPER(TRIM(P_CLIOBS));
            SET WhereClause = WhereClause || ' AND CLIOBS LIKE ''%'|| P_CLIOBS ||'%'' ';
        END IF;
    
        
        IF P_CLIREG IS NOT NULL AND length(P_CLIREG)>0 THEN
            SET P_CLIREG = UPPER(TRIM(P_CLIREG));
            SET WhereClause = WhereClause || ' AND CLIREG LIKE ''%'|| P_CLIREG ||'%'' ';
        END IF;
    
        
        IF P_CLIOCU IS NOT NULL AND length(P_CLIOCU)>0 THEN
            SET P_CLIOCU = UPPER(TRIM(P_CLIOCU));
            SET WhereClause = WhereClause || ' AND CLIOCU LIKE ''%'|| P_CLIOCU ||'%'' ';
        END IF;
    
        
        IF P_CLIGRU > 0 THEN
            SET WhereClause = WhereClause || ' AND CLIGRU = '|| P_CLIGRU ||' ';
        END IF;
    
        
        IF P_CLIPAS IS NOT NULL AND length(P_CLIPAS)>0 THEN
            SET P_CLIPAS = UPPER(TRIM(P_CLIPAS));
            SET WhereClause = WhereClause || ' AND CLIPAS LIKE ''%'|| P_CLIPAS ||'%'' ';
        END IF;
    
        
        IF P_CLIORD IS NOT NULL AND length(P_CLIORD)>0 THEN
            SET P_CLIORD = UPPER(TRIM(P_CLIORD));
            SET WhereClause = WhereClause || ' AND CLIORD LIKE ''%'|| P_CLIORD ||'%'' ';
        END IF;
    
        
        IF P_CLINUM > 0 THEN
            SET WhereClause = WhereClause || ' AND CLINUM = '|| P_CLINUM ||' ';
        END IF;
    
        
        IF P_CLICRE IS NOT NULL AND length(P_CLICRE)>0 THEN
            SET P_CLICRE = UPPER(TRIM(P_CLICRE));
            SET WhereClause = WhereClause || ' AND CLICRE LIKE ''%'|| P_CLICRE ||'%'' ';
        END IF;
    
        
        IF P_CLITID IS NOT NULL AND length(P_CLITID)>0 THEN
            SET P_CLITID = UPPER(TRIM(P_CLITID));
            SET WhereClause = WhereClause || ' AND CLITID LIKE ''%'|| P_CLITID ||'%'' ';
        END IF;
    
        
        IF P_CLINAC > 0 THEN
            SET WhereClause = WhereClause || ' AND CLINAC = '|| P_CLINAC ||' ';
        END IF;
    
        
        IF P_CLIMEF IS NOT NULL AND length(P_CLIMEF)>0 THEN
            SET P_CLIMEF = UPPER(TRIM(P_CLIMEF));
            SET WhereClause = WhereClause || ' AND CLIMEF LIKE ''%'|| P_CLIMEF ||'%'' ';
        END IF;
    
        
        IF P_CLIESC > 0 THEN
            SET WhereClause = WhereClause || ' AND CLIESC = '|| P_CLIESC ||' ';
        END IF;
    
        
        IF P_CLIGID IS NOT NULL AND length(P_CLIGID)>0 THEN
            SET P_CLIGID = UPPER(TRIM(P_CLIGID));
            SET WhereClause = WhereClause || ' AND CLIGID LIKE ''%'|| P_CLIGID ||'%'' ';
        END IF;
    
        
        IF P_CLIDPR IS NOT NULL AND length(P_CLIDPR)>0 THEN
            SET P_CLIDPR = UPPER(TRIM(P_CLIDPR));
            SET WhereClause = WhereClause || ' AND CLIDPR LIKE ''%'|| P_CLIDPR ||'%'' ';
        END IF;
    
        
        IF P_CLIDAT > 0 THEN
            SET WhereClause = WhereClause || ' AND CLIDAT = '|| P_CLIDAT ||' ';
        END IF;
    
        
        IF P_CLIVOZ > 0 THEN
            SET WhereClause = WhereClause || ' AND CLIVOZ = '|| P_CLIVOZ ||' ';
        END IF;
    
        
        IF P_CLIDPD IS NOT NULL AND length(P_CLIDPD)>0 THEN
            SET P_CLIDPD = UPPER(TRIM(P_CLIDPD));
            SET WhereClause = WhereClause || ' AND CLIDPD LIKE ''%'|| P_CLIDPD ||'%'' ';
        END IF;
    
        
        IF P_CLIFEA > 0 THEN
            SET WhereClause = WhereClause || ' AND CLIFEA = '|| P_CLIFEA ||' ';
        END IF;
    
        
        IF P_CLIFEB > 0 THEN
            SET WhereClause = WhereClause || ' AND CLIFEB = '|| P_CLIFEB ||' ';
        END IF;
    
        
        IF P_CLIUSU IS NOT NULL AND length(P_CLIUSU)>0 THEN
            SET P_CLIUSU = UPPER(TRIM(P_CLIUSU));
            SET WhereClause = WhereClause || ' AND CLIUSU LIKE ''%'|| P_CLIUSU ||'%'' ';
        END IF;
        */

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, CLIEMP ,CLIDEL ,CLICLA ,CLINIF ,CLIASO ,CLIANA ,CLINOM ,CLIAPE ,CLIAP2 ,CLICAL ,CLIDI1 ,CLIDI2 ,CLIPOS ,CLIPRO ,CLIPAI ,CLIPOB ,CLIGES ,CLITC1 ,CLICLS ,CLISEX ,CLITEL ,CLITE2 ,CLITE3 ,CLIFAX ,CLIFA2 ,CLIFA3 ,CLITC2 ,CLIRES ,CLICOR ,CLITCO ,CLIEXC ,CLIOBS ,CLIREG ,CLIOCU ,CLIGRU ,CLIPAS ,CLIORD ,CLINUM ,CLICRE ,CLITID ,CLINAC ,CLIMEF ,CLIESC ,CLIGID ,CLIDPR ,CLIDAT ,CLIVOZ ,CLIDPD ,CLIFEA ,CLIFEB ,CLIUSU  FROM GPDATWEB.AA2MCLI  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT  CLIEMP ,CLIDEL ,CLICLA ,CLINIF ,CLIASO ,CLIANA ,CLINOM ,CLIAPE ,CLIAP2 ,CLICAL ,CLIDI1 ,CLIDI2 ,CLIPOS ,CLIPRO ,CLIPAI ,CLIPOB ,CLIGES ,CLITC1 ,CLICLS ,CLISEX ,CLITEL ,CLITE2 ,CLITE3 ,CLIFAX ,CLIFA2 ,CLIFA3 ,CLITC2 ,CLIRES ,CLICOR ,CLITCO ,CLIEXC ,CLIOBS ,CLIREG ,CLIOCU ,CLIGRU ,CLIPAS ,CLIORD ,CLINUM ,CLICRE ,CLITID ,CLINAC ,CLIMEF ,CLIESC ,CLIGID ,CLIDPR ,CLIDAT ,CLIVOZ ,CLIDPD ,CLIFEA ,CLIFEB ,CLIUSU  FROM  GPDATWEB.AA2MCLI WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT  CLIEMP ,CLIDEL ,CLICLA ,CLINIF ,CLIASO ,CLIANA ,CLINOM ,CLIAPE ,CLIAP2 ,CLICAL ,CLIDI1 ,CLIDI2 ,CLIPOS ,CLIPRO ,CLIPAI ,CLIPOB ,CLIGES ,CLITC1 ,CLICLS ,CLISEX ,CLITEL ,CLITE2 ,CLITE3 ,CLIFAX ,CLIFA2 ,CLIFA3 ,CLITC2 ,CLIRES ,CLICOR ,CLITCO ,CLIEXC ,CLIOBS ,CLIREG ,CLIOCU ,CLIGRU ,CLIPAS ,CLIORD ,CLINUM ,CLICRE ,CLITID ,CLINAC ,CLIMEF ,CLIESC ,CLIGID ,CLIDPR ,CLIDAT ,CLIVOZ ,CLIDPD ,CLIFEA ,CLIFEB ,CLIUSU  FROM  GPDATWEB.AA2MCLI WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    --CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadAa2mcli', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadAa2mcli ('','',0,'',0,0,'','','','','','','','',0,'',0,0,0,'',0,0,0,'','','',0,0,0,'','','','','',0,'','',0,'','',0,'',0,'','',0,0,'',0,0,'', 1, 10, '', '', '', '')
