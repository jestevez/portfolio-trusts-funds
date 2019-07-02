package ve.com.sios.gpff.legacy.sockets;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;

/**
 * The Class DecimalField.
 */
public class DecimalField extends MessageField {

    /** The Constant DECIMAL_FORMAT_MASK. */
    public static final String DECIMAL_FORMAT_MASK = "0";

    /** The decimal format number. */
    static DecimalFormat decimalFormatNumber = null;

    /** The decimalvalue. */
    BigDecimal decimalvalue;

    /** The decimals. */
    int decimals;

    /**
     * Instantiates a new decimal field.
     *
     * @param messagebytes the messagebytes
     * @param fieldstart the fieldstart
     * @param fieldlength the fieldlength
     * @param fielddecimals the fielddecimals
     */
    public DecimalField(byte messagebytes[], int fieldstart, int fieldlength, int fielddecimals) {
        super(messagebytes, fieldstart, fieldlength);
        decimalvalue = null;
        decimals = fielddecimals;
    }

    /**
     * Instantiates a new decimal field.
     *
     * @param messagebytes the messagebytes
     * @param fieldstart the fieldstart
     * @param fieldlength the fieldlength
     * @param fielddecimals the fielddecimals
     * @param fieldtag the fieldtag
     */
    public DecimalField(byte messagebytes[], int fieldstart, int fieldlength, int fielddecimals, String fieldtag) {
        super(messagebytes, fieldstart, fieldlength, fieldtag);
        decimalvalue = null;
        decimals = fielddecimals;
    }

    /**
     * Gets the big decimal.
     *
     * @return the big decimal
     */
    public BigDecimal getBigDecimal() {
        if (decimalvalue == null)
            decimalvalue = new BigDecimal((new String(super.bytes, super.start, super.length)).trim());
        return decimalvalue;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ve.com.sios.gpff.legacy.sockets.MessageField#getDecimals()
     */
    public int getDecimals() {
        return decimals;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ve.com.sios.gpff.legacy.sockets.MessageField#getLength()
     */
    public int getLength() {
        return super.length - 1 - (decimals <= 0 ? 0 : 1);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ve.com.sios.gpff.legacy.sockets.MessageField#getType()
     */
    public int getType() {
        return 2;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ve.com.sios.gpff.legacy.sockets.MessageField#initialize()
     */
    public void initialize() {
        initialize((byte) 48);
        super.bytes[super.start] = 32;
        if (decimals != 0)
            super.bytes[(super.start + super.length) - decimals - 1] = 46;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ve.com.sios.gpff.legacy.sockets.MessageField#makeString()
     */
    public String makeString() {
        try {
            if (decimals == 2)
                return formatCCY(getBigDecimal());
            if (decimals > 0) {
                NumberFormat nf = NumberFormat.getNumberInstance();

                String mask = "0";

                DecimalFormat decimalFormatNumber;
                if (nf instanceof DecimalFormat) {
                    decimalFormatNumber = (DecimalFormat) nf;
                    decimalFormatNumber.applyPattern(mask);
                } else {
                    decimalFormatNumber = new DecimalFormat(mask);
                }
                double numDouble = Double.parseDouble(getBigDecimal().toString());
                return decimalFormatNumber.format(numDouble);
            }
            return getBigDecimal().toString();
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
            return "0";
        }
    }

    /**
     * {@inheritDoc}
     * 
     * @see ve.com.sios.gpff.legacy.sockets.MessageField#reset()
     */
    public void reset() {
        super.reset();
        decimalvalue = null;
    }

    /**
     * Sets the big decimal.
     *
     * @param value the new big decimal
     * @throws NumberFormatException the number format exception
     */
    public void setBigDecimal(BigDecimal value) throws NumberFormatException {
        if (value.scale() == decimals) {
            decimalvalue = value;
        } else {
            decimalvalue = value.round(new MathContext(20, RoundingMode.HALF_UP));
        }
        String svalue = decimalvalue.toString();
        if (svalue.length() > super.length) {
            initialize();
            throw new NumberFormatException("Number too large for field");
        }
        setBytes(svalue, (byte) 32, 1);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ve.com.sios.gpff.legacy.sockets.MessageField#setString(java.lang.String)
     */
    public void setString(String newvalue) throws IllegalArgumentException {
        newvalue = newvalue.trim().length() == 0 ? "0" : newvalue;
        double numDouble = 0.0D;
        numDouble = parseDouble(newvalue);
        setBigDecimal(new BigDecimal(numDouble));
    }

    /**
     * Format CCY.
     *
     * @param value the value
     * @return the string
     */
    public static String formatCCY(String value) {
        double numDouble = 0.0D;
        try {
            numDouble = parseDouble(value);
        } catch (Exception e) {
            return value;
        }
        return formatCCY(numDouble);
    }

    /**
     * Format CCY.
     *
     * @param value the value
     * @return the string
     */
    public static String formatCCY(BigDecimal value) {
        double numDouble = 0.0D;
        if (value != null)
            numDouble = Double.parseDouble(value.toString());
        return formatCCY(numDouble);
    }

    /**
     * Format CCY.
     *
     * @param value the value
     * @return the string
     */
    public static String formatCCY(double value) {
        return getDecimalFormatNumber().format(value);
    }

    /**
     * Parses the double.
     *
     * @param num the num
     * @return the double
     * @throws NumberFormatException the number format exception
     */
    public static double parseDouble(String num) throws NumberFormatException {
        double numDouble = 0.0D;
        try {
            if (num != null)
                numDouble = getDecimalFormatNumber().parse(num.trim()).doubleValue();
        } catch (Exception e) {
            throw new NumberFormatException();
        }
        return numDouble;
    }

    /**
     * Parses the integer part.
     *
     * @param num the num
     * @return the int
     * @throws NumberFormatException the number format exception
     */
    public static int parseIntegerPart(String num) throws NumberFormatException {
        int result = 0;
        double numDouble = parseDouble(num);
        result = (int) numDouble;
        return result;
    }

    /**
     * Sets the decimal format number.
     */
    public static synchronized void setDecimalFormatNumber() {
        NumberFormat nf = NumberFormat.getNumberInstance();
        if (nf instanceof DecimalFormat) {
            decimalFormatNumber = (DecimalFormat) nf;
            decimalFormatNumber.applyPattern(DECIMAL_FORMAT_MASK);
        } else {
            decimalFormatNumber = new DecimalFormat(DECIMAL_FORMAT_MASK);
        }
    }

    /**
     * Gets the decimal format number.
     *
     * @return the decimal format number
     */
    public static DecimalFormat getDecimalFormatNumber() {
        if (decimalFormatNumber == null)
            setDecimalFormatNumber();
        return decimalFormatNumber;
    }

    /**
     * Gets the decimal symbols.
     *
     * @return the decimal symbols
     */
    public static DecimalFormatSymbols getDecimalSymbols() {
        return getDecimalFormatNumber().getDecimalFormatSymbols();
    }

    /**
     * Gets the decimal separator.
     *
     * @return the decimal separator
     */
    public static char getDecimalSeparator() {
        return getDecimalSymbols().getDecimalSeparator();
    }

    /**
     * Gets the grouping separator.
     *
     * @return the grouping separator
     */
    public static char getGroupingSeparator() {
        return getDecimalSymbols().getGroupingSeparator();
    }

    /**
     * Take character.
     *
     * @param s the s
     * @param ch the ch
     * @return the string
     */
    public static String takeCharacter(String s, char ch) {
        String result = null;
        int posi = s.indexOf(ch);
        if (posi > -1)
            while (posi > -1) {
                result = s.substring(0, posi);
                result = result + s.substring(posi + 1);
                posi = result.indexOf(ch);
                s = result;
            }
        else
            result = s;
        return result;
    }

}
