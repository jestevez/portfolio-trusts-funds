/*
 * Aa2tgru.java
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
 * The Class Aa2tgru.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 28/02/2014
 */
public class Aa2tgru implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5868367731474007231L;

    /** The gruemp. */
    private String gruemp;

    /** The grudel. */
    private String grudel;

    /** The grucla. */
    private Long grucla;

    /** The grunom. */
    private String grunom;

    /** The all. */
    private Integer all;

    /**
     * Instantiates a new aa 2 tgru.
     */
    public Aa2tgru() {
        super();
        this.gruemp = null;
        this.grudel = null;
        this.grucla = null;
        this.grunom = null;
        this.all = null;

    }

    /**
     * Gets the gruemp.
     *
     * @return the gruemp
     */
    public String getGruemp() {
        return gruemp;
    }

    /**
     * Sets the gruemp.
     *
     * @param gruemp the new gruemp
     */
    public void setGruemp(String gruemp) {
        this.gruemp = gruemp;
    }

    /**
     * Gets the grudel.
     *
     * @return the grudel
     */
    public String getGrudel() {
        return grudel;
    }

    /**
     * Sets the grudel.
     *
     * @param grudel the new grudel
     */
    public void setGrudel(String grudel) {
        this.grudel = grudel;
    }

    /**
     * Gets the grucla.
     *
     * @return the grucla
     */
    public Long getGrucla() {
        return grucla;
    }

    /**
     * Sets the grucla.
     *
     * @param grucla the new grucla
     */
    public void setGrucla(Long grucla) {
        this.grucla = grucla;
    }

    /**
     * Gets the grunom.
     *
     * @return the grunom
     */
    public String getGrunom() {
        return grunom;
    }

    /**
     * Sets the grunom.
     *
     * @param grunom the new grunom
     */
    public void setGrunom(String grunom) {
        this.grunom = grunom;
    }

    /**
     * Gets the all.
     *
     * @return the all
     */
    public Integer getAll() {
        return all;
    }

    /**
     * Sets the all.
     *
     * @param all the new all
     */
    public void setAll(Integer all) {
        this.all = all;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[5];
        array[0] = this.gruemp;
        array[1] = this.grudel;
        array[2] = this.grucla;
        array[3] = this.grunom;
        array[4] = this.all;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[5];
        array[0] = "gruemp";
        array[1] = "grudel";
        array[2] = "grucla";
        array[3] = "grunom";
        array[4] = "all";

        return array;
    }
}