

--DROP  PROCEDURE  GPSQLWEB.procCountAa2comi

CREATE PROCEDURE  GPSQLWEB.procCountAa2comi (
     IN P_COMEMP VARCHAR(2),
    IN P_COMDEL VARCHAR(2),
    IN P_COMFIC DECIMAL(8 , 0),
    IN P_COMCOB DECIMAL(9 , 6),
    IN P_COMNCO DECIMAL(9 , 6),
    IN P_COMVIV DECIMAL(9 , 6),
    IN P_COMCPJ DECIMAL(9 , 6),
    IN P_COMCFL DECIMAL(9 , 6),
    IN P_COMINP DECIMAL(9 , 6),
    IN P_COMMOP DECIMAL(9 , 6),
    IN P_COMSCF DECIMAL(9 , 6),
    IN P_COMDIS VARCHAR(12),
    IN P_COMINV VARCHAR(12),
    IN P_COMFEC DECIMAL(8 , 0),
    IN P_COMUSU VARCHAR(10),
    IN P_COMHOR DECIMAL(6 , 0),

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

        
        IF P_COMEMP IS NOT NULL AND length(P_COMEMP)>0 THEN
            SET P_COMEMP = UPPER(TRIM(P_COMEMP));
            SET WhereClause = WhereClause || ' AND COMEMP LIKE ''%'|| P_COMEMP ||'%'' ';
        END IF;
    
        
        IF P_COMDEL IS NOT NULL AND length(P_COMDEL)>0 THEN
            SET P_COMDEL = UPPER(TRIM(P_COMDEL));
            SET WhereClause = WhereClause || ' AND COMDEL LIKE ''%'|| P_COMDEL ||'%'' ';
        END IF;
    
        
        IF P_COMFIC IS NOT NULL AND length(P_COMFIC)>0 THEN
            SET P_COMFIC = UPPER(TRIM(P_COMFIC));
            SET WhereClause = WhereClause || ' AND COMFIC LIKE ''%'|| P_COMFIC ||'%'' ';
        END IF;
    
        
        IF P_COMCOB IS NOT NULL AND length(P_COMCOB)>0 THEN
            SET P_COMCOB = UPPER(TRIM(P_COMCOB));
            SET WhereClause = WhereClause || ' AND COMCOB LIKE ''%'|| P_COMCOB ||'%'' ';
        END IF;
    
        
        IF P_COMNCO IS NOT NULL AND length(P_COMNCO)>0 THEN
            SET P_COMNCO = UPPER(TRIM(P_COMNCO));
            SET WhereClause = WhereClause || ' AND COMNCO LIKE ''%'|| P_COMNCO ||'%'' ';
        END IF;
    
        
        IF P_COMVIV IS NOT NULL AND length(P_COMVIV)>0 THEN
            SET P_COMVIV = UPPER(TRIM(P_COMVIV));
            SET WhereClause = WhereClause || ' AND COMVIV LIKE ''%'|| P_COMVIV ||'%'' ';
        END IF;
    
        
        IF P_COMCPJ IS NOT NULL AND length(P_COMCPJ)>0 THEN
            SET P_COMCPJ = UPPER(TRIM(P_COMCPJ));
            SET WhereClause = WhereClause || ' AND COMCPJ LIKE ''%'|| P_COMCPJ ||'%'' ';
        END IF;
    
        
        IF P_COMCFL IS NOT NULL AND length(P_COMCFL)>0 THEN
            SET P_COMCFL = UPPER(TRIM(P_COMCFL));
            SET WhereClause = WhereClause || ' AND COMCFL LIKE ''%'|| P_COMCFL ||'%'' ';
        END IF;
    
        
        IF P_COMINP IS NOT NULL AND length(P_COMINP)>0 THEN
            SET P_COMINP = UPPER(TRIM(P_COMINP));
            SET WhereClause = WhereClause || ' AND COMINP LIKE ''%'|| P_COMINP ||'%'' ';
        END IF;
    
        
        IF P_COMMOP IS NOT NULL AND length(P_COMMOP)>0 THEN
            SET P_COMMOP = UPPER(TRIM(P_COMMOP));
            SET WhereClause = WhereClause || ' AND COMMOP LIKE ''%'|| P_COMMOP ||'%'' ';
        END IF;
    
        
        IF P_COMSCF IS NOT NULL AND length(P_COMSCF)>0 THEN
            SET P_COMSCF = UPPER(TRIM(P_COMSCF));
            SET WhereClause = WhereClause || ' AND COMSCF LIKE ''%'|| P_COMSCF ||'%'' ';
        END IF;
    
        
        IF P_COMDIS IS NOT NULL AND length(P_COMDIS)>0 THEN
            SET P_COMDIS = UPPER(TRIM(P_COMDIS));
            SET WhereClause = WhereClause || ' AND COMDIS LIKE ''%'|| P_COMDIS ||'%'' ';
        END IF;
    
        
        IF P_COMINV IS NOT NULL AND length(P_COMINV)>0 THEN
            SET P_COMINV = UPPER(TRIM(P_COMINV));
            SET WhereClause = WhereClause || ' AND COMINV LIKE ''%'|| P_COMINV ||'%'' ';
        END IF;
    
        
        IF P_COMFEC IS NOT NULL AND length(P_COMFEC)>0 THEN
            SET P_COMFEC = UPPER(TRIM(P_COMFEC));
            SET WhereClause = WhereClause || ' AND COMFEC LIKE ''%'|| P_COMFEC ||'%'' ';
        END IF;
    
        
        IF P_COMUSU IS NOT NULL AND length(P_COMUSU)>0 THEN
            SET P_COMUSU = UPPER(TRIM(P_COMUSU));
            SET WhereClause = WhereClause || ' AND COMUSU LIKE ''%'|| P_COMUSU ||'%'' ';
        END IF;
    
        
        IF P_COMHOR IS NOT NULL AND length(P_COMHOR)>0 THEN
            SET P_COMHOR = UPPER(TRIM(P_COMHOR));
            SET WhereClause = WhereClause || ' AND COMHOR LIKE ''%'|| P_COMHOR ||'%'' ';
        END IF;
    
Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.AA2COMI  WHERE 1=1 ' || WhereClause; 
PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountAa2comi', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountAa2comi('','',0,'','','','','','','','','','',0,'',0, '', '', '')
