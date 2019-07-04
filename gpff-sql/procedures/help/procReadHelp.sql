--drop PROCEDURE GPSQLWEB.procReadHelp

CREATE PROCEDURE  GPSQLWEB.procReadHelp
( IN P_COD_TABLA VARCHAR(15), 
  IN P_CODE VARCHAR(50),
  IN P_DESCRIPTION VARCHAR(150),
  IN P_PARENTCODE VARCHAR(150),
  IN P_FIRSTRESULT INTEGER,
  IN P_MAXRESULT INTEGER,
  IN P_SORT VARCHAR(255),
  IN P_USERNAME VARCHAR(50),
  IN P_IPADDRESS VARCHAR(255),
  IN P_USERAGENT VARCHAR(32000)
)
RESULT SET 1
LANGUAGE SQL
BEGIN
  Declare StringSQL VARCHAR(32000) Not Null Default '';
  Declare WhereClause VARCHAR(32000) Not Null Default '';
  Declare SortClause VARCHAR(32000) Not Null Default '';
  
  DECLARE Tabla  VARCHAR(100) Not Null Default '';
  Declare FieldCod VARCHAR(50) Not Null Default '';
  Declare FieldDescription VARCHAR(50) Not Null Default '';
  Declare FieldParent VARCHAR(50) Not Null Default '';

  DECLARE c1 CURSOR WITH RETURN FOR s1;
  

  IF P_SORT IS NOT NULL AND LENGTH(P_SORT) > 0 THEN
        Set SortClause = ' ORDER BY ' || P_SORT ;
    END IF;

  SELECT TABLENAME, TABLECODE, TABLEDESC, TABLEPARENT INTO Tabla, FieldCod, FieldDescription, FieldParent FROM GPSQLWEB.TableHelp where CODE= P_COD_TABLA;


  IF P_CODE IS NOT NULL AND LENGTH(P_CODE) > 0 THEN
        Set WhereClause = ' AND ' || FieldCod || ' = ' || P_CODE;
   END IF;

   IF P_DESCRIPTION IS NOT NULL AND LENGTH(P_DESCRIPTION) > 0 THEN
        Set WhereClause = ' AND ' || FieldDescription || ' like ''%' || P_DESCRIPTION || '%'' ';
   END IF; 

   IF FieldParent IS NOT NULL AND LENGTH(FieldParent) > 0  AND P_PARENTCODE IS NOT NULL AND LENGTH(P_PARENTCODE) > 0  THEN
        Set WhereClause = ' AND ' || FieldParent || ' = ' || P_PARENTCODE ;
   END IF; 




    IF P_FIRSTRESULT > 0 AND P_MAXRESULT > 0 THEN        
         Set StringSQL = 'SELECT * FROM ( SELECT ROW_NUMBER() OVER() AS ROW__NUMBER, ' || FieldCod || ' AS CODE,' || FieldDescription || ' AS DESC FROM ' || Tabla || '  WHERE 1=1 ' || WhereClause || ' ) AS LIMITED__TABLE WHERE ROW__NUMBER BETWEEN '|| P_FIRSTRESULT || ' and '|| ((P_MAXRESULT+P_FIRSTRESULT) -1) || SortClause ;
    ELSE
        IF P_MAXRESULT > 0 THEN
            Set StringSQL = 'SELECT ' || FieldCod || ' AS CODE ,' || FieldDescription || '  AS DESC FROM  ' || Tabla || ' WHERE 1=1 ' || WhereClause || SortClause || ' FETCH FIRST '|| P_MAXRESULT ||' ROWS ONLY '; 
        ELSE
            Set StringSQL = 'SELECT ' || FieldCod || ' AS CODE,' || FieldDescription || ' AS DESC FROM  ' || Tabla || ' WHERE 1=1 ' || WhereClause || SortClause; 
        END IF;
    END IF;


CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Leer', 'procReadHelp', StringSQL);

PREPARE s1 FROM StringSQL;
OPEN c1;

  
END

--call GPSQLWEB.procReadHelp('04','','','',0,0,'','','','')