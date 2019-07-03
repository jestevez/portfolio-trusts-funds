/*
 * Aa2tesp.java
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
 * The Class Aa2tesp.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 01/04/2014
 */
public class Aa2tesp implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2971250838516393271L;

    /** The rowid. */
    private Long rowid;

    /** The espemp. */
    private String espemp;

    /** The espdel. */
    private String espdel;

    /** The espcla. */
    private Long espcla;

    /** The esptip. */
    private Double esptip;

    /**
     * Instantiates a new aa 2 tesp.
     */
    public Aa2tesp() {
        super();
        this.espemp = null;
        this.espdel = null;
        this.espcla = null;
        this.esptip = null;

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
     * Gets the espemp.
     *
     * @return the espemp
     */
    public String getEspemp() {
        return espemp;
    }

    /**
     * Sets the espemp.
     *
     * @param espemp the new espemp
     */
    public void setEspemp(String espemp) {
        this.espemp = espemp;
    }

    /**
     * Gets the espdel.
     *
     * @return the espdel
     */
    public String getEspdel() {
        return espdel;
    }

    /**
     * Sets the espdel.
     *
     * @param espdel the new espdel
     */
    public void setEspdel(String espdel) {
        this.espdel = espdel;
    }

    /**
     * Gets the espcla.
     *
     * @return the espcla
     */
    public Long getEspcla() {
        return espcla;
    }

    /**
     * Sets the espcla.
     *
     * @param espcla the new espcla
     */
    public void setEspcla(Long espcla) {
        this.espcla = espcla;
    }

    /**
     * Gets the esptip.
     *
     * @return the esptip
     */
    public Double getEsptip() {
        return esptip;
    }

    /**
     * Sets the esptip.
     *
     * @param esptip the new esptip
     */
    public void setEsptip(Double esptip) {
        this.esptip = esptip;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[4];
        array[0] = this.espemp;
        array[1] = this.espdel;
        array[2] = this.espcla;
        array[3] = this.esptip;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[4];
        array[0] = "espemp";
        array[1] = "espdel";
        array[2] = "espcla";
        array[3] = "esptip";

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
        string += "espemp: " + this.espemp + "\n";
        string += "espdel: " + this.espdel + "\n";
        string += "espcla: " + this.espcla + "\n";
        string += "esptip: " + this.esptip + "\n";

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
        Aa2tesp other = (Aa2tesp) obj;
        return this.hashCode() == other.hashCode();
    }

}
