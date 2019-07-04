

--DROP  PROCEDURE  GPSQLWEB.procCountApoderad

CREATE PROCEDURE  GPSQLWEB.procCountApoderad (
     IN P_NUMAPO INTEGER,
 IN P_NOMAPO varchar(50),
 IN P_ECAPO varchar(10),
 IN P_PROAPO varchar(50),
 IN P_POBAPO varchar(50),
 IN P_CEDAPO varchar(71),
 IN P_FOLAPO varchar(50),
 IN P_TOMAPO varchar(50),
 IN P_ASIAPO varchar(50),
 IN P_REPPOR varchar(30),

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

        
        IF P_NUMAPO > 0 THEN
            SET WhereClause = WhereClause || ' AND NUMAPO = '|| P_NUMAPO ||' ';
        END IF;
    
        
        IF P_NOMAPO IS NOT NULL AND length(P_NOMAPO)>0 THEN
            SET P_NOMAPO = UPPER(TRIM(P_NOMAPO));
            SET WhereClause = WhereClause || ' AND NOMAPO LIKE ''%'|| P_NOMAPO ||'%'' ';
        END IF;
    
        
        IF P_ECAPO IS NOT NULL AND length(P_ECAPO)>0 THEN
            SET P_ECAPO = UPPER(TRIM(P_ECAPO));
            SET WhereClause = WhereClause || ' AND ECAPO LIKE ''%'|| P_ECAPO ||'%'' ';
        END IF;
    
        
        IF P_PROAPO IS NOT NULL AND length(P_PROAPO)>0 THEN
            SET P_PROAPO = UPPER(TRIM(P_PROAPO));
            SET WhereClause = WhereClause || ' AND PROAPO LIKE ''%'|| P_PROAPO ||'%'' ';
        END IF;
    
        
        IF P_POBAPO IS NOT NULL AND length(P_POBAPO)>0 THEN
            SET P_POBAPO = UPPER(TRIM(P_POBAPO));
            SET WhereClause = WhereClause || ' AND POBAPO LIKE ''%'|| P_POBAPO ||'%'' ';
        END IF;
    
        
        IF P_CEDAPO IS NOT NULL AND length(P_CEDAPO)>0 THEN
            SET P_CEDAPO = UPPER(TRIM(P_CEDAPO));
            SET WhereClause = WhereClause || ' AND CEDAPO LIKE ''%'|| P_CEDAPO ||'%'' ';
        END IF;
    
        
        IF P_FOLAPO IS NOT NULL AND length(P_FOLAPO)>0 THEN
            SET P_FOLAPO = UPPER(TRIM(P_FOLAPO));
            SET WhereClause = WhereClause || ' AND FOLAPO LIKE ''%'|| P_FOLAPO ||'%'' ';
        END IF;
    
        
        IF P_TOMAPO IS NOT NULL AND length(P_TOMAPO)>0 THEN
            SET P_TOMAPO = UPPER(TRIM(P_TOMAPO));
            SET WhereClause = WhereClause || ' AND TOMAPO LIKE ''%'|| P_TOMAPO ||'%'' ';
        END IF;
    
        
        IF P_ASIAPO IS NOT NULL AND length(P_ASIAPO)>0 THEN
            SET P_ASIAPO = UPPER(TRIM(P_ASIAPO));
            SET WhereClause = WhereClause || ' AND ASIAPO LIKE ''%'|| P_ASIAPO ||'%'' ';
        END IF;
    
        
        IF P_REPPOR IS NOT NULL AND length(P_REPPOR)>0 THEN
            SET P_REPPOR = UPPER(TRIM(P_REPPOR));
            SET WhereClause = WhereClause || ' AND REPPOR LIKE ''%'|| P_REPPOR ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.APODERAD  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountApoderad', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountApoderad(0,'','','','','','','','','', '', '', '')
