/*
 * Tabsdb.java
 *
 * Copyright 2014 - Soluciones Integrales Open-Source SiOS
 * Copyright 2014 - Fundacion para la Investigacion y Desarrollo del Software Libre en Venezuela
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
 * The Class Tabsdb.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 19/02/2014
 */
public class Tabsdb implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3401577386073721224L;

    /** The tsbmod. */
    private String tsbmod;

    /** The tsbdin. */
    private Integer tsbdin;

    /** The tsbtin. */
    private Integer tsbtin;

    /** The tsbcin. */
    private Integer tsbcin;

    /** The tsbnsi. */
    private Integer tsbnsi;

    /** The tsbcre. */
    private Integer tsbcre;

    /** The tsbidi. */
    private Integer tsbidi;

    /**
     * Instantiates a new tabsdb.
     */
    public Tabsdb() {
        super();
        this.tsbmod = null;
        this.tsbdin = null;
        this.tsbtin = null;
        this.tsbcin = null;
        this.tsbnsi = null;
        this.tsbcre = null;
        this.tsbidi = null;

    }

    /**
     * Gets the tsbmod.
     *
     * @return the tsbmod
     */
    public String getTsbmod() {
        return tsbmod;
    }

    /**
     * Sets the tsbmod.
     *
     * @param tsbmod the new tsbmod
     */
    public void setTsbmod(String tsbmod) {
        this.tsbmod = tsbmod;
    }

    /**
     * Gets the tsbdin.
     *
     * @return the tsbdin
     */
    public Integer getTsbdin() {
        return tsbdin;
    }

    /**
     * Sets the tsbdin.
     *
     * @param tsbdin the new tsbdin
     */
    public void setTsbdin(Integer tsbdin) {
        this.tsbdin = tsbdin;
    }

    /**
     * Gets the tsbtin.
     *
     * @return the tsbtin
     */
    public Integer getTsbtin() {
        return tsbtin;
    }

    /**
     * Sets the tsbtin.
     *
     * @param tsbtin the new tsbtin
     */
    public void setTsbtin(Integer tsbtin) {
        this.tsbtin = tsbtin;
    }

    /**
     * Gets the tsbcin.
     *
     * @return the tsbcin
     */
    public Integer getTsbcin() {
        return tsbcin;
    }

    /**
     * Sets the tsbcin.
     *
     * @param tsbcin the new tsbcin
     */
    public void setTsbcin(Integer tsbcin) {
        this.tsbcin = tsbcin;
    }

    /**
     * Gets the tsbnsi.
     *
     * @return the tsbnsi
     */
    public Integer getTsbnsi() {
        return tsbnsi;
    }

    /**
     * Sets the tsbnsi.
     *
     * @param tsbnsi the new tsbnsi
     */
    public void setTsbnsi(Integer tsbnsi) {
        this.tsbnsi = tsbnsi;
    }

    /**
     * Gets the tsbcre.
     *
     * @return the tsbcre
     */
    public Integer getTsbcre() {
        return tsbcre;
    }

    /**
     * Sets the tsbcre.
     *
     * @param tsbcre the new tsbcre
     */
    public void setTsbcre(Integer tsbcre) {
        this.tsbcre = tsbcre;
    }

    /**
     * Gets the tsbidi.
     *
     * @return the tsbidi
     */
    public Integer getTsbidi() {
        return tsbidi;
    }

    /**
     * Sets the tsbidi.
     *
     * @param tsbidi the new tsbidi
     */
    public void setTsbidi(Integer tsbidi) {
        this.tsbidi = tsbidi;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[7];
        array[0] = this.tsbmod;
        array[1] = this.tsbdin;
        array[2] = this.tsbtin;
        array[3] = this.tsbcin;
        array[4] = this.tsbnsi;
        array[5] = this.tsbcre;
        array[6] = this.tsbidi;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[7];
        array[0] = "tsbmod";
        array[1] = "tsbdin";
        array[2] = "tsbtin";
        array[3] = "tsbcin";
        array[4] = "tsbnsi";
        array[5] = "tsbcre";
        array[6] = "tsbidi";

        return array;
    }
}
