package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from CUPONFM physical file
 * definition.
 * 
* File level identifier is 1140216163737. Record format level identifier is
 * 338A04E99B4F6.
 */
public class CUPONFMMessage extends MessageRecord {

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
        "FECCBO",
        "NUEMNT",
        "FECCBR",
        "VENS",
        "COBS",
        "CAMB",
        "FECERR",
        "CTLFEC",
        "CTLMNT",
        "CTLCBR",
        "VEN",
        "COB",
        "CTLCAM",
        "PRIMER",
        "ULTIMO",
        "PER",
        "RESP"
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
        "FECCBO",
        "NUEMNT",
        "FECCBR",
        "VENS",
        "COBS",
        "CAMB",
        "FECERR",
        "CTLFEC",
        "CTLMNT",
        "CTLCBR",
        "VEN",
        "COB",
        "CTLCAM",
        "PRIMER",
        "ULTIMO",
        "PER",
        "RESP"
    };
    final static String fid = "1140216163737";
    final static String rid = "338A04E99B4F6";
    final static String fmtname = "CUPONFM";
    final int FIELDCOUNT = 26;
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
    private DecimalField fieldFECCBO = null;
    private DecimalField fieldNUEMNT = null;
    private DecimalField fieldFECCBR = null;
    private CharacterField fieldVENS = null;
    private CharacterField fieldCOBS = null;
    private CharacterField fieldCAMB = null;
    private DecimalField fieldFECERR = null;
    private DecimalField fieldCTLFEC = null;
    private DecimalField fieldCTLMNT = null;
    private DecimalField fieldCTLCBR = null;
    private CharacterField fieldVEN = null;
    private CharacterField fieldCOB = null;
    private CharacterField fieldCTLCAM = null;
    private DecimalField fieldPRIMER = null;
    private DecimalField fieldULTIMO = null;
    private CharacterField fieldPER = null;
    private CharacterField fieldRESP = null;

    /**
     * Constructor for CUPONFMMessage.
     */
    public CUPONFMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 238;
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
        fields[9] = fieldFECCBO
                = new DecimalField(message, HEADERSIZE + 161, 7, 0, "FECCBO");
        fields[10] = fieldNUEMNT
                = new DecimalField(message, HEADERSIZE + 168, 10, 5, "NUEMNT");
        fields[11] = fieldFECCBR
                = new DecimalField(message, HEADERSIZE + 178, 7, 0, "FECCBR");
        fields[12] = fieldVENS
                = new CharacterField(message, HEADERSIZE + 185, 1, "VENS");
        fields[13] = fieldCOBS
                = new CharacterField(message, HEADERSIZE + 186, 1, "COBS");
        fields[14] = fieldCAMB
                = new CharacterField(message, HEADERSIZE + 187, 1, "CAMB");
        fields[15] = fieldFECERR
                = new DecimalField(message, HEADERSIZE + 188, 7, 0, "FECERR");
        fields[16] = fieldCTLFEC
                = new DecimalField(message, HEADERSIZE + 195, 7, 0, "CTLFEC");
        fields[17] = fieldCTLMNT
                = new DecimalField(message, HEADERSIZE + 202, 10, 5, "CTLMNT");
        fields[18] = fieldCTLCBR
                = new DecimalField(message, HEADERSIZE + 212, 7, 0, "CTLCBR");
        fields[19] = fieldVEN
                = new CharacterField(message, HEADERSIZE + 219, 1, "VEN");
        fields[20] = fieldCOB
                = new CharacterField(message, HEADERSIZE + 220, 1, "COB");
        fields[21] = fieldCTLCAM
                = new CharacterField(message, HEADERSIZE + 221, 1, "CTLCAM");
        fields[22] = fieldPRIMER
                = new DecimalField(message, HEADERSIZE + 222, 7, 0, "PRIMER");
        fields[23] = fieldULTIMO
                = new DecimalField(message, HEADERSIZE + 229, 7, 0, "ULTIMO");
        fields[24] = fieldPER
                = new CharacterField(message, HEADERSIZE + 236, 1, "PER");
        fields[25] = fieldRESP
                = new CharacterField(message, HEADERSIZE + 237, 1, "RESP");

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
     * Set field FECCBO using a String value.
     */
    public void setFECCBO(String newvalue) {
        fieldFECCBO.setString(newvalue);
    }

    /**
     * Get value of field FECCBO as a String.
     */
    public String getFECCBO() {
        return fieldFECCBO.getString();
    }

    /**
     * Set numeric field FECCBO using a BigDecimal value.
     */
    public void setFECCBO(BigDecimal newvalue) {
        fieldFECCBO.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECCBO as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECCBO() {
        return fieldFECCBO.getBigDecimal();
    }

    /**
     * Set field NUEMNT using a String value.
     */
    public void setNUEMNT(String newvalue) {
        fieldNUEMNT.setString(newvalue);
    }

    /**
     * Get value of field NUEMNT as a String.
     */
    public String getNUEMNT() {
        return fieldNUEMNT.getString();
    }

    /**
     * Set numeric field NUEMNT using a BigDecimal value.
     */
    public void setNUEMNT(BigDecimal newvalue) {
        fieldNUEMNT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field NUEMNT as a BigDecimal.
     */
    public BigDecimal getBigDecimalNUEMNT() {
        return fieldNUEMNT.getBigDecimal();
    }

    /**
     * Set field FECCBR using a String value.
     */
    public void setFECCBR(String newvalue) {
        fieldFECCBR.setString(newvalue);
    }

    /**
     * Get value of field FECCBR as a String.
     */
    public String getFECCBR() {
        return fieldFECCBR.getString();
    }

    /**
     * Set numeric field FECCBR using a BigDecimal value.
     */
    public void setFECCBR(BigDecimal newvalue) {
        fieldFECCBR.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECCBR as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECCBR() {
        return fieldFECCBR.getBigDecimal();
    }

    /**
     * Set field VENS using a String value.
     */
    public void setVENS(String newvalue) {
        fieldVENS.setString(newvalue);
    }

    /**
     * Get value of field VENS as a String.
     */
    public String getVENS() {
        return fieldVENS.getString();
    }

    /**
     * Set field COBS using a String value.
     */
    public void setCOBS(String newvalue) {
        fieldCOBS.setString(newvalue);
    }

    /**
     * Get value of field COBS as a String.
     */
    public String getCOBS() {
        return fieldCOBS.getString();
    }

    /**
     * Set field CAMB using a String value.
     */
    public void setCAMB(String newvalue) {
        fieldCAMB.setString(newvalue);
    }

    /**
     * Get value of field CAMB as a String.
     */
    public String getCAMB() {
        return fieldCAMB.getString();
    }

    /**
     * Set field FECERR using a String value.
     */
    public void setFECERR(String newvalue) {
        fieldFECERR.setString(newvalue);
    }

    /**
     * Get value of field FECERR as a String.
     */
    public String getFECERR() {
        return fieldFECERR.getString();
    }

    /**
     * Set numeric field FECERR using a BigDecimal value.
     */
    public void setFECERR(BigDecimal newvalue) {
        fieldFECERR.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECERR as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECERR() {
        return fieldFECERR.getBigDecimal();
    }

    /**
     * Set field CTLFEC using a String value.
     */
    public void setCTLFEC(String newvalue) {
        fieldCTLFEC.setString(newvalue);
    }

    /**
     * Get value of field CTLFEC as a String.
     */
    public String getCTLFEC() {
        return fieldCTLFEC.getString();
    }

    /**
     * Set numeric field CTLFEC using a BigDecimal value.
     */
    public void setCTLFEC(BigDecimal newvalue) {
        fieldCTLFEC.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CTLFEC as a BigDecimal.
     */
    public BigDecimal getBigDecimalCTLFEC() {
        return fieldCTLFEC.getBigDecimal();
    }

    /**
     * Set field CTLMNT using a String value.
     */
    public void setCTLMNT(String newvalue) {
        fieldCTLMNT.setString(newvalue);
    }

    /**
     * Get value of field CTLMNT as a String.
     */
    public String getCTLMNT() {
        return fieldCTLMNT.getString();
    }

    /**
     * Set numeric field CTLMNT using a BigDecimal value.
     */
    public void setCTLMNT(BigDecimal newvalue) {
        fieldCTLMNT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CTLMNT as a BigDecimal.
     */
    public BigDecimal getBigDecimalCTLMNT() {
        return fieldCTLMNT.getBigDecimal();
    }

    /**
     * Set field CTLCBR using a String value.
     */
    public void setCTLCBR(String newvalue) {
        fieldCTLCBR.setString(newvalue);
    }

    /**
     * Get value of field CTLCBR as a String.
     */
    public String getCTLCBR() {
        return fieldCTLCBR.getString();
    }

    /**
     * Set numeric field CTLCBR using a BigDecimal value.
     */
    public void setCTLCBR(BigDecimal newvalue) {
        fieldCTLCBR.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CTLCBR as a BigDecimal.
     */
    public BigDecimal getBigDecimalCTLCBR() {
        return fieldCTLCBR.getBigDecimal();
    }

    /**
     * Set field VEN using a String value.
     */
    public void setVEN(String newvalue) {
        fieldVEN.setString(newvalue);
    }

    /**
     * Get value of field VEN as a String.
     */
    public String getVEN() {
        return fieldVEN.getString();
    }

    /**
     * Set field COB using a String value.
     */
    public void setCOB(String newvalue) {
        fieldCOB.setString(newvalue);
    }

    /**
     * Get value of field COB as a String.
     */
    public String getCOB() {
        return fieldCOB.getString();
    }

    /**
     * Set field CTLCAM using a String value.
     */
    public void setCTLCAM(String newvalue) {
        fieldCTLCAM.setString(newvalue);
    }

    /**
     * Get value of field CTLCAM as a String.
     */
    public String getCTLCAM() {
        return fieldCTLCAM.getString();
    }

    /**
     * Set field PRIMER using a String value.
     */
    public void setPRIMER(String newvalue) {
        fieldPRIMER.setString(newvalue);
    }

    /**
     * Get value of field PRIMER as a String.
     */
    public String getPRIMER() {
        return fieldPRIMER.getString();
    }

    /**
     * Set numeric field PRIMER using a BigDecimal value.
     */
    public void setPRIMER(BigDecimal newvalue) {
        fieldPRIMER.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field PRIMER as a BigDecimal.
     */
    public BigDecimal getBigDecimalPRIMER() {
        return fieldPRIMER.getBigDecimal();
    }

    /**
     * Set field ULTIMO using a String value.
     */
    public void setULTIMO(String newvalue) {
        fieldULTIMO.setString(newvalue);
    }

    /**
     * Get value of field ULTIMO as a String.
     */
    public String getULTIMO() {
        return fieldULTIMO.getString();
    }

    /**
     * Set numeric field ULTIMO using a BigDecimal value.
     */
    public void setULTIMO(BigDecimal newvalue) {
        fieldULTIMO.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field ULTIMO as a BigDecimal.
     */
    public BigDecimal getBigDecimalULTIMO() {
        return fieldULTIMO.getBigDecimal();
    }

    /**
     * Set field PER using a String value.
     */
    public void setPER(String newvalue) {
        fieldPER.setString(newvalue);
    }

    /**
     * Get value of field PER as a String.
     */
    public String getPER() {
        return fieldPER.getString();
    }

    /**
     * Set field RESP using a String value.
     */
    public void setRESP(String newvalue) {
        fieldRESP.setString(newvalue);
    }

    /**
     * Get value of field RESP as a String.
     */
    public String getRESP() {
        return fieldRESP.getString();
    }

}
