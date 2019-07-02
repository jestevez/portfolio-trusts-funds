package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from CONMOVFM physical file
 * definition.
 * 
* File level identifier is 1140322161651. Record format level identifier is
 * 4F2F09A4B1D20.
 */
public class CONMOVFMMessage extends MessageRecord {

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
        "FECINI",
        "FECFIN",
        "CLINIF",
        "TIP",
        "FIDE",
        "TABNOM",
        "SFNRO",
        "SFECV",
        "SFBVI",
        "SFRE1",
        "SFRE2",
        "CLIENTE",
        "NOMBRE",
        "FECHA",
        "MONTO",
        "OPERA",
        "SITUACION",
        "NRR",
        "CLINIF1",
        "TMOV"
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
        "FECINI",
        "FECFIN",
        "CLINIF",
        "TIP",
        "FIDE",
        "TABNOM",
        "SFNRO",
        "SFECV",
        "SFBVI",
        "SFRE1",
        "SFRE2",
        "CLIENTE",
        "NOMBRE",
        "FECHA",
        "MONTO",
        "OPERA",
        "SITUACION",
        "NRR",
        "CLINIF1",
        "TMOV"
    };
    final static String fid = "1140322161651";
    final static String rid = "4F2F09A4B1D20";
    final static String fmtname = "CONMOVFM";
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
    private DecimalField fieldFECINI = null;
    private DecimalField fieldFECFIN = null;
    private CharacterField fieldCLINIF = null;
    private CharacterField fieldTIP = null;
    private CharacterField fieldFIDE = null;
    private CharacterField fieldTABNOM = null;
    private DecimalField fieldSFNRO = null;
    private DecimalField fieldSFECV = null;
    private DecimalField fieldSFBVI = null;
    private CharacterField fieldSFRE1 = null;
    private DecimalField fieldSFRE2 = null;
    private CharacterField fieldCLIENTE = null;
    private CharacterField fieldNOMBRE = null;
    private DecimalField fieldFECHA = null;
    private DecimalField fieldMONTO = null;
    private CharacterField fieldOPERA = null;
    private CharacterField fieldSITUACION = null;
    private DecimalField fieldNRR = null;
    private CharacterField fieldCLINIF1 = null;
    private CharacterField fieldTMOV = null;

    /**
     * Constructor for CONMOVFMMessage.
     */
    public CONMOVFMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 387;
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
        fields[12] = fieldFECINI
                = new DecimalField(message, HEADERSIZE + 186, 7, 0, "FECINI");
        fields[13] = fieldFECFIN
                = new DecimalField(message, HEADERSIZE + 193, 7, 0, "FECFIN");
        fields[14] = fieldCLINIF
                = new CharacterField(message, HEADERSIZE + 200, 12, "CLINIF");
        fields[15] = fieldTIP
                = new CharacterField(message, HEADERSIZE + 212, 1, "TIP");
        fields[16] = fieldFIDE
                = new CharacterField(message, HEADERSIZE + 213, 4, "FIDE");
        fields[17] = fieldTABNOM
                = new CharacterField(message, HEADERSIZE + 217, 40, "TABNOM");
        fields[18] = fieldSFNRO
                = new DecimalField(message, HEADERSIZE + 257, 8, 0, "SFNRO");
        fields[19] = fieldSFECV
                = new DecimalField(message, HEADERSIZE + 265, 7, 0, "SFECV");
        fields[20] = fieldSFBVI
                = new DecimalField(message, HEADERSIZE + 272, 6, 0, "SFBVI");
        fields[21] = fieldSFRE1
                = new CharacterField(message, HEADERSIZE + 278, 3, "SFRE1");
        fields[22] = fieldSFRE2
                = new DecimalField(message, HEADERSIZE + 281, 8, 0, "SFRE2");
        fields[23] = fieldCLIENTE
                = new CharacterField(message, HEADERSIZE + 289, 12, "CLIENTE");
        fields[24] = fieldNOMBRE
                = new CharacterField(message, HEADERSIZE + 301, 20, "NOMBRE");
        fields[25] = fieldFECHA
                = new DecimalField(message, HEADERSIZE + 321, 7, 0, "FECHA");
        fields[26] = fieldMONTO
                = new DecimalField(message, HEADERSIZE + 328, 16, 2, "MONTO");
        fields[27] = fieldOPERA
                = new CharacterField(message, HEADERSIZE + 344, 10, "OPERA");
        fields[28] = fieldSITUACION
                = new CharacterField(message, HEADERSIZE + 354, 1, "SITUACION");
        fields[29] = fieldNRR
                = new DecimalField(message, HEADERSIZE + 355, 5, 0, "NRR");
        fields[30] = fieldCLINIF1
                = new CharacterField(message, HEADERSIZE + 360, 12, "CLINIF1");
        fields[31] = fieldTMOV
                = new CharacterField(message, HEADERSIZE + 372, 15, "TMOV");

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
     * Set field FECFIN using a String value.
     */
    public void setFECFIN(String newvalue) {
        fieldFECFIN.setString(newvalue);
    }

    /**
     * Get value of field FECFIN as a String.
     */
    public String getFECFIN() {
        return fieldFECFIN.getString();
    }

    /**
     * Set numeric field FECFIN using a BigDecimal value.
     */
    public void setFECFIN(BigDecimal newvalue) {
        fieldFECFIN.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECFIN as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECFIN() {
        return fieldFECFIN.getBigDecimal();
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
     * Set field TIP using a String value.
     */
    public void setTIP(String newvalue) {
        fieldTIP.setString(newvalue);
    }

    /**
     * Get value of field TIP as a String.
     */
    public String getTIP() {
        return fieldTIP.getString();
    }

    /**
     * Set field FIDE using a String value.
     */
    public void setFIDE(String newvalue) {
        fieldFIDE.setString(newvalue);
    }

    /**
     * Get value of field FIDE as a String.
     */
    public String getFIDE() {
        return fieldFIDE.getString();
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
     * Set field SFNRO using a String value.
     */
    public void setSFNRO(String newvalue) {
        fieldSFNRO.setString(newvalue);
    }

    /**
     * Get value of field SFNRO as a String.
     */
    public String getSFNRO() {
        return fieldSFNRO.getString();
    }

    /**
     * Set numeric field SFNRO using a BigDecimal value.
     */
    public void setSFNRO(BigDecimal newvalue) {
        fieldSFNRO.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field SFNRO as a BigDecimal.
     */
    public BigDecimal getBigDecimalSFNRO() {
        return fieldSFNRO.getBigDecimal();
    }

    /**
     * Set field SFECV using a String value.
     */
    public void setSFECV(String newvalue) {
        fieldSFECV.setString(newvalue);
    }

    /**
     * Get value of field SFECV as a String.
     */
    public String getSFECV() {
        return fieldSFECV.getString();
    }

    /**
     * Set numeric field SFECV using a BigDecimal value.
     */
    public void setSFECV(BigDecimal newvalue) {
        fieldSFECV.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field SFECV as a BigDecimal.
     */
    public BigDecimal getBigDecimalSFECV() {
        return fieldSFECV.getBigDecimal();
    }

    /**
     * Set field SFBVI using a String value.
     */
    public void setSFBVI(String newvalue) {
        fieldSFBVI.setString(newvalue);
    }

    /**
     * Get value of field SFBVI as a String.
     */
    public String getSFBVI() {
        return fieldSFBVI.getString();
    }

    /**
     * Set numeric field SFBVI using a BigDecimal value.
     */
    public void setSFBVI(BigDecimal newvalue) {
        fieldSFBVI.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field SFBVI as a BigDecimal.
     */
    public BigDecimal getBigDecimalSFBVI() {
        return fieldSFBVI.getBigDecimal();
    }

    /**
     * Set field SFRE1 using a String value.
     */
    public void setSFRE1(String newvalue) {
        fieldSFRE1.setString(newvalue);
    }

    /**
     * Get value of field SFRE1 as a String.
     */
    public String getSFRE1() {
        return fieldSFRE1.getString();
    }

    /**
     * Set field SFRE2 using a String value.
     */
    public void setSFRE2(String newvalue) {
        fieldSFRE2.setString(newvalue);
    }

    /**
     * Get value of field SFRE2 as a String.
     */
    public String getSFRE2() {
        return fieldSFRE2.getString();
    }

    /**
     * Set numeric field SFRE2 using a BigDecimal value.
     */
    public void setSFRE2(BigDecimal newvalue) {
        fieldSFRE2.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field SFRE2 as a BigDecimal.
     */
    public BigDecimal getBigDecimalSFRE2() {
        return fieldSFRE2.getBigDecimal();
    }

    /**
     * Set field CLIENTE using a String value.
     */
    public void setCLIENTE(String newvalue) {
        fieldCLIENTE.setString(newvalue);
    }

    /**
     * Get value of field CLIENTE as a String.
     */
    public String getCLIENTE() {
        return fieldCLIENTE.getString();
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
     * Set field FECHA using a String value.
     */
    public void setFECHA(String newvalue) {
        fieldFECHA.setString(newvalue);
    }

    /**
     * Get value of field FECHA as a String.
     */
    public String getFECHA() {
        return fieldFECHA.getString();
    }

    /**
     * Set numeric field FECHA using a BigDecimal value.
     */
    public void setFECHA(BigDecimal newvalue) {
        fieldFECHA.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECHA as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECHA() {
        return fieldFECHA.getBigDecimal();
    }

    /**
     * Set field MONTO using a String value.
     */
    public void setMONTO(String newvalue) {
        fieldMONTO.setString(newvalue);
    }

    /**
     * Get value of field MONTO as a String.
     */
    public String getMONTO() {
        return fieldMONTO.getString();
    }

    /**
     * Set numeric field MONTO using a BigDecimal value.
     */
    public void setMONTO(BigDecimal newvalue) {
        fieldMONTO.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field MONTO as a BigDecimal.
     */
    public BigDecimal getBigDecimalMONTO() {
        return fieldMONTO.getBigDecimal();
    }

    /**
     * Set field OPERA using a String value.
     */
    public void setOPERA(String newvalue) {
        fieldOPERA.setString(newvalue);
    }

    /**
     * Get value of field OPERA as a String.
     */
    public String getOPERA() {
        return fieldOPERA.getString();
    }

    /**
     * Set field SITUACION using a String value.
     */
    public void setSITUACION(String newvalue) {
        fieldSITUACION.setString(newvalue);
    }

    /**
     * Get value of field SITUACION as a String.
     */
    public String getSITUACION() {
        return fieldSITUACION.getString();
    }

    /**
     * Set field NRR using a String value.
     */
    public void setNRR(String newvalue) {
        fieldNRR.setString(newvalue);
    }

    /**
     * Get value of field NRR as a String.
     */
    public String getNRR() {
        return fieldNRR.getString();
    }

    /**
     * Set numeric field NRR using a BigDecimal value.
     */
    public void setNRR(BigDecimal newvalue) {
        fieldNRR.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field NRR as a BigDecimal.
     */
    public BigDecimal getBigDecimalNRR() {
        return fieldNRR.getBigDecimal();
    }

    /**
     * Set field CLINIF1 using a String value.
     */
    public void setCLINIF1(String newvalue) {
        fieldCLINIF1.setString(newvalue);
    }

    /**
     * Get value of field CLINIF1 as a String.
     */
    public String getCLINIF1() {
        return fieldCLINIF1.getString();
    }

    /**
     * Set field TMOV using a String value.
     */
    public void setTMOV(String newvalue) {
        fieldTMOV.setString(newvalue);
    }

    /**
     * Get value of field TMOV as a String.
     */
    public String getTMOV() {
        return fieldTMOV.getString();
    }

}
