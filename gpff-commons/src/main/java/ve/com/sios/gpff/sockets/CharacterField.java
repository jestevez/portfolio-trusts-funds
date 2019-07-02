package ve.com.sios.gpff.sockets;

/**
 * Character field for use in Message objects. This class is designed for use in
 * the generated Message objects. It is not designed for use outside of those
 * objects.
 */
public class CharacterField extends MessageField {

    /**
     * Constructs a character field over the specified message byte array at the
     * specified position.
     *
     * @param messagebytes the byte array containing the actual message sent and
     * received.
     * @param fieldstart the starting position of this field in the byte array.
     * @param fieldlength the length of the this field in the byte array.
     */
    public CharacterField(byte[] messagebytes,
            int fieldstart,
            int fieldlength) {
        super(messagebytes, fieldstart, fieldlength);
    }

    /**
     * Constructs a character field over the specified message byte array at the
     * specified position with a tag value.
     *
     * @param messagebytes the byte array containing the actual message sent and
     * received.
     * @param fieldstart the starting position of this field in the byte array.
     * @param fieldlength the length of the this field in the byte array.
     * @param fieldtag the tag for this field.
     */
    public CharacterField(byte[] messagebytes,
            int fieldstart,
            int fieldlength,
            String fieldtag) {
        super(messagebytes, fieldstart, fieldlength, fieldtag);
    }

    /**
     * Implementation of abstract method required by MessageField superclass.
     *
     * @return MessageField.CHARACTERFIELD
     */
    public int getType() {
        return CHARACTERFIELD;
    }

    /**
     * Initialize field to blanks.
     */
    public void initialize() {
        initialize((byte) ' ');
    }

    /**
     * Implementation of abstract method required by MessageField superclass.
     *
     * @return String containing displayable version of field value.
     */
    String makeString() {
        return new String(bytes, start, length);
    }

    /**
     * Implementation of abstract method required by MessageField superclass.
     *
     * @param newvalue the new value for the field.
     * @exception IllegalArgumentException if the field cannot contain the new
     * value.
     */
    public void setString(String newvalue) throws IllegalArgumentException {
        setBytes(newvalue, (byte) ' ', ALIGNLEFT);
    }
}