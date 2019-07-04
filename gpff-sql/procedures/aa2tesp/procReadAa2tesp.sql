

--DROP  PROCEDURE  GPSQLWEB.procReadAa2tesp

CREATE PROCEDURE  GPSQLWEB.procReadAa2tesp (
    IN P_ROWID BIGINT,
 IN P_ESPEMP varchar(2) ,
 IN P_ESPDEL varchar(2) ,
 IN P_ESPCLA BIGINT ,
 IN P_ESPTIP double ,

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
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.AA2TESP) =' || P_ROWID ;
        END IF;
        
        IF P_ESPEMP IS NOT NULL AND length(P_ESPEMP)>0 THEN
            SET P_ESPEMP = UPPER(TRIM(P_ESPEMP));
            SET WhereClause = WhereClause || ' AND ESPEMP LIKE ''%'|| P_ESPEMP ||'%'' ';
        END IF;
    
        
        IF P_ESPDEL IS NOT NULL AND length(P_ESPDEL)>0 THEN
            SET P_ESPDEL = UPPER(TRIM(P_ESPDEL));
            SET WhereClause = WhereClause || ' AND ESPDEL LIKE ''%'|| P_ESPDEL ||'%'' ';
        END IF;
    
        
        IF P_ESPCLA > 0 THEN
            SET WhereClause = WhereClause || ' AND ESPCLA = '|| P_ESPCLA ||' ';
        END IF;
    
        
        IF P_ESPTIP IS NOT NULL AND length(P_ESPTIP)>0 THEN
            SET P_ESPTIP = UPPER(TRIM(P_ESPTIP));
            SET WhereClause = WhereClause || ' AND ESPTIP LIKE ''%'|| P_ESPTIP ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.AA2TESP) as ROWID,ESPEMP ,ESPDEL ,ESPCLA ,ESPTIP  FROM GPDATWEB.AA2TESP  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AA2TESP) as ROWID,ESPEMP ,ESPDEL ,ESPCLA ,ESPTIP  FROM  GPDATWEB.AA2TESP WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AA2TESP) as ROWID,ESPEMP ,ESPDEL ,ESPCLA ,ESPTIP  FROM  GPDATWEB.AA2TESP WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadAa2tesp', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadAa2tesp ('','',0,'', 1, 10, '', '', '', '')
