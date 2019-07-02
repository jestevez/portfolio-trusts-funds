package ve.com.sios.gpff.legacy.sockets;

/**
 * The Class CharacterField.
 */
public class CharacterField extends MessageField {

    /**
     * Instantiates a new character field.
     *
     * @param messagebytes the messagebytes
     * @param fieldstart the fieldstart
     * @param fieldlength the fieldlength
     */
    public CharacterField(byte messagebytes[], int fieldstart, int fieldlength) {
        super(messagebytes, fieldstart, fieldlength);
    }

    /**
     * Instantiates a new character field.
     *
     * @param messagebytes the messagebytes
     * @param fieldstart the fieldstart
     * @param fieldlength the fieldlength
     * @param fieldtag the fieldtag
     */
    public CharacterField(byte messagebytes[], int fieldstart, int fieldlength, String fieldtag) {
        super(messagebytes, fieldstart, fieldlength, fieldtag);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ve.com.sios.gpff.legacy.sockets.MessageField#getType()
     */
    public int getType() {
        return 1;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ve.com.sios.gpff.legacy.sockets.MessageField#initialize()
     */
    public void initialize() {
        initialize((byte) 32);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ve.com.sios.gpff.legacy.sockets.MessageField#makeString()
     */
    String makeString() {
        String rt = new String(super.bytes, super.start, super.length);
        return formatHTML(rt);
    }

    /**
     * {@inheritDoc}
     * 
     * @see ve.com.sios.gpff.legacy.sockets.MessageField#setString(java.lang.String)
     */
    public void setString(String newvalue) throws IllegalArgumentException {
        if (!super.tag.equals("E01LAN"))
            newvalue = newvalue.toUpperCase();
        setBytes(unformatHTML(newvalue), (byte) 32, 0);
    }

    /**
     * Format HTML.
     *
     * @param s the s
     * @return the string
     */
    private String formatHTML(String s) {
        String rs = null;
        String ls = null;
        int pos = 0;
        s = s.trim();
        if (!s.equals("")) {
            for (; s.indexOf("'") != -1; s = ls + "&#39;" + rs) {
                pos = s.indexOf("'");
                ls = s.substring(0, pos);
                rs = s.substring(pos + 1, s.length());
            }

            for (; s.indexOf("\"") != -1; s = ls + "&#34;" + rs) {
                pos = s.indexOf("\"");
                ls = s.substring(0, pos);
                rs = s.substring(pos + 1, s.length());
            }

        }
        return s;
    }

    /**
     * Unformat HTML.
     *
     * @param s the s
     * @return the string
     */
    private String unformatHTML(String s) {
        String rs = null;
        String ls = null;
        int pos = 0;
        if (!s.equals("")) {
            for (; s.indexOf("&#39;") != -1; s = ls + "'" + rs) {
                pos = s.indexOf("&#39;");
                ls = s.substring(0, pos);
                rs = s.substring(pos + 5, s.length());
            }

            for (; s.indexOf("&#34;") != -1; s = ls + "\"" + rs) {
                pos = s.indexOf("&#34;");
                ls = s.substring(0, pos);
                rs = s.substring(pos + 5, s.length());
            }

        }
        return s;
    }

    /**
     * Sets the string UD.
     *
     * @param newvalue the new string UD
     * @throws IllegalArgumentException the illegal argument exception
     */
    public void setStringUD(String newvalue) throws IllegalArgumentException {
        setBytes(newvalue, (byte) 32, 0);
    }

    /**
     * Gets the string UD.
     *
     * @return the string UD
     */
    public String getStringUD() {
        return new String(super.bytes, super.start, super.length);
    }

}
