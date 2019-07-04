

--DROP  PROCEDURE  GPSQLWEB.procCountEmbargos

CREATE PROCEDURE  GPSQLWEB.procCountEmbargos (
     IN P_EEMPRE varchar(2),
 IN P_EDELEG varchar(2),
 IN P_EMOVNI varchar(12),
 IN P_EMONTO double,
 IN P_EMONTT double,
 IN P_EFECHA BIGINT,
 IN P_EFECHF BIGINT,
 IN P_EUSUAR varchar(10),
 IN P_EPANTA varchar(10),
 IN P_EFECMO BIGINT,

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

        
        IF P_EEMPRE IS NOT NULL AND length(P_EEMPRE)>0 THEN
            SET P_EEMPRE = UPPER(TRIM(P_EEMPRE));
            SET WhereClause = WhereClause || ' AND EEMPRE LIKE ''%'|| P_EEMPRE ||'%'' ';
        END IF;
    
        
        IF P_EDELEG IS NOT NULL AND length(P_EDELEG)>0 THEN
            SET P_EDELEG = UPPER(TRIM(P_EDELEG));
            SET WhereClause = WhereClause || ' AND EDELEG LIKE ''%'|| P_EDELEG ||'%'' ';
        END IF;
    
        
        IF P_EMOVNI IS NOT NULL AND length(P_EMOVNI)>0 THEN
            SET P_EMOVNI = UPPER(TRIM(P_EMOVNI));
            SET WhereClause = WhereClause || ' AND EMOVNI LIKE ''%'|| P_EMOVNI ||'%'' ';
        END IF;
    
        
        IF P_EMONTO IS NOT NULL AND length(P_EMONTO)>0 THEN
            SET P_EMONTO = UPPER(TRIM(P_EMONTO));
            SET WhereClause = WhereClause || ' AND EMONTO LIKE ''%'|| P_EMONTO ||'%'' ';
        END IF;
    
        
        IF P_EMONTT IS NOT NULL AND length(P_EMONTT)>0 THEN
            SET P_EMONTT = UPPER(TRIM(P_EMONTT));
            SET WhereClause = WhereClause || ' AND EMONTT LIKE ''%'|| P_EMONTT ||'%'' ';
        END IF;
    
        
        IF P_EFECHA IS NOT NULL AND length(P_EFECHA)>0 THEN
            SET P_EFECHA = UPPER(TRIM(P_EFECHA));
            SET WhereClause = WhereClause || ' AND EFECHA LIKE ''%'|| P_EFECHA ||'%'' ';
        END IF;
    
        
        IF P_EFECHF IS NOT NULL AND length(P_EFECHF)>0 THEN
            SET P_EFECHF = UPPER(TRIM(P_EFECHF));
            SET WhereClause = WhereClause || ' AND EFECHF LIKE ''%'|| P_EFECHF ||'%'' ';
        END IF;
    
        
        IF P_EUSUAR IS NOT NULL AND length(P_EUSUAR)>0 THEN
            SET P_EUSUAR = UPPER(TRIM(P_EUSUAR));
            SET WhereClause = WhereClause || ' AND EUSUAR LIKE ''%'|| P_EUSUAR ||'%'' ';
        END IF;
    
        
        IF P_EPANTA IS NOT NULL AND length(P_EPANTA)>0 THEN
            SET P_EPANTA = UPPER(TRIM(P_EPANTA));
            SET WhereClause = WhereClause || ' AND EPANTA LIKE ''%'|| P_EPANTA ||'%'' ';
        END IF;
    
        
        IF P_EFECMO IS NOT NULL AND length(P_EFECMO)>0 THEN
            SET P_EFECMO = UPPER(TRIM(P_EFECMO));
            SET WhereClause = WhereClause || ' AND EFECMO LIKE ''%'|| P_EFECMO ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.EMBARGOS  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountEmbargos', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountEmbargos('','','','','',0,0,'','',0, '', '', '')
