package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from VAR136FM physical file
 * definition.
 * 
* File level identifier is 1140216184300. Record format level identifier is
 * 34DD220D7123E.
 */
public class VAR136FMMessage extends MessageRecord {

    final static String fldnames[] = {
        "HDAT",
        "HTIM",
        "HUSR",
        "HENV",
        "HXML",
        "HSEC",
        "HFIL",
        "HLEN",
        "INDICA",
        "SEL",
        "INVVAL",
        "INVINI",
        "INVVTO",
        "INVVNO",
        "INVPOP",
        "INVINT",
        "INVNOP",
        "CODCLI",
        "NOMCLI",
        "NOMDIV",
        "FECINI",
        "INVBAD",
        "FECVTO",
        "DIHOYC",
        "VALOR",
        "INVPRE",
        "COMVEN",
        "NOMCV",
        "NUMTIT",
        "REFINV",
        "RETENC",
        "COD36",
        "VALCAP",
        "INACUM",
        "EFEINI",
        "DIAPAGX",
        "PREPAG",
        "PRCX",
        "EFEFIN",
        "OK1",
        "TEXERR"
    };
    final static String tnames[] = {
        "HDAT",
        "HTIM",
        "HUSR",
        "HENV",
        "HXML",
        "HSEC",
        "HFIL",
        "HLEN",
        "INDICA",
        "SEL",
        "INVVAL",
        "INVINI",
        "INVVTO",
        "INVVNO",
        "INVPOP",
        "INVINT",
        "INVNOP",
        "CODCLI",
        "NOMCLI",
        "NOMDIV",
        "FECINI",
        "INVBAD",
        "FECVTO",
        "DIHOYC",
        "VALOR",
        "INVPRE",
        "COMVEN",
        "NOMCV",
        "NUMTIT",
        "REFINV",
        "RETENC",
        "COD36",
        "VALCAP",
        "INACUM",
        "EFEINI",
        "DIAPAGX",
        "PREPAG",
        "PRCX",
        "EFEFIN",
        "OK1",
        "TEXERR"
    };
    final static String fid = "1140216184300";
    final static String rid = "34DD220D7123E";
    final static String fmtname = "VAR136FM";
    final int FIELDCOUNT = 41;
    private static Hashtable tlookup = new Hashtable();
    private DecimalField fieldHDAT = null;
    private DecimalField fieldHTIM = null;
    private CharacterField fieldHUSR = null;
    private CharacterField fieldHENV = null;
    private CharacterField fieldHXML = null;
    private CharacterField fieldHSEC = null;
    private CharacterField fieldHFIL = null;
    private DecimalField fieldHLEN = null;
    private CharacterField fieldINDICA = null;
    private CharacterField fieldSEL = null;
    private CharacterField fieldINVVAL = null;
    private DecimalField fieldINVINI = null;
    private DecimalField fieldINVVTO = null;
    private DecimalField fieldINVVNO = null;
    private DecimalField fieldINVPOP = null;
    private DecimalField fieldINVINT = null;
    private DecimalField fieldINVNOP = null;
    private DecimalField fieldCODCLI = null;
    private CharacterField fieldNOMCLI = null;
    private CharacterField fieldNOMDIV = null;
    private DecimalField fieldFECINI = null;
    private DecimalField fieldINVBAD = null;
    private DecimalField fieldFECVTO = null;
    private DecimalField fieldDIHOYC = null;
    private CharacterField fieldVALOR = null;
    private DecimalField fieldINVPRE = null;
    private CharacterField fieldCOMVEN = null;
    private CharacterField fieldNOMCV = null;
    private DecimalField fieldNUMTIT = null;
    private CharacterField fieldREFINV = null;
    private CharacterField fieldRETENC = null;
    private DecimalField fieldCOD36 = null;
    private DecimalField fieldVALCAP = null;
    private DecimalField fieldINACUM = null;
    private DecimalField fieldEFEINI = null;
    private DecimalField fieldDIAPAGX = null;
    private DecimalField fieldPREPAG = null;
    private DecimalField fieldPRCX = null;
    private DecimalField fieldEFEFIN = null;
    private CharacterField fieldOK1 = null;
    private CharacterField fieldTEXERR = null;

    /**
     * Constructor for VAR136FMMessage.
     */
    public VAR136FMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 550;
        fileid = fid;
        recordid = rid;
        message = new byte[getByteLength()];
        formatname = fmtname;
        fieldnames = fldnames;
        tagnames = tnames;
        fields = new MessageField[FIELDCOUNT];

        fields[0] = fieldHDAT
                = new DecimalField(message, HEADERSIZE + 0, 7, 0, "HDAT");
        fields[1] = fieldHTIM
                = new DecimalField(message, HEADERSIZE + 7, 7, 0, "HTIM");
        fields[2] = fieldHUSR
                = new CharacterField(message, HEADERSIZE + 14, 10, "HUSR");
        fields[3] = fieldHENV
                = new CharacterField(message, HEADERSIZE + 24, 1, "HENV");
        fields[4] = fieldHXML
                = new CharacterField(message, HEADERSIZE + 25, 10, "HXML");
        fields[5] = fieldHSEC
                = new CharacterField(message, HEADERSIZE + 35, 10, "HSEC");
        fields[6] = fieldHFIL
                = new CharacterField(message, HEADERSIZE + 45, 10, "HFIL");
        fields[7] = fieldHLEN
                = new DecimalField(message, HEADERSIZE + 55, 6, 0, "HLEN");
        fields[8] = fieldINDICA
                = new CharacterField(message, HEADERSIZE + 61, 100, "INDICA");
        fields[9] = fieldSEL
                = new CharacterField(message, HEADERSIZE + 161, 1, "SEL");
        fields[10] = fieldINVVAL
                = new CharacterField(message, HEADERSIZE + 162, 12, "INVVAL");
        fields[11] = fieldINVINI
                = new DecimalField(message, HEADERSIZE + 174, 7, 0, "INVINI");
        fields[12] = fieldINVVTO
                = new DecimalField(message, HEADERSIZE + 181, 7, 0, "INVVTO");
        fields[13] = fieldINVVNO
                = new DecimalField(message, HEADERSIZE + 188, 17, 2, "INVVNO");
        fields[14] = fieldINVPOP
                = new DecimalField(message, HEADERSIZE + 205, 11, 6, "INVPOP");
        fields[15] = fieldINVINT
                = new DecimalField(message, HEADERSIZE + 216, 8, 0, "INVINT");
        fields[16] = fieldINVNOP
                = new DecimalField(message, HEADERSIZE + 224, 11, 0, "INVNOP");
        fields[17] = fieldCODCLI
                = new DecimalField(message, HEADERSIZE + 235, 8, 0, "CODCLI");
        fields[18] = fieldNOMCLI
                = new CharacterField(message, HEADERSIZE + 243, 39, "NOMCLI");
        fields[19] = fieldNOMDIV
                = new CharacterField(message, HEADERSIZE + 282, 20, "NOMDIV");
        fields[20] = fieldFECINI
                = new DecimalField(message, HEADERSIZE + 302, 7, 0, "FECINI");
        fields[21] = fieldINVBAD
                = new DecimalField(message, HEADERSIZE + 309, 2, 0, "INVBAD");
        fields[22] = fieldFECVTO
                = new DecimalField(message, HEADERSIZE + 311, 7, 0, "FECVTO");
        fields[23] = fieldDIHOYC
                = new DecimalField(message, HEADERSIZE + 318, 5, 0, "DIHOYC");
        fields[24] = fieldVALOR
                = new CharacterField(message, HEADERSIZE + 323, 12, "VALOR");
        fields[25] = fieldINVPRE
                = new DecimalField(message, HEADERSIZE + 335, 11, 6, "INVPRE");
        fields[26] = fieldCOMVEN
                = new CharacterField(message, HEADERSIZE + 346, 1, "COMVEN");
        fields[27] = fieldNOMCV
                = new CharacterField(message, HEADERSIZE + 347, 6, "NOMCV");
        fields[28] = fieldNUMTIT
                = new DecimalField(message, HEADERSIZE + 353, 29, 7, "NUMTIT");
        fields[29] = fieldREFINV
                = new CharacterField(message, HEADERSIZE + 382, 3, "REFINV");
        fields[30] = fieldRETENC
                = new CharacterField(message, HEADERSIZE + 385, 1, "RETENC");
        fields[31] = fieldCOD36
                = new DecimalField(message, HEADERSIZE + 386, 2, 0, "COD36");
        fields[32] = fieldVALCAP
                = new DecimalField(message, HEADERSIZE + 388, 17, 2, "VALCAP");
        fields[33] = fieldINACUM
                = new DecimalField(message, HEADERSIZE + 405, 17, 2, "INACUM");
        fields[34] = fieldEFEINI
                = new DecimalField(message, HEADERSIZE + 422, 17, 2, "EFEINI");
        fields[35] = fieldDIAPAGX
                = new DecimalField(message, HEADERSIZE + 439, 5, 0, "DIAPAGX");
        fields[36] = fieldPREPAG
                = new DecimalField(message, HEADERSIZE + 444, 11, 6, "PREPAG");
        fields[37] = fieldPRCX
                = new DecimalField(message, HEADERSIZE + 455, 17, 2, "PRCX");
        fields[38] = fieldEFEFIN
                = new DecimalField(message, HEADERSIZE + 472, 17, 2, "EFEFIN");
        fields[39] = fieldOK1
                = new CharacterField(message, HEADERSIZE + 489, 1, "OK1");
        fields[40] = fieldTEXERR
                = new CharacterField(message, HEADERSIZE + 490, 60, "TEXERR");

        synchronized (tlookup) {
            if (tlookup.isEmpty()) {
                for (int i = 0; i < tnames.length; i++) {
                    tlookup.put(tnames[i], new Integer(i));
                }
            }
        }

        taglookup = tlookup;
    }

    /**
     * Set field HDAT using a String value.
     */
    public void setHDAT(String newvalue) {
        fieldHDAT.setString(newvalue);
    }

    /**
     * Get value of field HDAT as a String.
     */
    public String getHDAT() {
        return fieldHDAT.getString();
    }

    /**
     * Set numeric field HDAT using a BigDecimal value.
     */
    public void setHDAT(BigDecimal newvalue) {
        fieldHDAT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field HDAT as a BigDecimal.
     */
    public BigDecimal getBigDecimalHDAT() {
        return fieldHDAT.getBigDecimal();
    }

    /**
     * Set field HTIM using a String value.
     */
    public void setHTIM(String newvalue) {
        fieldHTIM.setString(newvalue);
    }

    /**
     * Get value of field HTIM as a String.
     */
    public String getHTIM() {
        return fieldHTIM.getString();
    }

    /**
     * Set numeric field HTIM using a BigDecimal value.
     */
    public void setHTIM(BigDecimal newvalue) {
        fieldHTIM.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field HTIM as a BigDecimal.
     */
    public BigDecimal getBigDecimalHTIM() {
        return fieldHTIM.getBigDecimal();
    }

    /**
     * Set field HUSR using a String value.
     */
    public void setHUSR(String newvalue) {
        fieldHUSR.setString(newvalue);
    }

    /**
     * Get value of field HUSR as a String.
     */
    public String getHUSR() {
        return fieldHUSR.getString();
    }

    /**
     * Set field HENV using a String value.
     */
    public void setHENV(String newvalue) {
        fieldHENV.setString(newvalue);
    }

    /**
     * Get value of field HENV as a String.
     */
    public String getHENV() {
        return fieldHENV.getString();
    }

    /**
     * Set field HXML using a String value.
     */
    public void setHXML(String newvalue) {
        fieldHXML.setString(newvalue);
    }

    /**
     * Get value of field HXML as a String.
     */
    public String getHXML() {
        return fieldHXML.getString();
    }

    /**
     * Set field HSEC using a String value.
     */
    public void setHSEC(String newvalue) {
        fieldHSEC.setString(newvalue);
    }

    /**
     * Get value of field HSEC as a String.
     */
    public String getHSEC() {
        return fieldHSEC.getString();
    }

    /**
     * Set field HFIL using a String value.
     */
    public void setHFIL(String newvalue) {
        fieldHFIL.setString(newvalue);
    }

    /**
     * Get value of field HFIL as a String.
     */
    public String getHFIL() {
        return fieldHFIL.getString();
    }

    /**
     * Set field HLEN using a String value.
     */
    public void setHLEN(String newvalue) {
        fieldHLEN.setString(newvalue);
    }

    /**
     * Get value of field HLEN as a String.
     */
    public String getHLEN() {
        return fieldHLEN.getString();
    }

    /**
     * Set numeric field HLEN using a BigDecimal value.
     */
    public void setHLEN(BigDecimal newvalue) {
        fieldHLEN.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field HLEN as a BigDecimal.
     */
    public BigDecimal getBigDecimalHLEN() {
        return fieldHLEN.getBigDecimal();
    }

    /**
     * Set field INDICA using a String value.
     */
    public void setINDICA(String newvalue) {
        fieldINDICA.setString(newvalue);
    }

    /**
     * Get value of field INDICA as a String.
     */
    public String getINDICA() {
        return fieldINDICA.getString();
    }

    /**
     * Set field SEL using a String value.
     */
    public void setSEL(String newvalue) {
        fieldSEL.setString(newvalue);
    }

    /**
     * Get value of field SEL as a String.
     */
    public String getSEL() {
        return fieldSEL.getString();
    }

    /**
     * Set field INVVAL using a String value.
     */
    public void setINVVAL(String newvalue) {
        fieldINVVAL.setString(newvalue);
    }

    /**
     * Get value of field INVVAL as a String.
     */
    public String getINVVAL() {
        return fieldINVVAL.getString();
    }

    /**
     * Set field INVINI using a String value.
     */
    public void setINVINI(String newvalue) {
        fieldINVINI.setString(newvalue);
    }

    /**
     * Get value of field INVINI as a String.
     */
    public String getINVINI() {
        return fieldINVINI.getString();
    }

    /**
     * Set numeric field INVINI using a BigDecimal value.
     */
    public void setINVINI(BigDecimal newvalue) {
        fieldINVINI.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INVINI as a BigDecimal.
     */
    public BigDecimal getBigDecimalINVINI() {
        return fieldINVINI.getBigDecimal();
    }

    /**
     * Set field INVVTO using a String value.
     */
    public void setINVVTO(String newvalue) {
        fieldINVVTO.setString(newvalue);
    }

    /**
     * Get value of field INVVTO as a String.
     */
    public String getINVVTO() {
        return fieldINVVTO.getString();
    }

    /**
     * Set numeric field INVVTO using a BigDecimal value.
     */
    public void setINVVTO(BigDecimal newvalue) {
        fieldINVVTO.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INVVTO as a BigDecimal.
     */
    public BigDecimal getBigDecimalINVVTO() {
        return fieldINVVTO.getBigDecimal();
    }

    /**
     * Set field INVVNO using a String value.
     */
    public void setINVVNO(String newvalue) {
        fieldINVVNO.setString(newvalue);
    }

    /**
     * Get value of field INVVNO as a String.
     */
    public String getINVVNO() {
        return fieldINVVNO.getString();
    }

    /**
     * Set numeric field INVVNO using a BigDecimal value.
     */
    public void setINVVNO(BigDecimal newvalue) {
        fieldINVVNO.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INVVNO as a BigDecimal.
     */
    public BigDecimal getBigDecimalINVVNO() {
        return fieldINVVNO.getBigDecimal();
    }

    /**
     * Set field INVPOP using a String value.
     */
    public void setINVPOP(String newvalue) {
        fieldINVPOP.setString(newvalue);
    }

    /**
     * Get value of field INVPOP as a String.
     */
    public String getINVPOP() {
        return fieldINVPOP.getString();
    }

    /**
     * Set numeric field INVPOP using a BigDecimal value.
     */
    public void setINVPOP(BigDecimal newvalue) {
        fieldINVPOP.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INVPOP as a BigDecimal.
     */
    public BigDecimal getBigDecimalINVPOP() {
        return fieldINVPOP.getBigDecimal();
    }

    /**
     * Set field INVINT using a String value.
     */
    public void setINVINT(String newvalue) {
        fieldINVINT.setString(newvalue);
    }

    /**
     * Get value of field INVINT as a String.
     */
    public String getINVINT() {
        return fieldINVINT.getString();
    }

    /**
     * Set numeric field INVINT using a BigDecimal value.
     */
    public void setINVINT(BigDecimal newvalue) {
        fieldINVINT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INVINT as a BigDecimal.
     */
    public BigDecimal getBigDecimalINVINT() {
        return fieldINVINT.getBigDecimal();
    }

    /**
     * Set field INVNOP using a String value.
     */
    public void setINVNOP(String newvalue) {
        fieldINVNOP.setString(newvalue);
    }

    /**
     * Get value of field INVNOP as a String.
     */
    public String getINVNOP() {
        return fieldINVNOP.getString();
    }

    /**
     * Set numeric field INVNOP using a BigDecimal value.
     */
    public void setINVNOP(BigDecimal newvalue) {
        fieldINVNOP.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INVNOP as a BigDecimal.
     */
    public BigDecimal getBigDecimalINVNOP() {
        return fieldINVNOP.getBigDecimal();
    }

    /**
     * Set field CODCLI using a String value.
     */
    public void setCODCLI(String newvalue) {
        fieldCODCLI.setString(newvalue);
    }

    /**
     * Get value of field CODCLI as a String.
     */
    public String getCODCLI() {
        return fieldCODCLI.getString();
    }

    /**
     * Set numeric field CODCLI using a BigDecimal value.
     */
    public void setCODCLI(BigDecimal newvalue) {
        fieldCODCLI.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CODCLI as a BigDecimal.
     */
    public BigDecimal getBigDecimalCODCLI() {
        return fieldCODCLI.getBigDecimal();
    }

    /**
     * Set field NOMCLI using a String value.
     */
    public void setNOMCLI(String newvalue) {
        fieldNOMCLI.setString(newvalue);
    }

    /**
     * Get value of field NOMCLI as a String.
     */
    public String getNOMCLI() {
        return fieldNOMCLI.getString();
    }

    /**
     * Set field NOMDIV using a String value.
     */
    public void setNOMDIV(String newvalue) {
        fieldNOMDIV.setString(newvalue);
    }

    /**
     * Get value of field NOMDIV as a String.
     */
    public String getNOMDIV() {
        return fieldNOMDIV.getString();
    }

    /**
     * Set field FECINI using a String value.
     */
    public void setFECINI(String newvalue) {
        fieldFECINI.setString(newvalue);
    }

    /**
     * Get value of field FECINI as a String.
     */
    public String getFECINI() {
        return fieldFECINI.getString();
    }

    /**
     * Set numeric field FECINI using a BigDecimal value.
     */
    public void setFECINI(BigDecimal newvalue) {
        fieldFECINI.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECINI as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECINI() {
        return fieldFECINI.getBigDecimal();
    }

    /**
     * Set field INVBAD using a String value.
     */
    public void setINVBAD(String newvalue) {
        fieldINVBAD.setString(newvalue);
    }

    /**
     * Get value of field INVBAD as a String.
     */
    public String getINVBAD() {
        return fieldINVBAD.getString();
    }

    /**
     * Set numeric field INVBAD using a BigDecimal value.
     */
    public void setINVBAD(BigDecimal newvalue) {
        fieldINVBAD.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INVBAD as a BigDecimal.
     */
    public BigDecimal getBigDecimalINVBAD() {
        return fieldINVBAD.getBigDecimal();
    }

    /**
     * Set field FECVTO using a String value.
     */
    public void setFECVTO(String newvalue) {
        fieldFECVTO.setString(newvalue);
    }

    /**
     * Get value of field FECVTO as a String.
     */
    public String getFECVTO() {
        return fieldFECVTO.getString();
    }

    /**
     * Set numeric field FECVTO using a BigDecimal value.
     */
    public void setFECVTO(BigDecimal newvalue) {
        fieldFECVTO.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECVTO as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECVTO() {
        return fieldFECVTO.getBigDecimal();
    }

    /**
     * Set field DIHOYC using a String value.
     */
    public void setDIHOYC(String newvalue) {
        fieldDIHOYC.setString(newvalue);
    }

    /**
     * Get value of field DIHOYC as a String.
     */
    public String getDIHOYC() {
        return fieldDIHOYC.getString();
    }

    /**
     * Set numeric field DIHOYC using a BigDecimal value.
     */
    public void setDIHOYC(BigDecimal newvalue) {
        fieldDIHOYC.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DIHOYC as a BigDecimal.
     */
    public BigDecimal getBigDecimalDIHOYC() {
        return fieldDIHOYC.getBigDecimal();
    }

    /**
     * Set field VALOR using a String value.
     */
    public void setVALOR(String newvalue) {
        fieldVALOR.setString(newvalue);
    }

    /**
     * Get value of field VALOR as a String.
     */
    public String getVALOR() {
        return fieldVALOR.getString();
    }

    /**
     * Set field INVPRE using a String value.
     */
    public void setINVPRE(String newvalue) {
        fieldINVPRE.setString(newvalue);
    }

    /**
     * Get value of field INVPRE as a String.
     */
    public String getINVPRE() {
        return fieldINVPRE.getString();
    }

    /**
     * Set numeric field INVPRE using a BigDecimal value.
     */
    public void setINVPRE(BigDecimal newvalue) {
        fieldINVPRE.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INVPRE as a BigDecimal.
     */
    public BigDecimal getBigDecimalINVPRE() {
        return fieldINVPRE.getBigDecimal();
    }

    /**
     * Set field COMVEN using a String value.
     */
    public void setCOMVEN(String newvalue) {
        fieldCOMVEN.setString(newvalue);
    }

    /**
     * Get value of field COMVEN as a String.
     */
    public String getCOMVEN() {
        return fieldCOMVEN.getString();
    }

    /**
     * Set field NOMCV using a String value.
     */
    public void setNOMCV(String newvalue) {
        fieldNOMCV.setString(newvalue);
    }

    /**
     * Get value of field NOMCV as a String.
     */
    public String getNOMCV() {
        return fieldNOMCV.getString();
    }

    /**
     * Set field NUMTIT using a String value.
     */
    public void setNUMTIT(String newvalue) {
        fieldNUMTIT.setString(newvalue);
    }

    /**
     * Get value of field NUMTIT as a String.
     */
    public String getNUMTIT() {
        return fieldNUMTIT.getString();
    }

    /**
     * Set numeric field NUMTIT using a BigDecimal value.
     */
    public void setNUMTIT(BigDecimal newvalue) {
        fieldNUMTIT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field NUMTIT as a BigDecimal.
     */
    public BigDecimal getBigDecimalNUMTIT() {
        return fieldNUMTIT.getBigDecimal();
    }

    /**
     * Set field REFINV using a String value.
     */
    public void setREFINV(String newvalue) {
        fieldREFINV.setString(newvalue);
    }

    /**
     * Get value of field REFINV as a String.
     */
    public String getREFINV() {
        return fieldREFINV.getString();
    }

    /**
     * Set field RETENC using a String value.
     */
    public void setRETENC(String newvalue) {
        fieldRETENC.setString(newvalue);
    }

    /**
     * Get value of field RETENC as a String.
     */
    public String getRETENC() {
        return fieldRETENC.getString();
    }

    /**
     * Set field COD36 using a String value.
     */
    public void setCOD36(String newvalue) {
        fieldCOD36.setString(newvalue);
    }

    /**
     * Get value of field COD36 as a String.
     */
    public String getCOD36() {
        return fieldCOD36.getString();
    }

    /**
     * Set numeric field COD36 using a BigDecimal value.
     */
    public void setCOD36(BigDecimal newvalue) {
        fieldCOD36.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field COD36 as a BigDecimal.
     */
    public BigDecimal getBigDecimalCOD36() {
        return fieldCOD36.getBigDecimal();
    }

    /**
     * Set field VALCAP using a String value.
     */
    public void setVALCAP(String newvalue) {
        fieldVALCAP.setString(newvalue);
    }

    /**
     * Get value of field VALCAP as a String.
     */
    public String getVALCAP() {
        return fieldVALCAP.getString();
    }

    /**
     * Set numeric field VALCAP using a BigDecimal value.
     */
    public void setVALCAP(BigDecimal newvalue) {
        fieldVALCAP.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field VALCAP as a BigDecimal.
     */
    public BigDecimal getBigDecimalVALCAP() {
        return fieldVALCAP.getBigDecimal();
    }

    /**
     * Set field INACUM using a String value.
     */
    public void setINACUM(String newvalue) {
        fieldINACUM.setString(newvalue);
    }

    /**
     * Get value of field INACUM as a String.
     */
    public String getINACUM() {
        return fieldINACUM.getString();
    }

    /**
     * Set numeric field INACUM using a BigDecimal value.
     */
    public void setINACUM(BigDecimal newvalue) {
        fieldINACUM.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INACUM as a BigDecimal.
     */
    public BigDecimal getBigDecimalINACUM() {
        return fieldINACUM.getBigDecimal();
    }

    /**
     * Set field EFEINI using a String value.
     */
    public void setEFEINI(String newvalue) {
        fieldEFEINI.setString(newvalue);
    }

    /**
     * Get value of field EFEINI as a String.
     */
    public String getEFEINI() {
        return fieldEFEINI.getString();
    }

    /**
     * Set numeric field EFEINI using a BigDecimal value.
     */
    public void setEFEINI(BigDecimal newvalue) {
        fieldEFEINI.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field EFEINI as a BigDecimal.
     */
    public BigDecimal getBigDecimalEFEINI() {
        return fieldEFEINI.getBigDecimal();
    }

    /**
     * Set field DIAPAGX using a String value.
     */
    public void setDIAPAGX(String newvalue) {
        fieldDIAPAGX.setString(newvalue);
    }

    /**
     * Get value of field DIAPAGX as a String.
     */
    public String getDIAPAGX() {
        return fieldDIAPAGX.getString();
    }

    /**
     * Set numeric field DIAPAGX using a BigDecimal value.
     */
    public void setDIAPAGX(BigDecimal newvalue) {
        fieldDIAPAGX.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DIAPAGX as a BigDecimal.
     */
    public BigDecimal getBigDecimalDIAPAGX() {
        return fieldDIAPAGX.getBigDecimal();
    }

    /**
     * Set field PREPAG using a String value.
     */
    public void setPREPAG(String newvalue) {
        fieldPREPAG.setString(newvalue);
    }

    /**
     * Get value of field PREPAG as a String.
     */
    public String getPREPAG() {
        return fieldPREPAG.getString();
    }

    /**
     * Set numeric field PREPAG using a BigDecimal value.
     */
    public void setPREPAG(BigDecimal newvalue) {
        fieldPREPAG.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field PREPAG as a BigDecimal.
     */
    public BigDecimal getBigDecimalPREPAG() {
        return fieldPREPAG.getBigDecimal();
    }

    /**
     * Set field PRCX using a String value.
     */
    public void setPRCX(String newvalue) {
        fieldPRCX.setString(newvalue);
    }

    /**
     * Get value of field PRCX as a String.
     */
    public String getPRCX() {
        return fieldPRCX.getString();
    }

    /**
     * Set numeric field PRCX using a BigDecimal value.
     */
    public void setPRCX(BigDecimal newvalue) {
        fieldPRCX.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field PRCX as a BigDecimal.
     */
    public BigDecimal getBigDecimalPRCX() {
        return fieldPRCX.getBigDecimal();
    }

    /**
     * Set field EFEFIN using a String value.
     */
    public void setEFEFIN(String newvalue) {
        fieldEFEFIN.setString(newvalue);
    }

    /**
     * Get value of field EFEFIN as a String.
     */
    public String getEFEFIN() {
        return fieldEFEFIN.getString();
    }

    /**
     * Set numeric field EFEFIN using a BigDecimal value.
     */
    public void setEFEFIN(BigDecimal newvalue) {
        fieldEFEFIN.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field EFEFIN as a BigDecimal.
     */
    public BigDecimal getBigDecimalEFEFIN() {
        return fieldEFEFIN.getBigDecimal();
    }

    /**
     * Set field OK1 using a String value.
     */
    public void setOK1(String newvalue) {
        fieldOK1.setString(newvalue);
    }

    /**
     * Get value of field OK1 as a String.
     */
    public String getOK1() {
        return fieldOK1.getString();
    }

    /**
     * Set field TEXERR using a String value.
     */
    public void setTEXERR(String newvalue) {
        fieldTEXERR.setString(newvalue);
    }

    /**
     * Get value of field TEXERR as a String.
     */
    public String getTEXERR() {
        return fieldTEXERR.getString();
    }

}
