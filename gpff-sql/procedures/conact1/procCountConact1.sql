--DROP  PROCEDURE  GPSQLWEB.procCountConact1

CREATE PROCEDURE  GPSQLWEB.procCountConact1 (
    IN P_AREA varchar(4),
    IN P_CUPFEC BIGINT,
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(32000),
    OUT TOTAL INTEGER
)
RESULT SETS 1
LANGUAGE SQL
BEGIN
    Declare StringSQL Varchar(32000) Not Null Default '';
    Declare InnerSQL Varchar(32000) Not Null Default '';
  Declare WhereClause1 Varchar(32000) Not Null Default '';
  Declare WhereClause2 Varchar(32000) Not Null Default '';
    Declare SortClause Varchar(32000) Not Null Default '';
    Declare C1 Cursor With Return For stmt1;

    -- WHERE CLAUSE
    IF P_AREA IS NOT NULL AND length(P_AREA)>0 THEN
        SET P_AREA = UPPER(TRIM(P_AREA));
        SET WhereClause1 = WhereClause1 || ' AND AREA = '''|| P_AREA ||''' ';
    END IF;

    IF P_CUPFEC > 0 THEN
        SET WhereClause2 = WhereClause2 || ' AND CUPFEC >= '|| P_CUPFEC ||' ';
    END IF;

    Set InnerSQL = '
Select ROW_NUMBER() OVER() AS ROW__NUMBER, T1.INVVAL, T1.INVNOP, T1.INVINA, T1.INVVTA, T1.INVVNO,  T1.vlotas, T2.CUPMNT, AREA from 
            (select INVVAL, INVNOP, INVINA, INVVTa, INVVNO, Invemp,  invdel, vlotas,  (invemp || invdel) as Area
            from  gpdatweb.invers
            join gpdatweb.valora on invdel=vlodel and invemp = vloemp and vlocoa = invval
            where invanu<>''*'' ) as T1
            left join 
            (select INVVAL, Invemp, invdel, CUPMNT 
            from  gpdatweb.invers
            join gpdatweb.cupamort on Invemp=cupemp AND CUPDEL=invdel AND CUPVAL=INVVAL
            where cuptip = ''C'' '|| WhereClause2 ||'
            order by cupfec
            fetch first 1 row only) as T2
            on T1.Invemp=T2.invemp and T1.invdel=T2.invdel and T1.INVVAL = T2.INVVAL
		WHERE 1=1 '|| WhereClause1 ||' ';
    Set StringSQL = 'SELECT COUNT(1) FROM ( ' || InnerSQL || ' )  as x' ; 
    PREPARE stmt1 FROM StringSQL;
    --CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Contar', 'procCountConact1', StringSQL);
    OPEN c1;
        FETCH c1 into total;
    CLOSE c1;
    
END
GO

--call GPSQLWEB.procCountConact1('','',0,0,0,'','','',0, '', '', '')
