
    
--DROP PROCEDURE GPSQLWEB.procCreateContratoau
    
CREATE PROCEDURE GPSQLWEB.procCreateContratoau
(
    IN P_CONEMA VARCHAR(2),
    IN P_CONDEA VARCHAR(2),
    IN P_COSAMI DECIMAL(9 , 6),
    IN P_MOSAMI NUMERIC(15 , 2),
    IN P_SALMIN NUMERIC(15 , 2),
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
  SELECT COUNT(1) INTO V_CANT FROM gpdatweb.aa2tfide WHERE TRIM(FIDCLA) =  P_CONEMA || P_CONDEA;
  IF V_CANT = 0 THEN
        SET P_MSGCODE = 1002;
        SET StringSQL = '1002 - AREA NO EXISTE';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateCgmaxmin', StringSQL);
        RETURN;
  END IF;
  
  INSERT INTO GPDATWEB.CONTRATOAU (CONEMA ,CONDEA ,COSAMI ,MOSAMI ,SALMIN ) VALUES ( P_CONEMA , P_CONDEA , P_COSAMI , P_MOSAMI , P_SALMIN );

  Set StringSQL = 'INSERT INTO GPDATWEB.CONTRATOAU (CONEMA ,CONDEA ,COSAMI ,MOSAMI ,SALMIN ) VALUES ( '''|| P_CONEMA || ''' , '''|| P_CONDEA || ''' , '''|| P_COSAMI || ''' , '''|| P_MOSAMI || ''' , '''|| P_SALMIN || ''' )'; 
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateContratoau', StringSQL);
  SET P_MSGCODE = 0;
END
GO

