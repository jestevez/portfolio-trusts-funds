package ve.com.sios.gpff.legacy.sockets;

/**
 * The Class MessageField.
 */
public abstract class MessageField {

    /** The bytes. */
    byte bytes[];

    /** The start. */
    int start;

    /** The length. */
    int length;

    /** The stringvalue. */
    String stringvalue;

    /** The tag. */
    String tag;

    /** The Constant CHARACTERFIELD. */
    public static final int CHARACTERFIELD = 1;

    /** The Constant DECIMALFIELD. */
    public static final int DECIMALFIELD = 2;

    /** The Constant ALIGNLEFT. */
    public static final int ALIGNLEFT = 0;

    /** The Constant ALIGNRIGHT. */
    public static final int ALIGNRIGHT = 1;

    /**
     * Instantiates a new message field.
     *
     * @param messagebytes the messagebytes
     * @param fieldstart the fieldstart
     * @param fieldlength the fieldlength
     */
    public MessageField(byte messagebytes[], int fieldstart, int fieldlength) {
        stringvalue = null;
        tag = null;
        bytes = messagebytes;
        start = fieldstart;
        length = fieldlength;
    }

    /**
     * Instantiates a new message field.
     *
     * @param messagebytes the messagebytes
     * @param fieldstart the fieldstart
     * @param fieldlength the fieldlength
     * @param fieldtag the fieldtag
     */
    public MessageField(byte messagebytes[], int fieldstart, int fieldlength, String fieldtag) {
        this(messagebytes, fieldstart, fieldlength);
        tag = fieldtag;
    }

    /**
     * Gets the decimals.
     *
     * @return the decimals
     */
    public int getDecimals() {
        return -1;
    }

    /**
     * Gets the length.
     *
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * Gets the string.
     *
     * @return the string
     */
    public String getString() {
        if (stringvalue == null)
            stringvalue = makeString();
        return stringvalue;
    }

    /**
     * Gets the tag.
     *
     * @return the tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public abstract int getType();

    /**
     * Initialize.
     */
    public abstract void initialize();

    /**
     * Initialize.
     *
     * @param value the value
     */
    public void initialize(byte value) {
        for (int i = 0; i < length; i++)
            bytes[i + start] = value;

        reset();
    }

    /**
     * Make string.
     *
     * @return the string
     */
    abstract String makeString();

    /**
     * Reset.
     */
    public void reset() {
        stringvalue = null;
    }

    /**
     * Reset.
     *
     * @param messagebytes the messagebytes
     */
    public void reset(byte messagebytes[]) {
        bytes = messagebytes;
        reset();
    }

    /**
     * Sets the bytes.
     *
     * @param newvalue the newvalue
     * @param pad the pad
     * @param alignment the alignment
     * @throws IllegalArgumentException the illegal argument exception
     */
    public void setBytes(String newvalue, byte pad, int alignment) throws IllegalArgumentException {
        // newvalue = newvalue.replace('Ñ', 'N');
        byte rawbytes[] = newvalue.getBytes();
        if (alignment == 1) {
            int sourcepos = rawbytes.length - 1;
            int destpos = (start + length) - 1;
            for (int i = 0; i < length; i++)
                bytes[destpos - i] = i > sourcepos ? pad : rawbytes[sourcepos - i];

        } else {
            int rawlength = rawbytes.length;
            for (int i = 0; i < length; i++)
                bytes[start + i] = i >= rawlength ? pad : rawbytes[i];

        }
        stringvalue = null;
        if (rawbytes.length > length) {
            throw new IllegalArgumentException("Value too long for field");
        }
    }

    /**
     * Sets the message bytes.
     *
     * @param messagebytes the new message bytes
     */
    public void setMessageBytes(byte messagebytes[]) {
        bytes = messagebytes;
        reset();
    }

    /**
     * Sets the string.
     *
     * @param s the new string
     * @throws IllegalArgumentException the illegal argument exception
     */
    public abstract void setString(String s) throws IllegalArgumentException;

    /**
     * Sets the tag.
     *
     * @param fieldtag the new tag
     */
    public void setTag(String fieldtag) {
        tag = fieldtag;
    }

}
