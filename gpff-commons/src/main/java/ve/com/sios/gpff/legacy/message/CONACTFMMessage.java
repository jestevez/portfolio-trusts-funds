package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from CONACTFM physical file
 * definition.
 * 
* File level identifier is 1140216204443. Record format level identifier is
 * 3D995DBC2ABF2.
 */
public class CONACTFMMessage extends MessageRecord {

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
        "INVINT",
        "INVVAL",
        "INVNOP",
        "INVINI",
        "INVVTO",
        "INVVNO",
        "TASA",
        "CODCLI",
        "NOMCLI",
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
        "INVINT",
        "INVVAL",
        "INVNOP",
        "INVINI",
        "INVVTO",
        "INVVNO",
        "TASA",
        "CODCLI",
        "NOMCLI",
        "TEXERR"
    };
    final static String fid = "1140216204443";
    final static String rid = "3D995DBC2ABF2";
    final static String fmtname = "CONACTFM";
    final int FIELDCOUNT = 19;
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
    private DecimalField fieldINVINT = null;
    private CharacterField fieldINVVAL = null;
    private DecimalField fieldINVNOP = null;
    private DecimalField fieldINVINI = null;
    private DecimalField fieldINVVTO = null;
    private DecimalField fieldINVVNO = null;
    private DecimalField fieldTASA = null;
    private DecimalField fieldCODCLI = null;
    private CharacterField fieldNOMCLI = null;
    private CharacterField fieldTEXERR = null;

    /**
     * Constructor for CONACTFMMessage.
     */
    public CONACTFMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 341;
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
        fields[9] = fieldINVINT
                = new DecimalField(message, HEADERSIZE + 161, 8, 0, "INVINT");
        fields[10] = fieldINVVAL
                = new CharacterField(message, HEADERSIZE + 169, 12, "INVVAL");
        fields[11] = fieldINVNOP
                = new DecimalField(message, HEADERSIZE + 181, 11, 0, "INVNOP");
        fields[12] = fieldINVINI
                = new DecimalField(message, HEADERSIZE + 192, 7, 0, "INVINI");
        fields[13] = fieldINVVTO
                = new DecimalField(message, HEADERSIZE + 199, 7, 0, "INVVTO");
        fields[14] = fieldINVVNO
                = new DecimalField(message, HEADERSIZE + 206, 17, 2, "INVVNO");
        fields[15] = fieldTASA
                = new DecimalField(message, HEADERSIZE + 223, 11, 6, "TASA");
        fields[16] = fieldCODCLI
                = new DecimalField(message, HEADERSIZE + 234, 8, 0, "CODCLI");
        fields[17] = fieldNOMCLI
                = new CharacterField(message, HEADERSIZE + 242, 39, "NOMCLI");
        fields[18] = fieldTEXERR
                = new CharacterField(message, HEADERSIZE + 281, 60, "TEXERR");

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
     * Set field TASA using a String value.
     */
    public void setTASA(String newvalue) {
        fieldTASA.setString(newvalue);
    }

    /**
     * Get value of field TASA as a String.
     */
    public String getTASA() {
        return fieldTASA.getString();
    }

    /**
     * Set numeric field TASA using a BigDecimal value.
     */
    public void setTASA(BigDecimal newvalue) {
        fieldTASA.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field TASA as a BigDecimal.
     */
    public BigDecimal getBigDecimalTASA() {
        return fieldTASA.getBigDecimal();
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