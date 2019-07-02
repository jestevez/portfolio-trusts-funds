package ve.com.sios.gpff.legacy;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Indicator.
 */
public final class Indicator {

    /** The indica. */
    private char[] indica = null;

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String string = "";
        for (char c : indica) {
            string += c;
        }
        return string;
    }

    /**
     * Gets the size.
     *
     * @return the size
     */
    public int getSize() {
        return indica != null ? indica.length : 0;
    }

    /**
     * Instantiates a new indicator.
     *
     * @param indica the indica
     */
    public Indicator(String indica) {
        setIndica(indica);
    }

    /**
     * Gets the indica.
     *
     * @return the indica
     */
    public String getIndica() {
        return new String(indica);
    }

    /**
     * Sets the indica.
     *
     * @param indica the new indica
     */
    public void setIndica(String indica) {
        this.indica = indica.toCharArray();
    }

    /**
     * Sets the off indicador.
     *
     * @param pos the new off indicador
     */
    public void setOffIndicador(int pos) {
        if (pos > 0 && indica != null) {
            indica[pos - 1] = '0';
        }
    }

    /**
     * Sets the on indicador.
     *
     * @param pos the new on indicador
     */
    public void setOnIndicador(int pos) {
        if (pos > 0 && indica != null) {
            indica[pos - 1] = '1';
        }
    }

    /**
     * Gets the value.
     *
     * @param pos the pos
     * @return the value
     * @throws IndexOutOfBoundsException the index out of bounds exception
     */
    public boolean getValue(int pos) throws IndexOutOfBoundsException {
        return indica[pos] == '1';
    }

    /**
     * Gets the ind.
     *
     * @return the ind
     */
    public List<String> getInd() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < indica.length; i++) {
            list.add(indica[i] + "");
        }
        return list;
    }

}
