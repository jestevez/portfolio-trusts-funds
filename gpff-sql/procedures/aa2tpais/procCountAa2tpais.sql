

--DROP  PROCEDURE  GPSQLWEB.procCountAa2tpais

CREATE PROCEDURE  GPSQLWEB.procCountAa2tpais (
IN P_PAICLA bigint,
IN P_PAINOM varchar(40),
IN P_PAICTR INTEGER,
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

        
        IF P_PAICLA IS NOT NULL AND length(P_PAICLA)>0 THEN
            SET P_PAICLA = UPPER(TRIM(P_PAICLA));
            SET WhereClause = WhereClause || ' AND PAICLA LIKE ''%'|| P_PAICLA ||'%'' ';
        END IF;
    
        
        IF P_PAINOM IS NOT NULL AND length(P_PAINOM)>0 THEN
            SET P_PAINOM = UPPER(TRIM(P_PAINOM));
            SET WhereClause = WhereClause || ' AND PAINOM LIKE ''%'|| P_PAINOM ||'%'' ';
        END IF;
    
        
        IF P_PAICTR > 0 THEN
            SET WhereClause = WhereClause || ' AND PAICTR = '|| P_PAICTR ||' ';
        END IF;
    
	Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.AA2TPAIS  WHERE 1=1 ' || WhereClause; 
	PREPARE stmt1 FROM StringSQL;
	CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountAa2tpais', StringSQL);
	OPEN c1;
	    FETCH c1 into total;
	CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountAa2tpais('','',0, '', '', '')
