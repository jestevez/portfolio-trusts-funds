--DROP PROCEDURE GPSQLWEB.procCreateTabsdb
    
CREATE PROCEDURE GPSQLWEB.procCreateTabsdb
(
IN P_TSBMOD VARCHAR(3),
IN P_TSBDIN INTEGER,
IN P_TSBTIN INTEGER,
IN P_TSBCIN INTEGER,
IN P_TSBNSI INTEGER,
IN P_TSBCRE INTEGER,
IN P_TSBIDI INTEGER,
IN P_USERNAME VARCHAR(50),
IN P_IPADDRESS VARCHAR(255),
IN P_USERAGENT VARCHAR(500),
OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Default '';
  Declare V_CANT INT DEFAULT 0;
  
	SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.TABSDB WHERE TSBMOD = P_TSBMOD;

	IF V_CANT > 0 THEN
		SET P_MSGCODE = 9002;
		SET StringSQL = '9002 - CODIGO CLAVE DUPLICADO';
		CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Eliminar', 'procDeleteTabsdb', StringSQL);
		RETURN;
	END IF;

	INSERT INTO GPDATWEB.TABSDB (TSBMOD, TSBDIN ,TSBTIN ,TSBCIN ,TSBNSI ,TSBCRE ,TSBIDI ) VALUES (P_TSBMOD,  P_TSBDIN , P_TSBTIN , P_TSBCIN , P_TSBNSI , P_TSBCRE , P_TSBIDI );
	Set P_MSGCODE = 0;
	Set StringSQL = 'INSERT INTO GPDATWEB.TABSDB (TSBMOD TSBDIN ,TSBTIN ,TSBCIN ,TSBNSI ,TSBCRE ,TSBIDI ) VALUES (''' || P_TSBMOD  ||''' ,  '''|| P_TSBDIN || ''' , '''|| P_TSBTIN || ''' , '''|| P_TSBCIN || ''' , '''|| P_TSBNSI || ''' , '''|| P_TSBCRE || ''' , '''|| P_TSBIDI || ''' )'; 
	CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateTabsdb', StringSQL);
END
GO


