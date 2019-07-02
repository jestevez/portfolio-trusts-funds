package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from PETOFIFM physical file
 * definition.
 * 
* File level identifier is 1140322161044. Record format level identifier is
 * 486F2E281A037.
 */
public class PETOFIFMMessage extends MessageRecord {

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
        "SFNOMB",
        "SFCLI",
        "SFVAL",
        "SFAST",
        "SFFEC",
        "SFNOM",
        "SFIMP",
        "TABNOM",
        "OK1",
        "CLAV",
        "NCLAV",
        "TIPO",
        "TOTAL1",
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
        "SFNOMB",
        "SFCLI",
        "SFVAL",
        "SFAST",
        "SFFEC",
        "SFNOM",
        "SFIMP",
        "TABNOM",
        "OK1",
        "CLAV",
        "NCLAV",
        "TIPO",
        "TOTAL1",
        "TEXERR"
    };
    final static String fid = "1140322161044";
    final static String rid = "486F2E281A037";
    final static String fmtname = "PETOFIFM";
    final int FIELDCOUNT = 23;
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
    private CharacterField fieldSFNOMB = null;
    private DecimalField fieldSFCLI = null;
    private CharacterField fieldSFVAL = null;
    private CharacterField fieldSFAST = null;
    private DecimalField fieldSFFEC = null;
    private CharacterField fieldSFNOM = null;
    private DecimalField fieldSFIMP = null;
    private CharacterField fieldTABNOM = null;
    private CharacterField fieldOK1 = null;
    private CharacterField fieldCLAV = null;
    private CharacterField fieldNCLAV = null;
    private CharacterField fieldTIPO = null;
    private DecimalField fieldTOTAL1 = null;
    private CharacterField fieldTEXERR = null;

    /**
     * Constructor for PETOFIFMMessage.
     */
    public PETOFIFMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 453;
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
        fields[9] = fieldSFNOMB
                = new CharacterField(message, HEADERSIZE + 161, 40, "SFNOMB");
        fields[10] = fieldSFCLI
                = new DecimalField(message, HEADERSIZE + 201, 8, 0, "SFCLI");
        fields[11] = fieldSFVAL
                = new CharacterField(message, HEADERSIZE + 209, 14, "SFVAL");
        fields[12] = fieldSFAST
                = new CharacterField(message, HEADERSIZE + 223, 1, "SFAST");
        fields[13] = fieldSFFEC
                = new DecimalField(message, HEADERSIZE + 224, 7, 0, "SFFEC");
        fields[14] = fieldSFNOM
                = new CharacterField(message, HEADERSIZE + 231, 23, "SFNOM");
        fields[15] = fieldSFIMP
                = new DecimalField(message, HEADERSIZE + 254, 17, 2, "SFIMP");
        fields[16] = fieldTABNOM
                = new CharacterField(message, HEADERSIZE + 271, 40, "TABNOM");
        fields[17] = fieldOK1
                = new CharacterField(message, HEADERSIZE + 311, 1, "OK1");
        fields[18] = fieldCLAV
                = new CharacterField(message, HEADERSIZE + 312, 4, "CLAV");
        fields[19] = fieldNCLAV
                = new CharacterField(message, HEADERSIZE + 316, 40, "NCLAV");
        fields[20] = fieldTIPO
                = new CharacterField(message, HEADERSIZE + 356, 20, "TIPO");
        fields[21] = fieldTOTAL1
                = new DecimalField(message, HEADERSIZE + 376, 17, 2, "TOTAL1");
        fields[22] = fieldTEXERR
                = new CharacterField(message, HEADERSIZE + 393, 60, "TEXERR");

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
     * Set field SFNOMB using a String value.
     */
    public void setSFNOMB(String newvalue) {
        fieldSFNOMB.setString(newvalue);
    }

    /**
     * Get value of field SFNOMB as a String.
     */
    public String getSFNOMB() {
        return fieldSFNOMB.getString();
    }

    /**
     * Set field SFCLI using a String value.
     */
    public void setSFCLI(String newvalue) {
        fieldSFCLI.setString(newvalue);
    }

    /**
     * Get value of field SFCLI as a String.
     */
    public String getSFCLI() {
        return fieldSFCLI.getString();
    }

    /**
     * Set numeric field SFCLI using a BigDecimal value.
     */
    public void setSFCLI(BigDecimal newvalue) {
        fieldSFCLI.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field SFCLI as a BigDecimal.
     */
    public BigDecimal getBigDecimalSFCLI() {
        return fieldSFCLI.getBigDecimal();
    }

    /**
     * Set field SFVAL using a String value.
     */
    public void setSFVAL(String newvalue) {
        fieldSFVAL.setString(newvalue);
    }

    /**
     * Get value of field SFVAL as a String.
     */
    public String getSFVAL() {
        return fieldSFVAL.getString();
    }

    /**
     * Set field SFAST using a String value.
     */
    public void setSFAST(String newvalue) {
        fieldSFAST.setString(newvalue);
    }

    /**
     * Get value of field SFAST as a String.
     */
    public String getSFAST() {
        return fieldSFAST.getString();
    }

    /**
     * Set field SFFEC using a String value.
     */
    public void setSFFEC(String newvalue) {
        fieldSFFEC.setString(newvalue);
    }

    /**
     * Get value of field SFFEC as a String.
     */
    public String getSFFEC() {
        return fieldSFFEC.getString();
    }

    /**
     * Set numeric field SFFEC using a BigDecimal value.
     */
    public void setSFFEC(BigDecimal newvalue) {
        fieldSFFEC.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field SFFEC as a BigDecimal.
     */
    public BigDecimal getBigDecimalSFFEC() {
        return fieldSFFEC.getBigDecimal();
    }

    /**
     * Set field SFNOM using a String value.
     */
    public void setSFNOM(String newvalue) {
        fieldSFNOM.setString(newvalue);
    }

    /**
     * Get value of field SFNOM as a String.
     */
    public String getSFNOM() {
        return fieldSFNOM.getString();
    }

    /**
     * Set field SFIMP using a String value.
     */
    public void setSFIMP(String newvalue) {
        fieldSFIMP.setString(newvalue);
    }

    /**
     * Get value of field SFIMP as a String.
     */
    public String getSFIMP() {
        return fieldSFIMP.getString();
    }

    /**
     * Set numeric field SFIMP using a BigDecimal value.
     */
    public void setSFIMP(BigDecimal newvalue) {
        fieldSFIMP.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field SFIMP as a BigDecimal.
     */
    public BigDecimal getBigDecimalSFIMP() {
        return fieldSFIMP.getBigDecimal();
    }

    /**
     * Set field TABNOM using a String value.
     */
    public void setTABNOM(String newvalue) {
        fieldTABNOM.setString(newvalue);
    }

    /**
     * Get value of field TABNOM as a String.
     */
    public String getTABNOM() {
        return fieldTABNOM.getString();
    }

    /**
     * Set field OK1 using a String value.
     */
    public void setOK1(String newvalue) {
        fieldOK1.setString(newvalue);
    }

    /**
     * Get value of field OK1 as a String.
     */
    public String getOK1() {
        return fieldOK1.getString();
    }

    /**
     * Set field CLAV using a String value.
     */
    public void setCLAV(String newvalue) {
        fieldCLAV.setString(newvalue);
    }

    /**
     * Get value of field CLAV as a String.
     */
    public String getCLAV() {
        return fieldCLAV.getString();
    }

    /**
     * Set field NCLAV using a String value.
     */
    public void setNCLAV(String newvalue) {
        fieldNCLAV.setString(newvalue);
    }

    /**
     * Get value of field NCLAV as a String.
     */
    public String getNCLAV() {
        return fieldNCLAV.getString();
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
     * Set field TOTAL1 using a String value.
     */
    public void setTOTAL1(String newvalue) {
        fieldTOTAL1.setString(newvalue);
    }

    /**
     * Get value of field TOTAL1 as a String.
     */
    public String getTOTAL1() {
        return fieldTOTAL1.getString();
    }

    /**
     * Set numeric field TOTAL1 using a BigDecimal value.
     */
    public void setTOTAL1(BigDecimal newvalue) {
        fieldTOTAL1.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field TOTAL1 as a BigDecimal.
     */
    public BigDecimal getBigDecimalTOTAL1() {
        return fieldTOTAL1.getBigDecimal();
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
