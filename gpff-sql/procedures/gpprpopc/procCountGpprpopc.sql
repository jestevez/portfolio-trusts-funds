

--DROP  PROCEDURE  GPSQLWEB.procCountGpprpopc

CREATE PROCEDURE  GPSQLWEB.procCountGpprpopc (
     IN P_OPCARE varchar(4),
 IN P_OPCOPC varchar(1),
 IN P_OPCEDA INTEGER,
 IN P_OPCCLI varchar(12),
 IN P_OPCEDD INTEGER,
 IN P_OPCEDH INTEGER,
 IN P_OPCFIJ double,
 IN P_OPCVAR double,
 IN P_OPCUSR varchar(10),
 IN P_OPCDSP varchar(10),
 IN P_OPCFEC INTEGER,
 IN P_OPCTIM INTEGER,

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

        
        IF P_OPCARE IS NOT NULL AND length(P_OPCARE)>0 THEN
            SET P_OPCARE = UPPER(TRIM(P_OPCARE));
            SET WhereClause = WhereClause || ' AND OPCARE LIKE ''%'|| P_OPCARE ||'%'' ';
        END IF;
    
        
        IF P_OPCOPC IS NOT NULL AND length(P_OPCOPC)>0 THEN
            SET P_OPCOPC = UPPER(TRIM(P_OPCOPC));
            SET WhereClause = WhereClause || ' AND OPCOPC LIKE ''%'|| P_OPCOPC ||'%'' ';
        END IF;
    
        
        IF P_OPCEDA > 0 THEN
            SET WhereClause = WhereClause || ' AND OPCEDA = '|| P_OPCEDA ||' ';
        END IF;
    
        
        IF P_OPCCLI IS NOT NULL AND length(P_OPCCLI)>0 THEN
            SET P_OPCCLI = UPPER(TRIM(P_OPCCLI));
            SET WhereClause = WhereClause || ' AND OPCCLI LIKE ''%'|| P_OPCCLI ||'%'' ';
        END IF;
    
        
        IF P_OPCEDD > 0 THEN
            SET WhereClause = WhereClause || ' AND OPCEDD = '|| P_OPCEDD ||' ';
        END IF;
    
        
        IF P_OPCEDH > 0 THEN
            SET WhereClause = WhereClause || ' AND OPCEDH = '|| P_OPCEDH ||' ';
        END IF;
    
        
        IF P_OPCFIJ IS NOT NULL AND length(P_OPCFIJ)>0 THEN
            SET P_OPCFIJ = UPPER(TRIM(P_OPCFIJ));
            SET WhereClause = WhereClause || ' AND OPCFIJ LIKE ''%'|| P_OPCFIJ ||'%'' ';
        END IF;
    
        
        IF P_OPCVAR IS NOT NULL AND length(P_OPCVAR)>0 THEN
            SET P_OPCVAR = UPPER(TRIM(P_OPCVAR));
            SET WhereClause = WhereClause || ' AND OPCVAR LIKE ''%'|| P_OPCVAR ||'%'' ';
        END IF;
    
        
        IF P_OPCUSR IS NOT NULL AND length(P_OPCUSR)>0 THEN
            SET P_OPCUSR = UPPER(TRIM(P_OPCUSR));
            SET WhereClause = WhereClause || ' AND OPCUSR LIKE ''%'|| P_OPCUSR ||'%'' ';
        END IF;
    
        
        IF P_OPCDSP IS NOT NULL AND length(P_OPCDSP)>0 THEN
            SET P_OPCDSP = UPPER(TRIM(P_OPCDSP));
            SET WhereClause = WhereClause || ' AND OPCDSP LIKE ''%'|| P_OPCDSP ||'%'' ';
        END IF;
    
        
        IF P_OPCFEC > 0 THEN
            SET WhereClause = WhereClause || ' AND OPCFEC = '|| P_OPCFEC ||' ';
        END IF;
    
        
        IF P_OPCTIM > 0 THEN
            SET WhereClause = WhereClause || ' AND OPCTIM = '|| P_OPCTIM ||' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.GPPRPOPC  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountGpprpopc', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountGpprpopc('','',0,'',0,0,'','','','',0,0, '', '', '')
