

--DROP  PROCEDURE  GPSQLWEB.procCountCotizacion

CREATE PROCEDURE  GPSQLWEB.procCountCotizacion (
    IN P_CTZVAL varchar(12) ,
    IN P_CTZFEC DECIMAL(8 , 0),
    IN P_CTZCOT DECIMAL(18 , 9),
    IN P_CTZCOD varchar(1) ,

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

        
        IF P_CTZVAL IS NOT NULL AND length(P_CTZVAL)>0 THEN
            SET P_CTZVAL = UPPER(TRIM(P_CTZVAL));
            SET WhereClause = WhereClause || ' AND CTZVAL LIKE ''%'|| P_CTZVAL ||'%'' ';
        END IF;
    
        
        IF P_CTZFEC IS NOT NULL AND length(P_CTZFEC)>0 THEN
            SET P_CTZFEC = UPPER(TRIM(P_CTZFEC));
            SET WhereClause = WhereClause || ' AND CTZFEC LIKE ''%'|| P_CTZFEC ||'%'' ';
        END IF;
    
        
        IF P_CTZCOT IS NOT NULL AND length(P_CTZCOT)>0 THEN
            SET P_CTZCOT = UPPER(TRIM(P_CTZCOT));
            SET WhereClause = WhereClause || ' AND CTZCOT LIKE ''%'|| P_CTZCOT ||'%'' ';
        END IF;
    
        
        IF P_CTZCOD IS NOT NULL AND length(P_CTZCOD)>0 THEN
            SET P_CTZCOD = UPPER(TRIM(P_CTZCOD));
            SET WhereClause = WhereClause || ' AND CTZCOD LIKE ''%'|| P_CTZCOD ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.COTIZACION  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountCotizacion', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountCotizacion('',0,'','', '', '', '')
