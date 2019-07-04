--DROP PROCEDURE GPSQLWEB.procCreatePerfil
    
CREATE PROCEDURE GPSQLWEB.procCreatePerfil
(
    IN P_PRFPRF VARCHAR(10),
    IN P_PRFNOM VARCHAR(45),
    IN P_PRFCED VARCHAR(12),
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
BEGIN
    Declare StringSQL Varchar(32000) Default '';
    Declare V_EXISTE INTEGER Default 0;

    SELECT COUNT(1) INTO V_EXISTE FROM GPDATWEB.PERFIL WHERE PRFPRF=P_PRFNOM;
    
    IF V_EXISTE > 0 THEN
        SET P_MSGCODE = 1000; --1000 -  El Perfil de Usuario ya Existe
        SET StringSQL = ' 1000 -  El Perfil de Usuario ya Existe '|| P_PRFPRF; 
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreatePerfil', StringSQL);
    ELSE
        INSERT INTO GPDATWEB.PERFIL (PRFPRF ,PRFNOM ,PRFCED ) VALUES ( P_PRFPRF , P_PRFNOM , P_PRFCED );
        SET P_MSGCODE = 0;
        SET StringSQL = 'INSERT INTO GPDATWEB.PERFIL (PRFPRF ,PRFNOM ,PRFCED ) VALUES ( '''|| P_PRFPRF || ''' , '''|| P_PRFNOM || ''' , '''|| P_PRFCED || ''' )'; 
        CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreatePerfil', StringSQL);
    END IF;
END
GO


