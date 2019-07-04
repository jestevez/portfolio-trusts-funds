

--DROP  PROCEDURE  GPSQLWEB.procReadAuxcont

CREATE PROCEDURE  GPSQLWEB.procReadAuxcont (
    IN P_ROWID BIGINT,
 IN P_AXCARE varchar(4) ,
 IN P_AXCNCT BIGINT ,
 IN P_AXCCAP INTEGER ,
 IN P_AXCCPP INTEGER ,
 IN P_AXCAMP INTEGER ,
 IN P_AXCEDM INTEGER ,
 IN P_AXCEMH INTEGER ,
 IN P_AXCEMM INTEGER ,
 IN P_AXCPRT double ,

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
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.AUXCONT) =' || P_ROWID ;
        END IF;
        
        IF P_AXCARE IS NOT NULL AND length(P_AXCARE)>0 THEN
            SET P_AXCARE = UPPER(TRIM(P_AXCARE));
            SET WhereClause = WhereClause || ' AND AXCARE LIKE ''%'|| P_AXCARE ||'%'' ';
        END IF;
    
        
        IF P_AXCNCT > 0 THEN
            SET WhereClause = WhereClause || ' AND AXCNCT = '|| P_AXCNCT ||' ';
        END IF;
    
        
        IF P_AXCCAP > 0 THEN
            SET WhereClause = WhereClause || ' AND AXCCAP = '|| P_AXCCAP ||' ';
        END IF;
    
        
        IF P_AXCCPP > 0 THEN
            SET WhereClause = WhereClause || ' AND AXCCPP = '|| P_AXCCPP ||' ';
        END IF;
    
        
        IF P_AXCAMP > 0 THEN
            SET WhereClause = WhereClause || ' AND AXCAMP = '|| P_AXCAMP ||' ';
        END IF;
    
        
        IF P_AXCEDM > 0 THEN
            SET WhereClause = WhereClause || ' AND AXCEDM = '|| P_AXCEDM ||' ';
        END IF;
    
        
        IF P_AXCEMH > 0 THEN
            SET WhereClause = WhereClause || ' AND AXCEMH = '|| P_AXCEMH ||' ';
        END IF;
    
        
        IF P_AXCEMM > 0 THEN
            SET WhereClause = WhereClause || ' AND AXCEMM = '|| P_AXCEMM ||' ';
        END IF;
    
        
        IF P_AXCPRT IS NOT NULL AND length(P_AXCPRT)>0 THEN
            SET P_AXCPRT = UPPER(TRIM(P_AXCPRT));
            SET WhereClause = WhereClause || ' AND AXCPRT LIKE ''%'|| P_AXCPRT ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.AUXCONT) as ROWID,AXCARE ,AXCNCT ,AXCCAP ,AXCCPP ,AXCAMP ,AXCEDM ,AXCEMH ,AXCEMM ,AXCPRT  FROM GPDATWEB.AUXCONT  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AUXCONT) as ROWID,AXCARE ,AXCNCT ,AXCCAP ,AXCCPP ,AXCAMP ,AXCEDM ,AXCEMH ,AXCEMM ,AXCPRT  FROM  GPDATWEB.AUXCONT WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AUXCONT) as ROWID,AXCARE ,AXCNCT ,AXCCAP ,AXCCPP ,AXCAMP ,AXCEDM ,AXCEMH ,AXCEMM ,AXCPRT  FROM  GPDATWEB.AUXCONT WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadAuxcont', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadAuxcont ('',0,0,0,0,0,0,0,'', 1, 10, '', '', '', '')
