

--DROP  PROCEDURE  GPSQLWEB.procReadMsgcode

CREATE PROCEDURE  GPSQLWEB.procReadMsgcode (
IN P_ID INTEGER,
IN P_MSGLAN VARCHAR(1),
IN P_MSGNUM NUMERIC(4, 0),
IN P_MSGTXT VARCHAR(100),
IN P_FIRSTRESULT INTEGER,
IN P_MAXRESULT INTEGER,
IN P_SORT VARCHAR(255),
IN P_USERNAME VARCHAR(50),
IN P_IPADDRESS VARCHAR(255),
IN P_USERAGENT VARCHAR(500)
)
RESULT SETS 1
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Not Null Default '';
  Declare WhereClause Varchar(32000) Not Null Default '';
  Declare SortClause Varchar(32000) Not Null Default '';
  Declare C1 Cursor With Return For stmt;

    IF P_SORT IS NOT NULL AND LENGTH(P_SORT) > 0 THEN
        Set SortClause = ' ORDER BY ' || P_SORT ;
    END IF;

    -- WHERE CLAUSE
    
        
        IF P_ID > 0 THEN
            SET WhereClause = WhereClause || ' AND ID = '|| P_ID ||' ';
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
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, ID ,MSGLAN ,MSGNUM ,MSGTXT  FROM GPSQLWEB.MSGCODE  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT  ID ,MSGLAN ,MSGNUM ,MSGTXT  FROM  GPSQLWEB.MSGCODE WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT  ID ,MSGLAN ,MSGNUM ,MSGTXT  FROM  GPSQLWEB.MSGCODE WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadMsgcode', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadMsgcode (0,'',0,'', 1, 10, '', '', '', '')
