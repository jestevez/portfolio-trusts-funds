--DROP  PROCEDURE  GPSQLWEB.procReadWebMenu;


CREATE PROCEDURE GPSQLWEB.PROCREADWEBMENU ( IN P_ID INTEGER,
                                            IN P_NAME VARCHAR(50),
                                            IN P_URL VARCHAR(100),
                                            IN P_PGM VARCHAR(50),
                                            IN P_PARENTID INTEGER,
                                            IN P_ORDERS INTEGER,
                                            IN P_STATUSID INTEGER,
                                            IN P_ISMENU INTEGER,
                                            IN P_FIRSTRESULT INTEGER,
                                            IN P_MAXRESULT INTEGER,
                                            IN P_SORT VARCHAR(255),
                                            IN P_USERNAME VARCHAR(50),
                                            IN P_IPADDRESS VARCHAR(255),
                                            IN P_USERAGENT VARCHAR(500) )
	RESULT SETS 1
	LANGUAGE SQL
	SPECIFIC GPSQLWEB.PROCREADWEBMENU

BEGIN
DECLARE STRINGSQL VARCHAR ( 32000 ) NOT NULL DEFAULT '' ;
DECLARE WHERECLAUSE VARCHAR ( 32000 ) NOT NULL DEFAULT '' ;
DECLARE SORTCLAUSE VARCHAR ( 32000 ) NOT NULL DEFAULT '' ;
DECLARE C1 CURSOR WITH RETURN FOR STMT ;

IF P_SORT IS NOT NULL AND LENGTH ( P_SORT ) > 0 THEN
SET SORTCLAUSE = ' ORDER BY ' || P_SORT ;
END IF ;



IF P_ID > 0 THEN
SET WHERECLAUSE = WHERECLAUSE || ' AND ID = ' || P_ID || ' ' ;
END IF ;


IF P_NAME IS NOT NULL AND LENGTH ( P_NAME ) > 0 THEN
SET P_NAME = TRIM ( P_NAME ) ;
SET WHERECLAUSE = WHERECLAUSE || ' AND NAME LIKE ''%' || P_NAME || '%'' ' ;
END IF ;


IF P_URL IS NOT NULL AND LENGTH ( P_URL ) > 0 THEN
SET P_URL = TRIM ( P_URL ) ;
SET WHERECLAUSE = WHERECLAUSE || ' AND URL LIKE ''%' || P_URL || '%'' ' ;
END IF ;


IF P_PGM IS NOT NULL AND LENGTH ( P_PGM ) > 0 THEN
SET P_PGM = TRIM ( P_PGM ) ;
SET WHERECLAUSE = WHERECLAUSE || ' AND PGM LIKE ''%' || P_PGM || '%'' ' ;
END IF ;


IF P_PARENTID IS NOT NULL THEN
SET WHERECLAUSE = WHERECLAUSE || ' AND PARENTID = ' || P_PARENTID || ' ' ;
END IF ;


IF P_ORDERS IS NOT NULL THEN
SET WHERECLAUSE = WHERECLAUSE || ' AND ORDERS = ' || P_ORDERS || ' ' ;
END IF ;


IF P_STATUSID IS NOT NULL THEN
SET WHERECLAUSE = WHERECLAUSE || ' AND STATUSID = ' || P_STATUSID || ' ' ;
END IF ;


IF P_ISMENU IS NOT NULL THEN
SET WHERECLAUSE = WHERECLAUSE || ' AND ISMENU = ' || P_ISMENU || ' ' ;
END IF ;


IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
SET STRINGSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, ID ,NAME ,URL ,PGM ,PARENTID ,ORDERS ,STATUSID ,ISMENU  FROM GPSQLWEB.WEBMENU  WHERE 1=1 ' || WHERECLAUSE || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN ' || P_FIRSTRESULT || ' and ' || ( ( P_MAXRESULT + P_FIRSTRESULT ) - 1 ) || SORTCLAUSE ;
ELSE
IF P_MAXRESULT > 0 THEN
SET STRINGSQL = 'SELECT  ID ,NAME ,URL ,PGM ,PARENTID ,ORDERS ,STATUSID ,ISMENU  FROM  GPSQLWEB.WEBMENU WHERE 1=1 ' || WHERECLAUSE || SORTCLAUSE || ' FETCH FIRST ' || P_MAXRESULT || ' ROWS ONLY ' ;
ELSE
SET STRINGSQL = 'SELECT  ID ,NAME ,URL ,PGM ,PARENTID ,ORDERS ,STATUSID ,ISMENU  FROM  GPSQLWEB.WEBMENU WHERE 1=1 ' || WHERECLAUSE || SORTCLAUSE ;
END IF ;
END IF ;

CALL GPSQLWEB . PROCCREATEWEBAUDIT ( P_IPADDRESS , P_USERAGENT , P_USERNAME , 'Leer' , 'procReadWebMenu' , STRINGSQL ) ;
PREPARE STMT FROM STRINGSQL ;

OPEN C1 ;
END
GO



--call GPPGMWEB.procReadWebMenu (0,'','','',0,0,0,0, 1, 10, '', '', '', '')