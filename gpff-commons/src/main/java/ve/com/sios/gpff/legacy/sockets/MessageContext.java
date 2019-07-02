package ve.com.sios.gpff.legacy.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import ve.com.sios.gpff.legacy.sockets.routers.SocketMessageRouter;

/**
 * The Class MessageContext.
 */
public class MessageContext {

    /** The handler. */
    MessageHandler handler;

    /** The router. */
    SocketMessageRouter router;

    /**
     * Instantiates a new message context.
     */
    public MessageContext() {
        handler = null;
        router = null;
        router = new SocketMessageRouter();
        buildHandler(null);
    }

    /**
     * Instantiates a new message context.
     *
     * @param inputstream the inputstream
     * @param outputstream the outputstream
     */
    public MessageContext(DataInputStream inputstream, DataOutputStream outputstream) {
        handler = null;
        router = null;
        router = new SocketMessageRouter(inputstream, outputstream);
        buildHandler(null);
    }

    /**
     * Instantiates a new message context.
     *
     * @param packagename the packagename
     */
    public MessageContext(String packagename) {
        handler = null;
        router = null;
        router = new SocketMessageRouter();
        buildHandler(packagename);
    }

    /**
     * Instantiates a new message context.
     *
     * @param inputstream the inputstream
     * @param outputstream the outputstream
     * @param packagename the packagename
     */
    public MessageContext(DataInputStream inputstream, DataOutputStream outputstream, String packagename) {
        handler = null;
        router = null;
        router = new SocketMessageRouter(inputstream, outputstream);
        buildHandler(packagename);
    }

    /**
     * Builds the handler.
     *
     * @param packagename the packagename
     */
    private void buildHandler(String packagename) {
        handler = new MessageHandler(packagename);
        handler.setMessageRouter(router);
    }

    /**
     * Sets the input stream.
     *
     * @param inputstream the new input stream
     */
    public void setInputStream(DataInputStream inputstream) {
        router.setInputStream(inputstream);
    }

    /**
     * Sets the output stream.
     *
     * @param outputstream the new output stream
     */
    public void setOutputStream(DataOutputStream outputstream) {
        router.setOutputStream(outputstream);
    }

    /**
     * Sets the package.
     *
     * @param packagename the new package
     */
    public void setPackage(String packagename) {
        handler.setPackage(packagename);
    }

    /**
     * Receive message.
     *
     * @param inputstream the inputstream
     * @return the message record
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public MessageRecord receiveMessage(DataInputStream inputstream) throws IOException {
        DataInputStream holdin = router.getInputStream();
        MessageRecord mr = null;
        router.setInputStream(inputstream);
        mr = handler.receiveMessage();
        router.setInputStream(holdin);
        return mr;
    }

    /**
     * Receive message.
     *
     * @return the message record
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public MessageRecord receiveMessage() throws IOException {
        return handler.receiveMessage();
    }

    /**
     * Gets the handler.
     *
     * @return the handler
     */
    public MessageHandler getHandler() {
        return handler;
    }

    /**
     * Gets the message record.
     *
     * @param formatname the formatname
     * @return the message record
     * @throws ClassNotFoundException the class not found exception
     * @throws IllegalAccessException the illegal access exception
     * @throws InstantiationException the instantiation exception
     */
    public MessageRecord getMessageRecord(String formatname) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return handler.getMessageRecord(formatname);
    }

    /**
     * Return message record.
     *
     * @param message the message
     */
    public void returnMessageRecord(MessageRecord message) {
        handler.returnMessageRecord(message);
    }

    /**
     * Send message.
     *
     * @param message the message
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void sendMessage(MessageRecord message) throws IOException {
        message.send(router);
    }

    /**
     * Close.
     *
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void close() throws IOException {
        router.close();
    }

}
