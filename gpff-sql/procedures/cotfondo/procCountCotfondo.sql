

--DROP  PROCEDURE  GPSQLWEB.procCountCotfondo

CREATE PROCEDURE  GPSQLWEB.procCountCotfondo (
IN P_ROWID BIGINT,
IN P_COFEMP varchar(2),
IN P_COFDEL varchar(2),
IN P_COFCLA varchar(12),
IN P_COFFEC BIGINT,
IN P_COFFECH BIGINT,
IN P_COFCOT double,
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
    
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.COTFONDO  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountCotfondo', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountCotfondo('','','',0,'', '', '', '')
