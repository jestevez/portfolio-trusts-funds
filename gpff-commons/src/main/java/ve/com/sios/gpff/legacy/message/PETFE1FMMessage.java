package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from PETFE1FM physical file
 * definition.
 * 
* File level identifier is 1140315140513. Record format level identifier is
 * 2E86FD9501907.
 */
public class PETFE1FMMessage extends MessageRecord {

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
        "AREDES",
        "AREHAS",
        "WSDAT",
        "WSDAT2",
        "COLE"
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
        "AREDES",
        "AREHAS",
        "WSDAT",
        "WSDAT2",
        "COLE"
    };
    final static String fid = "1140315140513";
    final static String rid = "2E86FD9501907";
    final static String fmtname = "PETFE1FM";
    final int FIELDCOUNT = 14;
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
    private CharacterField fieldAREDES = null;
    private CharacterField fieldAREHAS = null;
    private DecimalField fieldWSDAT = null;
    private DecimalField fieldWSDAT2 = null;
    private CharacterField fieldCOLE = null;

    /**
     * Constructor for PETFE1FMMessage.
     */
    public PETFE1FMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 184;
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
        fields[9] = fieldAREDES
                = new CharacterField(message, HEADERSIZE + 161, 4, "AREDES");
        fields[10] = fieldAREHAS
                = new CharacterField(message, HEADERSIZE + 165, 4, "AREHAS");
        fields[11] = fieldWSDAT
                = new DecimalField(message, HEADERSIZE + 169, 7, 0, "WSDAT");
        fields[12] = fieldWSDAT2
                = new DecimalField(message, HEADERSIZE + 176, 7, 0, "WSDAT2");
        fields[13] = fieldCOLE
                = new CharacterField(message, HEADERSIZE + 183, 1, "COLE");

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
     * Set field AREDES using a String value.
     */
    public void setAREDES(String newvalue) {
        fieldAREDES.setString(newvalue);
    }

    /**
     * Get value of field AREDES as a String.
     */
    public String getAREDES() {
        return fieldAREDES.getString();
    }

    /**
     * Set field AREHAS using a String value.
     */
    public void setAREHAS(String newvalue) {
        fieldAREHAS.setString(newvalue);
    }

    /**
     * Get value of field AREHAS as a String.
     */
    public String getAREHAS() {
        return fieldAREHAS.getString();
    }

    /**
     * Set field WSDAT using a String value.
     */
    public void setWSDAT(String newvalue) {
        fieldWSDAT.setString(newvalue);
    }

    /**
     * Get value of field WSDAT as a String.
     */
    public String getWSDAT() {
        return fieldWSDAT.getString();
    }

    /**
     * Set numeric field WSDAT using a BigDecimal value.
     */
    public void setWSDAT(BigDecimal newvalue) {
        fieldWSDAT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field WSDAT as a BigDecimal.
     */
    public BigDecimal getBigDecimalWSDAT() {
        return fieldWSDAT.getBigDecimal();
    }

    /**
     * Set field WSDAT2 using a String value.
     */
    public void setWSDAT2(String newvalue) {
        fieldWSDAT2.setString(newvalue);
    }

    /**
     * Get value of field WSDAT2 as a String.
     */
    public String getWSDAT2() {
        return fieldWSDAT2.getString();
    }

    /**
     * Set numeric field WSDAT2 using a BigDecimal value.
     */
    public void setWSDAT2(BigDecimal newvalue) {
        fieldWSDAT2.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field WSDAT2 as a BigDecimal.
     */
    public BigDecimal getBigDecimalWSDAT2() {
        return fieldWSDAT2.getBigDecimal();
    }

    /**
     * Set field COLE using a String value.
     */
    public void setCOLE(String newvalue) {
        fieldCOLE.setString(newvalue);
    }

    /**
     * Get value of field COLE as a String.
     */
    public String getCOLE() {
        return fieldCOLE.getString();
    }

}
