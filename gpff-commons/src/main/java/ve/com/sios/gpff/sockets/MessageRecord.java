package ve.com.sios.gpff.sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * The MessageRecord class is the abstract superclass of all of the message objects created by the AS/400 CRTCLASS command.
 */
public abstract class MessageRecord {

    /** The mycontext. */
    MessageContext mycontext = null;

    /** The isempty. */
    boolean isempty = false;
    /**
     * Format name set by the concrete subclass.
     */
    protected String formatname = null;
    /**
     * Byte array to contain sent and received messages.
     */
    protected byte[] message = null;
    /**
     * Array of all the fields for this message.
     */
    protected MessageField[] fields = null;
    /**
     * Array of all the field names for this message.
     */
    protected String[] fieldnames = null;
    /**
     * Array of all the tag fields for this message.
     */
    protected String[] tagnames = null;
    /**
     * Hashtable of tag names for fields.
     */
    protected Hashtable taglookup = null;
    /**
     * Size of message.
     */
    protected int recordsize = 0;

    /** File ID of generating file. */
    protected String fileid = null;

    /** Record format level ID of generating file. */
    protected String recordid = null;
    /**
     * The format name is always 10 characters.
     */
    protected final int FORMATNAMESIZE = 10;
    /**
     * The header is the same size as the format name (for now).
     */
    protected final int HEADERSIZE = FORMATNAMESIZE;

    /**
     * All the created classes must implement the createFields method to define the message field structure.
     */
    abstract protected void createFields();

    /**
     * Return this message to the MessageContext cache if there is a MessageContext set.
     */
    public void destroy() {
        if (mycontext != null) {
            mycontext.returnMessageRecord(this);
        }
    }

    /**
     * Returns an enumeration of the fields of this record.
     *
     * @return an enumeration of the fields.
     */
    public Enumeration fieldEnumeration() {
        return new MessageEnumerator(this);
    }

    /**
     * Get the total length of this message in bytes.
     *
     * @return total length of this message.
     */
    public int getByteLength() {
        return HEADERSIZE + recordsize;
    }

    /**
     * Get a message field by field number.
     *
     * @param number the field number for the desired field.
     * @return a reference to the MessageField within this message.
     */
    public MessageField getField(int number) {
        return fields[number];
    }

    /**
     * Get a message field by tag name.
     *
     * @param tag the tag name for the desired field.
     * @return a reference to the MessageField within this message.
     */
    public MessageField getField(String tag) {
        return (MessageField) taglookup.get(tag);
    }

    /**
     * Get the number of fields in this message.
     *
     * @return the number of fields in this message.
     */
    public int getFieldCount() {
        return fields.length;
    }

    /**
     * A convenience method that returns the string value for a field by tag name.
     *
     * @param tag the tag name for the desired field.
     * @return a string containing the current value of the field.
     */
    public String getFieldString(String tag) {
        return getField(tag).getString();
    }

    /**
     * Get the file id of the generating file.
     *
     * @return file identifier.
     */
    public String getFileID() {
        return fileid;
    }

    /**
     * Get the format name as a String.
     *
     * @return the format name for this message.
     */
    public String getFormatName() {
        return formatname;
    }

    /**
     * Get the record level id of the generating file.
     *
     * @return record level id.
     */
    public String getRecordLevelID() {
        return recordid;
    }

    /**
     * Initialize all the fields of this message.
     */
    public void initialize() {
        if (message == null) {
            message = new byte[getByteLength()];
        }

        setFormatNameBytes();

        if (tagnames == null) /*
                               * Older version of generated class
                               */ {
            tagnames = new String[fields.length];

            for (int i = 0; i < fields.length; i++) {
                tagnames[i] = fieldnames[i];
                fields[i].setTag(tagnames[i]);
            }
        }

        if (taglookup == null) {
            taglookup = new Hashtable(fields.length);
            for (int i = 0; i < fields.length; i++) {
                taglookup.put(tagnames[i], fields[i]);
            }
        }

        for (int i = 0; i < fields.length; i++) {
            fields[i].initialize();
        }
    }

    /**
     * Return a boolean value indicating whether this message is empty.
     *
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty() {
        return isempty;
    }

    /**
     * Reset all the fields of this message.
     */
    public void reset() {
        for (int i = 0; i < fields.length; i++) {
            fields[i].reset(message);
        }
    }

    /**
     * Send this message over the datastream of the current MessageContext.
     *
     * @exception IOException if the message cannot be sent over that datastream.
     */
    public void send() throws IOException {
        if (mycontext != null) {
            mycontext.sendMessage(this);
        } else {
            throw new IOException("No MessageContext set for this message.");
        }
    }

    /**
     * Send this message over the specified DataOutputStream.
     *
     * @param outputstream the stream over which this message should be sent.
     * @exception IOException if the message cannot be sent over that datastream.
     */
    public void send(DataOutputStream outputstream) throws IOException {
        if (message != null) {
            if (isempty) {
                outputstream.writeShort(FORMATNAMESIZE);
                outputstream.write(message, 0, 10);
            } else {
                outputstream.writeShort(message.length);
                outputstream.write(message);
                System.out.println(" MESSAGE --->  " + message);
            }
            outputstream.flush();
        }
    }

    /**
     * Set the context for this message. The context can be used to set default data streams and to provide message object caching.
     *
     * @param context the MessageContext for this message.
     */
    public void setContext(MessageContext context) {
        mycontext = context;
    }

    /**
     * Set the empty state of this message.
     *
     * @param emptystate true if empty, false otherwise.
     */
    public void setEmpty(boolean emptystate) {
        isempty = emptystate;
    }

    /**
     * Set the format name bytes in the message byte array.
     */
    protected void setFormatNameBytes() {
        byte[] fbytes = formatname.getBytes();

        for (int i = 0; i < FORMATNAMESIZE; i++) {
            message[i] = (i < fbytes.length) ? fbytes[i] : (byte) ' ';
        }
    }

    /**
     * Set the message byte array to a new value.
     *
     * @param messagebytes an array of bytes of the correct length for this message.
     * @exception IOException if the array is not the correct length for this message.
     */
    public void setMessageBytes(byte[] messagebytes) throws IOException {
        if (messagebytes.length != getByteLength()) {
            throw new IOException("Message length mismatch");
        }

        message = messagebytes;
        reset();
    }

    /**
     * This method is used to assist in debug of applications. It returns a String that contains the contents of all the fields of this message.
     *
     * @return a String that contains the format name and all field names and values.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(1000);

        sb.append(formatname);
        sb.append("Message");

        if (isempty) {
            sb.append(":Empty");
        } else {
            for (int i = 0; i < fields.length; i++) {
                sb.append(":");
                sb.append(fieldnames[i]);
                sb.append("=<");
                sb.append(fields[i].getString());
                sb.append(">");
            }
        }

        return sb.toString();
    }
}