

--DROP  PROCEDURE  GPSQLWEB.procCountContratoau

CREATE PROCEDURE  GPSQLWEB.procCountContratoau (
     IN P_CONEMA varchar(2),
 IN P_CONDEA varchar(2),
 IN P_COSAMI DECIMAL(9 , 6),
    IN P_MOSAMI NUMERIC(15 , 2),
    IN P_SALMIN NUMERIC(15 , 2),

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

        
        IF P_CONEMA IS NOT NULL AND length(P_CONEMA)>0 THEN
            SET P_CONEMA = UPPER(TRIM(P_CONEMA));
            SET WhereClause = WhereClause || ' AND CONEMA LIKE ''%'|| P_CONEMA ||'%'' ';
        END IF;
    
        
        IF P_CONDEA IS NOT NULL AND length(P_CONDEA)>0 THEN
            SET P_CONDEA = UPPER(TRIM(P_CONDEA));
            SET WhereClause = WhereClause || ' AND CONDEA LIKE ''%'|| P_CONDEA ||'%'' ';
        END IF;
    
        
        IF P_COSAMI > 0 THEN
            SET WhereClause = WhereClause || ' AND COSAMI = '|| P_COSAMI ||' ';
        END IF;
    
        
        IF P_MOSAMI IS NOT NULL AND length(P_MOSAMI)>0 THEN
            SET P_MOSAMI = UPPER(TRIM(P_MOSAMI));
            SET WhereClause = WhereClause || ' AND MOSAMI LIKE ''%'|| P_MOSAMI ||'%'' ';
        END IF;
    
        
        IF P_SALMIN IS NOT NULL AND length(P_SALMIN)>0 THEN
            SET P_SALMIN = UPPER(TRIM(P_SALMIN));
            SET WhereClause = WhereClause || ' AND SALMIN LIKE ''%'|| P_SALMIN ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.CONTRATOAU  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountContratoau', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountContratoau('','',0,0,'', '', '', '')
