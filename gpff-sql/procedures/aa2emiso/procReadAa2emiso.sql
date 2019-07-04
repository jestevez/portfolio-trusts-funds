

--DROP  PROCEDURE  GPSQLWEB.procReadAa2emiso

CREATE PROCEDURE  GPSQLWEB.procReadAa2emiso (
    IN P_ROWID BIGINT,
 IN P_EMIEMP varchar(2) ,
 IN P_EMIDEL varchar(2) ,
 IN P_EMICLA BIGINT ,
 IN P_EMINOM varchar(40) ,
 IN P_EMIMAX double ,
 IN P_EMIUTI BIGINT ,
 IN P_EMIUFE BIGINT ,
 IN P_EMITIP INTEGER ,

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
    END IF;

    -- WHERE CLAUSE
    
        IF P_ROWID IS NOT NULL AND P_ROWID>0 THEN
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.AA2EMISO) =' || P_ROWID ;
        END IF;
        
        IF P_EMIEMP IS NOT NULL AND length(P_EMIEMP)>0 THEN
            SET P_EMIEMP = UPPER(TRIM(P_EMIEMP));
            SET WhereClause = WhereClause || ' AND EMIEMP LIKE ''%'|| P_EMIEMP ||'%'' ';
        END IF;
    
        
        IF P_EMIDEL IS NOT NULL AND length(P_EMIDEL)>0 THEN
            SET P_EMIDEL = UPPER(TRIM(P_EMIDEL));
            SET WhereClause = WhereClause || ' AND EMIDEL LIKE ''%'|| P_EMIDEL ||'%'' ';
        END IF;
    
        
        IF P_EMICLA > 0 THEN
            SET WhereClause = WhereClause || ' AND EMICLA = '|| P_EMICLA ||' ';
        END IF;
    
        
        IF P_EMINOM IS NOT NULL AND length(P_EMINOM)>0 THEN
            SET P_EMINOM = UPPER(TRIM(P_EMINOM));
            SET WhereClause = WhereClause || ' AND EMINOM LIKE ''%'|| P_EMINOM ||'%'' ';
        END IF;
    
        
        IF P_EMIMAX IS NOT NULL AND length(P_EMIMAX)>0 THEN
            SET P_EMIMAX = UPPER(TRIM(P_EMIMAX));
            SET WhereClause = WhereClause || ' AND EMIMAX LIKE ''%'|| P_EMIMAX ||'%'' ';
        END IF;
    
        
        IF P_EMIUTI > 0 THEN
            SET WhereClause = WhereClause || ' AND EMIUTI = '|| P_EMIUTI ||' ';
        END IF;
    
        
        IF P_EMIUFE > 0 THEN
            SET WhereClause = WhereClause || ' AND EMIUFE = '|| P_EMIUFE ||' ';
        END IF;
    
        
        IF P_EMITIP > 0 THEN
            SET WhereClause = WhereClause || ' AND EMITIP = '|| P_EMITIP ||' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.AA2EMISO) as ROWID,EMIEMP ,EMIDEL ,EMICLA ,EMINOM ,EMIMAX ,EMIUTI ,EMIUFE ,EMITIP  FROM GPDATWEB.AA2EMISO  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AA2EMISO) as ROWID,EMIEMP ,EMIDEL ,EMICLA ,EMINOM ,EMIMAX ,EMIUTI ,EMIUFE ,EMITIP  FROM  GPDATWEB.AA2EMISO WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AA2EMISO) as ROWID,EMIEMP ,EMIDEL ,EMICLA ,EMINOM ,EMIMAX ,EMIUTI ,EMIUFE ,EMITIP  FROM  GPDATWEB.AA2EMISO WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadAa2emiso', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadAa2emiso ('','',0,'','',0,0,0, 1, 10, '', '', '', '')
