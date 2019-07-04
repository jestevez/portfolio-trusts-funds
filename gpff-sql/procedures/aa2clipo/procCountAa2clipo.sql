

--DROP  PROCEDURE  GPSQLWEB.procCountAa2clipo

CREATE PROCEDURE  GPSQLWEB.procCountAa2clipo (
     IN P_CLPCLA BIGINT,
 IN P_CLPNOM varchar(20),
 IN P_CLPAPE varchar(15),
 IN P_CLPAP2 varchar(15),
 IN P_CLPDI1 varchar(30),
 IN P_CLPDI2 varchar(30),
 IN P_CLPPOS varchar(9),
 IN P_CLPPRO varchar(25),
 IN P_CLPPAI INTEGER,
 IN P_CLPPOB varchar(27),
 IN P_CLPANA BIGINT,
 IN P_CLPTID varchar(1),
 IN P_CLPNIF varchar(12),
 IN P_CLPTEL BIGINT,
 IN P_CLPUSU varchar(10),

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

        
        IF P_CLPCLA IS NOT NULL AND length(P_CLPCLA)>0 THEN
            SET P_CLPCLA = UPPER(TRIM(P_CLPCLA));
            SET WhereClause = WhereClause || ' AND CLPCLA LIKE ''%'|| P_CLPCLA ||'%'' ';
        END IF;
    
        
        IF P_CLPNOM IS NOT NULL AND length(P_CLPNOM)>0 THEN
            SET P_CLPNOM = UPPER(TRIM(P_CLPNOM));
            SET WhereClause = WhereClause || ' AND CLPNOM LIKE ''%'|| P_CLPNOM ||'%'' ';
        END IF;
    
        
        IF P_CLPAPE IS NOT NULL AND length(P_CLPAPE)>0 THEN
            SET P_CLPAPE = UPPER(TRIM(P_CLPAPE));
            SET WhereClause = WhereClause || ' AND CLPAPE LIKE ''%'|| P_CLPAPE ||'%'' ';
        END IF;
    
        
        IF P_CLPAP2 IS NOT NULL AND length(P_CLPAP2)>0 THEN
            SET P_CLPAP2 = UPPER(TRIM(P_CLPAP2));
            SET WhereClause = WhereClause || ' AND CLPAP2 LIKE ''%'|| P_CLPAP2 ||'%'' ';
        END IF;
    
        
        IF P_CLPDI1 IS NOT NULL AND length(P_CLPDI1)>0 THEN
            SET P_CLPDI1 = UPPER(TRIM(P_CLPDI1));
            SET WhereClause = WhereClause || ' AND CLPDI1 LIKE ''%'|| P_CLPDI1 ||'%'' ';
        END IF;
    
        
        IF P_CLPDI2 IS NOT NULL AND length(P_CLPDI2)>0 THEN
            SET P_CLPDI2 = UPPER(TRIM(P_CLPDI2));
            SET WhereClause = WhereClause || ' AND CLPDI2 LIKE ''%'|| P_CLPDI2 ||'%'' ';
        END IF;
    
        
        IF P_CLPPOS IS NOT NULL AND length(P_CLPPOS)>0 THEN
            SET P_CLPPOS = UPPER(TRIM(P_CLPPOS));
            SET WhereClause = WhereClause || ' AND CLPPOS LIKE ''%'|| P_CLPPOS ||'%'' ';
        END IF;
    
        
        IF P_CLPPRO IS NOT NULL AND length(P_CLPPRO)>0 THEN
            SET P_CLPPRO = UPPER(TRIM(P_CLPPRO));
            SET WhereClause = WhereClause || ' AND CLPPRO LIKE ''%'|| P_CLPPRO ||'%'' ';
        END IF;
    
        
        IF P_CLPPAI > 0 THEN
            SET WhereClause = WhereClause || ' AND CLPPAI = '|| P_CLPPAI ||' ';
        END IF;
    
        
        IF P_CLPPOB IS NOT NULL AND length(P_CLPPOB)>0 THEN
            SET P_CLPPOB = UPPER(TRIM(P_CLPPOB));
            SET WhereClause = WhereClause || ' AND CLPPOB LIKE ''%'|| P_CLPPOB ||'%'' ';
        END IF;
    
        
        IF P_CLPANA IS NOT NULL AND length(P_CLPANA)>0 THEN
            SET P_CLPANA = UPPER(TRIM(P_CLPANA));
            SET WhereClause = WhereClause || ' AND CLPANA LIKE ''%'|| P_CLPANA ||'%'' ';
        END IF;
    
        
        IF P_CLPTID IS NOT NULL AND length(P_CLPTID)>0 THEN
            SET P_CLPTID = UPPER(TRIM(P_CLPTID));
            SET WhereClause = WhereClause || ' AND CLPTID LIKE ''%'|| P_CLPTID ||'%'' ';
        END IF;
    
        
        IF P_CLPNIF IS NOT NULL AND length(P_CLPNIF)>0 THEN
            SET P_CLPNIF = UPPER(TRIM(P_CLPNIF));
            SET WhereClause = WhereClause || ' AND CLPNIF LIKE ''%'|| P_CLPNIF ||'%'' ';
        END IF;
    
        
        IF P_CLPTEL IS NOT NULL AND length(P_CLPTEL)>0 THEN
            SET P_CLPTEL = UPPER(TRIM(P_CLPTEL));
            SET WhereClause = WhereClause || ' AND CLPTEL LIKE ''%'|| P_CLPTEL ||'%'' ';
        END IF;
    
        
        IF P_CLPUSU IS NOT NULL AND length(P_CLPUSU)>0 THEN
            SET P_CLPUSU = UPPER(TRIM(P_CLPUSU));
            SET WhereClause = WhereClause || ' AND CLPUSU LIKE ''%'|| P_CLPUSU ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.AA2CLIPO  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountAa2clipo', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountAa2clipo(0,'','','','','','','',0,'',0,'','',0,'', '', '', '')
