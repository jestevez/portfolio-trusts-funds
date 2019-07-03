/*
 * Aa2copo.java
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
 * The Class Aa2copo.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 14/03/2014
 */
public class Aa2copo implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2866055864313520884L;

    /** The copcod. */
    private Integer copcod;

    /** The copco 1. */
    private Integer copco1;

    /** The copnom. */
    private String copnom;

    /** The coparc. */
    private String coparc;

    /**
     * Instantiates a new aa 2 copo.
     */
    public Aa2copo() {
        super();
        this.copcod = null;
        this.copco1 = null;
        this.copnom = null;
        this.coparc = null;

    }

    /**
     * Gets the copcod.
     *
     * @return the copcod
     */
    public Integer getCopcod() {
        return copcod;
    }

    /**
     * Sets the copcod.
     *
     * @param copcod the new copcod
     */
    public void setCopcod(Integer copcod) {
        this.copcod = copcod;
    }

    /**
     * Gets the copco 1.
     *
     * @return the copco 1
     */
    public Integer getCopco1() {
        return copco1;
    }

    /**
     * Sets the copco 1.
     *
     * @param copco1 the new copco 1
     */
    public void setCopco1(Integer copco1) {
        this.copco1 = copco1;
    }

    /**
     * Gets the copnom.
     *
     * @return the copnom
     */
    public String getCopnom() {
        return copnom;
    }

    /**
     * Sets the copnom.
     *
     * @param copnom the new copnom
     */
    public void setCopnom(String copnom) {
        this.copnom = copnom;
    }

    /**
     * Gets the coparc.
     *
     * @return the coparc
     */
    public String getCoparc() {
        return coparc;
    }

    /**
     * Sets the coparc.
     *
     * @param coparc the new coparc
     */
    public void setCoparc(String coparc) {
        this.coparc = coparc;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[4];
        array[0] = this.copcod;
        array[1] = this.copco1;
        array[2] = this.copnom;
        array[3] = this.coparc;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[4];
        array[0] = "copcod";
        array[1] = "copco1";
        array[2] = "copnom";
        array[3] = "coparc";

        return array;
    }
}