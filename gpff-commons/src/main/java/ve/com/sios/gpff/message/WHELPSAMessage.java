package ve.com.sios.gpff.message;

import ve.com.sios.gpff.sockets.CharacterField;
import ve.com.sios.gpff.sockets.DecimalField;
import ve.com.sios.gpff.sockets.MessageField;
import ve.com.sios.gpff.sockets.MessageRecord;
import java.math.BigDecimal;
import java.util.Hashtable;

/**
* Class generated by AS/400 CRTCLASS command from WHELPSA physical file definition.
* 
* Lista de Ayudas 
* 
* File level identifier is 1121210103645.
* Record format level identifier is 443BEA81B482A.
*/

public class WHELPSAMessage extends MessageRecord {

/*
HPGM       CHAR           10      10         1        Ambos    PROG. A  EJEC.
HDAT       PACKED       6  0       4        11        Ambos    FECHA DE EJEC.
HTIM       PACKED       6  0       4        15        Ambos    HORA DE EJEC.
HUSR       CHAR           10      10        19        Ambos    USUARIO EJEC.
HENV       CHAR            1       1        29        Ambos    ENVIOS
HPRO       CHAR            4       4        30        Ambos    COD. PROCESO
HRIN       PACKED       5  0       3        34        Ambos    REG. INICIAL       
HNRE       PACKED       3  0       2        37        Ambos    NUM. REG A ENVIAR
HRRL       PACKED       8  0       5        39        Ambos    REG. RELATIVO
HTOT       PACKED       7  0       4        44        Ambos    TOT. REGISTRO
HFLI       CHAR            1       1        48        Ambos    FLAG INICIAL
HAREA      CHAR            4       4        49        Ambos    CODIGO DE AREA
EFLG0      CHAR            1       1        53        Ambos    FLAG DE ERROR
EDSC0      CHAR           50      50        54        Ambos    DSC  DE ERROR
EDSC1      CHAR           50      50       104        Ambos    DSC  DE ERROR
EDSC2      CHAR           50      50       154        Ambos    DSC  DE ERROR
EDSC3      CHAR           50      50       204        Ambos    DSC  DE ERROR
EDSC4      CHAR           50      50       254        Ambos    DSC  DE ERROR
EDSC5      CHAR           50      50       304        Ambos    DSC  DE ERROR
EDSC6      CHAR           50      50       354        Ambos    DSC  DE ERROR
EDSC7      CHAR           50      50       404        Ambos    DSC  DE ERROR       
EDSC8      CHAR           50      50       454        Ambos    DSC  DE ERROR
EDSC9      CHAR           50      50       504        Ambos    DSC  DE ERROR
TABCOD     CHAR            2       2       554        Ambos    CODIGO DE TABLA
TABDSC     CHAR           35      35       556        Ambos    DESCRIPCION TABLA
TABCP1     CHAR           15      15       591        Ambos    CIDIGO
TABCP2     CHAR           35      35       606        Ambos    DESCRIP. CAMPO

 */
    
    final static String fldnames[] = {
        "HPGM",
        "HDAT",
        "HTIM",
        "HUSR",
        "HENV",
        "HPRO",
        "HRIN",
        "HNRE",
        "HRRL",
        "HTOT",
        "HFLI",
        "HAREA",
        "EFLG0",
        "EDSC0",
        "EDSC1",
        "EDSC2",
        "EDSC3",
        "EDSC4",
        "EDSC5",
        "EDSC6",
        "EDSC7",
        "EDSC8",
        "EDSC9",
        "TABCOD",
        "TABDSC",
        "TABCP1",
        "TABCP2"
    };
    final static String tnames[] = {
        "HPGM",
        "HDAT",
        "HTIM",
        "HUSR",
        "HENV",
        "HPRO",
        "HRIN",
        "HNRE",
        "HRRL",
        "HTOT",
        "HFLI",
        "HAREA",
        "EFLG0",
        "EDSC0",
        "EDSC1",
        "EDSC2",
        "EDSC3",
        "EDSC4",
        "EDSC5",
        "EDSC6",
        "EDSC7",
        "EDSC8",
        "EDSC9",
        "TABCOD",
        "TABDSC",
        "TABCP1",
        "TABCP2"
    };
    final static String fid = "1121210103645";
    final static String rid = "443BEA81B482A";
    final static String fmtname = "WHELPSA";
    final int FIELDCOUNT = 27;
    private static Hashtable tlookup = new Hashtable();
    private CharacterField fieldHPGM = null;
    private DecimalField fieldHDAT = null;
    private DecimalField fieldHTIM = null;
    private CharacterField fieldHUSR = null;
    private CharacterField fieldHENV = null;
    private CharacterField fieldHPRO = null;
    private DecimalField fieldHRIN = null;
    private DecimalField fieldHNRE = null;
    private DecimalField fieldHRRL = null;
    private DecimalField fieldHTOT = null;
    private CharacterField fieldHFLI = null;
    private CharacterField fieldHAREA = null;
    private CharacterField fieldEFLG0 = null;
    private CharacterField fieldEDSC0 = null;
    private CharacterField fieldEDSC1 = null;
    private CharacterField fieldEDSC2 = null;
    private CharacterField fieldEDSC3 = null;
    private CharacterField fieldEDSC4 = null;
    private CharacterField fieldEDSC5 = null;
    private CharacterField fieldEDSC6 = null;
    private CharacterField fieldEDSC7 = null;
    private CharacterField fieldEDSC8 = null;
    private CharacterField fieldEDSC9 = null;
    private CharacterField fieldTABCOD = null;
    private CharacterField fieldTABDSC = null;
    private CharacterField fieldTABCP1 = null;
    private CharacterField fieldTABCP2 = null;

    /**
     * Constructor for WHELPSAMessage.
     */
    public WHELPSAMessage() {
        createFields();
        initialize();
    }

    /**
     * Create fields for this message. This method implements the abstract
     * method in the MessageRecord superclass.
     */
    protected void createFields() {
        recordsize = 659;
        fileid = fid;
        recordid = rid;
        message = new byte[getByteLength()];
        formatname = fmtname;
        fieldnames = fldnames;
        tagnames = tnames;
        fields = new MessageField[FIELDCOUNT];

        fields[0] = fieldHPGM =
                new CharacterField(message, HEADERSIZE + 0, 10, "HPGM");
        fields[1] = fieldHDAT =
                new DecimalField(message, HEADERSIZE + 10, 7, 0, "HDAT");
        fields[2] = fieldHTIM =
                new DecimalField(message, HEADERSIZE + 17, 7, 0, "HTIM");
        fields[3] = fieldHUSR =
                new CharacterField(message, HEADERSIZE + 24, 10, "HUSR");
        fields[4] = fieldHENV =
                new CharacterField(message, HEADERSIZE + 34, 1, "HENV");
        fields[5] = fieldHPRO =
                new CharacterField(message, HEADERSIZE + 35, 4, "HPRO");
        fields[6] = fieldHRIN =
                new DecimalField(message, HEADERSIZE + 39, 6, 0, "HRIN");
        fields[7] = fieldHNRE =
                new DecimalField(message, HEADERSIZE + 45, 4, 0, "HNRE");
        fields[8] = fieldHRRL =
                new DecimalField(message, HEADERSIZE + 49, 9, 0, "HRRL");
        fields[9] = fieldHTOT =
                new DecimalField(message, HEADERSIZE + 58, 8, 0, "HTOT");
        fields[10] = fieldHFLI =
                new CharacterField(message, HEADERSIZE + 66, 1, "HFLI");
        fields[11] = fieldHAREA =
                new CharacterField(message, HEADERSIZE + 67, 4, "HAREA");
        fields[12] = fieldEFLG0 =
                new CharacterField(message, HEADERSIZE + 71, 1, "EFLG0");
        fields[13] = fieldEDSC0 =
                new CharacterField(message, HEADERSIZE + 72, 50, "EDSC0");
        fields[14] = fieldEDSC1 =
                new CharacterField(message, HEADERSIZE + 122, 50, "EDSC1");
        fields[15] = fieldEDSC2 =
                new CharacterField(message, HEADERSIZE + 172, 50, "EDSC2");
        fields[16] = fieldEDSC3 =
                new CharacterField(message, HEADERSIZE + 222, 50, "EDSC3");
        fields[17] = fieldEDSC4 =
                new CharacterField(message, HEADERSIZE + 272, 50, "EDSC4");
        fields[18] = fieldEDSC5 =
                new CharacterField(message, HEADERSIZE + 322, 50, "EDSC5");
        fields[19] = fieldEDSC6 =
                new CharacterField(message, HEADERSIZE + 372, 50, "EDSC6");
        fields[20] = fieldEDSC7 =
                new CharacterField(message, HEADERSIZE + 422, 50, "EDSC7");
        fields[21] = fieldEDSC8 =
                new CharacterField(message, HEADERSIZE + 472, 50, "EDSC8");
        fields[22] = fieldEDSC9 =
                new CharacterField(message, HEADERSIZE + 522, 50, "EDSC9");
        fields[23] = fieldTABCOD =
                new CharacterField(message, HEADERSIZE + 572, 2, "TABCOD");
        fields[24] = fieldTABDSC =
                new CharacterField(message, HEADERSIZE + 574, 35, "TABDSC");
        fields[25] = fieldTABCP1 =
                new CharacterField(message, HEADERSIZE + 609, 15, "TABCP1");
        fields[26] = fieldTABCP2 =
                new CharacterField(message, HEADERSIZE + 624, 35, "TABCP2");

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
     * Set field HPGM using a String value.
     */
    public void setHPGM(String newvalue) {
        fieldHPGM.setString(newvalue);
    }

    /**
     * Get value of field HPGM as a String.
     */
    public String getHPGM() {
        return fieldHPGM.getString();
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
     * Set field HPRO using a String value.
     */
    public void setHPRO(String newvalue) {
        fieldHPRO.setString(newvalue);
    }

    /**
     * Get value of field HPRO as a String.
     */
    public String getHPRO() {
        return fieldHPRO.getString();
    }

    /**
     * Set field HRIN using a String value.
     */
    public void setHRIN(String newvalue) {
        fieldHRIN.setString(newvalue);
    }

    /**
     * Get value of field HRIN as a String.
     */
    public String getHRIN() {
        return fieldHRIN.getString();
    }

    /**
     * Set numeric field HRIN using a BigDecimal value.
     */
    public void setHRIN(BigDecimal newvalue) {
        fieldHRIN.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field HRIN as a BigDecimal.
     */
    public BigDecimal getBigDecimalHRIN() {
        return fieldHRIN.getBigDecimal();
    }

    /**
     * Set field HNRE using a String value.
     */
    public void setHNRE(String newvalue) {
        fieldHNRE.setString(newvalue);
    }

    /**
     * Get value of field HNRE as a String.
     */
    public String getHNRE() {
        return fieldHNRE.getString();
    }

    /**
     * Set numeric field HNRE using a BigDecimal value.
     */
    public void setHNRE(BigDecimal newvalue) {
        fieldHNRE.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field HNRE as a BigDecimal.
     */
    public BigDecimal getBigDecimalHNRE() {
        return fieldHNRE.getBigDecimal();
    }

    /**
     * Set field HRRL using a String value.
     */
    public void setHRRL(String newvalue) {
        fieldHRRL.setString(newvalue);
    }

    /**
     * Get value of field HRRL as a String.
     */
    public String getHRRL() {
        return fieldHRRL.getString();
    }

    /**
     * Set numeric field HRRL using a BigDecimal value.
     */
    public void setHRRL(BigDecimal newvalue) {
        fieldHRRL.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field HRRL as a BigDecimal.
     */
    public BigDecimal getBigDecimalHRRL() {
        return fieldHRRL.getBigDecimal();
    }

    /**
     * Set field HTOT using a String value.
     */
    public void setHTOT(String newvalue) {
        fieldHTOT.setString(newvalue);
    }

    /**
     * Get value of field HTOT as a String.
     */
    public String getHTOT() {
        return fieldHTOT.getString();
    }

    /**
     * Set numeric field HTOT using a BigDecimal value.
     */
    public void setHTOT(BigDecimal newvalue) {
        fieldHTOT.setBigDecimal(newvalue);
    }

    /**
     * Return value of numeric field HTOT as a BigDecimal.
     */
    public BigDecimal getBigDecimalHTOT() {
        return fieldHTOT.getBigDecimal();
    }

    /**
     * Set field HFLI using a String value.
     */
    public void setHFLI(String newvalue) {
        fieldHFLI.setString(newvalue);
    }

    /**
     * Get value of field HFLI as a String.
     */
    public String getHFLI() {
        return fieldHFLI.getString();
    }

    /**
     * Set field HAREA using a String value.
     */
    public void setHAREA(String newvalue) {
        fieldHAREA.setString(newvalue);
    }

    /**
     * Get value of field HAREA as a String.
     */
    public String getHAREA() {
        return fieldHAREA.getString();
    }

    /**
     * Set field EFLG0 using a String value.
     */
    public void setEFLG0(String newvalue) {
        fieldEFLG0.setString(newvalue);
    }

    /**
     * Get value of field EFLG0 as a String.
     */
    public String getEFLG0() {
        return fieldEFLG0.getString();
    }

    /**
     * Set field EDSC0 using a String value.
     */
    public void setEDSC0(String newvalue) {
        fieldEDSC0.setString(newvalue);
    }

    /**
     * Get value of field EDSC0 as a String.
     */
    public String getEDSC0() {
        return fieldEDSC0.getString();
    }

    /**
     * Set field EDSC1 using a String value.
     */
    public void setEDSC1(String newvalue) {
        fieldEDSC1.setString(newvalue);
    }

    /**
     * Get value of field EDSC1 as a String.
     */
    public String getEDSC1() {
        return fieldEDSC1.getString();
    }

    /**
     * Set field EDSC2 using a String value.
     */
    public void setEDSC2(String newvalue) {
        fieldEDSC2.setString(newvalue);
    }

    /**
     * Get value of field EDSC2 as a String.
     */
    public String getEDSC2() {
        return fieldEDSC2.getString();
    }

    /**
     * Set field EDSC3 using a String value.
     */
    public void setEDSC3(String newvalue) {
        fieldEDSC3.setString(newvalue);
    }

    /**
     * Get value of field EDSC3 as a String.
     */
    public String getEDSC3() {
        return fieldEDSC3.getString();
    }

    /**
     * Set field EDSC4 using a String value.
     */
    public void setEDSC4(String newvalue) {
        fieldEDSC4.setString(newvalue);
    }

    /**
     * Get value of field EDSC4 as a String.
     */
    public String getEDSC4() {
        return fieldEDSC4.getString();
    }

    /**
     * Set field EDSC5 using a String value.
     */
    public void setEDSC5(String newvalue) {
        fieldEDSC5.setString(newvalue);
    }

    /**
     * Get value of field EDSC5 as a String.
     */
    public String getEDSC5() {
        return fieldEDSC5.getString();
    }

    /**
     * Set field EDSC6 using a String value.
     */
    public void setEDSC6(String newvalue) {
        fieldEDSC6.setString(newvalue);
    }

    /**
     * Get value of field EDSC6 as a String.
     */
    public String getEDSC6() {
        return fieldEDSC6.getString();
    }

    /**
     * Set field EDSC7 using a String value.
     */
    public void setEDSC7(String newvalue) {
        fieldEDSC7.setString(newvalue);
    }

    /**
     * Get value of field EDSC7 as a String.
     */
    public String getEDSC7() {
        return fieldEDSC7.getString();
    }

    /**
     * Set field EDSC8 using a String value.
     */
    public void setEDSC8(String newvalue) {
        fieldEDSC8.setString(newvalue);
    }

    /**
     * Get value of field EDSC8 as a String.
     */
    public String getEDSC8() {
        return fieldEDSC8.getString();
    }

    /**
     * Set field EDSC9 using a String value.
     */
    public void setEDSC9(String newvalue) {
        fieldEDSC9.setString(newvalue);
    }

    /**
     * Get value of field EDSC9 as a String.
     */
    public String getEDSC9() {
        return fieldEDSC9.getString();
    }

    /**
     * Set field TABCOD using a String value.
     */
    public void setTABCOD(String newvalue) {
        fieldTABCOD.setString(newvalue);
    }

    /**
     * Get value of field TABCOD as a String.
     */
    public String getTABCOD() {
        return fieldTABCOD.getString();
    }

    /**
     * Set field TABDSC using a String value.
     */
    public void setTABDSC(String newvalue) {
        fieldTABDSC.setString(newvalue);
    }

    /**
     * Get value of field TABDSC as a String.
     */
    public String getTABDSC() {
        return fieldTABDSC.getString();
    }

    /**
     * Set field TABCP1 using a String value.
     */
    public void setTABCP1(String newvalue) {
        fieldTABCP1.setString(newvalue);
    }

    /**
     * Get value of field TABCP1 as a String.
     */
    public String getTABCP1() {
        return fieldTABCP1.getString();
    }

    /**
     * Set field TABCP2 using a String value.
     */
    public void setTABCP2(String newvalue) {
        fieldTABCP2.setString(newvalue);
    }

    /**
     * Get value of field TABCP2 as a String.
     */
    public String getTABCP2() {
        return fieldTABCP2.getString();
    }

}