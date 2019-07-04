
    
--DROP PROCEDURE GPSQLWEB.procCreateValora
    
CREATE PROCEDURE GPSQLWEB.procCreateValora
(
   IN P_VLOEMP VARCHAR(2),
                 IN P_VLODEL VARCHAR(2),
                 IN P_VLOCOA VARCHAR(12),
                 IN P_VLONOM VARCHAR(40),
                 IN P_VLOUNI DOUBLE,
                 IN P_VLOLIQ VARCHAR(1),
                 IN P_VLODIV INTEGER,
                 IN P_VLOCLS VARCHAR(1),
                 IN P_VLOISI VARCHAR(12),
                 IN P_VLOCAT VARCHAR(5),
                 IN P_VLOCBE BIGINT(20),
                 IN P_VLOFIS BIGINT(20),
                 IN P_VLOIIN BIGINT(20),
                 IN P_VLONMI INTEGER,
                 IN P_VLOFIN BIGINT(20),
                 IN P_VLOPIN DOUBLE,
                 IN P_VLOIAM BIGINT(20),
                 IN P_VLONMA INTEGER,
                 IN P_VLOFAM BIGINT(20),
                 IN P_VLOPAM DOUBLE,
                 IN P_VLOTAM VARCHAR(1),
                 IN P_VLOMAM VARCHAR(1),
                 IN P_VLOUDE BIGINT(20),
                 IN P_VLOUCA BIGINT(20),
                 IN P_VLOOUC BIGINT(20),
                 IN P_VLOBEL VARCHAR(1),
                 IN P_VLOFUI BIGINT(20),
                 IN P_VLOFUA BIGINT(20),
                 IN P_VLOFON DOUBLE,
                 IN P_VLOSE1 DOUBLE,
                 IN P_VLOSE2 BIGINT(20),
                 IN P_VLOCME BIGINT(20),
                 IN P_VLOFAC DOUBLE,
                 IN P_VLOGAR DOUBLE,
                 IN P_VLOGAD DOUBLE,
                 IN P_VLOCBR DOUBLE,
                 IN P_VLOTUN VARCHAR(20),
                 IN P_VLOHOR VARCHAR(20),
                 IN P_VLOTIP VARCHAR(5),
                 IN P_VLOSPR DOUBLE,
                 IN P_VLOTFO INTEGER,
                 IN P_VLOTAS DOUBLE,
                
  IN P_USERNAME VARCHAR(50),
  IN P_IPADDRESS VARCHAR(255),
  IN P_USERAGENT VARCHAR(500),
  OUT P_VLOCON BIGINT
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Default '';
  
        SELECT  COALESCE(MAX(VLOCON), 0) +1 INTO P_VLOCON FROM GPDATWEB.VALORA;
        INSERT INTO GPDATWEB.VALORA (VLOCON, VLOEMP ,VLODEL ,VLOCOA ,VLONOM ,VLOUNI ,VLOLIQ ,VLODIV ,VLOCLS ,VLOISI ,VLOCAT ,VLOCBE ,VLOFIS ,VLOIIN ,VLONMI ,VLOFIN ,VLOPIN ,VLOIAM ,VLONMA ,VLOFAM ,VLOPAM ,VLOTAM ,VLOMAM ,VLOUDE ,VLOUCA ,VLOOUC ,VLOBEL ,VLOFUI ,VLOFUA ,VLOFON ,VLOSE1 ,VLOSE2 ,VLOCME ,VLOFAC ,VLOGAR ,VLOGAD ,VLOCBR ,VLOTUN ,VLOHOR ,VLOTIP ,VLOSPR ,VLOTFO ,VLOTAS ) VALUES (P_VLOCON,  P_VLOEMP , P_VLODEL , P_VLOCOA , P_VLONOM , P_VLOUNI , P_VLOLIQ , P_VLODIV , P_VLOCLS , P_VLOISI , P_VLOCAT , P_VLOCBE , P_VLOFIS , P_VLOIIN , P_VLONMI , P_VLOFIN , P_VLOPIN , P_VLOIAM , P_VLONMA , P_VLOFAM , P_VLOPAM , P_VLOTAM , P_VLOMAM , P_VLOUDE , P_VLOUCA , P_VLOOUC , P_VLOBEL , P_VLOFUI , P_VLOFUA , P_VLOFON , P_VLOSE1 , P_VLOSE2 , P_VLOCME , P_VLOFAC , P_VLOGAR , P_VLOGAD , P_VLOCBR , P_VLOTUN , P_VLOHOR , P_VLOTIP , P_VLOSPR , P_VLOTFO , P_VLOTAS );

  Set StringSQL = 'INSERT INTO GPDATWEB.VALORA (VLOCON VLOEMP ,VLODEL ,VLOCOA ,VLONOM ,VLOUNI ,VLOLIQ ,VLODIV ,VLOCLS ,VLOISI ,VLOCAT ,VLOCBE ,VLOFIS ,VLOIIN ,VLONMI ,VLOFIN ,VLOPIN ,VLOIAM ,VLONMA ,VLOFAM ,VLOPAM ,VLOTAM ,VLOMAM ,VLOUDE ,VLOUCA ,VLOOUC ,VLOBEL ,VLOFUI ,VLOFUA ,VLOFON ,VLOSE1 ,VLOSE2 ,VLOCME ,VLOFAC ,VLOGAR ,VLOGAD ,VLOCBR ,VLOTUN ,VLOHOR ,VLOTIP ,VLOSPR ,VLOTFO ,VLOTAS ) VALUES (''' || P_VLOCON  ||''' ,  '''|| P_VLOEMP || ''' , '''|| P_VLODEL || ''' , '''|| P_VLOCOA || ''' , '''|| P_VLONOM || ''' , '''|| P_VLOUNI || ''' , '''|| P_VLOLIQ || ''' , '''|| P_VLODIV || ''' , '''|| P_VLOCLS || ''' , '''|| P_VLOISI || ''' , '''|| P_VLOCAT || ''' , '''|| P_VLOCBE || ''' , '''|| P_VLOFIS || ''' , '''|| P_VLOIIN || ''' , '''|| P_VLONMI || ''' , '''|| P_VLOFIN || ''' , '''|| P_VLOPIN || ''' , '''|| P_VLOIAM || ''' , '''|| P_VLONMA || ''' , '''|| P_VLOFAM || ''' , '''|| P_VLOPAM || ''' , '''|| P_VLOTAM || ''' , '''|| P_VLOMAM || ''' , '''|| P_VLOUDE || ''' , '''|| P_VLOUCA || ''' , '''|| P_VLOOUC || ''' , '''|| P_VLOBEL || ''' , '''|| P_VLOFUI || ''' , '''|| P_VLOFUA || ''' , '''|| P_VLOFON || ''' , '''|| P_VLOSE1 || ''' , '''|| P_VLOSE2 || ''' , '''|| P_VLOCME || ''' , '''|| P_VLOFAC || ''' , '''|| P_VLOGAR || ''' , '''|| P_VLOGAD || ''' , '''|| P_VLOCBR || ''' , '''|| P_VLOTUN || ''' , '''|| P_VLOHOR || ''' , '''|| P_VLOTIP || ''' , '''|| P_VLOSPR || ''' , '''|| P_VLOTFO || ''' , '''|| P_VLOTAS || ''' )'; 
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateValora', StringSQL);
END
GO


