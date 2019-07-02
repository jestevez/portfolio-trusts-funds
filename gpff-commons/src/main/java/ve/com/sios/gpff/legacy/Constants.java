package ve.com.sios.gpff.legacy;

/**
 * The Class Constants.
 */
public final class Constants {

    /** The Constant PUNTOS_CONSECUTIVOS. */
    // Valores genericos
    public static final String PUNTOS_CONSECUTIVOS = "puntosConsecutivos";

    /** The Constant VALIDAR_NAVEGADOR. */
    public static final String VALIDAR_NAVEGADOR = "validateNavigator";

    /** The Constant CHAR_SEPARATOR_FILE. */
    public static final String CHAR_SEPARATOR_FILE = "separatorFile";

    /** The Constant SERVER_IP. */
    // Valores para servidor
    public static final String SERVER_IP = "serverIP";

    /** The Constant SERVER_SOCKET. */
    public static final String SERVER_SOCKET = "socket";

    /** The Constant SERVER_SOCKET_TIMEOUT. */
    public static final String SERVER_SOCKET_TIMEOUT = "socketTimeOut";

    /** The Constant LOG_LEVEL. */
    // Variables b�sicas de operacion
    public static final String LOG_LEVEL = "logLevel";

    /** The Constant ROOT_PAGES. */
    public static final String ROOT_PAGES = "rootPages";

    /** The Constant DEFAULT_PACKAGE. */
    public static final String DEFAULT_PACKAGE = "defaultPackage";

    /** The Constant DEFAULT_EXIT_CODES. */
    public static final String DEFAULT_EXIT_CODES = "exitCode";

    /** The Constant DEFAULT_EXIT_HENV. */
    public static final String DEFAULT_EXIT_HENV = "F";

    /** The Constant DEFAULT_RESOURCE_DIR. */
    public static final String DEFAULT_RESOURCE_DIR = "resourceDir";

    /** The Constant MENU_PRINCIPAL. */
    // Opciones de menu
    public static final String MENU_PRINCIPAL = "menuPrincipal";

    /** The Constant MENU_OPCIONES. */
    public static final String MENU_OPCIONES = "menuOpciones";

    /** The Constant MENU_SEGURIDAD. */
    public static final String MENU_SEGURIDAD = "menuSeguridad";

    /** The Constant MENU_PAGE. */
    public static final String MENU_PAGE = "menuPage";

    /** The Constant MENU_POSICION_X. */
    public static final String MENU_POSICION_X = "menuPosicionX";

    /** The Constant MENU_POSICION_Y. */
    public static final String MENU_POSICION_Y = "menuPosicionY";

    /** The Constant MAX_MENU_ITEM_RECENT. */
    public static final String MAX_MENU_ITEM_RECENT = "maxMenuItemRecent";

    /** The Constant QUEUE_TIMEOUT. */
    // Opciones de cola y llamadas a ProgramCall
    public static final String QUEUE_TIMEOUT = "queueTimeOut";

    /** The Constant QUEUE_BASE. */
    public static final String QUEUE_BASE = "queueBase";

    /** The Constant QUEUE_END. */
    public static final String QUEUE_END = "queueEnd";

    /** The Constant CALL_BASE. */
    public static final String CALL_BASE = "callBase";

    /** The Constant CALL_END. */
    public static final String CALL_END = "callEnd";

    /** The Constant CALL_GENERIC. */
    public static final String CALL_GENERIC = "callGeneric";

    /** The Constant CALL_SOCKET_CLIENT. */
    public static final String CALL_SOCKET_CLIENT = "callSocketClient";

    /** The Constant QUEUE_LENGTH. */
    public static final int QUEUE_LENGTH = 9216;

    /** The Constant ENCODING. */
    // Codificacion de caracteres
    public static final String ENCODING = "characterEncoding";

    // Campos genericos
    // Indica si hay o no mas registros:
    /** The Constant HENV. */
    // Si HENV == HSTOP ho hay mas registros
    public static final String HENV = "HENV";

    /** The Constant HSTOP. */
    // Caracter que indica fin de registros
    public static final String HSTOP = "*";

    /** The Constant HXML. */
    // Nombre del archivo XML que debe cargarse
    public static final String HXML = "HXML";

    /** The Constant HSEC. */
    // Nombre de la secci�n que debe mostrase
    public static final String HSEC = "HSEC";

    /** The Constant HIND. */
    // Nombre del campo donde se envian los indicadores
    public static final String HIND = "INDICA";

    /** The Constant IND_NO_DISPLAY. */
    // Indicadores
    public static final String IND_NO_DISPLAY = "ND";

    /** The Constant IND_REVERSE_INPUT. */
    public static final String IND_REVERSE_INPUT = "RI";

    /** The Constant IND_POSITION_CURSOR. */
    public static final String IND_POSITION_CURSOR = "PC";

    /** The Constant IND_FILL_BLANK_R. */
    public static final String IND_FILL_BLANK_R = "RB";

    /** The Constant IND_FILL_BLANK_L. */
    public static final String IND_FILL_BLANK_L = "LB";

    /** The Constant EXCLUYENT_INDICATORS. */
    public static final String EXCLUYENT_INDICATORS = "indica";

    /** The Constant BASIC_FORMAT. */
    // Formato
    public static final String BASIC_FORMAT = "basicFormat";

    /** The Constant DATE_FORMAT. */
    public static final String DATE_FORMAT = "dateFormat";

    /** The Constant NUMBER_FORMAT. */
    public static final String NUMBER_FORMAT = "numberFormat";

    /** The Constant INI_TD. */
    // Para control de tag TABLE
    public static final char INI_TD = 'I';

    /** The Constant FIN_TD. */
    public static final char FIN_TD = 'F';

    /** The Constant NO_TD. */
    public static final char NO_TD = 'N';

    /** The Constant ERROR_SESSION_EXPIRED. */
    // Mensajes varios
    public static final String ERROR_SESSION_EXPIRED = "messageSessionExpired";

    /** The Constant ERROR_CALL. */
    public static final String ERROR_CALL = "messageCallError";

    /** The Constant ERROR_PAGE. */
    public static final String ERROR_PAGE = "messagePageError";

    /** The Constant ERROR_GENERAL. */
    public static final String ERROR_GENERAL = "messageErrorGeneral";

    /** The Constant ERROR_TIME_OUT. */
    public static final String ERROR_TIME_OUT = "messageTimeOut";

    /** The Constant ERROR_SOCKET. */
    public static final String ERROR_SOCKET = "messageSocket";

    /** The Constant ERROR_RESOURCE. */
    public static final String ERROR_RESOURCE = "messageResource";

    /** The Constant ERROR_FATAL. */
    public static final String ERROR_FATAL = "messageErrorFatal";

    /** The Constant ERROR_EOFEXCEPTION. */
    public static final String ERROR_EOFEXCEPTION = "messageEOF";

    /** The Constant ERROR_SERVLET. */
    public static final String ERROR_SERVLET = "messageServlet";

    /** The Constant MAX_PAGINAS_MOSTRAR. */
    // Valores de configuracion de pagineo
    public static final String MAX_PAGINAS_MOSTRAR = "numeroMaximoPaginasMostrar";

    /** The Constant NUMERO_REGISTROS_PAGINA. */
    public static final String NUMERO_REGISTROS_PAGINA = "numeroRegistrosPagina";

    /** The Constant CLIENTE_ASOCIADO. */
    // Codigos de Tablas
    public static final String CLIENTE_ASOCIADO = "T01";

    /** The Constant CODIGO_DE_PAIS. */
    public static final String CODIGO_DE_PAIS = "T02";

    /** The Constant CODIGO_DE_EJECUTIVO. */
    public static final String CODIGO_DE_EJECUTIVO = "T03";

    /** The Constant TIPO_DE_CLASIF_CLIENTE. */
    public static final String TIPO_DE_CLASIF_CLIENTE = "T04";

    /** The Constant CATEGORIA_CLIENTE. */
    public static final String CATEGORIA_CLIENTE = "T05";

    /** The Constant CODIGO_CORPORATIVO. */
    public static final String CODIGO_CORPORATIVO = "T06";

    /** The Constant CODIGO_POSTAL_1. */
    public static final String CODIGO_POSTAL_1 = "T07";

    /** The Constant CODIGO_POSTAL_2. */
    public static final String CODIGO_POSTAL_2 = "T08";

    /** The Constant TIPOS_DE_AREAS. */
    public static final String TIPOS_DE_AREAS = "T09";

    /** The Constant TIPOS_DE_USUARIO. */
    public static final String TIPOS_DE_USUARIO = "T10";

    /** The Constant PRODUCTOS. */
    public static final String PRODUCTOS = "T11";

    /** The Constant CUENTAS_CONTABLES. */
    public static final String CUENTAS_CONTABLES = "T12";

    /** The Constant TIPOS_DE_CONTRATOS. */
    public static final String TIPOS_DE_CONTRATOS = "T13";

    /** The Constant TIPOS_DE_APORTE. */
    public static final String TIPOS_DE_APORTE = "T14";

    /** The Constant TIPOS_DE_DIVISAS. */
    public static final String TIPOS_DE_DIVISAS = "T15";

    /** The Constant TIPO_DE_DEPOSITO. */
    public static final String TIPO_DE_DEPOSITO = "T16";

    /** The Constant TIPO_DE_PAGO. */
    public static final String TIPO_DE_PAGO = "T17";

    /** The Constant TIPO_DE_RETIRO. */
    public static final String TIPO_DE_RETIRO = "T18";

    /** The Constant TIPO_DE_PROYECTO. */
    public static final String TIPO_DE_PROYECTO = "T19";

    /** The Constant SELEC_DE_PRORROGA. */
    public static final String SELEC_DE_PRORROGA = "T20";

    /** The Constant ELEC_DE_INGENIEROS. */
    public static final String ELEC_DE_INGENIEROS = "T21";

    /** The Constant ELEC_VALUACIONES_PREST. */
    public static final String ELEC_VALUACIONES_PREST = "T22";

    /** The Constant TIPO_DE_PRESTAMOS. */
    public static final String TIPO_DE_PRESTAMOS = "T23";

    /** The Constant CONSULTA_DE_OFICINA. */
    public static final String CONSULTA_DE_OFICINA = "T24";

    /** The Constant TABLA_DE_COMIS_FIDEICOM. */
    public static final String TABLA_DE_COMIS_FIDEICOM = "T25";

    /** The Constant TABLA_DE_VALORES. */
    public static final String TABLA_DE_VALORES = "T26";

    /** The Constant PRINT_USER. */
    // Parametros para el servlet de escucha de impresion
    public static final String PRINT_USER = "userPrint";

    /** The Constant PRINT_PASSWORD. */
    public static final String PRINT_PASSWORD = "passwordPrint";

    /** The Constant SLEEP_TIME. */
    public static final String SLEEP_TIME = "sleepTime";

    /**
     * Instantiates a new constants.
     */
    private Constants() {
        super();
    }

}
