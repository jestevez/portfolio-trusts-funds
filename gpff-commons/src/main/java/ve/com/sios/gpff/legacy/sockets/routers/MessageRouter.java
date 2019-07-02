package ve.com.sios.gpff.legacy.sockets.routers;

import java.io.IOException;

/**
 * The Class MessageRouter.
 */
public abstract class MessageRouter {

    /** The version. */
    private int version;

    /**
     * Instantiates a new message router.
     */
    public MessageRouter() {
        version = 0;
    }

    /**
     * Close.
     *
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public abstract void close() throws IOException;

    /**
     * Flush.
     *
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public abstract void flush() throws IOException;

    /**
     * Gets the version.
     *
     * @return the version
     */
    public int getVersion() {
        return version;
    }

    /**
     * Initialize.
     */
    public void initialize() {
    }

    /**
     * Open.
     *
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public abstract void open() throws IOException;

    /**
     * Receive.
     *
     * @return the byte[]
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public abstract byte[] receive() throws IOException;

    /**
     * Send.
     *
     * @param abyte0 the abyte 0
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public abstract void send(byte abyte0[]) throws IOException;

    /**
     * Sets the version.
     *
     * @param ver the new version
     */
    public void setVersion(int ver) {
        version = ver;
    }

}
