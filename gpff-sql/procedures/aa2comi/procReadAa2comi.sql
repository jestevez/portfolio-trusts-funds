

--DROP  PROCEDURE  GPSQLWEB.procReadAa2comi

CREATE PROCEDURE  GPSQLWEB.procReadAa2comi (
    IN P_ROWID BIGINT,
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
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.AA2COMI) =' || P_ROWID ;
        END IF;
        
        IF P_COMEMP IS NOT NULL AND length(P_COMEMP)>0 THEN
            SET P_COMEMP = UPPER(TRIM(P_COMEMP));
            SET WhereClause = WhereClause || ' AND COMEMP LIKE ''%'|| P_COMEMP ||'%'' ';
        END IF;
    
        
        IF P_COMDEL IS NOT NULL AND length(P_COMDEL)>0 THEN
            SET P_COMDEL = UPPER(TRIM(P_COMDEL));
            SET WhereClause = WhereClause || ' AND COMDEL LIKE ''%'|| P_COMDEL ||'%'' ';
        END IF;
    
        
        IF P_COMFIC > 0 THEN
            SET WhereClause = WhereClause || ' AND COMFIC = '|| P_COMFIC ||' ';
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
    
        
        IF P_COMFEC > 0 THEN
            SET WhereClause = WhereClause || ' AND COMFEC = '|| P_COMFEC ||' ';
        END IF;
    
        
        IF P_COMUSU IS NOT NULL AND length(P_COMUSU)>0 THEN
            SET P_COMUSU = UPPER(TRIM(P_COMUSU));
            SET WhereClause = WhereClause || ' AND COMUSU LIKE ''%'|| P_COMUSU ||'%'' ';
        END IF;
    
        
        IF P_COMHOR > 0 THEN
            SET WhereClause = WhereClause || ' AND COMHOR = '|| P_COMHOR ||' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.AA2COMI) as ROWID,COMEMP ,COMDEL ,COMFIC ,COMCOB ,COMNCO ,COMVIV ,COMCPJ ,COMCFL ,COMINP ,COMMOP ,COMSCF ,COMDIS ,COMINV ,COMFEC ,COMUSU ,COMHOR  FROM GPDATWEB.AA2COMI  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AA2COMI) as ROWID,COMEMP ,COMDEL ,COMFIC ,COMCOB ,COMNCO ,COMVIV ,COMCPJ ,COMCFL ,COMINP ,COMMOP ,COMSCF ,COMDIS ,COMINV ,COMFEC ,COMUSU ,COMHOR  FROM  GPDATWEB.AA2COMI WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AA2COMI) as ROWID,COMEMP ,COMDEL ,COMFIC ,COMCOB ,COMNCO ,COMVIV ,COMCPJ ,COMCFL ,COMINP ,COMMOP ,COMSCF ,COMDIS ,COMINV ,COMFEC ,COMUSU ,COMHOR  FROM  GPDATWEB.AA2COMI WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadAa2comi', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadAa2comi ('','',0,'','','','','','','','','','',0,'',0, 1, 10, '', '', '', '')
