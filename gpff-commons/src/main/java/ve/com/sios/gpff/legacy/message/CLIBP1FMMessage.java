package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from CLIBP1FM physical file
 * definition.
 * 
* File level identifier is 1140215083200. Record format level identifier is
 * 4A8C05138892B.
 */
public class CLIBP1FMMessage extends MessageRecord {

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
        "CUR",
        "CLICLA",
        "NOMAPP",
        "CLPNOM",
        "CLPAPE",
        "CLPAP2",
        "CLPDI1",
        "CLPDI2",
        "CLPPOS",
        "CLPPRO",
        "CLPPAI",
        "CLPPOB",
        "CLPNIF",
        "DSPANA",
        "CLPTEL"
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
        "CUR",
        "CLICLA",
        "NOMAPP",
        "CLPNOM",
        "CLPAPE",
        "CLPAP2",
        "CLPDI1",
        "CLPDI2",
        "CLPPOS",
        "CLPPRO",
        "CLPPAI",
        "CLPPOB",
        "CLPNIF",
        "DSPANA",
        "CLPTEL"
    };
    final static String fid = "1140215083200";
    final static String rid = "4A8C05138892B";
    final static String fmtname = "CLIBP1FM";
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
    private CharacterField fieldREGCUR = null;
    private CharacterField fieldCAMCUR = null;
    private DecimalField fieldCUR = null;
    private DecimalField fieldCLICLA = null;
    private CharacterField fieldNOMAPP = null;
    private CharacterField fieldCLPNOM = null;
    private CharacterField fieldCLPAPE = null;
    private CharacterField fieldCLPAP2 = null;
    private CharacterField fieldCLPDI1 = null;
    private CharacterField fieldCLPDI2 = null;
    private CharacterField fieldCLPPOS = null;
    private CharacterField fieldCLPPRO = null;
    private DecimalField fieldCLPPAI = null;
    private CharacterField fieldCLPPOB = null;
    private CharacterField fieldCLPNIF = null;
    private DecimalField fieldDSPANA = null;
    private DecimalField fieldCLPTEL = null;

    /**
     * Constructor for CLIBP1FMMessage.
     */
    public CLIBP1FMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 448;
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
        fields[11] = fieldCUR
                = new DecimalField(message, HEADERSIZE + 181, 5, 0, "CUR");
        fields[12] = fieldCLICLA
                = new DecimalField(message, HEADERSIZE + 186, 8, 0, "CLICLA");
        fields[13] = fieldNOMAPP
                = new CharacterField(message, HEADERSIZE + 194, 50, "NOMAPP");
        fields[14] = fieldCLPNOM
                = new CharacterField(message, HEADERSIZE + 244, 20, "CLPNOM");
        fields[15] = fieldCLPAPE
                = new CharacterField(message, HEADERSIZE + 264, 15, "CLPAPE");
        fields[16] = fieldCLPAP2
                = new CharacterField(message, HEADERSIZE + 279, 15, "CLPAP2");
        fields[17] = fieldCLPDI1
                = new CharacterField(message, HEADERSIZE + 294, 30, "CLPDI1");
        fields[18] = fieldCLPDI2
                = new CharacterField(message, HEADERSIZE + 324, 30, "CLPDI2");
        fields[19] = fieldCLPPOS
                = new CharacterField(message, HEADERSIZE + 354, 9, "CLPPOS");
        fields[20] = fieldCLPPRO
                = new CharacterField(message, HEADERSIZE + 363, 25, "CLPPRO");
        fields[21] = fieldCLPPAI
                = new DecimalField(message, HEADERSIZE + 388, 4, 0, "CLPPAI");
        fields[22] = fieldCLPPOB
                = new CharacterField(message, HEADERSIZE + 392, 27, "CLPPOB");
        fields[23] = fieldCLPNIF
                = new CharacterField(message, HEADERSIZE + 419, 12, "CLPNIF");
        fields[24] = fieldDSPANA
                = new DecimalField(message, HEADERSIZE + 431, 7, 0, "DSPANA");
        fields[25] = fieldCLPTEL
                = new DecimalField(message, HEADERSIZE + 438, 10, 0, "CLPTEL");

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
     * Set field CUR using a String value.
     */
    public void setCUR(String newvalue) {
        fieldCUR.setString(newvalue);
    }

    /**
     * Get value of field CUR as a String.
     */
    public String getCUR() {
        return fieldCUR.getString();
    }

    /**
     * Set numeric field CUR using a BigDecimal value.
     */
    public void setCUR(BigDecimal newvalue) {
        fieldCUR.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CUR as a BigDecimal.
     */
    public BigDecimal getBigDecimalCUR() {
        return fieldCUR.getBigDecimal();
    }

    /**
     * Set field CLICLA using a String value.
     */
    public void setCLICLA(String newvalue) {
        fieldCLICLA.setString(newvalue);
    }

    /**
     * Get value of field CLICLA as a String.
     */
    public String getCLICLA() {
        return fieldCLICLA.getString();
    }

    /**
     * Set numeric field CLICLA using a BigDecimal value.
     */
    public void setCLICLA(BigDecimal newvalue) {
        fieldCLICLA.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CLICLA as a BigDecimal.
     */
    public BigDecimal getBigDecimalCLICLA() {
        return fieldCLICLA.getBigDecimal();
    }

    /**
     * Set field NOMAPP using a String value.
     */
    public void setNOMAPP(String newvalue) {
        fieldNOMAPP.setString(newvalue);
    }

    /**
     * Get value of field NOMAPP as a String.
     */
    public String getNOMAPP() {
        return fieldNOMAPP.getString();
    }

    /**
     * Set field CLPNOM using a String value.
     */
    public void setCLPNOM(String newvalue) {
        fieldCLPNOM.setString(newvalue);
    }

    /**
     * Get value of field CLPNOM as a String.
     */
    public String getCLPNOM() {
        return fieldCLPNOM.getString();
    }

    /**
     * Set field CLPAPE using a String value.
     */
    public void setCLPAPE(String newvalue) {
        fieldCLPAPE.setString(newvalue);
    }

    /**
     * Get value of field CLPAPE as a String.
     */
    public String getCLPAPE() {
        return fieldCLPAPE.getString();
    }

    /**
     * Set field CLPAP2 using a String value.
     */
    public void setCLPAP2(String newvalue) {
        fieldCLPAP2.setString(newvalue);
    }

    /**
     * Get value of field CLPAP2 as a String.
     */
    public String getCLPAP2() {
        return fieldCLPAP2.getString();
    }

    /**
     * Set field CLPDI1 using a String value.
     */
    public void setCLPDI1(String newvalue) {
        fieldCLPDI1.setString(newvalue);
    }

    /**
     * Get value of field CLPDI1 as a String.
     */
    public String getCLPDI1() {
        return fieldCLPDI1.getString();
    }

    /**
     * Set field CLPDI2 using a String value.
     */
    public void setCLPDI2(String newvalue) {
        fieldCLPDI2.setString(newvalue);
    }

    /**
     * Get value of field CLPDI2 as a String.
     */
    public String getCLPDI2() {
        return fieldCLPDI2.getString();
    }

    /**
     * Set field CLPPOS using a String value.
     */
    public void setCLPPOS(String newvalue) {
        fieldCLPPOS.setString(newvalue);
    }

    /**
     * Get value of field CLPPOS as a String.
     */
    public String getCLPPOS() {
        return fieldCLPPOS.getString();
    }

    /**
     * Set field CLPPRO using a String value.
     */
    public void setCLPPRO(String newvalue) {
        fieldCLPPRO.setString(newvalue);
    }

    /**
     * Get value of field CLPPRO as a String.
     */
    public String getCLPPRO() {
        return fieldCLPPRO.getString();
    }

    /**
     * Set field CLPPAI using a String value.
     */
    public void setCLPPAI(String newvalue) {
        fieldCLPPAI.setString(newvalue);
    }

    /**
     * Get value of field CLPPAI as a String.
     */
    public String getCLPPAI() {
        return fieldCLPPAI.getString();
    }

    /**
     * Set numeric field CLPPAI using a BigDecimal value.
     */
    public void setCLPPAI(BigDecimal newvalue) {
        fieldCLPPAI.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CLPPAI as a BigDecimal.
     */
    public BigDecimal getBigDecimalCLPPAI() {
        return fieldCLPPAI.getBigDecimal();
    }

    /**
     * Set field CLPPOB using a String value.
     */
    public void setCLPPOB(String newvalue) {
        fieldCLPPOB.setString(newvalue);
    }

    /**
     * Get value of field CLPPOB as a String.
     */
    public String getCLPPOB() {
        return fieldCLPPOB.getString();
    }

    /**
     * Set field CLPNIF using a String value.
     */
    public void setCLPNIF(String newvalue) {
        fieldCLPNIF.setString(newvalue);
    }

    /**
     * Get value of field CLPNIF as a String.
     */
    public String getCLPNIF() {
        return fieldCLPNIF.getString();
    }

    /**
     * Set field DSPANA using a String value.
     */
    public void setDSPANA(String newvalue) {
        fieldDSPANA.setString(newvalue);
    }

    /**
     * Get value of field DSPANA as a String.
     */
    public String getDSPANA() {
        return fieldDSPANA.getString();
    }

    /**
     * Set numeric field DSPANA using a BigDecimal value.
     */
    public void setDSPANA(BigDecimal newvalue) {
        fieldDSPANA.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DSPANA as a BigDecimal.
     */
    public BigDecimal getBigDecimalDSPANA() {
        return fieldDSPANA.getBigDecimal();
    }

    /**
     * Set field CLPTEL using a String value.
     */
    public void setCLPTEL(String newvalue) {
        fieldCLPTEL.setString(newvalue);
    }

    /**
     * Get value of field CLPTEL as a String.
     */
    public String getCLPTEL() {
        return fieldCLPTEL.getString();
    }

    /**
     * Set numeric field CLPTEL using a BigDecimal value.
     */
    public void setCLPTEL(BigDecimal newvalue) {
        fieldCLPTEL.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CLPTEL as a BigDecimal.
     */
    public BigDecimal getBigDecimalCLPTEL() {
        return fieldCLPTEL.getBigDecimal();
    }

}
