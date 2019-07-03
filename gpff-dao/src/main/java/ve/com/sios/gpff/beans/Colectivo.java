/*
 * Colectivo.java
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
 * The Class Colectivo.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 07/05/2014
 */
public class Colectivo implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6767442530234531608L;

    /** The rowid. */
    private Long rowid;

    /** The clicla. */
    private Long clicla;

    /** The clinif. */
    private String clinif;

    /** The clinom. */
    private String clinom;

    /** The clvemp. */
    private String clvemp;

    /** The clvdel. */
    private String clvdel;

    /** The clvfea. */
    private Long clvfea;

    /** The clvsit. */
    private String clvsit;

    /**
     * Instantiates a new colectivo.
     */
    public Colectivo() {
        super();
        this.clicla = null;
        this.clinif = null;
        this.clinom = null;
        this.clvemp = null;
        this.clvdel = null;
        this.clvfea = null;
        this.clvsit = null;

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
     * Gets the clicla.
     *
     * @return the clicla
     */
    public Long getClicla() {
        return clicla;
    }

    /**
     * Sets the clicla.
     *
     * @param clicla the new clicla
     */
    public void setClicla(Long clicla) {
        this.clicla = clicla;
    }

    /**
     * Gets the clinif.
     *
     * @return the clinif
     */
    public String getClinif() {
        return clinif;
    }

    /**
     * Sets the clinif.
     *
     * @param clinif the new clinif
     */
    public void setClinif(String clinif) {
        this.clinif = clinif;
    }

    /**
     * Gets the clinom.
     *
     * @return the clinom
     */
    public String getClinom() {
        return clinom;
    }

    /**
     * Sets the clinom.
     *
     * @param clinom the new clinom
     */
    public void setClinom(String clinom) {
        this.clinom = clinom;
    }

    /**
     * Gets the clvemp.
     *
     * @return the clvemp
     */
    public String getClvemp() {
        return clvemp;
    }

    /**
     * Sets the clvemp.
     *
     * @param clvemp the new clvemp
     */
    public void setClvemp(String clvemp) {
        this.clvemp = clvemp;
    }

    /**
     * Gets the clvdel.
     *
     * @return the clvdel
     */
    public String getClvdel() {
        return clvdel;
    }

    /**
     * Sets the clvdel.
     *
     * @param clvdel the new clvdel
     */
    public void setClvdel(String clvdel) {
        this.clvdel = clvdel;
    }

    /**
     * Gets the clvfea.
     *
     * @return the clvfea
     */
    public Long getClvfea() {
        return clvfea;
    }

    /**
     * Sets the clvfea.
     *
     * @param clvfea the new clvfea
     */
    public void setClvfea(Long clvfea) {
        this.clvfea = clvfea;
    }

    /**
     * Gets the clvsit.
     *
     * @return the clvsit
     */
    public String getClvsit() {
        return clvsit;
    }

    /**
     * Sets the clvsit.
     *
     * @param clvsit the new clvsit
     */
    public void setClvsit(String clvsit) {
        this.clvsit = clvsit;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[7];
        array[0] = this.clicla;
        array[1] = this.clinif;
        array[2] = this.clinom;
        array[3] = this.clvemp;
        array[4] = this.clvdel;
        array[5] = this.clvfea;
        array[6] = this.clvsit;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[7];
        array[0] = "clicla";
        array[1] = "clinif";
        array[2] = "clinom";
        array[3] = "clvemp";
        array[4] = "clvdel";
        array[5] = "clvfea";
        array[6] = "clvsit";

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
        string += "clicla: " + this.clicla + "\n";
        string += "clinif: " + this.clinif + "\n";
        string += "clinom: " + this.clinom + "\n";
        string += "clvemp: " + this.clvemp + "\n";
        string += "clvdel: " + this.clvdel + "\n";
        string += "clvfea: " + this.clvfea + "\n";
        string += "clvsit: " + this.clvsit + "\n";

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
        Colectivo other = (Colectivo) obj;
        return this.hashCode() == other.hashCode();
    }

}
