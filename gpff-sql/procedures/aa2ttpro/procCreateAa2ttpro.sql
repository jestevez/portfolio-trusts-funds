
    
--DROP PROCEDURE GPSQLWEB.procCreateAa2ttpro
    
CREATE PROCEDURE GPSQLWEB.procCreateAa2ttpro
(
    IN P_PROEMP VARCHAR(2),
    IN P_PRODEL VARCHAR(2),
    IN P_PROCLA NUMERIC(15 , 0),
    IN P_PRONOM VARCHAR(40),
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),

 OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Default '';
  Declare V_CANT INT DEFAULT 0;
  
DECLARE V_CTAEMP VARCHAR(2);
DECLARE V_CTADEL VARCHAR(2);
DECLARE V_CTAGEN VARCHAR(12);
DECLARE END_TABLE INT DEFAULT 0 ;
DECLARE V_TABCLA VARCHAR ( 4 ) DEFAULT '' ;
DECLARE C CURSOR FOR SELECT upper( TABEMP CONCAT TABDEL) FROM GPDATWEB . AA2MTAB WHERE TABORI = P_PROEMP CONCAT P_PRODEL and upper( TABEMP CONCAT TABDEL) <> P_PROEMP CONCAT P_PRODEL;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET END_TABLE = 1 ;
  
SET P_MSGCODE = 9999;

  SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.AA2TTPRO WHERE PROCLA = P_PROCLA AND PROEMP = P_PROEMP AND  PRODEL = P_PRODEL ;

  IF V_CANT > 0 THEN
	SET P_MSGCODE = 9001;
        SET StringSQL = '9001 - HAY MAS DE UN REGISTRO CON LA CLAVE PRIMARIA';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateAa2ttpro', StringSQL);
        RETURN;
  END IF;
  
  INSERT INTO GPDATWEB.AA2TTPRO (PROEMP ,PRODEL ,PROCLA ,PRONOM ) VALUES ( P_PROEMP , P_PRODEL , P_PROCLA , P_PRONOM );

  Set StringSQL = 'INSERT INTO GPDATWEB.AA2TTPRO (PROEMP ,PRODEL ,PROCLA ,PRONOM ) VALUES ( '''|| P_PROEMP || ''' , '''|| P_PRODEL || ''' , '''|| P_PROCLA || ''' , '''|| P_PRONOM || ''' )'; 
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateAa2ttpro', StringSQL);

  
  OPEN C ;
    FETCH FROM C INTO V_TABCLA ;

    WHILE END_TABLE = 0 DO
        IF ( V_TABCLA != ( P_PROEMP CONCAT P_PRODEL ) ) THEN
            INSERT INTO GPDATWEB.AA2TTPRO (PROEMP ,PRODEL ,PROCLA ,PRONOM ) VALUES ( SUBSTR (V_TABCLA , 1 , 2 ) , SUBSTR ( V_TABCLA , 3 , 2 ) , P_PROCLA , P_PRONOM );
        END IF;
    FETCH FROM C INTO V_TABCLA ;
    END WHILE ;

  CLOSE C ;

  SET P_MSGCODE = 0;
END
GO


