package ve.com.sios.gpff.legacy.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.legacy.sockets.CharacterField;
import ve.com.sios.gpff.legacy.sockets.DecimalField;
import ve.com.sios.gpff.legacy.sockets.MessageField;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * Class generated by AS/400 CRTCLASS command from FLUCAJGFMO physical file
 * definition.
 * 
* File level identifier is 1140202180025. Record format level identifier is
 * 40D96E8F36BA7.
 */
public class FLUCAJGFMOMessage extends MessageRecord {

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
        "CODFID",
        "FIDEP",
        "FECHA",
        "CLIENT",
        "RIFCLI",
        "NOMBAN",
        "SFCOD",
        "SFCLO",
        "SFNOM",
        "SFTIP",
        "SFCON",
        "SFSEL",
        "NRR",
        "NOMBRE",
        "SALANT",
        "SALHOY",
        "MOVDIB",
        "SALTOT"
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
        "CODFID",
        "FIDEP",
        "FECHA",
        "CLIENT",
        "RIFCLI",
        "NOMBAN",
        "SFCOD",
        "SFCLO",
        "SFNOM",
        "SFTIP",
        "SFCON",
        "SFSEL",
        "NRR",
        "NOMBRE",
        "SALANT",
        "SALHOY",
        "MOVDIB",
        "SALTOT"
    };
    final static String fid = "1140202180025";
    final static String rid = "40D96E8F36BA7";
    final static String fmtname = "FLUCAJGFMO";
    final int FIELDCOUNT = 30;
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
    private CharacterField fieldCODFID = null;
    private CharacterField fieldFIDEP = null;
    private DecimalField fieldFECHA = null;
    private DecimalField fieldCLIENT = null;
    private CharacterField fieldRIFCLI = null;
    private CharacterField fieldNOMBAN = null;
    private DecimalField fieldSFCOD = null;
    private DecimalField fieldSFCLO = null;
    private CharacterField fieldSFNOM = null;
    private CharacterField fieldSFTIP = null;
    private CharacterField fieldSFCON = null;
    private DecimalField fieldSFSEL = null;
    private DecimalField fieldNRR = null;
    private CharacterField fieldNOMBRE = null;
    private DecimalField fieldSALANT = null;
    private DecimalField fieldSALHOY = null;
    private DecimalField fieldMOVDIB = null;
    private DecimalField fieldSALTOT = null;

    /**
     * Constructor for FLUCAJGFMOMessage.
     */
    public FLUCAJGFMOMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 450;
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
        fields[12] = fieldCODFID
                = new CharacterField(message, HEADERSIZE + 186, 4, "CODFID");
        fields[13] = fieldFIDEP
                = new CharacterField(message, HEADERSIZE + 190, 35, "FIDEP");
        fields[14] = fieldFECHA
                = new DecimalField(message, HEADERSIZE + 225, 7, 0, "FECHA");
        fields[15] = fieldCLIENT
                = new DecimalField(message, HEADERSIZE + 232, 8, 0, "CLIENT");
        fields[16] = fieldRIFCLI
                = new CharacterField(message, HEADERSIZE + 240, 12, "RIFCLI");
        fields[17] = fieldNOMBAN
                = new CharacterField(message, HEADERSIZE + 252, 15, "NOMBAN");
        fields[18] = fieldSFCOD
                = new DecimalField(message, HEADERSIZE + 267, 4, 0, "SFCOD");
        fields[19] = fieldSFCLO
                = new DecimalField(message, HEADERSIZE + 271, 8, 0, "SFCLO");
        fields[20] = fieldSFNOM
                = new CharacterField(message, HEADERSIZE + 279, 20, "SFNOM");
        fields[21] = fieldSFTIP
                = new CharacterField(message, HEADERSIZE + 299, 1, "SFTIP");
        fields[22] = fieldSFCON
                = new CharacterField(message, HEADERSIZE + 300, 30, "SFCON");
        fields[23] = fieldSFSEL
                = new DecimalField(message, HEADERSIZE + 330, 17, 2, "SFSEL");
        fields[24] = fieldNRR
                = new DecimalField(message, HEADERSIZE + 347, 5, 0, "NRR");
        fields[25] = fieldNOMBRE
                = new CharacterField(message, HEADERSIZE + 352, 30, "NOMBRE");
        fields[26] = fieldSALANT
                = new DecimalField(message, HEADERSIZE + 382, 17, 2, "SALANT");
        fields[27] = fieldSALHOY
                = new DecimalField(message, HEADERSIZE + 399, 17, 2, "SALHOY");
        fields[28] = fieldMOVDIB
                = new DecimalField(message, HEADERSIZE + 416, 17, 2, "MOVDIB");
        fields[29] = fieldSALTOT
                = new DecimalField(message, HEADERSIZE + 433, 17, 2, "SALTOT");

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
     * Set field CODFID using a String value.
     */
    public void setCODFID(String newvalue) {
        fieldCODFID.setString(newvalue);
    }

    /**
     * Get value of field CODFID as a String.
     */
    public String getCODFID() {
        return fieldCODFID.getString();
    }

    /**
     * Set field FIDEP using a String value.
     */
    public void setFIDEP(String newvalue) {
        fieldFIDEP.setString(newvalue);
    }

    /**
     * Get value of field FIDEP as a String.
     */
    public String getFIDEP() {
        return fieldFIDEP.getString();
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
     * Set field CLIENT using a String value.
     */
    public void setCLIENT(String newvalue) {
        fieldCLIENT.setString(newvalue);
    }

    /**
     * Get value of field CLIENT as a String.
     */
    public String getCLIENT() {
        return fieldCLIENT.getString();
    }

    /**
     * Set numeric field CLIENT using a BigDecimal value.
     */
    public void setCLIENT(BigDecimal newvalue) {
        fieldCLIENT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field CLIENT as a BigDecimal.
     */
    public BigDecimal getBigDecimalCLIENT() {
        return fieldCLIENT.getBigDecimal();
    }

    /**
     * Set field RIFCLI using a String value.
     */
    public void setRIFCLI(String newvalue) {
        fieldRIFCLI.setString(newvalue);
    }

    /**
     * Get value of field RIFCLI as a String.
     */
    public String getRIFCLI() {
        return fieldRIFCLI.getString();
    }

    /**
     * Set field NOMBAN using a String value.
     */
    public void setNOMBAN(String newvalue) {
        fieldNOMBAN.setString(newvalue);
    }

    /**
     * Get value of field NOMBAN as a String.
     */
    public String getNOMBAN() {
        return fieldNOMBAN.getString();
    }

    /**
     * Set field SFCOD using a String value.
     */
    public void setSFCOD(String newvalue) {
        fieldSFCOD.setString(newvalue);
    }

    /**
     * Get value of field SFCOD as a String.
     */
    public String getSFCOD() {
        return fieldSFCOD.getString();
    }

    /**
     * Set numeric field SFCOD using a BigDecimal value.
     */
    public void setSFCOD(BigDecimal newvalue) {
        fieldSFCOD.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field SFCOD as a BigDecimal.
     */
    public BigDecimal getBigDecimalSFCOD() {
        return fieldSFCOD.getBigDecimal();
    }

    /**
     * Set field SFCLO using a String value.
     */
    public void setSFCLO(String newvalue) {
        fieldSFCLO.setString(newvalue);
    }

    /**
     * Get value of field SFCLO as a String.
     */
    public String getSFCLO() {
        return fieldSFCLO.getString();
    }

    /**
     * Set numeric field SFCLO using a BigDecimal value.
     */
    public void setSFCLO(BigDecimal newvalue) {
        fieldSFCLO.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field SFCLO as a BigDecimal.
     */
    public BigDecimal getBigDecimalSFCLO() {
        return fieldSFCLO.getBigDecimal();
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
     * Set field SFTIP using a String value.
     */
    public void setSFTIP(String newvalue) {
        fieldSFTIP.setString(newvalue);
    }

    /**
     * Get value of field SFTIP as a String.
     */
    public String getSFTIP() {
        return fieldSFTIP.getString();
    }

    /**
     * Set field SFCON using a String value.
     */
    public void setSFCON(String newvalue) {
        fieldSFCON.setString(newvalue);
    }

    /**
     * Get value of field SFCON as a String.
     */
    public String getSFCON() {
        return fieldSFCON.getString();
    }

    /**
     * Set field SFSEL using a String value.
     */
    public void setSFSEL(String newvalue) {
        fieldSFSEL.setString(newvalue);
    }

    /**
     * Get value of field SFSEL as a String.
     */
    public String getSFSEL() {
        return fieldSFSEL.getString();
    }

    /**
     * Set numeric field SFSEL using a BigDecimal value.
     */
    public void setSFSEL(BigDecimal newvalue) {
        fieldSFSEL.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field SFSEL as a BigDecimal.
     */
    public BigDecimal getBigDecimalSFSEL() {
        return fieldSFSEL.getBigDecimal();
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
     * Set field SALANT using a String value.
     */
    public void setSALANT(String newvalue) {
        fieldSALANT.setString(newvalue);
    }

    /**
     * Get value of field SALANT as a String.
     */
    public String getSALANT() {
        return fieldSALANT.getString();
    }

    /**
     * Set numeric field SALANT using a BigDecimal value.
     */
    public void setSALANT(BigDecimal newvalue) {
        fieldSALANT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field SALANT as a BigDecimal.
     */
    public BigDecimal getBigDecimalSALANT() {
        return fieldSALANT.getBigDecimal();
    }

    /**
     * Set field SALHOY using a String value.
     */
    public void setSALHOY(String newvalue) {
        fieldSALHOY.setString(newvalue);
    }

    /**
     * Get value of field SALHOY as a String.
     */
    public String getSALHOY() {
        return fieldSALHOY.getString();
    }

    /**
     * Set numeric field SALHOY using a BigDecimal value.
     */
    public void setSALHOY(BigDecimal newvalue) {
        fieldSALHOY.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field SALHOY as a BigDecimal.
     */
    public BigDecimal getBigDecimalSALHOY() {
        return fieldSALHOY.getBigDecimal();
    }

    /**
     * Set field MOVDIB using a String value.
     */
    public void setMOVDIB(String newvalue) {
        fieldMOVDIB.setString(newvalue);
    }

    /**
     * Get value of field MOVDIB as a String.
     */
    public String getMOVDIB() {
        return fieldMOVDIB.getString();
    }

    /**
     * Set numeric field MOVDIB using a BigDecimal value.
     */
    public void setMOVDIB(BigDecimal newvalue) {
        fieldMOVDIB.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field MOVDIB as a BigDecimal.
     */
    public BigDecimal getBigDecimalMOVDIB() {
        return fieldMOVDIB.getBigDecimal();
    }

    /**
     * Set field SALTOT using a String value.
     */
    public void setSALTOT(String newvalue) {
        fieldSALTOT.setString(newvalue);
    }

    /**
     * Get value of field SALTOT as a String.
     */
    public String getSALTOT() {
        return fieldSALTOT.getString();
    }

    /**
     * Set numeric field SALTOT using a BigDecimal value.
     */
    public void setSALTOT(BigDecimal newvalue) {
        fieldSALTOT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field SALTOT as a BigDecimal.
     */
    public BigDecimal getBigDecimalSALTOT() {
        return fieldSALTOT.getBigDecimal();
    }

}
