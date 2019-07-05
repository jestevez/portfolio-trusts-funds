package ve.com.sios.gpff.exception;

/**
 * The Class GpffBaseException.
 */
public class GpffBaseException extends Exception {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1672625640004515465L;

    /**
     * Instantiates a new gpff base exception.
     */
    public GpffBaseException() {
        super();
    }

    /**
     * Instantiates a new gpff base exception.
     *
     * @param msg the msg
     * @param thr the thr
     */
    public GpffBaseException(String msg, Throwable thr) {
        super(msg, thr);
    }

    /**
     * Instantiates a new gpff base exception.
     *
     * @param msg the msg
     */
    public GpffBaseException(String msg) {
        super(msg);
    }

    /**
     * Instantiates a new gpff base exception.
     *
     * @param thr the thr
     */
    public GpffBaseException(Throwable thr) {
        super(thr);
    }

}
