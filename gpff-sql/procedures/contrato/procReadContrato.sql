--<ScriptOptions statementTerminator="GOX"/>
SET SCHEMA = "GPDATWEB"
GOX
SET PATH "QSYS","QSYS2","SYSPROC","SYSIBMADM","GPDATWEB"
GOX

--DROP  PROCEDURE  procReadContrato

CREATE PROCEDURE  procReadContrato (
    IN P_ROWID BIGINT,
    IN P_CONEMP VARCHAR(2),
    IN P_CONDEL VARCHAR(2),
    IN P_CTNFMT DECIMAL(3 , 0),
    IN P_NUCONT DECIMAL(8 , 0),
    IN P_CLICLA NUMERIC(7 , 0),
    IN P_DATFID DECIMAL(7 , 0),
    IN P_DATGES DECIMAL(7 , 0),
    IN P_DATFOP DECIMAL(8 , 0),
    IN P_DATFVL DECIMAL(8 , 0),
    IN P_DATFEU DECIMAL(8 , 0),
    IN P_DATFEI DECIMAL(8 , 0),
    IN P_FECVEN DECIMAL(8 , 0),
    IN P_FECSYS DECIMAL(8 , 0),
    IN P_DATPRM DECIMAL(5 , 2),
    IN P_DATMAX DECIMAL(2 , 0),
    IN P_DATINT DECIMAL(5 , 2),
    IN P_DATMIN DECIMAL(12 , 2),
    IN P_DATMAE DECIMAL(12 , 2),
    IN P_DATMNT DECIMAL(14 , 2),
    IN P_DATMTA DECIMAL(14 , 2),
    IN P_DATGA1 DECIMAL(5 , 2),
    IN P_DATGA2 DECIMAL(12 , 2),
    IN P_DATGA3 DECIMAL(12 , 2),
    IN P_DATDE1 DECIMAL(5 , 2),
    IN P_DATDE2 DECIMAL(12 , 2),
    IN P_DATDE3 DECIMAL(12 , 2),
    IN P_DATDIC DECIMAL(2 , 0),
    IN P_DATDIS DECIMAL(2 , 0),
    IN P_DATMES DECIMAL(2 , 0),
    IN P_DATDIA DECIMAL(2 , 0),
    IN P_DATMEA DECIMAL(2 , 0),
    IN P_DATPCC DECIMAL(5 , 2),
    IN P_DATREB VARCHAR(1),
    IN P_DATPER VARCHAR(1),
    IN P_CTNUSO VARCHAR(1),
    IN P_CTNANU VARCHAR(1),
    IN P_EMPRE VARCHAR(50),
    IN P_CEEMP VARCHAR(71),
    IN P_COSDIV DECIMAL(3 , 0),
    IN P_CONMNT DECIMAL(14 , 2),
    IN P_MNTCO1 DECIMAL(9 , 2),
    IN P_NTAB DECIMAL(2 , 0),
    IN P_FIJVAR VARCHAR(1),
    IN P_MNTCOM DECIMAL(9 , 2),
    IN P_COMFIJ DECIMAL(10 , 2),
    IN P_COMAPC DECIMAL(10 , 2),
    IN P_COMAPF DECIMAL(10 , 2),
    IN P_COMCCU DECIMAL(9 , 6),
    IN P_RENOV VARCHAR(1),
    IN P_FRMPA DECIMAL(2 , 0),
    IN P_RP VARCHAR(30),
    IN P_NOMRE VARCHAR(50),
    IN P_CEDRE VARCHAR(12),
    IN P_ECRE VARCHAR(10),
    IN P_PRORE VARCHAR(50),
    IN P_POBRE VARCHAR(50),
    IN P_CERE VARCHAR(71),
    IN P_FOLRE VARCHAR(50),
    IN P_FOLRE1 VARCHAR(50),
    IN P_TOMRE VARCHAR(50),
    IN P_TOMRE1 VARCHAR(50),
    IN P_ASIRE VARCHAR(50),
    IN P_ASIRE1 VARCHAR(50),
    IN P_OBJ1 VARCHAR(50),
    IN P_OBJ2 VARCHAR(50),
    IN P_OBJ3 VARCHAR(50),
    IN P_OBJ4 VARCHAR(50),
    IN P_OBJ5 VARCHAR(50),
    IN P_FECPRO DECIMAL(8 , 0),
    IN P_FECEJE DECIMAL(8 , 0),
    IN P_AUTORI VARCHAR(1),
    IN P_PEAUT1 VARCHAR(50),
    IN P_COAUT1 VARCHAR(1),
    IN P_CEDUL1 VARCHAR(12),
    IN P_PEAUT2 VARCHAR(50),
    IN P_COAUT2 VARCHAR(1),
    IN P_CEDUL2 VARCHAR(12),
    IN P_PEAUT3 VARCHAR(50),
    IN P_COAUT3 VARCHAR(1),
    IN P_CEDUL3 VARCHAR(12),
    IN P_USUARI VARCHAR(10),
    IN P_COMI DECIMAL(5 , 2),
    IN P_NUMCTA VARCHAR(20),
    IN P_SECCI VARCHAR(30),
    IN P_VIGEN VARCHAR(30),
    IN P_NUMOFI DECIMAL(7 , 0),
    IN P_CANT1 VARCHAR(50),
    IN P_CANT2 VARCHAR(50),
    IN P_LINCO1 VARCHAR(32),
    IN P_LINCO2 VARCHAR(32),
    IN P_OPCION VARCHAR(1),
    IN P_DIAS DECIMAL(3 , 0),
    IN P_DIA1 DECIMAL(3 , 0),
    IN P_LIN1 VARCHAR(70),
    IN P_LIN2 VARCHAR(70),
    IN P_LIN3 VARCHAR(70),
    IN P_LIN4 VARCHAR(70),
    IN P_LIN5 VARCHAR(70),
    IN P_LIN6 VARCHAR(70),
    IN P_LIN7 VARCHAR(70),
    IN P_LIN8 VARCHAR(70),
    IN P_LIN9 VARCHAR(70),
    IN P_LI1 VARCHAR(55),
    IN P_LI2 VARCHAR(70),
    IN P_LI10 VARCHAR(70),
    IN P_LI11 VARCHAR(70),
    IN P_LI12 VARCHAR(25),
    IN P_LIN13 VARCHAR(70),
    IN P_LIN14 VARCHAR(70),
    IN P_FORPAG VARCHAR(50),
    IN P_INDIVI VARCHAR(1),
    IN P_CONJUN VARCHAR(1),
    IN P_CTEI VARCHAR(1),
    IN P_AHOI VARCHAR(1),
    IN P_CHEI VARCHAR(1),
    IN P_REII VARCHAR(1),
    IN P_CTEP VARCHAR(1),
    IN P_AHOP VARCHAR(1),
    IN P_CHEP VARCHAR(1),
    IN P_REIP VARCHAR(1),
    IN P_NCTEI VARCHAR(20),
    IN P_NAHOI VARCHAR(20),
    IN P_NCTEP VARCHAR(20),
    IN P_NAHOP VARCHAR(20),
    IN P_MATDEP VARCHAR(67),
    IN P_FIDE VARCHAR(50),
    IN P_ECFIDE VARCHAR(10),
    IN P_PRFIDE VARCHAR(50),
    IN P_POFIDE VARCHAR(50),
    IN P_CEFIDE VARCHAR(71),
    IN P_NFIDE DECIMAL(8 , 0),
    IN P_FID2 VARCHAR(50),
    IN P_ECFID2 VARCHAR(10),
    IN P_PRFID2 VARCHAR(50),
    IN P_POFID2 VARCHAR(50),
    IN P_CEFID2 VARCHAR(71),
    IN P_NFID2 DECIMAL(8 , 0),
    IN P_BENE1 VARCHAR(50),
    IN P_ECBEN1 VARCHAR(10),
    IN P_PRBEN1 VARCHAR(50),
    IN P_POBEN1 VARCHAR(50),
    IN P_CEBEN1 VARCHAR(71),
    IN P_NBEN1 DECIMAL(8 , 0),
    IN P_BENE2 VARCHAR(50),
    IN P_ECBEN2 VARCHAR(10),
    IN P_PRBEN2 VARCHAR(50),
    IN P_POBEN2 VARCHAR(50),
    IN P_CEBEN2 VARCHAR(71),
    IN P_NBEN2 DECIMAL(8 , 0),
    IN P_BENE3 VARCHAR(50),
    IN P_ECBEN3 VARCHAR(10),
    IN P_PRBEN3 VARCHAR(50),
    IN P_POBEN3 VARCHAR(50),
    IN P_CEBEN3 VARCHAR(71),
    IN P_NBEN3 DECIMAL(8 , 0),
    IN P_BENE4 VARCHAR(50),
    IN P_ECBEN4 VARCHAR(10),
    IN P_PRBEN4 VARCHAR(50),
    IN P_POBEN4 VARCHAR(50),
    IN P_CEBEN4 VARCHAR(71),
    IN P_NBEN4 DECIMAL(8 , 0),
    IN P_BENE5 VARCHAR(50),
    IN P_ECBEN5 VARCHAR(10),
    IN P_PRBEN5 VARCHAR(50),
    IN P_POBEN5 VARCHAR(50),
    IN P_CEBEN5 VARCHAR(71),
    IN P_NBEN5 DECIMAL(8 , 0),
    IN P_BENE6 VARCHAR(50),
    IN P_ECBEN6 VARCHAR(10),
    IN P_PRBEN6 VARCHAR(50),
    IN P_POBEN6 VARCHAR(50),
    IN P_CEBEN6 VARCHAR(71),
    IN P_NBEN6 DECIMAL(8 , 0),
    IN P_NOMASE VARCHAR(50),
    IN P_DIRASE VARCHAR(50),
    IN P_EDADVI DECIMAL(2 , 0),
    IN P_HONORA VARCHAR(50),
    IN P_PRCA VARCHAR(50),
    IN P_PRCP VARCHAR(50),
    IN P_AUTOR1 VARCHAR(50),
    IN P_ECAUT1 VARCHAR(10),
    IN P_PRAUT1 VARCHAR(50),
    IN P_POAUT1 VARCHAR(50),
    IN P_CEAUT1 VARCHAR(71),
    IN P_AUTOR2 VARCHAR(50),
    IN P_ECAUT2 VARCHAR(10),
    IN P_PRAUT2 VARCHAR(50),
    IN P_POAUT2 VARCHAR(50),
    IN P_CEAUT2 VARCHAR(71),
    IN P_AUTOR3 VARCHAR(50),
    IN P_ECAUT3 VARCHAR(10),
    IN P_PRAUT3 VARCHAR(50),
    IN P_POAUT3 VARCHAR(50),
    IN P_CEAUT3 VARCHAR(71),
    IN P_NUMAPO DECIMAL(2 , 0),
    IN P_CONFFI DECIMAL(6 , 0),
    IN P_CONIMP DECIMAL(9 , 2),
    IN P_CONPRC DECIMAL(9 , 6),
    IN P_ENVIO VARCHAR(20),
    IN P_GESCOD DECIMAL(2 , 0),
    IN P_COMAPO DECIMAL(9 , 6),
    IN P_COMRET DECIMAL(9 , 6),
    IN P_COMFIN DECIMAL(9 , 6),
    IN P_NFALI VARCHAR(20),
    IN P_NFALP VARCHAR(20),
    IN P_ICOAPO DECIMAL(15 , 2),
    IN P_ICORET DECIMAL(15 , 2),
    IN P_ICOFIN DECIMAL(15 , 2),
    IN P_CLICON DECIMAL(2 , 0),
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
            SET WhereClause = WhereClause || ' AND RRN() =' || P_ROWID ;
        END IF;
        
        IF P_CONEMP IS NOT NULL AND length(P_CONEMP)>0 THEN
            SET P_CONEMP = UPPER(TRIM(P_CONEMP));
            SET WhereClause = WhereClause || ' AND CONEMP LIKE ''%'|| P_CONEMP ||'%'' ';
        END IF;
    
        
        IF P_CONDEL IS NOT NULL AND length(P_CONDEL)>0 THEN
            SET P_CONDEL = UPPER(TRIM(P_CONDEL));
            SET WhereClause = WhereClause || ' AND CONDEL LIKE ''%'|| P_CONDEL ||'%'' ';
        END IF;
    
        
        IF P_CTNFMT > 0 THEN
            SET WhereClause = WhereClause || ' AND CTNFMT = '|| P_CTNFMT ||' ';
        END IF;
    
        
        IF P_NUCONT > 0 THEN
            SET WhereClause = WhereClause || ' AND NUCONT = '|| P_NUCONT ||' ';
        END IF;
    
        
        IF P_CLICLA > 0 THEN
            SET WhereClause = WhereClause || ' AND CLICLA = '|| P_CLICLA ||' ';
        END IF;
    
        
        IF P_DATFID > 0 THEN
            SET WhereClause = WhereClause || ' AND DATFID = '|| P_DATFID ||' ';
        END IF;
    
        
        IF P_DATGES > 0 THEN
            SET WhereClause = WhereClause || ' AND DATGES = '|| P_DATGES ||' ';
        END IF;
    
        
        IF P_DATFOP > 0 THEN
            SET WhereClause = WhereClause || ' AND DATFOP = '|| P_DATFOP ||' ';
        END IF;
    
        
        IF P_DATFVL > 0 THEN
            SET WhereClause = WhereClause || ' AND DATFVL = '|| P_DATFVL ||' ';
        END IF;
    
        
        IF P_DATFEU > 0 THEN
            SET WhereClause = WhereClause || ' AND DATFEU = '|| P_DATFEU ||' ';
        END IF;
    
        
        IF P_DATFEI > 0 THEN
            SET WhereClause = WhereClause || ' AND DATFEI = '|| P_DATFEI ||' ';
        END IF;
    
        
        IF P_FECVEN > 0 THEN
            SET WhereClause = WhereClause || ' AND FECVEN = '|| P_FECVEN ||' ';
        END IF;
    
        
        IF P_FECSYS > 0 THEN
            SET WhereClause = WhereClause || ' AND FECSYS = '|| P_FECSYS ||' ';
        END IF;
    
        
        IF P_DATPRM IS NOT NULL AND length(P_DATPRM)>0 THEN
            SET P_DATPRM = UPPER(TRIM(P_DATPRM));
            SET WhereClause = WhereClause || ' AND DATPRM LIKE ''%'|| P_DATPRM ||'%'' ';
        END IF;
    
        
        IF P_DATMAX > 0 THEN
            SET WhereClause = WhereClause || ' AND DATMAX = '|| P_DATMAX ||' ';
        END IF;
    
        
        IF P_DATINT IS NOT NULL AND length(P_DATINT)>0 THEN
            SET P_DATINT = UPPER(TRIM(P_DATINT));
            SET WhereClause = WhereClause || ' AND DATINT LIKE ''%'|| P_DATINT ||'%'' ';
        END IF;
    
        
        IF P_DATMIN IS NOT NULL AND length(P_DATMIN)>0 THEN
            SET P_DATMIN = UPPER(TRIM(P_DATMIN));
            SET WhereClause = WhereClause || ' AND DATMIN LIKE ''%'|| P_DATMIN ||'%'' ';
        END IF;
    
        
        IF P_DATMAE IS NOT NULL AND length(P_DATMAE)>0 THEN
            SET P_DATMAE = UPPER(TRIM(P_DATMAE));
            SET WhereClause = WhereClause || ' AND DATMAE LIKE ''%'|| P_DATMAE ||'%'' ';
        END IF;
    
        
        IF P_DATMNT IS NOT NULL AND length(P_DATMNT)>0 THEN
            SET P_DATMNT = UPPER(TRIM(P_DATMNT));
            SET WhereClause = WhereClause || ' AND DATMNT LIKE ''%'|| P_DATMNT ||'%'' ';
        END IF;
    
        
        IF P_DATMTA IS NOT NULL AND length(P_DATMTA)>0 THEN
            SET P_DATMTA = UPPER(TRIM(P_DATMTA));
            SET WhereClause = WhereClause || ' AND DATMTA LIKE ''%'|| P_DATMTA ||'%'' ';
        END IF;
    
        
        IF P_DATGA1 IS NOT NULL AND length(P_DATGA1)>0 THEN
            SET P_DATGA1 = UPPER(TRIM(P_DATGA1));
            SET WhereClause = WhereClause || ' AND DATGA1 LIKE ''%'|| P_DATGA1 ||'%'' ';
        END IF;
    
        
        IF P_DATGA2 IS NOT NULL AND length(P_DATGA2)>0 THEN
            SET P_DATGA2 = UPPER(TRIM(P_DATGA2));
            SET WhereClause = WhereClause || ' AND DATGA2 LIKE ''%'|| P_DATGA2 ||'%'' ';
        END IF;
    
        
        IF P_DATGA3 IS NOT NULL AND length(P_DATGA3)>0 THEN
            SET P_DATGA3 = UPPER(TRIM(P_DATGA3));
            SET WhereClause = WhereClause || ' AND DATGA3 LIKE ''%'|| P_DATGA3 ||'%'' ';
        END IF;
    
        
        IF P_DATDE1 IS NOT NULL AND length(P_DATDE1)>0 THEN
            SET P_DATDE1 = UPPER(TRIM(P_DATDE1));
            SET WhereClause = WhereClause || ' AND DATDE1 LIKE ''%'|| P_DATDE1 ||'%'' ';
        END IF;
    
        
        IF P_DATDE2 IS NOT NULL AND length(P_DATDE2)>0 THEN
            SET P_DATDE2 = UPPER(TRIM(P_DATDE2));
            SET WhereClause = WhereClause || ' AND DATDE2 LIKE ''%'|| P_DATDE2 ||'%'' ';
        END IF;
    
        
        IF P_DATDE3 IS NOT NULL AND length(P_DATDE3)>0 THEN
            SET P_DATDE3 = UPPER(TRIM(P_DATDE3));
            SET WhereClause = WhereClause || ' AND DATDE3 LIKE ''%'|| P_DATDE3 ||'%'' ';
        END IF;
    
        
        IF P_DATDIC > 0 THEN
            SET WhereClause = WhereClause || ' AND DATDIC = '|| P_DATDIC ||' ';
        END IF;
    
        
        IF P_DATDIS > 0 THEN
            SET WhereClause = WhereClause || ' AND DATDIS = '|| P_DATDIS ||' ';
        END IF;
    
        
        IF P_DATMES > 0 THEN
            SET WhereClause = WhereClause || ' AND DATMES = '|| P_DATMES ||' ';
        END IF;
    
        
        IF P_DATDIA > 0 THEN
            SET WhereClause = WhereClause || ' AND DATDIA = '|| P_DATDIA ||' ';
        END IF;
    
        
        IF P_DATMEA > 0 THEN
            SET WhereClause = WhereClause || ' AND DATMEA = '|| P_DATMEA ||' ';
        END IF;
    
        
        IF P_DATPCC IS NOT NULL AND length(P_DATPCC)>0 THEN
            SET P_DATPCC = UPPER(TRIM(P_DATPCC));
            SET WhereClause = WhereClause || ' AND DATPCC LIKE ''%'|| P_DATPCC ||'%'' ';
        END IF;
    
        
        IF P_DATREB IS NOT NULL AND length(P_DATREB)>0 THEN
            SET P_DATREB = UPPER(TRIM(P_DATREB));
            SET WhereClause = WhereClause || ' AND DATREB LIKE ''%'|| P_DATREB ||'%'' ';
        END IF;
    
        
        IF P_DATPER IS NOT NULL AND length(P_DATPER)>0 THEN
            SET P_DATPER = UPPER(TRIM(P_DATPER));
            SET WhereClause = WhereClause || ' AND DATPER LIKE ''%'|| P_DATPER ||'%'' ';
        END IF;
    
        
        IF P_CTNUSO IS NOT NULL AND length(P_CTNUSO)>0 THEN
            SET P_CTNUSO = UPPER(TRIM(P_CTNUSO));
            SET WhereClause = WhereClause || ' AND CTNUSO LIKE ''%'|| P_CTNUSO ||'%'' ';
        END IF;
    
        
        IF P_CTNANU IS NOT NULL AND length(P_CTNANU)>0 THEN
            SET P_CTNANU = UPPER(TRIM(P_CTNANU));
            SET WhereClause = WhereClause || ' AND CTNANU LIKE ''%'|| P_CTNANU ||'%'' ';
        END IF;
    
        
        IF P_EMPRE IS NOT NULL AND length(P_EMPRE)>0 THEN
            SET P_EMPRE = UPPER(TRIM(P_EMPRE));
            SET WhereClause = WhereClause || ' AND EMPRE LIKE ''%'|| P_EMPRE ||'%'' ';
        END IF;
    
        
        IF P_CEEMP IS NOT NULL AND length(P_CEEMP)>0 THEN
            SET P_CEEMP = UPPER(TRIM(P_CEEMP));
            SET WhereClause = WhereClause || ' AND CEEMP LIKE ''%'|| P_CEEMP ||'%'' ';
        END IF;
    
        
        IF P_COSDIV > 0 THEN
            SET WhereClause = WhereClause || ' AND COSDIV = '|| P_COSDIV ||' ';
        END IF;
    
        
        IF P_CONMNT IS NOT NULL AND length(P_CONMNT)>0 THEN
            SET P_CONMNT = UPPER(TRIM(P_CONMNT));
            SET WhereClause = WhereClause || ' AND CONMNT LIKE ''%'|| P_CONMNT ||'%'' ';
        END IF;
    
        
        IF P_MNTCO1 IS NOT NULL AND length(P_MNTCO1)>0 THEN
            SET P_MNTCO1 = UPPER(TRIM(P_MNTCO1));
            SET WhereClause = WhereClause || ' AND MNTCO1 LIKE ''%'|| P_MNTCO1 ||'%'' ';
        END IF;
    
        
        IF P_NTAB > 0 THEN
            SET WhereClause = WhereClause || ' AND NTAB = '|| P_NTAB ||' ';
        END IF;
    
        
        IF P_FIJVAR IS NOT NULL AND length(P_FIJVAR)>0 THEN
            SET P_FIJVAR = UPPER(TRIM(P_FIJVAR));
            SET WhereClause = WhereClause || ' AND FIJVAR LIKE ''%'|| P_FIJVAR ||'%'' ';
        END IF;
    
        
        IF P_MNTCOM IS NOT NULL AND length(P_MNTCOM)>0 THEN
            SET P_MNTCOM = UPPER(TRIM(P_MNTCOM));
            SET WhereClause = WhereClause || ' AND MNTCOM LIKE ''%'|| P_MNTCOM ||'%'' ';
        END IF;
    
        
        IF P_COMFIJ IS NOT NULL AND length(P_COMFIJ)>0 THEN
            SET P_COMFIJ = UPPER(TRIM(P_COMFIJ));
            SET WhereClause = WhereClause || ' AND COMFIJ LIKE ''%'|| P_COMFIJ ||'%'' ';
        END IF;
    
        
        IF P_COMAPC IS NOT NULL AND length(P_COMAPC)>0 THEN
            SET P_COMAPC = UPPER(TRIM(P_COMAPC));
            SET WhereClause = WhereClause || ' AND COMAPC LIKE ''%'|| P_COMAPC ||'%'' ';
        END IF;
    
        
        IF P_COMAPF IS NOT NULL AND length(P_COMAPF)>0 THEN
            SET P_COMAPF = UPPER(TRIM(P_COMAPF));
            SET WhereClause = WhereClause || ' AND COMAPF LIKE ''%'|| P_COMAPF ||'%'' ';
        END IF;
    
        
        IF P_COMCCU IS NOT NULL AND length(P_COMCCU)>0 THEN
            SET P_COMCCU = UPPER(TRIM(P_COMCCU));
            SET WhereClause = WhereClause || ' AND COMCCU LIKE ''%'|| P_COMCCU ||'%'' ';
        END IF;
    
        
        IF P_RENOV IS NOT NULL AND length(P_RENOV)>0 THEN
            SET P_RENOV = UPPER(TRIM(P_RENOV));
            SET WhereClause = WhereClause || ' AND RENOV LIKE ''%'|| P_RENOV ||'%'' ';
        END IF;
    
        
        IF P_FRMPA > 0 THEN
            SET WhereClause = WhereClause || ' AND FRMPA = '|| P_FRMPA ||' ';
        END IF;
    
        
        IF P_RP IS NOT NULL AND length(P_RP)>0 THEN
            SET P_RP = UPPER(TRIM(P_RP));
            SET WhereClause = WhereClause || ' AND RP LIKE ''%'|| P_RP ||'%'' ';
        END IF;
    
        
        IF P_NOMRE IS NOT NULL AND length(P_NOMRE)>0 THEN
            SET P_NOMRE = UPPER(TRIM(P_NOMRE));
            SET WhereClause = WhereClause || ' AND NOMRE LIKE ''%'|| P_NOMRE ||'%'' ';
        END IF;
    
        
        IF P_CEDRE IS NOT NULL AND length(P_CEDRE)>0 THEN
            SET P_CEDRE = UPPER(TRIM(P_CEDRE));
            SET WhereClause = WhereClause || ' AND CEDRE LIKE ''%'|| P_CEDRE ||'%'' ';
        END IF;
    
        
        IF P_ECRE IS NOT NULL AND length(P_ECRE)>0 THEN
            SET P_ECRE = UPPER(TRIM(P_ECRE));
            SET WhereClause = WhereClause || ' AND ECRE LIKE ''%'|| P_ECRE ||'%'' ';
        END IF;
    
        
        IF P_PRORE IS NOT NULL AND length(P_PRORE)>0 THEN
            SET P_PRORE = UPPER(TRIM(P_PRORE));
            SET WhereClause = WhereClause || ' AND PRORE LIKE ''%'|| P_PRORE ||'%'' ';
        END IF;
    
        
        IF P_POBRE IS NOT NULL AND length(P_POBRE)>0 THEN
            SET P_POBRE = UPPER(TRIM(P_POBRE));
            SET WhereClause = WhereClause || ' AND POBRE LIKE ''%'|| P_POBRE ||'%'' ';
        END IF;
    
        
        IF P_CERE IS NOT NULL AND length(P_CERE)>0 THEN
            SET P_CERE = UPPER(TRIM(P_CERE));
            SET WhereClause = WhereClause || ' AND CERE LIKE ''%'|| P_CERE ||'%'' ';
        END IF;
    
        
        IF P_FOLRE IS NOT NULL AND length(P_FOLRE)>0 THEN
            SET P_FOLRE = UPPER(TRIM(P_FOLRE));
            SET WhereClause = WhereClause || ' AND FOLRE LIKE ''%'|| P_FOLRE ||'%'' ';
        END IF;
    
        
        IF P_FOLRE1 IS NOT NULL AND length(P_FOLRE1)>0 THEN
            SET P_FOLRE1 = UPPER(TRIM(P_FOLRE1));
            SET WhereClause = WhereClause || ' AND FOLRE1 LIKE ''%'|| P_FOLRE1 ||'%'' ';
        END IF;
    
        
        IF P_TOMRE IS NOT NULL AND length(P_TOMRE)>0 THEN
            SET P_TOMRE = UPPER(TRIM(P_TOMRE));
            SET WhereClause = WhereClause || ' AND TOMRE LIKE ''%'|| P_TOMRE ||'%'' ';
        END IF;
    
        
        IF P_TOMRE1 IS NOT NULL AND length(P_TOMRE1)>0 THEN
            SET P_TOMRE1 = UPPER(TRIM(P_TOMRE1));
            SET WhereClause = WhereClause || ' AND TOMRE1 LIKE ''%'|| P_TOMRE1 ||'%'' ';
        END IF;
    
        
        IF P_ASIRE IS NOT NULL AND length(P_ASIRE)>0 THEN
            SET P_ASIRE = UPPER(TRIM(P_ASIRE));
            SET WhereClause = WhereClause || ' AND ASIRE LIKE ''%'|| P_ASIRE ||'%'' ';
        END IF;
    
        
        IF P_ASIRE1 IS NOT NULL AND length(P_ASIRE1)>0 THEN
            SET P_ASIRE1 = UPPER(TRIM(P_ASIRE1));
            SET WhereClause = WhereClause || ' AND ASIRE1 LIKE ''%'|| P_ASIRE1 ||'%'' ';
        END IF;
    
        
        IF P_OBJ1 IS NOT NULL AND length(P_OBJ1)>0 THEN
            SET P_OBJ1 = UPPER(TRIM(P_OBJ1));
            SET WhereClause = WhereClause || ' AND OBJ1 LIKE ''%'|| P_OBJ1 ||'%'' ';
        END IF;
    
        
        IF P_OBJ2 IS NOT NULL AND length(P_OBJ2)>0 THEN
            SET P_OBJ2 = UPPER(TRIM(P_OBJ2));
            SET WhereClause = WhereClause || ' AND OBJ2 LIKE ''%'|| P_OBJ2 ||'%'' ';
        END IF;
    
        
        IF P_OBJ3 IS NOT NULL AND length(P_OBJ3)>0 THEN
            SET P_OBJ3 = UPPER(TRIM(P_OBJ3));
            SET WhereClause = WhereClause || ' AND OBJ3 LIKE ''%'|| P_OBJ3 ||'%'' ';
        END IF;
    
        
        IF P_OBJ4 IS NOT NULL AND length(P_OBJ4)>0 THEN
            SET P_OBJ4 = UPPER(TRIM(P_OBJ4));
            SET WhereClause = WhereClause || ' AND OBJ4 LIKE ''%'|| P_OBJ4 ||'%'' ';
        END IF;
    
        
        IF P_OBJ5 IS NOT NULL AND length(P_OBJ5)>0 THEN
            SET P_OBJ5 = UPPER(TRIM(P_OBJ5));
            SET WhereClause = WhereClause || ' AND OBJ5 LIKE ''%'|| P_OBJ5 ||'%'' ';
        END IF;
    
        
        IF P_FECPRO > 0 THEN
            SET WhereClause = WhereClause || ' AND FECPRO = '|| P_FECPRO ||' ';
        END IF;
    
        
        IF P_FECEJE > 0 THEN
            SET WhereClause = WhereClause || ' AND FECEJE = '|| P_FECEJE ||' ';
        END IF;
    
        
        IF P_AUTORI IS NOT NULL AND length(P_AUTORI)>0 THEN
            SET P_AUTORI = UPPER(TRIM(P_AUTORI));
            SET WhereClause = WhereClause || ' AND AUTORI LIKE ''%'|| P_AUTORI ||'%'' ';
        END IF;
    
        
        IF P_PEAUT1 IS NOT NULL AND length(P_PEAUT1)>0 THEN
            SET P_PEAUT1 = UPPER(TRIM(P_PEAUT1));
            SET WhereClause = WhereClause || ' AND PEAUT1 LIKE ''%'|| P_PEAUT1 ||'%'' ';
        END IF;
    
        
        IF P_COAUT1 IS NOT NULL AND length(P_COAUT1)>0 THEN
            SET P_COAUT1 = UPPER(TRIM(P_COAUT1));
            SET WhereClause = WhereClause || ' AND COAUT1 LIKE ''%'|| P_COAUT1 ||'%'' ';
        END IF;
    
        
        IF P_CEDUL1 IS NOT NULL AND length(P_CEDUL1)>0 THEN
            SET P_CEDUL1 = UPPER(TRIM(P_CEDUL1));
            SET WhereClause = WhereClause || ' AND CEDUL1 LIKE ''%'|| P_CEDUL1 ||'%'' ';
        END IF;
    
        
        IF P_PEAUT2 IS NOT NULL AND length(P_PEAUT2)>0 THEN
            SET P_PEAUT2 = UPPER(TRIM(P_PEAUT2));
            SET WhereClause = WhereClause || ' AND PEAUT2 LIKE ''%'|| P_PEAUT2 ||'%'' ';
        END IF;
    
        
        IF P_COAUT2 IS NOT NULL AND length(P_COAUT2)>0 THEN
            SET P_COAUT2 = UPPER(TRIM(P_COAUT2));
            SET WhereClause = WhereClause || ' AND COAUT2 LIKE ''%'|| P_COAUT2 ||'%'' ';
        END IF;
    
        
        IF P_CEDUL2 IS NOT NULL AND length(P_CEDUL2)>0 THEN
            SET P_CEDUL2 = UPPER(TRIM(P_CEDUL2));
            SET WhereClause = WhereClause || ' AND CEDUL2 LIKE ''%'|| P_CEDUL2 ||'%'' ';
        END IF;
    
        
        IF P_PEAUT3 IS NOT NULL AND length(P_PEAUT3)>0 THEN
            SET P_PEAUT3 = UPPER(TRIM(P_PEAUT3));
            SET WhereClause = WhereClause || ' AND PEAUT3 LIKE ''%'|| P_PEAUT3 ||'%'' ';
        END IF;
    
        
        IF P_COAUT3 IS NOT NULL AND length(P_COAUT3)>0 THEN
            SET P_COAUT3 = UPPER(TRIM(P_COAUT3));
            SET WhereClause = WhereClause || ' AND COAUT3 LIKE ''%'|| P_COAUT3 ||'%'' ';
        END IF;
    
        
        IF P_CEDUL3 IS NOT NULL AND length(P_CEDUL3)>0 THEN
            SET P_CEDUL3 = UPPER(TRIM(P_CEDUL3));
            SET WhereClause = WhereClause || ' AND CEDUL3 LIKE ''%'|| P_CEDUL3 ||'%'' ';
        END IF;
    
        
        IF P_USUARI IS NOT NULL AND length(P_USUARI)>0 THEN
            SET P_USUARI = UPPER(TRIM(P_USUARI));
            SET WhereClause = WhereClause || ' AND USUARI LIKE ''%'|| P_USUARI ||'%'' ';
        END IF;
    
        
        IF P_COMI IS NOT NULL AND length(P_COMI)>0 THEN
            SET P_COMI = UPPER(TRIM(P_COMI));
            SET WhereClause = WhereClause || ' AND COMI LIKE ''%'|| P_COMI ||'%'' ';
        END IF;
    
        
        IF P_NUMCTA IS NOT NULL AND length(P_NUMCTA)>0 THEN
            SET P_NUMCTA = UPPER(TRIM(P_NUMCTA));
            SET WhereClause = WhereClause || ' AND NUMCTA LIKE ''%'|| P_NUMCTA ||'%'' ';
        END IF;
    
        
        IF P_SECCI IS NOT NULL AND length(P_SECCI)>0 THEN
            SET P_SECCI = UPPER(TRIM(P_SECCI));
            SET WhereClause = WhereClause || ' AND SECCI LIKE ''%'|| P_SECCI ||'%'' ';
        END IF;
    
        
        IF P_VIGEN IS NOT NULL AND length(P_VIGEN)>0 THEN
            SET P_VIGEN = UPPER(TRIM(P_VIGEN));
            SET WhereClause = WhereClause || ' AND VIGEN LIKE ''%'|| P_VIGEN ||'%'' ';
        END IF;
    
        
        IF P_NUMOFI > 0 THEN
            SET WhereClause = WhereClause || ' AND NUMOFI = '|| P_NUMOFI ||' ';
        END IF;
    
        
        IF P_CANT1 IS NOT NULL AND length(P_CANT1)>0 THEN
            SET P_CANT1 = UPPER(TRIM(P_CANT1));
            SET WhereClause = WhereClause || ' AND CANT1 LIKE ''%'|| P_CANT1 ||'%'' ';
        END IF;
    
        
        IF P_CANT2 IS NOT NULL AND length(P_CANT2)>0 THEN
            SET P_CANT2 = UPPER(TRIM(P_CANT2));
            SET WhereClause = WhereClause || ' AND CANT2 LIKE ''%'|| P_CANT2 ||'%'' ';
        END IF;
    
        
        IF P_LINCO1 IS NOT NULL AND length(P_LINCO1)>0 THEN
            SET P_LINCO1 = UPPER(TRIM(P_LINCO1));
            SET WhereClause = WhereClause || ' AND LINCO1 LIKE ''%'|| P_LINCO1 ||'%'' ';
        END IF;
    
        
        IF P_LINCO2 IS NOT NULL AND length(P_LINCO2)>0 THEN
            SET P_LINCO2 = UPPER(TRIM(P_LINCO2));
            SET WhereClause = WhereClause || ' AND LINCO2 LIKE ''%'|| P_LINCO2 ||'%'' ';
        END IF;
    
        
        IF P_OPCION IS NOT NULL AND length(P_OPCION)>0 THEN
            SET P_OPCION = UPPER(TRIM(P_OPCION));
            SET WhereClause = WhereClause || ' AND OPCION LIKE ''%'|| P_OPCION ||'%'' ';
        END IF;
    
        
        IF P_DIAS > 0 THEN
            SET WhereClause = WhereClause || ' AND DIAS = '|| P_DIAS ||' ';
        END IF;
    
        
        IF P_DIA1 > 0 THEN
            SET WhereClause = WhereClause || ' AND DIA1 = '|| P_DIA1 ||' ';
        END IF;
    
        
        IF P_LIN1 IS NOT NULL AND length(P_LIN1)>0 THEN
            SET P_LIN1 = UPPER(TRIM(P_LIN1));
            SET WhereClause = WhereClause || ' AND LIN1 LIKE ''%'|| P_LIN1 ||'%'' ';
        END IF;
    
        
        IF P_LIN2 IS NOT NULL AND length(P_LIN2)>0 THEN
            SET P_LIN2 = UPPER(TRIM(P_LIN2));
            SET WhereClause = WhereClause || ' AND LIN2 LIKE ''%'|| P_LIN2 ||'%'' ';
        END IF;
    
        
        IF P_LIN3 IS NOT NULL AND length(P_LIN3)>0 THEN
            SET P_LIN3 = UPPER(TRIM(P_LIN3));
            SET WhereClause = WhereClause || ' AND LIN3 LIKE ''%'|| P_LIN3 ||'%'' ';
        END IF;
    
        
        IF P_LIN4 IS NOT NULL AND length(P_LIN4)>0 THEN
            SET P_LIN4 = UPPER(TRIM(P_LIN4));
            SET WhereClause = WhereClause || ' AND LIN4 LIKE ''%'|| P_LIN4 ||'%'' ';
        END IF;
    
        
        IF P_LIN5 IS NOT NULL AND length(P_LIN5)>0 THEN
            SET P_LIN5 = UPPER(TRIM(P_LIN5));
            SET WhereClause = WhereClause || ' AND LIN5 LIKE ''%'|| P_LIN5 ||'%'' ';
        END IF;
    
        
        IF P_LIN6 IS NOT NULL AND length(P_LIN6)>0 THEN
            SET P_LIN6 = UPPER(TRIM(P_LIN6));
            SET WhereClause = WhereClause || ' AND LIN6 LIKE ''%'|| P_LIN6 ||'%'' ';
        END IF;
    
        
        IF P_LIN7 IS NOT NULL AND length(P_LIN7)>0 THEN
            SET P_LIN7 = UPPER(TRIM(P_LIN7));
            SET WhereClause = WhereClause || ' AND LIN7 LIKE ''%'|| P_LIN7 ||'%'' ';
        END IF;
    
        
        IF P_LIN8 IS NOT NULL AND length(P_LIN8)>0 THEN
            SET P_LIN8 = UPPER(TRIM(P_LIN8));
            SET WhereClause = WhereClause || ' AND LIN8 LIKE ''%'|| P_LIN8 ||'%'' ';
        END IF;
    
        
        IF P_LIN9 IS NOT NULL AND length(P_LIN9)>0 THEN
            SET P_LIN9 = UPPER(TRIM(P_LIN9));
            SET WhereClause = WhereClause || ' AND LIN9 LIKE ''%'|| P_LIN9 ||'%'' ';
        END IF;
    
        
        IF P_LI1 IS NOT NULL AND length(P_LI1)>0 THEN
            SET P_LI1 = UPPER(TRIM(P_LI1));
            SET WhereClause = WhereClause || ' AND LI1 LIKE ''%'|| P_LI1 ||'%'' ';
        END IF;
    
        
        IF P_LI2 IS NOT NULL AND length(P_LI2)>0 THEN
            SET P_LI2 = UPPER(TRIM(P_LI2));
            SET WhereClause = WhereClause || ' AND LI2 LIKE ''%'|| P_LI2 ||'%'' ';
        END IF;
    
        
        IF P_LI10 IS NOT NULL AND length(P_LI10)>0 THEN
            SET P_LI10 = UPPER(TRIM(P_LI10));
            SET WhereClause = WhereClause || ' AND LI10 LIKE ''%'|| P_LI10 ||'%'' ';
        END IF;
    
        
        IF P_LI11 IS NOT NULL AND length(P_LI11)>0 THEN
            SET P_LI11 = UPPER(TRIM(P_LI11));
            SET WhereClause = WhereClause || ' AND LI11 LIKE ''%'|| P_LI11 ||'%'' ';
        END IF;
    
        
        IF P_LI12 IS NOT NULL AND length(P_LI12)>0 THEN
            SET P_LI12 = UPPER(TRIM(P_LI12));
            SET WhereClause = WhereClause || ' AND LI12 LIKE ''%'|| P_LI12 ||'%'' ';
        END IF;
    
        
        IF P_LIN13 IS NOT NULL AND length(P_LIN13)>0 THEN
            SET P_LIN13 = UPPER(TRIM(P_LIN13));
            SET WhereClause = WhereClause || ' AND LIN13 LIKE ''%'|| P_LIN13 ||'%'' ';
        END IF;
    
        
        IF P_LIN14 IS NOT NULL AND length(P_LIN14)>0 THEN
            SET P_LIN14 = UPPER(TRIM(P_LIN14));
            SET WhereClause = WhereClause || ' AND LIN14 LIKE ''%'|| P_LIN14 ||'%'' ';
        END IF;
    
        
        IF P_FORPAG IS NOT NULL AND length(P_FORPAG)>0 THEN
            SET P_FORPAG = UPPER(TRIM(P_FORPAG));
            SET WhereClause = WhereClause || ' AND FORPAG LIKE ''%'|| P_FORPAG ||'%'' ';
        END IF;
    
        
        IF P_INDIVI IS NOT NULL AND length(P_INDIVI)>0 THEN
            SET P_INDIVI = UPPER(TRIM(P_INDIVI));
            SET WhereClause = WhereClause || ' AND INDIVI LIKE ''%'|| P_INDIVI ||'%'' ';
        END IF;
    
        
        IF P_CONJUN IS NOT NULL AND length(P_CONJUN)>0 THEN
            SET P_CONJUN = UPPER(TRIM(P_CONJUN));
            SET WhereClause = WhereClause || ' AND CONJUN LIKE ''%'|| P_CONJUN ||'%'' ';
        END IF;
    
        
        IF P_CTEI IS NOT NULL AND length(P_CTEI)>0 THEN
            SET P_CTEI = UPPER(TRIM(P_CTEI));
            SET WhereClause = WhereClause || ' AND CTEI LIKE ''%'|| P_CTEI ||'%'' ';
        END IF;
    
        
        IF P_AHOI IS NOT NULL AND length(P_AHOI)>0 THEN
            SET P_AHOI = UPPER(TRIM(P_AHOI));
            SET WhereClause = WhereClause || ' AND AHOI LIKE ''%'|| P_AHOI ||'%'' ';
        END IF;
    
        
        IF P_CHEI IS NOT NULL AND length(P_CHEI)>0 THEN
            SET P_CHEI = UPPER(TRIM(P_CHEI));
            SET WhereClause = WhereClause || ' AND CHEI LIKE ''%'|| P_CHEI ||'%'' ';
        END IF;
    
        
        IF P_REII IS NOT NULL AND length(P_REII)>0 THEN
            SET P_REII = UPPER(TRIM(P_REII));
            SET WhereClause = WhereClause || ' AND REII LIKE ''%'|| P_REII ||'%'' ';
        END IF;
    
        
        IF P_CTEP IS NOT NULL AND length(P_CTEP)>0 THEN
            SET P_CTEP = UPPER(TRIM(P_CTEP));
            SET WhereClause = WhereClause || ' AND CTEP LIKE ''%'|| P_CTEP ||'%'' ';
        END IF;
    
        
        IF P_AHOP IS NOT NULL AND length(P_AHOP)>0 THEN
            SET P_AHOP = UPPER(TRIM(P_AHOP));
            SET WhereClause = WhereClause || ' AND AHOP LIKE ''%'|| P_AHOP ||'%'' ';
        END IF;
    
        
        IF P_CHEP IS NOT NULL AND length(P_CHEP)>0 THEN
            SET P_CHEP = UPPER(TRIM(P_CHEP));
            SET WhereClause = WhereClause || ' AND CHEP LIKE ''%'|| P_CHEP ||'%'' ';
        END IF;
    
        
        IF P_REIP IS NOT NULL AND length(P_REIP)>0 THEN
            SET P_REIP = UPPER(TRIM(P_REIP));
            SET WhereClause = WhereClause || ' AND REIP LIKE ''%'|| P_REIP ||'%'' ';
        END IF;
    
        
        IF P_NCTEI IS NOT NULL AND length(P_NCTEI)>0 THEN
            SET P_NCTEI = UPPER(TRIM(P_NCTEI));
            SET WhereClause = WhereClause || ' AND NCTEI LIKE ''%'|| P_NCTEI ||'%'' ';
        END IF;
    
        
        IF P_NAHOI IS NOT NULL AND length(P_NAHOI)>0 THEN
            SET P_NAHOI = UPPER(TRIM(P_NAHOI));
            SET WhereClause = WhereClause || ' AND NAHOI LIKE ''%'|| P_NAHOI ||'%'' ';
        END IF;
    
        
        IF P_NCTEP IS NOT NULL AND length(P_NCTEP)>0 THEN
            SET P_NCTEP = UPPER(TRIM(P_NCTEP));
            SET WhereClause = WhereClause || ' AND NCTEP LIKE ''%'|| P_NCTEP ||'%'' ';
        END IF;
    
        
        IF P_NAHOP IS NOT NULL AND length(P_NAHOP)>0 THEN
            SET P_NAHOP = UPPER(TRIM(P_NAHOP));
            SET WhereClause = WhereClause || ' AND NAHOP LIKE ''%'|| P_NAHOP ||'%'' ';
        END IF;
    
        
        IF P_MATDEP IS NOT NULL AND length(P_MATDEP)>0 THEN
            SET P_MATDEP = UPPER(TRIM(P_MATDEP));
            SET WhereClause = WhereClause || ' AND MATDEP LIKE ''%'|| P_MATDEP ||'%'' ';
        END IF;
    
        
        IF P_FIDE IS NOT NULL AND length(P_FIDE)>0 THEN
            SET P_FIDE = UPPER(TRIM(P_FIDE));
            SET WhereClause = WhereClause || ' AND FIDE LIKE ''%'|| P_FIDE ||'%'' ';
        END IF;
    
        
        IF P_ECFIDE IS NOT NULL AND length(P_ECFIDE)>0 THEN
            SET P_ECFIDE = UPPER(TRIM(P_ECFIDE));
            SET WhereClause = WhereClause || ' AND ECFIDE LIKE ''%'|| P_ECFIDE ||'%'' ';
        END IF;
    
        
        IF P_PRFIDE IS NOT NULL AND length(P_PRFIDE)>0 THEN
            SET P_PRFIDE = UPPER(TRIM(P_PRFIDE));
            SET WhereClause = WhereClause || ' AND PRFIDE LIKE ''%'|| P_PRFIDE ||'%'' ';
        END IF;
    
        
        IF P_POFIDE IS NOT NULL AND length(P_POFIDE)>0 THEN
            SET P_POFIDE = UPPER(TRIM(P_POFIDE));
            SET WhereClause = WhereClause || ' AND POFIDE LIKE ''%'|| P_POFIDE ||'%'' ';
        END IF;
    
        
        IF P_CEFIDE IS NOT NULL AND length(P_CEFIDE)>0 THEN
            SET P_CEFIDE = UPPER(TRIM(P_CEFIDE));
            SET WhereClause = WhereClause || ' AND CEFIDE LIKE ''%'|| P_CEFIDE ||'%'' ';
        END IF;
    
        
        IF P_NFIDE > 0 THEN
            SET WhereClause = WhereClause || ' AND NFIDE = '|| P_NFIDE ||' ';
        END IF;
    
        
        IF P_FID2 IS NOT NULL AND length(P_FID2)>0 THEN
            SET P_FID2 = UPPER(TRIM(P_FID2));
            SET WhereClause = WhereClause || ' AND FID2 LIKE ''%'|| P_FID2 ||'%'' ';
        END IF;
    
        
        IF P_ECFID2 IS NOT NULL AND length(P_ECFID2)>0 THEN
            SET P_ECFID2 = UPPER(TRIM(P_ECFID2));
            SET WhereClause = WhereClause || ' AND ECFID2 LIKE ''%'|| P_ECFID2 ||'%'' ';
        END IF;
    
        
        IF P_PRFID2 IS NOT NULL AND length(P_PRFID2)>0 THEN
            SET P_PRFID2 = UPPER(TRIM(P_PRFID2));
            SET WhereClause = WhereClause || ' AND PRFID2 LIKE ''%'|| P_PRFID2 ||'%'' ';
        END IF;
    
        
        IF P_POFID2 IS NOT NULL AND length(P_POFID2)>0 THEN
            SET P_POFID2 = UPPER(TRIM(P_POFID2));
            SET WhereClause = WhereClause || ' AND POFID2 LIKE ''%'|| P_POFID2 ||'%'' ';
        END IF;
    
        
        IF P_CEFID2 IS NOT NULL AND length(P_CEFID2)>0 THEN
            SET P_CEFID2 = UPPER(TRIM(P_CEFID2));
            SET WhereClause = WhereClause || ' AND CEFID2 LIKE ''%'|| P_CEFID2 ||'%'' ';
        END IF;
    
        
        IF P_NFID2 > 0 THEN
            SET WhereClause = WhereClause || ' AND NFID2 = '|| P_NFID2 ||' ';
        END IF;
    
        
        IF P_BENE1 IS NOT NULL AND length(P_BENE1)>0 THEN
            SET P_BENE1 = UPPER(TRIM(P_BENE1));
            SET WhereClause = WhereClause || ' AND BENE1 LIKE ''%'|| P_BENE1 ||'%'' ';
        END IF;
    
        
        IF P_ECBEN1 IS NOT NULL AND length(P_ECBEN1)>0 THEN
            SET P_ECBEN1 = UPPER(TRIM(P_ECBEN1));
            SET WhereClause = WhereClause || ' AND ECBEN1 LIKE ''%'|| P_ECBEN1 ||'%'' ';
        END IF;
    
        
        IF P_PRBEN1 IS NOT NULL AND length(P_PRBEN1)>0 THEN
            SET P_PRBEN1 = UPPER(TRIM(P_PRBEN1));
            SET WhereClause = WhereClause || ' AND PRBEN1 LIKE ''%'|| P_PRBEN1 ||'%'' ';
        END IF;
    
        
        IF P_POBEN1 IS NOT NULL AND length(P_POBEN1)>0 THEN
            SET P_POBEN1 = UPPER(TRIM(P_POBEN1));
            SET WhereClause = WhereClause || ' AND POBEN1 LIKE ''%'|| P_POBEN1 ||'%'' ';
        END IF;
    
        
        IF P_CEBEN1 IS NOT NULL AND length(P_CEBEN1)>0 THEN
            SET P_CEBEN1 = UPPER(TRIM(P_CEBEN1));
            SET WhereClause = WhereClause || ' AND CEBEN1 LIKE ''%'|| P_CEBEN1 ||'%'' ';
        END IF;
    
        
        IF P_NBEN1 > 0 THEN
            SET WhereClause = WhereClause || ' AND NBEN1 = '|| P_NBEN1 ||' ';
        END IF;
    
        
        IF P_BENE2 IS NOT NULL AND length(P_BENE2)>0 THEN
            SET P_BENE2 = UPPER(TRIM(P_BENE2));
            SET WhereClause = WhereClause || ' AND BENE2 LIKE ''%'|| P_BENE2 ||'%'' ';
        END IF;
    
        
        IF P_ECBEN2 IS NOT NULL AND length(P_ECBEN2)>0 THEN
            SET P_ECBEN2 = UPPER(TRIM(P_ECBEN2));
            SET WhereClause = WhereClause || ' AND ECBEN2 LIKE ''%'|| P_ECBEN2 ||'%'' ';
        END IF;
    
        
        IF P_PRBEN2 IS NOT NULL AND length(P_PRBEN2)>0 THEN
            SET P_PRBEN2 = UPPER(TRIM(P_PRBEN2));
            SET WhereClause = WhereClause || ' AND PRBEN2 LIKE ''%'|| P_PRBEN2 ||'%'' ';
        END IF;
    
        
        IF P_POBEN2 IS NOT NULL AND length(P_POBEN2)>0 THEN
            SET P_POBEN2 = UPPER(TRIM(P_POBEN2));
            SET WhereClause = WhereClause || ' AND POBEN2 LIKE ''%'|| P_POBEN2 ||'%'' ';
        END IF;
    
        
        IF P_CEBEN2 IS NOT NULL AND length(P_CEBEN2)>0 THEN
            SET P_CEBEN2 = UPPER(TRIM(P_CEBEN2));
            SET WhereClause = WhereClause || ' AND CEBEN2 LIKE ''%'|| P_CEBEN2 ||'%'' ';
        END IF;
    
        
        IF P_NBEN2 > 0 THEN
            SET WhereClause = WhereClause || ' AND NBEN2 = '|| P_NBEN2 ||' ';
        END IF;
    
        
        IF P_BENE3 IS NOT NULL AND length(P_BENE3)>0 THEN
            SET P_BENE3 = UPPER(TRIM(P_BENE3));
            SET WhereClause = WhereClause || ' AND BENE3 LIKE ''%'|| P_BENE3 ||'%'' ';
        END IF;
    
        
        IF P_ECBEN3 IS NOT NULL AND length(P_ECBEN3)>0 THEN
            SET P_ECBEN3 = UPPER(TRIM(P_ECBEN3));
            SET WhereClause = WhereClause || ' AND ECBEN3 LIKE ''%'|| P_ECBEN3 ||'%'' ';
        END IF;
    
        
        IF P_PRBEN3 IS NOT NULL AND length(P_PRBEN3)>0 THEN
            SET P_PRBEN3 = UPPER(TRIM(P_PRBEN3));
            SET WhereClause = WhereClause || ' AND PRBEN3 LIKE ''%'|| P_PRBEN3 ||'%'' ';
        END IF;
    
        
        IF P_POBEN3 IS NOT NULL AND length(P_POBEN3)>0 THEN
            SET P_POBEN3 = UPPER(TRIM(P_POBEN3));
            SET WhereClause = WhereClause || ' AND POBEN3 LIKE ''%'|| P_POBEN3 ||'%'' ';
        END IF;
    
        
        IF P_CEBEN3 IS NOT NULL AND length(P_CEBEN3)>0 THEN
            SET P_CEBEN3 = UPPER(TRIM(P_CEBEN3));
            SET WhereClause = WhereClause || ' AND CEBEN3 LIKE ''%'|| P_CEBEN3 ||'%'' ';
        END IF;
    
        
        IF P_NBEN3 > 0 THEN
            SET WhereClause = WhereClause || ' AND NBEN3 = '|| P_NBEN3 ||' ';
        END IF;
    
        
        IF P_BENE4 IS NOT NULL AND length(P_BENE4)>0 THEN
            SET P_BENE4 = UPPER(TRIM(P_BENE4));
            SET WhereClause = WhereClause || ' AND BENE4 LIKE ''%'|| P_BENE4 ||'%'' ';
        END IF;
    
        
        IF P_ECBEN4 IS NOT NULL AND length(P_ECBEN4)>0 THEN
            SET P_ECBEN4 = UPPER(TRIM(P_ECBEN4));
            SET WhereClause = WhereClause || ' AND ECBEN4 LIKE ''%'|| P_ECBEN4 ||'%'' ';
        END IF;
    
        
        IF P_PRBEN4 IS NOT NULL AND length(P_PRBEN4)>0 THEN
            SET P_PRBEN4 = UPPER(TRIM(P_PRBEN4));
            SET WhereClause = WhereClause || ' AND PRBEN4 LIKE ''%'|| P_PRBEN4 ||'%'' ';
        END IF;
    
        
        IF P_POBEN4 IS NOT NULL AND length(P_POBEN4)>0 THEN
            SET P_POBEN4 = UPPER(TRIM(P_POBEN4));
            SET WhereClause = WhereClause || ' AND POBEN4 LIKE ''%'|| P_POBEN4 ||'%'' ';
        END IF;
    
        
        IF P_CEBEN4 IS NOT NULL AND length(P_CEBEN4)>0 THEN
            SET P_CEBEN4 = UPPER(TRIM(P_CEBEN4));
            SET WhereClause = WhereClause || ' AND CEBEN4 LIKE ''%'|| P_CEBEN4 ||'%'' ';
        END IF;
    
        
        IF P_NBEN4 > 0 THEN
            SET WhereClause = WhereClause || ' AND NBEN4 = '|| P_NBEN4 ||' ';
        END IF;
    
        
        IF P_BENE5 IS NOT NULL AND length(P_BENE5)>0 THEN
            SET P_BENE5 = UPPER(TRIM(P_BENE5));
            SET WhereClause = WhereClause || ' AND BENE5 LIKE ''%'|| P_BENE5 ||'%'' ';
        END IF;
    
        
        IF P_ECBEN5 IS NOT NULL AND length(P_ECBEN5)>0 THEN
            SET P_ECBEN5 = UPPER(TRIM(P_ECBEN5));
            SET WhereClause = WhereClause || ' AND ECBEN5 LIKE ''%'|| P_ECBEN5 ||'%'' ';
        END IF;
    
        
        IF P_PRBEN5 IS NOT NULL AND length(P_PRBEN5)>0 THEN
            SET P_PRBEN5 = UPPER(TRIM(P_PRBEN5));
            SET WhereClause = WhereClause || ' AND PRBEN5 LIKE ''%'|| P_PRBEN5 ||'%'' ';
        END IF;
    
        
        IF P_POBEN5 IS NOT NULL AND length(P_POBEN5)>0 THEN
            SET P_POBEN5 = UPPER(TRIM(P_POBEN5));
            SET WhereClause = WhereClause || ' AND POBEN5 LIKE ''%'|| P_POBEN5 ||'%'' ';
        END IF;
    
        
        IF P_CEBEN5 IS NOT NULL AND length(P_CEBEN5)>0 THEN
            SET P_CEBEN5 = UPPER(TRIM(P_CEBEN5));
            SET WhereClause = WhereClause || ' AND CEBEN5 LIKE ''%'|| P_CEBEN5 ||'%'' ';
        END IF;
    
        
        IF P_NBEN5 > 0 THEN
            SET WhereClause = WhereClause || ' AND NBEN5 = '|| P_NBEN5 ||' ';
        END IF;
    
        
        IF P_BENE6 IS NOT NULL AND length(P_BENE6)>0 THEN
            SET P_BENE6 = UPPER(TRIM(P_BENE6));
            SET WhereClause = WhereClause || ' AND BENE6 LIKE ''%'|| P_BENE6 ||'%'' ';
        END IF;
    
        
        IF P_ECBEN6 IS NOT NULL AND length(P_ECBEN6)>0 THEN
            SET P_ECBEN6 = UPPER(TRIM(P_ECBEN6));
            SET WhereClause = WhereClause || ' AND ECBEN6 LIKE ''%'|| P_ECBEN6 ||'%'' ';
        END IF;
    
        
        IF P_PRBEN6 IS NOT NULL AND length(P_PRBEN6)>0 THEN
            SET P_PRBEN6 = UPPER(TRIM(P_PRBEN6));
            SET WhereClause = WhereClause || ' AND PRBEN6 LIKE ''%'|| P_PRBEN6 ||'%'' ';
        END IF;
    
        
        IF P_POBEN6 IS NOT NULL AND length(P_POBEN6)>0 THEN
            SET P_POBEN6 = UPPER(TRIM(P_POBEN6));
            SET WhereClause = WhereClause || ' AND POBEN6 LIKE ''%'|| P_POBEN6 ||'%'' ';
        END IF;
    
        
        IF P_CEBEN6 IS NOT NULL AND length(P_CEBEN6)>0 THEN
            SET P_CEBEN6 = UPPER(TRIM(P_CEBEN6));
            SET WhereClause = WhereClause || ' AND CEBEN6 LIKE ''%'|| P_CEBEN6 ||'%'' ';
        END IF;
    
        
        IF P_NBEN6 > 0 THEN
            SET WhereClause = WhereClause || ' AND NBEN6 = '|| P_NBEN6 ||' ';
        END IF;
    
        
        IF P_NOMASE IS NOT NULL AND length(P_NOMASE)>0 THEN
            SET P_NOMASE = UPPER(TRIM(P_NOMASE));
            SET WhereClause = WhereClause || ' AND NOMASE LIKE ''%'|| P_NOMASE ||'%'' ';
        END IF;
    
        
        IF P_DIRASE IS NOT NULL AND length(P_DIRASE)>0 THEN
            SET P_DIRASE = UPPER(TRIM(P_DIRASE));
            SET WhereClause = WhereClause || ' AND DIRASE LIKE ''%'|| P_DIRASE ||'%'' ';
        END IF;
    
        
        IF P_EDADVI > 0 THEN
            SET WhereClause = WhereClause || ' AND EDADVI = '|| P_EDADVI ||' ';
        END IF;
    
        
        IF P_HONORA IS NOT NULL AND length(P_HONORA)>0 THEN
            SET P_HONORA = UPPER(TRIM(P_HONORA));
            SET WhereClause = WhereClause || ' AND HONORA LIKE ''%'|| P_HONORA ||'%'' ';
        END IF;
    
        
        IF P_PRCA IS NOT NULL AND length(P_PRCA)>0 THEN
            SET P_PRCA = UPPER(TRIM(P_PRCA));
            SET WhereClause = WhereClause || ' AND PRCA LIKE ''%'|| P_PRCA ||'%'' ';
        END IF;
    
        
        IF P_PRCP IS NOT NULL AND length(P_PRCP)>0 THEN
            SET P_PRCP = UPPER(TRIM(P_PRCP));
            SET WhereClause = WhereClause || ' AND PRCP LIKE ''%'|| P_PRCP ||'%'' ';
        END IF;
    
        
        IF P_AUTOR1 IS NOT NULL AND length(P_AUTOR1)>0 THEN
            SET P_AUTOR1 = UPPER(TRIM(P_AUTOR1));
            SET WhereClause = WhereClause || ' AND AUTOR1 LIKE ''%'|| P_AUTOR1 ||'%'' ';
        END IF;
    
        
        IF P_ECAUT1 IS NOT NULL AND length(P_ECAUT1)>0 THEN
            SET P_ECAUT1 = UPPER(TRIM(P_ECAUT1));
            SET WhereClause = WhereClause || ' AND ECAUT1 LIKE ''%'|| P_ECAUT1 ||'%'' ';
        END IF;
    
        
        IF P_PRAUT1 IS NOT NULL AND length(P_PRAUT1)>0 THEN
            SET P_PRAUT1 = UPPER(TRIM(P_PRAUT1));
            SET WhereClause = WhereClause || ' AND PRAUT1 LIKE ''%'|| P_PRAUT1 ||'%'' ';
        END IF;
    
        
        IF P_POAUT1 IS NOT NULL AND length(P_POAUT1)>0 THEN
            SET P_POAUT1 = UPPER(TRIM(P_POAUT1));
            SET WhereClause = WhereClause || ' AND POAUT1 LIKE ''%'|| P_POAUT1 ||'%'' ';
        END IF;
    
        
        IF P_CEAUT1 IS NOT NULL AND length(P_CEAUT1)>0 THEN
            SET P_CEAUT1 = UPPER(TRIM(P_CEAUT1));
            SET WhereClause = WhereClause || ' AND CEAUT1 LIKE ''%'|| P_CEAUT1 ||'%'' ';
        END IF;
    
        
        IF P_AUTOR2 IS NOT NULL AND length(P_AUTOR2)>0 THEN
            SET P_AUTOR2 = UPPER(TRIM(P_AUTOR2));
            SET WhereClause = WhereClause || ' AND AUTOR2 LIKE ''%'|| P_AUTOR2 ||'%'' ';
        END IF;
    
        
        IF P_ECAUT2 IS NOT NULL AND length(P_ECAUT2)>0 THEN
            SET P_ECAUT2 = UPPER(TRIM(P_ECAUT2));
            SET WhereClause = WhereClause || ' AND ECAUT2 LIKE ''%'|| P_ECAUT2 ||'%'' ';
        END IF;
    
        
        IF P_PRAUT2 IS NOT NULL AND length(P_PRAUT2)>0 THEN
            SET P_PRAUT2 = UPPER(TRIM(P_PRAUT2));
            SET WhereClause = WhereClause || ' AND PRAUT2 LIKE ''%'|| P_PRAUT2 ||'%'' ';
        END IF;
    
        
        IF P_POAUT2 IS NOT NULL AND length(P_POAUT2)>0 THEN
            SET P_POAUT2 = UPPER(TRIM(P_POAUT2));
            SET WhereClause = WhereClause || ' AND POAUT2 LIKE ''%'|| P_POAUT2 ||'%'' ';
        END IF;
    
        
        IF P_CEAUT2 IS NOT NULL AND length(P_CEAUT2)>0 THEN
            SET P_CEAUT2 = UPPER(TRIM(P_CEAUT2));
            SET WhereClause = WhereClause || ' AND CEAUT2 LIKE ''%'|| P_CEAUT2 ||'%'' ';
        END IF;
    
        
        IF P_AUTOR3 IS NOT NULL AND length(P_AUTOR3)>0 THEN
            SET P_AUTOR3 = UPPER(TRIM(P_AUTOR3));
            SET WhereClause = WhereClause || ' AND AUTOR3 LIKE ''%'|| P_AUTOR3 ||'%'' ';
        END IF;
    
        
        IF P_ECAUT3 IS NOT NULL AND length(P_ECAUT3)>0 THEN
            SET P_ECAUT3 = UPPER(TRIM(P_ECAUT3));
            SET WhereClause = WhereClause || ' AND ECAUT3 LIKE ''%'|| P_ECAUT3 ||'%'' ';
        END IF;
    
        
        IF P_PRAUT3 IS NOT NULL AND length(P_PRAUT3)>0 THEN
            SET P_PRAUT3 = UPPER(TRIM(P_PRAUT3));
            SET WhereClause = WhereClause || ' AND PRAUT3 LIKE ''%'|| P_PRAUT3 ||'%'' ';
        END IF;
    
        
        IF P_POAUT3 IS NOT NULL AND length(P_POAUT3)>0 THEN
            SET P_POAUT3 = UPPER(TRIM(P_POAUT3));
            SET WhereClause = WhereClause || ' AND POAUT3 LIKE ''%'|| P_POAUT3 ||'%'' ';
        END IF;
    
        
        IF P_CEAUT3 IS NOT NULL AND length(P_CEAUT3)>0 THEN
            SET P_CEAUT3 = UPPER(TRIM(P_CEAUT3));
            SET WhereClause = WhereClause || ' AND CEAUT3 LIKE ''%'|| P_CEAUT3 ||'%'' ';
        END IF;
    
        
        IF P_NUMAPO > 0 THEN
            SET WhereClause = WhereClause || ' AND NUMAPO = '|| P_NUMAPO ||' ';
        END IF;
    
        
        IF P_CONFFI > 0 THEN
            SET WhereClause = WhereClause || ' AND CONFFI = '|| P_CONFFI ||' ';
        END IF;
    
        
        IF P_CONIMP IS NOT NULL AND length(P_CONIMP)>0 THEN
            SET P_CONIMP = UPPER(TRIM(P_CONIMP));
            SET WhereClause = WhereClause || ' AND CONIMP LIKE ''%'|| P_CONIMP ||'%'' ';
        END IF;
    
        
        IF P_CONPRC IS NOT NULL AND length(P_CONPRC)>0 THEN
            SET P_CONPRC = UPPER(TRIM(P_CONPRC));
            SET WhereClause = WhereClause || ' AND CONPRC LIKE ''%'|| P_CONPRC ||'%'' ';
        END IF;
    
        
        IF P_ENVIO IS NOT NULL AND length(P_ENVIO)>0 THEN
            SET P_ENVIO = UPPER(TRIM(P_ENVIO));
            SET WhereClause = WhereClause || ' AND ENVIO LIKE ''%'|| P_ENVIO ||'%'' ';
        END IF;
    
        
        IF P_GESCOD > 0 THEN
            SET WhereClause = WhereClause || ' AND GESCOD = '|| P_GESCOD ||' ';
        END IF;
    
        
        IF P_COMAPO IS NOT NULL AND length(P_COMAPO)>0 THEN
            SET P_COMAPO = UPPER(TRIM(P_COMAPO));
            SET WhereClause = WhereClause || ' AND COMAPO LIKE ''%'|| P_COMAPO ||'%'' ';
        END IF;
    
        
        IF P_COMRET IS NOT NULL AND length(P_COMRET)>0 THEN
            SET P_COMRET = UPPER(TRIM(P_COMRET));
            SET WhereClause = WhereClause || ' AND COMRET LIKE ''%'|| P_COMRET ||'%'' ';
        END IF;
    
        
        IF P_COMFIN IS NOT NULL AND length(P_COMFIN)>0 THEN
            SET P_COMFIN = UPPER(TRIM(P_COMFIN));
            SET WhereClause = WhereClause || ' AND COMFIN LIKE ''%'|| P_COMFIN ||'%'' ';
        END IF;
    
        
        IF P_NFALI IS NOT NULL AND length(P_NFALI)>0 THEN
            SET P_NFALI = UPPER(TRIM(P_NFALI));
            SET WhereClause = WhereClause || ' AND NFALI LIKE ''%'|| P_NFALI ||'%'' ';
        END IF;
    
        
        IF P_NFALP IS NOT NULL AND length(P_NFALP)>0 THEN
            SET P_NFALP = UPPER(TRIM(P_NFALP));
            SET WhereClause = WhereClause || ' AND NFALP LIKE ''%'|| P_NFALP ||'%'' ';
        END IF;
    
        
        IF P_ICOAPO IS NOT NULL AND length(P_ICOAPO)>0 THEN
            SET P_ICOAPO = UPPER(TRIM(P_ICOAPO));
            SET WhereClause = WhereClause || ' AND ICOAPO LIKE ''%'|| P_ICOAPO ||'%'' ';
        END IF;
    
        
        IF P_ICORET IS NOT NULL AND length(P_ICORET)>0 THEN
            SET P_ICORET = UPPER(TRIM(P_ICORET));
            SET WhereClause = WhereClause || ' AND ICORET LIKE ''%'|| P_ICORET ||'%'' ';
        END IF;
    
        
        IF P_ICOFIN IS NOT NULL AND length(P_ICOFIN)>0 THEN
            SET P_ICOFIN = UPPER(TRIM(P_ICOFIN));
            SET WhereClause = WhereClause || ' AND ICOFIN LIKE ''%'|| P_ICOFIN ||'%'' ';
        END IF;
    
        
        IF P_CLICON > 0 THEN
            SET WhereClause = WhereClause || ' AND CLICON = '|| P_CLICON ||' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(CONTRATO) as ROWID,CONEMP ,CONDEL ,CTNFMT ,NUCONT ,CLICLA ,DATFID ,DATGES ,DATFOP ,DATFVL ,DATFEU ,DATFEI ,FECVEN ,FECSYS ,DATPRM ,DATMAX ,DATINT ,DATMIN ,DATMAE ,DATMNT ,DATMTA ,DATGA1 ,DATGA2 ,DATGA3 ,DATDE1 ,DATDE2 ,DATDE3 ,DATDIC ,DATDIS ,DATMES ,DATDIA ,DATMEA ,DATPCC ,DATREB ,DATPER ,CTNUSO ,CTNANU ,EMPRE ,CEEMP ,COSDIV ,CONMNT ,MNTCO1 ,NTAB ,FIJVAR ,MNTCOM ,COMFIJ ,COMAPC ,COMAPF ,COMCCU ,RENOV ,FRMPA ,RP ,NOMRE ,CEDRE ,ECRE ,PRORE ,POBRE ,CERE ,FOLRE ,FOLRE1 ,TOMRE ,TOMRE1 ,ASIRE ,ASIRE1 ,OBJ1 ,OBJ2 ,OBJ3 ,OBJ4 ,OBJ5 ,FECPRO ,FECEJE ,AUTORI ,PEAUT1 ,COAUT1 ,CEDUL1 ,PEAUT2 ,COAUT2 ,CEDUL2 ,PEAUT3 ,COAUT3 ,CEDUL3 ,USUARI ,COMI ,NUMCTA ,SECCI ,VIGEN ,NUMOFI ,CANT1 ,CANT2 ,LINCO1 ,LINCO2 ,OPCION ,DIAS ,DIA1 ,LIN1 ,LIN2 ,LIN3 ,LIN4 ,LIN5 ,LIN6 ,LIN7 ,LIN8 ,LIN9 ,LI1 ,LI2 ,LI10 ,LI11 ,LI12 ,LIN13 ,LIN14 ,FORPAG ,INDIVI ,CONJUN ,CTEI ,AHOI ,CHEI ,REII ,CTEP ,AHOP ,CHEP ,REIP ,NCTEI ,NAHOI ,NCTEP ,NAHOP ,MATDEP ,FIDE ,ECFIDE ,PRFIDE ,POFIDE ,CEFIDE ,NFIDE ,FID2 ,ECFID2 ,PRFID2 ,POFID2 ,CEFID2 ,NFID2 ,BENE1 ,ECBEN1 ,PRBEN1 ,POBEN1 ,CEBEN1 ,NBEN1 ,BENE2 ,ECBEN2 ,PRBEN2 ,POBEN2 ,CEBEN2 ,NBEN2 ,BENE3 ,ECBEN3 ,PRBEN3 ,POBEN3 ,CEBEN3 ,NBEN3 ,BENE4 ,ECBEN4 ,PRBEN4 ,POBEN4 ,CEBEN4 ,NBEN4 ,BENE5 ,ECBEN5 ,PRBEN5 ,POBEN5 ,CEBEN5 ,NBEN5 ,BENE6 ,ECBEN6 ,PRBEN6 ,POBEN6 ,CEBEN6 ,NBEN6 ,NOMASE ,DIRASE ,EDADVI ,HONORA ,PRCA ,PRCP ,AUTOR1 ,ECAUT1 ,PRAUT1 ,POAUT1 ,CEAUT1 ,AUTOR2 ,ECAUT2 ,PRAUT2 ,POAUT2 ,CEAUT2 ,AUTOR3 ,ECAUT3 ,PRAUT3 ,POAUT3 ,CEAUT3 ,NUMAPO ,CONFFI ,CONIMP ,CONPRC ,ENVIO ,GESCOD ,COMAPO ,COMRET ,COMFIN ,NFALI ,NFALP ,ICOAPO ,ICORET ,ICOFIN ,CLICON  FROM CONTRATO  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(CONTRATO) as ROWID,CONEMP ,CONDEL ,CTNFMT ,NUCONT ,CLICLA ,DATFID ,DATGES ,DATFOP ,DATFVL ,DATFEU ,DATFEI ,FECVEN ,FECSYS ,DATPRM ,DATMAX ,DATINT ,DATMIN ,DATMAE ,DATMNT ,DATMTA ,DATGA1 ,DATGA2 ,DATGA3 ,DATDE1 ,DATDE2 ,DATDE3 ,DATDIC ,DATDIS ,DATMES ,DATDIA ,DATMEA ,DATPCC ,DATREB ,DATPER ,CTNUSO ,CTNANU ,EMPRE ,CEEMP ,COSDIV ,CONMNT ,MNTCO1 ,NTAB ,FIJVAR ,MNTCOM ,COMFIJ ,COMAPC ,COMAPF ,COMCCU ,RENOV ,FRMPA ,RP ,NOMRE ,CEDRE ,ECRE ,PRORE ,POBRE ,CERE ,FOLRE ,FOLRE1 ,TOMRE ,TOMRE1 ,ASIRE ,ASIRE1 ,OBJ1 ,OBJ2 ,OBJ3 ,OBJ4 ,OBJ5 ,FECPRO ,FECEJE ,AUTORI ,PEAUT1 ,COAUT1 ,CEDUL1 ,PEAUT2 ,COAUT2 ,CEDUL2 ,PEAUT3 ,COAUT3 ,CEDUL3 ,USUARI ,COMI ,NUMCTA ,SECCI ,VIGEN ,NUMOFI ,CANT1 ,CANT2 ,LINCO1 ,LINCO2 ,OPCION ,DIAS ,DIA1 ,LIN1 ,LIN2 ,LIN3 ,LIN4 ,LIN5 ,LIN6 ,LIN7 ,LIN8 ,LIN9 ,LI1 ,LI2 ,LI10 ,LI11 ,LI12 ,LIN13 ,LIN14 ,FORPAG ,INDIVI ,CONJUN ,CTEI ,AHOI ,CHEI ,REII ,CTEP ,AHOP ,CHEP ,REIP ,NCTEI ,NAHOI ,NCTEP ,NAHOP ,MATDEP ,FIDE ,ECFIDE ,PRFIDE ,POFIDE ,CEFIDE ,NFIDE ,FID2 ,ECFID2 ,PRFID2 ,POFID2 ,CEFID2 ,NFID2 ,BENE1 ,ECBEN1 ,PRBEN1 ,POBEN1 ,CEBEN1 ,NBEN1 ,BENE2 ,ECBEN2 ,PRBEN2 ,POBEN2 ,CEBEN2 ,NBEN2 ,BENE3 ,ECBEN3 ,PRBEN3 ,POBEN3 ,CEBEN3 ,NBEN3 ,BENE4 ,ECBEN4 ,PRBEN4 ,POBEN4 ,CEBEN4 ,NBEN4 ,BENE5 ,ECBEN5 ,PRBEN5 ,POBEN5 ,CEBEN5 ,NBEN5 ,BENE6 ,ECBEN6 ,PRBEN6 ,POBEN6 ,CEBEN6 ,NBEN6 ,NOMASE ,DIRASE ,EDADVI ,HONORA ,PRCA ,PRCP ,AUTOR1 ,ECAUT1 ,PRAUT1 ,POAUT1 ,CEAUT1 ,AUTOR2 ,ECAUT2 ,PRAUT2 ,POAUT2 ,CEAUT2 ,AUTOR3 ,ECAUT3 ,PRAUT3 ,POAUT3 ,CEAUT3 ,NUMAPO ,CONFFI ,CONIMP ,CONPRC ,ENVIO ,GESCOD ,COMAPO ,COMRET ,COMFIN ,NFALI ,NFALP ,ICOAPO ,ICORET ,ICOFIN ,CLICON  FROM  CONTRATO WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(CONTRATO) as ROWID,CONEMP ,CONDEL ,CTNFMT ,NUCONT ,CLICLA ,DATFID ,DATGES ,DATFOP ,DATFVL ,DATFEU ,DATFEI ,FECVEN ,FECSYS ,DATPRM ,DATMAX ,DATINT ,DATMIN ,DATMAE ,DATMNT ,DATMTA ,DATGA1 ,DATGA2 ,DATGA3 ,DATDE1 ,DATDE2 ,DATDE3 ,DATDIC ,DATDIS ,DATMES ,DATDIA ,DATMEA ,DATPCC ,DATREB ,DATPER ,CTNUSO ,CTNANU ,EMPRE ,CEEMP ,COSDIV ,CONMNT ,MNTCO1 ,NTAB ,FIJVAR ,MNTCOM ,COMFIJ ,COMAPC ,COMAPF ,COMCCU ,RENOV ,FRMPA ,RP ,NOMRE ,CEDRE ,ECRE ,PRORE ,POBRE ,CERE ,FOLRE ,FOLRE1 ,TOMRE ,TOMRE1 ,ASIRE ,ASIRE1 ,OBJ1 ,OBJ2 ,OBJ3 ,OBJ4 ,OBJ5 ,FECPRO ,FECEJE ,AUTORI ,PEAUT1 ,COAUT1 ,CEDUL1 ,PEAUT2 ,COAUT2 ,CEDUL2 ,PEAUT3 ,COAUT3 ,CEDUL3 ,USUARI ,COMI ,NUMCTA ,SECCI ,VIGEN ,NUMOFI ,CANT1 ,CANT2 ,LINCO1 ,LINCO2 ,OPCION ,DIAS ,DIA1 ,LIN1 ,LIN2 ,LIN3 ,LIN4 ,LIN5 ,LIN6 ,LIN7 ,LIN8 ,LIN9 ,LI1 ,LI2 ,LI10 ,LI11 ,LI12 ,LIN13 ,LIN14 ,FORPAG ,INDIVI ,CONJUN ,CTEI ,AHOI ,CHEI ,REII ,CTEP ,AHOP ,CHEP ,REIP ,NCTEI ,NAHOI ,NCTEP ,NAHOP ,MATDEP ,FIDE ,ECFIDE ,PRFIDE ,POFIDE ,CEFIDE ,NFIDE ,FID2 ,ECFID2 ,PRFID2 ,POFID2 ,CEFID2 ,NFID2 ,BENE1 ,ECBEN1 ,PRBEN1 ,POBEN1 ,CEBEN1 ,NBEN1 ,BENE2 ,ECBEN2 ,PRBEN2 ,POBEN2 ,CEBEN2 ,NBEN2 ,BENE3 ,ECBEN3 ,PRBEN3 ,POBEN3 ,CEBEN3 ,NBEN3 ,BENE4 ,ECBEN4 ,PRBEN4 ,POBEN4 ,CEBEN4 ,NBEN4 ,BENE5 ,ECBEN5 ,PRBEN5 ,POBEN5 ,CEBEN5 ,NBEN5 ,BENE6 ,ECBEN6 ,PRBEN6 ,POBEN6 ,CEBEN6 ,NBEN6 ,NOMASE ,DIRASE ,EDADVI ,HONORA ,PRCA ,PRCP ,AUTOR1 ,ECAUT1 ,PRAUT1 ,POAUT1 ,CEAUT1 ,AUTOR2 ,ECAUT2 ,PRAUT2 ,POAUT2 ,CEAUT2 ,AUTOR3 ,ECAUT3 ,PRAUT3 ,POAUT3 ,CEAUT3 ,NUMAPO ,CONFFI ,CONIMP ,CONPRC ,ENVIO ,GESCOD ,COMAPO ,COMRET ,COMFIN ,NFALI ,NFALP ,ICOAPO ,ICORET ,ICOFIN ,CLICON  FROM  CONTRATO WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    --CALL procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadContrato', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GOX

--call procReadContrato ('','',0,0,0,0,0,0,0,0,0,0,0,'',0,'','','','','','','','','','','',0,0,0,0,0,'','','','','','','',0,'','',0,'','','','','','','',0,'','','','','','','','','','','','','','','','','','',0,0,'','','','','','','','','','','','','','','',0,'','','','','',0,0,'','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','','',0,'','','','','',0,'','','','','',0,'','','','','',0,'','','','','',0,'','','','','',0,'','','','','',0,'','','','','',0,'','',0,'','','','','','','','','','','','','','','','','','',0,0,'','','',0,'','','','','','','','',0, 1, 10, '', '', '', '')
