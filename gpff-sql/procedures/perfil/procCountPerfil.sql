

--DROP  PROCEDURE  GPSQLWEB.procCountPerfil

CREATE PROCEDURE  GPSQLWEB.procCountPerfil (
     IN P_PRFPRF varchar(10),
 IN P_PRFNOM varchar(45),
 IN P_PRFCED varchar(12),

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

        
        IF P_PRFPRF IS NOT NULL AND length(P_PRFPRF)>0 THEN
            SET P_PRFPRF = UPPER(TRIM(P_PRFPRF));
            SET WhereClause = WhereClause || ' AND PRFPRF LIKE ''%'|| P_PRFPRF ||'%'' ';
        END IF;
    
        
        IF P_PRFNOM IS NOT NULL AND length(P_PRFNOM)>0 THEN
            SET P_PRFNOM = UPPER(TRIM(P_PRFNOM));
            SET WhereClause = WhereClause || ' AND PRFNOM LIKE ''%'|| P_PRFNOM ||'%'' ';
        END IF;
    
        
        IF P_PRFCED IS NOT NULL AND length(P_PRFCED)>0 THEN
            SET P_PRFCED = UPPER(TRIM(P_PRFCED));
            SET WhereClause = WhereClause || ' AND PRFCED LIKE ''%'|| P_PRFCED ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.PERFIL  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountPerfil', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountPerfil('','','', '', '', '')
