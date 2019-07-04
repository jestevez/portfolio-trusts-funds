--<ScriptOptions statementTerminator="GO"/>

SET SCHEMA GPDATWEB
GO
 
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(1, 'E', 1000.0, 'EL PERFIL DE USUARIO YA EXISTE')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(2, 'E', 1001.0, 'TIPO DE FIDEICOMISO NO EXISTE')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(3, 'E', 1002.0, 'AREA NO EXISTE ')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(4, 'E', 1003.0, 'TIPO DE USUARIO NO EXISTE')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(5, 'E', 1004.0, 'DIVISA NO EXISTE')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(6, 'E', 1005.0, 'VALOR NO EXISTE')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(7, 'E', 9000.0, 'NO HAY REGISTROS QUE MODIFICAR')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(8, 'E', 9001.0, 'HAY MAS DE UN REGISTRO CON LA CLAVE PRIMARIA')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(9, 'E', 9002.0, 'CODIGO CLAVE DUPLICADO')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(10, 'E', 9003.0, 'PARAMETROS REQUERIDOS ESTAN VACIOS')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(11, 'E', 1006.0, 'CODIGO DE ENLACE CONTABLE NO EXISTE')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(12, 'E', 1007.0, 'TIPO DE ENTIDAD / CLIENTE NO EXISTE')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(13, 'E', 1008.0, 'LA CUENTA NO EXISTE EN EL PLAN CONTABLE')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(14, 'E', 9999.0, 'NO SE HA COMPLETADO LA OPERACION')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(15, 'E', 1009.0, 'CODIGO TABLA DE COMISION NO EXISTE')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(16, 'E', 1010.0, 'CLIENTE NO EXISTE')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(17, 'E', 1011.0, 'NUMERO DE CONTRATO NO EXISTE')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(18, 'E', 1012.0, 'CODIGO PAIS NO EXISTE')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(19, 'E', 1013.0, 'CODIGO EJECUTIVO NO EXISTE')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(20, 'E', 1014.0, 'CODIGO CATEGORIA CLIENTE NO EXISTE')
GO
INSERT INTO MSGCODE(ID, MSGLAN, MSGNUM, MSGTXT)
  VALUES(21, 'E', 1015.0, 'CODIGO COORPORATIVO NO EXISTE')
GO