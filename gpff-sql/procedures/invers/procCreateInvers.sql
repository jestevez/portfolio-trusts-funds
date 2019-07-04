
    
--DROP PROCEDURE GPSQLWEB.procCreateInvers
    
CREATE PROCEDURE GPSQLWEB.procCreateInvers
(
    IN P_INVEMP CHAR(2),
    IN P_INVDEL CHAR(2),
    IN P_INVCLI NUMERIC(7 , 0),
    IN P_INVVAL CHAR(12),
    IN P_INVINT NUMERIC(7 , 0),
    IN P_INVCLA CHAR(3),
    IN P_INVVEN CHAR(1),
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
    IN P_INV036 CHAR(1),
    IN P_INVTIT DECIMAL(27 , 7),
    IN P_INVPME DECIMAL(9 , 6),
    IN P_INVPIN DECIMAL(9 , 6),
    IN P_INVINF DECIMAL(9 , 2),
    IN P_INVRDE CHAR(1),
    IN P_INVLIS CHAR(1),
    IN P_INVANU CHAR(1),
    IN P_INVSIR CHAR(1),
    IN P_INVICO DECIMAL(15 , 2),
    IN P_INVNOP DECIMAL(10 , 0),
    IN P_INVPER DECIMAL(2 , 0),
    IN P_INVFDE DECIMAL(13 , 2),
    IN P_INVFUI DECIMAL(6 , 0),
    IN P_INVNTI DECIMAL(10 , 0),
    IN P_INVAPR DECIMAL(13 , 2),
    IN P_INVIBS CHAR(1),
    IN P_INVIGC DECIMAL(15 , 2),
    IN P_INVAGD DECIMAL(15 , 2),
    IN P_INVBVI DECIMAL(7 , 0),
    IN P_INVMAR DECIMAL(9 , 6),
    IN P_INVTA1 CHAR(3),
    IN P_INVTA2 DECIMAL(5 , 2),
    IN P_INVIAN DECIMAL(13 , 2),
    IN P_INVBOL CHAR(1),
    IN P_INVIPP CHAR(1),
    IN P_INVVFV CHAR(1),
    IN P_INVPRO DECIMAL(2 , 0),
    IN P_INVPEN DECIMAL(15 , 2),
    IN P_INVPRX DECIMAL(6 , 5),
    IN P_INVVAC CHAR(12),
    IN P_INVNUC DECIMAL(10 , 0),
    IN P_INVPOP DECIMAL(9 , 6),
    IN P_INVBAD DECIMAL(1 , 0),
    IN P_INVVNO DECIMAL(15 , 2),
    IN P_INVLIQ DECIMAL(6 , 0),
    IN P_INVRES DECIMAL(9 , 6),
    IN P_INVTIM DECIMAL(9 , 6),
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Default '';
  SET P_MSGCODE = 9999;
  
        INSERT INTO GPDATWEB.INVERS (INVEMP ,INVDEL ,INVCLI ,INVVAL ,INVINT ,INVCLA ,INVVEN ,INVINE ,INVVTE ,INVPRE ,INVINI ,INVINA ,INVVTO ,INVVTA ,INVEFI ,INVEFF ,INVPRC ,INV036 ,INVTIT ,INVPME ,INVPIN ,INVINF ,INVRDE ,INVLIS ,INVANU ,INVSIR ,INVICO ,INVNOP ,INVPER ,INVFDE ,INVFUI ,INVNTI ,INVAPR ,INVIBS ,INVIGC ,INVAGD ,INVBVI ,INVMAR ,INVTA1 ,INVTA2 ,INVIAN ,INVBOL ,INVIPP ,INVVFV ,INVPRO ,INVPEN ,INVPRX ,INVVAC ,INVNUC ,INVPOP ,INVBAD ,INVVNO ,INVLIQ ,INVRES ,INVTIM ) VALUES ( P_INVEMP , P_INVDEL , P_INVCLI , P_INVVAL , P_INVINT , P_INVCLA , P_INVVEN , P_INVINE , P_INVVTE , P_INVPRE , P_INVINI , P_INVINA , P_INVVTO , P_INVVTA , P_INVEFI , P_INVEFF , P_INVPRC , P_INV036 , P_INVTIT , P_INVPME , P_INVPIN , P_INVINF , P_INVRDE , P_INVLIS , P_INVANU , P_INVSIR , P_INVICO , P_INVNOP , P_INVPER , P_INVFDE , P_INVFUI , P_INVNTI , P_INVAPR , P_INVIBS , P_INVIGC , P_INVAGD , P_INVBVI , P_INVMAR , P_INVTA1 , P_INVTA2 , P_INVIAN , P_INVBOL , P_INVIPP , P_INVVFV , P_INVPRO , P_INVPEN , P_INVPRX , P_INVVAC , P_INVNUC , P_INVPOP , P_INVBAD , P_INVVNO , P_INVLIQ , P_INVRES , P_INVTIM );

  Set StringSQL = 'INSERT INTO GPDATWEB.INVERS (INVEMP ,INVDEL ,INVCLI ,INVVAL ,INVINT ,INVCLA ,INVVEN ,INVINE ,INVVTE ,INVPRE ,INVINI ,INVINA ,INVVTO ,INVVTA ,INVEFI ,INVEFF ,INVPRC ,INV036 ,INVTIT ,INVPME ,INVPIN ,INVINF ,INVRDE ,INVLIS ,INVANU ,INVSIR ,INVICO ,INVNOP ,INVPER ,INVFDE ,INVFUI ,INVNTI ,INVAPR ,INVIBS ,INVIGC ,INVAGD ,INVBVI ,INVMAR ,INVTA1 ,INVTA2 ,INVIAN ,INVBOL ,INVIPP ,INVVFV ,INVPRO ,INVPEN ,INVPRX ,INVVAC ,INVNUC ,INVPOP ,INVBAD ,INVVNO ,INVLIQ ,INVRES ,INVTIM ) VALUES ( '''|| P_INVEMP || ''' , '''|| P_INVDEL || ''' , '''|| P_INVCLI || ''' , '''|| P_INVVAL || ''' , '''|| P_INVINT || ''' , '''|| P_INVCLA || ''' , '''|| P_INVVEN || ''' , '''|| P_INVINE || ''' , '''|| P_INVVTE || ''' , '''|| P_INVPRE || ''' , '''|| P_INVINI || ''' , '''|| P_INVINA || ''' , '''|| P_INVVTO || ''' , '''|| P_INVVTA || ''' , '''|| P_INVEFI || ''' , '''|| P_INVEFF || ''' , '''|| P_INVPRC || ''' , '''|| P_INV036 || ''' , '''|| P_INVTIT || ''' , '''|| P_INVPME || ''' , '''|| P_INVPIN || ''' , '''|| P_INVINF || ''' , '''|| P_INVRDE || ''' , '''|| P_INVLIS || ''' , '''|| P_INVANU || ''' , '''|| P_INVSIR || ''' , '''|| P_INVICO || ''' , '''|| P_INVNOP || ''' , '''|| P_INVPER || ''' , '''|| P_INVFDE || ''' , '''|| P_INVFUI || ''' , '''|| P_INVNTI || ''' , '''|| P_INVAPR || ''' , '''|| P_INVIBS || ''' , '''|| P_INVIGC || ''' , '''|| P_INVAGD || ''' , '''|| P_INVBVI || ''' , '''|| P_INVMAR || ''' , '''|| P_INVTA1 || ''' , '''|| P_INVTA2 || ''' , '''|| P_INVIAN || ''' , '''|| P_INVBOL || ''' , '''|| P_INVIPP || ''' , '''|| P_INVVFV || ''' , '''|| P_INVPRO || ''' , '''|| P_INVPEN || ''' , '''|| P_INVPRX || ''' , '''|| P_INVVAC || ''' , '''|| P_INVNUC || ''' , '''|| P_INVPOP || ''' , '''|| P_INVBAD || ''' , '''|| P_INVVNO || ''' , '''|| P_INVLIQ || ''' , '''|| P_INVRES || ''' , '''|| P_INVTIM || ''' )'; 
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateInvers', StringSQL);
  SET P_MSGCODE = 0;
END
GO

