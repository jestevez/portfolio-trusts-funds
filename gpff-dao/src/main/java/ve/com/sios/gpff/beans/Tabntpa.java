/*
 * Tabntpa.java
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
 * The Class Tabntpa.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 03/04/2014
 */
public class Tabntpa implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4302245044033207188L;

    /** The rowid. */
    private Long rowid;

    /** The ntitip. */
    private String ntitip;

    /** The nticod. */
    private Integer nticod;

    /** The ntinom. */
    private String ntinom;

    /** The ntictd. */
    private String ntictd;

    /** The ntiprd. */
    private String ntiprd;

    /** The nticth. */
    private String nticth;

    /** The ntiprh. */
    private String ntiprh;

    /** The ntides. */
    private String ntides;

    /** The nticli. */
    private String nticli;

    /** The ntiope. */
    private String ntiope;

    /** The ntimod. */
    private String ntimod;

    /**
     * Instantiates a new tabntpa.
     */
    public Tabntpa() {
        super();
        this.ntitip = null;
        this.nticod = null;
        this.ntinom = null;
        this.ntictd = null;
        this.ntiprd = null;
        this.nticth = null;
        this.ntiprh = null;
        this.ntides = null;
        this.nticli = null;
        this.ntiope = null;
        this.ntimod = null;

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
     * Gets the ntitip.
     *
     * @return the ntitip
     */
    public String getNtitip() {
        return ntitip;
    }

    /**
     * Sets the ntitip.
     *
     * @param ntitip the new ntitip
     */
    public void setNtitip(String ntitip) {
        this.ntitip = ntitip;
    }

    /**
     * Gets the nticod.
     *
     * @return the nticod
     */
    public Integer getNticod() {
        return nticod;
    }

    /**
     * Sets the nticod.
     *
     * @param nticod the new nticod
     */
    public void setNticod(Integer nticod) {
        this.nticod = nticod;
    }

    /**
     * Gets the ntinom.
     *
     * @return the ntinom
     */
    public String getNtinom() {
        return ntinom;
    }

    /**
     * Sets the ntinom.
     *
     * @param ntinom the new ntinom
     */
    public void setNtinom(String ntinom) {
        this.ntinom = ntinom;
    }

    /**
     * Gets the ntictd.
     *
     * @return the ntictd
     */
    public String getNtictd() {
        return ntictd;
    }

    /**
     * Sets the ntictd.
     *
     * @param ntictd the new ntictd
     */
    public void setNtictd(String ntictd) {
        this.ntictd = ntictd;
    }

    /**
     * Gets the ntiprd.
     *
     * @return the ntiprd
     */
    public String getNtiprd() {
        return ntiprd;
    }

    /**
     * Sets the ntiprd.
     *
     * @param ntiprd the new ntiprd
     */
    public void setNtiprd(String ntiprd) {
        this.ntiprd = ntiprd;
    }

    /**
     * Gets the nticth.
     *
     * @return the nticth
     */
    public String getNticth() {
        return nticth;
    }

    /**
     * Sets the nticth.
     *
     * @param nticth the new nticth
     */
    public void setNticth(String nticth) {
        this.nticth = nticth;
    }

    /**
     * Gets the ntiprh.
     *
     * @return the ntiprh
     */
    public String getNtiprh() {
        return ntiprh;
    }

    /**
     * Sets the ntiprh.
     *
     * @param ntiprh the new ntiprh
     */
    public void setNtiprh(String ntiprh) {
        this.ntiprh = ntiprh;
    }

    /**
     * Gets the ntides.
     *
     * @return the ntides
     */
    public String getNtides() {
        return ntides;
    }

    /**
     * Sets the ntides.
     *
     * @param ntides the new ntides
     */
    public void setNtides(String ntides) {
        this.ntides = ntides;
    }

    /**
     * Gets the nticli.
     *
     * @return the nticli
     */
    public String getNticli() {
        return nticli;
    }

    /**
     * Sets the nticli.
     *
     * @param nticli the new nticli
     */
    public void setNticli(String nticli) {
        this.nticli = nticli;
    }

    /**
     * Gets the ntiope.
     *
     * @return the ntiope
     */
    public String getNtiope() {
        return ntiope;
    }

    /**
     * Sets the ntiope.
     *
     * @param ntiope the new ntiope
     */
    public void setNtiope(String ntiope) {
        this.ntiope = ntiope;
    }

    /**
     * Gets the ntimod.
     *
     * @return the ntimod
     */
    public String getNtimod() {
        return ntimod;
    }

    /**
     * Sets the ntimod.
     *
     * @param ntimod the new ntimod
     */
    public void setNtimod(String ntimod) {
        this.ntimod = ntimod;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[11];
        array[0] = this.ntitip;
        array[1] = this.nticod;
        array[2] = this.ntinom;
        array[3] = this.ntictd;
        array[4] = this.ntiprd;
        array[5] = this.nticth;
        array[6] = this.ntiprh;
        array[7] = this.ntides;
        array[8] = this.nticli;
        array[9] = this.ntiope;
        array[10] = this.ntimod;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[11];
        array[0] = "ntitip";
        array[1] = "nticod";
        array[2] = "ntinom";
        array[3] = "ntictd";
        array[4] = "ntiprd";
        array[5] = "nticth";
        array[6] = "ntiprh";
        array[7] = "ntides";
        array[8] = "nticli";
        array[9] = "ntiope";
        array[10] = "ntimod";

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
        string += "ntitip: " + this.ntitip + "\n";
        string += "nticod: " + this.nticod + "\n";
        string += "ntinom: " + this.ntinom + "\n";
        string += "ntictd: " + this.ntictd + "\n";
        string += "ntiprd: " + this.ntiprd + "\n";
        string += "nticth: " + this.nticth + "\n";
        string += "ntiprh: " + this.ntiprh + "\n";
        string += "ntides: " + this.ntides + "\n";
        string += "nticli: " + this.nticli + "\n";
        string += "ntiope: " + this.ntiope + "\n";
        string += "ntimod: " + this.ntimod + "\n";

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
        Tabntpa other = (Tabntpa) obj;
        return this.hashCode() == other.hashCode();
    }

}