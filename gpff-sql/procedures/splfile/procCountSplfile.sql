--DROP  PROCEDURE  GPSQLWEB.procCountSplfile

CREATE PROCEDURE  GPSQLWEB.procCountSplfile (
IN P_ID bigint,
IN P_SPLDATA blob,
IN P_SPLNAME varchar(255),
IN P_SPLMIME varchar(100),
IN P_SPLDATE timestamp,
IN P_SPLTYPE varchar(2),
IN P_SPLUSER varchar(10),
IN P_SPLSTATUS varchar(2),
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
--            SET WhereClause = WhereClause || ' AND  CAST(DATE(SPLDATE) AS VARCHAR(10)) = '''||  CAST(DATE(P_SPLDATE) AS VARCHAR(10)) ||''' ';
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
    
	Set StringSQL = 'SELECT COUNT(1) FROM  GPSQLWEB.SPLFILE  WHERE 1=1 ' || WhereClause; 
	PREPARE stmt1 FROM StringSQL;
	CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountSplfile', StringSQL);
	OPEN c1;
	    FETCH c1 into total;
	CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountSplfile('','','','','','','','', '', '', '')
