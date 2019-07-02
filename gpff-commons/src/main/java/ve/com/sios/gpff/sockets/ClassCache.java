package ve.com.sios.gpff.sockets;

import java.util.Vector;

/**
 * The Class ClassCache.
 */
public class ClassCache {

    /** The myclass. */
    private Class myclass;

    /** The instances. */
    private Vector instances;

    /**
     * Instantiates a new class cache.
     *
     * @param packagename the packagename
     * @param classname the classname
     * @throws ClassNotFoundException the class not found exception
     */
    public ClassCache(String packagename, String classname) throws ClassNotFoundException {
        myclass = null;
        instances = new Vector();
        if (packagename == null)
            myclass = Class.forName(classname);
        else
            myclass = Class.forName(packagename + '.' + classname);
    }

    /**
     * Gets the single instance of ClassCache.
     *
     * @return single instance of ClassCache
     * @throws IllegalAccessException the illegal access exception
     * @throws InstantiationException the instantiation exception
     */
    public Object getInstance() throws IllegalAccessException, InstantiationException {
        Object instance = null;
        int lastelement = instances.size() - 1;
        if (lastelement >= 0) {
            instance = instances.elementAt(lastelement);
            instances.removeElementAt(lastelement);
        } else {
            instance = myclass.newInstance();
        }
        return instance;
    }

    /**
     * Return instance.
     *
     * @param returned the returned
     */
    public void returnInstance(Object returned) {
        if (myclass.isInstance(returned))
            instances.addElement(returned);
    }

}
