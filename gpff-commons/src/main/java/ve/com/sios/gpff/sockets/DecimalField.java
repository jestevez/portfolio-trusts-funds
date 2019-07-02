package ve.com.sios.gpff.sockets;

import java.math.BigDecimal;

/**
 * Decimal number field for use in Message objects. This class is used by the
 * generated classes, it is not designed for use outside of those objects.
 */
public class DecimalField extends MessageField {

    BigDecimal decimalvalue = null;
    int decimals;

    /**
     * Constructs a decimal field over the specified byte array at the specified
     * position.
     *
     * @param messagebytes the byte array containing the actual message sent and
     * received.
     * @param fieldstart the starting position of this field in the byte array.
     * @param fieldlength the length of the this field in the byte array.
     * @param fielddecimals the number of digits to the right of the decimal
     * point.
     */
    public DecimalField(byte[] messagebytes,
            int fieldstart,
            int fieldlength,
            int fielddecimals) {
        super(messagebytes, fieldstart, fieldlength);
        decimals = fielddecimals;
    }

    /**
     * Constructs a decimal field over the specified byte array at the specified
     * position with a tag value.
     *
     * @param messagebytes the byte array containing the actual message sent and
     * received.
     * @param fieldstart the starting position of this field in the byte array.
     * @param fieldlength the length of the this field in the byte array.
     * @param fielddecimals the number of digits to the right of the decimal
     * point.
     * @param fieldtag the tag for this field.
     */
    public DecimalField(byte[] messagebytes,
            int fieldstart,
            int fieldlength,
            int fielddecimals,
            String fieldtag) {
        super(messagebytes, fieldstart, fieldlength, fieldtag);
        decimals = fielddecimals;
    }

    /**
     * Get the value of this field as a BigDecimal.
     *
     * @return BigDecimal containing field value.
     */
    public BigDecimal getBigDecimal() {
        if (decimalvalue == null) {
            decimalvalue = new BigDecimal(new String(bytes, start, length).trim());
        }

        return decimalvalue;
    }

    /**
     * Return the number of digits to the right of the decimal point for this
     * number.
     *
     * @return number of digits to right of decimal.
     */
    @Override
    public int getDecimals() {
        return decimals;
    }

    /**
     * Get the total number of digits in this number. The actual message buffer
     * length will be 1 (or 2 if there are digits to the right of the decimal)
     * bytes longer than this value.
     *
     * @return the total number of digits for this number.
     */
    @Override
    public int getLength() {
        return (length - 1) - (decimals > 0 ? 1 : 0);
    }

    /**
     * Implementation of abstract method required by MessageField superclass.
     *
     * @return MessageField.DECIMALFIELD
     */
    public int getType() {
        return DECIMALFIELD;
    }

    /**
     * Initialize field to zero.
     */
    public void initialize() {
        initialize((byte) '0');
        bytes[start] = (byte) ' ';
        if (decimals != 0) {
            bytes[start + length - decimals - 1] = (byte) '.';
        }
    }

    /**
     * Implementation of abstract method required by MessageField superclass.
     *
     * @return String containing displayable version of field value.
     */
    public String makeString() {
        return getBigDecimal().toString();
    }

    /**
     * Reset return value for field.
     */
    @Override
    public void reset() {
        super.reset();
        decimalvalue = null;
    }

    /**
     * Set the value of the field using a BigDecimal.
     *
     * @param value the new value for the field.
     * @exception NumberFormatException if the field cannot contain the value.
     */
    public void setBigDecimal(BigDecimal value) throws NumberFormatException {
        String svalue;

        if (value.scale() == decimals) {
            decimalvalue = value;
        } else {
            decimalvalue = value.setScale(decimals, BigDecimal.ROUND_HALF_EVEN);
        }

        svalue = decimalvalue.toString();
        if (svalue.length() > length) {
            initialize();
            throw (new NumberFormatException("Number too large for field"));
        }

        setBytes(svalue, (byte) ' ', ALIGNRIGHT);
    }

    /**
     * Implementation of abstract method required by MessageField superclass.
     *
     * @param newvalue the new value for the field.
     * @exception IllegalArgumentException if the field cannot contain the new
     * value.
     */
    public void setString(String newvalue) throws IllegalArgumentException {
        setBigDecimal(new BigDecimal(newvalue));
    }
}