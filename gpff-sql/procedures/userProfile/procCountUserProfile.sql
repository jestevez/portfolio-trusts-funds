

--DROP  PROCEDURE  GPSQLWEB.procCountUserProfile

CREATE PROCEDURE  GPSQLWEB.procCountUserProfile (
     IN P_ID INTEGER ,
 IN P_USERNAME varchar(128) ,
 IN P_DOCUMENT_NUMBER varchar(10) ,
 IN P_FIRST_NAME varchar(128) ,
 IN P_SECOND_NAME varchar(128) ,
 IN P_LAST_NAME varchar(128) ,
 IN P_SECOND_LAST_NAME varchar(128) ,
 IN P_GENDER varchar(1) ,
 IN P_CIVIL_STATUS varchar(1) ,
 IN P_EMAIL varchar(128) ,
 IN P_PHONE varchar(20) ,
 IN P_MOBILE varchar(20) ,
 IN P_BIRTHDAY date ,
 IN P_ENABLED varchar(1) ,
 IN P_DELETED varchar(1) ,
 IN P_CREATED_AT timestamp ,
 IN P_CREATED_BY varchar(128) ,
 IN P_UPDATED_AT timestamp ,
 IN P_UPDATED_BY varchar(128) ,

    IN P_USERNAME1 VARCHAR(50),
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
/*
        
        IF P_ID > 0 THEN
            SET WhereClause = WhereClause || ' AND ID = '|| P_ID ||' ';
        END IF;
    
        
        IF P_USERNAME IS NOT NULL AND length(P_USERNAME)>0 THEN
            SET P_USERNAME = UPPER(TRIM(P_USERNAME));
            SET WhereClause = WhereClause || ' AND USERNAME LIKE ''%'|| P_USERNAME ||'%'' ';
        END IF;
    
        
        IF P_DOCUMENT_NUMBER IS NOT NULL AND length(P_DOCUMENT_NUMBER)>0 THEN
            SET P_DOCUMENT_NUMBER = UPPER(TRIM(P_DOCUMENT_NUMBER));
            SET WhereClause = WhereClause || ' AND DOCUMENT_NUMBER LIKE ''%'|| P_DOCUMENT_NUMBER ||'%'' ';
        END IF;
    
        
        IF P_FIRST_NAME IS NOT NULL AND length(P_FIRST_NAME)>0 THEN
            SET P_FIRST_NAME = UPPER(TRIM(P_FIRST_NAME));
            SET WhereClause = WhereClause || ' AND FIRST_NAME LIKE ''%'|| P_FIRST_NAME ||'%'' ';
        END IF;
    
        
        IF P_SECOND_NAME IS NOT NULL AND length(P_SECOND_NAME)>0 THEN
            SET P_SECOND_NAME = UPPER(TRIM(P_SECOND_NAME));
            SET WhereClause = WhereClause || ' AND SECOND_NAME LIKE ''%'|| P_SECOND_NAME ||'%'' ';
        END IF;
    
        
        IF P_LAST_NAME IS NOT NULL AND length(P_LAST_NAME)>0 THEN
            SET P_LAST_NAME = UPPER(TRIM(P_LAST_NAME));
            SET WhereClause = WhereClause || ' AND LAST_NAME LIKE ''%'|| P_LAST_NAME ||'%'' ';
        END IF;
    
        
        IF P_SECOND_LAST_NAME IS NOT NULL AND length(P_SECOND_LAST_NAME)>0 THEN
            SET P_SECOND_LAST_NAME = UPPER(TRIM(P_SECOND_LAST_NAME));
            SET WhereClause = WhereClause || ' AND SECOND_LAST_NAME LIKE ''%'|| P_SECOND_LAST_NAME ||'%'' ';
        END IF;
    
        
        IF P_GENDER IS NOT NULL AND length(P_GENDER)>0 THEN
            SET P_GENDER = UPPER(TRIM(P_GENDER));
            SET WhereClause = WhereClause || ' AND GENDER LIKE ''%'|| P_GENDER ||'%'' ';
        END IF;
    
        
        IF P_CIVIL_STATUS IS NOT NULL AND length(P_CIVIL_STATUS)>0 THEN
            SET P_CIVIL_STATUS = UPPER(TRIM(P_CIVIL_STATUS));
            SET WhereClause = WhereClause || ' AND CIVIL_STATUS LIKE ''%'|| P_CIVIL_STATUS ||'%'' ';
        END IF;
    
        
        IF P_EMAIL IS NOT NULL AND length(P_EMAIL)>0 THEN
            SET P_EMAIL = UPPER(TRIM(P_EMAIL));
            SET WhereClause = WhereClause || ' AND EMAIL LIKE ''%'|| P_EMAIL ||'%'' ';
        END IF;
    
        
        IF P_PHONE IS NOT NULL AND length(P_PHONE)>0 THEN
            SET P_PHONE = UPPER(TRIM(P_PHONE));
            SET WhereClause = WhereClause || ' AND PHONE LIKE ''%'|| P_PHONE ||'%'' ';
        END IF;
    
        
        IF P_MOBILE IS NOT NULL AND length(P_MOBILE)>0 THEN
            SET P_MOBILE = UPPER(TRIM(P_MOBILE));
            SET WhereClause = WhereClause || ' AND MOBILE LIKE ''%'|| P_MOBILE ||'%'' ';
        END IF;
            
        IF P_BIRTHDAY IS NOT NULL THEN
            SET WhereClause = WhereClause || ' AND  CAST(DATE(BIRTHDAY) AS VARCHAR(10)) = '''||  CAST(DATE(P_BIRTHDAY) AS VARCHAR(10)) ||''' ';
        END IF;
    
        
        IF P_ENABLED IS NOT NULL AND length(P_ENABLED)>0 THEN
            SET P_ENABLED = UPPER(TRIM(P_ENABLED));
            SET WhereClause = WhereClause || ' AND ENABLED LIKE ''%'|| P_ENABLED ||'%'' ';
        END IF;
    
        
        IF P_DELETED IS NOT NULL AND length(P_DELETED)>0 THEN
            SET P_DELETED = UPPER(TRIM(P_DELETED));
            SET WhereClause = WhereClause || ' AND DELETED LIKE ''%'|| P_DELETED ||'%'' ';
        END IF;
            
        IF P_CREATED_AT IS NOT NULL THEN
            SET WhereClause = WhereClause || ' AND  CAST(DATE(CREATED_AT) AS VARCHAR(10)) = '''||  CAST(DATE(P_CREATED_AT) AS VARCHAR(10)) ||''' ';
        END IF;
    
        
        IF P_CREATED_BY IS NOT NULL AND length(P_CREATED_BY)>0 THEN
            SET P_CREATED_BY = UPPER(TRIM(P_CREATED_BY));
            SET WhereClause = WhereClause || ' AND CREATED_BY LIKE ''%'|| P_CREATED_BY ||'%'' ';
        END IF;
            
        IF P_UPDATED_AT IS NOT NULL THEN
            SET WhereClause = WhereClause || ' AND  CAST(DATE(UPDATED_AT) AS VARCHAR(10)) = '''||  CAST(DATE(P_UPDATED_AT) AS VARCHAR(10)) ||''' ';
        END IF;
    
        
        IF P_UPDATED_BY IS NOT NULL AND length(P_UPDATED_BY)>0 THEN
            SET P_UPDATED_BY = UPPER(TRIM(P_UPDATED_BY));
            SET WhereClause = WhereClause || ' AND UPDATED_BY LIKE ''%'|| P_UPDATED_BY ||'%'' ';
        END IF;
    */
Set StringSQL = 'SELECT COUNT(1) FROM  GPSQLWEB.USER_PROFILE  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME1, 'Contar', 'procCountUserProfile', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountUserProfile(0,'','','','','','','','','','','','','','','','','','', '', '', '')