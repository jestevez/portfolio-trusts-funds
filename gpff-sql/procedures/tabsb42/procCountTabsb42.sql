

--DROP  PROCEDURE  GPSQLWEB.procCountTabsb42

CREATE PROCEDURE  GPSQLWEB.procCountTabsb42 (
IN P_T42COD INTEGER,
IN P_T42NOM varchar(50),
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

        
        IF P_T42COD > 0 THEN
            SET WhereClause = WhereClause || ' AND T42COD = '|| P_T42COD ||' ';
        END IF;
    
        
        IF P_T42NOM IS NOT NULL AND length(P_T42NOM)>0 THEN
            SET P_T42NOM = UPPER(TRIM(P_T42NOM));
            SET WhereClause = WhereClause || ' AND T42NOM LIKE ''%'|| P_T42NOM ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.TABSB42  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountTabsb42', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountTabsb42(0,'', '', '', '')
