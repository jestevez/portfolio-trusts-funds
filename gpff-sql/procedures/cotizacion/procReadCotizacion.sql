

--DROP  PROCEDURE  GPSQLWEB.procReadCotizacion

CREATE PROCEDURE  GPSQLWEB.procReadCotizacion (
    IN P_ROWID BIGINT,
    IN P_CTZVAL varchar(12) ,
    IN P_CTZFEC DECIMAL(8 , 0),
    IN P_CTZCOT DECIMAL(18 , 9),
    IN P_CTZCOD varchar(1) ,

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
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.COTIZACION) =' || P_ROWID ;
        END IF;
        
        IF P_CTZVAL IS NOT NULL AND length(P_CTZVAL)>0 THEN
            SET P_CTZVAL = UPPER(TRIM(P_CTZVAL));
            SET WhereClause = WhereClause || ' AND CTZVAL LIKE ''%'|| P_CTZVAL ||'%'' ';
        END IF;
    
        
        IF P_CTZFEC > 0 THEN
            SET WhereClause = WhereClause || ' AND CTZFEC = '|| P_CTZFEC ||' ';
        END IF;
    
        
        IF P_CTZCOT IS NOT NULL AND length(P_CTZCOT)>0 THEN
            SET P_CTZCOT = UPPER(TRIM(P_CTZCOT));
            SET WhereClause = WhereClause || ' AND CTZCOT LIKE ''%'|| P_CTZCOT ||'%'' ';
        END IF;
    
        
        IF P_CTZCOD IS NOT NULL AND length(P_CTZCOD)>0 THEN
            SET P_CTZCOD = UPPER(TRIM(P_CTZCOD));
            SET WhereClause = WhereClause || ' AND CTZCOD LIKE ''%'|| P_CTZCOD ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.COTIZACION) as ROWID,CTZVAL ,CTZFEC ,CTZCOT ,CTZCOD  FROM GPDATWEB.COTIZACION  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(GPDATWEB.COTIZACION) as ROWID,CTZVAL ,CTZFEC ,CTZCOT ,CTZCOD  FROM  GPDATWEB.COTIZACION WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(GPDATWEB.COTIZACION) as ROWID,CTZVAL ,CTZFEC ,CTZCOT ,CTZCOD  FROM  GPDATWEB.COTIZACION WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadCotizacion', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadCotizacion ('',0,'','', 1, 10, '', '', '', '')
