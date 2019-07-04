--DROP  PROCEDURE  GPSQLWEB.PROCREADCLLCLIFID

CREATE PROCEDURE  GPSQLWEB.PROCREADCLLCLIFID (
    IN P_CLICLA BIGINT ,
    IN P_CLINIF varchar(12) ,
    IN P_CLINOM varchar(60) ,
    IN P_AREA varchar(4),
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
    ELSE
        Set SortClause = ' order by clinif';
    END IF;

    IF P_CLICLA > 0 THEN
        SET WhereClause = WhereClause || ' AND CLICLA = '|| P_CLICLA ||' ';
    END IF;


    IF P_CLINIF IS NOT NULL AND length(P_CLINIF)>0 THEN
        SET P_CLINIF = UPPER(TRIM(P_CLINIF));
        SET WhereClause = WhereClause || ' AND CLINIF LIKE ''%'|| P_CLINIF ||'%'' ';
    END IF;


    IF P_CLINOM IS NOT NULL AND length(P_CLINOM)>0 THEN
        SET P_CLINOM = UPPER(TRIM(P_CLINOM));
        SET WhereClause = WhereClause || ' AND ( CLINOM LIKE ''%'|| P_CLINOM ||'%'' OR CLIAPE LIKE ''%'|| P_CLINOM ||'%'' OR CLIAP2 LIKE ''%'|| P_CLINOM ||'%'' )';
    END IF;

    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, clinif, clicla, (CLINOM || CLIAPE || CLIAP2) as CLINOM  FROM gpdatweb.clvfon join gpdatweb.aa2mcli on cvfcli=clicla  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT clinif, clicla, (CLINOM || CLIAPE || CLIAP2) as CLINOM  FROM  gpdatweb.clvfon join gpdatweb.aa2mcli on cvfcli=clicla WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT clinif, clicla, (CLINOM || CLIAPE || CLIAP2) as CLINOM  FROM  gpdatweb.clvfon join gpdatweb.aa2mcli on cvfcli=clicla WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;

    --CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'PROCREADCLLCLIFID', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.PROCREADCLLCLIFID ('','',0,'',0,0,'','','','','','','','',0,'',0,0,0,'',0,0,0,'','','',0,0,0,'','','','','',0,'','',0,'','',0,'',0,'','',0,0,'',0,0,'', 1, 10, '', '', '', '')
