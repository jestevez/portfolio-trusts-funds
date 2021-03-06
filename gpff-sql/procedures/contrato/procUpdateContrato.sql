
-- DROP PROCEDURE GPSQLWEB.procUpdateContrato

CREATE PROCEDURE GPSQLWEB.procUpdateContrato
(
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

    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Default '';
  Declare V_CANT INT DEFAULT 0;
  DECLARE V_FECGRA DECIMAL(8, 0);
  DECLARE V_HORA DECIMAL(6, 0);
  DECLARE V_WECHA DECIMAL(6, 0);
  DECLARE V_COMAEF DECIMAL(15 , 2);
  DECLARE V_VLOCOA CHAR(12);
  SET P_MSGCODE = 9999; 

  SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.CONTRATO WHERE RRN(GPDATWEB.CONTRATO) =  P_ROWID ;

  IF V_CANT > 1 THEN
	SET P_MSGCODE = 9001;
        SET StringSQL = '9001 - HAY MAS DE UN REGISTRO CON LA CLAVE PRIMARIA';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateContrato', StringSQL);
        RETURN;
  END IF;

  IF V_CANT = 0 THEN
	SET P_MSGCODE = 9000;
        SET StringSQL = '9000 - NO HAY REGISTROS QUE MODIFICAR CODIGO';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateContrato', StringSQL);
        RETURN;
  END IF;

  
  SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.TABCF WHERE NTAB=P_NTAB;
  IF V_CANT = 0 THEN
	SET P_MSGCODE = 1009;
        SET StringSQL = '1009 - CODIGO TABLA DE COMISION NO EXISTE';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procUpdateContrato', StringSQL);
        RETURN;
  END IF;

  SELECT COUNT(1) INTO V_CANT FROM gpdatweb.aa2tfide WHERE TRIM(FIDCLA) =  P_CONEMP || P_CONDEL;
  IF V_CANT = 0 THEN
	SET P_MSGCODE = 1002;
        SET StringSQL = '1002 - AREA NO EXISTE';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procUpdateContrato', StringSQL);
        RETURN;
  END IF;


  SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.AA2TDIV WHERE DIVCLA=P_COSDIV;
  IF V_CANT = 0 THEN
	SET P_MSGCODE = 1004;
        SET StringSQL = '1004 - DIVISA NO EXISTE';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procUpdateContrato', StringSQL);
        RETURN;
  END IF;
    
  SELECT 
        CAST (YEAR(current timestamp) || substr( digits (MONTH(current timestamp)),9) || substr( digits (DAY(current timestamp)),9) AS DECIMAL(8,0)),
        CAST (substr( digits (HOUR(current timestamp)),9) || substr( digits (MINUTE(current timestamp)),9) || substr( digits (SECOND(current timestamp)),9) AS DECIMAL(6,0) )
           INTO V_FECGRA, V_HORA  FROM SYSIBM.SYSDUMMY1 ;
  


  UPDATE GPDATWEB.CONTRATO SET CONEMP= P_CONEMP , CONDEL= P_CONDEL , CTNFMT= P_CTNFMT , NUCONT= P_NUCONT , CLICLA= P_CLICLA , DATFID= P_DATFID , DATGES= P_DATGES , DATFOP= P_DATFOP , DATFVL= P_DATFVL , DATFEU= P_DATFEU , DATFEI= P_DATFEI , FECVEN= P_FECVEN , FECSYS= P_FECSYS , DATPRM= P_DATPRM , DATMAX= P_DATMAX , DATINT= P_DATINT , DATMIN= P_DATMIN , DATMAE= P_DATMAE , DATMNT= P_DATMNT , DATMTA= P_DATMTA , DATGA1= P_DATGA1 , DATGA2= P_DATGA2 , DATGA3= P_DATGA3 , DATDE1= P_DATDE1 , DATDE2= P_DATDE2 , DATDE3= P_DATDE3 , DATDIC= P_DATDIC , DATDIS= P_DATDIS , DATMES= P_DATMES , DATDIA= P_DATDIA , DATMEA= P_DATMEA , DATPCC= P_DATPCC , DATREB= P_DATREB , DATPER= P_DATPER , CTNUSO= P_CTNUSO , CTNANU= P_CTNANU , EMPRE= P_EMPRE , CEEMP= P_CEEMP , COSDIV= P_COSDIV , CONMNT= P_CONMNT , MNTCO1= P_MNTCO1 , NTAB= P_NTAB , FIJVAR= P_FIJVAR , MNTCOM= P_MNTCOM , COMFIJ= P_COMFIJ , COMAPC= P_COMAPC , COMAPF= P_COMAPF , COMCCU= P_COMCCU , RENOV= P_RENOV , FRMPA= P_FRMPA , RP= P_RP , NOMRE= P_NOMRE , CEDRE= P_CEDRE , ECRE= P_ECRE , PRORE= P_PRORE , POBRE= P_POBRE , CERE= P_CERE , FOLRE= P_FOLRE , FOLRE1= P_FOLRE1 , TOMRE= P_TOMRE , TOMRE1= P_TOMRE1 , ASIRE= P_ASIRE , ASIRE1= P_ASIRE1 , OBJ1= P_OBJ1 , OBJ2= P_OBJ2 , OBJ3= P_OBJ3 , OBJ4= P_OBJ4 , OBJ5= P_OBJ5 , FECPRO= P_FECPRO , FECEJE= P_FECEJE , AUTORI= P_AUTORI , PEAUT1= P_PEAUT1 , COAUT1= P_COAUT1 , CEDUL1= P_CEDUL1 , PEAUT2= P_PEAUT2 , COAUT2= P_COAUT2 , CEDUL2= P_CEDUL2 , PEAUT3= P_PEAUT3 , COAUT3= P_COAUT3 , CEDUL3= P_CEDUL3 , USUARI= P_USUARI , COMI= P_COMI , NUMCTA= P_NUMCTA , SECCI= P_SECCI , VIGEN= P_VIGEN , NUMOFI= P_NUMOFI , CANT1= P_CANT1 , CANT2= P_CANT2 , LINCO1= P_LINCO1 , LINCO2= P_LINCO2 , OPCION= P_OPCION , DIAS= P_DIAS , DIA1= P_DIA1 , LIN1= P_LIN1 , LIN2= P_LIN2 , LIN3= P_LIN3 , LIN4= P_LIN4 , LIN5= P_LIN5 , LIN6= P_LIN6 , LIN7= P_LIN7 , LIN8= P_LIN8 , LIN9= P_LIN9 , LI1= P_LI1 , LI2= P_LI2 , LI10= P_LI10 , LI11= P_LI11 , LI12= P_LI12 , LIN13= P_LIN13 , LIN14= P_LIN14 , FORPAG= P_FORPAG , INDIVI= P_INDIVI , CONJUN= P_CONJUN , CTEI= P_CTEI , AHOI= P_AHOI , CHEI= P_CHEI , REII= P_REII , CTEP= P_CTEP , AHOP= P_AHOP , CHEP= P_CHEP , REIP= P_REIP , NCTEI= P_NCTEI , NAHOI= P_NAHOI , NCTEP= P_NCTEP , NAHOP= P_NAHOP , MATDEP= P_MATDEP , FIDE= P_FIDE , ECFIDE= P_ECFIDE , PRFIDE= P_PRFIDE , POFIDE= P_POFIDE , CEFIDE= P_CEFIDE , NFIDE= P_NFIDE , FID2= P_FID2 , ECFID2= P_ECFID2 , PRFID2= P_PRFID2 , POFID2= P_POFID2 , CEFID2= P_CEFID2 , NFID2= P_NFID2 , BENE1= P_BENE1 , ECBEN1= P_ECBEN1 , PRBEN1= P_PRBEN1 , POBEN1= P_POBEN1 , CEBEN1= P_CEBEN1 , NBEN1= P_NBEN1 , BENE2= P_BENE2 , ECBEN2= P_ECBEN2 , PRBEN2= P_PRBEN2 , POBEN2= P_POBEN2 , CEBEN2= P_CEBEN2 , NBEN2= P_NBEN2 , BENE3= P_BENE3 , ECBEN3= P_ECBEN3 , PRBEN3= P_PRBEN3 , POBEN3= P_POBEN3 , CEBEN3= P_CEBEN3 , NBEN3= P_NBEN3 , BENE4= P_BENE4 , ECBEN4= P_ECBEN4 , PRBEN4= P_PRBEN4 , POBEN4= P_POBEN4 , CEBEN4= P_CEBEN4 , NBEN4= P_NBEN4 , BENE5= P_BENE5 , ECBEN5= P_ECBEN5 , PRBEN5= P_PRBEN5 , POBEN5= P_POBEN5 , CEBEN5= P_CEBEN5 , NBEN5= P_NBEN5 , BENE6= P_BENE6 , ECBEN6= P_ECBEN6 , PRBEN6= P_PRBEN6 , POBEN6= P_POBEN6 , CEBEN6= P_CEBEN6 , NBEN6= P_NBEN6 , NOMASE= P_NOMASE , DIRASE= P_DIRASE , EDADVI= P_EDADVI , HONORA= P_HONORA , PRCA= P_PRCA , PRCP= P_PRCP , AUTOR1= P_AUTOR1 , ECAUT1= P_ECAUT1 , PRAUT1= P_PRAUT1 , POAUT1= P_POAUT1 , CEAUT1= P_CEAUT1 , AUTOR2= P_AUTOR2 , ECAUT2= P_ECAUT2 , PRAUT2= P_PRAUT2 , POAUT2= P_POAUT2 , CEAUT2= P_CEAUT2 , AUTOR3= P_AUTOR3 , ECAUT3= P_ECAUT3 , PRAUT3= P_PRAUT3 , POAUT3= P_POAUT3 , CEAUT3= P_CEAUT3 , NUMAPO= P_NUMAPO , CONFFI= P_CONFFI , CONIMP= P_CONIMP , CONPRC= P_CONPRC , ENVIO= P_ENVIO , GESCOD= P_GESCOD , COMAPO= P_COMAPO , COMRET= P_COMRET , COMFIN= P_COMFIN , NFALI= P_NFALI , NFALP= P_NFALP , ICOAPO= P_ICOAPO , ICORET= P_ICORET , ICOFIN= P_ICOFIN , CLICON= P_CLICON  WHERE RRN(GPDATWEB.CONTRATO) =  P_ROWID ;

  SELECT CAST (substr( digits (DAY(current timestamp)),9) || substr( digits (MONTH(current timestamp)),9) || substr( digits (YEAR(current timestamp)),9) AS DECIMAL(8,0))
       INTO V_WECHA  FROM SYSIBM.SYSDUMMY1;
  
  SELECT COMAEF INTO V_COMAEF FROM GPDATWEB.TABCF WHERE NTAB=P_NTAB;
  
  SET V_VLOCOA = P_CONEMP || P_CONDEL || '        ';
 
  --Generacion Apuntes Contables
  --CALL GPSQLWEB.PROCINTCOH2I('CC2', V_COMAEF, 0, P_CLICLA, V_VLOCOA, 0, V_WECHA, P_COSDIV, 0 , 'H' , '   ');
  -- Actualizacion Saldos 
  --CALL GPSQLWEB.PROCGES001();
  --Listado Apuntes Contables 
  --CALL GPSQLWEB.PROCLAPUNAT();


  SET P_MSGCODE = 0;    
  Set StringSQL = 'UPDATE GPDATWEB.CONTRATO SET CONEMP= '''||P_CONEMP || ''' , CONDEL= '''||P_CONDEL || ''' , CTNFMT= '''||P_CTNFMT || ''' , NUCONT= '''||P_NUCONT || ''' , CLICLA= '''||P_CLICLA || ''' , DATFID= '''||P_DATFID || ''' , DATGES= '''||P_DATGES || ''' , DATFOP= '''||P_DATFOP || ''' , DATFVL= '''||P_DATFVL || ''' , DATFEU= '''||P_DATFEU || ''' , DATFEI= '''||P_DATFEI || ''' , FECVEN= '''||P_FECVEN || ''' , FECSYS= '''||P_FECSYS || ''' , DATPRM= '''||P_DATPRM || ''' , DATMAX= '''||P_DATMAX || ''' , DATINT= '''||P_DATINT || ''' , DATMIN= '''||P_DATMIN || ''' , DATMAE= '''||P_DATMAE || ''' , DATMNT= '''||P_DATMNT || ''' , DATMTA= '''||P_DATMTA || ''' , DATGA1= '''||P_DATGA1 || ''' , DATGA2= '''||P_DATGA2 || ''' , DATGA3= '''||P_DATGA3 || ''' , DATDE1= '''||P_DATDE1 || ''' , DATDE2= '''||P_DATDE2 || ''' , DATDE3= '''||P_DATDE3 || ''' , DATDIC= '''||P_DATDIC || ''' , DATDIS= '''||P_DATDIS || ''' , DATMES= '''||P_DATMES || ''' , DATDIA= '''||P_DATDIA || ''' , DATMEA= '''||P_DATMEA || ''' , DATPCC= '''||P_DATPCC || ''' , DATREB= '''||P_DATREB || ''' , DATPER= '''||P_DATPER || ''' , CTNUSO= '''||P_CTNUSO || ''' , CTNANU= '''||P_CTNANU || ''' , EMPRE= '''||P_EMPRE || ''' , CEEMP= '''||P_CEEMP || ''' , COSDIV= '''||P_COSDIV || ''' , CONMNT= '''||P_CONMNT || ''' , MNTCO1= '''||P_MNTCO1 || ''' , NTAB= '''||P_NTAB || ''' , FIJVAR= '''||P_FIJVAR || ''' , MNTCOM= '''||P_MNTCOM || ''' , COMFIJ= '''||P_COMFIJ || ''' , COMAPC= '''||P_COMAPC || ''' , COMAPF= '''||P_COMAPF || ''' , COMCCU= '''||P_COMCCU || ''' , RENOV= '''||P_RENOV || ''' , FRMPA= '''||P_FRMPA || ''' , RP= '''||P_RP || ''' , NOMRE= '''||P_NOMRE || ''' , CEDRE= '''||P_CEDRE || ''' , ECRE= '''||P_ECRE || ''' , PRORE= '''||P_PRORE || ''' , POBRE= '''||P_POBRE || ''' , CERE= '''||P_CERE || ''' , FOLRE= '''||P_FOLRE || ''' , FOLRE1= '''||P_FOLRE1 || ''' , TOMRE= '''||P_TOMRE || ''' , TOMRE1= '''||P_TOMRE1 || ''' , ASIRE= '''||P_ASIRE || ''' , ASIRE1= '''||P_ASIRE1 || ''' , OBJ1= '''||P_OBJ1 || ''' , OBJ2= '''||P_OBJ2 || ''' , OBJ3= '''||P_OBJ3 || ''' , OBJ4= '''||P_OBJ4 || ''' , OBJ5= '''||P_OBJ5 || ''' , FECPRO= '''||P_FECPRO || ''' , FECEJE= '''||P_FECEJE || ''' , AUTORI= '''||P_AUTORI || ''' , PEAUT1= '''||P_PEAUT1 || ''' , COAUT1= '''||P_COAUT1 || ''' , CEDUL1= '''||P_CEDUL1 || ''' , PEAUT2= '''||P_PEAUT2 || ''' , COAUT2= '''||P_COAUT2 || ''' , CEDUL2= '''||P_CEDUL2 || ''' , PEAUT3= '''||P_PEAUT3 || ''' , COAUT3= '''||P_COAUT3 || ''' , CEDUL3= '''||P_CEDUL3 || ''' , USUARI= '''||P_USUARI || ''' , COMI= '''||P_COMI || ''' , NUMCTA= '''||P_NUMCTA || ''' , SECCI= '''||P_SECCI || ''' , VIGEN= '''||P_VIGEN || ''' , NUMOFI= '''||P_NUMOFI || ''' , CANT1= '''||P_CANT1 || ''' , CANT2= '''||P_CANT2 || ''' , LINCO1= '''||P_LINCO1 || ''' , LINCO2= '''||P_LINCO2 || ''' , OPCION= '''||P_OPCION || ''' , DIAS= '''||P_DIAS || ''' , DIA1= '''||P_DIA1 || ''' , LIN1= '''||P_LIN1 || ''' , LIN2= '''||P_LIN2 || ''' , LIN3= '''||P_LIN3 || ''' , LIN4= '''||P_LIN4 || ''' , LIN5= '''||P_LIN5 || ''' , LIN6= '''||P_LIN6 || ''' , LIN7= '''||P_LIN7 || ''' , LIN8= '''||P_LIN8 || ''' , LIN9= '''||P_LIN9 || ''' , LI1= '''||P_LI1 || ''' , LI2= '''||P_LI2 || ''' , LI10= '''||P_LI10 || ''' , LI11= '''||P_LI11 || ''' , LI12= '''||P_LI12 || ''' , LIN13= '''||P_LIN13 || ''' , LIN14= '''||P_LIN14 || ''' , FORPAG= '''||P_FORPAG || ''' , INDIVI= '''||P_INDIVI || ''' , CONJUN= '''||P_CONJUN || ''' , CTEI= '''||P_CTEI || ''' , AHOI= '''||P_AHOI || ''' , CHEI= '''||P_CHEI || ''' , REII= '''||P_REII || ''' , CTEP= '''||P_CTEP || ''' , AHOP= '''||P_AHOP || ''' , CHEP= '''||P_CHEP || ''' , REIP= '''||P_REIP || ''' , NCTEI= '''||P_NCTEI || ''' , NAHOI= '''||P_NAHOI || ''' , NCTEP= '''||P_NCTEP || ''' , NAHOP= '''||P_NAHOP || ''' , MATDEP= '''||P_MATDEP || ''' , FIDE= '''||P_FIDE || ''' , ECFIDE= '''||P_ECFIDE || ''' , PRFIDE= '''||P_PRFIDE || ''' , POFIDE= '''||P_POFIDE || ''' , CEFIDE= '''||P_CEFIDE || ''' , NFIDE= '''||P_NFIDE || ''' , FID2= '''||P_FID2 || ''' , ECFID2= '''||P_ECFID2 || ''' , PRFID2= '''||P_PRFID2 || ''' , POFID2= '''||P_POFID2 || ''' , CEFID2= '''||P_CEFID2 || ''' , NFID2= '''||P_NFID2 || ''' , BENE1= '''||P_BENE1 || ''' , ECBEN1= '''||P_ECBEN1 || ''' , PRBEN1= '''||P_PRBEN1 || ''' , POBEN1= '''||P_POBEN1 || ''' , CEBEN1= '''||P_CEBEN1 || ''' , NBEN1= '''||P_NBEN1 || ''' , BENE2= '''||P_BENE2 || ''' , ECBEN2= '''||P_ECBEN2 || ''' , PRBEN2= '''||P_PRBEN2 || ''' , POBEN2= '''||P_POBEN2 || ''' , CEBEN2= '''||P_CEBEN2 || ''' , NBEN2= '''||P_NBEN2 || ''' , BENE3= '''||P_BENE3 || ''' , ECBEN3= '''||P_ECBEN3 || ''' , PRBEN3= '''||P_PRBEN3 || ''' , POBEN3= '''||P_POBEN3 || ''' , CEBEN3= '''||P_CEBEN3 || ''' , NBEN3= '''||P_NBEN3 || ''' , BENE4= '''||P_BENE4 || ''' , ECBEN4= '''||P_ECBEN4 || ''' , PRBEN4= '''||P_PRBEN4 || ''' , POBEN4= '''||P_POBEN4 || ''' , CEBEN4= '''||P_CEBEN4 || ''' , NBEN4= '''||P_NBEN4 || ''' , BENE5= '''||P_BENE5 || ''' , ECBEN5= '''||P_ECBEN5 || ''' , PRBEN5= '''||P_PRBEN5 || ''' , POBEN5= '''||P_POBEN5 || ''' , CEBEN5= '''||P_CEBEN5 || ''' , NBEN5= '''||P_NBEN5 || ''' , BENE6= '''||P_BENE6 || ''' , ECBEN6= '''||P_ECBEN6 || ''' , PRBEN6= '''||P_PRBEN6 || ''' , POBEN6= '''||P_POBEN6 || ''' , CEBEN6= '''||P_CEBEN6 || ''' , NBEN6= '''||P_NBEN6 || ''' , NOMASE= '''||P_NOMASE || ''' , DIRASE= '''||P_DIRASE || ''' , EDADVI= '''||P_EDADVI || ''' , HONORA= '''||P_HONORA || ''' , PRCA= '''||P_PRCA || ''' , PRCP= '''||P_PRCP || ''' , AUTOR1= '''||P_AUTOR1 || ''' , ECAUT1= '''||P_ECAUT1 || ''' , PRAUT1= '''||P_PRAUT1 || ''' , POAUT1= '''||P_POAUT1 || ''' , CEAUT1= '''||P_CEAUT1 || ''' , AUTOR2= '''||P_AUTOR2 || ''' , ECAUT2= '''||P_ECAUT2 || ''' , PRAUT2= '''||P_PRAUT2 || ''' , POAUT2= '''||P_POAUT2 || ''' , CEAUT2= '''||P_CEAUT2 || ''' , AUTOR3= '''||P_AUTOR3 || ''' , ECAUT3= '''||P_ECAUT3 || ''' , PRAUT3= '''||P_PRAUT3 || ''' , POAUT3= '''||P_POAUT3 || ''' , CEAUT3= '''||P_CEAUT3 || ''' , NUMAPO= '''||P_NUMAPO || ''' , CONFFI= '''||P_CONFFI || ''' , CONIMP= '''||P_CONIMP || ''' , CONPRC= '''||P_CONPRC || ''' , ENVIO= '''||P_ENVIO || ''' , GESCOD= '''||P_GESCOD || ''' , COMAPO= '''||P_COMAPO || ''' , COMRET= '''||P_COMRET || ''' , COMFIN= '''||P_COMFIN || ''' , NFALI= '''||P_NFALI || ''' , NFALP= '''||P_NFALP || ''' , ICOAPO= '''||P_ICOAPO || ''' , ICORET= '''||P_ICORET || ''' , ICOFIN= '''||P_ICOFIN || ''' , CLICON= '''||P_CLICON || '''  WHERE RRN(GPDATWEB.CONTRATO) = '''|| P_ROWID || ''';';
  --CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateContrato', StringSQL);
END
GO


