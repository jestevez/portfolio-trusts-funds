CREATE PROCEDURE "GPSQLWEB"."PROCLAPUNAT" 
        ()
	LANGUAGE RPGLE
	PARAMETER STYLE GENERAL
	DETERMINISTIC
	NO SQL 
	SPECIFIC GPSQLWEB.PROCLAPUNAT 
	NEW SAVEPOINT LEVEL
	EXTERNAL NAME 'GPPGMBASE/LAPUNAT';


