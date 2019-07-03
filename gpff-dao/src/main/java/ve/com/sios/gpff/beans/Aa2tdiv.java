/*
 * Aa2tdiv.java
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
 * The Class Aa2tdiv.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 14/02/2014
 */
public class Aa2tdiv implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8209464422926644263L;

    /** The divcla. */
    private Integer divcla;

    /** The divnom. */
    private String divnom;

    /** The divabr. */
    private String divabr;

    /** The divcco. */
    private Integer divcco;

    /** The divcve. */
    private Integer divcve;

    /** The divfix. */
    private Integer divfix;

    /** The divcta. */
    private String divcta;

    /** The divfib. */
    private Integer divfib;

    /**
     * Instantiates a new aa 2 tdiv.
     */
    public Aa2tdiv() {
        super();
        this.divcla = null;
        this.divnom = null;
        this.divabr = null;
        this.divcco = null;
        this.divcve = null;
        this.divfix = null;
        this.divcta = null;
        this.divfib = null;

    }

    /**
     * Gets the divcla.
     *
     * @return the divcla
     */
    public Integer getDivcla() {
        return divcla;
    }

    /**
     * Sets the divcla.
     *
     * @param divcla the new divcla
     */
    public void setDivcla(Integer divcla) {
        this.divcla = divcla;
    }

    /**
     * Gets the divnom.
     *
     * @return the divnom
     */
    public String getDivnom() {
        return divnom;
    }

    /**
     * Sets the divnom.
     *
     * @param divnom the new divnom
     */
    public void setDivnom(String divnom) {
        this.divnom = divnom;
    }

    /**
     * Gets the divabr.
     *
     * @return the divabr
     */
    public String getDivabr() {
        return divabr;
    }

    /**
     * Sets the divabr.
     *
     * @param divabr the new divabr
     */
    public void setDivabr(String divabr) {
        this.divabr = divabr;
    }

    /**
     * Gets the divcco.
     *
     * @return the divcco
     */
    public Integer getDivcco() {
        return divcco;
    }

    /**
     * Sets the divcco.
     *
     * @param divcco the new divcco
     */
    public void setDivcco(Integer divcco) {
        this.divcco = divcco;
    }

    /**
     * Gets the divcve.
     *
     * @return the divcve
     */
    public Integer getDivcve() {
        return divcve;
    }

    /**
     * Sets the divcve.
     *
     * @param divcve the new divcve
     */
    public void setDivcve(Integer divcve) {
        this.divcve = divcve;
    }

    /**
     * Gets the divfix.
     *
     * @return the divfix
     */
    public Integer getDivfix() {
        return divfix;
    }

    /**
     * Sets the divfix.
     *
     * @param divfix the new divfix
     */
    public void setDivfix(Integer divfix) {
        this.divfix = divfix;
    }

    /**
     * Gets the divcta.
     *
     * @return the divcta
     */
    public String getDivcta() {
        return divcta;
    }

    /**
     * Sets the divcta.
     *
     * @param divcta the new divcta
     */
    public void setDivcta(String divcta) {
        this.divcta = divcta;
    }

    /**
     * Gets the divfib.
     *
     * @return the divfib
     */
    public Integer getDivfib() {
        return divfib;
    }

    /**
     * Sets the divfib.
     *
     * @param divfib the new divfib
     */
    public void setDivfib(Integer divfib) {
        this.divfib = divfib;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[8];
        array[0] = this.divcla;
        array[1] = this.divnom;
        array[2] = this.divabr;
        array[3] = this.divcco;
        array[4] = this.divcve;
        array[5] = this.divfix;
        array[6] = this.divcta;
        array[7] = this.divfib;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[8];
        array[0] = "divcla";
        array[1] = "divnom";
        array[2] = "divabr";
        array[3] = "divcco";
        array[4] = "divcve";
        array[5] = "divfix";
        array[6] = "divcta";
        array[7] = "divfib";

        return array;
    }
}