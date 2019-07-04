--<ScriptOptions statementTerminator="GO"/>

SET SCHEMA GPDATWEB
GO
 
-- DROP TABLE MSGCODE
CREATE TABLE MSGCODE (
        ID INTEGER NOT NULL GENERATED BY DEFAULT AS IDENTITY,
        MSGLAN VARCHAR(1) NOT NULL,
        MSGNUM NUMERIC(4, 0) NOT NULL,
        MSGTXT VARCHAR(100) NOT NULL
)
GO

LABEL ON COLUMN MSGCODE.MSGLAN TEXT IS 'LANGUAGE INDICATOR'
GO
LABEL ON COLUMN MSGCODE.MSGNUM TEXT IS 'MESSAGE NUMBER'
GO
LABEL ON COLUMN MSGCODE.MSGTXT TEXT IS 'MESSAGE TEXT'
GO
