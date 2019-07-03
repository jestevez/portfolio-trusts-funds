/*
 * Cotfondo.java
 *
 * Copyright 2014 - Soluciones Integrales Open-Source SiOS
 * Copyright 2014 - Fundación para la Investigación y Desarrollo del Software Libre en Venezuela
 *
 * http://www.sios.com.ve
 * http://www.indesoft.org.ve
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ve.com.sios.gpff.beans;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * The Class Cotfondo.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 09/05/2014
 */
public class Cotfondo implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4986296762051359315L;

    /** The rowid. */
    private Long rowid;

    /** The cofemp. */
    private String cofemp;

    /** The cofdel. */
    private String cofdel;

    /** The cofcla. */
    private String cofcla;

    /** The coffec. */
    private Long coffec;

    /** The coffech. */
    private Long coffech;

    /** The cofcot. */
    private BigDecimal cofcot;

    /**
     * Instantiates a new cotfondo.
     */
    public Cotfondo() {
        super();
        this.cofemp = null;
        this.cofdel = null;
        this.cofcla = null;
        this.coffec = null;
        this.coffech = null;
        this.cofcot = null;

    }

    /**
     * Gets the rowid.
     *
     * @return the rowid
     */
    public Long getRowid() {
        return rowid;
    }

    /**
     * Sets the rowid.
     *
     * @param rowid the new rowid
     */
    public void setRowid(Long rowid) {
        this.rowid = rowid;
    }

    /**
     * Gets the cofemp.
     *
     * @return the cofemp
     */
    public String getCofemp() {
        return cofemp;
    }

    /**
     * Sets the cofemp.
     *
     * @param cofemp the new cofemp
     */
    public void setCofemp(String cofemp) {
        this.cofemp = cofemp;
    }

    /**
     * Gets the cofdel.
     *
     * @return the cofdel
     */
    public String getCofdel() {
        return cofdel;
    }

    /**
     * Sets the cofdel.
     *
     * @param cofdel the new cofdel
     */
    public void setCofdel(String cofdel) {
        this.cofdel = cofdel;
    }

    /**
     * Gets the cofcla.
     *
     * @return the cofcla
     */
    public String getCofcla() {
        return cofcla;
    }

    /**
     * Sets the cofcla.
     *
     * @param cofcla the new cofcla
     */
    public void setCofcla(String cofcla) {
        this.cofcla = cofcla;
    }

    /**
     * Gets the coffec.
     *
     * @return the coffec
     */
    public Long getCoffec() {
        return coffec;
    }

    /**
     * Sets the coffec.
     *
     * @param coffec the new coffec
     */
    public void setCoffec(Long coffec) {
        this.coffec = coffec;
    }

    /**
     * Gets the coffech.
     *
     * @return the coffech
     */
    public Long getCoffech() {
        return coffech;
    }

    /**
     * Sets the coffech.
     *
     * @param coffech the new coffech
     */
    public void setCoffech(Long coffech) {
        this.coffech = coffech;
    }

    /**
     * Gets the cofcot.
     *
     * @return the cofcot
     */
    public BigDecimal getCofcot() {
        return cofcot;
    }

    /**
     * Sets the cofcot.
     *
     * @param cofcot the new cofcot
     */
    public void setCofcot(BigDecimal cofcot) {
        this.cofcot = cofcot;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[5];
        array[0] = this.cofemp;
        array[1] = this.cofdel;
        array[2] = this.cofcla;
        array[3] = this.coffec;
        array[4] = this.cofcot;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[5];
        array[0] = "cofemp";
        array[1] = "cofdel";
        array[2] = "cofcla";
        array[3] = "coffec";
        array[4] = "cofcot";

        return array;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String string = "";
        string += "cofemp: " + this.cofemp + "\n";
        string += "cofdel: " + this.cofdel + "\n";
        string += "cofcla: " + this.cofcla + "\n";
        string += "coffec: " + this.coffec + "\n";
        string += "coffech: " + this.coffech + "\n";
        string += "cofcot: " + this.cofcot + "\n";

        return string;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        Object[] array = toArray();
        for (Object object : array) {
            result = prime * result + ((object == null) ? 0 : object.hashCode());
        }
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Cotfondo other = (Cotfondo) obj;
        return this.hashCode() == other.hashCode();
    }

}
