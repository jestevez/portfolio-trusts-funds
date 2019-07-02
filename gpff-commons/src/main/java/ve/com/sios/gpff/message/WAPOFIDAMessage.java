package ve.com.sios.gpff.message;

import java.math.BigDecimal;
import java.util.Hashtable;
import ve.com.sios.gpff.sockets.CharacterField;
import ve.com.sios.gpff.sockets.DecimalField;
import ve.com.sios.gpff.sockets.MessageField;
import ve.com.sios.gpff.sockets.MessageRecord;

/**
* Class generated by AS/400 CRTCLASS command from WAPOFIDA physical file definition.
* 
* Aportes al Fideicomiso
* 
* File level identifier is 1130205170014.
* Record format level identifier is 497BF0200B229.
*/

public class WAPOFIDAMessage extends MessageRecord
{
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
EDSC0      CHAR          500     500        54        Ambos    ERRORES
CODARE     CHAR            4       4       554        Ambos    CODIGO DE AREA
FIDNOM     CHAR           40      40       558        Ambos    NOMBRE AREA
FIDTXT     CHAR           14      14       598        Ambos    TIPO DE AREA
DATCLI     PACKED       7  0       4       612        Ambos    COD. INTERNO
NOMBRE     CHAR           50      50       616        Ambos    COD. INTERNO TXT
CLINIF     CHAR           12      12       666        Ambos    RIF
CLICLS     PACKED       2  0       2       678        Ambos    CATEGORIA CLIENTE
CLASE      CHAR           30      30       680        Ambos    NOMBRE CATEGORIA
APOTCN     PACKED       3  0       2       710        Ambos    TIPO DE CONTRATO
TIPCON     CHAR           30      30       712        Ambos    DESC DE CONTRATO
APOCON     PACKED       8  0       5       742        Ambos    NUMERO CONTRATO
FECOPE     PACKED       6  0       4       747        Ambos    FECHA OPERACION DDMMAA
FECVAL     PACKED       6  0       4       751        Ambos    FECHA VALOR DDMMAA
OPETAP     PACKED       2  0       2       755        Ambos    TIPO DE OPERACION
TIPAPO     CHAR           30      30       757        Ambos    DESC DE OPERACION
NUAPO      PACKED       8  0       5       787        Ambos    NUMERO APORTE
APODIV     PACKED       3  0       2       792        Ambos    CODIGO MONEDA
DIVNOM     CHAR           40      40       794        Ambos    DESC MONEDA
MNTAPO     PACKED      15  2       8       834        Ambos    MONTO APORTE
CODTRA     PACKED       3  2       2       842        Ambos    CODIGO TRANSAC.
NOMTRA     CHAR           30      30       844        Ambos    NOMBRE TRANSAC.
APOPRC     PACKED       9  6       5       874        Ambos    COMISION.
APOCOM     PACKED      15  2       8       879        Ambos    MONTO COMISION.
APOTDP     PACKED       2  0       2       887        Ambos    TIPO DEPOSITO
APODEP     CHAR           30      30       889        Ambos    DESC DEPOSITO
APOFPG     PACKED       2  0       2       919        Ambos    CODIGO FORMA PAGO
APOPAG     CHAR           30      30       921        Ambos    DESC FORMA PAGO
OPECTA     CHAR           20      20       951        Ambos    NUMERO CUENTA
APODPV     CHAR            1       1       971        Ambos    DEPOSITA VALORES
REFERE     CHAR           10      10       972        Ambos    REFERENCIA
USU1       CHAR           10      10       982        Ambos    USUARIO
APOOBS     CHAR          200     200       992        Ambos    OBSERVACIONES
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
                                     "CODARE",
                                     "FIDNOM",
                                     "FIDTXT",
                                     "DATCLI",
                                     "NOMBRE",
                                     "CLINIF",
                                     "CLICLS",
                                     "CLASE",
                                     "APOTCN",
                                     "TIPCON",
                                     "APOCON",
                                     "FECOPE",
                                     "FECVAL",
                                     "OPETAP",
                                     "TIPAPO",
                                     "NUAPO",
                                     "APODIV",
                                     "DIVNOM",
                                     "MNTAPO",
                                     "CODTRA",
                                     "NOMTRA",
                                     "APOPRC",
                                     "APOCOM",
                                     "APOTDP",
                                     "APODEP",
                                     "APOFPG",
                                     "APOPAG",
                                     "OPECTA",
                                     "APODPV",
                                     "REFERE",
                                     "USU1",
                                     "APOOBS"
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
                                   "CODARE",
                                   "FIDNOM",
                                   "FIDTXT",
                                   "DATCLI",
                                   "NOMBRE",
                                   "CLINIF",
                                   "CLICLS",
                                   "CLASE",
                                   "APOTCN",
                                   "TIPCON",
                                   "APOCON",
                                   "FECOPE",
                                   "FECVAL",
                                   "OPETAP",
                                   "TIPAPO",
                                   "NUAPO",
                                   "APODIV",
                                   "DIVNOM",
                                   "MNTAPO",
                                   "CODTRA",
                                   "NOMTRA",
                                   "APOPRC",
                                   "APOCOM",
                                   "APOTDP",
                                   "APODEP",
                                   "APOFPG",
                                   "APOPAG",
                                   "OPECTA",
                                   "APODPV",
                                   "REFERE",
                                   "USU1",
                                   "APOOBS"
                                 };
  final static String fid = "1130205170014";
  final static String rid = "497BF0200B229";
  final static String fmtname = "WAPOFIDA";
  final int FIELDCOUNT = 46;
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
  private CharacterField fieldCODARE = null;
  private CharacterField fieldFIDNOM = null;
  private CharacterField fieldFIDTXT = null;
  private DecimalField fieldDATCLI = null;
  private CharacterField fieldNOMBRE = null;
  private CharacterField fieldCLINIF = null;
  private DecimalField fieldCLICLS = null;
  private CharacterField fieldCLASE = null;
  private DecimalField fieldAPOTCN = null;
  private CharacterField fieldTIPCON = null;
  private DecimalField fieldAPOCON = null;
  private DecimalField fieldFECOPE = null;
  private DecimalField fieldFECVAL = null;
  private DecimalField fieldOPETAP = null;
  private CharacterField fieldTIPAPO = null;
  private DecimalField fieldNUAPO = null;
  private DecimalField fieldAPODIV = null;
  private CharacterField fieldDIVNOM = null;
  private DecimalField fieldMNTAPO = null;
  private DecimalField fieldCODTRA = null;
  private CharacterField fieldNOMTRA = null;
  private DecimalField fieldAPOPRC = null;
  private DecimalField fieldAPOCOM = null;
  private DecimalField fieldAPOTDP = null;
  private CharacterField fieldAPODEP = null;
  private DecimalField fieldAPOFPG = null;
  private CharacterField fieldAPOPAG = null;
  private CharacterField fieldOPECTA = null;
  private CharacterField fieldAPODPV = null;
  private CharacterField fieldREFERE = null;
  private CharacterField fieldUSU1 = null;
  private CharacterField fieldAPOOBS = null;

  /**
  * Constructor for WAPOFIDAMessage.
  */
  public WAPOFIDAMessage()
  {
    createFields();
    initialize();
  }

  /**
  * Create fields for this message.
  * This method implements the abstract method in the MessageRecord superclass.
  */
  protected void createFields()
  {
    recordsize = 1263;
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
    new CharacterField(message, HEADERSIZE + 72, 500, "EDSC0");
    fields[14] = fieldCODARE =
    new CharacterField(message, HEADERSIZE + 572, 4, "CODARE");
    fields[15] = fieldFIDNOM =
    new CharacterField(message, HEADERSIZE + 576, 40, "FIDNOM");
    fields[16] = fieldFIDTXT =
    new CharacterField(message, HEADERSIZE + 616, 14, "FIDTXT");
    fields[17] = fieldDATCLI =
    new DecimalField(message, HEADERSIZE + 630, 8, 0, "DATCLI");
    fields[18] = fieldNOMBRE =
    new CharacterField(message, HEADERSIZE + 638, 50, "NOMBRE");
    fields[19] = fieldCLINIF =
    new CharacterField(message, HEADERSIZE + 688, 12, "CLINIF");
    fields[20] = fieldCLICLS =
    new DecimalField(message, HEADERSIZE + 700, 3, 0, "CLICLS");
    fields[21] = fieldCLASE =
    new CharacterField(message, HEADERSIZE + 703, 30, "CLASE");
    fields[22] = fieldAPOTCN =
    new DecimalField(message, HEADERSIZE + 733, 4, 0, "APOTCN");
    fields[23] = fieldTIPCON =
    new CharacterField(message, HEADERSIZE + 737, 30, "TIPCON");
    fields[24] = fieldAPOCON =
    new DecimalField(message, HEADERSIZE + 767, 9, 0, "APOCON");
    fields[25] = fieldFECOPE =
    new DecimalField(message, HEADERSIZE + 776, 7, 0, "FECOPE");
    fields[26] = fieldFECVAL =
    new DecimalField(message, HEADERSIZE + 783, 7, 0, "FECVAL");
    fields[27] = fieldOPETAP =
    new DecimalField(message, HEADERSIZE + 790, 3, 0, "OPETAP");
    fields[28] = fieldTIPAPO =
    new CharacterField(message, HEADERSIZE + 793, 30, "TIPAPO");
    fields[29] = fieldNUAPO =
    new DecimalField(message, HEADERSIZE + 823, 9, 0, "NUAPO");
    fields[30] = fieldAPODIV =
    new DecimalField(message, HEADERSIZE + 832, 4, 0, "APODIV");
    fields[31] = fieldDIVNOM =
    new CharacterField(message, HEADERSIZE + 836, 40, "DIVNOM");
    fields[32] = fieldMNTAPO =
    new DecimalField(message, HEADERSIZE + 876, 17, 2, "MNTAPO");
    fields[33] = fieldCODTRA =
    new DecimalField(message, HEADERSIZE + 893, 5, 2, "CODTRA");
    fields[34] = fieldNOMTRA =
    new CharacterField(message, HEADERSIZE + 898, 30, "NOMTRA");
    fields[35] = fieldAPOPRC =
    new DecimalField(message, HEADERSIZE + 928, 11, 6, "APOPRC");
    fields[36] = fieldAPOCOM =
    new DecimalField(message, HEADERSIZE + 939, 17, 2, "APOCOM");
    fields[37] = fieldAPOTDP =
    new DecimalField(message, HEADERSIZE + 956, 3, 0, "APOTDP");
    fields[38] = fieldAPODEP =
    new CharacterField(message, HEADERSIZE + 959, 30, "APODEP");
    fields[39] = fieldAPOFPG =
    new DecimalField(message, HEADERSIZE + 989, 3, 0, "APOFPG");
    fields[40] = fieldAPOPAG =
    new CharacterField(message, HEADERSIZE + 992, 30, "APOPAG");
    fields[41] = fieldOPECTA =
    new CharacterField(message, HEADERSIZE + 1022, 20, "OPECTA");
    fields[42] = fieldAPODPV =
    new CharacterField(message, HEADERSIZE + 1042, 1, "APODPV");
    fields[43] = fieldREFERE =
    new CharacterField(message, HEADERSIZE + 1043, 10, "REFERE");
    fields[44] = fieldUSU1 =
    new CharacterField(message, HEADERSIZE + 1053, 10, "USU1");
    fields[45] = fieldAPOOBS =
    new CharacterField(message, HEADERSIZE + 1063, 200, "APOOBS");

    synchronized (tlookup)
    {
      if (tlookup.isEmpty())
      {
        for (int i = 0; i < tnames.length; i++)
          tlookup.put(tnames[i], new Integer(i));
      }
    }

    taglookup = tlookup;
  }

  /**
  * Set field HPGM using a String value.
  */
  public void setHPGM(String newvalue)
  {
    fieldHPGM.setString(newvalue);
  }

  /**
  * Get value of field HPGM as a String.
  */
  public String getHPGM()
  {
    return fieldHPGM.getString();
  }

  /**
  * Set field HDAT using a String value.
  */
  public void setHDAT(String newvalue)
  {
    fieldHDAT.setString(newvalue);
  }

  /**
  * Get value of field HDAT as a String.
  */
  public String getHDAT()
  {
    return fieldHDAT.getString();
  }

  /**
  * Set numeric field HDAT using a BigDecimal value.
  */
  public void setHDAT(BigDecimal newvalue)
  {
    fieldHDAT.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field HDAT as a BigDecimal.
  */
  public BigDecimal getBigDecimalHDAT()
  {
    return fieldHDAT.getBigDecimal();
  }

  /**
  * Set field HTIM using a String value.
  */
  public void setHTIM(String newvalue)
  {
    fieldHTIM.setString(newvalue);
  }

  /**
  * Get value of field HTIM as a String.
  */
  public String getHTIM()
  {
    return fieldHTIM.getString();
  }

  /**
  * Set numeric field HTIM using a BigDecimal value.
  */
  public void setHTIM(BigDecimal newvalue)
  {
    fieldHTIM.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field HTIM as a BigDecimal.
  */
  public BigDecimal getBigDecimalHTIM()
  {
    return fieldHTIM.getBigDecimal();
  }

  /**
  * Set field HUSR using a String value.
  */
  public void setHUSR(String newvalue)
  {
    fieldHUSR.setString(newvalue);
  }

  /**
  * Get value of field HUSR as a String.
  */
  public String getHUSR()
  {
    return fieldHUSR.getString();
  }

  /**
  * Set field HENV using a String value.
  */
  public void setHENV(String newvalue)
  {
    fieldHENV.setString(newvalue);
  }

  /**
  * Get value of field HENV as a String.
  */
  public String getHENV()
  {
    return fieldHENV.getString();
  }

  /**
  * Set field HPRO using a String value.
  */
  public void setHPRO(String newvalue)
  {
    fieldHPRO.setString(newvalue);
  }

  /**
  * Get value of field HPRO as a String.
  */
  public String getHPRO()
  {
    return fieldHPRO.getString();
  }

  /**
  * Set field HRIN using a String value.
  */
  public void setHRIN(String newvalue)
  {
    fieldHRIN.setString(newvalue);
  }

  /**
  * Get value of field HRIN as a String.
  */
  public String getHRIN()
  {
    return fieldHRIN.getString();
  }

  /**
  * Set numeric field HRIN using a BigDecimal value.
  */
  public void setHRIN(BigDecimal newvalue)
  {
    fieldHRIN.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field HRIN as a BigDecimal.
  */
  public BigDecimal getBigDecimalHRIN()
  {
    return fieldHRIN.getBigDecimal();
  }

  /**
  * Set field HNRE using a String value.
  */
  public void setHNRE(String newvalue)
  {
    fieldHNRE.setString(newvalue);
  }

  /**
  * Get value of field HNRE as a String.
  */
  public String getHNRE()
  {
    return fieldHNRE.getString();
  }

  /**
  * Set numeric field HNRE using a BigDecimal value.
  */
  public void setHNRE(BigDecimal newvalue)
  {
    fieldHNRE.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field HNRE as a BigDecimal.
  */
  public BigDecimal getBigDecimalHNRE()
  {
    return fieldHNRE.getBigDecimal();
  }

  /**
  * Set field HRRL using a String value.
  */
  public void setHRRL(String newvalue)
  {
    fieldHRRL.setString(newvalue);
  }

  /**
  * Get value of field HRRL as a String.
  */
  public String getHRRL()
  {
    return fieldHRRL.getString();
  }

  /**
  * Set numeric field HRRL using a BigDecimal value.
  */
  public void setHRRL(BigDecimal newvalue)
  {
    fieldHRRL.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field HRRL as a BigDecimal.
  */
  public BigDecimal getBigDecimalHRRL()
  {
    return fieldHRRL.getBigDecimal();
  }

  /**
  * Set field HTOT using a String value.
  */
  public void setHTOT(String newvalue)
  {
    fieldHTOT.setString(newvalue);
  }

  /**
  * Get value of field HTOT as a String.
  */
  public String getHTOT()
  {
    return fieldHTOT.getString();
  }

  /**
  * Set numeric field HTOT using a BigDecimal value.
  */
  public void setHTOT(BigDecimal newvalue)
  {
    fieldHTOT.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field HTOT as a BigDecimal.
  */
  public BigDecimal getBigDecimalHTOT()
  {
    return fieldHTOT.getBigDecimal();
  }

  /**
  * Set field HFLI using a String value.
  */
  public void setHFLI(String newvalue)
  {
    fieldHFLI.setString(newvalue);
  }

  /**
  * Get value of field HFLI as a String.
  */
  public String getHFLI()
  {
    return fieldHFLI.getString();
  }

  /**
  * Set field HAREA using a String value.
  */
  public void setHAREA(String newvalue)
  {
    fieldHAREA.setString(newvalue);
  }

  /**
  * Get value of field HAREA as a String.
  */
  public String getHAREA()
  {
    return fieldHAREA.getString();
  }

  /**
  * Set field EFLG0 using a String value.
  */
  public void setEFLG0(String newvalue)
  {
    fieldEFLG0.setString(newvalue);
  }

  /**
  * Get value of field EFLG0 as a String.
  */
  public String getEFLG0()
  {
    return fieldEFLG0.getString();
  }

  /**
  * Set field EDSC0 using a String value.
  */
  public void setEDSC0(String newvalue)
  {
    fieldEDSC0.setString(newvalue);
  }

  /**
  * Get value of field EDSC0 as a String.
  */
  public String getEDSC0()
  {
    return fieldEDSC0.getString();
  }

  /**
  * Set field CODARE using a String value.
  */
  public void setCODARE(String newvalue)
  {
    fieldCODARE.setString(newvalue);
  }

  /**
  * Get value of field CODARE as a String.
  */
  public String getCODARE()
  {
    return fieldCODARE.getString();
  }

  /**
  * Set field FIDNOM using a String value.
  */
  public void setFIDNOM(String newvalue)
  {
    fieldFIDNOM.setString(newvalue);
  }

  /**
  * Get value of field FIDNOM as a String.
  */
  public String getFIDNOM()
  {
    return fieldFIDNOM.getString();
  }

  /**
  * Set field FIDTXT using a String value.
  */
  public void setFIDTXT(String newvalue)
  {
    fieldFIDTXT.setString(newvalue);
  }

  /**
  * Get value of field FIDTXT as a String.
  */
  public String getFIDTXT()
  {
    return fieldFIDTXT.getString();
  }

  /**
  * Set field DATCLI using a String value.
  */
  public void setDATCLI(String newvalue)
  {
    fieldDATCLI.setString(newvalue);
  }

  /**
  * Get value of field DATCLI as a String.
  */
  public String getDATCLI()
  {
    return fieldDATCLI.getString();
  }

  /**
  * Set numeric field DATCLI using a BigDecimal value.
  */
  public void setDATCLI(BigDecimal newvalue)
  {
    fieldDATCLI.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field DATCLI as a BigDecimal.
  */
  public BigDecimal getBigDecimalDATCLI()
  {
    return fieldDATCLI.getBigDecimal();
  }

  /**
  * Set field NOMBRE using a String value.
  */
  public void setNOMBRE(String newvalue)
  {
    fieldNOMBRE.setString(newvalue);
  }

  /**
  * Get value of field NOMBRE as a String.
  */
  public String getNOMBRE()
  {
    return fieldNOMBRE.getString();
  }

  /**
  * Set field CLINIF using a String value.
  */
  public void setCLINIF(String newvalue)
  {
    fieldCLINIF.setString(newvalue);
  }

  /**
  * Get value of field CLINIF as a String.
  */
  public String getCLINIF()
  {
    return fieldCLINIF.getString();
  }

  /**
  * Set field CLICLS using a String value.
  */
  public void setCLICLS(String newvalue)
  {
    fieldCLICLS.setString(newvalue);
  }

  /**
  * Get value of field CLICLS as a String.
  */
  public String getCLICLS()
  {
    return fieldCLICLS.getString();
  }

  /**
  * Set numeric field CLICLS using a BigDecimal value.
  */
  public void setCLICLS(BigDecimal newvalue)
  {
    fieldCLICLS.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field CLICLS as a BigDecimal.
  */
  public BigDecimal getBigDecimalCLICLS()
  {
    return fieldCLICLS.getBigDecimal();
  }

  /**
  * Set field CLASE using a String value.
  */
  public void setCLASE(String newvalue)
  {
    fieldCLASE.setString(newvalue);
  }

  /**
  * Get value of field CLASE as a String.
  */
  public String getCLASE()
  {
    return fieldCLASE.getString();
  }

  /**
  * Set field APOTCN using a String value.
  */
  public void setAPOTCN(String newvalue)
  {
    fieldAPOTCN.setString(newvalue);
  }

  /**
  * Get value of field APOTCN as a String.
  */
  public String getAPOTCN()
  {
    return fieldAPOTCN.getString();
  }

  /**
  * Set numeric field APOTCN using a BigDecimal value.
  */
  public void setAPOTCN(BigDecimal newvalue)
  {
    fieldAPOTCN.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field APOTCN as a BigDecimal.
  */
  public BigDecimal getBigDecimalAPOTCN()
  {
    return fieldAPOTCN.getBigDecimal();
  }

  /**
  * Set field TIPCON using a String value.
  */
  public void setTIPCON(String newvalue)
  {
    fieldTIPCON.setString(newvalue);
  }

  /**
  * Get value of field TIPCON as a String.
  */
  public String getTIPCON()
  {
    return fieldTIPCON.getString();
  }

  /**
  * Set field APOCON using a String value.
  */
  public void setAPOCON(String newvalue)
  {
    fieldAPOCON.setString(newvalue);
  }

  /**
  * Get value of field APOCON as a String.
  */
  public String getAPOCON()
  {
    return fieldAPOCON.getString();
  }

  /**
  * Set numeric field APOCON using a BigDecimal value.
  */
  public void setAPOCON(BigDecimal newvalue)
  {
    fieldAPOCON.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field APOCON as a BigDecimal.
  */
  public BigDecimal getBigDecimalAPOCON()
  {
    return fieldAPOCON.getBigDecimal();
  }

  /**
  * Set field FECOPE using a String value.
  */
  public void setFECOPE(String newvalue)
  {
    fieldFECOPE.setString(newvalue);
  }

  /**
  * Get value of field FECOPE as a String.
  */
  public String getFECOPE()
  {
    return fieldFECOPE.getString();
  }

  /**
  * Set numeric field FECOPE using a BigDecimal value.
  */
  public void setFECOPE(BigDecimal newvalue)
  {
    fieldFECOPE.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field FECOPE as a BigDecimal.
  */
  public BigDecimal getBigDecimalFECOPE()
  {
    return fieldFECOPE.getBigDecimal();
  }

  /**
  * Set field FECVAL using a String value.
  */
  public void setFECVAL(String newvalue)
  {
    fieldFECVAL.setString(newvalue);
  }

  /**
  * Get value of field FECVAL as a String.
  */
  public String getFECVAL()
  {
    return fieldFECVAL.getString();
  }

  /**
  * Set numeric field FECVAL using a BigDecimal value.
  */
  public void setFECVAL(BigDecimal newvalue)
  {
    fieldFECVAL.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field FECVAL as a BigDecimal.
  */
  public BigDecimal getBigDecimalFECVAL()
  {
    return fieldFECVAL.getBigDecimal();
  }

  /**
  * Set field OPETAP using a String value.
  */
  public void setOPETAP(String newvalue)
  {
    fieldOPETAP.setString(newvalue);
  }

  /**
  * Get value of field OPETAP as a String.
  */
  public String getOPETAP()
  {
    return fieldOPETAP.getString();
  }

  /**
  * Set numeric field OPETAP using a BigDecimal value.
  */
  public void setOPETAP(BigDecimal newvalue)
  {
    fieldOPETAP.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field OPETAP as a BigDecimal.
  */
  public BigDecimal getBigDecimalOPETAP()
  {
    return fieldOPETAP.getBigDecimal();
  }

  /**
  * Set field TIPAPO using a String value.
  */
  public void setTIPAPO(String newvalue)
  {
    fieldTIPAPO.setString(newvalue);
  }

  /**
  * Get value of field TIPAPO as a String.
  */
  public String getTIPAPO()
  {
    return fieldTIPAPO.getString();
  }

  /**
  * Set field NUAPO using a String value.
  */
  public void setNUAPO(String newvalue)
  {
    fieldNUAPO.setString(newvalue);
  }

  /**
  * Get value of field NUAPO as a String.
  */
  public String getNUAPO()
  {
    return fieldNUAPO.getString();
  }

  /**
  * Set numeric field NUAPO using a BigDecimal value.
  */
  public void setNUAPO(BigDecimal newvalue)
  {
    fieldNUAPO.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field NUAPO as a BigDecimal.
  */
  public BigDecimal getBigDecimalNUAPO()
  {
    return fieldNUAPO.getBigDecimal();
  }

  /**
  * Set field APODIV using a String value.
  */
  public void setAPODIV(String newvalue)
  {
    fieldAPODIV.setString(newvalue);
  }

  /**
  * Get value of field APODIV as a String.
  */
  public String getAPODIV()
  {
    return fieldAPODIV.getString();
  }

  /**
  * Set numeric field APODIV using a BigDecimal value.
  */
  public void setAPODIV(BigDecimal newvalue)
  {
    fieldAPODIV.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field APODIV as a BigDecimal.
  */
  public BigDecimal getBigDecimalAPODIV()
  {
    return fieldAPODIV.getBigDecimal();
  }

  /**
  * Set field DIVNOM using a String value.
  */
  public void setDIVNOM(String newvalue)
  {
    fieldDIVNOM.setString(newvalue);
  }

  /**
  * Get value of field DIVNOM as a String.
  */
  public String getDIVNOM()
  {
    return fieldDIVNOM.getString();
  }

  /**
  * Set field MNTAPO using a String value.
  */
  public void setMNTAPO(String newvalue)
  {
    fieldMNTAPO.setString(newvalue);
  }

  /**
  * Get value of field MNTAPO as a String.
  */
  public String getMNTAPO()
  {
    return fieldMNTAPO.getString();
  }

  /**
  * Set numeric field MNTAPO using a BigDecimal value.
  */
  public void setMNTAPO(BigDecimal newvalue)
  {
    fieldMNTAPO.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field MNTAPO as a BigDecimal.
  */
  public BigDecimal getBigDecimalMNTAPO()
  {
    return fieldMNTAPO.getBigDecimal();
  }

  /**
  * Set field CODTRA using a String value.
  */
  public void setCODTRA(String newvalue)
  {
    fieldCODTRA.setString(newvalue);
  }

  /**
  * Get value of field CODTRA as a String.
  */
  public String getCODTRA()
  {
    return fieldCODTRA.getString();
  }

  /**
  * Set numeric field CODTRA using a BigDecimal value.
  */
  public void setCODTRA(BigDecimal newvalue)
  {
    fieldCODTRA.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field CODTRA as a BigDecimal.
  */
  public BigDecimal getBigDecimalCODTRA()
  {
    return fieldCODTRA.getBigDecimal();
  }

  /**
  * Set field NOMTRA using a String value.
  */
  public void setNOMTRA(String newvalue)
  {
    fieldNOMTRA.setString(newvalue);
  }

  /**
  * Get value of field NOMTRA as a String.
  */
  public String getNOMTRA()
  {
    return fieldNOMTRA.getString();
  }

  /**
  * Set field APOPRC using a String value.
  */
  public void setAPOPRC(String newvalue)
  {
    fieldAPOPRC.setString(newvalue);
  }

  /**
  * Get value of field APOPRC as a String.
  */
  public String getAPOPRC()
  {
    return fieldAPOPRC.getString();
  }

  /**
  * Set numeric field APOPRC using a BigDecimal value.
  */
  public void setAPOPRC(BigDecimal newvalue)
  {
    fieldAPOPRC.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field APOPRC as a BigDecimal.
  */
  public BigDecimal getBigDecimalAPOPRC()
  {
    return fieldAPOPRC.getBigDecimal();
  }

  /**
  * Set field APOCOM using a String value.
  */
  public void setAPOCOM(String newvalue)
  {
    fieldAPOCOM.setString(newvalue);
  }

  /**
  * Get value of field APOCOM as a String.
  */
  public String getAPOCOM()
  {
    return fieldAPOCOM.getString();
  }

  /**
  * Set numeric field APOCOM using a BigDecimal value.
  */
  public void setAPOCOM(BigDecimal newvalue)
  {
    fieldAPOCOM.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field APOCOM as a BigDecimal.
  */
  public BigDecimal getBigDecimalAPOCOM()
  {
    return fieldAPOCOM.getBigDecimal();
  }

  /**
  * Set field APOTDP using a String value.
  */
  public void setAPOTDP(String newvalue)
  {
    fieldAPOTDP.setString(newvalue);
  }

  /**
  * Get value of field APOTDP as a String.
  */
  public String getAPOTDP()
  {
    return fieldAPOTDP.getString();
  }

  /**
  * Set numeric field APOTDP using a BigDecimal value.
  */
  public void setAPOTDP(BigDecimal newvalue)
  {
    fieldAPOTDP.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field APOTDP as a BigDecimal.
  */
  public BigDecimal getBigDecimalAPOTDP()
  {
    return fieldAPOTDP.getBigDecimal();
  }

  /**
  * Set field APODEP using a String value.
  */
  public void setAPODEP(String newvalue)
  {
    fieldAPODEP.setString(newvalue);
  }

  /**
  * Get value of field APODEP as a String.
  */
  public String getAPODEP()
  {
    return fieldAPODEP.getString();
  }

  /**
  * Set field APOFPG using a String value.
  */
  public void setAPOFPG(String newvalue)
  {
    fieldAPOFPG.setString(newvalue);
  }

  /**
  * Get value of field APOFPG as a String.
  */
  public String getAPOFPG()
  {
    return fieldAPOFPG.getString();
  }

  /**
  * Set numeric field APOFPG using a BigDecimal value.
  */
  public void setAPOFPG(BigDecimal newvalue)
  {
    fieldAPOFPG.setBigDecimal(newvalue);
  }

  /**
  * Return value of numeric field APOFPG as a BigDecimal.
  */
  public BigDecimal getBigDecimalAPOFPG()
  {
    return fieldAPOFPG.getBigDecimal();
  }

  /**
  * Set field APOPAG using a String value.
  */
  public void setAPOPAG(String newvalue)
  {
    fieldAPOPAG.setString(newvalue);
  }

  /**
  * Get value of field APOPAG as a String.
  */
  public String getAPOPAG()
  {
    return fieldAPOPAG.getString();
  }

  /**
  * Set field OPECTA using a String value.
  */
  public void setOPECTA(String newvalue)
  {
    fieldOPECTA.setString(newvalue);
  }

  /**
  * Get value of field OPECTA as a String.
  */
  public String getOPECTA()
  {
    return fieldOPECTA.getString();
  }

  /**
  * Set field APODPV using a String value.
  */
  public void setAPODPV(String newvalue)
  {
    fieldAPODPV.setString(newvalue);
  }

  /**
  * Get value of field APODPV as a String.
  */
  public String getAPODPV()
  {
    return fieldAPODPV.getString();
  }

  /**
  * Set field REFERE using a String value.
  */
  public void setREFERE(String newvalue)
  {
    fieldREFERE.setString(newvalue);
  }

  /**
  * Get value of field REFERE as a String.
  */
  public String getREFERE()
  {
    return fieldREFERE.getString();
  }

  /**
  * Set field USU1 using a String value.
  */
  public void setUSU1(String newvalue)
  {
    fieldUSU1.setString(newvalue);
  }

  /**
  * Get value of field USU1 as a String.
  */
  public String getUSU1()
  {
    return fieldUSU1.getString();
  }

  /**
  * Set field APOOBS using a String value.
  */
  public void setAPOOBS(String newvalue)
  {
    fieldAPOOBS.setString(newvalue);
  }

  /**
  * Get value of field APOOBS as a String.
  */
  public String getAPOOBS()
  {
    return fieldAPOOBS.getString();
  }

}
