--DROP  PROCEDURE  GPSQLWEB.procCountInvers

CREATE PROCEDURE  GPSQLWEB.procCountInvers (
    IN P_INVEMP VARCHAR(2),
    IN P_INVDEL VARCHAR(2),
    IN P_INVCLI NUMERIC(7 , 0),
    IN P_INVVAL VARCHAR(12),
    IN P_INVINT NUMERIC(7 , 0),
    IN P_INVCLA VARCHAR(3),
    IN P_INVVEN VARCHAR(1),
    IN P_INVINE NUMERIC(6 , 0),
    IN P_INVVTE NUMERIC(6 , 0),
    IN P_INVPRE DECIMAL(9 , 6),
    IN P_INVINI NUMERIC(6 , 0),
    IN P_INVINA DECIMAL(8 , 0),
    IN P_INVVTO NUMERIC(6 , 0),
    IN P_INVVTA DECIMAL(8 , 0),
    IN P_INVEFI DECIMAL(13 , 2),
    IN P_INVEFF DECIMAL(13 , 2),
    IN P_INVPRC DECIMAL(9 , 6),
    IN P_INV036 VARCHAR(1),
    IN P_INVTIT DECIMAL(27 , 7),
    IN P_INVPME DECIMAL(9 , 6),
    IN P_INVPIN DECIMAL(9 , 6),
    IN P_INVINF DECIMAL(9 , 2),
    IN P_INVRDE VARCHAR(1),
    IN P_INVLIS VARCHAR(1),
    IN P_INVANU VARCHAR(1),
    IN P_INVSIR VARCHAR(1),
    IN P_INVICO DECIMAL(15 , 2),
    IN P_INVNOP DECIMAL(10 , 0),
    IN P_INVPER DECIMAL(2 , 0),
    IN P_INVFDE DECIMAL(13 , 2),
    IN P_INVFUI DECIMAL(6 , 0),
    IN P_INVNTI DECIMAL(10 , 0),
    IN P_INVAPR DECIMAL(13 , 2),
    IN P_INVIBS VARCHAR(1),
    IN P_INVIGC DECIMAL(15 , 2),
    IN P_INVAGD DECIMAL(15 , 2),
    IN P_INVBVI DECIMAL(7 , 0),
    IN P_INVMAR DECIMAL(9 , 6),
    IN P_INVTA1 VARCHAR(3),
    IN P_INVTA2 DECIMAL(5 , 2),
    IN P_INVIAN DECIMAL(13 , 2),
    IN P_INVBOL VARCHAR(1),
    IN P_INVIPP VARCHAR(1),
    IN P_INVVFV VARCHAR(1),
    IN P_INVPRO DECIMAL(2 , 0),
    IN P_INVPEN DECIMAL(15 , 2),
    IN P_INVPRX DECIMAL(6 , 5),
    IN P_INVVAC VARCHAR(12),
    IN P_INVNUC DECIMAL(10 , 0),
    IN P_INVPOP DECIMAL(9 , 6),
    IN P_INVBAD DECIMAL(1 , 0),
    IN P_INVVNO DECIMAL(15 , 2),
    IN P_INVLIQ DECIMAL(6 , 0),
    IN P_INVRES DECIMAL(9 , 6),
    IN P_INVTIM DECIMAL(9 , 6),
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


IF P_INVEMP IS NOT NULL AND length(P_INVEMP)>0 THEN
    SET P_INVEMP = UPPER(TRIM(P_INVEMP));
    SET WhereClause = WhereClause || ' AND INVEMP LIKE ''%'|| P_INVEMP ||'%'' ';
END IF;


IF P_INVDEL IS NOT NULL AND length(P_INVDEL)>0 THEN
    SET P_INVDEL = UPPER(TRIM(P_INVDEL));
    SET WhereClause = WhereClause || ' AND INVDEL LIKE ''%'|| P_INVDEL ||'%'' ';
END IF;


IF P_INVCLI IS NOT NULL AND length(P_INVCLI)>0 THEN
    SET P_INVCLI = UPPER(TRIM(P_INVCLI));
    SET WhereClause = WhereClause || ' AND INVCLI LIKE ''%'|| P_INVCLI ||'%'' ';
END IF;


IF P_INVVAL IS NOT NULL AND length(P_INVVAL)>0 THEN
    SET P_INVVAL = UPPER(TRIM(P_INVVAL));
    SET WhereClause = WhereClause || ' AND INVVAL = '''|| P_INVVAL ||''' ';
END IF;


IF P_INVINT IS NOT NULL AND length(P_INVINT)>0 THEN
    SET P_INVINT = UPPER(TRIM(P_INVINT));
    SET WhereClause = WhereClause || ' AND INVINT LIKE ''%'|| P_INVINT ||'%'' ';
END IF;


IF P_INVCLA IS NOT NULL AND length(P_INVCLA)>0 THEN
    SET P_INVCLA = UPPER(TRIM(P_INVCLA));
    SET WhereClause = WhereClause || ' AND INVCLA LIKE ''%'|| P_INVCLA ||'%'' ';
END IF;


IF P_INVVEN IS NOT NULL AND length(P_INVVEN)>0 THEN
    SET P_INVVEN = UPPER(TRIM(P_INVVEN));
    SET WhereClause = WhereClause || ' AND INVVEN LIKE ''%'|| P_INVVEN ||'%'' ';
END IF;


IF P_INVINE IS NOT NULL AND length(P_INVINE)>0 THEN
    SET P_INVINE = UPPER(TRIM(P_INVINE));
    SET WhereClause = WhereClause || ' AND INVINE LIKE ''%'|| P_INVINE ||'%'' ';
END IF;


IF P_INVVTE IS NOT NULL AND length(P_INVVTE)>0 THEN
    SET P_INVVTE = UPPER(TRIM(P_INVVTE));
    SET WhereClause = WhereClause || ' AND INVVTE LIKE ''%'|| P_INVVTE ||'%'' ';
END IF;


IF P_INVPRE IS NOT NULL AND length(P_INVPRE)>0 THEN
    SET P_INVPRE = UPPER(TRIM(P_INVPRE));
    SET WhereClause = WhereClause || ' AND INVPRE LIKE ''%'|| P_INVPRE ||'%'' ';
END IF;


IF P_INVINI IS NOT NULL AND length(P_INVINI)>0 THEN
    SET P_INVINI = UPPER(TRIM(P_INVINI));
    SET WhereClause = WhereClause || ' AND INVINI LIKE ''%'|| P_INVINI ||'%'' ';
END IF;


IF P_INVINA IS NOT NULL AND length(P_INVINA)>0 THEN
    SET P_INVINA = UPPER(TRIM(P_INVINA));
    SET WhereClause = WhereClause || ' AND INVINA LIKE ''%'|| P_INVINA ||'%'' ';
END IF;


IF P_INVVTO IS NOT NULL AND length(P_INVVTO)>0 THEN
    SET P_INVVTO = UPPER(TRIM(P_INVVTO));
    SET WhereClause = WhereClause || ' AND INVVTO LIKE ''%'|| P_INVVTO ||'%'' ';
END IF;


IF P_INVVTA IS NOT NULL AND length(P_INVVTA)>0 THEN
    SET P_INVVTA = UPPER(TRIM(P_INVVTA));
    SET WhereClause = WhereClause || ' AND INVVTA LIKE ''%'|| P_INVVTA ||'%'' ';
END IF;


IF P_INVEFI IS NOT NULL AND length(P_INVEFI)>0 THEN
    SET P_INVEFI = UPPER(TRIM(P_INVEFI));
    SET WhereClause = WhereClause || ' AND INVEFI LIKE ''%'|| P_INVEFI ||'%'' ';
END IF;


IF P_INVEFF IS NOT NULL AND length(P_INVEFF)>0 THEN
    SET P_INVEFF = UPPER(TRIM(P_INVEFF));
    SET WhereClause = WhereClause || ' AND INVEFF LIKE ''%'|| P_INVEFF ||'%'' ';
END IF;


IF P_INVPRC IS NOT NULL AND length(P_INVPRC)>0 THEN
    SET P_INVPRC = UPPER(TRIM(P_INVPRC));
    SET WhereClause = WhereClause || ' AND INVPRC LIKE ''%'|| P_INVPRC ||'%'' ';
END IF;


IF P_INV036 IS NOT NULL AND length(P_INV036)>0 THEN
    SET P_INV036 = UPPER(TRIM(P_INV036));
    SET WhereClause = WhereClause || ' AND INV036 LIKE ''%'|| P_INV036 ||'%'' ';
END IF;


IF P_INVTIT IS NOT NULL AND length(P_INVTIT)>0 THEN
    SET P_INVTIT = UPPER(TRIM(P_INVTIT));
    SET WhereClause = WhereClause || ' AND INVTIT LIKE ''%'|| P_INVTIT ||'%'' ';
END IF;


IF P_INVPME IS NOT NULL AND length(P_INVPME)>0 THEN
    SET P_INVPME = UPPER(TRIM(P_INVPME));
    SET WhereClause = WhereClause || ' AND INVPME LIKE ''%'|| P_INVPME ||'%'' ';
END IF;


IF P_INVPIN IS NOT NULL AND length(P_INVPIN)>0 THEN
    SET P_INVPIN = UPPER(TRIM(P_INVPIN));
    SET WhereClause = WhereClause || ' AND INVPIN LIKE ''%'|| P_INVPIN ||'%'' ';
END IF;


IF P_INVINF IS NOT NULL AND length(P_INVINF)>0 THEN
    SET P_INVINF = UPPER(TRIM(P_INVINF));
    SET WhereClause = WhereClause || ' AND INVINF LIKE ''%'|| P_INVINF ||'%'' ';
END IF;


IF P_INVRDE IS NOT NULL AND length(P_INVRDE)>0 THEN
    SET P_INVRDE = UPPER(TRIM(P_INVRDE));
    SET WhereClause = WhereClause || ' AND INVRDE LIKE ''%'|| P_INVRDE ||'%'' ';
END IF;


IF P_INVLIS IS NOT NULL AND length(P_INVLIS)>0 THEN
    SET P_INVLIS = UPPER(TRIM(P_INVLIS));
    SET WhereClause = WhereClause || ' AND INVLIS LIKE ''%'|| P_INVLIS ||'%'' ';
END IF;


IF P_INVANU IS NOT NULL AND length(P_INVANU)>0 THEN
    SET P_INVANU = UPPER(P_INVANU);
    SET WhereClause = WhereClause || ' AND INVANU = '''|| P_INVANU ||''' ';
END IF;


IF P_INVSIR IS NOT NULL AND length(P_INVSIR)>0 THEN
    SET P_INVSIR = UPPER(TRIM(P_INVSIR));
    SET WhereClause = WhereClause || ' AND INVSIR LIKE ''%'|| P_INVSIR ||'%'' ';
END IF;


IF P_INVICO IS NOT NULL AND length(P_INVICO)>0 THEN
    SET P_INVICO = UPPER(TRIM(P_INVICO));
    SET WhereClause = WhereClause || ' AND INVICO LIKE ''%'|| P_INVICO ||'%'' ';
END IF;


IF P_INVNOP IS NOT NULL AND length(P_INVNOP)>0 THEN
    SET P_INVNOP = UPPER(TRIM(P_INVNOP));
    SET WhereClause = WhereClause || ' AND INVNOP LIKE ''%'|| P_INVNOP ||'%'' ';
END IF;


IF P_INVPER > 0 THEN
    SET WhereClause = WhereClause || ' AND INVPER = '|| P_INVPER ||' ';
END IF;


IF P_INVFDE IS NOT NULL AND length(P_INVFDE)>0 THEN
    SET P_INVFDE = UPPER(TRIM(P_INVFDE));
    SET WhereClause = WhereClause || ' AND INVFDE LIKE ''%'|| P_INVFDE ||'%'' ';
END IF;


IF P_INVFUI IS NOT NULL AND length(P_INVFUI)>0 THEN
    SET P_INVFUI = UPPER(TRIM(P_INVFUI));
    SET WhereClause = WhereClause || ' AND INVFUI LIKE ''%'|| P_INVFUI ||'%'' ';
END IF;


IF P_INVNTI IS NOT NULL AND length(P_INVNTI)>0 THEN
    SET P_INVNTI = UPPER(TRIM(P_INVNTI));
    SET WhereClause = WhereClause || ' AND INVNTI LIKE ''%'|| P_INVNTI ||'%'' ';
END IF;


IF P_INVAPR IS NOT NULL AND length(P_INVAPR)>0 THEN
    SET P_INVAPR = UPPER(TRIM(P_INVAPR));
    SET WhereClause = WhereClause || ' AND INVAPR LIKE ''%'|| P_INVAPR ||'%'' ';
END IF;


IF P_INVIBS IS NOT NULL AND length(P_INVIBS)>0 THEN
    SET P_INVIBS = UPPER(TRIM(P_INVIBS));
    SET WhereClause = WhereClause || ' AND INVIBS LIKE ''%'|| P_INVIBS ||'%'' ';
END IF;


IF P_INVIGC IS NOT NULL AND length(P_INVIGC)>0 THEN
    SET P_INVIGC = UPPER(TRIM(P_INVIGC));
    SET WhereClause = WhereClause || ' AND INVIGC LIKE ''%'|| P_INVIGC ||'%'' ';
END IF;


IF P_INVAGD IS NOT NULL AND length(P_INVAGD)>0 THEN
    SET P_INVAGD = UPPER(TRIM(P_INVAGD));
    SET WhereClause = WhereClause || ' AND INVAGD LIKE ''%'|| P_INVAGD ||'%'' ';
END IF;


IF P_INVBVI IS NOT NULL AND length(P_INVBVI)>0 THEN
    SET P_INVBVI = UPPER(TRIM(P_INVBVI));
    SET WhereClause = WhereClause || ' AND INVBVI LIKE ''%'|| P_INVBVI ||'%'' ';
END IF;


IF P_INVMAR IS NOT NULL AND length(P_INVMAR)>0 THEN
    SET P_INVMAR = UPPER(TRIM(P_INVMAR));
    SET WhereClause = WhereClause || ' AND INVMAR LIKE ''%'|| P_INVMAR ||'%'' ';
END IF;


IF P_INVTA1 IS NOT NULL AND length(P_INVTA1)>0 THEN
    SET P_INVTA1 = UPPER(TRIM(P_INVTA1));
    SET WhereClause = WhereClause || ' AND INVTA1 LIKE ''%'|| P_INVTA1 ||'%'' ';
END IF;


IF P_INVTA2 IS NOT NULL AND length(P_INVTA2)>0 THEN
    SET P_INVTA2 = UPPER(TRIM(P_INVTA2));
    SET WhereClause = WhereClause || ' AND INVTA2 LIKE ''%'|| P_INVTA2 ||'%'' ';
END IF;


IF P_INVIAN IS NOT NULL AND length(P_INVIAN)>0 THEN
    SET P_INVIAN = UPPER(TRIM(P_INVIAN));
    SET WhereClause = WhereClause || ' AND INVIAN LIKE ''%'|| P_INVIAN ||'%'' ';
END IF;


IF P_INVBOL IS NOT NULL AND length(P_INVBOL)>0 THEN
    SET P_INVBOL = UPPER(TRIM(P_INVBOL));
    SET WhereClause = WhereClause || ' AND INVBOL LIKE ''%'|| P_INVBOL ||'%'' ';
END IF;


IF P_INVIPP IS NOT NULL AND length(P_INVIPP)>0 THEN
    SET P_INVIPP = UPPER(TRIM(P_INVIPP));
    SET WhereClause = WhereClause || ' AND INVIPP LIKE ''%'|| P_INVIPP ||'%'' ';
END IF;


IF P_INVVFV IS NOT NULL AND length(P_INVVFV)>0 THEN
    SET P_INVVFV = UPPER(TRIM(P_INVVFV));
    SET WhereClause = WhereClause || ' AND INVVFV LIKE ''%'|| P_INVVFV ||'%'' ';
END IF;


IF P_INVPRO > 0 THEN
    SET WhereClause = WhereClause || ' AND INVPRO = '|| P_INVPRO ||' ';
END IF;


IF P_INVPEN IS NOT NULL AND length(P_INVPEN)>0 THEN
    SET P_INVPEN = UPPER(TRIM(P_INVPEN));
    SET WhereClause = WhereClause || ' AND INVPEN LIKE ''%'|| P_INVPEN ||'%'' ';
END IF;


IF P_INVPRX IS NOT NULL AND length(P_INVPRX)>0 THEN
    SET P_INVPRX = UPPER(TRIM(P_INVPRX));
    SET WhereClause = WhereClause || ' AND INVPRX LIKE ''%'|| P_INVPRX ||'%'' ';
END IF;


IF P_INVVAC IS NOT NULL AND length(P_INVVAC)>0 THEN
    SET P_INVVAC = UPPER(TRIM(P_INVVAC));
    SET WhereClause = WhereClause || ' AND INVVAC LIKE ''%'|| P_INVVAC ||'%'' ';
END IF;


IF P_INVNUC IS NOT NULL AND length(P_INVNUC)>0 THEN
    SET P_INVNUC = UPPER(TRIM(P_INVNUC));
    SET WhereClause = WhereClause || ' AND INVNUC LIKE ''%'|| P_INVNUC ||'%'' ';
END IF;


IF P_INVPOP IS NOT NULL AND length(P_INVPOP)>0 THEN
    SET P_INVPOP = UPPER(TRIM(P_INVPOP));
    SET WhereClause = WhereClause || ' AND INVPOP LIKE ''%'|| P_INVPOP ||'%'' ';
END IF;


IF P_INVBAD > 0 THEN
    SET WhereClause = WhereClause || ' AND INVBAD = '|| P_INVBAD ||' ';
END IF;


IF P_INVVNO IS NOT NULL AND length(P_INVVNO)>0 THEN
    SET P_INVVNO = UPPER(TRIM(P_INVVNO));
    SET WhereClause = WhereClause || ' AND INVVNO LIKE ''%'|| P_INVVNO ||'%'' ';
END IF;


IF P_INVLIQ IS NOT NULL AND length(P_INVLIQ)>0 THEN
    SET P_INVLIQ = UPPER(TRIM(P_INVLIQ));
    SET WhereClause = WhereClause || ' AND INVLIQ LIKE ''%'|| P_INVLIQ ||'%'' ';
END IF;


IF P_INVRES IS NOT NULL AND length(P_INVRES)>0 THEN
    SET P_INVRES = UPPER(TRIM(P_INVRES));
    SET WhereClause = WhereClause || ' AND INVRES LIKE ''%'|| P_INVRES ||'%'' ';
END IF;


IF P_INVTIM IS NOT NULL AND length(P_INVTIM)>0 THEN
    SET P_INVTIM = UPPER(TRIM(P_INVTIM));
    SET WhereClause = WhereClause || ' AND INVTIM LIKE ''%'|| P_INVTIM ||'%'' ';
END IF;

Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.INVERS  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountInvers', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountInvers('','',0,'',0,'','',0,0,'',0,0,0,0,'','','','','','','','','','','','','',0,0,'',0,0,'','','','',0,'','','','','','','',0,'','','',0,'',0,'',0,'','', '', '', '')
