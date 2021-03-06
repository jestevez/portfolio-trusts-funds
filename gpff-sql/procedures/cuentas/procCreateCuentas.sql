--DROP PROCEDURE GPSQLWEB.procCreateCuentas
    
CREATE PROCEDURE GPSQLWEB.procCreateCuentas
(
IN P_CTCCLI DECIMAL(7 , 0),
IN P_CTCCTA VARCHAR(20),
IN P_CTCEMP VARCHAR(2),
IN P_CTCDEL VARCHAR(2),
IN P_CTCTIP VARCHAR(1),
IN P_CTCAGE DECIMAL(7 , 0),
IN P_CTCSAL NUMERIC(14 , 2),
IN P_CTCDIV DECIMAL(3 , 0),
IN P_CTCAUX VARCHAR(14),
IN P_CTCREF VARCHAR(12),
IN P_CTCBAN VARCHAR(40),
IN P_CTCDES VARCHAR(1),
IN P_USERNAME VARCHAR(50),
IN P_IPADDRESS VARCHAR(255),
IN P_USERAGENT VARCHAR(500),
OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
BEGIN
	Declare StringSQL Varchar(32000) Default '';
  	Declare V_CANT INT DEFAULT 0;

	IF P_CTCCLI IS NULL
		OR P_CTCCTA IS NULL
		OR P_CTCEMP IS NULL 
		OR P_CTCDEL IS NULL
		OR P_CTCTIP IS NULL 
		OR P_CTCAGE IS NULL
		OR P_CTCSAL IS NULL 
		OR P_CTCDIV IS NULL
		OR P_CTCAUX IS NULL
		OR P_CTCREF IS NULL 
		OR P_CTCBAN IS NULL
		OR P_CTCDES IS NULL THEN
	SET P_MSGCODE = 9003;
		SET StringSQL = '9003 - PARAMETROS REQUERIDOS ESTAN VACIOS';
		CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateCuentas', StringSQL);
		RETURN;
	END IF;

	SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.CUENTAS WHERE CTCCTA = P_CTCCTA AND CTCCLI = P_CTCCLI;

	  IF V_CANT > 0 THEN
		SET P_MSGCODE = 9002;
		SET StringSQL = '9002 - CODIGO CLAVE DUPLICADO';
		CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateCuentas', StringSQL);
		RETURN;
	  END IF;

	

	INSERT INTO GPDATWEB.CUENTAS (CTCCTA, CTCCLI ,CTCEMP ,CTCDEL ,CTCTIP ,CTCAGE ,CTCSAL ,CTCDIV ,CTCAUX ,CTCREF ,CTCBAN ,CTCDES ) VALUES (P_CTCCTA,  P_CTCCLI , P_CTCEMP , P_CTCDEL , P_CTCTIP , P_CTCAGE , P_CTCSAL , P_CTCDIV , P_CTCAUX , P_CTCREF , P_CTCBAN , P_CTCDES );
	SET P_MSGCODE = 0;
	Set StringSQL = 'INSERT INTO GPDATWEB.CUENTAS (CTCCTA CTCCLI ,CTCEMP ,CTCDEL ,CTCTIP ,CTCAGE ,CTCSAL ,CTCDIV ,CTCAUX ,CTCREF ,CTCBAN ,CTCDES ) VALUES (''' || P_CTCCTA  ||''' ,  '''|| P_CTCCLI || ''' , '''|| P_CTCEMP || ''' , '''|| P_CTCDEL || ''' , '''|| P_CTCTIP || ''' , '''|| P_CTCAGE || ''' , '''|| P_CTCSAL || ''' , '''|| P_CTCDIV || ''' , '''|| P_CTCAUX || ''' , '''|| P_CTCREF || ''' , '''|| P_CTCBAN || ''' , '''|| P_CTCDES || ''' )'; 
	CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateCuentas', StringSQL);
END
GO


