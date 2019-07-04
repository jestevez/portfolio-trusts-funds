

--DROP  PROCEDURE  GPSQLWEB.procReadTabcf

CREATE PROCEDURE  GPSQLWEB.procReadTabcf (
    IN P_ROWID BIGINT,
 IN P_NTAB DECIMAL(2 , 0),
IN P_NOMTAB VARCHAR(30),
IN P_COMAEF DECIMAL(10 , 2),
IN P_COMAPF DECIMAL(10 , 2),
IN P_COMANF DECIMAL(9 , 6),
IN P_COMMOF DECIMAL(10 , 2),
IN P_COMCOF DECIMAL(9 , 6),
IN P_COMMAF DECIMAL(10 , 2),
IN P_COMMIF DECIMAL(10 , 2),
IN P_COMPOL DECIMAL(9 , 6),

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
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.TABCF) =' || P_ROWID ;
        END IF;
        
        IF P_NTAB > 0 THEN
            SET WhereClause = WhereClause || ' AND NTAB = '|| P_NTAB ||' ';
        END IF;
    
        
        IF P_NOMTAB IS NOT NULL AND length(P_NOMTAB)>0 THEN
            SET P_NOMTAB = UPPER(TRIM(P_NOMTAB));
            SET WhereClause = WhereClause || ' AND NOMTAB LIKE ''%'|| P_NOMTAB ||'%'' ';
        END IF;
    
        
        IF P_COMAEF IS NOT NULL AND length(P_COMAEF)>0 THEN
            SET P_COMAEF = UPPER(TRIM(P_COMAEF));
            SET WhereClause = WhereClause || ' AND COMAEF LIKE ''%'|| P_COMAEF ||'%'' ';
        END IF;
    
        
        IF P_COMAPF IS NOT NULL AND length(P_COMAPF)>0 THEN
            SET P_COMAPF = UPPER(TRIM(P_COMAPF));
            SET WhereClause = WhereClause || ' AND COMAPF LIKE ''%'|| P_COMAPF ||'%'' ';
        END IF;
    
        
        IF P_COMANF IS NOT NULL AND length(P_COMANF)>0 THEN
            SET P_COMANF = UPPER(TRIM(P_COMANF));
            SET WhereClause = WhereClause || ' AND COMANF LIKE ''%'|| P_COMANF ||'%'' ';
        END IF;
    
        
        IF P_COMMOF IS NOT NULL AND length(P_COMMOF)>0 THEN
            SET P_COMMOF = UPPER(TRIM(P_COMMOF));
            SET WhereClause = WhereClause || ' AND COMMOF LIKE ''%'|| P_COMMOF ||'%'' ';
        END IF;
    
        
        IF P_COMCOF IS NOT NULL AND length(P_COMCOF)>0 THEN
            SET P_COMCOF = UPPER(TRIM(P_COMCOF));
            SET WhereClause = WhereClause || ' AND COMCOF LIKE ''%'|| P_COMCOF ||'%'' ';
        END IF;
    
        
        IF P_COMMAF IS NOT NULL AND length(P_COMMAF)>0 THEN
            SET P_COMMAF = UPPER(TRIM(P_COMMAF));
            SET WhereClause = WhereClause || ' AND COMMAF LIKE ''%'|| P_COMMAF ||'%'' ';
        END IF;
    
        
        IF P_COMMIF IS NOT NULL AND length(P_COMMIF)>0 THEN
            SET P_COMMIF = UPPER(TRIM(P_COMMIF));
            SET WhereClause = WhereClause || ' AND COMMIF LIKE ''%'|| P_COMMIF ||'%'' ';
        END IF;
    
        
        IF P_COMPOL IS NOT NULL AND length(P_COMPOL)>0 THEN
            SET P_COMPOL = UPPER(TRIM(P_COMPOL));
            SET WhereClause = WhereClause || ' AND COMPOL LIKE ''%'|| P_COMPOL ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.TABCF) as ROWID,NTAB ,NOMTAB ,COMAEF ,COMAPF ,COMANF ,COMMOF ,COMCOF ,COMMAF ,COMMIF ,COMPOL  FROM GPDATWEB.TABCF  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(GPDATWEB.TABCF) as ROWID,NTAB ,NOMTAB ,COMAEF ,COMAPF ,COMANF ,COMMOF ,COMCOF ,COMMAF ,COMMIF ,COMPOL  FROM  GPDATWEB.TABCF WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(GPDATWEB.TABCF) as ROWID,NTAB ,NOMTAB ,COMAEF ,COMAPF ,COMANF ,COMMOF ,COMCOF ,COMMAF ,COMMIF ,COMPOL  FROM  GPDATWEB.TABCF WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadTabcf', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadTabcf (0,'','','','','','','','','', 1, 10, '', '', '', '')
