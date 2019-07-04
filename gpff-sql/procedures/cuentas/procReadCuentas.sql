

--DROP  PROCEDURE  GPSQLWEB.procReadCuentas

CREATE PROCEDURE  GPSQLWEB.procReadCuentas (
     IN P_CTCCLI BIGINT ,
 IN P_CTCCTA varchar(20) ,
 IN P_CTCEMP varchar(2) ,
 IN P_CTCDEL varchar(2) ,
 IN P_CTCTIP varchar(1) ,
 IN P_CTCAGE BIGINT ,
 IN P_CTCSAL BIGINT ,
 IN P_CTCDIV INTEGER ,
 IN P_CTCAUX varchar(14) ,
 IN P_CTCREF varchar(12) ,
 IN P_CTCBAN varchar(40) ,
 IN P_CTCDES varchar(1) ,

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
    
        
        IF P_CTCCLI > 0 THEN
            SET WhereClause = WhereClause || ' AND CTCCLI = '|| P_CTCCLI ||' ';
        END IF;
    
        
        IF P_CTCCTA IS NOT NULL AND length(P_CTCCTA)>0 THEN
            SET P_CTCCTA = UPPER(TRIM(P_CTCCTA));
            SET WhereClause = WhereClause || ' AND CTCCTA LIKE ''%'|| P_CTCCTA ||'%'' ';
        END IF;
    
        
        IF P_CTCEMP IS NOT NULL AND length(P_CTCEMP)>0 THEN
            SET P_CTCEMP = UPPER(TRIM(P_CTCEMP));
            SET WhereClause = WhereClause || ' AND CTCEMP LIKE ''%'|| P_CTCEMP ||'%'' ';
        END IF;
    
        
        IF P_CTCDEL IS NOT NULL AND length(P_CTCDEL)>0 THEN
            SET P_CTCDEL = UPPER(TRIM(P_CTCDEL));
            SET WhereClause = WhereClause || ' AND CTCDEL LIKE ''%'|| P_CTCDEL ||'%'' ';
        END IF;
    
        
        IF P_CTCTIP IS NOT NULL AND length(P_CTCTIP)>0 THEN
            SET P_CTCTIP = UPPER(TRIM(P_CTCTIP));
            SET WhereClause = WhereClause || ' AND CTCTIP LIKE ''%'|| P_CTCTIP ||'%'' ';
        END IF;
    
        
        IF P_CTCAGE > 0 THEN
            SET WhereClause = WhereClause || ' AND CTCAGE = '|| P_CTCAGE ||' ';
        END IF;
    
        
        IF P_CTCSAL > 0 THEN
            SET WhereClause = WhereClause || ' AND CTCSAL = '|| P_CTCSAL ||' ';
        END IF;
    
        
        IF P_CTCDIV > 0 THEN
            SET WhereClause = WhereClause || ' AND CTCDIV = '|| P_CTCDIV ||' ';
        END IF;
    
        
        IF P_CTCAUX IS NOT NULL AND length(P_CTCAUX)>0 THEN
            SET P_CTCAUX = UPPER(TRIM(P_CTCAUX));
            SET WhereClause = WhereClause || ' AND CTCAUX LIKE ''%'|| P_CTCAUX ||'%'' ';
        END IF;
    
        
        IF P_CTCREF IS NOT NULL AND length(P_CTCREF)>0 THEN
            SET P_CTCREF = UPPER(TRIM(P_CTCREF));
            SET WhereClause = WhereClause || ' AND CTCREF LIKE ''%'|| P_CTCREF ||'%'' ';
        END IF;
    
        
        IF P_CTCBAN IS NOT NULL AND length(P_CTCBAN)>0 THEN
            SET P_CTCBAN = UPPER(TRIM(P_CTCBAN));
            SET WhereClause = WhereClause || ' AND CTCBAN LIKE ''%'|| P_CTCBAN ||'%'' ';
        END IF;
    
        
        IF P_CTCDES IS NOT NULL AND length(P_CTCDES)>0 THEN
            SET P_CTCDES = UPPER(TRIM(P_CTCDES));
            SET WhereClause = WhereClause || ' AND CTCDES LIKE ''%'|| P_CTCDES ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, CTCCLI ,CTCCTA ,CTCEMP ,CTCDEL ,CTCTIP ,CTCAGE ,CTCSAL ,CTCDIV ,CTCAUX ,CTCREF ,CTCBAN ,CTCDES  FROM GPDATWEB.CUENTAS  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT  CTCCLI ,CTCCTA ,CTCEMP ,CTCDEL ,CTCTIP ,CTCAGE ,CTCSAL ,CTCDIV ,CTCAUX ,CTCREF ,CTCBAN ,CTCDES  FROM  GPDATWEB.CUENTAS WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT  CTCCLI ,CTCCTA ,CTCEMP ,CTCDEL ,CTCTIP ,CTCAGE ,CTCSAL ,CTCDIV ,CTCAUX ,CTCREF ,CTCBAN ,CTCDES  FROM  GPDATWEB.CUENTAS WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadCuentas', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadCuentas (0,'','','','',0,0,0,'','','','', 1, 10, '', '', '', '')
