

--DROP  PROCEDURE  GPSQLWEB.procReadFlucon

CREATE PROCEDURE  GPSQLWEB.procReadFlucon (
IN P_FLCEMP varchar(2) ,
IN P_FLCDEL varchar(2) ,
IN P_FLCCLI INTEGER ,
IN P_FLCTIP varchar(1) ,
IN P_FLCCOD INTEGER ,
IN P_FLCCON varchar(30) ,
IN P_FLCHOR INTEGER ,
IN P_FLCPAN varchar(10) ,
IN P_FLCUSU varchar(10) ,
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
    
        
        IF P_FLCEMP IS NOT NULL AND length(P_FLCEMP)>0 THEN
            SET P_FLCEMP = UPPER(TRIM(P_FLCEMP));
            SET WhereClause = WhereClause || ' AND FLCEMP LIKE ''%'|| P_FLCEMP ||'%'' ';
        END IF;
    
        
        IF P_FLCDEL IS NOT NULL AND length(P_FLCDEL)>0 THEN
            SET P_FLCDEL = UPPER(TRIM(P_FLCDEL));
            SET WhereClause = WhereClause || ' AND FLCDEL LIKE ''%'|| P_FLCDEL ||'%'' ';
        END IF;
    
        
        IF P_FLCCLI > 0 THEN
            SET WhereClause = WhereClause || ' AND FLCCLI = '|| P_FLCCLI ||' ';
        END IF;
    
        
        IF P_FLCTIP IS NOT NULL AND length(P_FLCTIP)>0 THEN
            SET P_FLCTIP = UPPER(TRIM(P_FLCTIP));
            SET WhereClause = WhereClause || ' AND FLCTIP LIKE ''%'|| P_FLCTIP ||'%'' ';
        END IF;
    
        
        IF P_FLCCOD > 0 THEN
            SET WhereClause = WhereClause || ' AND FLCCOD = '|| P_FLCCOD ||' ';
        END IF;
    
        
        IF P_FLCCON IS NOT NULL AND length(P_FLCCON)>0 THEN
            SET P_FLCCON = UPPER(TRIM(P_FLCCON));
            SET WhereClause = WhereClause || ' AND FLCCON LIKE ''%'|| P_FLCCON ||'%'' ';
        END IF;
    
        
        IF P_FLCHOR > 0 THEN
            SET WhereClause = WhereClause || ' AND FLCHOR = '|| P_FLCHOR ||' ';
        END IF;
    
        
        IF P_FLCPAN IS NOT NULL AND length(P_FLCPAN)>0 THEN
            SET P_FLCPAN = UPPER(TRIM(P_FLCPAN));
            SET WhereClause = WhereClause || ' AND FLCPAN LIKE ''%'|| P_FLCPAN ||'%'' ';
        END IF;
    
        
        IF P_FLCUSU IS NOT NULL AND length(P_FLCUSU)>0 THEN
            SET P_FLCUSU = UPPER(TRIM(P_FLCUSU));
            SET WhereClause = WhereClause || ' AND FLCUSU LIKE ''%'|| P_FLCUSU ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, FLCEMP ,FLCDEL ,FLCCLI ,FLCTIP ,FLCCOD ,FLCCON ,FLCHOR ,FLCPAN ,FLCUSU  FROM GPDATWEB.FLUCON  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT  FLCEMP ,FLCDEL ,FLCCLI ,FLCTIP ,FLCCOD ,FLCCON ,FLCHOR ,FLCPAN ,FLCUSU  FROM  GPDATWEB.FLUCON WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT  FLCEMP ,FLCDEL ,FLCCLI ,FLCTIP ,FLCCOD ,FLCCON ,FLCHOR ,FLCPAN ,FLCUSU  FROM  GPDATWEB.FLUCON WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadFlucon', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadFlucon ('','',0,'',0,'',0,'','', 1, 10, '', '', '', '')
