package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from GENAPUFM physical file
 * definition.
 * 
* File level identifier is 1140315141506. Record format level identifier is
 * 3D14CF93A2129.
 */
public class GENAPUFMMessage extends MessageRecord {

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
        "FIDDES",
        "FIDHAS",
        "FECHAH",
        "FECHAP",
        "TIPO",
        "CODCON",
        "FIDNOM"
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
        "FIDDES",
        "FIDHAS",
        "FECHAH",
        "FECHAP",
        "TIPO",
        "CODCON",
        "FIDNOM"
    };
    final static String fid = "1140315141506";
    final static String rid = "3D14CF93A2129";
    final static String fmtname = "GENAPUFM";
    final int FIELDCOUNT = 16;
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
    private CharacterField fieldFIDDES = null;
    private CharacterField fieldFIDHAS = null;
    private DecimalField fieldFECHAH = null;
    private DecimalField fieldFECHAP = null;
    private CharacterField fieldTIPO = null;
    private DecimalField fieldCODCON = null;
    private CharacterField fieldFIDNOM = null;

    /**
     * Constructor for GENAPUFMMessage.
     */
    public GENAPUFMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 228;
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
        fields[9] = fieldFIDDES
                = new CharacterField(message, HEADERSIZE + 161, 4, "FIDDES");
        fields[10] = fieldFIDHAS
                = new CharacterField(message, HEADERSIZE + 165, 4, "FIDHAS");
        fields[11] = fieldFECHAH
                = new DecimalField(message, HEADERSIZE + 169, 7, 0, "FECHAH");
        fields[12] = fieldFECHAP
                = new DecimalField(message, HEADERSIZE + 176, 7, 0, "FECHAP");
        fields[13] = fieldTIPO
                = new CharacterField(message, HEADERSIZE + 183, 1, "TIPO");
        fields[14] = fieldCODCON
                = new DecimalField(message, HEADERSIZE + 184, 4, 0, "CODCON");
        fields[15] = fieldFIDNOM
                = new CharacterField(message, HEADERSIZE + 188, 40, "FIDNOM");

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
     * Set field FIDDES using a String value.
     */
    public void setFIDDES(String newvalue) {
        fieldFIDDES.setString(newvalue);
    }

    /**
     * Get value of field FIDDES as a String.
     */
    public String getFIDDES() {
        return fieldFIDDES.getString();
    }

    /**
     * Set field FIDHAS using a String value.
     */
    public void setFIDHAS(String newvalue) {
        fieldFIDHAS.setString(newvalue);
    }

    /**
     * Get value of field FIDHAS as a String.
     */
    public String getFIDHAS() {
        return fieldFIDHAS.getString();
    }

    /**
     * Set field FECHAH using a String value.
     */
    public void setFECHAH(String newvalue) {
        fieldFECHAH.setString(newvalue);
    }

    /**
     * Get value of field FECHAH as a String.
     */
    public String getFECHAH() {
        return fieldFECHAH.getString();
    }

    /**
     * Set numeric field FECHAH using a BigDecimal value.
     */
    public void setFECHAH(BigDecimal newvalue) {
        fieldFECHAH.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECHAH as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECHAH() {
        return fieldFECHAH.getBigDecimal();
    }

    /**
     * Set field FECHAP using a String value.
     */
    public void setFECHAP(String newvalue) {
        fieldFECHAP.setString(newvalue);
    }

    /**
     * Get value of field FECHAP as a String.
     */
    public String getFECHAP() {
        return fieldFECHAP.getString();
    }

    /**
     * Set numeric field FECHAP using a BigDecimal value.
     */
    public void setFECHAP(BigDecimal newvalue) {
        fieldFECHAP.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECHAP as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECHAP() {
        return fieldFECHAP.getBigDecimal();
    }

    /**
     * Set field TIPO using a String value.
     */
    public void setTIPO(String newvalue) {
        fieldTIPO.setString(newvalue);
    }

    /**
     * Get value of field TIPO as a String.
     */
    public String getTIPO() {
        return fieldTIPO.getString();
    }

    /**
     * Set field CODCON using a String value.
     */
    public void setCODCON(String newvalue) {
        fieldCODCON.setString(newvalue);
    }

    /**
     * Get value of field CODCON as a String.
     */
    public String getCODCON() {
        return fieldCODCON.getString();
    }

    /**
     * Set numeric field CODCON using a BigDecimal value.
     */
    public void setCODCON(BigDecimal newvalue) {
        fieldCODCON.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CODCON as a BigDecimal.
     */
    public BigDecimal getBigDecimalCODCON() {
        return fieldCODCON.getBigDecimal();
    }

    /**
     * Set field FIDNOM using a String value.
     */
    public void setFIDNOM(String newvalue) {
        fieldFIDNOM.setString(newvalue);
    }

    /**
     * Get value of field FIDNOM as a String.
     */
    public String getFIDNOM() {
        return fieldFIDNOM.getString();
    }

}
