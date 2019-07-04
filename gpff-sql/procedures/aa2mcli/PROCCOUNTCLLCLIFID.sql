--DROP  PROCEDURE  GPSQLWEB.PROCCOUNTCLLCLIFID

CREATE PROCEDURE  GPSQLWEB.PROCCOUNTCLLCLIFID (
    IN P_CLICLA BIGINT ,
    IN P_CLINIF varchar(12) ,
    IN P_CLINOM varchar(60) ,
    IN P_AREA varchar(4),
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT TOTAL INTEGER
)
RESULT SETS 1
LANGUAGE SQL
BEGIN
    Declare StringSQL Varchar(32000) Not Null Default '';
    Declare WhereClause Varchar(32000) Not Null Default '';
    Declare C1 Cursor With Return For stmt;

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

    Set StringSQL = 'SELECT COUNT(1) FROM  gpdatweb.clvfon join gpdatweb.aa2mcli on cvfcli=clicla  WHERE 1=1 ' || WhereClause; 
    PREPARE stmt1 FROM StringSQL;
    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountAa2mcli', StringSQL);
    OPEN c1;
        FETCH c1 into total;
    CLOSE c1;

    --CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'PROCCOUNTCLLCLIFID', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--call GPSQLWEB.PROCCOUNTCLLCLIFID ('','',0,'',0,0,'','','','','','','','',0,'',0,0,0,'',0,0,0,'','','',0,0,0,'','','','','',0,'','',0,'','',0,'',0,'','',0,0,'',0,0,'', 1, 10, '', '', '', '')
