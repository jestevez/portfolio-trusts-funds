/*
 * Aa2coope.java
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
 * The Class Aa2coope.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 10/03/2014
 */
public class Aa2coope implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5256240718617156185L;

    /** The copemp. */
    private String copemp;

    /** The copdel. */
    private String copdel;

    /** The copcli. */
    private String copcli;

    /** The copope. */
    private String copope;

    /** The copmod. */
    private String copmod;

    /** The copctr. */
    private Integer copctr;

    /** The copctaamp. */
    private String copctaamp;

    /** The copcta. */
    private String copcta;

    /** The copcon. */
    private String copcon;

    /** The copimp. */
    private String copimp;

    /** The copdeh. */
    private String copdeh;

    /** The copfec. */
    private String copfec;

    /**
     * Instantiates a new aa 2 coope.
     */
    public Aa2coope() {
        super();
        this.copemp = null;
        this.copdel = null;
        this.copcli = null;
        this.copope = null;
        this.copmod = null;
        this.copctr = null;
        this.copctaamp = null;
        this.copcta = null;
        this.copcon = null;
        this.copimp = null;
        this.copdeh = null;
        this.copfec = null;

    }

    /**
     * Gets the copemp.
     *
     * @return the copemp
     */
    public String getCopemp() {
        return copemp;
    }

    /**
     * Sets the copemp.
     *
     * @param copemp the new copemp
     */
    public void setCopemp(String copemp) {
        this.copemp = copemp;
    }

    /**
     * Gets the copdel.
     *
     * @return the copdel
     */
    public String getCopdel() {
        return copdel;
    }

    /**
     * Sets the copdel.
     *
     * @param copdel the new copdel
     */
    public void setCopdel(String copdel) {
        this.copdel = copdel;
    }

    /**
     * Gets the copcli.
     *
     * @return the copcli
     */
    public String getCopcli() {
        return copcli;
    }

    /**
     * Sets the copcli.
     *
     * @param copcli the new copcli
     */
    public void setCopcli(String copcli) {
        this.copcli = copcli;
    }

    /**
     * Gets the copope.
     *
     * @return the copope
     */
    public String getCopope() {
        return copope;
    }

    /**
     * Sets the copope.
     *
     * @param copope the new copope
     */
    public void setCopope(String copope) {
        this.copope = copope;
    }

    /**
     * Gets the copmod.
     *
     * @return the copmod
     */
    public String getCopmod() {
        return copmod;
    }

    /**
     * Sets the copmod.
     *
     * @param copmod the new copmod
     */
    public void setCopmod(String copmod) {
        this.copmod = copmod;
    }

    /**
     * Gets the copctr.
     *
     * @return the copctr
     */
    public Integer getCopctr() {
        return copctr;
    }

    /**
     * Sets the copctr.
     *
     * @param copctr the new copctr
     */
    public void setCopctr(Integer copctr) {
        this.copctr = copctr;
    }

    /**
     * Gets the copcta.
     *
     * @return the copcta
     */
    public String getCopcta() {
        return copcta;
    }

    /**
     * Sets the copcta.
     *
     * @param copcta the new copcta
     */
    public void setCopcta(String copcta) {
        this.copcta = copcta;
    }

    /**
     * Gets the copctaamp.
     *
     * @return the copctaamp
     */
    public String getCopctaamp() {
        return copctaamp;
    }

    /**
     * Sets the copctaamp.
     *
     * @param copctaamp the new copctaamp
     */
    public void setCopctaamp(String copctaamp) {
        this.copctaamp = copctaamp;
    }

    /**
     * Gets the copcon.
     *
     * @return the copcon
     */
    public String getCopcon() {
        return copcon;
    }

    /**
     * Sets the copcon.
     *
     * @param copcon the new copcon
     */
    public void setCopcon(String copcon) {
        this.copcon = copcon;
    }

    /**
     * Gets the copimp.
     *
     * @return the copimp
     */
    public String getCopimp() {
        return copimp;
    }

    /**
     * Sets the copimp.
     *
     * @param copimp the new copimp
     */
    public void setCopimp(String copimp) {
        this.copimp = copimp;
    }

    /**
     * Gets the copdeh.
     *
     * @return the copdeh
     */
    public String getCopdeh() {
        return copdeh;
    }

    /**
     * Sets the copdeh.
     *
     * @param copdeh the new copdeh
     */
    public void setCopdeh(String copdeh) {
        this.copdeh = copdeh;
    }

    /**
     * Gets the copfec.
     *
     * @return the copfec
     */
    public String getCopfec() {
        return copfec;
    }

    /**
     * Sets the copfec.
     *
     * @param copfec the new copfec
     */
    public void setCopfec(String copfec) {
        this.copfec = copfec;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[12];
        array[0] = this.copemp;
        array[1] = this.copdel;
        array[2] = this.copcli;
        array[3] = this.copope;
        array[4] = this.copmod;
        array[5] = this.copctr;
        array[6] = this.copcta;
        array[7] = this.copcon;
        array[8] = this.copimp;
        array[9] = this.copdeh;
        array[10] = this.copfec;
        array[11] = this.copctaamp;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[12];
        array[0] = "copemp";
        array[1] = "copdel";
        array[2] = "copcli";
        array[3] = "copope";
        array[4] = "copmod";
        array[5] = "copctr";
        array[6] = "copcta";
        array[7] = "copcon";
        array[8] = "copimp";
        array[9] = "copdeh";
        array[10] = "copfec";
        array[11] = "copctaamp";

        return array;
    }
}