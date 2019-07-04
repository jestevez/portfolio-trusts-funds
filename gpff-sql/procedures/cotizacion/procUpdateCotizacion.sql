
-- DROP PROCEDURE GPSQLWEB.procUpdateCotizacion
    
CREATE PROCEDURE GPSQLWEB.procUpdateCotizacion
(
    IN P_ROWID BIGINT,
    IN P_CTZVAL varchar(12) ,
    IN P_CTZFEC DECIMAL(8 , 0),
    IN P_CTZCOT DECIMAL(18 , 9),
    IN P_CTZCOD varchar(1) ,

    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Default '';
  Declare V_CANT INT DEFAULT 0;
  
  SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.COTIZACION WHERE RRN(GPDATWEB.COTIZACION) =  P_ROWID ;

  IF V_CANT > 1 THEN
	SET P_MSGCODE = 9001;
        SET StringSQL = '9001 - HAY MAS DE UN REGISTRO CON LA CLAVE PRIMARIA';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateCotizacion', StringSQL);
        RETURN;
  END IF;

  IF V_CANT = 0 THEN
	SET P_MSGCODE = 9000;
        SET StringSQL = '9000 - NO HAY REGISTROS QUE MODIFICAR CODIGO';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateCotizacion', StringSQL);
        RETURN;
  END IF;

  UPDATE GPDATWEB.COTIZACION SET CTZVAL= P_CTZVAL , CTZFEC= P_CTZFEC , CTZCOT= P_CTZCOT , CTZCOD= P_CTZCOD  WHERE RRN(GPDATWEB.COTIZACION) =  P_ROWID ;
  SET P_MSGCODE = 0;    
  Set StringSQL = 'UPDATE GPDATWEB.COTIZACION SET CTZVAL= '''||P_CTZVAL || ''' , CTZFEC= '''||P_CTZFEC || ''' , CTZCOT= '''||P_CTZCOT || ''' , CTZCOD= '''||P_CTZCOD || '''  WHERE RRN(GPDATWEB.COTIZACION) = '''|| P_ROWID || ''';';
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateCotizacion', StringSQL);
END
GO


