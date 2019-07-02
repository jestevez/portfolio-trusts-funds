package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from VAR150FM physical file
 * definition.
 * 
* File level identifier is 1140216191252. Record format level identifier is
 * 4A971C5EA3D7B.
 */
public class VAR150FMMessage extends MessageRecord {

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
        "VLOCOA",
        "FECINI",
        "BASEDI",
        "BASCAL",
        "VLONOM",
        "VLOCON",
        "NOMGRU",
        "VLOISI",
        "AUVNSI",
        "VLOCAT",
        "VLOMAM",
        "VLOFIS",
        "NOMEMI",
        "VLOSE1",
        "VLOUDE",
        "VLOUCA",
        "VLOUNI",
        "VLOTAS",
        "VLODIV",
        "DIVNOM",
        "INDIMD",
        "INDTOD",
        "TOTPAG",
        "SEL",
        "INVVAL",
        "INVINI",
        "INVVTO",
        "INVVNO",
        "INVPOP",
        "INVCLI",
        "INVNOP",
        "INVEMP",
        "INVDEL",
        "FECPAG",
        "MONTOP",
        "FECCOB",
        "VENCID",
        "PAGADO",
        "CTLFEC",
        "CTLMNT",
        "CTLCBR",
        "COBRAD"
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
        "VLOCOA",
        "FECINI",
        "BASEDI",
        "BASCAL",
        "VLONOM",
        "VLOCON",
        "NOMGRU",
        "VLOISI",
        "AUVNSI",
        "VLOCAT",
        "VLOMAM",
        "VLOFIS",
        "NOMEMI",
        "VLOSE1",
        "VLOUDE",
        "VLOUCA",
        "VLOUNI",
        "VLOTAS",
        "VLODIV",
        "DIVNOM",
        "INDIMD",
        "INDTOD",
        "TOTPAG",
        "SEL",
        "INVVAL",
        "INVINI",
        "INVVTO",
        "INVVNO",
        "INVPOP",
        "INVCLI",
        "INVNOP",
        "INVEMP",
        "INVDEL",
        "FECPAG",
        "MONTOP",
        "FECCOB",
        "VENCID",
        "PAGADO",
        "CTLFEC",
        "CTLMNT",
        "CTLCBR",
        "COBRAD"
    };
    final static String fid = "1140216191252";
    final static String rid = "4A971C5EA3D7B";
    final static String fmtname = "VAR150FM";
    final int FIELDCOUNT = 54;
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
    private CharacterField fieldVLOCOA = null;
    private DecimalField fieldFECINI = null;
    private DecimalField fieldBASEDI = null;
    private DecimalField fieldBASCAL = null;
    private CharacterField fieldVLONOM = null;
    private DecimalField fieldVLOCON = null;
    private CharacterField fieldNOMGRU = null;
    private CharacterField fieldVLOISI = null;
    private DecimalField fieldAUVNSI = null;
    private CharacterField fieldVLOCAT = null;
    private CharacterField fieldVLOMAM = null;
    private DecimalField fieldVLOFIS = null;
    private CharacterField fieldNOMEMI = null;
    private DecimalField fieldVLOSE1 = null;
    private DecimalField fieldVLOUDE = null;
    private DecimalField fieldVLOUCA = null;
    private DecimalField fieldVLOUNI = null;
    private DecimalField fieldVLOTAS = null;
    private DecimalField fieldVLODIV = null;
    private CharacterField fieldDIVNOM = null;
    private DecimalField fieldINDIMD = null;
    private DecimalField fieldINDTOD = null;
    private DecimalField fieldTOTPAG = null;
    private CharacterField fieldSEL = null;
    private CharacterField fieldINVVAL = null;
    private DecimalField fieldINVINI = null;
    private DecimalField fieldINVVTO = null;
    private DecimalField fieldINVVNO = null;
    private DecimalField fieldINVPOP = null;
    private DecimalField fieldINVCLI = null;
    private DecimalField fieldINVNOP = null;
    private CharacterField fieldINVEMP = null;
    private CharacterField fieldINVDEL = null;
    private DecimalField fieldFECPAG = null;
    private DecimalField fieldMONTOP = null;
    private DecimalField fieldFECCOB = null;
    private CharacterField fieldVENCID = null;
    private CharacterField fieldPAGADO = null;
    private DecimalField fieldCTLFEC = null;
    private DecimalField fieldCTLMNT = null;
    private DecimalField fieldCTLCBR = null;
    private CharacterField fieldCOBRAD = null;

    /**
     * Constructor for VAR150FMMessage.
     */
    public VAR150FMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 644;
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
        fields[12] = fieldVLOCOA
                = new CharacterField(message, HEADERSIZE + 186, 12, "VLOCOA");
        fields[13] = fieldFECINI
                = new DecimalField(message, HEADERSIZE + 198, 7, 0, "FECINI");
        fields[14] = fieldBASEDI
                = new DecimalField(message, HEADERSIZE + 205, 2, 0, "BASEDI");
        fields[15] = fieldBASCAL
                = new DecimalField(message, HEADERSIZE + 207, 2, 0, "BASCAL");
        fields[16] = fieldVLONOM
                = new CharacterField(message, HEADERSIZE + 209, 40, "VLONOM");
        fields[17] = fieldVLOCON
                = new DecimalField(message, HEADERSIZE + 249, 11, 0, "VLOCON");
        fields[18] = fieldNOMGRU
                = new CharacterField(message, HEADERSIZE + 260, 40, "NOMGRU");
        fields[19] = fieldVLOISI
                = new CharacterField(message, HEADERSIZE + 300, 12, "VLOISI");
        fields[20] = fieldAUVNSI
                = new DecimalField(message, HEADERSIZE + 312, 3, 0, "AUVNSI");
        fields[21] = fieldVLOCAT
                = new CharacterField(message, HEADERSIZE + 315, 5, "VLOCAT");
        fields[22] = fieldVLOMAM
                = new CharacterField(message, HEADERSIZE + 320, 1, "VLOMAM");
        fields[23] = fieldVLOFIS
                = new DecimalField(message, HEADERSIZE + 321, 8, 0, "VLOFIS");
        fields[24] = fieldNOMEMI
                = new CharacterField(message, HEADERSIZE + 329, 40, "NOMEMI");
        fields[25] = fieldVLOSE1
                = new DecimalField(message, HEADERSIZE + 369, 17, 2, "VLOSE1");
        fields[26] = fieldVLOUDE
                = new DecimalField(message, HEADERSIZE + 386, 7, 0, "VLOUDE");
        fields[27] = fieldVLOUCA
                = new DecimalField(message, HEADERSIZE + 393, 7, 0, "VLOUCA");
        fields[28] = fieldVLOUNI
                = new DecimalField(message, HEADERSIZE + 400, 15, 2, "VLOUNI");
        fields[29] = fieldVLOTAS
                = new DecimalField(message, HEADERSIZE + 415, 11, 6, "VLOTAS");
        fields[30] = fieldVLODIV
                = new DecimalField(message, HEADERSIZE + 426, 4, 0, "VLODIV");
        fields[31] = fieldDIVNOM
                = new CharacterField(message, HEADERSIZE + 430, 40, "DIVNOM");
        fields[32] = fieldINDIMD
                = new DecimalField(message, HEADERSIZE + 470, 17, 2, "INDIMD");
        fields[33] = fieldINDTOD
                = new DecimalField(message, HEADERSIZE + 487, 7, 0, "INDTOD");
        fields[34] = fieldTOTPAG
                = new DecimalField(message, HEADERSIZE + 494, 7, 0, "TOTPAG");
        fields[35] = fieldSEL
                = new CharacterField(message, HEADERSIZE + 501, 1, "SEL");
        fields[36] = fieldINVVAL
                = new CharacterField(message, HEADERSIZE + 502, 12, "INVVAL");
        fields[37] = fieldINVINI
                = new DecimalField(message, HEADERSIZE + 514, 7, 0, "INVINI");
        fields[38] = fieldINVVTO
                = new DecimalField(message, HEADERSIZE + 521, 7, 0, "INVVTO");
        fields[39] = fieldINVVNO
                = new DecimalField(message, HEADERSIZE + 528, 17, 2, "INVVNO");
        fields[40] = fieldINVPOP
                = new DecimalField(message, HEADERSIZE + 545, 11, 6, "INVPOP");
        fields[41] = fieldINVCLI
                = new DecimalField(message, HEADERSIZE + 556, 8, 0, "INVCLI");
        fields[42] = fieldINVNOP
                = new DecimalField(message, HEADERSIZE + 564, 11, 0, "INVNOP");
        fields[43] = fieldINVEMP
                = new CharacterField(message, HEADERSIZE + 575, 2, "INVEMP");
        fields[44] = fieldINVDEL
                = new CharacterField(message, HEADERSIZE + 577, 2, "INVDEL");
        fields[45] = fieldFECPAG
                = new DecimalField(message, HEADERSIZE + 579, 7, 0, "FECPAG");
        fields[46] = fieldMONTOP
                = new DecimalField(message, HEADERSIZE + 586, 17, 2, "MONTOP");
        fields[47] = fieldFECCOB
                = new DecimalField(message, HEADERSIZE + 603, 7, 0, "FECCOB");
        fields[48] = fieldVENCID
                = new CharacterField(message, HEADERSIZE + 610, 1, "VENCID");
        fields[49] = fieldPAGADO
                = new CharacterField(message, HEADERSIZE + 611, 1, "PAGADO");
        fields[50] = fieldCTLFEC
                = new DecimalField(message, HEADERSIZE + 612, 7, 0, "CTLFEC");
        fields[51] = fieldCTLMNT
                = new DecimalField(message, HEADERSIZE + 619, 17, 2, "CTLMNT");
        fields[52] = fieldCTLCBR
                = new DecimalField(message, HEADERSIZE + 636, 7, 0, "CTLCBR");
        fields[53] = fieldCOBRAD
                = new CharacterField(message, HEADERSIZE + 643, 1, "COBRAD");

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
     * Set field VLOCOA using a String value.
     */
    public void setVLOCOA(String newvalue) {
        fieldVLOCOA.setString(newvalue);
    }

    /**
     * Get value of field VLOCOA as a String.
     */
    public String getVLOCOA() {
        return fieldVLOCOA.getString();
    }

    /**
     * Set field FECINI using a String value.
     */
    public void setFECINI(String newvalue) {
        fieldFECINI.setString(newvalue);
    }

    /**
     * Get value of field FECINI as a String.
     */
    public String getFECINI() {
        return fieldFECINI.getString();
    }

    /**
     * Set numeric field FECINI using a BigDecimal value.
     */
    public void setFECINI(BigDecimal newvalue) {
        fieldFECINI.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECINI as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECINI() {
        return fieldFECINI.getBigDecimal();
    }

    /**
     * Set field BASEDI using a String value.
     */
    public void setBASEDI(String newvalue) {
        fieldBASEDI.setString(newvalue);
    }

    /**
     * Get value of field BASEDI as a String.
     */
    public String getBASEDI() {
        return fieldBASEDI.getString();
    }

    /**
     * Set numeric field BASEDI using a BigDecimal value.
     */
    public void setBASEDI(BigDecimal newvalue) {
        fieldBASEDI.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field BASEDI as a BigDecimal.
     */
    public BigDecimal getBigDecimalBASEDI() {
        return fieldBASEDI.getBigDecimal();
    }

    /**
     * Set field BASCAL using a String value.
     */
    public void setBASCAL(String newvalue) {
        fieldBASCAL.setString(newvalue);
    }

    /**
     * Get value of field BASCAL as a String.
     */
    public String getBASCAL() {
        return fieldBASCAL.getString();
    }

    /**
     * Set numeric field BASCAL using a BigDecimal value.
     */
    public void setBASCAL(BigDecimal newvalue) {
        fieldBASCAL.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field BASCAL as a BigDecimal.
     */
    public BigDecimal getBigDecimalBASCAL() {
        return fieldBASCAL.getBigDecimal();
    }

    /**
     * Set field VLONOM using a String value.
     */
    public void setVLONOM(String newvalue) {
        fieldVLONOM.setString(newvalue);
    }

    /**
     * Get value of field VLONOM as a String.
     */
    public String getVLONOM() {
        return fieldVLONOM.getString();
    }

    /**
     * Set field VLOCON using a String value.
     */
    public void setVLOCON(String newvalue) {
        fieldVLOCON.setString(newvalue);
    }

    /**
     * Get value of field VLOCON as a String.
     */
    public String getVLOCON() {
        return fieldVLOCON.getString();
    }

    /**
     * Set numeric field VLOCON using a BigDecimal value.
     */
    public void setVLOCON(BigDecimal newvalue) {
        fieldVLOCON.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field VLOCON as a BigDecimal.
     */
    public BigDecimal getBigDecimalVLOCON() {
        return fieldVLOCON.getBigDecimal();
    }

    /**
     * Set field NOMGRU using a String value.
     */
    public void setNOMGRU(String newvalue) {
        fieldNOMGRU.setString(newvalue);
    }

    /**
     * Get value of field NOMGRU as a String.
     */
    public String getNOMGRU() {
        return fieldNOMGRU.getString();
    }

    /**
     * Set field VLOISI using a String value.
     */
    public void setVLOISI(String newvalue) {
        fieldVLOISI.setString(newvalue);
    }

    /**
     * Get value of field VLOISI as a String.
     */
    public String getVLOISI() {
        return fieldVLOISI.getString();
    }

    /**
     * Set field AUVNSI using a String value.
     */
    public void setAUVNSI(String newvalue) {
        fieldAUVNSI.setString(newvalue);
    }

    /**
     * Get value of field AUVNSI as a String.
     */
    public String getAUVNSI() {
        return fieldAUVNSI.getString();
    }

    /**
     * Set numeric field AUVNSI using a BigDecimal value.
     */
    public void setAUVNSI(BigDecimal newvalue) {
        fieldAUVNSI.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field AUVNSI as a BigDecimal.
     */
    public BigDecimal getBigDecimalAUVNSI() {
        return fieldAUVNSI.getBigDecimal();
    }

    /**
     * Set field VLOCAT using a String value.
     */
    public void setVLOCAT(String newvalue) {
        fieldVLOCAT.setString(newvalue);
    }

    /**
     * Get value of field VLOCAT as a String.
     */
    public String getVLOCAT() {
        return fieldVLOCAT.getString();
    }

    /**
     * Set field VLOMAM using a String value.
     */
    public void setVLOMAM(String newvalue) {
        fieldVLOMAM.setString(newvalue);
    }

    /**
     * Get value of field VLOMAM as a String.
     */
    public String getVLOMAM() {
        return fieldVLOMAM.getString();
    }

    /**
     * Set field VLOFIS using a String value.
     */
    public void setVLOFIS(String newvalue) {
        fieldVLOFIS.setString(newvalue);
    }

    /**
     * Get value of field VLOFIS as a String.
     */
    public String getVLOFIS() {
        return fieldVLOFIS.getString();
    }

    /**
     * Set numeric field VLOFIS using a BigDecimal value.
     */
    public void setVLOFIS(BigDecimal newvalue) {
        fieldVLOFIS.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field VLOFIS as a BigDecimal.
     */
    public BigDecimal getBigDecimalVLOFIS() {
        return fieldVLOFIS.getBigDecimal();
    }

    /**
     * Set field NOMEMI using a String value.
     */
    public void setNOMEMI(String newvalue) {
        fieldNOMEMI.setString(newvalue);
    }

    /**
     * Get value of field NOMEMI as a String.
     */
    public String getNOMEMI() {
        return fieldNOMEMI.getString();
    }

    /**
     * Set field VLOSE1 using a String value.
     */
    public void setVLOSE1(String newvalue) {
        fieldVLOSE1.setString(newvalue);
    }

    /**
     * Get value of field VLOSE1 as a String.
     */
    public String getVLOSE1() {
        return fieldVLOSE1.getString();
    }

    /**
     * Set numeric field VLOSE1 using a BigDecimal value.
     */
    public void setVLOSE1(BigDecimal newvalue) {
        fieldVLOSE1.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field VLOSE1 as a BigDecimal.
     */
    public BigDecimal getBigDecimalVLOSE1() {
        return fieldVLOSE1.getBigDecimal();
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

    /**
     * Set field VLOUNI using a String value.
     */
    public void setVLOUNI(String newvalue) {
        fieldVLOUNI.setString(newvalue);
    }

    /**
     * Get value of field VLOUNI as a String.
     */
    public String getVLOUNI() {
        return fieldVLOUNI.getString();
    }

    /**
     * Set numeric field VLOUNI using a BigDecimal value.
     */
    public void setVLOUNI(BigDecimal newvalue) {
        fieldVLOUNI.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field VLOUNI as a BigDecimal.
     */
    public BigDecimal getBigDecimalVLOUNI() {
        return fieldVLOUNI.getBigDecimal();
    }

    /**
     * Set field VLOTAS using a String value.
     */
    public void setVLOTAS(String newvalue) {
        fieldVLOTAS.setString(newvalue);
    }

    /**
     * Get value of field VLOTAS as a String.
     */
    public String getVLOTAS() {
        return fieldVLOTAS.getString();
    }

    /**
     * Set numeric field VLOTAS using a BigDecimal value.
     */
    public void setVLOTAS(BigDecimal newvalue) {
        fieldVLOTAS.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field VLOTAS as a BigDecimal.
     */
    public BigDecimal getBigDecimalVLOTAS() {
        return fieldVLOTAS.getBigDecimal();
    }

    /**
     * Set field VLODIV using a String value.
     */
    public void setVLODIV(String newvalue) {
        fieldVLODIV.setString(newvalue);
    }

    /**
     * Get value of field VLODIV as a String.
     */
    public String getVLODIV() {
        return fieldVLODIV.getString();
    }

    /**
     * Set numeric field VLODIV using a BigDecimal value.
     */
    public void setVLODIV(BigDecimal newvalue) {
        fieldVLODIV.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field VLODIV as a BigDecimal.
     */
    public BigDecimal getBigDecimalVLODIV() {
        return fieldVLODIV.getBigDecimal();
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
     * Set field INDIMD using a String value.
     */
    public void setINDIMD(String newvalue) {
        fieldINDIMD.setString(newvalue);
    }

    /**
     * Get value of field INDIMD as a String.
     */
    public String getINDIMD() {
        return fieldINDIMD.getString();
    }

    /**
     * Set numeric field INDIMD using a BigDecimal value.
     */
    public void setINDIMD(BigDecimal newvalue) {
        fieldINDIMD.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INDIMD as a BigDecimal.
     */
    public BigDecimal getBigDecimalINDIMD() {
        return fieldINDIMD.getBigDecimal();
    }

    /**
     * Set field INDTOD using a String value.
     */
    public void setINDTOD(String newvalue) {
        fieldINDTOD.setString(newvalue);
    }

    /**
     * Get value of field INDTOD as a String.
     */
    public String getINDTOD() {
        return fieldINDTOD.getString();
    }

    /**
     * Set numeric field INDTOD using a BigDecimal value.
     */
    public void setINDTOD(BigDecimal newvalue) {
        fieldINDTOD.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INDTOD as a BigDecimal.
     */
    public BigDecimal getBigDecimalINDTOD() {
        return fieldINDTOD.getBigDecimal();
    }

    /**
     * Set field TOTPAG using a String value.
     */
    public void setTOTPAG(String newvalue) {
        fieldTOTPAG.setString(newvalue);
    }

    /**
     * Get value of field TOTPAG as a String.
     */
    public String getTOTPAG() {
        return fieldTOTPAG.getString();
    }

    /**
     * Set numeric field TOTPAG using a BigDecimal value.
     */
    public void setTOTPAG(BigDecimal newvalue) {
        fieldTOTPAG.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field TOTPAG as a BigDecimal.
     */
    public BigDecimal getBigDecimalTOTPAG() {
        return fieldTOTPAG.getBigDecimal();
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
     * Set field INVINI using a String value.
     */
    public void setINVINI(String newvalue) {
        fieldINVINI.setString(newvalue);
    }

    /**
     * Get value of field INVINI as a String.
     */
    public String getINVINI() {
        return fieldINVINI.getString();
    }

    /**
     * Set numeric field INVINI using a BigDecimal value.
     */
    public void setINVINI(BigDecimal newvalue) {
        fieldINVINI.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INVINI as a BigDecimal.
     */
    public BigDecimal getBigDecimalINVINI() {
        return fieldINVINI.getBigDecimal();
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
     * Set field INVCLI using a String value.
     */
    public void setINVCLI(String newvalue) {
        fieldINVCLI.setString(newvalue);
    }

    /**
     * Get value of field INVCLI as a String.
     */
    public String getINVCLI() {
        return fieldINVCLI.getString();
    }

    /**
     * Set numeric field INVCLI using a BigDecimal value.
     */
    public void setINVCLI(BigDecimal newvalue) {
        fieldINVCLI.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field INVCLI as a BigDecimal.
     */
    public BigDecimal getBigDecimalINVCLI() {
        return fieldINVCLI.getBigDecimal();
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
     * Set field INVEMP using a String value.
     */
    public void setINVEMP(String newvalue) {
        fieldINVEMP.setString(newvalue);
    }

    /**
     * Get value of field INVEMP as a String.
     */
    public String getINVEMP() {
        return fieldINVEMP.getString();
    }

    /**
     * Set field INVDEL using a String value.
     */
    public void setINVDEL(String newvalue) {
        fieldINVDEL.setString(newvalue);
    }

    /**
     * Get value of field INVDEL as a String.
     */
    public String getINVDEL() {
        return fieldINVDEL.getString();
    }

    /**
     * Set field FECPAG using a String value.
     */
    public void setFECPAG(String newvalue) {
        fieldFECPAG.setString(newvalue);
    }

    /**
     * Get value of field FECPAG as a String.
     */
    public String getFECPAG() {
        return fieldFECPAG.getString();
    }

    /**
     * Set numeric field FECPAG using a BigDecimal value.
     */
    public void setFECPAG(BigDecimal newvalue) {
        fieldFECPAG.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECPAG as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECPAG() {
        return fieldFECPAG.getBigDecimal();
    }

    /**
     * Set field MONTOP using a String value.
     */
    public void setMONTOP(String newvalue) {
        fieldMONTOP.setString(newvalue);
    }

    /**
     * Get value of field MONTOP as a String.
     */
    public String getMONTOP() {
        return fieldMONTOP.getString();
    }

    /**
     * Set numeric field MONTOP using a BigDecimal value.
     */
    public void setMONTOP(BigDecimal newvalue) {
        fieldMONTOP.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field MONTOP as a BigDecimal.
     */
    public BigDecimal getBigDecimalMONTOP() {
        return fieldMONTOP.getBigDecimal();
    }

    /**
     * Set field FECCOB using a String value.
     */
    public void setFECCOB(String newvalue) {
        fieldFECCOB.setString(newvalue);
    }

    /**
     * Get value of field FECCOB as a String.
     */
    public String getFECCOB() {
        return fieldFECCOB.getString();
    }

    /**
     * Set numeric field FECCOB using a BigDecimal value.
     */
    public void setFECCOB(BigDecimal newvalue) {
        fieldFECCOB.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECCOB as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECCOB() {
        return fieldFECCOB.getBigDecimal();
    }

    /**
     * Set field VENCID using a String value.
     */
    public void setVENCID(String newvalue) {
        fieldVENCID.setString(newvalue);
    }

    /**
     * Get value of field VENCID as a String.
     */
    public String getVENCID() {
        return fieldVENCID.getString();
    }

    /**
     * Set field PAGADO using a String value.
     */
    public void setPAGADO(String newvalue) {
        fieldPAGADO.setString(newvalue);
    }

    /**
     * Get value of field PAGADO as a String.
     */
    public String getPAGADO() {
        return fieldPAGADO.getString();
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
     * Set field COBRAD using a String value.
     */
    public void setCOBRAD(String newvalue) {
        fieldCOBRAD.setString(newvalue);
    }

    /**
     * Get value of field COBRAD as a String.
     */
    public String getCOBRAD() {
        return fieldCOBRAD.getString();
    }

}