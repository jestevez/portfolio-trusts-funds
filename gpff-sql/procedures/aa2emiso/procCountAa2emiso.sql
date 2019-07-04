

--DROP  PROCEDURE  GPSQLWEB.procCountAa2emiso

CREATE PROCEDURE  GPSQLWEB.procCountAa2emiso (
     IN P_EMIEMP varchar(2),
 IN P_EMIDEL varchar(2),
 IN P_EMICLA BIGINT,
 IN P_EMINOM varchar(40),
 IN P_EMIMAX double,
 IN P_EMIUTI BIGINT,
 IN P_EMIUFE BIGINT,
 IN P_EMITIP INTEGER,

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

        
        IF P_EMIEMP IS NOT NULL AND length(P_EMIEMP)>0 THEN
            SET P_EMIEMP = UPPER(TRIM(P_EMIEMP));
            SET WhereClause = WhereClause || ' AND EMIEMP LIKE ''%'|| P_EMIEMP ||'%'' ';
        END IF;
    
        
        IF P_EMIDEL IS NOT NULL AND length(P_EMIDEL)>0 THEN
            SET P_EMIDEL = UPPER(TRIM(P_EMIDEL));
            SET WhereClause = WhereClause || ' AND EMIDEL LIKE ''%'|| P_EMIDEL ||'%'' ';
        END IF;
    
        
        IF P_EMICLA IS NOT NULL AND length(P_EMICLA)>0 THEN
            SET P_EMICLA = UPPER(TRIM(P_EMICLA));
            SET WhereClause = WhereClause || ' AND EMICLA LIKE ''%'|| P_EMICLA ||'%'' ';
        END IF;
    
        
        IF P_EMINOM IS NOT NULL AND length(P_EMINOM)>0 THEN
            SET P_EMINOM = UPPER(TRIM(P_EMINOM));
            SET WhereClause = WhereClause || ' AND EMINOM LIKE ''%'|| P_EMINOM ||'%'' ';
        END IF;
    
        
        IF P_EMIMAX IS NOT NULL AND length(P_EMIMAX)>0 THEN
            SET P_EMIMAX = UPPER(TRIM(P_EMIMAX));
            SET WhereClause = WhereClause || ' AND EMIMAX LIKE ''%'|| P_EMIMAX ||'%'' ';
        END IF;
    
        
        IF P_EMIUTI IS NOT NULL AND length(P_EMIUTI)>0 THEN
            SET P_EMIUTI = UPPER(TRIM(P_EMIUTI));
            SET WhereClause = WhereClause || ' AND EMIUTI LIKE ''%'|| P_EMIUTI ||'%'' ';
        END IF;
    
        
        IF P_EMIUFE IS NOT NULL AND length(P_EMIUFE)>0 THEN
            SET P_EMIUFE = UPPER(TRIM(P_EMIUFE));
            SET WhereClause = WhereClause || ' AND EMIUFE LIKE ''%'|| P_EMIUFE ||'%'' ';
        END IF;
    
        
        IF P_EMITIP > 0 THEN
            SET WhereClause = WhereClause || ' AND EMITIP = '|| P_EMITIP ||' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.AA2EMISO  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountAa2emiso', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountAa2emiso('','',0,'','',0,0,0, '', '', '')
