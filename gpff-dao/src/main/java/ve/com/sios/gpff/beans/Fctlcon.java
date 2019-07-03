/*
 * Fctlcon.java
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
 * The Class Fctlcon.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 11/03/2014
 */
public class Fctlcon implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1694849443002626320L;

    /** The conare. */
    private String conare;

    /** The confec. */
    private Integer confec;

    /** The conusu. */
    private String conusu;

    /** The conpan. */
    private String conpan;

    /** The confe 1. */
    private Integer confe1;

    /**
     * Instantiates a new fctlcon.
     */
    public Fctlcon() {
        super();
        this.conare = null;
        this.confec = null;
        this.conusu = null;
        this.conpan = null;
        this.confe1 = null;

    }

    /**
     * Gets the conare.
     *
     * @return the conare
     */
    public String getConare() {
        return conare;
    }

    /**
     * Sets the conare.
     *
     * @param conare the new conare
     */
    public void setConare(String conare) {
        this.conare = conare;
    }

    /**
     * Gets the confec.
     *
     * @return the confec
     */
    public Integer getConfec() {
        return confec;
    }

    /**
     * Sets the confec.
     *
     * @param confec the new confec
     */
    public void setConfec(Integer confec) {
        this.confec = confec;
    }

    /**
     * Gets the conusu.
     *
     * @return the conusu
     */
    public String getConusu() {
        return conusu;
    }

    /**
     * Sets the conusu.
     *
     * @param conusu the new conusu
     */
    public void setConusu(String conusu) {
        this.conusu = conusu;
    }

    /**
     * Gets the conpan.
     *
     * @return the conpan
     */
    public String getConpan() {
        return conpan;
    }

    /**
     * Sets the conpan.
     *
     * @param conpan the new conpan
     */
    public void setConpan(String conpan) {
        this.conpan = conpan;
    }

    /**
     * Gets the confe 1.
     *
     * @return the confe 1
     */
    public Integer getConfe1() {
        return confe1;
    }

    /**
     * Sets the confe 1.
     *
     * @param confe1 the new confe 1
     */
    public void setConfe1(Integer confe1) {
        this.confe1 = confe1;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[5];
        array[0] = this.conare;
        array[1] = this.confec;
        array[2] = this.conusu;
        array[3] = this.conpan;
        array[4] = this.confe1;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[5];
        array[0] = "conare";
        array[1] = "confec";
        array[2] = "conusu";
        array[3] = "conpan";
        array[4] = "confe1";

        return array;
    }
}