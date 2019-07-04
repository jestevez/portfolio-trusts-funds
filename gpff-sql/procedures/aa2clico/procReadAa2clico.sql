

--DROP  PROCEDURE  GPSQLWEB.procReadAa2clico

CREATE PROCEDURE  GPSQLWEB.procReadAa2clico (
    IN P_ROWID BIGINT,
 IN P_CLCCLA BIGINT ,
 IN P_CLCCTR INTEGER ,
 IN P_CLCNOM varchar(20) ,
 IN P_CLCAPE varchar(15) ,
 IN P_CLCAP2 varchar(15) ,
 IN P_CLCDI1 varchar(30) ,
 IN P_CLCDI2 varchar(30) ,
 IN P_CLCPOS varchar(9) ,
 IN P_CLCPRO varchar(25) ,
 IN P_CLCPAI INTEGER ,
 IN P_CLCPOB varchar(27) ,
 IN P_CLCCAL varchar(2) ,
 IN P_CLCNUM BIGINT ,
 IN P_CLCANA BIGINT ,
 IN P_CLCTID varchar(1) ,
 IN P_CLCNIF varchar(12) ,
 IN P_CLCTEL BIGINT ,
 IN P_CLCUSU varchar(10) ,

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
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.AA2CLICO) =' || P_ROWID ;
        END IF;
        
        IF P_CLCCLA > 0 THEN
            SET WhereClause = WhereClause || ' AND CLCCLA = '|| P_CLCCLA ||' ';
        END IF;
    
        
        IF P_CLCCTR > 0 THEN
            SET WhereClause = WhereClause || ' AND CLCCTR = '|| P_CLCCTR ||' ';
        END IF;
    
        
        IF P_CLCNOM IS NOT NULL AND length(P_CLCNOM)>0 THEN
            SET P_CLCNOM = UPPER(TRIM(P_CLCNOM));
            SET WhereClause = WhereClause || ' AND CLCNOM LIKE ''%'|| P_CLCNOM ||'%'' ';
        END IF;
    
        
        IF P_CLCAPE IS NOT NULL AND length(P_CLCAPE)>0 THEN
            SET P_CLCAPE = UPPER(TRIM(P_CLCAPE));
            SET WhereClause = WhereClause || ' AND CLCAPE LIKE ''%'|| P_CLCAPE ||'%'' ';
        END IF;
    
        
        IF P_CLCAP2 IS NOT NULL AND length(P_CLCAP2)>0 THEN
            SET P_CLCAP2 = UPPER(TRIM(P_CLCAP2));
            SET WhereClause = WhereClause || ' AND CLCAP2 LIKE ''%'|| P_CLCAP2 ||'%'' ';
        END IF;
    
        
        IF P_CLCDI1 IS NOT NULL AND length(P_CLCDI1)>0 THEN
            SET P_CLCDI1 = UPPER(TRIM(P_CLCDI1));
            SET WhereClause = WhereClause || ' AND CLCDI1 LIKE ''%'|| P_CLCDI1 ||'%'' ';
        END IF;
    
        
        IF P_CLCDI2 IS NOT NULL AND length(P_CLCDI2)>0 THEN
            SET P_CLCDI2 = UPPER(TRIM(P_CLCDI2));
            SET WhereClause = WhereClause || ' AND CLCDI2 LIKE ''%'|| P_CLCDI2 ||'%'' ';
        END IF;
    
        
        IF P_CLCPOS IS NOT NULL AND length(P_CLCPOS)>0 THEN
            SET P_CLCPOS = UPPER(TRIM(P_CLCPOS));
            SET WhereClause = WhereClause || ' AND CLCPOS LIKE ''%'|| P_CLCPOS ||'%'' ';
        END IF;
    
        
        IF P_CLCPRO IS NOT NULL AND length(P_CLCPRO)>0 THEN
            SET P_CLCPRO = UPPER(TRIM(P_CLCPRO));
            SET WhereClause = WhereClause || ' AND CLCPRO LIKE ''%'|| P_CLCPRO ||'%'' ';
        END IF;
    
        
        IF P_CLCPAI > 0 THEN
            SET WhereClause = WhereClause || ' AND CLCPAI = '|| P_CLCPAI ||' ';
        END IF;
    
        
        IF P_CLCPOB IS NOT NULL AND length(P_CLCPOB)>0 THEN
            SET P_CLCPOB = UPPER(TRIM(P_CLCPOB));
            SET WhereClause = WhereClause || ' AND CLCPOB LIKE ''%'|| P_CLCPOB ||'%'' ';
        END IF;
    
        
        IF P_CLCCAL IS NOT NULL AND length(P_CLCCAL)>0 THEN
            SET P_CLCCAL = UPPER(TRIM(P_CLCCAL));
            SET WhereClause = WhereClause || ' AND CLCCAL LIKE ''%'|| P_CLCCAL ||'%'' ';
        END IF;
    
        
        IF P_CLCNUM > 0 THEN
            SET WhereClause = WhereClause || ' AND CLCNUM = '|| P_CLCNUM ||' ';
        END IF;
    
        
        IF P_CLCANA > 0 THEN
            SET WhereClause = WhereClause || ' AND CLCANA = '|| P_CLCANA ||' ';
        END IF;
    
        
        IF P_CLCTID IS NOT NULL AND length(P_CLCTID)>0 THEN
            SET P_CLCTID = UPPER(TRIM(P_CLCTID));
            SET WhereClause = WhereClause || ' AND CLCTID LIKE ''%'|| P_CLCTID ||'%'' ';
        END IF;
    
        
        IF P_CLCNIF IS NOT NULL AND length(P_CLCNIF)>0 THEN
            SET P_CLCNIF = UPPER(TRIM(P_CLCNIF));
            SET WhereClause = WhereClause || ' AND CLCNIF = '''|| P_CLCNIF ||''' ';
        END IF;
    
        
        IF P_CLCTEL > 0 THEN
            SET WhereClause = WhereClause || ' AND CLCTEL = '|| P_CLCTEL ||' ';
        END IF;
    
        
        IF P_CLCUSU IS NOT NULL AND length(P_CLCUSU)>0 THEN
            SET P_CLCUSU = UPPER(TRIM(P_CLCUSU));
            SET WhereClause = WhereClause || ' AND CLCUSU LIKE ''%'|| P_CLCUSU ||'%'' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.AA2CLICO) as ROWID,CLCCLA ,CLCCTR ,CLCNOM ,CLCAPE ,CLCAP2 ,CLCDI1 ,CLCDI2 ,CLCPOS ,CLCPRO ,CLCPAI ,CLCPOB ,CLCCAL ,CLCNUM ,CLCANA ,CLCTID ,CLCNIF ,CLCTEL ,CLCUSU  FROM GPDATWEB.AA2CLICO  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AA2CLICO) as ROWID,CLCCLA ,CLCCTR ,CLCNOM ,CLCAPE ,CLCAP2 ,CLCDI1 ,CLCDI2 ,CLCPOS ,CLCPRO ,CLCPAI ,CLCPOB ,CLCCAL ,CLCNUM ,CLCANA ,CLCTID ,CLCNIF ,CLCTEL ,CLCUSU  FROM  GPDATWEB.AA2CLICO WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(GPDATWEB.AA2CLICO) as ROWID,CLCCLA ,CLCCTR ,CLCNOM ,CLCAPE ,CLCAP2 ,CLCDI1 ,CLCDI2 ,CLCPOS ,CLCPRO ,CLCPAI ,CLCPOB ,CLCCAL ,CLCNUM ,CLCANA ,CLCTID ,CLCNIF ,CLCTEL ,CLCUSU  FROM  GPDATWEB.AA2CLICO WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    --CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadAa2clico', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadAa2clico (0,0,'','','','','','','',0,'','',0,0,'','',0,'', 1, 10, '', '', '', '')
