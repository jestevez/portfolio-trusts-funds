

--DROP  PROCEDURE  GPSQLWEB.procCountAa2tprcl

CREATE PROCEDURE  GPSQLWEB.procCountAa2tprcl (
    IN P_PCLEMP VARCHAR(2),
    IN P_PCLDEL VARCHAR(2),
    IN P_PCLCLA NUMERIC(15 , 0),
    IN P_PCLNOM VARCHAR(40),
    IN P_PCLCTA VARCHAR(12),
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

        
        IF P_PCLEMP IS NOT NULL AND length(P_PCLEMP)>0 THEN
            SET P_PCLEMP = UPPER(TRIM(P_PCLEMP));
            SET WhereClause = WhereClause || ' AND PCLEMP LIKE ''%'|| P_PCLEMP ||'%'' ';
        END IF;
    
        
        IF P_PCLDEL IS NOT NULL AND length(P_PCLDEL)>0 THEN
            SET P_PCLDEL = UPPER(TRIM(P_PCLDEL));
            SET WhereClause = WhereClause || ' AND PCLDEL LIKE ''%'|| P_PCLDEL ||'%'' ';
        END IF;
    
        
        IF P_PCLCLA IS NOT NULL AND length(P_PCLCLA)>0 THEN
            SET P_PCLCLA = UPPER(TRIM(P_PCLCLA));
            SET WhereClause = WhereClause || ' AND PCLCLA LIKE ''%'|| P_PCLCLA ||'%'' ';
        END IF;
    
        
        IF P_PCLNOM IS NOT NULL AND length(P_PCLNOM)>0 THEN
            SET P_PCLNOM = UPPER(TRIM(P_PCLNOM));
            SET WhereClause = WhereClause || ' AND PCLNOM LIKE ''%'|| P_PCLNOM ||'%'' ';
        END IF;
    
        
        IF P_PCLCTA IS NOT NULL AND length(P_PCLCTA)>0 THEN
            SET P_PCLCTA = UPPER(TRIM(P_PCLCTA));
            SET WhereClause = WhereClause || ' AND PCLCTA LIKE ''%'|| P_PCLCTA ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.AA2TPRCL  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountAa2tprcl', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountAa2tprcl('','',0,'','', '', '', '')
