
    
--DROP PROCEDURE GPSQLWEB.procCreateSplfile
    
CREATE PROCEDURE GPSQLWEB.procCreateSplfile
(
IN P_SPLDATA BLOB,
IN P_SPLNAME VARCHAR(255),
IN P_SPLMIME VARCHAR(100),
IN P_SPLDATE TIMESTAMP,
IN P_SPLTYPE VARCHAR(2),
IN P_SPLUSER VARCHAR(10),
IN P_SPLSTATUS VARCHAR(2),             
IN P_USERNAME VARCHAR(50),
IN P_IPADDRESS VARCHAR(255),
IN P_USERAGENT VARCHAR(500),
OUT P_ID BIGINT
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Default '';
  
  INSERT INTO GPSQLWEB.SPLFILE (SPLDATA ,SPLNAME ,SPLMIME ,SPLDATE ,SPLTYPE ,SPLUSER ,SPLSTATUS ) VALUES ( P_SPLDATA , P_SPLNAME , P_SPLMIME , P_SPLDATE , P_SPLTYPE , P_SPLUSER , P_SPLSTATUS );
  SELECT IDENTITY_VAL_LOCAL() AS LASTID INTO P_ID FROM SYSIBM.SYSDUMMY1;

  Set StringSQL = 'INSERT INTO GPSQLWEB.SPLFILE (SPLDATA ,SPLNAME ,SPLMIME ,SPLDATE ,SPLTYPE ,SPLUSER ,SPLSTATUS ) VALUES ( ''RAWDATA'' , '''|| P_SPLNAME || ''' , '''|| P_SPLMIME || ''' , '''|| VARCHAR_FORMAT(P_SPLDATE, 'YYYY-MM-DD HH24:MI:SS')    || ''' , '''|| P_SPLTYPE || ''' , '''|| P_SPLUSER || ''' , '''|| P_SPLSTATUS || ''' )'; 
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateSplfile', StringSQL);
END
GO

