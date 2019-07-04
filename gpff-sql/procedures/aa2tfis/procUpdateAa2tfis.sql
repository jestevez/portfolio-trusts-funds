
-- DROP PROCEDURE GPSQLWEB.procUpdateAa2tfis
    
CREATE PROCEDURE GPSQLWEB.procUpdateAa2tfis
(
    IN P_ROWID BIGINT,
 IN P_FISEMP varchar(2),
 IN P_FISDEL varchar(2),
 IN P_FISCLA double,
 IN P_FISNOR double,
 IN P_FISBEL double,
 IN P_FISBE1 double,
 IN P_FISDIV double,
 IN P_FISINV double,
 IN P_FISGIN double,
 IN P_FISCAP double,
 IN P_FISRDI double,
 IN P_FISRD1 double,
 IN P_FISCOR double,
 IN P_FISIVA double,

    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Default '';
  Declare V_CANT INT DEFAULT 0;
  
  SELECT COUNT(1) INTO V_CANT FROM GPDATWEB.AA2TFIS WHERE RRN(GPDATWEB.AA2TFIS) =  P_ROWID ;

  IF V_CANT > 1 THEN
	SET P_MSGCODE = 9001;
        SET StringSQL = '9001 - HAY MAS DE UN REGISTRO CON LA CLAVE PRIMARIA';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateAa2tfis', StringSQL);
        RETURN;
  END IF;

  IF V_CANT = 0 THEN
	SET P_MSGCODE = 9000;
        SET StringSQL = '9000 - NO HAY REGISTROS QUE MODIFICAR CODIGO';
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateAa2tfis', StringSQL);
        RETURN;
  END IF;

  UPDATE GPDATWEB.AA2TFIS SET FISEMP= P_FISEMP , FISDEL= P_FISDEL , FISCLA= P_FISCLA , FISNOR= P_FISNOR , FISBEL= P_FISBEL , FISBE1= P_FISBE1 , FISDIV= P_FISDIV , FISINV= P_FISINV , FISGIN= P_FISGIN , FISCAP= P_FISCAP , FISRDI= P_FISRDI , FISRD1= P_FISRD1 , FISCOR= P_FISCOR , FISIVA= P_FISIVA  WHERE RRN(GPDATWEB.AA2TFIS) =  P_ROWID ;
  SET P_MSGCODE = 0;    
  Set StringSQL = 'UPDATE GPDATWEB.AA2TFIS SET FISEMP= '''||P_FISEMP || ''' , FISDEL= '''||P_FISDEL || ''' , FISCLA= '''||P_FISCLA || ''' , FISNOR= '''||P_FISNOR || ''' , FISBEL= '''||P_FISBEL || ''' , FISBE1= '''||P_FISBE1 || ''' , FISDIV= '''||P_FISDIV || ''' , FISINV= '''||P_FISINV || ''' , FISGIN= '''||P_FISGIN || ''' , FISCAP= '''||P_FISCAP || ''' , FISRDI= '''||P_FISRDI || ''' , FISRD1= '''||P_FISRD1 || ''' , FISCOR= '''||P_FISCOR || ''' , FISIVA= '''||P_FISIVA || '''  WHERE RRN(GPDATWEB.AA2TFIS) = '''|| P_ROWID || ''';';
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateAa2tfis', StringSQL);
END
GO


