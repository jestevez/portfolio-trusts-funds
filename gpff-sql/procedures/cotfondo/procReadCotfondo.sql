

--DROP  PROCEDURE  GPSQLWEB.procReadCotfondo

CREATE PROCEDURE  GPSQLWEB.procReadCotfondo (
IN P_ROWID BIGINT,
IN P_COFEMP varchar(2) ,
IN P_COFDEL varchar(2) ,
IN P_COFCLA varchar(12) ,
IN P_COFFEC BIGINT ,
IN P_COFFECH BIGINT,
IN P_COFCOT double ,
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
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.COTFONDO) =' || P_ROWID ;
        END IF;
        
        IF P_COFEMP IS NOT NULL AND length(P_COFEMP)>0 THEN
            SET P_COFEMP = UPPER(TRIM(P_COFEMP));
            SET WhereClause = WhereClause || ' AND COFEMP LIKE ''%'|| P_COFEMP ||'%'' ';
        END IF;
    
        
        IF P_COFDEL IS NOT NULL AND length(P_COFDEL)>0 THEN
            SET P_COFDEL = UPPER(TRIM(P_COFDEL));
            SET WhereClause = WhereClause || ' AND COFDEL LIKE ''%'|| P_COFDEL ||'%'' ';
        END IF;
    
        
        IF P_COFCLA IS NOT NULL AND length(P_COFCLA)>0 THEN
            SET P_COFCLA = UPPER(TRIM(P_COFCLA));
            SET WhereClause = WhereClause || ' AND COFCLA LIKE ''%'|| P_COFCLA ||'%'' ';
        END IF;
    
        
        IF P_COFFEC > 0 AND P_COFFECH > 0 THEN
            SET WhereClause = WhereClause || ' AND COFFEC BETWEEN '|| P_COFFEC ||' AND ' || P_COFFECH ;
        ELSE
            IF P_COFFEC > 0 THEN
                SET WhereClause = WhereClause || ' AND COFFEC = '|| P_COFFEC;
            ELSE
                IF P_COFFECH > 0 THEN
                SET WhereClause = WhereClause || ' AND COFFEC = '|| P_COFFECH;
                END IF;
            END IF;
        END IF;
    
        
        IF P_COFCOT IS NOT NULL AND length(P_COFCOT)>0 THEN
            SET P_COFCOT = UPPER(TRIM(P_COFCOT));
            SET WhereClause = WhereClause || ' AND COFCOT LIKE ''%'|| P_COFCOT ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.COTFONDO) as ROWID,COFEMP ,COFDEL ,COFCLA ,COFFEC ,COFCOT  FROM GPDATWEB.COTFONDO  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(GPDATWEB.COTFONDO) as ROWID,COFEMP ,COFDEL ,COFCLA ,COFFEC ,COFCOT  FROM  GPDATWEB.COTFONDO WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(GPDATWEB.COTFONDO) as ROWID,COFEMP ,COFDEL ,COFCLA ,COFFEC ,COFCOT  FROM  GPDATWEB.COTFONDO WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    --CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadCotfondo', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadCotfondo ('','','',0,'', 1, 10, '', '', '', '')
