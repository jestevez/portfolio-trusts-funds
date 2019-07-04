--DROP  PROCEDURE  GPSQLWEB.procCountTabtr

CREATE PROCEDURE  GPSQLWEB.procCountTabtr (
IN P_CODIGO INTEGER,
IN P_TEXTO varchar(30),
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
  IF P_CODIGO > 0 THEN
    SET WhereClause = WhereClause || ' AND CODIGO = '|| P_CODIGO ||' ';
  END IF;

  IF P_TEXTO IS NOT NULL AND length(P_TEXTO)>0 THEN
    SET P_TEXTO = UPPER(TRIM(P_TEXTO));
    SET WhereClause = WhereClause || ' AND TEXTO LIKE ''%'|| P_TEXTO ||'%'' ';
  END IF;
    
  Set StringSQL = 'SELECT COUNT(1) FROM  GPDATWEB.TABTR  WHERE 1=1 ' || WhereClause;
  PREPARE stmt1 FROM StringSQL;
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountTabtr', StringSQL);
  OPEN c1;
    FETCH c1 into total;
  CLOSE c1;
END
GO

--call GPSQLWEB.procCountTabtr(0,'', '', '', '')
