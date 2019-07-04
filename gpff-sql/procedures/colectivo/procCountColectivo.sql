--DROP  PROCEDURE  GPSQLWEB.procCountColectivo

CREATE PROCEDURE  GPSQLWEB.procCountColectivo (
    IN P_CLICLA BIGINT,
    IN P_CLINIF varchar(12),
    IN P_CLINOM varchar(60),
    IN P_CLVEMP varchar(2),
    IN P_CLVDEL varchar(2),
    
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

IF P_CLICLA IS NOT NULL AND length(P_CLICLA)>0 THEN
    SET P_CLICLA = UPPER(TRIM(P_CLICLA));
    SET WhereClause = WhereClause || ' AND CLICLA = '''|| P_CLICLA ||''' ';
END IF;


IF P_CLINIF IS NOT NULL AND length(P_CLINIF)>0 THEN
    SET P_CLINIF = UPPER(TRIM(P_CLINIF));
    SET WhereClause = WhereClause || ' AND CLINIF = '''|| P_CLINIF ||''' ';
END IF;


IF P_CLINOM IS NOT NULL AND length(P_CLINOM)>0 THEN
    SET P_CLINOM = UPPER(TRIM(P_CLINOM));
    SET WhereClause = WhereClause || ' AND (CLINOM LIKE ''%'|| P_CLINOM ||'%'' OR CLIAPE LIKE ''%'|| P_CLINOM ||'%'' OR CLIAP2 LIKE ''%'|| P_CLINOM ||'%'' ) ';
END IF;


IF P_CLVEMP IS NOT NULL AND length(P_CLVEMP)>0 THEN
    SET P_CLVEMP = UPPER(TRIM(P_CLVEMP));
    SET WhereClause = WhereClause || ' AND CLVEMP = '''|| P_CLVEMP ||''' ';
END IF;


IF P_CLVDEL IS NOT NULL AND length(P_CLVDEL)>0 THEN
    SET P_CLVDEL = UPPER(TRIM(P_CLVDEL));
    SET WhereClause = WhereClause || ' AND CLVDEL = '''|| P_CLVDEL ||''' ';
END IF;
    

Set StringSQL = 'select COUNT(1) from gpdatweb.clvmex join gpdatweb.aa2mcli on clvcli=clicla WHERE 1=1 '|| WhereClause ||'' ; 

PREPARE stmt1 FROM StringSQL;
CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountColectivo', StringSQL);
OPEN c1;
    FETCH c1 into total;
CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountColectivo(0,'','','','',0,'', '', '', '')
