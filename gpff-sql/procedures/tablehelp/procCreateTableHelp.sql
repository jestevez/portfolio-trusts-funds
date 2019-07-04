
    
--GPSQLWEB
    
CREATE PROCEDURE GPSQLWEB.procCreateTableHelp
(
   IN P_CODE VARCHAR(2),
                 IN P_NAME VARCHAR(100),
                 IN P_TABLENAME VARCHAR(100),
                 IN P_TABLECODE VARCHAR(100),
                 IN P_TABLEDESC VARCHAR(100),
                 IN P_TABLEPARENT VARCHAR(100),
                
  IN P_USERNAME VARCHAR(50),
  IN P_IPADDRESS VARCHAR(255),
  IN P_USERAGENT VARCHAR(500),
  OUT P_ID INTEGER
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Not Null Default '';
  
        INSERT INTO  GPSQLWEB.TABLEHELP (CODE ,NAME ,TABLENAME ,TABLECODE ,TABLEDESC ,TABLEPARENT ) VALUES ( P_CODE , P_NAME , P_TABLENAME , P_TABLECODE , P_TABLEDESC , P_TABLEPARENT );
        SELECT IDENTITY_VAL_LOCAL() AS LASTID INTO P_ID FROM SYSIBM.SYSDUMMY1;

  Set StringSQL = 'INSERT INTO  GPSQLWEB.TABLEHELP (CODE ,NAME ,TABLENAME ,TABLECODE ,TABLEDESC ,TABLEPARENT ) VALUES ( '''|| P_CODE || ''' , '''|| P_NAME || ''' , '''|| P_TABLENAME || ''' , '''|| P_TABLECODE || ''' , '''|| P_TABLEDESC || ''' , '''|| P_TABLEPARENT || ''' )'; 
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateTableHelp', StringSQL);
END
GO
