

--DROP  PROCEDURE  GPSQLWEB.procCountAa2ttpro

CREATE PROCEDURE  GPSQLWEB.procCountAa2ttpro (
     IN P_PROEMP varchar(2),
 IN P_PRODEL varchar(2),
 IN P_PROCLA NUMERIC(15 , 0),
 IN P_PRONOM varchar(40),

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

        
        IF P_PROEMP IS NOT NULL AND length(P_PROEMP)>0 THEN
            SET P_PROEMP = UPPER(TRIM(P_PROEMP));
            SET WhereClause = WhereClause || ' AND PROEMP LIKE ''%'|| P_PROEMP ||'%'' ';
        END IF;
    
        
        IF P_PRODEL IS NOT NULL AND length(P_PRODEL)>0 THEN
            SET P_PRODEL = UPPER(TRIM(P_PRODEL));
            SET WhereClause = WhereClause || ' AND PRODEL LIKE ''%'|| P_PRODEL ||'%'' ';
        END IF;
    
        
        IF P_PROCLA IS NOT NULL AND length(P_PROCLA)>0 THEN
            SET P_PROCLA = UPPER(TRIM(P_PROCLA));
            SET WhereClause = WhereClause || ' AND PROCLA LIKE ''%'|| P_PROCLA ||'%'' ';
        END IF;
    
        
        IF P_PRONOM IS NOT NULL AND length(P_PRONOM)>0 THEN
            SET P_PRONOM = UPPER(TRIM(P_PRONOM));
            SET WhereClause = WhereClause || ' AND PRONOM LIKE ''%'|| P_PRONOM ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.AA2TTPRO  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountAa2ttpro', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountAa2ttpro('','',0,'', '', '', '')
