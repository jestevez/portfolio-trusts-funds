/*
 * Cuentas.java
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
 * The Class Cuentas.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 20/02/2014
 */
public class Cuentas implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3224379945370489738L;

    /** The ctccli. */
    private Long ctccli;

    /** The ctccta. */
    private String ctccta;

    /** The ctcemp. */
    private String ctcemp;

    /** The ctcdel. */
    private String ctcdel;

    /** The ctctip. */
    private String ctctip;

    /** The ctcage. */
    private Long ctcage;

    /** The ctcsal. */
    private Double ctcsal;

    /** The ctcdiv. */
    private Integer ctcdiv;

    /** The ctcaux. */
    private String ctcaux;

    /** The ctcref. */
    private String ctcref;

    /** The ctcban. */
    private String ctcban;

    /** The ctcdes. */
    private String ctcdes;

    /**
     * Instantiates a new cuentas.
     */
    public Cuentas() {
        super();
        this.ctccli = null;
        this.ctccta = null;
        this.ctcemp = null;
        this.ctcdel = null;
        this.ctctip = null;
        this.ctcage = null;
        this.ctcsal = null;
        this.ctcdiv = null;
        this.ctcaux = null;
        this.ctcref = null;
        this.ctcban = null;
        this.ctcdes = null;

    }

    /**
     * Gets the ctccli.
     *
     * @return the ctccli
     */
    public Long getCtccli() {
        return ctccli;
    }

    /**
     * Sets the ctccli.
     *
     * @param ctccli the new ctccli
     */
    public void setCtccli(Long ctccli) {
        this.ctccli = ctccli;
    }

    /**
     * Gets the ctccta.
     *
     * @return the ctccta
     */
    public String getCtccta() {
        return ctccta;
    }

    /**
     * Sets the ctccta.
     *
     * @param ctccta the new ctccta
     */
    public void setCtccta(String ctccta) {
        this.ctccta = ctccta;
    }

    /**
     * Gets the ctcemp.
     *
     * @return the ctcemp
     */
    public String getCtcemp() {
        return ctcemp;
    }

    /**
     * Sets the ctcemp.
     *
     * @param ctcemp the new ctcemp
     */
    public void setCtcemp(String ctcemp) {
        this.ctcemp = ctcemp;
    }

    /**
     * Gets the ctcdel.
     *
     * @return the ctcdel
     */
    public String getCtcdel() {
        return ctcdel;
    }

    /**
     * Sets the ctcdel.
     *
     * @param ctcdel the new ctcdel
     */
    public void setCtcdel(String ctcdel) {
        this.ctcdel = ctcdel;
    }

    /**
     * Gets the ctctip.
     *
     * @return the ctctip
     */
    public String getCtctip() {
        return ctctip;
    }

    /**
     * Sets the ctctip.
     *
     * @param ctctip the new ctctip
     */
    public void setCtctip(String ctctip) {
        this.ctctip = ctctip;
    }

    /**
     * Gets the ctcage.
     *
     * @return the ctcage
     */
    public Long getCtcage() {
        return ctcage;
    }

    /**
     * Sets the ctcage.
     *
     * @param ctcage the new ctcage
     */
    public void setCtcage(Long ctcage) {
        this.ctcage = ctcage;
    }

    /**
     * Gets the ctcsal.
     *
     * @return the ctcsal
     */
    public Double getCtcsal() {
        return ctcsal;
    }

    /**
     * Sets the ctcsal.
     *
     * @param ctcsal the new ctcsal
     */
    public void setCtcsal(Double ctcsal) {
        this.ctcsal = ctcsal;
    }

    /**
     * Gets the ctcdiv.
     *
     * @return the ctcdiv
     */
    public Integer getCtcdiv() {
        return ctcdiv;
    }

    /**
     * Sets the ctcdiv.
     *
     * @param ctcdiv the new ctcdiv
     */
    public void setCtcdiv(Integer ctcdiv) {
        this.ctcdiv = ctcdiv;
    }

    /**
     * Gets the ctcaux.
     *
     * @return the ctcaux
     */
    public String getCtcaux() {
        return ctcaux;
    }

    /**
     * Sets the ctcaux.
     *
     * @param ctcaux the new ctcaux
     */
    public void setCtcaux(String ctcaux) {
        this.ctcaux = ctcaux;
    }

    /**
     * Gets the ctcref.
     *
     * @return the ctcref
     */
    public String getCtcref() {
        return ctcref;
    }

    /**
     * Sets the ctcref.
     *
     * @param ctcref the new ctcref
     */
    public void setCtcref(String ctcref) {
        this.ctcref = ctcref;
    }

    /**
     * Gets the ctcban.
     *
     * @return the ctcban
     */
    public String getCtcban() {
        return ctcban;
    }

    /**
     * Sets the ctcban.
     *
     * @param ctcban the new ctcban
     */
    public void setCtcban(String ctcban) {
        this.ctcban = ctcban;
    }

    /**
     * Gets the ctcdes.
     *
     * @return the ctcdes
     */
    public String getCtcdes() {
        return ctcdes;
    }

    /**
     * Sets the ctcdes.
     *
     * @param ctcdes the new ctcdes
     */
    public void setCtcdes(String ctcdes) {
        this.ctcdes = ctcdes;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[12];
        array[0] = this.ctccli;
        array[1] = this.ctccta;
        array[2] = this.ctcemp;
        array[3] = this.ctcdel;
        array[4] = this.ctctip;
        array[5] = this.ctcage;
        array[6] = this.ctcsal;
        array[7] = this.ctcdiv;
        array[8] = this.ctcaux;
        array[9] = this.ctcref;
        array[10] = this.ctcban;
        array[11] = this.ctcdes;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[12];
        array[0] = "ctccli";
        array[1] = "ctccta";
        array[2] = "ctcemp";
        array[3] = "ctcdel";
        array[4] = "ctctip";
        array[5] = "ctcage";
        array[6] = "ctcsal";
        array[7] = "ctcdiv";
        array[8] = "ctcaux";
        array[9] = "ctcref";
        array[10] = "ctcban";
        array[11] = "ctcdes";

        return array;
    }
}
