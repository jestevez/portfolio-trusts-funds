

--DROP  PROCEDURE  GPSQLWEB.procCountAa2cab1

CREATE PROCEDURE  GPSQLWEB.procCountAa2cab1 (
     IN P_AREA varchar(4),
 IN P_NBANCO varchar(40),
 IN P_NRIF varchar(12),
 IN P_NNIF varchar(12),
 IN P_NDIRE varchar(60),
 IN P_NBANC INTEGER,
 IN P_NTELE varchar(15),
 IN P_NRESPO varchar(40),
 IN P_NFILLER varchar(80),
 IN P_USUARIO varchar(10),
 IN P_PANTALLA varchar(10),
 IN P_FECHA INTEGER,

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

        
        IF P_AREA IS NOT NULL AND length(P_AREA)>0 THEN
            SET P_AREA = UPPER(TRIM(P_AREA));
            SET WhereClause = WhereClause || ' AND AREA LIKE ''%'|| P_AREA ||'%'' ';
        END IF;
    
        
        IF P_NBANCO IS NOT NULL AND length(P_NBANCO)>0 THEN
            SET P_NBANCO = UPPER(TRIM(P_NBANCO));
            SET WhereClause = WhereClause || ' AND NBANCO LIKE ''%'|| P_NBANCO ||'%'' ';
        END IF;
    
        
        IF P_NRIF IS NOT NULL AND length(P_NRIF)>0 THEN
            SET P_NRIF = UPPER(TRIM(P_NRIF));
            SET WhereClause = WhereClause || ' AND NRIF LIKE ''%'|| P_NRIF ||'%'' ';
        END IF;
    
        
        IF P_NNIF IS NOT NULL AND length(P_NNIF)>0 THEN
            SET P_NNIF = UPPER(TRIM(P_NNIF));
            SET WhereClause = WhereClause || ' AND NNIF LIKE ''%'|| P_NNIF ||'%'' ';
        END IF;
    
        
        IF P_NDIRE IS NOT NULL AND length(P_NDIRE)>0 THEN
            SET P_NDIRE = UPPER(TRIM(P_NDIRE));
            SET WhereClause = WhereClause || ' AND NDIRE LIKE ''%'|| P_NDIRE ||'%'' ';
        END IF;
    
        
        IF P_NBANC > 0 THEN
            SET WhereClause = WhereClause || ' AND NBANC = '|| P_NBANC ||' ';
        END IF;
    
        
        IF P_NTELE IS NOT NULL AND length(P_NTELE)>0 THEN
            SET P_NTELE = UPPER(TRIM(P_NTELE));
            SET WhereClause = WhereClause || ' AND NTELE LIKE ''%'|| P_NTELE ||'%'' ';
        END IF;
    
        
        IF P_NRESPO IS NOT NULL AND length(P_NRESPO)>0 THEN
            SET P_NRESPO = UPPER(TRIM(P_NRESPO));
            SET WhereClause = WhereClause || ' AND NRESPO LIKE ''%'|| P_NRESPO ||'%'' ';
        END IF;
    
        
        IF P_NFILLER IS NOT NULL AND length(P_NFILLER)>0 THEN
            SET P_NFILLER = UPPER(TRIM(P_NFILLER));
            SET WhereClause = WhereClause || ' AND NFILLER LIKE ''%'|| P_NFILLER ||'%'' ';
        END IF;
    
        
        IF P_USUARIO IS NOT NULL AND length(P_USUARIO)>0 THEN
            SET P_USUARIO = UPPER(TRIM(P_USUARIO));
            SET WhereClause = WhereClause || ' AND USUARIO LIKE ''%'|| P_USUARIO ||'%'' ';
        END IF;
    
        
        IF P_PANTALLA IS NOT NULL AND length(P_PANTALLA)>0 THEN
            SET P_PANTALLA = UPPER(TRIM(P_PANTALLA));
            SET WhereClause = WhereClause || ' AND PANTALLA LIKE ''%'|| P_PANTALLA ||'%'' ';
        END IF;
    
        
        IF P_FECHA > 0 THEN
            SET WhereClause = WhereClause || ' AND FECHA = '|| P_FECHA ||' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.AA2CAB1  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountAa2cab1', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountAa2cab1('','','','','',0,'','','','','',0, '', '', '')
