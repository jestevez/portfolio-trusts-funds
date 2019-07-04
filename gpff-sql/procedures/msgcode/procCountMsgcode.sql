--DROP  PROCEDURE  GPSQLWEB.procCountMsgcode

CREATE PROCEDURE  GPSQLWEB.procCountMsgcode (
IN P_ID INTEGER,
IN P_MSGLAN VARCHAR(1),
IN P_MSGNUM NUMERIC(4, 0),
IN P_MSGTXT VARCHAR(100),
IN P_USERNAME VARCHAR(50),
IN P_IPADDRESS VARCHAR(255),
IN P_USERAGENT VARCHAR(32000),
OUT TOTAL INTEGER
)
RESULT SETS 1
LANGUAGE SQL
BEGIN
	Declare StringSQL Varchar(32000) Not Null Default '';
	Declare WhereClause Varchar(32000) Not Null Default '';
	Declare SortClause Varchar(32000) Not Null Default '';
	Declare C1 Cursor With Return For stmt1;
	-- WHERE CLAUSE
        
        IF P_ID IS NOT NULL AND length(P_ID)>0 THEN
            SET P_ID = UPPER(TRIM(P_ID));
            SET WhereClause = WhereClause || ' AND ID LIKE ''%'|| P_ID ||'%'' ';
        END IF;
    
        
        IF P_MSGLAN IS NOT NULL AND length(P_MSGLAN)>0 THEN
            SET P_MSGLAN = UPPER(TRIM(P_MSGLAN));
            SET WhereClause = WhereClause || ' AND MSGLAN LIKE ''%'|| P_MSGLAN ||'%'' ';
        END IF;
    
        
        IF P_MSGNUM > 0 THEN
            SET WhereClause = WhereClause || ' AND MSGNUM = '|| P_MSGNUM ||' ';
        END IF;
    
        
        IF P_MSGTXT IS NOT NULL AND length(P_MSGTXT)>0 THEN
            SET P_MSGTXT = UPPER(TRIM(P_MSGTXT));
            SET WhereClause = WhereClause || ' AND MSGTXT LIKE ''%'|| P_MSGTXT ||'%'' ';
        END IF;
    
	Set StringSQL = 'SELECT COUNT(1) FROM  GPSQLWEB.MSGCODE  WHERE 1=1 ' || WhereClause; 
	PREPARE stmt1 FROM StringSQL;
	CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountMsgcode', StringSQL);
	OPEN c1;
	    FETCH c1 into total;
	CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountMsgcode('','',0,'', '', '', '')
