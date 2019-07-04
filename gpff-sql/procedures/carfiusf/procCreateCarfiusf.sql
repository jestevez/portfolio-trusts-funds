--DROP PROCEDURE GPSQLWEB.procCreateCarfiusf
    
CREATE PROCEDURE GPSQLWEB.procCreateCarfiusf
(
    IN P_USUARF VARCHAR(10),
    IN P_TIPOS VARCHAR(1000),
    IN P_PANTAL VARCHAR(10),
    IN P_USERNAME VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500),
    OUT P_MSGCODE INTEGER
)
LANGUAGE SQL
P1:BEGIN
    DECLARE StringSQL Varchar(32000) Default '';
    DECLARE V_FECGRA DECIMAL(8, 0);
    DECLARE V_HORA DECIMAL(6, 0) DEFAULT 1;
    DECLARE TIPO DECIMAL(2 , 0);
    DECLARE INX INT;
    DECLARE POS INT;
    DECLARE FIN INT;
    DECLARE VALIDO INT;
    DECLARE DELIMITADOR CHAR;
    DECLARE EXIT HANDLER FOR SQLEXCEPTION ROLLBACK;
    SET TIPO = 0;
    SET INX = 0;
    SET POS = 0;
    SET FIN = 0;
    SET VALIDO = 0;
    SET DELIMITADOR = ',';
    
    -- FECHA Y HORA ACTUAL DEL SISTEMA EN FORMATO DECIMAL
    SELECT 
        CAST (YEAR(current timestamp) || substr( digits (MONTH(current timestamp)),9) || substr( digits (DAY(current timestamp)),9) AS DECIMAL(8,0)),
        CAST (substr( digits (HOUR(current timestamp)),9) || substr( digits (MINUTE(current timestamp)),9) || substr( digits (SECOND(current timestamp)),9) AS DECIMAL(6,0) )
            INTO V_FECGRA, V_HORA FROM SYSIBM.SYSDUMMY1;
    --SET TRANSACTION ISOLATION LEVEL NO COMMIT;

    FETCH_LOOP:
    LOOP
        SET INX = LOCATE(DELIMITADOR, P_TIPOS, POS + 1);
        IF INX = 0 AND FIN=1 THEN
            LEAVE FETCH_LOOP;
        END IF;
        IF INX > 0 THEN
            SET TIPO = TRIM( SUBSTR(P_TIPOS, POS + 1, (INX - (POS+1) ) ) );
            SET POS = INX;
        ELSE
            SET TIPO = TRIM( SUBSTR(P_TIPOS, POS + 1, LENGTH(P_TIPOS) ) );
            SET FIN = 1;
        END IF;
        -- VALIDAR EL TIPO DE FIDEICOMISO
        SELECT COUNT(1) INTO VALIDO FROM GPDATWEB.TIPOSFID WHERE FIDTIP = TIPO;
        IF VALIDO = 0 THEN
            SET P_MSGCODE = 1001;
            SET StringSQL = ' 1001 - TIPO DE FIDEICOMISO NO EXISTE '|| TIPO;
            CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateCarfiusf', StringSQL);
            RETURN;
        END IF;
    END LOOP FETCH_LOOP;

    SET INX = 0;
    SET POS = 0;
    SET FIN = 0;
    -- SE ELIMINAN LAS OPCIONES PREVIAS
    DELETE FROM GPDATWEB.CARFIUSF WHERE USUARF=P_USUARF;
    Set StringSQL = 'DELETE FROM GPDATWEB.CARFIUSF WHERE USUARF=''' || P_USUARF ||'''; '; 

    FETCH_LOOP_V:
    LOOP
        SET INX = LOCATE(DELIMITADOR, P_TIPOS, POS + 1);

        IF INX = 0 AND FIN=1 THEN
            LEAVE FETCH_LOOP_V;
        END IF;
        IF INX > 0 THEN
            SET TIPO = TRIM( SUBSTR(P_TIPOS, POS + 1, (INX - (POS+1) ) ) );
            SET POS = INX;
        ELSE
            SET TIPO = TRIM( SUBSTR(P_TIPOS, POS + 1, LENGTH(P_TIPOS) ) );
            SET FIN = 1;
        END IF;
        -- SE ASIGNAR LAS OPCIONES NUEVAS
        INSERT INTO GPDATWEB.CARFIUSF (USUARF, TIPO, FECGRA, PANTAL, HORA, USARI)  VALUES (P_USUARF, TIPO, V_FECGRA , P_PANTAL , V_HORA , P_USERNAME );
        --Set StringSQL = StringSQL || 'INSERT INTO GPDATWEB.CARFIUSF (USUARF, TIPO, FECGRA, PANTAL, HORA, USARI) VALUES (  ); '; --'''|| P_USUARF || ''' , '''|| CAST(TIPO AS VARCHAR(2) ) || ''' , '''|| CAST(V_FECGRA AS VARCHAR(10)) || ''' , '''|| P_PANTAL|| ''' , '''|| CAST(V_HORA AS VARCHAR(6)) || ''' , '''|| P_USERNAME || '''
        Set StringSQL = StringSQL || ' INX ' || INX || ' TIPO ' || TIPO || ' POS ' || POS ;

    END LOOP FETCH_LOOP_V;
    
    -- GUARDO LOS SQL EN AUDITORIA
    CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Crear', 'procCreateCarfiusf', StringSQL);
    SET P_MSGCODE = 0; 
    COMMIT;
END P1
GO


