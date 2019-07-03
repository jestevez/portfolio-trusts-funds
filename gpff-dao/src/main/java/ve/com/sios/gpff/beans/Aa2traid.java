/*
 * Aa2traid.java
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
 * The Class Aa2traid.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 21/02/2014
 */
public class Aa2traid implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -548756367138117412L;

    /** The traemp. */
    private String traemp;

    /** The tradel. */
    private String tradel;

    /** The tracla. */
    private Long tracla;

    /** The tranom. */
    private String tranom;

    /** The tramax. */
    private Double tramax;

    /** The trauti. */
    private Double trauti;

    /** The traufe. */
    private Integer traufe;

    /**
     * Instantiates a new aa 2 traid.
     */
    public Aa2traid() {
        super();
        this.traemp = null;
        this.tradel = null;
        this.tracla = null;
        this.tranom = null;
        this.tramax = null;
        this.trauti = null;
        this.traufe = null;

    }

    /**
     * Gets the traemp.
     *
     * @return the traemp
     */
    public String getTraemp() {
        return traemp;
    }

    /**
     * Sets the traemp.
     *
     * @param traemp the new traemp
     */
    public void setTraemp(String traemp) {
        this.traemp = traemp;
    }

    /**
     * Gets the tradel.
     *
     * @return the tradel
     */
    public String getTradel() {
        return tradel;
    }

    /**
     * Sets the tradel.
     *
     * @param tradel the new tradel
     */
    public void setTradel(String tradel) {
        this.tradel = tradel;
    }

    /**
     * Gets the tracla.
     *
     * @return the tracla
     */
    public Long getTracla() {
        return tracla;
    }

    /**
     * Sets the tracla.
     *
     * @param tracla the new tracla
     */
    public void setTracla(Long tracla) {
        this.tracla = tracla;
    }

    /**
     * Gets the tranom.
     *
     * @return the tranom
     */
    public String getTranom() {
        return tranom;
    }

    /**
     * Sets the tranom.
     *
     * @param tranom the new tranom
     */
    public void setTranom(String tranom) {
        this.tranom = tranom;
    }

    /**
     * Gets the tramax.
     *
     * @return the tramax
     */
    public Double getTramax() {
        return tramax;
    }

    /**
     * Sets the tramax.
     *
     * @param tramax the new tramax
     */
    public void setTramax(Double tramax) {
        this.tramax = tramax;
    }

    /**
     * Gets the trauti.
     *
     * @return the trauti
     */
    public Double getTrauti() {
        return trauti;
    }

    /**
     * Sets the trauti.
     *
     * @param trauti the new trauti
     */
    public void setTrauti(Double trauti) {
        this.trauti = trauti;
    }

    /**
     * Gets the traufe.
     *
     * @return the traufe
     */
    public Integer getTraufe() {
        return traufe;
    }

    /**
     * Sets the traufe.
     *
     * @param traufe the new traufe
     */
    public void setTraufe(Integer traufe) {
        this.traufe = traufe;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[7];
        array[0] = this.traemp;
        array[1] = this.tradel;
        array[2] = this.tracla;
        array[3] = this.tranom;
        array[4] = this.tramax;
        array[5] = this.trauti;
        array[6] = this.traufe;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[7];
        array[0] = "traemp";
        array[1] = "tradel";
        array[2] = "tracla";
        array[3] = "tranom";
        array[4] = "tramax";
        array[5] = "trauti";
        array[6] = "traufe";

        return array;
    }
}