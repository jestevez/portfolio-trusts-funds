/*
 * Aa2tconc.java
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
 * The Class Aa2tconc.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 07/03/2014
 */
public class Aa2tconc implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7089440973612097856L;

    /** The conemp. */
    private String conemp;

    /** The condel. */
    private String condel;

    /** The concla. */
    private Long concla;

    /** The connom. */
    private String connom;

    /** The condia. */
    private Integer condia;

    /**
     * Instantiates a new aa 2 tconc.
     */
    public Aa2tconc() {
        super();
        this.conemp = null;
        this.condel = null;
        this.concla = null;
        this.connom = null;
        this.condia = null;

    }

    /**
     * Gets the conemp.
     *
     * @return the conemp
     */
    public String getConemp() {
        return conemp;
    }

    /**
     * Sets the conemp.
     *
     * @param conemp the new conemp
     */
    public void setConemp(String conemp) {
        this.conemp = conemp;
    }

    /**
     * Gets the condel.
     *
     * @return the condel
     */
    public String getCondel() {
        return condel;
    }

    /**
     * Sets the condel.
     *
     * @param condel the new condel
     */
    public void setCondel(String condel) {
        this.condel = condel;
    }

    /**
     * Gets the concla.
     *
     * @return the concla
     */
    public Long getConcla() {
        return concla;
    }

    /**
     * Sets the concla.
     *
     * @param concla the new concla
     */
    public void setConcla(Long concla) {
        this.concla = concla;
    }

    /**
     * Gets the connom.
     *
     * @return the connom
     */
    public String getConnom() {
        return connom;
    }

    /**
     * Sets the connom.
     *
     * @param connom the new connom
     */
    public void setConnom(String connom) {
        this.connom = connom;
    }

    /**
     * Gets the condia.
     *
     * @return the condia
     */
    public Integer getCondia() {
        return condia;
    }

    /**
     * Sets the condia.
     *
     * @param condia the new condia
     */
    public void setCondia(Integer condia) {
        this.condia = condia;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[5];
        array[0] = this.conemp;
        array[1] = this.condel;
        array[2] = this.concla;
        array[3] = this.connom;
        array[4] = this.condia;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[5];
        array[0] = "conemp";
        array[1] = "condel";
        array[2] = "concla";
        array[3] = "connom";
        array[4] = "condia";

        return array;
    }
}