package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from MOVCTAGFM physical file
 * definition.
 * 
* File level identifier is 1140315082605. Record format level identifier is
 * 53678D06F471D.
 */
public class MOVCTAGFMMessage extends MessageRecord {

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
        "NOMTAB",
        "ED1",
        "ED2",
        "FECHAD",
        "FECFFF",
        "NCUENT"
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
        "NOMTAB",
        "ED1",
        "ED2",
        "FECHAD",
        "FECFFF",
        "NCUENT"
    };
    final static String fid = "1140315082605";
    final static String rid = "53678D06F471D";
    final static String fmtname = "MOVCTAGFM";
    final int FIELDCOUNT = 15;
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
    private CharacterField fieldNOMTAB = null;
    private CharacterField fieldED1 = null;
    private CharacterField fieldED2 = null;
    private DecimalField fieldFECHAD = null;
    private DecimalField fieldFECFFF = null;
    private CharacterField fieldNCUENT = null;

    /**
     * Constructor for MOVCTAGFMMessage.
     */
    public MOVCTAGFMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 235;
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
        fields[9] = fieldNOMTAB
                = new CharacterField(message, HEADERSIZE + 161, 40, "NOMTAB");
        fields[10] = fieldED1
                = new CharacterField(message, HEADERSIZE + 201, 4, "ED1");
        fields[11] = fieldED2
                = new CharacterField(message, HEADERSIZE + 205, 4, "ED2");
        fields[12] = fieldFECHAD
                = new DecimalField(message, HEADERSIZE + 209, 7, 0, "FECHAD");
        fields[13] = fieldFECFFF
                = new DecimalField(message, HEADERSIZE + 216, 7, 0, "FECFFF");
        fields[14] = fieldNCUENT
                = new CharacterField(message, HEADERSIZE + 223, 12, "NCUENT");

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
     * Set field NOMTAB using a String value.
     */
    public void setNOMTAB(String newvalue) {
        fieldNOMTAB.setString(newvalue);
    }

    /**
     * Get value of field NOMTAB as a String.
     */
    public String getNOMTAB() {
        return fieldNOMTAB.getString();
    }

    /**
     * Set field ED1 using a String value.
     */
    public void setED1(String newvalue) {
        fieldED1.setString(newvalue);
    }

    /**
     * Get value of field ED1 as a String.
     */
    public String getED1() {
        return fieldED1.getString();
    }

    /**
     * Set field ED2 using a String value.
     */
    public void setED2(String newvalue) {
        fieldED2.setString(newvalue);
    }

    /**
     * Get value of field ED2 as a String.
     */
    public String getED2() {
        return fieldED2.getString();
    }

    /**
     * Set field FECHAD using a String value.
     */
    public void setFECHAD(String newvalue) {
        fieldFECHAD.setString(newvalue);
    }

    /**
     * Get value of field FECHAD as a String.
     */
    public String getFECHAD() {
        return fieldFECHAD.getString();
    }

    /**
     * Set numeric field FECHAD using a BigDecimal value.
     */
    public void setFECHAD(BigDecimal newvalue) {
        fieldFECHAD.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECHAD as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECHAD() {
        return fieldFECHAD.getBigDecimal();
    }

    /**
     * Set field FECFFF using a String value.
     */
    public void setFECFFF(String newvalue) {
        fieldFECFFF.setString(newvalue);
    }

    /**
     * Get value of field FECFFF as a String.
     */
    public String getFECFFF() {
        return fieldFECFFF.getString();
    }

    /**
     * Set numeric field FECFFF using a BigDecimal value.
     */
    public void setFECFFF(BigDecimal newvalue) {
        fieldFECFFF.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECFFF as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECFFF() {
        return fieldFECFFF.getBigDecimal();
    }

    /**
     * Set field NCUENT using a String value.
     */
    public void setNCUENT(String newvalue) {
        fieldNCUENT.setString(newvalue);
    }

    /**
     * Get value of field NCUENT as a String.
     */
    public String getNCUENT() {
        return fieldNCUENT.getString();
    }

}
