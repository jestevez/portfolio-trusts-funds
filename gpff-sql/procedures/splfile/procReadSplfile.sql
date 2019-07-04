

--DROP  PROCEDURE  GPSQLWEB.procReadSplfile

CREATE PROCEDURE  GPSQLWEB.procReadSplfile (
IN P_ID bigint ,
IN P_SPLDATA blob ,
IN P_SPLNAME varchar(255) ,
IN P_SPLMIME varchar(100) ,
IN P_SPLDATE timestamp ,
IN P_SPLTYPE varchar(2) ,
IN P_SPLUSER varchar(10) ,
IN P_SPLSTATUS varchar(2) ,
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
    
        
        IF P_ID IS NOT NULL AND length(P_ID)>0 THEN
            SET P_ID = UPPER(TRIM(P_ID));
            SET WhereClause = WhereClause || ' AND ID LIKE ''%'|| P_ID ||'%'' ';
        END IF;
    
        
--        IF P_SPLDATA IS NOT NULL AND length(P_SPLDATA)>0 THEN
--            SET P_SPLDATA = UPPER(TRIM(P_SPLDATA));
--            SET WhereClause = WhereClause || ' AND SPLDATA LIKE ''%'|| P_SPLDATA ||'%'' ';
--        END IF;
    
        
        IF P_SPLNAME IS NOT NULL AND length(P_SPLNAME)>0 THEN
            SET P_SPLNAME = UPPER(TRIM(P_SPLNAME));
            SET WhereClause = WhereClause || ' AND SPLNAME LIKE ''%'|| P_SPLNAME ||'%'' ';
        END IF;
    
        
        IF P_SPLMIME IS NOT NULL AND length(P_SPLMIME)>0 THEN
            SET P_SPLMIME = UPPER(TRIM(P_SPLMIME));
            SET WhereClause = WhereClause || ' AND SPLMIME LIKE ''%'|| P_SPLMIME ||'%'' ';
        END IF;
            
--        IF P_SPLDATE IS NOT NULL THEN
--            SET WhereClause = WhereClause || ' AND SPLDATE  = ''' ||  P_SPLDATE  ||''' ';
--        END IF;
    
        
        IF P_SPLTYPE IS NOT NULL AND length(P_SPLTYPE)>0 THEN
            SET P_SPLTYPE = UPPER(TRIM(P_SPLTYPE));
            SET WhereClause = WhereClause || ' AND SPLTYPE LIKE ''%'|| P_SPLTYPE ||'%'' ';
        END IF;
    
        
        IF P_SPLUSER IS NOT NULL AND length(P_SPLUSER)>0 THEN
            SET P_SPLUSER = UPPER(TRIM(P_SPLUSER));
            SET WhereClause = WhereClause || ' AND SPLUSER LIKE ''%'|| P_SPLUSER ||'%'' ';
        END IF;
    
        
        IF P_SPLSTATUS IS NOT NULL AND length(P_SPLSTATUS)>0 THEN
            SET P_SPLSTATUS = UPPER(TRIM(P_SPLSTATUS));
            SET WhereClause = WhereClause || ' AND SPLSTATUS LIKE ''%'|| P_SPLSTATUS ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, ID ,SPLDATA ,SPLNAME ,SPLMIME ,SPLDATE ,SPLTYPE ,SPLUSER ,SPLSTATUS  FROM GPSQLWEB.SPLFILE  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT  ID ,SPLDATA ,SPLNAME ,SPLMIME ,SPLDATE ,SPLTYPE ,SPLUSER ,SPLSTATUS  FROM  GPSQLWEB.SPLFILE WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT  ID ,SPLDATA ,SPLNAME ,SPLMIME ,SPLDATE ,SPLTYPE ,SPLUSER ,SPLSTATUS  FROM  GPSQLWEB.SPLFILE WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadSplfile', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadSplfile ('','','','','','','','', 1, 10, '', '', '', '')
