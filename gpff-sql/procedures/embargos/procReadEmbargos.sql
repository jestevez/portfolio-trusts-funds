

--DROP  PROCEDURE  GPSQLWEB.procReadEmbargos

CREATE PROCEDURE  GPSQLWEB.procReadEmbargos (
    IN P_ROWID BIGINT,
 IN P_EEMPRE varchar(2) ,
 IN P_EDELEG varchar(2) ,
 IN P_EMOVNI varchar(12) ,
 IN P_EMONTO double ,
 IN P_EMONTT double ,
 IN P_EFECHA BIGINT ,
 IN P_EFECHF BIGINT ,
 IN P_EUSUAR varchar(10) ,
 IN P_EPANTA varchar(10) ,
 IN P_EFECMO BIGINT ,

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
            SET WhereClause = WhereClause || ' AND RRN(GPDATWEB.EMBARGOS) =' || P_ROWID ;
        END IF;
        
        IF P_EEMPRE IS NOT NULL AND length(P_EEMPRE)>0 THEN
            SET P_EEMPRE = UPPER(TRIM(P_EEMPRE));
            SET WhereClause = WhereClause || ' AND EEMPRE LIKE ''%'|| P_EEMPRE ||'%'' ';
        END IF;
    
        
        IF P_EDELEG IS NOT NULL AND length(P_EDELEG)>0 THEN
            SET P_EDELEG = UPPER(TRIM(P_EDELEG));
            SET WhereClause = WhereClause || ' AND EDELEG LIKE ''%'|| P_EDELEG ||'%'' ';
        END IF;
    
        
        IF P_EMOVNI IS NOT NULL AND length(P_EMOVNI)>0 THEN
            SET P_EMOVNI = UPPER(TRIM(P_EMOVNI));
            SET WhereClause = WhereClause || ' AND EMOVNI LIKE ''%'|| P_EMOVNI ||'%'' ';
        END IF;
    
        
        IF P_EMONTO IS NOT NULL AND length(P_EMONTO)>0 THEN
            SET P_EMONTO = UPPER(TRIM(P_EMONTO));
            SET WhereClause = WhereClause || ' AND EMONTO LIKE ''%'|| P_EMONTO ||'%'' ';
        END IF;
    
        
        IF P_EMONTT IS NOT NULL AND length(P_EMONTT)>0 THEN
            SET P_EMONTT = UPPER(TRIM(P_EMONTT));
            SET WhereClause = WhereClause || ' AND EMONTT LIKE ''%'|| P_EMONTT ||'%'' ';
        END IF;
    
        
        IF P_EFECHA > 0 THEN
            SET WhereClause = WhereClause || ' AND EFECHA = '|| P_EFECHA ||' ';
        END IF;
    
        
        IF P_EFECHF > 0 THEN
            SET WhereClause = WhereClause || ' AND EFECHF = '|| P_EFECHF ||' ';
        END IF;
    
        
        IF P_EUSUAR IS NOT NULL AND length(P_EUSUAR)>0 THEN
            SET P_EUSUAR = UPPER(TRIM(P_EUSUAR));
            SET WhereClause = WhereClause || ' AND EUSUAR LIKE ''%'|| P_EUSUAR ||'%'' ';
        END IF;
    
        
        IF P_EPANTA IS NOT NULL AND length(P_EPANTA)>0 THEN
            SET P_EPANTA = UPPER(TRIM(P_EPANTA));
            SET WhereClause = WhereClause || ' AND EPANTA LIKE ''%'|| P_EPANTA ||'%'' ';
        END IF;
    
        
        IF P_EFECMO > 0 THEN
            SET WhereClause = WhereClause || ' AND EFECMO = '|| P_EFECMO ||' ';
        END IF;
    

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER,  RRN(GPDATWEB.EMBARGOS) as ROWID,EEMPRE ,EDELEG ,EMOVNI ,EMONTO ,EMONTT ,EFECHA ,EFECHF ,EUSUAR ,EPANTA ,EFECMO  FROM GPDATWEB.EMBARGOS  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT   RRN(GPDATWEB.EMBARGOS) as ROWID,EEMPRE ,EDELEG ,EMOVNI ,EMONTO ,EMONTT ,EFECHA ,EFECHF ,EUSUAR ,EPANTA ,EFECMO  FROM  GPDATWEB.EMBARGOS WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT   RRN(GPDATWEB.EMBARGOS) as ROWID,EEMPRE ,EDELEG ,EMOVNI ,EMONTO ,EMONTT ,EFECHA ,EFECHF ,EUSUAR ,EPANTA ,EFECMO  FROM  GPDATWEB.EMBARGOS WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadEmbargos', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.procReadEmbargos ('','','','','',0,0,'','',0, 1, 10, '', '', '', '')
