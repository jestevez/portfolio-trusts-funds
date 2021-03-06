package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from BACOMCOFM physical file
 * definition.
 * 
* File level identifier is 1140315090155. Record format level identifier is
 * 4A07C414BDFC4.
 */
public class BACOMCOFMMessage extends MessageRecord {

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
        "E1",
        "E2",
        "DESDE",
        "HASTA"
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
        "E1",
        "E2",
        "DESDE",
        "HASTA"
    };
    final static String fid = "1140315090155";
    final static String rid = "4A07C414BDFC4";
    final static String fmtname = "BACOMCOFM";
    final int FIELDCOUNT = 13;
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
    private CharacterField fieldE1 = null;
    private CharacterField fieldE2 = null;
    private DecimalField fieldDESDE = null;
    private DecimalField fieldHASTA = null;

    /**
     * Constructor for BACOMCOFMMessage.
     */
    public BACOMCOFMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 183;
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
        fields[9] = fieldE1
                = new CharacterField(message, HEADERSIZE + 161, 4, "E1");
        fields[10] = fieldE2
                = new CharacterField(message, HEADERSIZE + 165, 4, "E2");
        fields[11] = fieldDESDE
                = new DecimalField(message, HEADERSIZE + 169, 7, 0, "DESDE");
        fields[12] = fieldHASTA
                = new DecimalField(message, HEADERSIZE + 176, 7, 0, "HASTA");

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
     * Set field E1 using a String value.
     */
    public void setE1(String newvalue) {
        fieldE1.setString(newvalue);
    }

    /**
     * Get value of field E1 as a String.
     */
    public String getE1() {
        return fieldE1.getString();
    }

    /**
     * Set field E2 using a String value.
     */
    public void setE2(String newvalue) {
        fieldE2.setString(newvalue);
    }

    /**
     * Get value of field E2 as a String.
     */
    public String getE2() {
        return fieldE2.getString();
    }

    /**
     * Set field DESDE using a String value.
     */
    public void setDESDE(String newvalue) {
        fieldDESDE.setString(newvalue);
    }

    /**
     * Get value of field DESDE as a String.
     */
    public String getDESDE() {
        return fieldDESDE.getString();
    }

    /**
     * Set numeric field DESDE using a BigDecimal value.
     */
    public void setDESDE(BigDecimal newvalue) {
        fieldDESDE.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DESDE as a BigDecimal.
     */
    public BigDecimal getBigDecimalDESDE() {
        return fieldDESDE.getBigDecimal();
    }

    /**
     * Set field HASTA using a String value.
     */
    public void setHASTA(String newvalue) {
        fieldHASTA.setString(newvalue);
    }

    /**
     * Get value of field HASTA as a String.
     */
    public String getHASTA() {
        return fieldHASTA.getString();
    }

    /**
     * Set numeric field HASTA using a BigDecimal value.
     */
    public void setHASTA(BigDecimal newvalue) {
        fieldHASTA.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field HASTA as a BigDecimal.
     */
    public BigDecimal getBigDecimalHASTA() {
        return fieldHASTA.getBigDecimal();
    }

}
