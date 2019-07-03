/*
 * Aa2cocor.java
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
 * The Class Aa2cocor.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 13/03/2014
 */
public class Aa2cocor implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2795691720928307061L;

    /** The codare. */
    private String codare;

    /** The codcor. */
    private Integer codcor;

    /** The codnom. */
    private String codnom;

    /** The codusu. */
    private String codusu;

    /** The codpan. */
    private String codpan;

    /** The codfec. */
    private Integer codfec;

    /**
     * Instantiates a new aa 2 cocor.
     */
    public Aa2cocor() {
        super();
        this.codare = null;
        this.codcor = null;
        this.codnom = null;
        this.codusu = null;
        this.codpan = null;
        this.codfec = null;

    }

    /**
     * Gets the codare.
     *
     * @return the codare
     */
    public String getCodare() {
        return codare;
    }

    /**
     * Sets the codare.
     *
     * @param codare the new codare
     */
    public void setCodare(String codare) {
        this.codare = codare;
    }

    /**
     * Gets the codcor.
     *
     * @return the codcor
     */
    public Integer getCodcor() {
        return codcor;
    }

    /**
     * Sets the codcor.
     *
     * @param codcor the new codcor
     */
    public void setCodcor(Integer codcor) {
        this.codcor = codcor;
    }

    /**
     * Gets the codnom.
     *
     * @return the codnom
     */
    public String getCodnom() {
        return codnom;
    }

    /**
     * Sets the codnom.
     *
     * @param codnom the new codnom
     */
    public void setCodnom(String codnom) {
        this.codnom = codnom;
    }

    /**
     * Gets the codusu.
     *
     * @return the codusu
     */
    public String getCodusu() {
        return codusu;
    }

    /**
     * Sets the codusu.
     *
     * @param codusu the new codusu
     */
    public void setCodusu(String codusu) {
        this.codusu = codusu;
    }

    /**
     * Gets the codpan.
     *
     * @return the codpan
     */
    public String getCodpan() {
        return codpan;
    }

    /**
     * Sets the codpan.
     *
     * @param codpan the new codpan
     */
    public void setCodpan(String codpan) {
        this.codpan = codpan;
    }

    /**
     * Gets the codfec.
     *
     * @return the codfec
     */
    public Integer getCodfec() {
        return codfec;
    }

    /**
     * Sets the codfec.
     *
     * @param codfec the new codfec
     */
    public void setCodfec(Integer codfec) {
        this.codfec = codfec;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[6];
        array[0] = this.codare;
        array[1] = this.codcor;
        array[2] = this.codnom;
        array[3] = this.codusu;
        array[4] = this.codpan;
        array[5] = this.codfec;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[6];
        array[0] = "codare";
        array[1] = "codcor";
        array[2] = "codnom";
        array[3] = "codusu";
        array[4] = "codpan";
        array[5] = "codfec";

        return array;
    }
}