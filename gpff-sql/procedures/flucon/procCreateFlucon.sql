
    
--DROP PROCEDURE GPSQLWEB.procCreateFlucon
    
CREATE PROCEDURE GPSQLWEB.procCreateFlucon
(
IN P_FLCEMP VARCHAR(2),
IN P_FLCDEL VARCHAR(2),
IN P_FLCCLI INTEGER,
IN P_FLCTIP VARCHAR(1),
IN P_FLCCON VARCHAR(30),
IN P_FLCHOR INTEGER,
IN P_FLCPAN VARCHAR(10),
IN P_FLCUSU VARCHAR(10),
IN P_USERNAME VARCHAR(50),
IN P_IPADDRESS VARCHAR(255),
IN P_USERAGENT VARCHAR(500),
OUT P_FLCCOD INTEGER
)
LANGUAGE SQL
BEGIN
	DECLARE V_HORA DECIMAL(6, 0) DEFAULT 1;
	Declare StringSQL Varchar(32000) Default '';

        -- HORA ACTUAL DEL SISTEMA EN FORMATO DECIMAL
        SELECT CAST (substr( digits (HOUR(current timestamp)),9) || substr( digits (MINUTE(current timestamp)),9) || substr( digits (SECOND(current timestamp)),9) AS DECIMAL(6,0) ) INTO V_HORA FROM SYSIBM.SYSDUMMY1;

        SELECT COALESCE(MAX(FLCCOD), 0) +1 INTO P_FLCCOD FROM GPDATWEB.FLUCON;
        INSERT INTO GPDATWEB.FLUCON (FLCCOD, FLCEMP ,FLCDEL ,FLCCLI ,FLCTIP ,FLCCON ,FLCHOR ,FLCPAN ,FLCUSU ) VALUES (P_FLCCOD,  P_FLCEMP , P_FLCDEL , P_FLCCLI , P_FLCTIP , P_FLCCON , V_HORA , P_FLCPAN , P_USERNAME);

	Set StringSQL = 'INSERT INTO GPDATWEB.FLUCON (FLCCOD FLCEMP ,FLCDEL ,FLCCLI ,FLCTIP ,FLCCON ,FLCHOR ,FLCPAN ,FLCUSU ) VALUES (''' || P_FLCCOD  ||''' ,  '''|| P_FLCEMP || ''' , '''|| P_FLCDEL || ''' , '''|| P_FLCCLI || ''' , '''|| P_FLCTIP || ''' , '''|| P_FLCCON || ''' , '''|| V_HORA || ''' , '''|| P_FLCPAN || ''' , '''|| P_USERNAME || ''' )'; 
  	CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateFlucon', StringSQL);
END
GO

