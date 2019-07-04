

--DROP  PROCEDURE  GPSQLWEB.procCountTableHelp

CREATE PROCEDURE  GPSQLWEB.procCountTableHelp (
     IN P_ID INTEGER ,
 IN P_CODE varchar(2) ,
 IN P_NAME varchar(100) ,
 IN P_TABLENAME varchar(100) ,
 IN P_TABLECODE varchar(100) ,
 IN P_TABLEDESC varchar(100) ,
 IN P_TABLEPARENT varchar(100) ,

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

        
        IF P_ID > 0 THEN
            SET WhereClause = WhereClause || ' AND ID = '|| P_ID ||' ';
        END IF;
    
        
        IF P_CODE IS NOT NULL AND length(P_CODE)>0 THEN
            SET P_CODE = UPPER(TRIM(P_CODE));
            SET WhereClause = WhereClause || ' AND CODE LIKE ''%'|| P_CODE ||'%'' ';
        END IF;
    
        
        IF P_NAME IS NOT NULL AND length(P_NAME)>0 THEN
            SET P_NAME = UPPER(TRIM(P_NAME));
            SET WhereClause = WhereClause || ' AND NAME LIKE ''%'|| P_NAME ||'%'' ';
        END IF;
    
        
        IF P_TABLENAME IS NOT NULL AND length(P_TABLENAME)>0 THEN
            SET P_TABLENAME = UPPER(TRIM(P_TABLENAME));
            SET WhereClause = WhereClause || ' AND TABLENAME LIKE ''%'|| P_TABLENAME ||'%'' ';
        END IF;
    
        
        IF P_TABLECODE IS NOT NULL AND length(P_TABLECODE)>0 THEN
            SET P_TABLECODE = UPPER(TRIM(P_TABLECODE));
            SET WhereClause = WhereClause || ' AND TABLECODE LIKE ''%'|| P_TABLECODE ||'%'' ';
        END IF;
    
        
        IF P_TABLEDESC IS NOT NULL AND length(P_TABLEDESC)>0 THEN
            SET P_TABLEDESC = UPPER(TRIM(P_TABLEDESC));
            SET WhereClause = WhereClause || ' AND TABLEDESC LIKE ''%'|| P_TABLEDESC ||'%'' ';
        END IF;
    
        
        IF P_TABLEPARENT IS NOT NULL AND length(P_TABLEPARENT)>0 THEN
            SET P_TABLEPARENT = UPPER(TRIM(P_TABLEPARENT));
            SET WhereClause = WhereClause || ' AND TABLEPARENT LIKE ''%'|| P_TABLEPARENT ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM GPSQLWEB.TABLEHELP  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountTableHelp', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountTableHelp(0,'','','','','','', '', '', '')
