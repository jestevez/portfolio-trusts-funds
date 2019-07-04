--DROP PROCEDURE GPSQLWEB.procCreateCupamort
    
CREATE PROCEDURE GPSQLWEB.procCreateCupamort
(
    IN P_CUPEMP VARCHAR(2),
    IN P_CUPDEL VARCHAR(2),
    IN P_CUPTIP VARCHAR(1),
    IN P_CUPVAL VARCHAR(12),
    IN P_CUPFEC DECIMAL(8 , 0),
    IN P_CUPMNT NUMERIC(8 , 5),
    IN P_CUPIMP DECIMAL(15 , 2),
    IN P_CUPCOB DECIMAL(8 , 0),
    IN P_CUPVEN VARCHAR(1),
    IN P_CUPMCB VARCHAR(1),
    IN P_CUPCBT VARCHAR(1),
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Default '';
  SET P_MSGCODE = 9999;

  -- CONDICION DE UNICO DEL CUPON
  SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.CUPAMORT WHERE CUPVAL=P_CUPVAL AND CUPEMP = P_CUPEMP AND CUPDEL = P_CUPDEL AND CUPFEC=P_CUPFEC;

  IF V_CANT > 0 THEN
	SET P_MSGCODE = 9001;
        SET StringSQL = '9001 - HAY MAS DE UN REGISTRO CON LA CLAVE PRIMARIA';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateCupamort', StringSQL);
        RETURN;
  END IF;
  
  
  INSERT INTO GPDATWEB.CUPAMORT (CUPEMP ,CUPDEL ,CUPTIP ,CUPVAL ,CUPFEC ,CUPMNT ,CUPIMP ,CUPCOB ,CUPVEN ,CUPMCB ,CUPCBT ) VALUES ( P_CUPEMP , P_CUPDEL , P_CUPTIP , P_CUPVAL , P_CUPFEC , P_CUPMNT , P_CUPIMP , P_CUPCOB , P_CUPVEN , P_CUPMCB , P_CUPCBT );

  Set StringSQL = 'INSERT INTO GPDATWEB.CUPAMORT (CUPEMP ,CUPDEL ,CUPTIP ,CUPVAL ,CUPFEC ,CUPMNT ,CUPIMP ,CUPCOB ,CUPVEN ,CUPMCB ,CUPCBT ) VALUES ( '''|| P_CUPEMP || ''' , '''|| P_CUPDEL || ''' , '''|| P_CUPTIP || ''' , '''|| P_CUPVAL || ''' , '''|| P_CUPFEC || ''' , '''|| P_CUPMNT || ''' , '''|| P_CUPIMP || ''' , '''|| P_CUPCOB || ''' , '''|| P_CUPVEN || ''' , '''|| P_CUPMCB || ''' , '''|| P_CUPCBT || ''' )'; 
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateCupamort', StringSQL);
  SET P_MSGCODE = 0;
END
GO


