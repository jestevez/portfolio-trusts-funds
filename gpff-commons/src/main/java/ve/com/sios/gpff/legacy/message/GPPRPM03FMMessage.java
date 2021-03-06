package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from GPPRPM03FM physical file
 * definition.
 * 
* File level identifier is 1140322125947. Record format level identifier is
 * 414F2B3BABBD6.
 */
public class GPPRPM03FMMessage extends MessageRecord {

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
        "CLINIF",
        "CLICLA",
        "FECNAC",
        "CLINOM",
        "CLIAPE",
        "CLIAP2",
        "CLIGES",
        "GESNOM",
        "CLISEX",
        "SEXTXT",
        "CLIOBS",
        "SEX",
        "SEL"
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
        "CLINIF",
        "CLICLA",
        "FECNAC",
        "CLINOM",
        "CLIAPE",
        "CLIAP2",
        "CLIGES",
        "GESNOM",
        "CLISEX",
        "SEXTXT",
        "CLIOBS",
        "SEX",
        "SEL"
    };
    final static String fid = "1140322125947";
    final static String rid = "414F2B3BABBD6";
    final static String fmtname = "GPPRPM03FM";
    final int FIELDCOUNT = 25;
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
    private CharacterField fieldCLINIF = null;
    private DecimalField fieldCLICLA = null;
    private DecimalField fieldFECNAC = null;
    private CharacterField fieldCLINOM = null;
    private CharacterField fieldCLIAPE = null;
    private CharacterField fieldCLIAP2 = null;
    private DecimalField fieldCLIGES = null;
    private CharacterField fieldGESNOM = null;
    private CharacterField fieldCLISEX = null;
    private CharacterField fieldSEXTXT = null;
    private CharacterField fieldCLIOBS = null;
    private CharacterField fieldSEX = null;
    private CharacterField fieldSEL = null;

    /**
     * Constructor for GPPRPM03FMMessage.
     */
    public GPPRPM03FMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 368;
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
        fields[12] = fieldCLINIF
                = new CharacterField(message, HEADERSIZE + 186, 12, "CLINIF");
        fields[13] = fieldCLICLA
                = new DecimalField(message, HEADERSIZE + 198, 8, 0, "CLICLA");
        fields[14] = fieldFECNAC
                = new DecimalField(message, HEADERSIZE + 206, 7, 0, "FECNAC");
        fields[15] = fieldCLINOM
                = new CharacterField(message, HEADERSIZE + 213, 20, "CLINOM");
        fields[16] = fieldCLIAPE
                = new CharacterField(message, HEADERSIZE + 233, 15, "CLIAPE");
        fields[17] = fieldCLIAP2
                = new CharacterField(message, HEADERSIZE + 248, 15, "CLIAP2");
        fields[18] = fieldCLIGES
                = new DecimalField(message, HEADERSIZE + 263, 3, 0, "CLIGES");
        fields[19] = fieldGESNOM
                = new CharacterField(message, HEADERSIZE + 266, 40, "GESNOM");
        fields[20] = fieldCLISEX
                = new CharacterField(message, HEADERSIZE + 306, 1, "CLISEX");
        fields[21] = fieldSEXTXT
                = new CharacterField(message, HEADERSIZE + 307, 9, "SEXTXT");
        fields[22] = fieldCLIOBS
                = new CharacterField(message, HEADERSIZE + 316, 50, "CLIOBS");
        fields[23] = fieldSEX
                = new CharacterField(message, HEADERSIZE + 366, 1, "SEX");
        fields[24] = fieldSEL
                = new CharacterField(message, HEADERSIZE + 367, 1, "SEL");

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
     * Set field FECNAC using a String value.
     */
    public void setFECNAC(String newvalue) {
        fieldFECNAC.setString(newvalue);
    }

    /**
     * Get value of field FECNAC as a String.
     */
    public String getFECNAC() {
        return fieldFECNAC.getString();
    }

    /**
     * Set numeric field FECNAC using a BigDecimal value.
     */
    public void setFECNAC(BigDecimal newvalue) {
        fieldFECNAC.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECNAC as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECNAC() {
        return fieldFECNAC.getBigDecimal();
    }

    /**
     * Set field CLINOM using a String value.
     */
    public void setCLINOM(String newvalue) {
        fieldCLINOM.setString(newvalue);
    }

    /**
     * Get value of field CLINOM as a String.
     */
    public String getCLINOM() {
        return fieldCLINOM.getString();
    }

    /**
     * Set field CLIAPE using a String value.
     */
    public void setCLIAPE(String newvalue) {
        fieldCLIAPE.setString(newvalue);
    }

    /**
     * Get value of field CLIAPE as a String.
     */
    public String getCLIAPE() {
        return fieldCLIAPE.getString();
    }

    /**
     * Set field CLIAP2 using a String value.
     */
    public void setCLIAP2(String newvalue) {
        fieldCLIAP2.setString(newvalue);
    }

    /**
     * Get value of field CLIAP2 as a String.
     */
    public String getCLIAP2() {
        return fieldCLIAP2.getString();
    }

    /**
     * Set field CLIGES using a String value.
     */
    public void setCLIGES(String newvalue) {
        fieldCLIGES.setString(newvalue);
    }

    /**
     * Get value of field CLIGES as a String.
     */
    public String getCLIGES() {
        return fieldCLIGES.getString();
    }

    /**
     * Set numeric field CLIGES using a BigDecimal value.
     */
    public void setCLIGES(BigDecimal newvalue) {
        fieldCLIGES.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CLIGES as a BigDecimal.
     */
    public BigDecimal getBigDecimalCLIGES() {
        return fieldCLIGES.getBigDecimal();
    }

    /**
     * Set field GESNOM using a String value.
     */
    public void setGESNOM(String newvalue) {
        fieldGESNOM.setString(newvalue);
    }

    /**
     * Get value of field GESNOM as a String.
     */
    public String getGESNOM() {
        return fieldGESNOM.getString();
    }

    /**
     * Set field CLISEX using a String value.
     */
    public void setCLISEX(String newvalue) {
        fieldCLISEX.setString(newvalue);
    }

    /**
     * Get value of field CLISEX as a String.
     */
    public String getCLISEX() {
        return fieldCLISEX.getString();
    }

    /**
     * Set field SEXTXT using a String value.
     */
    public void setSEXTXT(String newvalue) {
        fieldSEXTXT.setString(newvalue);
    }

    /**
     * Get value of field SEXTXT as a String.
     */
    public String getSEXTXT() {
        return fieldSEXTXT.getString();
    }

    /**
     * Set field CLIOBS using a String value.
     */
    public void setCLIOBS(String newvalue) {
        fieldCLIOBS.setString(newvalue);
    }

    /**
     * Get value of field CLIOBS as a String.
     */
    public String getCLIOBS() {
        return fieldCLIOBS.getString();
    }

    /**
     * Set field SEX using a String value.
     */
    public void setSEX(String newvalue) {
        fieldSEX.setString(newvalue);
    }

    /**
     * Get value of field SEX as a String.
     */
    public String getSEX() {
        return fieldSEX.getString();
    }

    /**
     * Set field SEL using a String value.
     */
    public void setSEL(String newvalue) {
        fieldSEL.setString(newvalue);
    }

    /**
     * Get value of field SEL as a String.
     */
    public String getSEL() {
        return fieldSEL.getString();
    }

}
