package ve.com.sios.gpff.exception;

/**
 * The Class GpffDaoException.
 */
public class GpffDaoException extends GpffBaseException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1465910552895452591L;

    /**
     * Instantiates a new gpff dao exception.
     */
    public GpffDaoException() {
        super();
    }

    /**
     * Instantiates a new gpff dao exception.
     *
     * @param msg the msg
     */
    public GpffDaoException(String msg) {
        super(msg);
    }

    /**
     * Instantiates a new gpff dao exception.
     *
     * @param ex the ex
     */
    public GpffDaoException(Exception ex) {
        super(ex);
    }

}
