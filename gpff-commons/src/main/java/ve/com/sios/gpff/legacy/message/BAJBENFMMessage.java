package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from BAJBENFM physical file
 * definition.
 * 
* File level identifier is 1140322115621. Record format level identifier is
 * 2D2B6878E7486.
 */
public class BAJBENFMMessage extends MessageRecord {

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
        "FIDNOM",
        "CLINIF",
        "FECAP",
        "MOVPGO",
        "TEXTO",
        "NOMBRE",
        "ULTVAL",
        "COTIZA",
        "CLVTOA",
        "CLVTON",
        "CLVTOP",
        "CLVTOG",
        "CLVTOB",
        "BENE",
        "CLVTOD",
        "HMOINT",
        "HMOMNT1",
        "IDBCOM",
        "CHEQUE",
        "IDBCHE"
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
        "FIDNOM",
        "CLINIF",
        "FECAP",
        "MOVPGO",
        "TEXTO",
        "NOMBRE",
        "ULTVAL",
        "COTIZA",
        "CLVTOA",
        "CLVTON",
        "CLVTOP",
        "CLVTOG",
        "CLVTOB",
        "BENE",
        "CLVTOD",
        "HMOINT",
        "HMOMNT1",
        "IDBCOM",
        "CHEQUE",
        "IDBCHE"
    };
    final static String fid = "1140322115621";
    final static String rid = "2D2B6878E7486";
    final static String fmtname = "BAJBENFM";
    final int FIELDCOUNT = 32;
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
    private CharacterField fieldFIDNOM = null;
    private CharacterField fieldCLINIF = null;
    private DecimalField fieldFECAP = null;
    private DecimalField fieldMOVPGO = null;
    private CharacterField fieldTEXTO = null;
    private CharacterField fieldNOMBRE = null;
    private DecimalField fieldULTVAL = null;
    private DecimalField fieldCOTIZA = null;
    private DecimalField fieldCLVTOA = null;
    private DecimalField fieldCLVTON = null;
    private DecimalField fieldCLVTOP = null;
    private DecimalField fieldCLVTOG = null;
    private DecimalField fieldCLVTOB = null;
    private DecimalField fieldBENE = null;
    private DecimalField fieldCLVTOD = null;
    private DecimalField fieldHMOINT = null;
    private DecimalField fieldHMOMNT1 = null;
    private DecimalField fieldIDBCOM = null;
    private DecimalField fieldCHEQUE = null;
    private DecimalField fieldIDBCHE = null;

    /**
     * Constructor for BAJBENFMMessage.
     */
    public BAJBENFMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 556;
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
        fields[12] = fieldFIDNOM
                = new CharacterField(message, HEADERSIZE + 186, 40, "FIDNOM");
        fields[13] = fieldCLINIF
                = new CharacterField(message, HEADERSIZE + 226, 12, "CLINIF");
        fields[14] = fieldFECAP
                = new DecimalField(message, HEADERSIZE + 238, 7, 0, "FECAP");
        fields[15] = fieldMOVPGO
                = new DecimalField(message, HEADERSIZE + 245, 3, 0, "MOVPGO");
        fields[16] = fieldTEXTO
                = new CharacterField(message, HEADERSIZE + 248, 30, "TEXTO");
        fields[17] = fieldNOMBRE
                = new CharacterField(message, HEADERSIZE + 278, 50, "NOMBRE");
        fields[18] = fieldULTVAL
                = new DecimalField(message, HEADERSIZE + 328, 7, 0, "ULTVAL");
        fields[19] = fieldCOTIZA
                = new DecimalField(message, HEADERSIZE + 335, 17, 11, "COTIZA");
        fields[20] = fieldCLVTOA
                = new DecimalField(message, HEADERSIZE + 352, 17, 2, "CLVTOA");
        fields[21] = fieldCLVTON
                = new DecimalField(message, HEADERSIZE + 369, 17, 2, "CLVTON");
        fields[22] = fieldCLVTOP
                = new DecimalField(message, HEADERSIZE + 386, 17, 2, "CLVTOP");
        fields[23] = fieldCLVTOG
                = new DecimalField(message, HEADERSIZE + 403, 17, 2, "CLVTOG");
        fields[24] = fieldCLVTOB
                = new DecimalField(message, HEADERSIZE + 420, 17, 2, "CLVTOB");
        fields[25] = fieldBENE
                = new DecimalField(message, HEADERSIZE + 437, 17, 2, "BENE");
        fields[26] = fieldCLVTOD
                = new DecimalField(message, HEADERSIZE + 454, 17, 2, "CLVTOD");
        fields[27] = fieldHMOINT
                = new DecimalField(message, HEADERSIZE + 471, 17, 2, "HMOINT");
        fields[28] = fieldHMOMNT1
                = new DecimalField(message, HEADERSIZE + 488, 17, 2, "HMOMNT1");
        fields[29] = fieldIDBCOM
                = new DecimalField(message, HEADERSIZE + 505, 17, 2, "IDBCOM");
        fields[30] = fieldCHEQUE
                = new DecimalField(message, HEADERSIZE + 522, 17, 2, "CHEQUE");
        fields[31] = fieldIDBCHE
                = new DecimalField(message, HEADERSIZE + 539, 17, 2, "IDBCHE");

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
     * Set field ULTVAL using a String value.
     */
    public void setULTVAL(String newvalue) {
        fieldULTVAL.setString(newvalue);
    }

    /**
     * Get value of field ULTVAL as a String.
     */
    public String getULTVAL() {
        return fieldULTVAL.getString();
    }

    /**
     * Set numeric field ULTVAL using a BigDecimal value.
     */
    public void setULTVAL(BigDecimal newvalue) {
        fieldULTVAL.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field ULTVAL as a BigDecimal.
     */
    public BigDecimal getBigDecimalULTVAL() {
        return fieldULTVAL.getBigDecimal();
    }

    /**
     * Set field COTIZA using a String value.
     */
    public void setCOTIZA(String newvalue) {
        fieldCOTIZA.setString(newvalue);
    }

    /**
     * Get value of field COTIZA as a String.
     */
    public String getCOTIZA() {
        return fieldCOTIZA.getString();
    }

    /**
     * Set numeric field COTIZA using a BigDecimal value.
     */
    public void setCOTIZA(BigDecimal newvalue) {
        fieldCOTIZA.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field COTIZA as a BigDecimal.
     */
    public BigDecimal getBigDecimalCOTIZA() {
        return fieldCOTIZA.getBigDecimal();
    }

    /**
     * Set field CLVTOA using a String value.
     */
    public void setCLVTOA(String newvalue) {
        fieldCLVTOA.setString(newvalue);
    }

    /**
     * Get value of field CLVTOA as a String.
     */
    public String getCLVTOA() {
        return fieldCLVTOA.getString();
    }

    /**
     * Set numeric field CLVTOA using a BigDecimal value.
     */
    public void setCLVTOA(BigDecimal newvalue) {
        fieldCLVTOA.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CLVTOA as a BigDecimal.
     */
    public BigDecimal getBigDecimalCLVTOA() {
        return fieldCLVTOA.getBigDecimal();
    }

    /**
     * Set field CLVTON using a String value.
     */
    public void setCLVTON(String newvalue) {
        fieldCLVTON.setString(newvalue);
    }

    /**
     * Get value of field CLVTON as a String.
     */
    public String getCLVTON() {
        return fieldCLVTON.getString();
    }

    /**
     * Set numeric field CLVTON using a BigDecimal value.
     */
    public void setCLVTON(BigDecimal newvalue) {
        fieldCLVTON.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CLVTON as a BigDecimal.
     */
    public BigDecimal getBigDecimalCLVTON() {
        return fieldCLVTON.getBigDecimal();
    }

    /**
     * Set field CLVTOP using a String value.
     */
    public void setCLVTOP(String newvalue) {
        fieldCLVTOP.setString(newvalue);
    }

    /**
     * Get value of field CLVTOP as a String.
     */
    public String getCLVTOP() {
        return fieldCLVTOP.getString();
    }

    /**
     * Set numeric field CLVTOP using a BigDecimal value.
     */
    public void setCLVTOP(BigDecimal newvalue) {
        fieldCLVTOP.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CLVTOP as a BigDecimal.
     */
    public BigDecimal getBigDecimalCLVTOP() {
        return fieldCLVTOP.getBigDecimal();
    }

    /**
     * Set field CLVTOG using a String value.
     */
    public void setCLVTOG(String newvalue) {
        fieldCLVTOG.setString(newvalue);
    }

    /**
     * Get value of field CLVTOG as a String.
     */
    public String getCLVTOG() {
        return fieldCLVTOG.getString();
    }

    /**
     * Set numeric field CLVTOG using a BigDecimal value.
     */
    public void setCLVTOG(BigDecimal newvalue) {
        fieldCLVTOG.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CLVTOG as a BigDecimal.
     */
    public BigDecimal getBigDecimalCLVTOG() {
        return fieldCLVTOG.getBigDecimal();
    }

    /**
     * Set field CLVTOB using a String value.
     */
    public void setCLVTOB(String newvalue) {
        fieldCLVTOB.setString(newvalue);
    }

    /**
     * Get value of field CLVTOB as a String.
     */
    public String getCLVTOB() {
        return fieldCLVTOB.getString();
    }

    /**
     * Set numeric field CLVTOB using a BigDecimal value.
     */
    public void setCLVTOB(BigDecimal newvalue) {
        fieldCLVTOB.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CLVTOB as a BigDecimal.
     */
    public BigDecimal getBigDecimalCLVTOB() {
        return fieldCLVTOB.getBigDecimal();
    }

    /**
     * Set field BENE using a String value.
     */
    public void setBENE(String newvalue) {
        fieldBENE.setString(newvalue);
    }

    /**
     * Get value of field BENE as a String.
     */
    public String getBENE() {
        return fieldBENE.getString();
    }

    /**
     * Set numeric field BENE using a BigDecimal value.
     */
    public void setBENE(BigDecimal newvalue) {
        fieldBENE.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field BENE as a BigDecimal.
     */
    public BigDecimal getBigDecimalBENE() {
        return fieldBENE.getBigDecimal();
    }

    /**
     * Set field CLVTOD using a String value.
     */
    public void setCLVTOD(String newvalue) {
        fieldCLVTOD.setString(newvalue);
    }

    /**
     * Get value of field CLVTOD as a String.
     */
    public String getCLVTOD() {
        return fieldCLVTOD.getString();
    }

    /**
     * Set numeric field CLVTOD using a BigDecimal value.
     */
    public void setCLVTOD(BigDecimal newvalue) {
        fieldCLVTOD.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CLVTOD as a BigDecimal.
     */
    public BigDecimal getBigDecimalCLVTOD() {
        return fieldCLVTOD.getBigDecimal();
    }

    /**
     * Set field HMOINT using a String value.
     */
    public void setHMOINT(String newvalue) {
        fieldHMOINT.setString(newvalue);
    }

    /**
     * Get value of field HMOINT as a String.
     */
    public String getHMOINT() {
        return fieldHMOINT.getString();
    }

    /**
     * Set numeric field HMOINT using a BigDecimal value.
     */
    public void setHMOINT(BigDecimal newvalue) {
        fieldHMOINT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field HMOINT as a BigDecimal.
     */
    public BigDecimal getBigDecimalHMOINT() {
        return fieldHMOINT.getBigDecimal();
    }

    /**
     * Set field HMOMNT1 using a String value.
     */
    public void setHMOMNT1(String newvalue) {
        fieldHMOMNT1.setString(newvalue);
    }

    /**
     * Get value of field HMOMNT1 as a String.
     */
    public String getHMOMNT1() {
        return fieldHMOMNT1.getString();
    }

    /**
     * Set numeric field HMOMNT1 using a BigDecimal value.
     */
    public void setHMOMNT1(BigDecimal newvalue) {
        fieldHMOMNT1.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field HMOMNT1 as a BigDecimal.
     */
    public BigDecimal getBigDecimalHMOMNT1() {
        return fieldHMOMNT1.getBigDecimal();
    }

    /**
     * Set field IDBCOM using a String value.
     */
    public void setIDBCOM(String newvalue) {
        fieldIDBCOM.setString(newvalue);
    }

    /**
     * Get value of field IDBCOM as a String.
     */
    public String getIDBCOM() {
        return fieldIDBCOM.getString();
    }

    /**
     * Set numeric field IDBCOM using a BigDecimal value.
     */
    public void setIDBCOM(BigDecimal newvalue) {
        fieldIDBCOM.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field IDBCOM as a BigDecimal.
     */
    public BigDecimal getBigDecimalIDBCOM() {
        return fieldIDBCOM.getBigDecimal();
    }

    /**
     * Set field CHEQUE using a String value.
     */
    public void setCHEQUE(String newvalue) {
        fieldCHEQUE.setString(newvalue);
    }

    /**
     * Get value of field CHEQUE as a String.
     */
    public String getCHEQUE() {
        return fieldCHEQUE.getString();
    }

    /**
     * Set numeric field CHEQUE using a BigDecimal value.
     */
    public void setCHEQUE(BigDecimal newvalue) {
        fieldCHEQUE.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CHEQUE as a BigDecimal.
     */
    public BigDecimal getBigDecimalCHEQUE() {
        return fieldCHEQUE.getBigDecimal();
    }

    /**
     * Set field IDBCHE using a String value.
     */
    public void setIDBCHE(String newvalue) {
        fieldIDBCHE.setString(newvalue);
    }

    /**
     * Get value of field IDBCHE as a String.
     */
    public String getIDBCHE() {
        return fieldIDBCHE.getString();
    }

    /**
     * Set numeric field IDBCHE using a BigDecimal value.
     */
    public void setIDBCHE(BigDecimal newvalue) {
        fieldIDBCHE.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field IDBCHE as a BigDecimal.
     */
    public BigDecimal getBigDecimalIDBCHE() {
        return fieldIDBCHE.getBigDecimal();
    }

}