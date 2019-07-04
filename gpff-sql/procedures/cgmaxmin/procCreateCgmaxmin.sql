
    
--DROP PROCEDURE GPSQLWEB.procCreateCgmaxmin
    
CREATE PROCEDURE GPSQLWEB.procCreateCgmaxmin
(
    IN P_CGMEMP VARCHAR(2),
    IN P_CGMDEL VARCHAR(2),
    IN P_CGMFMT DECIMAL(3 , 0),
    IN P_CGMNCT DECIMAL(8 , 0),
    IN P_CGMCLI DECIMAL(7 , 0),
    IN P_CGMCOD DECIMAL(2 , 0),
    IN P_CGMMAX DECIMAL(14 , 2),
    IN P_CGMMIN DECIMAL(14 , 2),
    IN P_CGMDS1 DECIMAL(14 , 2),
    IN P_CGMHS1 DECIMAL(14 , 2),
    IN P_CGMPR1 DECIMAL(9 , 6),
    IN P_CGMDS2 DECIMAL(14 , 2),
    IN P_CGMHS2 DECIMAL(14 , 2),
    IN P_CGMPR2 DECIMAL(9 , 6),
    IN P_CGMDS3 DECIMAL(14 , 2),
    IN P_CGMHS3 DECIMAL(14 , 2),
    IN P_CGMPR3 DECIMAL(9 , 6),
    IN P_CGMDS4 DECIMAL(14 , 2),
    IN P_CGMHS4 DECIMAL(14 , 2),
    IN P_CGMPR4 DECIMAL(9 , 6),
    IN P_CGMDS5 DECIMAL(14 , 2),
    IN P_CGMHS5 DECIMAL(14 , 2),
    IN P_CGMPR5 DECIMAL(9 , 6),
    IN P_CGMDS6 DECIMAL(14 , 2),
    IN P_CGMHS6 DECIMAL(14 , 2),
    IN P_CGMPR6 DECIMAL(9 , 6),
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
BEGIN
    Declare StringSQL Varchar(32000) Default '';
    Declare V_CANT INT DEFAULT 0;
 
    SET P_MSGCODE = 9999;
  
    SELECT COUNT(1) INTO V_CANT FROM gpdatweb.aa2tfide WHERE TRIM(FIDCLA) =  P_CGMEMP || P_CGMDEL;
    IF V_CANT = 0 THEN
          SET P_MSGCODE = 1002;
          SET StringSQL = '1002 - AREA NO EXISTE';
          CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateCgmaxmin', StringSQL);
          RETURN;
    END IF;

    SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.AA2MCLI WHERE CLICLA = P_CGMCLI;

    IF V_CANT = 0 THEN
          SET P_MSGCODE = 1010;
          SET StringSQL = '1010 - CLIENTE NO EXISTE';
          CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateCgmaxmin', StringSQL);
          RETURN;
    END IF;

    SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.CONTRATO WHERE CLICLA=P_CGMCLI AND NUCONT=P_CGMNCT AND CONEMP=P_CGMEMP AND CONDEL=P_CGMDEL;

    IF V_CANT = 0 THEN
          SET P_MSGCODE = 1011;
          SET StringSQL = '1011 - NUMERO DE CONTRATO NO EXISTE';
          CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateCgmaxmin', StringSQL);
          RETURN;
    END IF;


   INSERT INTO GPDATWEB.CGMAXMIN (CGMEMP ,CGMDEL ,CGMFMT ,CGMNCT ,CGMCLI ,CGMCOD ,CGMMAX ,CGMMIN ,CGMDS1 ,CGMHS1 ,CGMPR1 ,CGMDS2 ,CGMHS2 ,CGMPR2 ,CGMDS3 ,CGMHS3 ,CGMPR3 ,CGMDS4 ,CGMHS4 ,CGMPR4 ,CGMDS5 ,CGMHS5 ,CGMPR5 ,CGMDS6 ,CGMHS6 ,CGMPR6 )
        VALUES ( P_CGMEMP , P_CGMDEL , P_CGMFMT , P_CGMNCT , P_CGMCLI , P_CGMCOD , P_CGMMAX , P_CGMMIN , P_CGMDS1 , P_CGMHS1 , P_CGMPR1 , P_CGMDS2 , P_CGMHS2 , P_CGMPR2 , P_CGMDS3 , P_CGMHS3 , P_CGMPR3 , P_CGMDS4 , P_CGMHS4 , P_CGMPR4 , P_CGMDS5 , P_CGMHS5 , P_CGMPR5 , P_CGMDS6 , P_CGMHS6 , P_CGMPR6 );

  Set StringSQL = 'INSERT INTO GPDATWEB.CGMAXMIN (CGMEMP ,CGMDEL,CGMFMT ,CGMNCT ,CGMCLI ,CGMCOD ,CGMMAX ,CGMMIN ,CGMDS1 ,CGMHS1 ,CGMPR1 ,CGMDS2 ,CGMHS2 ,CGMPR2 ,CGMDS3 ,CGMHS3 ,CGMPR3 ,CGMDS4 ,CGMHS4 ,CGMPR4 ,CGMDS5 ,CGMHS5 ,CGMPR5 ,CGMDS6 ,CGMHS6 ,CGMPR6 ) VALUES ( '''|| P_CGMEMP || ''' , '''|| P_CGMDEL || ''' , '''|| P_CGMFMT || ''' , '''|| P_CGMNCT || ''' , '''|| P_CGMCLI || ''' , '''|| P_CGMCOD || ''' , '''|| P_CGMMAX || ''' , '''|| P_CGMMIN || ''' , '''|| P_CGMDS1 || ''' , '''|| P_CGMHS1 || ''' , '''|| P_CGMPR1 || ''' , '''|| P_CGMDS2 || ''' , '''|| P_CGMHS2 || ''' , '''|| P_CGMPR2 || ''' , '''|| P_CGMDS3 || ''' , '''|| P_CGMHS3 || ''' , '''|| P_CGMPR3 || ''' , '''|| P_CGMDS4 || ''' , '''|| P_CGMHS4 || ''' , '''|| P_CGMPR4 || ''' , '''|| P_CGMDS5 || ''' , '''|| P_CGMHS5 || ''' , '''|| P_CGMPR5 || ''' , '''|| P_CGMDS6 || ''' , '''|| P_CGMHS6 || ''' , '''|| P_CGMPR6 || ''' )'; 
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateCgmaxmin', StringSQL);
  SET P_MSGCODE = 0;
END
GO


