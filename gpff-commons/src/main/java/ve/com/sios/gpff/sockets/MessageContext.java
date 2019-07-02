package ve.com.sios.gpff.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;

/**
 * The MessageContext class can contain information about the connection to be
 * used for incoming and outgoing messages, or about the package that contains
 * the message classes, or both.
 */
public class MessageContext {

    DataInputStream in = null;
    DataOutputStream out = null;
    String messagepackage = null;
    Hashtable classtable = new Hashtable();

    /**
     * Construct a MessageContext object that does not contain information about
     * either the connection or the package. These items can be set later.
     */
    public MessageContext() {
    }

    /**
     * Construct a MessageContext that contains information about a connection
     * in terms of the input and output streams.
     *
     * @param inputstream a stream from which new messages can be received.
     * @param outputstream a stream on which messages can be sent.
     */
    public MessageContext(DataInputStream inputstream,
            DataOutputStream outputstream) {
        in = inputstream;
        out = outputstream;
    }

    /**
     * Construct a MessageContext that contains information about a connection
     * in terms of the input and output streams and the package name for the
     * Message objects.
     *
     * @param inputstream a stream from which new messages can be received.
     * @param outputstream a stream on which messages can be sent.
     * @param packagename the name of the package containing the message
     * objects.
     */
    public MessageContext(DataInputStream inputstream,
            DataOutputStream outputstream,
            String packagename) {
        in = inputstream;
        out = outputstream;
        messagepackage = packagename;
    }

    /**
     * Construct a MessageContext that contains the package name for message
     * classes to be loaded and cached.
     *
     * @param packagename the name of the package containing the message
     * classes.
     */
    public MessageContext(String packagename) {
        messagepackage = packagename;
    }

    /**
     * Get an instance of a specific subclass of MessageRecord.
     *
     * @param formatname the up to 10 character format name used to create the
     * MessageRecord subclass.
     *
     * @return an instance of the specified concrete subclass of MessageRecord.
     *
     * @exception ClassNotFoundException the class could not be found.
     * @exception IllegalAccessException if the class or initializer is not
     * accessible.
     * @exception InstantiationException if an application tries to instantiate
     * an abstract class or an interface, or if the instantiation fails for some
     * other reason.
     *
     */
    public MessageRecord getMessageRecord(String formatname)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MessageRecord message;
        ClassCache entry;

        entry = (ClassCache) classtable.get(formatname);

        if (entry == null) {
            entry = new ClassCache(messagepackage, formatname + "Message");
            classtable.put(formatname, entry);
        }

        message = (MessageRecord) entry.getInstance();
        if (message != null) {
            message.setContext(this);
        }

        return message;
    }

    /**
     * Receive the next message (a concrete subclass of MessageRecord) from the
     * default DataInputStream for this MessageContext.
     *
     * @return a message object which is a concrete subclass of MessageRecord.
     *
     * @exception IOException if there is an error reading the message or
     * constructing the message object.
     */
    public MessageRecord receiveMessage() throws IOException {
        return receiveMessage(in);
    }

    /**
     * Receive the next message (a concrete subclass of MessageRecord) from the
     * specified DataInputStream.
     *
     * @param inputstream a DataInputStream on which a message can be received.
     *
     * @return a message object which is a concrete subclass of MessageRecord.
     *
     * @exception IOException if there is an error reading the message or
     * constructing the message object.
     */
    public MessageRecord receiveMessage(DataInputStream inputstream) throws IOException {
        int length;
        byte[] messagebytes;
        MessageRecord message;
        String formatname;

        length = inputstream.readShort();
        messagebytes = new byte[length];
        inputstream.readFully(messagebytes);

        if (length < 10) {
            throw new IOException("Message length too short.");
        }

        formatname = new String(messagebytes, 0, 10).trim();

        try {
            message = getMessageRecord(formatname);
        } catch (Exception e) {
            throw new IOException("Message class error" + e);
        }

        if (message == null) {
            throw new IOException("Message format " + formatname + " not found.");
        }

        if (length > 10) {
            message.setMessageBytes(messagebytes);
            message.setEmpty(false);
        } else {
            message.setEmpty(true);
        }

        return message;
    }

    /**
     * Return an instance of a message to the appropriate cache.
     *
     * @param message an instance of a MessageRecord subclass that is no longer
     * required.
     */
    public void returnMessageRecord(MessageRecord message) {
        ClassCache entry;

        entry = (ClassCache) classtable.get(message.getFormatName());
        if (entry != null) {
            message.initialize();
            entry.returnInstance(message);
        }
    }

    /**
     * Send a message over the current output stream.
     *
     * @param message an instance of a MessageRecord subclass.
     *
     * @exception IOException if there is any problem sending the message.
     */
    public void sendMessage(MessageRecord message) throws IOException {
        message.send(out);
    }

    /**
     * Set the InputStream for this context.
     *
     * @param inputstream a DataInputStream to be used for receiving messages.
     */
    public void setInputStream(DataInputStream inputstream) {
        in = inputstream;
    }

    /**
     * Set the OutputStream for this context.
     *
     * @param outputstream a DataOutputStream to be used for sending messages.
     */
    public void setOutputStream(DataOutputStream outputstream) {
        out = outputstream;
    }

    /**
     * Set the package for this context.
     *
     * @param package the name of the package containing the message classes for
     * this MessageContext.
     */
    public void setPackage(String packagename) {
        messagepackage = packagename;
    }
}