package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from DATFIDFM physical file
 * definition.
 * 
* File level identifier is 1140213214006. Record format level identifier is
 * 4000E76EB09FA.
 */
public class DATFIDFMMessage extends MessageRecord {

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
        "CODFI",
        "FIDNOM",
        "FIDTXT",
        "DATCLI",
        "NOMBRE",
        "CLINIF",
        "CLICLS",
        "CLASE",
        "DATTCNX",
        "TIPCON",
        "DATCON",
        "FECMOD",
        "FECOPE",
        "CTCCTA",
        "FECVAL",
        "FECVTO",
        "DATREN",
        "DATDIV",
        "DIVNOM",
        "DATMNT",
        "DATACT",
        "DATDPV",
        "DATTDP",
        "TIPDEP",
        "REFERE",
        "DATCOM",
        "DATPRC",
        "DATOBS"
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
        "CODFI",
        "FIDNOM",
        "FIDTXT",
        "DATCLI",
        "NOMBRE",
        "CLINIF",
        "CLICLS",
        "CLASE",
        "DATTCNX",
        "TIPCON",
        "DATCON",
        "FECMOD",
        "FECOPE",
        "CTCCTA",
        "FECVAL",
        "FECVTO",
        "DATREN",
        "DATDIV",
        "DIVNOM",
        "DATMNT",
        "DATACT",
        "DATDPV",
        "DATTDP",
        "TIPDEP",
        "REFERE",
        "DATCOM",
        "DATPRC",
        "DATOBS"
    };
    final static String fid = "1140213214006";
    final static String rid = "4000E76EB09FA";
    final static String fmtname = "DATFIDFM";
    final int FIELDCOUNT = 40;
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
    private CharacterField fieldCODFI = null;
    private CharacterField fieldFIDNOM = null;
    private CharacterField fieldFIDTXT = null;
    private DecimalField fieldDATCLI = null;
    private CharacterField fieldNOMBRE = null;
    private CharacterField fieldCLINIF = null;
    private DecimalField fieldCLICLS = null;
    private CharacterField fieldCLASE = null;
    private DecimalField fieldDATTCNX = null;
    private CharacterField fieldTIPCON = null;
    private DecimalField fieldDATCON = null;
    private DecimalField fieldFECMOD = null;
    private DecimalField fieldFECOPE = null;
    private CharacterField fieldCTCCTA = null;
    private DecimalField fieldFECVAL = null;
    private DecimalField fieldFECVTO = null;
    private CharacterField fieldDATREN = null;
    private DecimalField fieldDATDIV = null;
    private CharacterField fieldDIVNOM = null;
    private DecimalField fieldDATMNT = null;
    private DecimalField fieldDATACT = null;
    private CharacterField fieldDATDPV = null;
    private DecimalField fieldDATTDP = null;
    private CharacterField fieldTIPDEP = null;
    private CharacterField fieldREFERE = null;
    private DecimalField fieldDATCOM = null;
    private DecimalField fieldDATPRC = null;
    private CharacterField fieldDATOBS = null;

    /**
     * Constructor for DATFIDFMMessage.
     */
    public DATFIDFMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 782;
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
        fields[12] = fieldCODFI
                = new CharacterField(message, HEADERSIZE + 186, 4, "CODFI");
        fields[13] = fieldFIDNOM
                = new CharacterField(message, HEADERSIZE + 190, 40, "FIDNOM");
        fields[14] = fieldFIDTXT
                = new CharacterField(message, HEADERSIZE + 230, 14, "FIDTXT");
        fields[15] = fieldDATCLI
                = new DecimalField(message, HEADERSIZE + 244, 8, 0, "DATCLI");
        fields[16] = fieldNOMBRE
                = new CharacterField(message, HEADERSIZE + 252, 50, "NOMBRE");
        fields[17] = fieldCLINIF
                = new CharacterField(message, HEADERSIZE + 302, 12, "CLINIF");
        fields[18] = fieldCLICLS
                = new DecimalField(message, HEADERSIZE + 314, 3, 0, "CLICLS");
        fields[19] = fieldCLASE
                = new CharacterField(message, HEADERSIZE + 317, 30, "CLASE");
        fields[20] = fieldDATTCNX
                = new DecimalField(message, HEADERSIZE + 347, 4, 0, "DATTCNX");
        fields[21] = fieldTIPCON
                = new CharacterField(message, HEADERSIZE + 351, 30, "TIPCON");
        fields[22] = fieldDATCON
                = new DecimalField(message, HEADERSIZE + 381, 9, 0, "DATCON");
        fields[23] = fieldFECMOD
                = new DecimalField(message, HEADERSIZE + 390, 7, 0, "FECMOD");
        fields[24] = fieldFECOPE
                = new DecimalField(message, HEADERSIZE + 397, 7, 0, "FECOPE");
        fields[25] = fieldCTCCTA
                = new CharacterField(message, HEADERSIZE + 404, 20, "CTCCTA");
        fields[26] = fieldFECVAL
                = new DecimalField(message, HEADERSIZE + 424, 7, 0, "FECVAL");
        fields[27] = fieldFECVTO
                = new DecimalField(message, HEADERSIZE + 431, 7, 0, "FECVTO");
        fields[28] = fieldDATREN
                = new CharacterField(message, HEADERSIZE + 438, 1, "DATREN");
        fields[29] = fieldDATDIV
                = new DecimalField(message, HEADERSIZE + 439, 4, 0, "DATDIV");
        fields[30] = fieldDIVNOM
                = new CharacterField(message, HEADERSIZE + 443, 40, "DIVNOM");
        fields[31] = fieldDATMNT
                = new DecimalField(message, HEADERSIZE + 483, 16, 2, "DATMNT");
        fields[32] = fieldDATACT
                = new DecimalField(message, HEADERSIZE + 499, 16, 2, "DATACT");
        fields[33] = fieldDATDPV
                = new CharacterField(message, HEADERSIZE + 515, 1, "DATDPV");
        fields[34] = fieldDATTDP
                = new DecimalField(message, HEADERSIZE + 516, 3, 0, "DATTDP");
        fields[35] = fieldTIPDEP
                = new CharacterField(message, HEADERSIZE + 519, 30, "TIPDEP");
        fields[36] = fieldREFERE
                = new CharacterField(message, HEADERSIZE + 549, 10, "REFERE");
        fields[37] = fieldDATCOM
                = new DecimalField(message, HEADERSIZE + 559, 12, 2, "DATCOM");
        fields[38] = fieldDATPRC
                = new DecimalField(message, HEADERSIZE + 571, 11, 6, "DATPRC");
        fields[39] = fieldDATOBS
                = new CharacterField(message, HEADERSIZE + 582, 200, "DATOBS");

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
     * Set field CODFI using a String value.
     */
    public void setCODFI(String newvalue) {
        fieldCODFI.setString(newvalue);
    }

    /**
     * Get value of field CODFI as a String.
     */
    public String getCODFI() {
        return fieldCODFI.getString();
    }

    /**
     * Set field FIDNOM using a String value.
     */
    public void setFIDNOM(String newvalue) {
        fieldFIDNOM.setString(newvalue);
    }

    /**
     * Get value of field FIDNOM as a String.
     */
    public String getFIDNOM() {
        return fieldFIDNOM.getString();
    }

    /**
     * Set field FIDTXT using a String value.
     */
    public void setFIDTXT(String newvalue) {
        fieldFIDTXT.setString(newvalue);
    }

    /**
     * Get value of field FIDTXT as a String.
     */
    public String getFIDTXT() {
        return fieldFIDTXT.getString();
    }

    /**
     * Set field DATCLI using a String value.
     */
    public void setDATCLI(String newvalue) {
        fieldDATCLI.setString(newvalue);
    }

    /**
     * Get value of field DATCLI as a String.
     */
    public String getDATCLI() {
        return fieldDATCLI.getString();
    }

    /**
     * Set numeric field DATCLI using a BigDecimal value.
     */
    public void setDATCLI(BigDecimal newvalue) {
        fieldDATCLI.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DATCLI as a BigDecimal.
     */
    public BigDecimal getBigDecimalDATCLI() {
        return fieldDATCLI.getBigDecimal();
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
     * Set field CLICLS using a String value.
     */
    public void setCLICLS(String newvalue) {
        fieldCLICLS.setString(newvalue);
    }

    /**
     * Get value of field CLICLS as a String.
     */
    public String getCLICLS() {
        return fieldCLICLS.getString();
    }

    /**
     * Set numeric field CLICLS using a BigDecimal value.
     */
    public void setCLICLS(BigDecimal newvalue) {
        fieldCLICLS.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CLICLS as a BigDecimal.
     */
    public BigDecimal getBigDecimalCLICLS() {
        return fieldCLICLS.getBigDecimal();
    }

    /**
     * Set field CLASE using a String value.
     */
    public void setCLASE(String newvalue) {
        fieldCLASE.setString(newvalue);
    }

    /**
     * Get value of field CLASE as a String.
     */
    public String getCLASE() {
        return fieldCLASE.getString();
    }

    /**
     * Set field DATTCNX using a String value.
     */
    public void setDATTCNX(String newvalue) {
        fieldDATTCNX.setString(newvalue);
    }

    /**
     * Get value of field DATTCNX as a String.
     */
    public String getDATTCNX() {
        return fieldDATTCNX.getString();
    }

    /**
     * Set numeric field DATTCNX using a BigDecimal value.
     */
    public void setDATTCNX(BigDecimal newvalue) {
        fieldDATTCNX.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DATTCNX as a BigDecimal.
     */
    public BigDecimal getBigDecimalDATTCNX() {
        return fieldDATTCNX.getBigDecimal();
    }

    /**
     * Set field TIPCON using a String value.
     */
    public void setTIPCON(String newvalue) {
        fieldTIPCON.setString(newvalue);
    }

    /**
     * Get value of field TIPCON as a String.
     */
    public String getTIPCON() {
        return fieldTIPCON.getString();
    }

    /**
     * Set field DATCON using a String value.
     */
    public void setDATCON(String newvalue) {
        fieldDATCON.setString(newvalue);
    }

    /**
     * Get value of field DATCON as a String.
     */
    public String getDATCON() {
        return fieldDATCON.getString();
    }

    /**
     * Set numeric field DATCON using a BigDecimal value.
     */
    public void setDATCON(BigDecimal newvalue) {
        fieldDATCON.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DATCON as a BigDecimal.
     */
    public BigDecimal getBigDecimalDATCON() {
        return fieldDATCON.getBigDecimal();
    }

    /**
     * Set field FECMOD using a String value.
     */
    public void setFECMOD(String newvalue) {
        fieldFECMOD.setString(newvalue);
    }

    /**
     * Get value of field FECMOD as a String.
     */
    public String getFECMOD() {
        return fieldFECMOD.getString();
    }

    /**
     * Set numeric field FECMOD using a BigDecimal value.
     */
    public void setFECMOD(BigDecimal newvalue) {
        fieldFECMOD.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECMOD as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECMOD() {
        return fieldFECMOD.getBigDecimal();
    }

    /**
     * Set field FECOPE using a String value.
     */
    public void setFECOPE(String newvalue) {
        fieldFECOPE.setString(newvalue);
    }

    /**
     * Get value of field FECOPE as a String.
     */
    public String getFECOPE() {
        return fieldFECOPE.getString();
    }

    /**
     * Set numeric field FECOPE using a BigDecimal value.
     */
    public void setFECOPE(BigDecimal newvalue) {
        fieldFECOPE.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECOPE as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECOPE() {
        return fieldFECOPE.getBigDecimal();
    }

    /**
     * Set field CTCCTA using a String value.
     */
    public void setCTCCTA(String newvalue) {
        fieldCTCCTA.setString(newvalue);
    }

    /**
     * Get value of field CTCCTA as a String.
     */
    public String getCTCCTA() {
        return fieldCTCCTA.getString();
    }

    /**
     * Set field FECVAL using a String value.
     */
    public void setFECVAL(String newvalue) {
        fieldFECVAL.setString(newvalue);
    }

    /**
     * Get value of field FECVAL as a String.
     */
    public String getFECVAL() {
        return fieldFECVAL.getString();
    }

    /**
     * Set numeric field FECVAL using a BigDecimal value.
     */
    public void setFECVAL(BigDecimal newvalue) {
        fieldFECVAL.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECVAL as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECVAL() {
        return fieldFECVAL.getBigDecimal();
    }

    /**
     * Set field FECVTO using a String value.
     */
    public void setFECVTO(String newvalue) {
        fieldFECVTO.setString(newvalue);
    }

    /**
     * Get value of field FECVTO as a String.
     */
    public String getFECVTO() {
        return fieldFECVTO.getString();
    }

    /**
     * Set numeric field FECVTO using a BigDecimal value.
     */
    public void setFECVTO(BigDecimal newvalue) {
        fieldFECVTO.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECVTO as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECVTO() {
        return fieldFECVTO.getBigDecimal();
    }

    /**
     * Set field DATREN using a String value.
     */
    public void setDATREN(String newvalue) {
        fieldDATREN.setString(newvalue);
    }

    /**
     * Get value of field DATREN as a String.
     */
    public String getDATREN() {
        return fieldDATREN.getString();
    }

    /**
     * Set field DATDIV using a String value.
     */
    public void setDATDIV(String newvalue) {
        fieldDATDIV.setString(newvalue);
    }

    /**
     * Get value of field DATDIV as a String.
     */
    public String getDATDIV() {
        return fieldDATDIV.getString();
    }

    /**
     * Set numeric field DATDIV using a BigDecimal value.
     */
    public void setDATDIV(BigDecimal newvalue) {
        fieldDATDIV.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DATDIV as a BigDecimal.
     */
    public BigDecimal getBigDecimalDATDIV() {
        return fieldDATDIV.getBigDecimal();
    }

    /**
     * Set field DIVNOM using a String value.
     */
    public void setDIVNOM(String newvalue) {
        fieldDIVNOM.setString(newvalue);
    }

    /**
     * Get value of field DIVNOM as a String.
     */
    public String getDIVNOM() {
        return fieldDIVNOM.getString();
    }

    /**
     * Set field DATMNT using a String value.
     */
    public void setDATMNT(String newvalue) {
        fieldDATMNT.setString(newvalue);
    }

    /**
     * Get value of field DATMNT as a String.
     */
    public String getDATMNT() {
        return fieldDATMNT.getString();
    }

    /**
     * Set numeric field DATMNT using a BigDecimal value.
     */
    public void setDATMNT(BigDecimal newvalue) {
        fieldDATMNT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DATMNT as a BigDecimal.
     */
    public BigDecimal getBigDecimalDATMNT() {
        return fieldDATMNT.getBigDecimal();
    }

    /**
     * Set field DATACT using a String value.
     */
    public void setDATACT(String newvalue) {
        fieldDATACT.setString(newvalue);
    }

    /**
     * Get value of field DATACT as a String.
     */
    public String getDATACT() {
        return fieldDATACT.getString();
    }

    /**
     * Set numeric field DATACT using a BigDecimal value.
     */
    public void setDATACT(BigDecimal newvalue) {
        fieldDATACT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DATACT as a BigDecimal.
     */
    public BigDecimal getBigDecimalDATACT() {
        return fieldDATACT.getBigDecimal();
    }

    /**
     * Set field DATDPV using a String value.
     */
    public void setDATDPV(String newvalue) {
        fieldDATDPV.setString(newvalue);
    }

    /**
     * Get value of field DATDPV as a String.
     */
    public String getDATDPV() {
        return fieldDATDPV.getString();
    }

    /**
     * Set field DATTDP using a String value.
     */
    public void setDATTDP(String newvalue) {
        fieldDATTDP.setString(newvalue);
    }

    /**
     * Get value of field DATTDP as a String.
     */
    public String getDATTDP() {
        return fieldDATTDP.getString();
    }

    /**
     * Set numeric field DATTDP using a BigDecimal value.
     */
    public void setDATTDP(BigDecimal newvalue) {
        fieldDATTDP.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DATTDP as a BigDecimal.
     */
    public BigDecimal getBigDecimalDATTDP() {
        return fieldDATTDP.getBigDecimal();
    }

    /**
     * Set field TIPDEP using a String value.
     */
    public void setTIPDEP(String newvalue) {
        fieldTIPDEP.setString(newvalue);
    }

    /**
     * Get value of field TIPDEP as a String.
     */
    public String getTIPDEP() {
        return fieldTIPDEP.getString();
    }

    /**
     * Set field REFERE using a String value.
     */
    public void setREFERE(String newvalue) {
        fieldREFERE.setString(newvalue);
    }

    /**
     * Get value of field REFERE as a String.
     */
    public String getREFERE() {
        return fieldREFERE.getString();
    }

    /**
     * Set field DATCOM using a String value.
     */
    public void setDATCOM(String newvalue) {
        fieldDATCOM.setString(newvalue);
    }

    /**
     * Get value of field DATCOM as a String.
     */
    public String getDATCOM() {
        return fieldDATCOM.getString();
    }

    /**
     * Set numeric field DATCOM using a BigDecimal value.
     */
    public void setDATCOM(BigDecimal newvalue) {
        fieldDATCOM.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DATCOM as a BigDecimal.
     */
    public BigDecimal getBigDecimalDATCOM() {
        return fieldDATCOM.getBigDecimal();
    }

    /**
     * Set field DATPRC using a String value.
     */
    public void setDATPRC(String newvalue) {
        fieldDATPRC.setString(newvalue);
    }

    /**
     * Get value of field DATPRC as a String.
     */
    public String getDATPRC() {
        return fieldDATPRC.getString();
    }

    /**
     * Set numeric field DATPRC using a BigDecimal value.
     */
    public void setDATPRC(BigDecimal newvalue) {
        fieldDATPRC.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DATPRC as a BigDecimal.
     */
    public BigDecimal getBigDecimalDATPRC() {
        return fieldDATPRC.getBigDecimal();
    }

    /**
     * Set field DATOBS using a String value.
     */
    public void setDATOBS(String newvalue) {
        fieldDATOBS.setString(newvalue);
    }

    /**
     * Get value of field DATOBS as a String.
     */
    public String getDATOBS() {
        return fieldDATOBS.getString();
    }

}
