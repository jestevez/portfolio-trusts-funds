--DROP PROCEDURE GPSQLWEB.procCreatePerfil3
    
CREATE PROCEDURE GPSQLWEB.procCreatePerfil3
(
    IN P_PRFPRF VARCHAR(10),
    IN P_TIPOS VARCHAR(1000),
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
P1:BEGIN
    DECLARE StringSQL Varchar(32000) Default '';
    DECLARE V_TIPO DECIMAL(2, 0);
    DECLARE INX INT;
    DECLARE POS INT;
    DECLARE FIN INT;
    DECLARE VALIDO INT;
    DECLARE DELIMITADOR CHAR;
    DECLARE EXIT HANDLER FOR SQLEXCEPTION ROLLBACK;
    SET V_TIPO = 0;
    SET INX = 0;
    SET POS = 0;
    SET FIN = 0;
    SET VALIDO = 0;
    SET DELIMITADOR = ',';
    
    FETCH_LOOP:
    LOOP
        SET INX = LOCATE(DELIMITADOR, P_TIPOS, POS + 1);
        IF INX = 0 AND FIN=1 THEN
            LEAVE FETCH_LOOP;
        END IF;
        IF INX > 0 THEN
            SET V_TIPO = TRIM( SUBSTR(P_TIPOS, POS + 1, (INX - (POS+1) ) ) );
            SET POS = INX;
        ELSE
            SET V_TIPO = TRIM( SUBSTR(P_TIPOS, POS + 1, LENGTH(P_TIPOS) ) );
            SET FIN = 1;
        END IF;
        -- VALIDAR EL TIPO DE USUARIO
        SELECT COUNT(1) INTO VALIDO FROM GPDATWEB.tipos AS a WHERE a.TIPO = V_TIPO;
        IF VALIDO = 0 THEN
            SET P_MSGCODE = 1003;
            SET StringSQL = '1003 - TIPO DE USUARIO NO EXISTE  '|| V_TIPO;
            CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreatePerfil3', StringSQL);
            RETURN;
        END IF;
    END LOOP FETCH_LOOP;

    SET INX = 0;
    SET POS = 0;
    SET FIN = 0;
    -- SE ELIMINAN LAS OPCIONES PREVIAS
    DELETE FROM GPDATWEB.PERFIL3 WHERE PRFPRF=P_PRFPRF;
    Set StringSQL = 'DELETE FROM GPDATWEB.PERFIL3 WHERE PRFPRF=''' || P_PRFPRF ||'''; '; 

    FETCH_LOOP_V:
    LOOP
        SET INX = LOCATE(DELIMITADOR, P_TIPOS, POS + 1);

        IF INX = 0 AND FIN=1 THEN
            LEAVE FETCH_LOOP_V;
        END IF;
        IF INX > 0 THEN
            SET V_TIPO = TRIM( SUBSTR(P_TIPOS, POS + 1, (INX - (POS+1) ) ) );
            SET POS = INX;
        ELSE
            SET V_TIPO = TRIM( SUBSTR(P_TIPOS, POS + 1, LENGTH(P_TIPOS) ) );
            SET FIN = 1;
        END IF;
        -- SE ASIGNAR LAS OPCIONES NUEVAS
        INSERT INTO GPDATWEB.PERFIL3 (PRFPRF, PRFTIP)  VALUES (P_PRFPRF, V_TIPO);
        --Set StringSQL = StringSQL || 'INSERT INTO GPDATWEB.PERFIL3 (PRFPRF, PRFTIP) VALUES (  ); '; --'''|| P_USUARF || ''' , '''|| CAST(TIPO AS VARCHAR(2) ) || ''' , '''|| CAST(V_FECGRA AS VARCHAR(10)) || ''' , '''|| P_PANTAL|| ''' , '''|| CAST(V_HORA AS VARCHAR(6)) || ''' , '''|| P_USERNAME || '''
        Set StringSQL = StringSQL || ' INX ' || INX || ' TIPO ' || V_TIPO || ' POS ' || POS ;

    END LOOP FETCH_LOOP_V;
    
    -- GUARDO LOS SQL EN AUDITORIA
    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreatePerfil3', StringSQL);
    SET P_MSGCODE = 0; 
    COMMIT;
END P1
GO


