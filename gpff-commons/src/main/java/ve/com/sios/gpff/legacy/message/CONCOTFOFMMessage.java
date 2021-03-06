package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from CONCOTFOFM physical file
 * definition.
 * 
* File level identifier is 1140322161931. Record format level identifier is
 * 4790E2DAD185F.
 */
public class CONCOTFOFMMessage extends MessageRecord {

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
        "FIDNOM",
        "FIDE",
        "FHASTA",
        "FDESDE",
        "COFCLA",
        "COFCOT",
        "FECHAC"
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
        "FIDNOM",
        "FIDE",
        "FHASTA",
        "FDESDE",
        "COFCLA",
        "COFCOT",
        "FECHAC"
    };
    final static String fid = "1140322161931";
    final static String rid = "4790E2DAD185F";
    final static String fmtname = "CONCOTFOFM";
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
    private CharacterField fieldFIDNOM = null;
    private CharacterField fieldFIDE = null;
    private DecimalField fieldFHASTA = null;
    private DecimalField fieldFDESDE = null;
    private CharacterField fieldCOFCLA = null;
    private DecimalField fieldCOFCOT = null;
    private DecimalField fieldFECHAC = null;

    /**
     * Constructor for CONCOTFOFMMessage.
     */
    public CONCOTFOFMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 258;
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
        fields[9] = fieldFIDNOM
                = new CharacterField(message, HEADERSIZE + 161, 40, "FIDNOM");
        fields[10] = fieldFIDE
                = new CharacterField(message, HEADERSIZE + 201, 4, "FIDE");
        fields[11] = fieldFHASTA
                = new DecimalField(message, HEADERSIZE + 205, 7, 0, "FHASTA");
        fields[12] = fieldFDESDE
                = new DecimalField(message, HEADERSIZE + 212, 7, 0, "FDESDE");
        fields[13] = fieldCOFCLA
                = new CharacterField(message, HEADERSIZE + 219, 12, "COFCLA");
        fields[14] = fieldCOFCOT
                = new DecimalField(message, HEADERSIZE + 231, 20, 7, "COFCOT");
        fields[15] = fieldFECHAC
                = new DecimalField(message, HEADERSIZE + 251, 7, 0, "FECHAC");

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

    /**
     * Set field FIDE using a String value.
     */
    public void setFIDE(String newvalue) {
        fieldFIDE.setString(newvalue);
    }

    /**
     * Get value of field FIDE as a String.
     */
    public String getFIDE() {
        return fieldFIDE.getString();
    }

    /**
     * Set field FHASTA using a String value.
     */
    public void setFHASTA(String newvalue) {
        fieldFHASTA.setString(newvalue);
    }

    /**
     * Get value of field FHASTA as a String.
     */
    public String getFHASTA() {
        return fieldFHASTA.getString();
    }

    /**
     * Set numeric field FHASTA using a BigDecimal value.
     */
    public void setFHASTA(BigDecimal newvalue) {
        fieldFHASTA.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FHASTA as a BigDecimal.
     */
    public BigDecimal getBigDecimalFHASTA() {
        return fieldFHASTA.getBigDecimal();
    }

    /**
     * Set field FDESDE using a String value.
     */
    public void setFDESDE(String newvalue) {
        fieldFDESDE.setString(newvalue);
    }

    /**
     * Get value of field FDESDE as a String.
     */
    public String getFDESDE() {
        return fieldFDESDE.getString();
    }

    /**
     * Set numeric field FDESDE using a BigDecimal value.
     */
    public void setFDESDE(BigDecimal newvalue) {
        fieldFDESDE.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FDESDE as a BigDecimal.
     */
    public BigDecimal getBigDecimalFDESDE() {
        return fieldFDESDE.getBigDecimal();
    }

    /**
     * Set field COFCLA using a String value.
     */
    public void setCOFCLA(String newvalue) {
        fieldCOFCLA.setString(newvalue);
    }

    /**
     * Get value of field COFCLA as a String.
     */
    public String getCOFCLA() {
        return fieldCOFCLA.getString();
    }

    /**
     * Set field COFCOT using a String value.
     */
    public void setCOFCOT(String newvalue) {
        fieldCOFCOT.setString(newvalue);
    }

    /**
     * Get value of field COFCOT as a String.
     */
    public String getCOFCOT() {
        return fieldCOFCOT.getString();
    }

    /**
     * Set numeric field COFCOT using a BigDecimal value.
     */
    public void setCOFCOT(BigDecimal newvalue) {
        fieldCOFCOT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field COFCOT as a BigDecimal.
     */
    public BigDecimal getBigDecimalCOFCOT() {
        return fieldCOFCOT.getBigDecimal();
    }

    /**
     * Set field FECHAC using a String value.
     */
    public void setFECHAC(String newvalue) {
        fieldFECHAC.setString(newvalue);
    }

    /**
     * Get value of field FECHAC as a String.
     */
    public String getFECHAC() {
        return fieldFECHAC.getString();
    }

    /**
     * Set numeric field FECHAC using a BigDecimal value.
     */
    public void setFECHAC(BigDecimal newvalue) {
        fieldFECHAC.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECHAC as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECHAC() {
        return fieldFECHAC.getBigDecimal();
    }

}
