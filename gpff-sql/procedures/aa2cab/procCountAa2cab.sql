

--DROP  PROCEDURE  GPSQLWEB.procCountAa2cab

CREATE PROCEDURE  GPSQLWEB.procCountAa2cab (
     IN P_AREA varchar(4),
 IN P_NAREA varchar(60),
 IN P_USUARIO varchar(10),
 IN P_PANTALLA varchar(10),
 IN P_FECHA BIGINT,
 IN P_LITERAL1 varchar(60),
 IN P_LITERAL2 varchar(60),
 IN P_NCTA varchar(20),
 IN P_NCTAC varchar(20),
 IN P_NCTACU varchar(20),
 IN P_NCTCHE varchar(20),
 IN P_NCTCHA varchar(20),
 IN P_NCTBCV varchar(20),
 IN P_NCTAFL varchar(20),
 IN P_NCTAIS varchar(20),
 IN P_NCTGAO varchar(20),
 IN P_NCTRIV varchar(20),

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
    
        
        IF P_NAREA IS NOT NULL AND length(P_NAREA)>0 THEN
            SET P_NAREA = UPPER(TRIM(P_NAREA));
            SET WhereClause = WhereClause || ' AND NAREA LIKE ''%'|| P_NAREA ||'%'' ';
        END IF;
    
        
        IF P_USUARIO IS NOT NULL AND length(P_USUARIO)>0 THEN
            SET P_USUARIO = UPPER(TRIM(P_USUARIO));
            SET WhereClause = WhereClause || ' AND USUARIO LIKE ''%'|| P_USUARIO ||'%'' ';
        END IF;
    
        
        IF P_PANTALLA IS NOT NULL AND length(P_PANTALLA)>0 THEN
            SET P_PANTALLA = UPPER(TRIM(P_PANTALLA));
            SET WhereClause = WhereClause || ' AND PANTALLA LIKE ''%'|| P_PANTALLA ||'%'' ';
        END IF;
    
        
        IF P_FECHA IS NOT NULL AND length(P_FECHA)>0 THEN
            SET P_FECHA = UPPER(TRIM(P_FECHA));
            SET WhereClause = WhereClause || ' AND FECHA LIKE ''%'|| P_FECHA ||'%'' ';
        END IF;
    
        
        IF P_LITERAL1 IS NOT NULL AND length(P_LITERAL1)>0 THEN
            SET P_LITERAL1 = UPPER(TRIM(P_LITERAL1));
            SET WhereClause = WhereClause || ' AND LITERAL1 LIKE ''%'|| P_LITERAL1 ||'%'' ';
        END IF;
    
        
        IF P_LITERAL2 IS NOT NULL AND length(P_LITERAL2)>0 THEN
            SET P_LITERAL2 = UPPER(TRIM(P_LITERAL2));
            SET WhereClause = WhereClause || ' AND LITERAL2 LIKE ''%'|| P_LITERAL2 ||'%'' ';
        END IF;
    
        
        IF P_NCTA IS NOT NULL AND length(P_NCTA)>0 THEN
            SET P_NCTA = UPPER(TRIM(P_NCTA));
            SET WhereClause = WhereClause || ' AND NCTA LIKE ''%'|| P_NCTA ||'%'' ';
        END IF;
    
        
        IF P_NCTAC IS NOT NULL AND length(P_NCTAC)>0 THEN
            SET P_NCTAC = UPPER(TRIM(P_NCTAC));
            SET WhereClause = WhereClause || ' AND NCTAC LIKE ''%'|| P_NCTAC ||'%'' ';
        END IF;
    
        
        IF P_NCTACU IS NOT NULL AND length(P_NCTACU)>0 THEN
            SET P_NCTACU = UPPER(TRIM(P_NCTACU));
            SET WhereClause = WhereClause || ' AND NCTACU LIKE ''%'|| P_NCTACU ||'%'' ';
        END IF;
    
        
        IF P_NCTCHE IS NOT NULL AND length(P_NCTCHE)>0 THEN
            SET P_NCTCHE = UPPER(TRIM(P_NCTCHE));
            SET WhereClause = WhereClause || ' AND NCTCHE LIKE ''%'|| P_NCTCHE ||'%'' ';
        END IF;
    
        
        IF P_NCTCHA IS NOT NULL AND length(P_NCTCHA)>0 THEN
            SET P_NCTCHA = UPPER(TRIM(P_NCTCHA));
            SET WhereClause = WhereClause || ' AND NCTCHA LIKE ''%'|| P_NCTCHA ||'%'' ';
        END IF;
    
        
        IF P_NCTBCV IS NOT NULL AND length(P_NCTBCV)>0 THEN
            SET P_NCTBCV = UPPER(TRIM(P_NCTBCV));
            SET WhereClause = WhereClause || ' AND NCTBCV LIKE ''%'|| P_NCTBCV ||'%'' ';
        END IF;
    
        
        IF P_NCTAFL IS NOT NULL AND length(P_NCTAFL)>0 THEN
            SET P_NCTAFL = UPPER(TRIM(P_NCTAFL));
            SET WhereClause = WhereClause || ' AND NCTAFL LIKE ''%'|| P_NCTAFL ||'%'' ';
        END IF;
    
        
        IF P_NCTAIS IS NOT NULL AND length(P_NCTAIS)>0 THEN
            SET P_NCTAIS = UPPER(TRIM(P_NCTAIS));
            SET WhereClause = WhereClause || ' AND NCTAIS LIKE ''%'|| P_NCTAIS ||'%'' ';
        END IF;
    
        
        IF P_NCTGAO IS NOT NULL AND length(P_NCTGAO)>0 THEN
            SET P_NCTGAO = UPPER(TRIM(P_NCTGAO));
            SET WhereClause = WhereClause || ' AND NCTGAO LIKE ''%'|| P_NCTGAO ||'%'' ';
        END IF;
    
        
        IF P_NCTRIV IS NOT NULL AND length(P_NCTRIV)>0 THEN
            SET P_NCTRIV = UPPER(TRIM(P_NCTRIV));
            SET WhereClause = WhereClause || ' AND NCTRIV LIKE ''%'|| P_NCTRIV ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.AA2CAB  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountAa2cab', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountAa2cab('','','','','','','','','','','','','','','','','', '', '', '')
