package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from ACTIVOFM physical file
 * definition.
 * 
* File level identifier is 1140216201108. Record format level identifier is
 * 3B861DFB35160.
 */
public class ACTIVOFMMessage extends MessageRecord {

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
        "NOPVDA",
        "ANTIGUO",
        "RENOVADO",
        "NOPRNV",
        "FECPRO",
        "NOMACTP",
        "INVINT",
        "SEL",
        "INVVAL",
        "INVNOP",
        "INVVTO",
        "INVVNO",
        "INVPOP",
        "XNOM",
        "XNOMI",
        "TASAS",
        "EMISOR",
        "VLOUDE",
        "VLOUCA"
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
        "NOPVDA",
        "ANTIGUO",
        "RENOVADO",
        "NOPRNV",
        "FECPRO",
        "NOMACTP",
        "INVINT",
        "SEL",
        "INVVAL",
        "INVNOP",
        "INVVTO",
        "INVVNO",
        "INVPOP",
        "XNOM",
        "XNOMI",
        "TASAS",
        "EMISOR",
        "VLOUDE",
        "VLOUCA"
    };
    final static String fid = "1140216201108";
    final static String rid = "3B861DFB35160";
    final static String fmtname = "ACTIVOFM";
    final int FIELDCOUNT = 31;
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
    private DecimalField fieldNOPVDA = null;
    private CharacterField fieldANTIGUO = null;
    private CharacterField fieldRENOVADO = null;
    private DecimalField fieldNOPRNV = null;
    private DecimalField fieldFECPRO = null;
    private CharacterField fieldNOMACTP = null;
    private DecimalField fieldINVINT = null;
    private CharacterField fieldSEL = null;
    private CharacterField fieldINVVAL = null;
    private DecimalField fieldINVNOP = null;
    private DecimalField fieldINVVTO = null;
    private DecimalField fieldINVVNO = null;
    private DecimalField fieldINVPOP = null;
    private CharacterField fieldXNOM = null;
    private CharacterField fieldXNOMI = null;
    private DecimalField fieldTASAS = null;
    private DecimalField fieldEMISOR = null;
    private DecimalField fieldVLOUDE = null;
    private DecimalField fieldVLOUCA = null;

    /**
     * Constructor for ACTIVOFMMessage.
     */
    public ACTIVOFMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 371;
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
        fields[12] = fieldNOPVDA
                = new DecimalField(message, HEADERSIZE + 186, 11, 0, "NOPVDA");
        fields[13] = fieldANTIGUO
                = new CharacterField(message, HEADERSIZE + 197, 12, "ANTIGUO");
        fields[14] = fieldRENOVADO
                = new CharacterField(message, HEADERSIZE + 209, 12, "RENOVADO");
        fields[15] = fieldNOPRNV
                = new DecimalField(message, HEADERSIZE + 221, 11, 0, "NOPRNV");
        fields[16] = fieldFECPRO
                = new DecimalField(message, HEADERSIZE + 232, 7, 0, "FECPRO");
        fields[17] = fieldNOMACTP
                = new CharacterField(message, HEADERSIZE + 239, 30, "NOMACTP");
        fields[18] = fieldINVINT
                = new DecimalField(message, HEADERSIZE + 269, 8, 0, "INVINT");
        fields[19] = fieldSEL
                = new CharacterField(message, HEADERSIZE + 277, 1, "SEL");
        fields[20] = fieldINVVAL
                = new CharacterField(message, HEADERSIZE + 278, 12, "INVVAL");
        fields[21] = fieldINVNOP
                = new DecimalField(message, HEADERSIZE + 290, 11, 0, "INVNOP");
        fields[22] = fieldINVVTO
                = new DecimalField(message, HEADERSIZE + 301, 7, 0, "INVVTO");
        fields[23] = fieldINVVNO
                = new DecimalField(message, HEADERSIZE + 308, 17, 2, "INVVNO");
        fields[24] = fieldINVPOP
                = new DecimalField(message, HEADERSIZE + 325, 11, 6, "INVPOP");
        fields[25] = fieldXNOM
                = new CharacterField(message, HEADERSIZE + 336, 1, "XNOM");
        fields[26] = fieldXNOMI
                = new CharacterField(message, HEADERSIZE + 337, 1, "XNOMI");
        fields[27] = fieldTASAS
                = new DecimalField(message, HEADERSIZE + 338, 11, 6, "TASAS");
        fields[28] = fieldEMISOR
                = new DecimalField(message, HEADERSIZE + 349, 8, 0, "EMISOR");
        fields[29] = fieldVLOUDE
                = new DecimalField(message, HEADERSIZE + 357, 7, 0, "VLOUDE");
        fields[30] = fieldVLOUCA
                = new DecimalField(message, HEADERSIZE + 364, 7, 0, "VLOUCA");

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
     * Set field NOPVDA using a String value.
     */
    public void setNOPVDA(String newvalue) {
        fieldNOPVDA.setString(newvalue);
    }

    /**
     * Get value of field NOPVDA as a String.
     */
    public String getNOPVDA() {
        return fieldNOPVDA.getString();
    }

    /**
     * Set numeric field NOPVDA using a BigDecimal value.
     */
    public void setNOPVDA(BigDecimal newvalue) {
        fieldNOPVDA.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field NOPVDA as a BigDecimal.
     */
    public BigDecimal getBigDecimalNOPVDA() {
        return fieldNOPVDA.getBigDecimal();
    }

    /**
     * Set field ANTIGUO using a String value.
     */
    public void setANTIGUO(String newvalue) {
        fieldANTIGUO.setString(newvalue);
    }

    /**
     * Get value of field ANTIGUO as a String.
     */
    public String getANTIGUO() {
        return fieldANTIGUO.getString();
    }

    /**
     * Set field RENOVADO using a String value.
     */
    public void setRENOVADO(String newvalue) {
        fieldRENOVADO.setString(newvalue);
    }

    /**
     * Get value of field RENOVADO as a String.
     */
    public String getRENOVADO() {
        return fieldRENOVADO.getString();
    }

    /**
     * Set field NOPRNV using a String value.
     */
    public void setNOPRNV(String newvalue) {
        fieldNOPRNV.setString(newvalue);
    }

    /**
     * Get value of field NOPRNV as a String.
     */
    public String getNOPRNV() {
        return fieldNOPRNV.getString();
    }

    /**
     * Set numeric field NOPRNV using a BigDecimal value.
     */
    public void setNOPRNV(BigDecimal newvalue) {
        fieldNOPRNV.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field NOPRNV as a BigDecimal.
     */
    public BigDecimal getBigDecimalNOPRNV() {
        return fieldNOPRNV.getBigDecimal();
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
     * Set field NOMACTP using a String value.
     */
    public void setNOMACTP(String newvalue) {
        fieldNOMACTP.setString(newvalue);
    }

    /**
     * Get value of field NOMACTP as a String.
     */
    public String getNOMACTP() {
        return fieldNOMACTP.getString();
    }

    /**
     * Set field INVINT using a String value.
     */
    public void setINVINT(String newvalue) {
        fieldINVINT.setString(newvalue);
    }

    /**
     * Get value of field INVINT as a String.
     */
    public String getINVINT() {
        return fieldINVINT.getString();
    }

    /**
     * Set numeric field INVINT using a BigDecimal value.
     */
    public void setINVINT(BigDecimal newvalue) {
        fieldINVINT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INVINT as a BigDecimal.
     */
    public BigDecimal getBigDecimalINVINT() {
        return fieldINVINT.getBigDecimal();
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

    /**
     * Set field INVVAL using a String value.
     */
    public void setINVVAL(String newvalue) {
        fieldINVVAL.setString(newvalue);
    }

    /**
     * Get value of field INVVAL as a String.
     */
    public String getINVVAL() {
        return fieldINVVAL.getString();
    }

    /**
     * Set field INVNOP using a String value.
     */
    public void setINVNOP(String newvalue) {
        fieldINVNOP.setString(newvalue);
    }

    /**
     * Get value of field INVNOP as a String.
     */
    public String getINVNOP() {
        return fieldINVNOP.getString();
    }

    /**
     * Set numeric field INVNOP using a BigDecimal value.
     */
    public void setINVNOP(BigDecimal newvalue) {
        fieldINVNOP.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INVNOP as a BigDecimal.
     */
    public BigDecimal getBigDecimalINVNOP() {
        return fieldINVNOP.getBigDecimal();
    }

    /**
     * Set field INVVTO using a String value.
     */
    public void setINVVTO(String newvalue) {
        fieldINVVTO.setString(newvalue);
    }

    /**
     * Get value of field INVVTO as a String.
     */
    public String getINVVTO() {
        return fieldINVVTO.getString();
    }

    /**
     * Set numeric field INVVTO using a BigDecimal value.
     */
    public void setINVVTO(BigDecimal newvalue) {
        fieldINVVTO.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INVVTO as a BigDecimal.
     */
    public BigDecimal getBigDecimalINVVTO() {
        return fieldINVVTO.getBigDecimal();
    }

    /**
     * Set field INVVNO using a String value.
     */
    public void setINVVNO(String newvalue) {
        fieldINVVNO.setString(newvalue);
    }

    /**
     * Get value of field INVVNO as a String.
     */
    public String getINVVNO() {
        return fieldINVVNO.getString();
    }

    /**
     * Set numeric field INVVNO using a BigDecimal value.
     */
    public void setINVVNO(BigDecimal newvalue) {
        fieldINVVNO.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INVVNO as a BigDecimal.
     */
    public BigDecimal getBigDecimalINVVNO() {
        return fieldINVVNO.getBigDecimal();
    }

    /**
     * Set field INVPOP using a String value.
     */
    public void setINVPOP(String newvalue) {
        fieldINVPOP.setString(newvalue);
    }

    /**
     * Get value of field INVPOP as a String.
     */
    public String getINVPOP() {
        return fieldINVPOP.getString();
    }

    /**
     * Set numeric field INVPOP using a BigDecimal value.
     */
    public void setINVPOP(BigDecimal newvalue) {
        fieldINVPOP.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INVPOP as a BigDecimal.
     */
    public BigDecimal getBigDecimalINVPOP() {
        return fieldINVPOP.getBigDecimal();
    }

    /**
     * Set field XNOM using a String value.
     */
    public void setXNOM(String newvalue) {
        fieldXNOM.setString(newvalue);
    }

    /**
     * Get value of field XNOM as a String.
     */
    public String getXNOM() {
        return fieldXNOM.getString();
    }

    /**
     * Set field XNOMI using a String value.
     */
    public void setXNOMI(String newvalue) {
        fieldXNOMI.setString(newvalue);
    }

    /**
     * Get value of field XNOMI as a String.
     */
    public String getXNOMI() {
        return fieldXNOMI.getString();
    }

    /**
     * Set field TASAS using a String value.
     */
    public void setTASAS(String newvalue) {
        fieldTASAS.setString(newvalue);
    }

    /**
     * Get value of field TASAS as a String.
     */
    public String getTASAS() {
        return fieldTASAS.getString();
    }

    /**
     * Set numeric field TASAS using a BigDecimal value.
     */
    public void setTASAS(BigDecimal newvalue) {
        fieldTASAS.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field TASAS as a BigDecimal.
     */
    public BigDecimal getBigDecimalTASAS() {
        return fieldTASAS.getBigDecimal();
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

    /**
     * Set numeric field EMISOR using a BigDecimal value.
     */
    public void setEMISOR(BigDecimal newvalue) {
        fieldEMISOR.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field EMISOR as a BigDecimal.
     */
    public BigDecimal getBigDecimalEMISOR() {
        return fieldEMISOR.getBigDecimal();
    }

    /**
     * Set field VLOUDE using a String value.
     */
    public void setVLOUDE(String newvalue) {
        fieldVLOUDE.setString(newvalue);
    }

    /**
     * Get value of field VLOUDE as a String.
     */
    public String getVLOUDE() {
        return fieldVLOUDE.getString();
    }

    /**
     * Set numeric field VLOUDE using a BigDecimal value.
     */
    public void setVLOUDE(BigDecimal newvalue) {
        fieldVLOUDE.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field VLOUDE as a BigDecimal.
     */
    public BigDecimal getBigDecimalVLOUDE() {
        return fieldVLOUDE.getBigDecimal();
    }

    /**
     * Set field VLOUCA using a String value.
     */
    public void setVLOUCA(String newvalue) {
        fieldVLOUCA.setString(newvalue);
    }

    /**
     * Get value of field VLOUCA as a String.
     */
    public String getVLOUCA() {
        return fieldVLOUCA.getString();
    }

    /**
     * Set numeric field VLOUCA using a BigDecimal value.
     */
    public void setVLOUCA(BigDecimal newvalue) {
        fieldVLOUCA.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field VLOUCA as a BigDecimal.
     */
    public BigDecimal getBigDecimalVLOUCA() {
        return fieldVLOUCA.getBigDecimal();
    }

}
