

--DROP  PROCEDURE  GPSQLWEB.procReadGpprpopc

CREATE PROCEDURE  GPSQLWEB.procReadGpprpopc (
    IN P_ROWID BIGINT,
 IN P_OPCARE varchar(4) ,
 IN P_OPCOPC varchar(1) ,
 IN P_OPCEDA INTEGER ,
 IN P_OPCCLI varchar(12) ,
 IN P_OPCEDD INTEGER ,
 IN P_OPCEDH INTEGER ,
 IN P_OPCFIJ double ,
 IN P_OPCVAR double ,
 IN P_OPCUSR varchar(10) ,
 IN P_OPCDSP varchar(10) ,
 IN P_OPCFEC INTEGER ,
 IN P_OPCTIM INTEGER ,

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
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.GPPRPOPC) =' || P_ROWID ;
        END IF;
        
        IF P_OPCARE IS NOT NULL AND length(P_OPCARE)>0 THEN
            SET P_OPCARE = UPPER(TRIM(P_OPCARE));
            SET WhereClause = WhereClause || ' AND OPCARE LIKE ''%'|| P_OPCARE ||'%'' ';
        END IF;
    
        
        IF P_OPCOPC IS NOT NULL AND length(P_OPCOPC)>0 THEN
            SET P_OPCOPC = UPPER(TRIM(P_OPCOPC));
            SET WhereClause = WhereClause || ' AND OPCOPC LIKE ''%'|| P_OPCOPC ||'%'' ';
        END IF;
    
        
        IF P_OPCEDA > 0 THEN
            SET WhereClause = WhereClause || ' AND OPCEDA = '|| P_OPCEDA ||' ';
        END IF;
    
        
        IF P_OPCCLI IS NOT NULL AND length(P_OPCCLI)>0 THEN
            SET P_OPCCLI = UPPER(TRIM(P_OPCCLI));
            SET WhereClause = WhereClause || ' AND OPCCLI LIKE ''%'|| P_OPCCLI ||'%'' ';
        END IF;
    
        
        IF P_OPCEDD > 0 THEN
            SET WhereClause = WhereClause || ' AND OPCEDD = '|| P_OPCEDD ||' ';
        END IF;
    
        
        IF P_OPCEDH > 0 THEN
            SET WhereClause = WhereClause || ' AND OPCEDH = '|| P_OPCEDH ||' ';
        END IF;
    
        
        IF P_OPCFIJ IS NOT NULL AND length(P_OPCFIJ)>0 THEN
            SET P_OPCFIJ = UPPER(TRIM(P_OPCFIJ));
            SET WhereClause = WhereClause || ' AND OPCFIJ LIKE ''%'|| P_OPCFIJ ||'%'' ';
        END IF;
    
        
        IF P_OPCVAR IS NOT NULL AND length(P_OPCVAR)>0 THEN
            SET P_OPCVAR = UPPER(TRIM(P_OPCVAR));
            SET WhereClause = WhereClause || ' AND OPCVAR LIKE ''%'|| P_OPCVAR ||'%'' ';
        END IF;
    
        
        IF P_OPCUSR IS NOT NULL AND length(P_OPCUSR)>0 THEN
            SET P_OPCUSR = UPPER(TRIM(P_OPCUSR));
            SET WhereClause = WhereClause || ' AND OPCUSR LIKE ''%'|| P_OPCUSR ||'%'' ';
        END IF;
    
        
        IF P_OPCDSP IS NOT NULL AND length(P_OPCDSP)>0 THEN
            SET P_OPCDSP = UPPER(TRIM(P_OPCDSP));
            SET WhereClause = WhereClause || ' AND OPCDSP LIKE ''%'|| P_OPCDSP ||'%'' ';
        END IF;
    
        
        IF P_OPCFEC > 0 THEN
            SET WhereClause = WhereClause || ' AND OPCFEC = '|| P_OPCFEC ||' ';
        END IF;
    
        
        IF P_OPCTIM > 0 THEN
            SET WhereClause = WhereClause || ' AND OPCTIM = '|| P_OPCTIM ||' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.GPPRPOPC) as ROWID,OPCARE ,OPCOPC ,OPCEDA ,OPCCLI ,OPCEDD ,OPCEDH ,OPCFIJ ,OPCVAR ,OPCUSR ,OPCDSP ,OPCFEC ,OPCTIM  FROM GPDATWEB.GPPRPOPC  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(GPDATWEB.GPPRPOPC) as ROWID,OPCARE ,OPCOPC ,OPCEDA ,OPCCLI ,OPCEDD ,OPCEDH ,OPCFIJ ,OPCVAR ,OPCUSR ,OPCDSP ,OPCFEC ,OPCTIM  FROM  GPDATWEB.GPPRPOPC WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(GPDATWEB.GPPRPOPC) as ROWID,OPCARE ,OPCOPC ,OPCEDA ,OPCCLI ,OPCEDD ,OPCEDH ,OPCFIJ ,OPCVAR ,OPCUSR ,OPCDSP ,OPCFEC ,OPCTIM  FROM  GPDATWEB.GPPRPOPC WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadGpprpopc', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadGpprpopc ('','',0,'',0,0,'','','','',0,0, 1, 10, '', '', '', '')
