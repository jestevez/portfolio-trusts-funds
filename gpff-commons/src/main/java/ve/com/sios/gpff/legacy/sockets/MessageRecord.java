package ve.com.sios.gpff.legacy.sockets;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import ve.com.sios.gpff.legacy.sockets.routers.MessageRouter;

/**
 * The Class MessageRecord.
 */
public abstract class MessageRecord {

    /** The myhandler. */
    MessageHandler myhandler;

    /** The isempty. */
    boolean isempty;

    /** The detail. */
    Vector detail;

    /** The formatname. */
    protected String formatname;

    /** The message. */
    protected byte message[];

    /** The emessage. */
    protected byte emessage[];

    /** The fields. */
    protected MessageField fields[];

    /** The fieldnames. */
    protected String fieldnames[];

    /** The tagnames. */
    protected String tagnames[];

    /** The taglookup. */
    protected Hashtable taglookup;

    /** The recordsize. */
    protected int recordsize;

    /** The fileid. */
    protected String fileid;

    /** The recordid. */
    protected String recordid;

    /** The formatnamesize. */
    protected final int FORMATNAMESIZE = 10;

    /** The headersize. */
    protected final int HEADERSIZE = 10;

    /**
     * Instantiates a new message record.
     */
    public MessageRecord() {
        myhandler = null;
        isempty = false;
        detail = new Vector();
        formatname = null;
        message = null;
        emessage = null;
        fields = null;
        fieldnames = null;
        tagnames = null;
        taglookup = null;
        recordsize = 0;
        fileid = null;
        recordid = null;
    }

    /**
     * Adds the detail.
     *
     * @param newdetail the newdetail
     */
    public void addDetail(MessageRecord newdetail) {
        detail.addElement(newdetail);
    }

    /**
     * Clear detail.
     */
    public void clearDetail() {
        detail.removeAllElements();
    }

    /**
     * Creates the fields.
     */
    protected abstract void createFields();

    /**
     * Destroy.
     */
    public void destroy() {
        if (myhandler != null)
            myhandler.returnMessageRecord(this);
    }

    /**
     * Detail count.
     *
     * @return the int
     */
    public int detailCount() {
        return detail.size();
    }

    /**
     * Details.
     *
     * @return the enumeration
     */
    public Enumeration details() {
        return detail.elements();
    }

    /**
     * Field enumeration.
     *
     * @return the enumeration
     */
    public Enumeration fieldEnumeration() {
        return new MessageEnumerator(this);
    }

    /**
     * Gets the byte length.
     *
     * @return the byte length
     */
    public int getByteLength() {
        return 10 + recordsize;
    }

    /**
     * Gets the detail.
     *
     * @param index the index
     * @return the detail
     */
    public MessageRecord getDetail(int index) {
        return (MessageRecord) detail.elementAt(index);
    }

    /**
     * Gets the field.
     *
     * @param number the number
     * @return the field
     */
    public MessageField getField(int number) {
        return fields[number];
    }

    /**
     * Gets the field.
     *
     * @param tag the tag
     * @return the field
     */
    public MessageField getField(String tag) {
        if (taglookup.get(tag) != null) {
            return fields[((Integer) taglookup.get(tag)).intValue()];
        }
        return null;
    }

    /**
     * Gets the field count.
     *
     * @return the field count
     */
    public int getFieldCount() {
        return fields.length;
    }

    /**
     * Gets the field string.
     *
     * @param tag the tag
     * @return the field string
     */
    public String getFieldString(String tag) {
        return getField(tag).getString();
    }

    /**
     * Gets the file ID.
     *
     * @return the file ID
     */
    public String getFileID() {
        return fileid;
    }

    /**
     * Gets the format name.
     *
     * @return the format name
     */
    public String getFormatName() {
        return formatname;
    }

    /**
     * Gets the record level ID.
     *
     * @return the record level ID
     */
    public String getRecordLevelID() {
        return recordid;
    }

    /**
     * Initialize.
     */
    public void initialize() {
        if (message == null)
            message = new byte[getByteLength()];
        setFormatNameBytes();
        if (tagnames == null) {
            tagnames = new String[fields.length];
            for (int i = 0; i < fields.length; i++) {
                tagnames[i] = fieldnames[i];
                fields[i].setTag(tagnames[i]);
            }

        }
        if (taglookup == null) {
            taglookup = new Hashtable(tagnames.length);
            for (int i = 0; i < tagnames.length; i++)
                taglookup.put(tagnames[i], new Integer(i));

        }
        for (int i = 0; i < fields.length; i++)
            fields[i].initialize();

    }

    /**
     * Checks if is empty.
     *
     * @return true, if is empty
     */
    public boolean isEmpty() {
        return isempty;
    }

    /**
     * Reset.
     */
    public void reset() {
        for (int i = 0; i < fields.length; i++)
            fields[i].reset(message);

        clearDetail();
    }

    /**
     * Send.
     *
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void send() throws IOException {
        if (myhandler != null)
            myhandler.sendMessage(this);
        else
            throw new IOException("No MessageHandler set for this message.");
    }

    /**
     * Send.
     *
     * @param messagerouter the messagerouter
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void send(MessageRouter messagerouter) throws IOException {
        if (message != null)
            if (isempty)
                messagerouter.send(emessage);
            else
                messagerouter.send(message);
    }

    /**
     * Sets the handler.
     *
     * @param handler the new handler
     */
    public void setHandler(MessageHandler handler) {
        myhandler = handler;
    }

    /**
     * Sets the context.
     *
     * @param context the new context
     */
    public void setContext(MessageContext context) {
        myhandler = context.getHandler();
    }

    /**
     * Sets the empty.
     *
     * @param emptystate the new empty
     */
    public void setEmpty(boolean emptystate) {
        isempty = emptystate;
    }

    /**
     * Sets the format name bytes.
     */
    protected void setFormatNameBytes() {
        byte fbytes[] = formatname.getBytes();
        emessage = new byte[10];
        for (int i = 0; i < 10; i++)
            emessage[i] = message[i] = i >= fbytes.length ? 32 : fbytes[i];

    }

    /**
     * Sets the message bytes.
     *
     * @param messagebytes the new message bytes
     * @throws IOException Signals that an I/O exception has occurred.
     */
    public void setMessageBytes(byte messagebytes[]) throws IOException {
        // if (messagebytes.length != getByteLength()) {
        // throw new IOException("Message length mismatch: " + messagebytes.length + " != " + getByteLength());
        // }
        // System.out.println("length: " + getByteLength());
        if (getByteLength() > messagebytes.length) {
            throw new IOException("Message length mismatch: " + messagebytes.length + " != " + getByteLength());
        }
        // System.out.println("messagebytes: ");
        for (int i = 0; i < getByteLength(); i++) {
            // System.out.print(messagebytes[i]);
            message[i] = messagebytes[i];
        }
        // message = messagebytes;
        reset();
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#toString()
     */
    public String toString() {
        StringBuffer sb = new StringBuffer(1000);
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

    /**
     * Gets the pgm.
     *
     * @return the pgm
     */
    public String getPgm() {
        int p = this.getClass().getSimpleName().indexOf("Message");
        return this.getClass().getSimpleName().substring(0, --p);
    }

}
