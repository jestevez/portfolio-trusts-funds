--DROP  PROCEDURE  GPSQLWEB.procReadConact1

CREATE PROCEDURE  GPSQLWEB.procReadConact1 (
    IN P_AREA varchar(4) ,
    IN P_CUPFEC BIGINT ,
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
  Declare InnerSQL Varchar(32000) Not Null Default '';
  Declare WhereClause1 Varchar(32000) Not Null Default '';
  Declare WhereClause2 Varchar(32000) Not Null Default '';
  Declare SortClause Varchar(32000) Not Null Default '';
  Declare C1 Cursor With Return For stmt;

    IF P_SORT IS NOT NULL AND LENGTH(P_SORT) > 0 THEN
        Set SortClause = ' ORDER BY ' || P_SORT ;
    ELSE
        Set SortClause = ' order by INVVTA ';
    END IF;

    -- WHERE CLAUSE    
    IF P_AREA IS NOT NULL AND length(P_AREA)>0 THEN
        SET P_AREA = UPPER(TRIM(P_AREA));
        SET WhereClause1 = WhereClause1 || ' AND AREA = '''|| P_AREA ||''' ';
    END IF;

    IF P_CUPFEC > 0 THEN
        SET WhereClause2 = WhereClause2 || ' AND CUPFEC >= '|| P_CUPFEC ||' ';
    END IF;
    
    Set InnerSQL = '
Select ROW_NUMBER() OVER() AS ROW__NUMBER, T1.INVVAL, T1.INVNOP, T1.INVINA, T1.INVVTA, T1.INVVNO,  COALESCE(T2.CUPMNT, T1.vlotas) as VLOTAS, 0 as CUPMNT , AREA from 
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
		WHERE 1=1 '|| WhereClause1 ||'
            
';


    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN
         Set StringSQL = 'SELECT * FROM ( ' || InnerSQL || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = InnerSQL  || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = InnerSQL || SortClause; 
        END IF;
    END IF;

    --CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadConact1', StringSQL);
    Prepare stmt From StringSQL; 
    
    Open C1; 
END
GO

--
--call GPSQLWEB.procReadConact1 ('TESO','20140501', 0, 0, '', '', '', '')
