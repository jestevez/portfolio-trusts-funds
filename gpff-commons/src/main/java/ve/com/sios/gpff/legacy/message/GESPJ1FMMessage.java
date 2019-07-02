package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from GESPJ1FM physical file
 * definition.
 * 
* File level identifier is 1140223223643. Record format level identifier is
 * 425CAD5BCB2CC.
 */
public class GESPJ1FMMessage extends MessageRecord {

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
        "CLAV",
        "NOMTAB",
        "TIPO",
        "DIVISA",
        "NUMCTA",
        "FECHA",
        "FECCON",
        "CONCEP",
        "IMPPTA",
        "IMPDIV",
        "VALOR",
        "NUM",
        "NOMCTA",
        "DISPON",
        "CONTAB"
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
        "CLAV",
        "NOMTAB",
        "TIPO",
        "DIVISA",
        "NUMCTA",
        "FECHA",
        "FECCON",
        "CONCEP",
        "IMPPTA",
        "IMPDIV",
        "VALOR",
        "NUM",
        "NOMCTA",
        "DISPON",
        "CONTAB"
    };
    final static String fid = "1140223223643";
    final static String rid = "425CAD5BCB2CC";
    final static String fmtname = "GESPJ1FM";
    final int FIELDCOUNT = 24;
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
    private CharacterField fieldCLAV = null;
    private CharacterField fieldNOMTAB = null;
    private CharacterField fieldTIPO = null;
    private DecimalField fieldDIVISA = null;
    private DecimalField fieldNUMCTA = null;
    private DecimalField fieldFECHA = null;
    private DecimalField fieldFECCON = null;
    private CharacterField fieldCONCEP = null;
    private DecimalField fieldIMPPTA = null;
    private DecimalField fieldIMPDIV = null;
    private DecimalField fieldVALOR = null;
    private DecimalField fieldNUM = null;
    private CharacterField fieldNOMCTA = null;
    private DecimalField fieldDISPON = null;
    private DecimalField fieldCONTAB = null;

    /**
     * Constructor for GESPJ1FMMessage.
     */
    public GESPJ1FMMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 392;
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
        fields[9] = fieldCLAV
                = new CharacterField(message, HEADERSIZE + 161, 4, "CLAV");
        fields[10] = fieldNOMTAB
                = new CharacterField(message, HEADERSIZE + 165, 40, "NOMTAB");
        fields[11] = fieldTIPO
                = new CharacterField(message, HEADERSIZE + 205, 20, "TIPO");
        fields[12] = fieldDIVISA
                = new DecimalField(message, HEADERSIZE + 225, 4, 0, "DIVISA");
        fields[13] = fieldNUMCTA
                = new DecimalField(message, HEADERSIZE + 229, 15, 0, "NUMCTA");
        fields[14] = fieldFECHA
                = new DecimalField(message, HEADERSIZE + 244, 7, 0, "FECHA");
        fields[15] = fieldFECCON
                = new DecimalField(message, HEADERSIZE + 251, 7, 0, "FECCON");
        fields[16] = fieldCONCEP
                = new CharacterField(message, HEADERSIZE + 258, 22, "CONCEP");
        fields[17] = fieldIMPPTA
                = new DecimalField(message, HEADERSIZE + 280, 15, 2, "IMPPTA");
        fields[18] = fieldIMPDIV
                = new DecimalField(message, HEADERSIZE + 295, 15, 2, "IMPDIV");
        fields[19] = fieldVALOR
                = new DecimalField(message, HEADERSIZE + 310, 7, 0, "VALOR");
        fields[20] = fieldNUM
                = new DecimalField(message, HEADERSIZE + 317, 5, 0, "NUM");
        fields[21] = fieldNOMCTA
                = new CharacterField(message, HEADERSIZE + 322, 40, "NOMCTA");
        fields[22] = fieldDISPON
                = new DecimalField(message, HEADERSIZE + 362, 15, 2, "DISPON");
        fields[23] = fieldCONTAB
                = new DecimalField(message, HEADERSIZE + 377, 15, 2, "CONTAB");

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
     * Set field NOMTAB using a String value.
     */
    public void setNOMTAB(String newvalue) {
        fieldNOMTAB.setString(newvalue);
    }

    /**
     * Get value of field NOMTAB as a String.
     */
    public String getNOMTAB() {
        return fieldNOMTAB.getString();
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
     * Set field DIVISA using a String value.
     */
    public void setDIVISA(String newvalue) {
        fieldDIVISA.setString(newvalue);
    }

    /**
     * Get value of field DIVISA as a String.
     */
    public String getDIVISA() {
        return fieldDIVISA.getString();
    }

    /**
     * Set numeric field DIVISA using a BigDecimal value.
     */
    public void setDIVISA(BigDecimal newvalue) {
        fieldDIVISA.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DIVISA as a BigDecimal.
     */
    public BigDecimal getBigDecimalDIVISA() {
        return fieldDIVISA.getBigDecimal();
    }

    /**
     * Set field NUMCTA using a String value.
     */
    public void setNUMCTA(String newvalue) {
        fieldNUMCTA.setString(newvalue);
    }

    /**
     * Get value of field NUMCTA as a String.
     */
    public String getNUMCTA() {
        return fieldNUMCTA.getString();
    }

    /**
     * Set numeric field NUMCTA using a BigDecimal value.
     */
    public void setNUMCTA(BigDecimal newvalue) {
        fieldNUMCTA.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field NUMCTA as a BigDecimal.
     */
    public BigDecimal getBigDecimalNUMCTA() {
        return fieldNUMCTA.getBigDecimal();
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
     * Set field FECCON using a String value.
     */
    public void setFECCON(String newvalue) {
        fieldFECCON.setString(newvalue);
    }

    /**
     * Get value of field FECCON as a String.
     */
    public String getFECCON() {
        return fieldFECCON.getString();
    }

    /**
     * Set numeric field FECCON using a BigDecimal value.
     */
    public void setFECCON(BigDecimal newvalue) {
        fieldFECCON.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field FECCON as a BigDecimal.
     */
    public BigDecimal getBigDecimalFECCON() {
        return fieldFECCON.getBigDecimal();
    }

    /**
     * Set field CONCEP using a String value.
     */
    public void setCONCEP(String newvalue) {
        fieldCONCEP.setString(newvalue);
    }

    /**
     * Get value of field CONCEP as a String.
     */
    public String getCONCEP() {
        return fieldCONCEP.getString();
    }

    /**
     * Set field IMPPTA using a String value.
     */
    public void setIMPPTA(String newvalue) {
        fieldIMPPTA.setString(newvalue);
    }

    /**
     * Get value of field IMPPTA as a String.
     */
    public String getIMPPTA() {
        return fieldIMPPTA.getString();
    }

    /**
     * Set numeric field IMPPTA using a BigDecimal value.
     */
    public void setIMPPTA(BigDecimal newvalue) {
        fieldIMPPTA.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field IMPPTA as a BigDecimal.
     */
    public BigDecimal getBigDecimalIMPPTA() {
        return fieldIMPPTA.getBigDecimal();
    }

    /**
     * Set field IMPDIV using a String value.
     */
    public void setIMPDIV(String newvalue) {
        fieldIMPDIV.setString(newvalue);
    }

    /**
     * Get value of field IMPDIV as a String.
     */
    public String getIMPDIV() {
        return fieldIMPDIV.getString();
    }

    /**
     * Set numeric field IMPDIV using a BigDecimal value.
     */
    public void setIMPDIV(BigDecimal newvalue) {
        fieldIMPDIV.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field IMPDIV as a BigDecimal.
     */
    public BigDecimal getBigDecimalIMPDIV() {
        return fieldIMPDIV.getBigDecimal();
    }

    /**
     * Set field VALOR using a String value.
     */
    public void setVALOR(String newvalue) {
        fieldVALOR.setString(newvalue);
    }

    /**
     * Get value of field VALOR as a String.
     */
    public String getVALOR() {
        return fieldVALOR.getString();
    }

    /**
     * Set numeric field VALOR using a BigDecimal value.
     */
    public void setVALOR(BigDecimal newvalue) {
        fieldVALOR.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field VALOR as a BigDecimal.
     */
    public BigDecimal getBigDecimalVALOR() {
        return fieldVALOR.getBigDecimal();
    }

    /**
     * Set field NUM using a String value.
     */
    public void setNUM(String newvalue) {
        fieldNUM.setString(newvalue);
    }

    /**
     * Get value of field NUM as a String.
     */
    public String getNUM() {
        return fieldNUM.getString();
    }

    /**
     * Set numeric field NUM using a BigDecimal value.
     */
    public void setNUM(BigDecimal newvalue) {
        fieldNUM.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field NUM as a BigDecimal.
     */
    public BigDecimal getBigDecimalNUM() {
        return fieldNUM.getBigDecimal();
    }

    /**
     * Set field NOMCTA using a String value.
     */
    public void setNOMCTA(String newvalue) {
        fieldNOMCTA.setString(newvalue);
    }

    /**
     * Get value of field NOMCTA as a String.
     */
    public String getNOMCTA() {
        return fieldNOMCTA.getString();
    }

    /**
     * Set field DISPON using a String value.
     */
    public void setDISPON(String newvalue) {
        fieldDISPON.setString(newvalue);
    }

    /**
     * Get value of field DISPON as a String.
     */
    public String getDISPON() {
        return fieldDISPON.getString();
    }

    /**
     * Set numeric field DISPON using a BigDecimal value.
     */
    public void setDISPON(BigDecimal newvalue) {
        fieldDISPON.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field DISPON as a BigDecimal.
     */
    public BigDecimal getBigDecimalDISPON() {
        return fieldDISPON.getBigDecimal();
    }

    /**
     * Set field CONTAB using a String value.
     */
    public void setCONTAB(String newvalue) {
        fieldCONTAB.setString(newvalue);
    }

    /**
     * Get value of field CONTAB as a String.
     */
    public String getCONTAB() {
        return fieldCONTAB.getString();
    }

    /**
     * Set numeric field CONTAB using a BigDecimal value.
     */
    public void setCONTAB(BigDecimal newvalue) {
        fieldCONTAB.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CONTAB as a BigDecimal.
     */
    public BigDecimal getBigDecimalCONTAB() {
        return fieldCONTAB.getBigDecimal();
    }

}