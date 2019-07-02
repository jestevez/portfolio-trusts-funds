package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from DEVANTFM physical file
 * definition.
 * 
* File level identifier is 1140322131704. Record format level identifier is
 * 3833198F95D70.
 */
public class DEVANTFMMessage extends MessageRecord {

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
        "REGCUR",
        "CAMCUR",
        "POSCUR",
        "CLINIF",
        "NOMBRE",
        "AUXMNT",
        "FECAP",
        "DISMNT",
        "MOVPGO",
        "TEXTO"
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
        "REGCUR",
        "CAMCUR",
        "POSCUR",
        "CLINIF",
        "NOMBRE",
        "AUXMNT",
        "FECAP",
        "DISMNT",
        "MOVPGO",
        "TEXTO"
    };
    final static String fid = "1140322131704";
    final static String rid = "3833198F95D70";
    final static String fmtname = "DEVANTFM";
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
    private CharacterField fieldREGCUR = null;
    private CharacterField fieldCAMCUR = null;
    private DecimalField fieldPOSCUR = null;
    private CharacterField fieldCLINIF = null;
    private CharacterField fieldNOMBRE = null;
    private DecimalField fieldAUXMNT = null;
    private DecimalField fieldFECAP = null;
    private DecimalField fieldDISMNT = null;
    private DecimalField fieldMOVPGO = null;
    private CharacterField fieldTEXTO = null;

    /**
     * Constructor for DEVANTFMMessage.
     */
    public DEVANTFMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 322;
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
        fields[9] = fieldREGCUR
                = new CharacterField(message, HEADERSIZE + 161, 10, "REGCUR");
        fields[10] = fieldCAMCUR
                = new CharacterField(message, HEADERSIZE + 171, 10, "CAMCUR");
        fields[11] = fieldPOSCUR
                = new DecimalField(message, HEADERSIZE + 181, 5, 0, "POSCUR");
        fields[12] = fieldCLINIF
                = new CharacterField(message, HEADERSIZE + 186, 12, "CLINIF");
        fields[13] = fieldNOMBRE
                = new CharacterField(message, HEADERSIZE + 198, 50, "NOMBRE");
        fields[14] = fieldAUXMNT
                = new DecimalField(message, HEADERSIZE + 248, 17, 2, "AUXMNT");
        fields[15] = fieldFECAP
                = new DecimalField(message, HEADERSIZE + 265, 7, 0, "FECAP");
        fields[16] = fieldDISMNT
                = new DecimalField(message, HEADERSIZE + 272, 17, 2, "DISMNT");
        fields[17] = fieldMOVPGO
                = new DecimalField(message, HEADERSIZE + 289, 3, 0, "MOVPGO");
        fields[18] = fieldTEXTO
                = new CharacterField(message, HEADERSIZE + 292, 30, "TEXTO");

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
     * Set field REGCUR using a String value.
     */
    public void setREGCUR(String newvalue) {
        fieldREGCUR.setString(newvalue);
    }

    /**
     * Get value of field REGCUR as a String.
     */
    public String getREGCUR() {
        return fieldREGCUR.getString();
    }

    /**
     * Set field CAMCUR using a String value.
     */
    public void setCAMCUR(String newvalue) {
        fieldCAMCUR.setString(newvalue);
    }

    /**
     * Get value of field CAMCUR as a String.
     */
    public String getCAMCUR() {
        return fieldCAMCUR.getString();
    }

    /**
     * Set field POSCUR using a String value.
     */
    public void setPOSCUR(String newvalue) {
        fieldPOSCUR.setString(newvalue);
    }

    /**
     * Get value of field POSCUR as a String.
     */
    public String getPOSCUR() {
        return fieldPOSCUR.getString();
    }

    /**
     * Set numeric field POSCUR using a BigDecimal value.
     */
    public void setPOSCUR(BigDecimal newvalue) {
        fieldPOSCUR.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field POSCUR as a BigDecimal.
     */
    public BigDecimal getBigDecimalPOSCUR() {
        return fieldPOSCUR.getBigDecimal();
    }

    /**
     * Set field CLINIF using a String value.
     */
    public void setCLINIF(String newvalue) {
        fieldCLINIF.setString(newvalue);
    }

    /**
     * Get value of field CLINIF as a String.
     */
    public String getCLINIF() {
        return fieldCLINIF.getString();
    }

    /**
     * Set field NOMBRE using a String value.
     */
    public void setNOMBRE(String newvalue) {
        fieldNOMBRE.setString(newvalue);
    }

    /**
     * Get value of field NOMBRE as a String.
     */
    public String getNOMBRE() {
        return fieldNOMBRE.getString();
    }

    /**
     * Set field AUXMNT using a String value.
     */
    public void setAUXMNT(String newvalue) {
        fieldAUXMNT.setString(newvalue);
    }

    /**
     * Get value of field AUXMNT as a String.
     */
    public String getAUXMNT() {
        return fieldAUXMNT.getString();
    }

    /**
     * Set numeric field AUXMNT using a BigDecimal value.
     */
    public void setAUXMNT(BigDecimal newvalue) {
        fieldAUXMNT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field AUXMNT as a BigDecimal.
     */
    public BigDecimal getBigDecimalAUXMNT() {
        return fieldAUXMNT.getBigDecimal();
    }

    /**
     * Set field FECAP using a String value.
     */
    public void setFECAP(String newvalue) {
        fieldFECAP.setString(newvalue);
    }

    /**
     * Get value of field FECAP as a String.
     */
    public String getFECAP() {
        return fieldFECAP.getString();
    }

    /**
     * Set numeric field FECAP using a BigDecimal value.
     */
    public void setFECAP(BigDecimal newvalue) {
        fieldFECAP.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECAP as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECAP() {
        return fieldFECAP.getBigDecimal();
    }

    /**
     * Set field DISMNT using a String value.
     */
    public void setDISMNT(String newvalue) {
        fieldDISMNT.setString(newvalue);
    }

    /**
     * Get value of field DISMNT as a String.
     */
    public String getDISMNT() {
        return fieldDISMNT.getString();
    }

    /**
     * Set numeric field DISMNT using a BigDecimal value.
     */
    public void setDISMNT(BigDecimal newvalue) {
        fieldDISMNT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DISMNT as a BigDecimal.
     */
    public BigDecimal getBigDecimalDISMNT() {
        return fieldDISMNT.getBigDecimal();
    }

    /**
     * Set field MOVPGO using a String value.
     */
    public void setMOVPGO(String newvalue) {
        fieldMOVPGO.setString(newvalue);
    }

    /**
     * Get value of field MOVPGO as a String.
     */
    public String getMOVPGO() {
        return fieldMOVPGO.getString();
    }

    /**
     * Set numeric field MOVPGO using a BigDecimal value.
     */
    public void setMOVPGO(BigDecimal newvalue) {
        fieldMOVPGO.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field MOVPGO as a BigDecimal.
     */
    public BigDecimal getBigDecimalMOVPGO() {
        return fieldMOVPGO.getBigDecimal();
    }

    /**
     * Set field TEXTO using a String value.
     */
    public void setTEXTO(String newvalue) {
        fieldTEXTO.setString(newvalue);
    }

    /**
     * Get value of field TEXTO as a String.
     */
    public String getTEXTO() {
        return fieldTEXTO.getString();
    }

}
