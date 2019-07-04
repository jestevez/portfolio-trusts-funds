

--DROP  PROCEDURE  GPSQLWEB.procCountAa2tfis

CREATE PROCEDURE  GPSQLWEB.procCountAa2tfis (
     IN P_FISEMP varchar(2),
 IN P_FISDEL varchar(2),
 IN P_FISCLA double,
 IN P_FISNOR double,
 IN P_FISBEL double,
 IN P_FISBE1 double,
 IN P_FISDIV double,
 IN P_FISINV double,
 IN P_FISGIN double,
 IN P_FISCAP double,
 IN P_FISRDI double,
 IN P_FISRD1 double,
 IN P_FISCOR double,
 IN P_FISIVA double,

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

        
        IF P_FISEMP IS NOT NULL AND length(P_FISEMP)>0 THEN
            SET P_FISEMP = UPPER(TRIM(P_FISEMP));
            SET WhereClause = WhereClause || ' AND FISEMP LIKE ''%'|| P_FISEMP ||'%'' ';
        END IF;
    
        
        IF P_FISDEL IS NOT NULL AND length(P_FISDEL)>0 THEN
            SET P_FISDEL = UPPER(TRIM(P_FISDEL));
            SET WhereClause = WhereClause || ' AND FISDEL LIKE ''%'|| P_FISDEL ||'%'' ';
        END IF;
    
        
        IF P_FISCLA IS NOT NULL AND length(P_FISCLA)>0 THEN
            SET P_FISCLA = UPPER(TRIM(P_FISCLA));
            SET WhereClause = WhereClause || ' AND FISCLA LIKE ''%'|| P_FISCLA ||'%'' ';
        END IF;
    
        
        IF P_FISNOR IS NOT NULL AND length(P_FISNOR)>0 THEN
            SET P_FISNOR = UPPER(TRIM(P_FISNOR));
            SET WhereClause = WhereClause || ' AND FISNOR LIKE ''%'|| P_FISNOR ||'%'' ';
        END IF;
    
        
        IF P_FISBEL IS NOT NULL AND length(P_FISBEL)>0 THEN
            SET P_FISBEL = UPPER(TRIM(P_FISBEL));
            SET WhereClause = WhereClause || ' AND FISBEL LIKE ''%'|| P_FISBEL ||'%'' ';
        END IF;
    
        
        IF P_FISBE1 IS NOT NULL AND length(P_FISBE1)>0 THEN
            SET P_FISBE1 = UPPER(TRIM(P_FISBE1));
            SET WhereClause = WhereClause || ' AND FISBE1 LIKE ''%'|| P_FISBE1 ||'%'' ';
        END IF;
    
        
        IF P_FISDIV IS NOT NULL AND length(P_FISDIV)>0 THEN
            SET P_FISDIV = UPPER(TRIM(P_FISDIV));
            SET WhereClause = WhereClause || ' AND FISDIV LIKE ''%'|| P_FISDIV ||'%'' ';
        END IF;
    
        
        IF P_FISINV IS NOT NULL AND length(P_FISINV)>0 THEN
            SET P_FISINV = UPPER(TRIM(P_FISINV));
            SET WhereClause = WhereClause || ' AND FISINV LIKE ''%'|| P_FISINV ||'%'' ';
        END IF;
    
        
        IF P_FISGIN IS NOT NULL AND length(P_FISGIN)>0 THEN
            SET P_FISGIN = UPPER(TRIM(P_FISGIN));
            SET WhereClause = WhereClause || ' AND FISGIN LIKE ''%'|| P_FISGIN ||'%'' ';
        END IF;
    
        
        IF P_FISCAP IS NOT NULL AND length(P_FISCAP)>0 THEN
            SET P_FISCAP = UPPER(TRIM(P_FISCAP));
            SET WhereClause = WhereClause || ' AND FISCAP LIKE ''%'|| P_FISCAP ||'%'' ';
        END IF;
    
        
        IF P_FISRDI IS NOT NULL AND length(P_FISRDI)>0 THEN
            SET P_FISRDI = UPPER(TRIM(P_FISRDI));
            SET WhereClause = WhereClause || ' AND FISRDI LIKE ''%'|| P_FISRDI ||'%'' ';
        END IF;
    
        
        IF P_FISRD1 IS NOT NULL AND length(P_FISRD1)>0 THEN
            SET P_FISRD1 = UPPER(TRIM(P_FISRD1));
            SET WhereClause = WhereClause || ' AND FISRD1 LIKE ''%'|| P_FISRD1 ||'%'' ';
        END IF;
    
        
        IF P_FISCOR IS NOT NULL AND length(P_FISCOR)>0 THEN
            SET P_FISCOR = UPPER(TRIM(P_FISCOR));
            SET WhereClause = WhereClause || ' AND FISCOR LIKE ''%'|| P_FISCOR ||'%'' ';
        END IF;
    
        
        IF P_FISIVA IS NOT NULL AND length(P_FISIVA)>0 THEN
            SET P_FISIVA = UPPER(TRIM(P_FISIVA));
            SET WhereClause = WhereClause || ' AND FISIVA LIKE ''%'|| P_FISIVA ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.AA2TFIS  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountAa2tfis', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountAa2tfis('','','','','','','','','','','','','','', '', '', '')
