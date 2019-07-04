

--DROP  PROCEDURE  GPSQLWEB.procReadAa2tprcl

CREATE PROCEDURE  GPSQLWEB.procReadAa2tprcl (
    IN P_ROWID BIGINT,
 IN P_PCLEMP VARCHAR(2),
    IN P_PCLDEL VARCHAR(2),
    IN P_PCLCLA NUMERIC(15 , 0),
    IN P_PCLNOM VARCHAR(40),
    IN P_PCLCTA VARCHAR(12),

    IN P_FIRSTRESULT INTEGER,
    IN P_MAXRESULT INTEGER,
    IN P_SORT VARCHAR(255),
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500)
)
RESULT SETS 1
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Not Null Default '';
  Declare WhereClause Varchar(32000) Not Null Default '';
  Declare SortClause Varchar(32000) Not Null Default '';
  Declare C1 Cursor With Return For stmt;

    IF P_SORT IS NOT NULL AND LENGTH(P_SORT) > 0 THEN
        Set SortClause = ' ORDER BY ' || P_SORT ;
    ELSE
        Set SortClause = ' ORDER BY substring(PCLCLA, 10,3 ), substring(PCLCLA, 12,2 )';
    END IF;

    -- WHERE CLAUSE
    
        IF P_ROWID IS NOT NULL AND P_ROWID>0 THEN
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.AA2TPRCL) =' || P_ROWID ;
        END IF;
        
        IF P_PCLEMP IS NOT NULL AND length(P_PCLEMP)>0 THEN
            SET P_PCLEMP = UPPER(TRIM(P_PCLEMP));
            SET WhereClause = WhereClause || ' AND PCLEMP LIKE ''%'|| P_PCLEMP ||'%'' ';
        END IF;
    
        
        IF P_PCLDEL IS NOT NULL AND length(P_PCLDEL)>0 THEN
            SET P_PCLDEL = UPPER(TRIM(P_PCLDEL));
            SET WhereClause = WhereClause || ' AND PCLDEL LIKE ''%'|| P_PCLDEL ||'%'' ';
        END IF;
    
        
        IF P_PCLCLA > 0 THEN
            SET WhereClause = WhereClause || ' AND PCLCLA = '|| P_PCLCLA ||' ';
        END IF;
    
        
        IF P_PCLNOM IS NOT NULL AND length(P_PCLNOM)>0 THEN
            SET P_PCLNOM = UPPER(TRIM(P_PCLNOM));
            SET WhereClause = WhereClause || ' AND PCLNOM LIKE ''%'|| P_PCLNOM ||'%'' ';
        END IF;
    
        
        IF P_PCLCTA IS NOT NULL AND length(P_PCLCTA)>0 THEN
            SET P_PCLCTA = UPPER(TRIM(P_PCLCTA));
            SET WhereClause = WhereClause || ' AND PCLCTA LIKE ''%'|| P_PCLCTA ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.AA2TPRCL) as ROWID,PCLEMP ,PCLDEL ,PCLCLA ,PCLNOM ,PCLCTA  FROM GPDATWEB.AA2TPRCL  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AA2TPRCL) as ROWID,PCLEMP ,PCLDEL ,PCLCLA ,PCLNOM ,PCLCTA  FROM  GPDATWEB.AA2TPRCL WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AA2TPRCL) as ROWID,PCLEMP ,PCLDEL ,PCLCLA ,PCLNOM ,PCLCTA  FROM  GPDATWEB.AA2TPRCL WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadAa2tprcl', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadAa2tprcl ('','',0,'','', 1, 10, '', '', '', '')
