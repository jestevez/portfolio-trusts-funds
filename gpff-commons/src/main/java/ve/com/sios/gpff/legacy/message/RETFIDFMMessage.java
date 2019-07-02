package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from RETFIDFM physical file
 * definition.
 * 
* File level identifier is 1140212161412. Record format level identifier is
 * 4E6CC610EDDCA.
 */
public class RETFIDFMMessage extends MessageRecord {

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
        "WSCLAV",
        "FIDNOM",
        "FIDTXT",
        "DATCLI",
        "NOMBRE",
        "CLINIX",
        "CLICLS",
        "CLASE",
        "APOTCN",
        "TIPCON",
        "APOCON",
        "FIESP",
        "NFIESP",
        "FECOPE",
        "FECVAL",
        "DATAPO",
        "TIPAPO",
        "NUAPO",
        "RETDIV",
        "DIVNOM",
        "MNTAPO",
        "CODTRA",
        "NOMTRA",
        "APOPRC",
        "APOCOM",
        "RETFPG",
        "RETPAG",
        "OPECTA",
        "USU1",
        "RETOBS",
        "CODFI",
        "FECMOD"
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
        "WSCLAV",
        "FIDNOM",
        "FIDTXT",
        "DATCLI",
        "NOMBRE",
        "CLINIX",
        "CLICLS",
        "CLASE",
        "APOTCN",
        "TIPCON",
        "APOCON",
        "FIESP",
        "NFIESP",
        "FECOPE",
        "FECVAL",
        "DATAPO",
        "TIPAPO",
        "NUAPO",
        "RETDIV",
        "DIVNOM",
        "MNTAPO",
        "CODTRA",
        "NOMTRA",
        "APOPRC",
        "APOCOM",
        "RETFPG",
        "RETPAG",
        "OPECTA",
        "USU1",
        "RETOBS",
        "CODFI",
        "FECMOD"
    };
    final static String fid = "1140212161412";
    final static String rid = "4E6CC610EDDCA";
    final static String fmtname = "RETFIDFM";
    final int FIELDCOUNT = 44;
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
    private CharacterField fieldWSCLAV = null;
    private CharacterField fieldFIDNOM = null;
    private CharacterField fieldFIDTXT = null;
    private DecimalField fieldDATCLI = null;
    private CharacterField fieldNOMBRE = null;
    private CharacterField fieldCLINIX = null;
    private DecimalField fieldCLICLS = null;
    private CharacterField fieldCLASE = null;
    private DecimalField fieldAPOTCN = null;
    private CharacterField fieldTIPCON = null;
    private DecimalField fieldAPOCON = null;
    private CharacterField fieldFIESP = null;
    private CharacterField fieldNFIESP = null;
    private DecimalField fieldFECOPE = null;
    private DecimalField fieldFECVAL = null;
    private DecimalField fieldDATAPO = null;
    private CharacterField fieldTIPAPO = null;
    private DecimalField fieldNUAPO = null;
    private DecimalField fieldRETDIV = null;
    private CharacterField fieldDIVNOM = null;
    private DecimalField fieldMNTAPO = null;
    private DecimalField fieldCODTRA = null;
    private CharacterField fieldNOMTRA = null;
    private DecimalField fieldAPOPRC = null;
    private DecimalField fieldAPOCOM = null;
    private DecimalField fieldRETFPG = null;
    private CharacterField fieldRETPAG = null;
    private CharacterField fieldOPECTA = null;
    private CharacterField fieldUSU1 = null;
    private CharacterField fieldRETOBS = null;
    private CharacterField fieldCODFI = null;
    private DecimalField fieldFECMOD = null;

    /**
     * Constructor for RETFIDFMMessage.
     */
    public RETFIDFMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 889;
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
        fields[12] = fieldWSCLAV
                = new CharacterField(message, HEADERSIZE + 186, 4, "WSCLAV");
        fields[13] = fieldFIDNOM
                = new CharacterField(message, HEADERSIZE + 190, 40, "FIDNOM");
        fields[14] = fieldFIDTXT
                = new CharacterField(message, HEADERSIZE + 230, 14, "FIDTXT");
        fields[15] = fieldDATCLI
                = new DecimalField(message, HEADERSIZE + 244, 8, 0, "DATCLI");
        fields[16] = fieldNOMBRE
                = new CharacterField(message, HEADERSIZE + 252, 50, "NOMBRE");
        fields[17] = fieldCLINIX
                = new CharacterField(message, HEADERSIZE + 302, 12, "CLINIX");
        fields[18] = fieldCLICLS
                = new DecimalField(message, HEADERSIZE + 314, 3, 0, "CLICLS");
        fields[19] = fieldCLASE
                = new CharacterField(message, HEADERSIZE + 317, 30, "CLASE");
        fields[20] = fieldAPOTCN
                = new DecimalField(message, HEADERSIZE + 347, 4, 0, "APOTCN");
        fields[21] = fieldTIPCON
                = new CharacterField(message, HEADERSIZE + 351, 30, "TIPCON");
        fields[22] = fieldAPOCON
                = new DecimalField(message, HEADERSIZE + 381, 9, 0, "APOCON");
        fields[23] = fieldFIESP
                = new CharacterField(message, HEADERSIZE + 390, 12, "FIESP");
        fields[24] = fieldNFIESP
                = new CharacterField(message, HEADERSIZE + 402, 40, "NFIESP");
        fields[25] = fieldFECOPE
                = new DecimalField(message, HEADERSIZE + 442, 7, 0, "FECOPE");
        fields[26] = fieldFECVAL
                = new DecimalField(message, HEADERSIZE + 449, 7, 0, "FECVAL");
        fields[27] = fieldDATAPO
                = new DecimalField(message, HEADERSIZE + 456, 3, 0, "DATAPO");
        fields[28] = fieldTIPAPO
                = new CharacterField(message, HEADERSIZE + 459, 30, "TIPAPO");
        fields[29] = fieldNUAPO
                = new DecimalField(message, HEADERSIZE + 489, 9, 0, "NUAPO");
        fields[30] = fieldRETDIV
                = new DecimalField(message, HEADERSIZE + 498, 4, 0, "RETDIV");
        fields[31] = fieldDIVNOM
                = new CharacterField(message, HEADERSIZE + 502, 40, "DIVNOM");
        fields[32] = fieldMNTAPO
                = new DecimalField(message, HEADERSIZE + 542, 16, 2, "MNTAPO");
        fields[33] = fieldCODTRA
                = new DecimalField(message, HEADERSIZE + 558, 4, 0, "CODTRA");
        fields[34] = fieldNOMTRA
                = new CharacterField(message, HEADERSIZE + 562, 30, "NOMTRA");
        fields[35] = fieldAPOPRC
                = new DecimalField(message, HEADERSIZE + 592, 11, 6, "APOPRC");
        fields[36] = fieldAPOCOM
                = new DecimalField(message, HEADERSIZE + 603, 12, 2, "APOCOM");
        fields[37] = fieldRETFPG
                = new DecimalField(message, HEADERSIZE + 615, 3, 0, "RETFPG");
        fields[38] = fieldRETPAG
                = new CharacterField(message, HEADERSIZE + 618, 30, "RETPAG");
        fields[39] = fieldOPECTA
                = new CharacterField(message, HEADERSIZE + 648, 20, "OPECTA");
        fields[40] = fieldUSU1
                = new CharacterField(message, HEADERSIZE + 668, 10, "USU1");
        fields[41] = fieldRETOBS
                = new CharacterField(message, HEADERSIZE + 678, 200, "RETOBS");
        fields[42] = fieldCODFI
                = new CharacterField(message, HEADERSIZE + 878, 4, "CODFI");
        fields[43] = fieldFECMOD
                = new DecimalField(message, HEADERSIZE + 882, 7, 0, "FECMOD");

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
     * Set field WSCLAV using a String value.
     */
    public void setWSCLAV(String newvalue) {
        fieldWSCLAV.setString(newvalue);
    }

    /**
     * Get value of field WSCLAV as a String.
     */
    public String getWSCLAV() {
        return fieldWSCLAV.getString();
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
     * Set field CLINIX using a String value.
     */
    public void setCLINIX(String newvalue) {
        fieldCLINIX.setString(newvalue);
    }

    /**
     * Get value of field CLINIX as a String.
     */
    public String getCLINIX() {
        return fieldCLINIX.getString();
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
     * Set field APOTCN using a String value.
     */
    public void setAPOTCN(String newvalue) {
        fieldAPOTCN.setString(newvalue);
    }

    /**
     * Get value of field APOTCN as a String.
     */
    public String getAPOTCN() {
        return fieldAPOTCN.getString();
    }

    /**
     * Set numeric field APOTCN using a BigDecimal value.
     */
    public void setAPOTCN(BigDecimal newvalue) {
        fieldAPOTCN.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field APOTCN as a BigDecimal.
     */
    public BigDecimal getBigDecimalAPOTCN() {
        return fieldAPOTCN.getBigDecimal();
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
     * Set field APOCON using a String value.
     */
    public void setAPOCON(String newvalue) {
        fieldAPOCON.setString(newvalue);
    }

    /**
     * Get value of field APOCON as a String.
     */
    public String getAPOCON() {
        return fieldAPOCON.getString();
    }

    /**
     * Set numeric field APOCON using a BigDecimal value.
     */
    public void setAPOCON(BigDecimal newvalue) {
        fieldAPOCON.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field APOCON as a BigDecimal.
     */
    public BigDecimal getBigDecimalAPOCON() {
        return fieldAPOCON.getBigDecimal();
    }

    /**
     * Set field FIESP using a String value.
     */
    public void setFIESP(String newvalue) {
        fieldFIESP.setString(newvalue);
    }

    /**
     * Get value of field FIESP as a String.
     */
    public String getFIESP() {
        return fieldFIESP.getString();
    }

    /**
     * Set field NFIESP using a String value.
     */
    public void setNFIESP(String newvalue) {
        fieldNFIESP.setString(newvalue);
    }

    /**
     * Get value of field NFIESP as a String.
     */
    public String getNFIESP() {
        return fieldNFIESP.getString();
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
     * Set field DATAPO using a String value.
     */
    public void setDATAPO(String newvalue) {
        fieldDATAPO.setString(newvalue);
    }

    /**
     * Get value of field DATAPO as a String.
     */
    public String getDATAPO() {
        return fieldDATAPO.getString();
    }

    /**
     * Set numeric field DATAPO using a BigDecimal value.
     */
    public void setDATAPO(BigDecimal newvalue) {
        fieldDATAPO.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DATAPO as a BigDecimal.
     */
    public BigDecimal getBigDecimalDATAPO() {
        return fieldDATAPO.getBigDecimal();
    }

    /**
     * Set field TIPAPO using a String value.
     */
    public void setTIPAPO(String newvalue) {
        fieldTIPAPO.setString(newvalue);
    }

    /**
     * Get value of field TIPAPO as a String.
     */
    public String getTIPAPO() {
        return fieldTIPAPO.getString();
    }

    /**
     * Set field NUAPO using a String value.
     */
    public void setNUAPO(String newvalue) {
        fieldNUAPO.setString(newvalue);
    }

    /**
     * Get value of field NUAPO as a String.
     */
    public String getNUAPO() {
        return fieldNUAPO.getString();
    }

    /**
     * Set numeric field NUAPO using a BigDecimal value.
     */
    public void setNUAPO(BigDecimal newvalue) {
        fieldNUAPO.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field NUAPO as a BigDecimal.
     */
    public BigDecimal getBigDecimalNUAPO() {
        return fieldNUAPO.getBigDecimal();
    }

    /**
     * Set field RETDIV using a String value.
     */
    public void setRETDIV(String newvalue) {
        fieldRETDIV.setString(newvalue);
    }

    /**
     * Get value of field RETDIV as a String.
     */
    public String getRETDIV() {
        return fieldRETDIV.getString();
    }

    /**
     * Set numeric field RETDIV using a BigDecimal value.
     */
    public void setRETDIV(BigDecimal newvalue) {
        fieldRETDIV.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field RETDIV as a BigDecimal.
     */
    public BigDecimal getBigDecimalRETDIV() {
        return fieldRETDIV.getBigDecimal();
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
     * Set field MNTAPO using a String value.
     */
    public void setMNTAPO(String newvalue) {
        fieldMNTAPO.setString(newvalue);
    }

    /**
     * Get value of field MNTAPO as a String.
     */
    public String getMNTAPO() {
        return fieldMNTAPO.getString();
    }

    /**
     * Set numeric field MNTAPO using a BigDecimal value.
     */
    public void setMNTAPO(BigDecimal newvalue) {
        fieldMNTAPO.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field MNTAPO as a BigDecimal.
     */
    public BigDecimal getBigDecimalMNTAPO() {
        return fieldMNTAPO.getBigDecimal();
    }

    /**
     * Set field CODTRA using a String value.
     */
    public void setCODTRA(String newvalue) {
        fieldCODTRA.setString(newvalue);
    }

    /**
     * Get value of field CODTRA as a String.
     */
    public String getCODTRA() {
        return fieldCODTRA.getString();
    }

    /**
     * Set numeric field CODTRA using a BigDecimal value.
     */
    public void setCODTRA(BigDecimal newvalue) {
        fieldCODTRA.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CODTRA as a BigDecimal.
     */
    public BigDecimal getBigDecimalCODTRA() {
        return fieldCODTRA.getBigDecimal();
    }

    /**
     * Set field NOMTRA using a String value.
     */
    public void setNOMTRA(String newvalue) {
        fieldNOMTRA.setString(newvalue);
    }

    /**
     * Get value of field NOMTRA as a String.
     */
    public String getNOMTRA() {
        return fieldNOMTRA.getString();
    }

    /**
     * Set field APOPRC using a String value.
     */
    public void setAPOPRC(String newvalue) {
        fieldAPOPRC.setString(newvalue);
    }

    /**
     * Get value of field APOPRC as a String.
     */
    public String getAPOPRC() {
        return fieldAPOPRC.getString();
    }

    /**
     * Set numeric field APOPRC using a BigDecimal value.
     */
    public void setAPOPRC(BigDecimal newvalue) {
        fieldAPOPRC.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field APOPRC as a BigDecimal.
     */
    public BigDecimal getBigDecimalAPOPRC() {
        return fieldAPOPRC.getBigDecimal();
    }

    /**
     * Set field APOCOM using a String value.
     */
    public void setAPOCOM(String newvalue) {
        fieldAPOCOM.setString(newvalue);
    }

    /**
     * Get value of field APOCOM as a String.
     */
    public String getAPOCOM() {
        return fieldAPOCOM.getString();
    }

    /**
     * Set numeric field APOCOM using a BigDecimal value.
     */
    public void setAPOCOM(BigDecimal newvalue) {
        fieldAPOCOM.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field APOCOM as a BigDecimal.
     */
    public BigDecimal getBigDecimalAPOCOM() {
        return fieldAPOCOM.getBigDecimal();
    }

    /**
     * Set field RETFPG using a String value.
     */
    public void setRETFPG(String newvalue) {
        fieldRETFPG.setString(newvalue);
    }

    /**
     * Get value of field RETFPG as a String.
     */
    public String getRETFPG() {
        return fieldRETFPG.getString();
    }

    /**
     * Set numeric field RETFPG using a BigDecimal value.
     */
    public void setRETFPG(BigDecimal newvalue) {
        fieldRETFPG.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field RETFPG as a BigDecimal.
     */
    public BigDecimal getBigDecimalRETFPG() {
        return fieldRETFPG.getBigDecimal();
    }

    /**
     * Set field RETPAG using a String value.
     */
    public void setRETPAG(String newvalue) {
        fieldRETPAG.setString(newvalue);
    }

    /**
     * Get value of field RETPAG as a String.
     */
    public String getRETPAG() {
        return fieldRETPAG.getString();
    }

    /**
     * Set field OPECTA using a String value.
     */
    public void setOPECTA(String newvalue) {
        fieldOPECTA.setString(newvalue);
    }

    /**
     * Get value of field OPECTA as a String.
     */
    public String getOPECTA() {
        return fieldOPECTA.getString();
    }

    /**
     * Set field USU1 using a String value.
     */
    public void setUSU1(String newvalue) {
        fieldUSU1.setString(newvalue);
    }

    /**
     * Get value of field USU1 as a String.
     */
    public String getUSU1() {
        return fieldUSU1.getString();
    }

    /**
     * Set field RETOBS using a String value.
     */
    public void setRETOBS(String newvalue) {
        fieldRETOBS.setString(newvalue);
    }

    /**
     * Get value of field RETOBS as a String.
     */
    public String getRETOBS() {
        return fieldRETOBS.getString();
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

}
