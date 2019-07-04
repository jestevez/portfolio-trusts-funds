--DROP PROCEDURE GPSQLWEB.procCreateAa2tdih
   
CREATE PROCEDURE GPSQLWEB.procCreateAa2tdih
(
IN P_DIHCLA DECIMAL(15, 0),
IN P_DIHNOM VARCHAR(40),
IN P_DIHABR VARCHAR(3),
IN P_DIHCCO DECIMAL(15 , 6),
IN P_DIHCVE DECIMAL(15 , 6),
IN P_DIHFIX DECIMAL(15 , 6),
IN P_DIHCTA VARCHAR(12),
IN P_DIHFIB DECIMAL(10 , 6),
IN P_DIHFEH DECIMAL(8 , 0),
IN P_USERNAME VARCHAR(50),
IN P_IPADDRESS VARCHAR(255),
IN P_USERAGENT VARCHAR(500),
OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
BEGIN
	Declare StringSQL Varchar(32000) Default '';
	Declare V_CANT INT DEFAULT 0;
	Declare V_DIHFEG decimal(8 , 0);
	Declare V_DIHHOR decimal(6 , 0);
	Declare V_DIHPAN char(10);
	Declare V_DIHABR char(3);

	Set V_DIHPAN = 'QPADEV0000';

	SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.AA2TDIV where DIVCLA=P_DIHCLA;

	IF V_CANT = 0 THEN
		SET P_MSGCODE = 1004;
		SET StringSQL = '1004 - DIVISA NO EXISTE';
		CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateAa2tdih', StringSQL);
		RETURN;
	END IF;

	SELECT 
        CAST (YEAR(current timestamp) || substr( digits (MONTH(current timestamp)),9) || substr( digits (DAY(current timestamp)),9) AS DECIMAL(8,0)),
        CAST (substr( digits (HOUR(current timestamp)),9) || substr( digits (MINUTE(current timestamp)),9) || substr( digits (SECOND(current timestamp)),9) AS DECIMAL(6,0) )
            INTO V_DIHFEG, V_DIHHOR FROM SYSIBM.SYSDUMMY1;

	INSERT INTO GPDATWEB.AA2TDIH (DIHCLA, DIHNOM ,DIHABR ,DIHCCO ,DIHCVE ,DIHFIX ,DIHCTA ,DIHFIB ,DIHFEH ,DIHFEG ,DIHHOR ,DIHPAN ,DIHUSU ) 
		VALUES (P_DIHCLA,  P_DIHNOM , P_DIHABR , P_DIHCCO , P_DIHCVE , P_DIHFIX , P_DIHCTA , P_DIHFIB , P_DIHFEH , V_DIHFEG, V_DIHHOR, V_DIHPAN , P_USERNAME );

	SET P_MSGCODE = 0;
	Set StringSQL = 'INSERT INTO GPDATWEB.AA2TDIH (DIHCLA DIHNOM ,DIHABR ,DIHCCO ,DIHCVE ,DIHFIX ,DIHCTA ,DIHFIB ,DIHFEH ,DIHFEG ,DIHHOR ,DIHPAN ,DIHUSU ) VALUES (''' || P_DIHCLA  ||''' ,  '''|| P_DIHNOM || ''' , '''|| P_DIHABR || ''' , '''|| P_DIHCCO || ''' , '''|| P_DIHCVE || ''' , '''|| P_DIHFIX || ''' , '''|| P_DIHCTA || ''' , '''|| P_DIHFIB || ''' , '''|| P_DIHFEH || ''' , '''|| V_DIHFEG || ''' , '''|| V_DIHHOR || ''' , '''|| V_DIHPAN || ''' , '''|| P_USERNAME || ''' )'; 
	CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateAa2tdih', StringSQL);
END
GO


