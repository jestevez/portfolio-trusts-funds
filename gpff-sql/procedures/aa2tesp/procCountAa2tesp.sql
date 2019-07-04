

--DROP  PROCEDURE  GPSQLWEB.procCountAa2tesp

CREATE PROCEDURE  GPSQLWEB.procCountAa2tesp (
     IN P_ESPEMP varchar(2),
 IN P_ESPDEL varchar(2),
 IN P_ESPCLA BIGINT,
 IN P_ESPTIP double,

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

        
        IF P_ESPEMP IS NOT NULL AND length(P_ESPEMP)>0 THEN
            SET P_ESPEMP = UPPER(TRIM(P_ESPEMP));
            SET WhereClause = WhereClause || ' AND ESPEMP LIKE ''%'|| P_ESPEMP ||'%'' ';
        END IF;
    
        
        IF P_ESPDEL IS NOT NULL AND length(P_ESPDEL)>0 THEN
            SET P_ESPDEL = UPPER(TRIM(P_ESPDEL));
            SET WhereClause = WhereClause || ' AND ESPDEL LIKE ''%'|| P_ESPDEL ||'%'' ';
        END IF;
    
        
        IF P_ESPCLA IS NOT NULL AND length(P_ESPCLA)>0 THEN
            SET P_ESPCLA = UPPER(TRIM(P_ESPCLA));
            SET WhereClause = WhereClause || ' AND ESPCLA LIKE ''%'|| P_ESPCLA ||'%'' ';
        END IF;
    
        
        IF P_ESPTIP IS NOT NULL AND length(P_ESPTIP)>0 THEN
            SET P_ESPTIP = UPPER(TRIM(P_ESPTIP));
            SET WhereClause = WhereClause || ' AND ESPTIP LIKE ''%'|| P_ESPTIP ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.AA2TESP  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountAa2tesp', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountAa2tesp('','',0,'', '', '', '')
