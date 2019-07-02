package ve.com.sios.gpff.legacy;

import java.io.File;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class GPFFProperties.
 */
public class GPFFProperties {
    /** The Constant LOGGER. */
    private static final Logger LOGGER = LoggerFactory.getLogger(GPFFProperties.class);

    /** The Constant propertyFileName. */
    private static final String propertyFileName = "gpff.properties";

    /** The table. */
    private static Hashtable table = null;

    /** The ultima actualizacion. */
    private static long ultimaActualizacion = 0;

    /**
     * Instantiates a new GPFF properties.
     *
     * @throws URISyntaxException the URI syntax exception
     */
    public GPFFProperties() throws URISyntaxException {
        ultimaActualizacion = new File(GPFFProperties.class.getClassLoader().getResource(propertyFileName).toURI().getPath()).lastModified();
    }

    /**
     * Gets the property file name.
     *
     * @return the property file name
     */
    public static String getPropertyFileName() {
        return propertyFileName;
    }

    /**
     * Checks if is off to date.
     *
     * @return true, if is off to date
     * @throws URISyntaxException the URI syntax exception
     */
    private static boolean isOffToDate() throws URISyntaxException {
        long last = new File(GPFFProperties.class.getClassLoader().getResource(propertyFileName).toURI().getPath()).lastModified();

        return ultimaActualizacion - last != 0;
    }

    /**
     * Gets the property.
     *
     * @param key the key
     * @return the property
     * @throws Exception the exception
     * @throws URISyntaxException the URI syntax exception
     */
    public static String getProperty(String key) throws Exception, URISyntaxException {

        if (isOffToDate() || table == null || table.get(key) == null) {
            initProperties();
        }
        if (table.get(key) == null) {
            throw new Exception(key + " no esta definida");
        }
        return (String) table.get(key);
    }

    /**
     * Inits the properties.
     */
    public static void initProperties() {
        try {
            Properties properties = new Properties();

            ultimaActualizacion = new File(MenuProperties.class.getClassLoader().getResource(propertyFileName).toURI().getPath()).lastModified();

            InputStream is = GPFFProperties.class.getClassLoader().getResource(propertyFileName).openStream();

            properties.load(is);

            Enumeration enumeration = properties.keys();

            String element = null;
            table = new Hashtable();

            while (enumeration.hasMoreElements()) {
                element = (String) enumeration.nextElement();
                table.put(element, properties.get(element));
            }
            is.close();
        } catch (Exception e) {
            LOGGER.error("Exception: ", e);
        }
    }

}
