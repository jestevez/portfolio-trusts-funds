package ve.com.sios.gpff.exception;

/**
 * The Class GpffServiceException.
 */
public class GpffServiceException extends GpffBaseException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7748806753207111426L;

    /**
     * Instantiates a new gpff service exception.
     */
    public GpffServiceException() {
        super();
    }

    /**
     * Instantiates a new gpff service exception.
     *
     * @param msg the msg
     */
    public GpffServiceException(String msg) {
        super(msg);
    }

    /**
     * Instantiates a new gpff service exception.
     *
     * @param ex the ex
     */
    public GpffServiceException(Exception ex) {
        super(ex);
    }

}
