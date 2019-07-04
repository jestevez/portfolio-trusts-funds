
-- DROP PROCEDURE GPSQLWEB.procUpdateAa2tprcl
    
CREATE PROCEDURE GPSQLWEB.procUpdateAa2tprcl
(
    IN P_ROWID BIGINT,
 IN P_PCLEMP VARCHAR(2),
    IN P_PCLDEL VARCHAR(2),
    IN P_PCLCLA NUMERIC(15 , 0),
    IN P_PCLNOM VARCHAR(40),
    IN P_PCLCTA VARCHAR(12),

    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Default '';
  Declare V_PROD INT DEFAULT 0;
  Declare V_TIPCL INT DEFAULT 0;
  Declare V_CANT INT DEFAULT 0;
  Declare V_CTA INT DEFAULT 0;

DECLARE V_CTAEMP VARCHAR(2);
DECLARE V_CTADEL VARCHAR(2);
DECLARE V_CTAGEN VARCHAR(12);
DECLARE END_TABLE INT DEFAULT 0 ;
DECLARE V_TABCLA VARCHAR ( 4 ) DEFAULT '' ;
DECLARE C CURSOR FOR SELECT upper( TABEMP CONCAT TABDEL) FROM GPDATWEB . AA2MTAB WHERE TABORI = P_PCLEMP CONCAT P_PCLDEL and upper( TABEMP CONCAT TABDEL) <> P_PCLEMP CONCAT P_PCLDEL;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET END_TABLE = 1 ;

  
  SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.AA2TPRCL WHERE RRN(GPDATWEB.AA2TPRCL) =  P_ROWID ;
  
  select count(1) into V_PROD from GPDATWEB.AA2TTPRO where CAST ( substring(PROCLA,12,3 ) AS INTEGER) = CAST ( substring(P_PCLCLA,10,3 ) AS INTEGER) and PROEMP = P_PCLEMP AND  PRODEL = P_PCLDEL;
  IF V_PROD = 0 THEN
	SET P_MSGCODE = 1006;
        SET StringSQL = '1006 - CODIGO DE ENLACE CONTABLE NO EXISTE';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateAa2tprcl', StringSQL);
        RETURN;
  END IF;

  select count(1) into V_TIPCL from GPDATWEB.AA2TIPCL where TICCLA = CAST ( substring(P_PCLCLA,13,2 ) AS INTEGER);
  IF V_TIPCL = 0 THEN
	SET P_MSGCODE = 1007;
        SET StringSQL = '1007 - TIPO DE ENTIDAD / CLIENTE NO EXISTE';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateAa2tprcl', StringSQL);
        RETURN;
  END IF;

  SELECT COUNT(1) INTO V_CTA FROM GPDATWEB.AA2CTA where CTAGEN = P_PCLCTA and  CTAEMP=P_PCLEMP  and  CTADEL=P_PCLDEL;
  IF V_CTA = 0 THEN
	SET P_MSGCODE = 1008;
        SET StringSQL = '1008 - LA CUENTA NO EXISTE EN EL PLAN CONTABLE';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateAa2tprcl', StringSQL);
        RETURN;
  END IF;

  IF V_CANT > 1 THEN
	SET P_MSGCODE = 9001;
        SET StringSQL = '9001 - HAY MAS DE UN REGISTRO CON LA CLAVE PRIMARIA';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateAa2tprcl', StringSQL);
        RETURN;
  END IF;

  IF V_CANT = 0 THEN
	SET P_MSGCODE = 9000;
        SET StringSQL = '9000 - NO HAY REGISTROS QUE MODIFICAR CODIGO';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateAa2tprcl', StringSQL);
        RETURN;
  END IF;

  UPDATE GPDATWEB.AA2TPRCL SET PCLEMP= P_PCLEMP , PCLDEL= P_PCLDEL , PCLCLA= P_PCLCLA , PCLNOM= P_PCLNOM , PCLCTA= P_PCLCTA  WHERE RRN(GPDATWEB.AA2TPRCL) =  P_ROWID ;
  
  Set StringSQL = 'UPDATE GPDATWEB.AA2TPRCL SET PCLEMP= '''||P_PCLEMP || ''' , PCLDEL= '''||P_PCLDEL || ''' , PCLCLA= '''||P_PCLCLA || ''' , PCLNOM= '''||P_PCLNOM || ''' , PCLCTA= '''||P_PCLCTA || '''  WHERE RRN(GPDATWEB.AA2TPRCL) = '''|| P_ROWID || ''';';
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateAa2tprcl', StringSQL);
  
  OPEN C ;
    FETCH FROM C INTO V_TABCLA ;

    WHILE END_TABLE = 0 DO
        IF ( V_TABCLA != ( P_PCLEMP CONCAT P_PCLDEL ) ) THEN

            UPDATE GPDATWEB.AA2TPRCL SET PCLNOM= P_PCLNOM , PCLCTA= P_PCLCTA  
                WHERE PCLEMP= SUBSTR (V_TABCLA , 1 , 2 ) AND PCLDEL= SUBSTR ( V_TABCLA , 3 , 2 ) AND PCLCLA= P_PCLCLA  ;   

        END IF;
    FETCH FROM C INTO V_TABCLA ;
    END WHILE ;

  CLOSE C ;

  SET P_MSGCODE = 0;    
END
GO


