
-- DROP PROCEDURE GPSQLWEB.procUpdateUserProfile
    
CREATE PROCEDURE GPSQLWEB.procUpdateUserProfile
(
    IN P_ID INTEGER,
    IN P_USERNAME VARCHAR(128),
    IN P_DOCUMENT_NUMBER VARCHAR(10),
    IN P_FIRST_NAME VARCHAR(128),
    IN P_SECOND_NAME VARCHAR(128),
    IN P_LAST_NAME VARCHAR(128),
    IN P_SECOND_LAST_NAME VARCHAR(128),
    IN P_GENDER VARCHAR(1),
    IN P_CIVIL_STATUS VARCHAR(1),
    IN P_EMAIL VARCHAR(128),
    IN P_PHONE VARCHAR(20),
    IN P_MOBILE VARCHAR(20),
    IN P_BIRTHDAY DATE,
    IN P_ENABLED VARCHAR(1),
    IN P_USER VARCHAR(50),
    IN P_IPADDRESS VARCHAR(255),
    IN P_USERAGENT VARCHAR(500)
)
LANGUAGE SQL
BEGIN
  Declare StringSQL Varchar(32000) Default '';
  Declare FullName VARCHAR(45) Default '';
  
  Set FullName = P_FIRST_NAME || ' ' || P_LAST_NAME;
  Set StringSQL = 'UPDATE GPSQLWEB.USER_PROFILE SET USERNAME = ?, DOCUMENT_NUMBER = ?, FIRST_NAME = ?, SECOND_NAME = ?, LAST_NAME = ?, SECOND_LAST_NAME = ?, GENDER = ?, CIVIL_STATUS = ?, EMAIL = ?, PHONE = ?, MOBILE = ?, BIRTHDAY = ?, ENABLED = ?, UPDATED_AT = CURRENT_TIMESTAMP, UPDATED_BY = ?  WHERE ID = ?';

  PREPARE stmt FROM StringSQL;
  EXECUTE stmt USING P_USERNAME, P_DOCUMENT_NUMBER, P_FIRST_NAME, P_SECOND_NAME, P_LAST_NAME, P_SECOND_LAST_NAME, P_GENDER, P_CIVIL_STATUS ,P_EMAIL, P_PHONE, P_MOBILE, P_BIRTHDAY, P_ENABLED, P_USER, P_ID;

  Set StringSQL = 'UPDATE GPSQLWEB.USER_PROFILE SET USERNAME= '''||P_USERNAME || ''' , DOCUMENT_NUMBER= '''||P_DOCUMENT_NUMBER || ''' , FIRST_NAME= '''||P_FIRST_NAME || ''' , SECOND_NAME= '''||P_SECOND_NAME || ''' , LAST_NAME= '''||P_LAST_NAME || ''' , SECOND_LAST_NAME= '''||P_SECOND_LAST_NAME || ''' , GENDER= '''||P_GENDER || ''' , CIVIL_STATUS= '''||P_CIVIL_STATUS || ''' , EMAIL= '''||P_EMAIL || ''' , PHONE= '''||P_PHONE || ''' , MOBILE= '''||P_MOBILE || ''' , BIRTHDAY= '''||  VARCHAR(P_BIRTHDAY) || ''' , ENABLED= '''||P_ENABLED || ''', UPDATED_AT= '''|| VARCHAR_FORMAT(CURRENT_TIMESTAMP, 'YYYY-MM-DD HH24:MI:SS')    || ''' , UPDATED_BY= '''||P_USER || '''  WHERE ID= '''||P_ID|| ''' ';
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USERNAME, 'Actualizar', 'procUpdateUserProfile', StringSQL);
 
  Set StringSQL = 'update GPDATBAAG.Perfil set PRFNOM = ?, PRFCED = ? WHERE PRFPRF = ?';
  PREPARE stmt FROM StringSQL;
  EXECUTE stmt USING FullName, P_DOCUMENT_NUMBER, P_USERNAME;
  CALL GPSQLWEB.procCreateWebAudit (P_IPADDRESS, P_USERAGENT, P_USER, 'Actualizar', 'procUpdateUserProfile', StringSQL);

END
GO

