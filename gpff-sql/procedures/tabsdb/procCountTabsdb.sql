

--DROP  PROCEDURE  GPSQLWEB.procCountTabsdb

CREATE PROCEDURE  GPSQLWEB.procCountTabsdb (
IN P_TSBMOD varchar(3),
IN P_TSBDIN INTEGER,
IN P_TSBTIN INTEGER,
IN P_TSBCIN INTEGER,
IN P_TSBNSI INTEGER,
IN P_TSBCRE INTEGER,
IN P_TSBIDI INTEGER,
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

        
        IF P_TSBMOD IS NOT NULL AND length(P_TSBMOD)>0 THEN
            SET P_TSBMOD = UPPER(TRIM(P_TSBMOD));
            SET WhereClause = WhereClause || ' AND TSBMOD LIKE ''%'|| P_TSBMOD ||'%'' ';
        END IF;
    
        
        IF P_TSBDIN > 0 THEN
            SET WhereClause = WhereClause || ' AND TSBDIN = '|| P_TSBDIN ||' ';
        END IF;
    
        
        IF P_TSBTIN > 0 THEN
            SET WhereClause = WhereClause || ' AND TSBTIN = '|| P_TSBTIN ||' ';
        END IF;
    
        
        IF P_TSBCIN > 0 THEN
            SET WhereClause = WhereClause || ' AND TSBCIN = '|| P_TSBCIN ||' ';
        END IF;
    
        
        IF P_TSBNSI > 0 THEN
            SET WhereClause = WhereClause || ' AND TSBNSI = '|| P_TSBNSI ||' ';
        END IF;
    
        
        IF P_TSBCRE > 0 THEN
            SET WhereClause = WhereClause || ' AND TSBCRE = '|| P_TSBCRE ||' ';
        END IF;
    
        
        IF P_TSBIDI > 0 THEN
            SET WhereClause = WhereClause || ' AND TSBIDI = '|| P_TSBIDI ||' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.TABSDB  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountTabsdb', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountTabsdb('',0,0,0,0,0,0, '', '', '')
