package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from LCARACTFM physical file
 * definition.
 * 
* File level identifier is 1140223202006. Record format level identifier is
 * 47B601147FF6F.
 */
public class LCARACTFMMessage extends MessageRecord {

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
        "AREAD",
        "AREAH",
        "FECPRO",
        "MODALIDAD",
        "PAREA",
        "PEMISOR",
        "EMISOR"
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
        "AREAD",
        "AREAH",
        "FECPRO",
        "MODALIDAD",
        "PAREA",
        "PEMISOR",
        "EMISOR"
    };
    final static String fid = "1140223202006";
    final static String rid = "47B601147FF6F";
    final static String fmtname = "LCARACTFM";
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
    private CharacterField fieldAREAD = null;
    private CharacterField fieldAREAH = null;
    private DecimalField fieldFECPRO = null;
    private CharacterField fieldMODALIDAD = null;
    private CharacterField fieldPAREA = null;
    private CharacterField fieldPEMISOR = null;
    private CharacterField fieldEMISOR = null;

    /**
     * Constructor for LCARACTFMMessage.
     */
    public LCARACTFMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 218;
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
        fields[12] = fieldAREAD
                = new CharacterField(message, HEADERSIZE + 186, 4, "AREAD");
        fields[13] = fieldAREAH
                = new CharacterField(message, HEADERSIZE + 190, 4, "AREAH");
        fields[14] = fieldFECPRO
                = new DecimalField(message, HEADERSIZE + 194, 7, 0, "FECPRO");
        fields[15] = fieldMODALIDAD
                = new CharacterField(message, HEADERSIZE + 201, 3, "MODALIDAD");
        fields[16] = fieldPAREA
                = new CharacterField(message, HEADERSIZE + 204, 1, "PAREA");
        fields[17] = fieldPEMISOR
                = new CharacterField(message, HEADERSIZE + 205, 1, "PEMISOR");
        fields[18] = fieldEMISOR
                = new CharacterField(message, HEADERSIZE + 206, 12, "EMISOR");

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
     * Set field AREAD using a String value.
     */
    public void setAREAD(String newvalue) {
        fieldAREAD.setString(newvalue);
    }

    /**
     * Get value of field AREAD as a String.
     */
    public String getAREAD() {
        return fieldAREAD.getString();
    }

    /**
     * Set field AREAH using a String value.
     */
    public void setAREAH(String newvalue) {
        fieldAREAH.setString(newvalue);
    }

    /**
     * Get value of field AREAH as a String.
     */
    public String getAREAH() {
        return fieldAREAH.getString();
    }

    /**
     * Set field FECPRO using a String value.
     */
    public void setFECPRO(String newvalue) {
        fieldFECPRO.setString(newvalue);
    }

    /**
     * Get value of field FECPRO as a String.
     */
    public String getFECPRO() {
        return fieldFECPRO.getString();
    }

    /**
     * Set numeric field FECPRO using a BigDecimal value.
     */
    public void setFECPRO(BigDecimal newvalue) {
        fieldFECPRO.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECPRO as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECPRO() {
        return fieldFECPRO.getBigDecimal();
    }

    /**
     * Set field MODALIDAD using a String value.
     */
    public void setMODALIDAD(String newvalue) {
        fieldMODALIDAD.setString(newvalue);
    }

    /**
     * Get value of field MODALIDAD as a String.
     */
    public String getMODALIDAD() {
        return fieldMODALIDAD.getString();
    }

    /**
     * Set field PAREA using a String value.
     */
    public void setPAREA(String newvalue) {
        fieldPAREA.setString(newvalue);
    }

    /**
     * Get value of field PAREA as a String.
     */
    public String getPAREA() {
        return fieldPAREA.getString();
    }

    /**
     * Set field PEMISOR using a String value.
     */
    public void setPEMISOR(String newvalue) {
        fieldPEMISOR.setString(newvalue);
    }

    /**
     * Get value of field PEMISOR as a String.
     */
    public String getPEMISOR() {
        return fieldPEMISOR.getString();
    }

    /**
     * Set field EMISOR using a String value.
     */
    public void setEMISOR(String newvalue) {
        fieldEMISOR.setString(newvalue);
    }

    /**
     * Get value of field EMISOR as a String.
     */
    public String getEMISOR() {
        return fieldEMISOR.getString();
    }

}