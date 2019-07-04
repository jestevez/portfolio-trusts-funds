
    
--DROP PROCEDURE GPSQLWEB.procCreateCotizacion
    
CREATE PROCEDURE GPSQLWEB.procCreateCotizacion
(
    IN P_CTZVAL varchar(12) ,
    IN P_CTZFEC DECIMAL(8 , 0),
    IN P_CTZCOT DECIMAL(18 , 9),
    IN P_CTZCOD varchar(1) ,

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

	SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.VALORA WHERE VLOCOA=P_CTZVAL;

	IF V_CANT = 0 THEN
		SET P_MSGCODE = 1005;
		SET StringSQL = '1005 - VALORA NO EXISTE';
		CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateCotizacion', StringSQL);
		RETURN;
	END IF;
  
  
        INSERT INTO GPDATWEB.COTIZACION (CTZVAL ,CTZFEC ,CTZCOT ,CTZCOD ) VALUES ( P_CTZVAL , P_CTZFEC , P_CTZCOT , P_CTZCOD );

  Set StringSQL = 'INSERT INTO GPDATWEB.COTIZACION (CTZVAL ,CTZFEC ,CTZCOT ,CTZCOD ) VALUES ( '''|| P_CTZVAL || ''' , '''|| P_CTZFEC || ''' , '''|| P_CTZCOT || ''' , '''|| P_CTZCOD || ''' )'; 
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateCotizacion', StringSQL);
  SET P_MSGCODE = 0;
END
GO


