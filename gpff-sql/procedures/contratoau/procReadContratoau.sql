

--DROP  PROCEDURE  GPSQLWEB.procReadContratoau

CREATE PROCEDURE  GPSQLWEB.procReadContratoau (
    IN P_ROWID BIGINT,
 IN P_CONEMA varchar(2) ,
 IN P_CONDEA varchar(2) ,
 IN P_COSAMI DECIMAL(9 , 6),
    IN P_MOSAMI NUMERIC(15 , 2),
    IN P_SALMIN NUMERIC(15 , 2),

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
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.CONTRATOAU) =' || P_ROWID ;
        END IF;
        
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
    
        
        IF P_MOSAMI > 0 THEN
            SET WhereClause = WhereClause || ' AND MOSAMI = '|| P_MOSAMI ||' ';
        END IF;
    
        
        IF P_SALMIN IS NOT NULL AND length(P_SALMIN)>0 THEN
            SET P_SALMIN = UPPER(TRIM(P_SALMIN));
            SET WhereClause = WhereClause || ' AND SALMIN LIKE ''%'|| P_SALMIN ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.CONTRATOAU) as ROWID,CONEMA ,CONDEA ,COSAMI ,MOSAMI ,SALMIN  FROM GPDATWEB.CONTRATOAU  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(GPDATWEB.CONTRATOAU) as ROWID,CONEMA ,CONDEA ,COSAMI ,MOSAMI ,SALMIN  FROM  GPDATWEB.CONTRATOAU WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(GPDATWEB.CONTRATOAU) as ROWID,CONEMA ,CONDEA ,COSAMI ,MOSAMI ,SALMIN  FROM  GPDATWEB.CONTRATOAU WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadContratoau', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadContratoau ('','',0,0,'', 1, 10, '', '', '', '')
