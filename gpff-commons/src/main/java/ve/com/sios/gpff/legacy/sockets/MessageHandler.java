
package ve.com.sios.gpff.legacy.sockets;

import java.io.IOException;
import java.util.Hashtable;

import ve.com.sios.gpff.legacy.sockets.routers.MessageRouter;

/**
 * The Class MessageHandler.
 */
public class MessageHandler {

    /** The router. */
    MessageRouter router;

    /** The messagepackage. */
    String messagepackage;

    /** The classtable. */
    Hashtable classtable;

    /** The readertable. */
    Hashtable readertable;

    /**
     * Instantiates a new message handler.
     */
    public MessageHandler() {
        router = null;
        messagepackage = null;
        classtable = new Hashtable();
        readertable = new Hashtable();
    }

    /**
     * Instantiates a new message handler.
     *
     * @param messagerouter the messagerouter
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public MessageHandler(MessageRouter messagerouter) throws IOException {
        router = null;
        messagepackage = null;
        classtable = new Hashtable();
        readertable = new Hashtable();
        router = messagerouter;
        router.open();
    }

    /**
     * Instantiates a new message handler.
     *
     * @param messagerouter the messagerouter
     * @param packagename the packagename
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public MessageHandler(MessageRouter messagerouter, String packagename) throws IOException {
        router = null;
        messagepackage = null;
        classtable = new Hashtable();
        readertable = new Hashtable();
        router = messagerouter;
        messagepackage = packagename;
        router.open();
    }

    /**
     * Instantiates a new message handler.
     *
     * @param packagename the packagename
     */
    public MessageHandler(String packagename) {
        router = null;
        messagepackage = null;
        classtable = new Hashtable();
        readertable = new Hashtable();
        messagepackage = packagename;
    }

    /**
     * Flush.
     *
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void flush() throws IOException {
        router.flush();
    }

    /**
     * Gets the message reader.
     *
     * @param formatname the formatname
     * @return the message reader
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public MessageReader getMessageReader(String formatname) throws IOException {
        MessageReader reader = null;
        String classname = formatname + "Reader";
        Object entry = readertable.get(formatname);
        if (entry == null)
            try {
                Class readerclass;
                if (messagepackage == null)
                    readerclass = Class.forName(classname);
                else
                    readerclass = Class.forName(messagepackage + '.' + classname);
                try {
                    reader = (MessageReader) readerclass.newInstance();
                } catch (InstantiationException e) {
                    throw new IOException("Unable to access reader");
                } catch (IllegalAccessException e) {
                    throw new IOException("Illegal access for reader");
                }
                readertable.put(formatname, reader);
            } catch (ClassNotFoundException e) {
                readertable.put(formatname, "Not found");
            }
        if (entry instanceof MessageReader)
            reader = (MessageReader) entry;
        return reader;
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
        ClassCache entry = (ClassCache) classtable.get(formatname);
        if (entry == null) {
            entry = new ClassCache(messagepackage, formatname + "Message");
            classtable.put(formatname, entry);
        }
        MessageRecord message = (MessageRecord) entry.getInstance();
        if (message != null)
            message.setHandler(this);
        return message;
    }

    /**
     * Receive message.
     *
     * @return the message record
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public MessageRecord receiveMessage() throws IOException {
        return receiveMessage(router);
    }

    /**
     * Receive message.
     *
     * @param messagerouter the messagerouter
     * @return the message record
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public MessageRecord receiveMessage(MessageRouter messagerouter) throws IOException {
        flush();
        byte messagebytes[] = messagerouter.receive();
        if (messagebytes.length < 10)
            throw new IOException("Message length too short.");
        String formatname = (new String(messagebytes, 0, 10)).trim();
        MessageRecord message;
        try {
            message = getMessageRecord(formatname);
        } catch (Exception e) {
            throw new IOException("Message class error" + e);
        }
        if (message == null)
            throw new IOException("Message format " + formatname + " not found.");
        if (messagebytes.length > 10) {
            message.setMessageBytes(messagebytes);
            message.setEmpty(false);
            MessageReader reader = getMessageReader(formatname);
            if (reader != null) {
                reader.readDetail(message, this, messagerouter);
            }
        } else {
            message.setEmpty(true);
        }
        return message;
    }

    /**
     * Release message router.
     *
     * @return the message router
     */
    public MessageRouter releaseMessageRouter() {
        MessageRouter rtr = router;
        router = null;
        return rtr;
    }

    /**
     * Return message record.
     *
     * @param message the message
     */
    public void returnMessageRecord(MessageRecord message) {
        ClassCache entry = (ClassCache) classtable.get(message.getFormatName());
        if (entry != null) {
            message.initialize();
            entry.returnInstance(message);
        }
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
     * Sets the message router.
     *
     * @param messagerouter the new message router
     */
    public void setMessageRouter(MessageRouter messagerouter) {
        try {
            if (router != null)
                router.close();
        } catch (IOException ioexception) {
        }
        router = messagerouter;
    }

    /**
     * Sets the package.
     *
     * @param packagename the new package
     */
    public void setPackage(String packagename) {
        messagepackage = packagename;
    }

}
