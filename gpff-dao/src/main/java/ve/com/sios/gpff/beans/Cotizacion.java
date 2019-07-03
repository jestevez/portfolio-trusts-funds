/*
 * Cotizacion.java
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

/**
 * The Class Cotizacion.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 04/04/2014
 */
public class Cotizacion implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1540208991280110193L;

    /** The rowid. */
    private Long rowid;

    /** The ctzval. */
    private String ctzval;

    /** The ctzfec. */
    private Long ctzfec;

    /** The ctzcot. */
    private Double ctzcot;

    /** The ctzcod. */
    private String ctzcod;

    /**
     * Instantiates a new cotizacion.
     */
    public Cotizacion() {
        super();
        this.ctzval = null;
        this.ctzfec = null;
        this.ctzcot = null;
        this.ctzcod = null;

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
     * Gets the ctzval.
     *
     * @return the ctzval
     */
    public String getCtzval() {
        return ctzval;
    }

    /**
     * Sets the ctzval.
     *
     * @param ctzval the new ctzval
     */
    public void setCtzval(String ctzval) {
        this.ctzval = ctzval;
    }

    /**
     * Gets the ctzfec.
     *
     * @return the ctzfec
     */
    public Long getCtzfec() {
        return ctzfec;
    }

    /**
     * Sets the ctzfec.
     *
     * @param ctzfec the new ctzfec
     */
    public void setCtzfec(Long ctzfec) {
        this.ctzfec = ctzfec;
    }

    /**
     * Gets the ctzcot.
     *
     * @return the ctzcot
     */
    public Double getCtzcot() {
        return ctzcot;
    }

    /**
     * Sets the ctzcot.
     *
     * @param ctzcot the new ctzcot
     */
    public void setCtzcot(Double ctzcot) {
        this.ctzcot = ctzcot;
    }

    /**
     * Gets the ctzcod.
     *
     * @return the ctzcod
     */
    public String getCtzcod() {
        return ctzcod;
    }

    /**
     * Sets the ctzcod.
     *
     * @param ctzcod the new ctzcod
     */
    public void setCtzcod(String ctzcod) {
        this.ctzcod = ctzcod;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[4];
        array[0] = this.ctzval;
        array[1] = this.ctzfec;
        array[2] = this.ctzcot;
        array[3] = this.ctzcod;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[4];
        array[0] = "ctzval";
        array[1] = "ctzfec";
        array[2] = "ctzcot";
        array[3] = "ctzcod";

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
        string += "ctzval: " + this.ctzval + "\n";
        string += "ctzfec: " + this.ctzfec + "\n";
        string += "ctzcot: " + this.ctzcot + "\n";
        string += "ctzcod: " + this.ctzcod + "\n";

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
        Cotizacion other = (Cotizacion) obj;
        return this.hashCode() == other.hashCode();
    }

}
