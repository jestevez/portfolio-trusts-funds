

--DROP  PROCEDURE  GPSQLWEB.procCountAuxcont

CREATE PROCEDURE  GPSQLWEB.procCountAuxcont (
     IN P_AXCARE varchar(4),
 IN P_AXCNCT BIGINT,
 IN P_AXCCAP INTEGER,
 IN P_AXCCPP INTEGER,
 IN P_AXCAMP INTEGER,
 IN P_AXCEDM INTEGER,
 IN P_AXCEMH INTEGER,
 IN P_AXCEMM INTEGER,
 IN P_AXCPRT double,

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

        
        IF P_AXCARE IS NOT NULL AND length(P_AXCARE)>0 THEN
            SET P_AXCARE = UPPER(TRIM(P_AXCARE));
            SET WhereClause = WhereClause || ' AND AXCARE LIKE ''%'|| P_AXCARE ||'%'' ';
        END IF;
    
        
        IF P_AXCNCT IS NOT NULL AND length(P_AXCNCT)>0 THEN
            SET P_AXCNCT = UPPER(TRIM(P_AXCNCT));
            SET WhereClause = WhereClause || ' AND AXCNCT LIKE ''%'|| P_AXCNCT ||'%'' ';
        END IF;
    
        
        IF P_AXCCAP > 0 THEN
            SET WhereClause = WhereClause || ' AND AXCCAP = '|| P_AXCCAP ||' ';
        END IF;
    
        
        IF P_AXCCPP > 0 THEN
            SET WhereClause = WhereClause || ' AND AXCCPP = '|| P_AXCCPP ||' ';
        END IF;
    
        
        IF P_AXCAMP > 0 THEN
            SET WhereClause = WhereClause || ' AND AXCAMP = '|| P_AXCAMP ||' ';
        END IF;
    
        
        IF P_AXCEDM > 0 THEN
            SET WhereClause = WhereClause || ' AND AXCEDM = '|| P_AXCEDM ||' ';
        END IF;
    
        
        IF P_AXCEMH > 0 THEN
            SET WhereClause = WhereClause || ' AND AXCEMH = '|| P_AXCEMH ||' ';
        END IF;
    
        
        IF P_AXCEMM > 0 THEN
            SET WhereClause = WhereClause || ' AND AXCEMM = '|| P_AXCEMM ||' ';
        END IF;
    
        
        IF P_AXCPRT IS NOT NULL AND length(P_AXCPRT)>0 THEN
            SET P_AXCPRT = UPPER(TRIM(P_AXCPRT));
            SET WhereClause = WhereClause || ' AND AXCPRT LIKE ''%'|| P_AXCPRT ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.AUXCONT  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountAuxcont', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountAuxcont('',0,0,0,0,0,0,0,'', '', '', '')
