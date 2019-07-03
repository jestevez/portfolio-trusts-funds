/*
 * Aa2balsi.java
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
 * The Class Aa2balsi.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 03/03/2014
 */
public class Aa2balsi implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4410606946643740990L;

    /** The bsiemp. */
    private String bsiemp;

    /** The bsidel. */
    private String bsidel;

    /** The bsictr. */
    private Integer bsictr;

    /** The bsiap. */
    private String bsiap;

    /** The bsidiv. */
    private Integer bsidiv;

    /** The bsicta. */
    private String bsicta;

    /** The bsitex. */
    private String bsitex;

    /**
     * Instantiates a new aa 2 balsi.
     */
    public Aa2balsi() {
        super();
        this.bsiemp = null;
        this.bsidel = null;
        this.bsictr = null;
        this.bsiap = null;
        this.bsidiv = null;
        this.bsicta = null;
        this.bsitex = null;

    }

    /**
     * Gets the bsiemp.
     *
     * @return the bsiemp
     */
    public String getBsiemp() {
        return bsiemp;
    }

    /**
     * Sets the bsiemp.
     *
     * @param bsiemp the new bsiemp
     */
    public void setBsiemp(String bsiemp) {
        this.bsiemp = bsiemp;
    }

    /**
     * Gets the bsidel.
     *
     * @return the bsidel
     */
    public String getBsidel() {
        return bsidel;
    }

    /**
     * Sets the bsidel.
     *
     * @param bsidel the new bsidel
     */
    public void setBsidel(String bsidel) {
        this.bsidel = bsidel;
    }

    /**
     * Gets the bsictr.
     *
     * @return the bsictr
     */
    public Integer getBsictr() {
        return bsictr;
    }

    /**
     * Sets the bsictr.
     *
     * @param bsictr the new bsictr
     */
    public void setBsictr(Integer bsictr) {
        this.bsictr = bsictr;
    }

    /**
     * Gets the bsiap.
     *
     * @return the bsiap
     */
    public String getBsiap() {
        return bsiap;
    }

    /**
     * Sets the bsiap.
     *
     * @param bsiap the new bsiap
     */
    public void setBsiap(String bsiap) {
        this.bsiap = bsiap;
    }

    /**
     * Gets the bsidiv.
     *
     * @return the bsidiv
     */
    public Integer getBsidiv() {
        return bsidiv;
    }

    /**
     * Sets the bsidiv.
     *
     * @param bsidiv the new bsidiv
     */
    public void setBsidiv(Integer bsidiv) {
        this.bsidiv = bsidiv;
    }

    /**
     * Gets the bsicta.
     *
     * @return the bsicta
     */
    public String getBsicta() {
        return bsicta;
    }

    /**
     * Sets the bsicta.
     *
     * @param bsicta the new bsicta
     */
    public void setBsicta(String bsicta) {
        this.bsicta = bsicta;
    }

    /**
     * Gets the bsitex.
     *
     * @return the bsitex
     */
    public String getBsitex() {
        return bsitex;
    }

    /**
     * Sets the bsitex.
     *
     * @param bsitex the new bsitex
     */
    public void setBsitex(String bsitex) {
        this.bsitex = bsitex;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[7];
        array[0] = this.bsiemp;
        array[1] = this.bsidel;
        array[2] = this.bsictr;
        array[3] = this.bsiap;
        array[4] = this.bsidiv;
        array[5] = this.bsicta;
        array[6] = this.bsitex;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[7];
        array[0] = "bsiemp";
        array[1] = "bsidel";
        array[2] = "bsictr";
        array[3] = "bsiap";
        array[4] = "bsidiv";
        array[5] = "bsicta";
        array[6] = "bsitex";

        return array;
    }
}