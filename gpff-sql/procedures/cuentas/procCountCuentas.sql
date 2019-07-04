

--DROP  PROCEDURE  GPSQLWEB.procCountCuentas

CREATE PROCEDURE  GPSQLWEB.procCountCuentas (
     IN P_CTCCLI BIGINT,
 IN P_CTCCTA varchar(20),
 IN P_CTCEMP varchar(2),
 IN P_CTCDEL varchar(2),
 IN P_CTCTIP varchar(1),
 IN P_CTCAGE BIGINT,
 IN P_CTCSAL BIGINT,
 IN P_CTCDIV INTEGER,
 IN P_CTCAUX varchar(14),
 IN P_CTCREF varchar(12),
 IN P_CTCBAN varchar(40),
 IN P_CTCDES varchar(1),

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

        
        IF P_CTCCLI IS NOT NULL AND length(P_CTCCLI)>0 THEN
            SET P_CTCCLI = UPPER(TRIM(P_CTCCLI));
            SET WhereClause = WhereClause || ' AND CTCCLI LIKE ''%'|| P_CTCCLI ||'%'' ';
        END IF;
    
        
        IF P_CTCCTA IS NOT NULL AND length(P_CTCCTA)>0 THEN
            SET P_CTCCTA = UPPER(TRIM(P_CTCCTA));
            SET WhereClause = WhereClause || ' AND CTCCTA LIKE ''%'|| P_CTCCTA ||'%'' ';
        END IF;
    
        
        IF P_CTCEMP IS NOT NULL AND length(P_CTCEMP)>0 THEN
            SET P_CTCEMP = UPPER(TRIM(P_CTCEMP));
            SET WhereClause = WhereClause || ' AND CTCEMP LIKE ''%'|| P_CTCEMP ||'%'' ';
        END IF;
    
        
        IF P_CTCDEL IS NOT NULL AND length(P_CTCDEL)>0 THEN
            SET P_CTCDEL = UPPER(TRIM(P_CTCDEL));
            SET WhereClause = WhereClause || ' AND CTCDEL LIKE ''%'|| P_CTCDEL ||'%'' ';
        END IF;
    
        
        IF P_CTCTIP IS NOT NULL AND length(P_CTCTIP)>0 THEN
            SET P_CTCTIP = UPPER(TRIM(P_CTCTIP));
            SET WhereClause = WhereClause || ' AND CTCTIP LIKE ''%'|| P_CTCTIP ||'%'' ';
        END IF;
    
        
        IF P_CTCAGE IS NOT NULL AND length(P_CTCAGE)>0 THEN
            SET P_CTCAGE = UPPER(TRIM(P_CTCAGE));
            SET WhereClause = WhereClause || ' AND CTCAGE LIKE ''%'|| P_CTCAGE ||'%'' ';
        END IF;
    
        
        IF P_CTCSAL IS NOT NULL AND length(P_CTCSAL)>0 THEN
            SET P_CTCSAL = UPPER(TRIM(P_CTCSAL));
            SET WhereClause = WhereClause || ' AND CTCSAL LIKE ''%'|| P_CTCSAL ||'%'' ';
        END IF;
    
        
        IF P_CTCDIV > 0 THEN
            SET WhereClause = WhereClause || ' AND CTCDIV = '|| P_CTCDIV ||' ';
        END IF;
    
        
        IF P_CTCAUX IS NOT NULL AND length(P_CTCAUX)>0 THEN
            SET P_CTCAUX = UPPER(TRIM(P_CTCAUX));
            SET WhereClause = WhereClause || ' AND CTCAUX LIKE ''%'|| P_CTCAUX ||'%'' ';
        END IF;
    
        
        IF P_CTCREF IS NOT NULL AND length(P_CTCREF)>0 THEN
            SET P_CTCREF = UPPER(TRIM(P_CTCREF));
            SET WhereClause = WhereClause || ' AND CTCREF LIKE ''%'|| P_CTCREF ||'%'' ';
        END IF;
    
        
        IF P_CTCBAN IS NOT NULL AND length(P_CTCBAN)>0 THEN
            SET P_CTCBAN = UPPER(TRIM(P_CTCBAN));
            SET WhereClause = WhereClause || ' AND CTCBAN LIKE ''%'|| P_CTCBAN ||'%'' ';
        END IF;
    
        
        IF P_CTCDES IS NOT NULL AND length(P_CTCDES)>0 THEN
            SET P_CTCDES = UPPER(TRIM(P_CTCDES));
            SET WhereClause = WhereClause || ' AND CTCDES LIKE ''%'|| P_CTCDES ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.CUENTAS  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountCuentas', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountCuentas('','','','','','','',0,'','','','', '', '', '')
