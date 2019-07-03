/*
 * Aa2tbder.java
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
 * The Class Aa2tbder.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 03/03/2014
 */
public class Aa2tbder implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3958018545504359579L;

    /** The tcault. */
    private Long TCAULT;

    /** The tcamx1. */
    private Double TCAMX1;

    /** The tcavl1. */
    private Double TCAVL1;

    /** The tcapr1. */
    private Double TCAPR1;

    /** The tcavl2. */
    private Double TCAVL2;

    /** The tcapr2. */
    private Double TCAPR2;

    /** The tcavl3. */
    private Double TCAVL3;

    /** The tcapr3. */
    private Double TCAPR3;

    /** The tcavl4. */
    private Double TCAVL4;

    /** The tcapr4. */
    private Double TCAPR4;

    /** The tcafec. */
    private Integer TCAFEC;

    /**
     * Instantiates a new aa 2 tbder.
     */
    public Aa2tbder() {
        super();
        this.TCAULT = null;
        this.TCAMX1 = null;
        this.TCAVL1 = null;
        this.TCAPR1 = null;
        this.TCAVL2 = null;
        this.TCAPR2 = null;
        this.TCAVL3 = null;
        this.TCAPR3 = null;
        this.TCAVL4 = null;
        this.TCAPR4 = null;
        this.TCAFEC = null;

    }

    /**
     * Gets the tcault.
     *
     * @return the tcault
     */
    public Long getTCAULT() {
        return TCAULT;
    }

    /**
     * Sets the tcault.
     *
     * @param TCAULT the new tcault
     */
    public void setTCAULT(Long TCAULT) {
        this.TCAULT = TCAULT;
    }

    /**
     * Gets the tcamx1.
     *
     * @return the tcamx1
     */
    public Double getTCAMX1() {
        return TCAMX1;
    }

    /**
     * Sets the tcamx1.
     *
     * @param TCAMX1 the new tcamx1
     */
    public void setTCAMX1(Double TCAMX1) {
        this.TCAMX1 = TCAMX1;
    }

    /**
     * Gets the tcavl1.
     *
     * @return the tcavl1
     */
    public Double getTCAVL1() {
        return TCAVL1;
    }

    /**
     * Sets the tcavl1.
     *
     * @param TCAVL1 the new tcavl1
     */
    public void setTCAVL1(Double TCAVL1) {
        this.TCAVL1 = TCAVL1;
    }

    /**
     * Gets the tcapr1.
     *
     * @return the tcapr1
     */
    public Double getTCAPR1() {
        return TCAPR1;
    }

    /**
     * Sets the tcapr1.
     *
     * @param TCAPR1 the new tcapr1
     */
    public void setTCAPR1(Double TCAPR1) {
        this.TCAPR1 = TCAPR1;
    }

    /**
     * Gets the tcavl2.
     *
     * @return the tcavl2
     */
    public Double getTCAVL2() {
        return TCAVL2;
    }

    /**
     * Sets the tcavl2.
     *
     * @param TCAVL2 the new tcavl2
     */
    public void setTCAVL2(Double TCAVL2) {
        this.TCAVL2 = TCAVL2;
    }

    /**
     * Gets the tcapr2.
     *
     * @return the tcapr2
     */
    public Double getTCAPR2() {
        return TCAPR2;
    }

    /**
     * Sets the tcapr2.
     *
     * @param TCAPR2 the new tcapr2
     */
    public void setTCAPR2(Double TCAPR2) {
        this.TCAPR2 = TCAPR2;
    }

    /**
     * Gets the tcavl3.
     *
     * @return the tcavl3
     */
    public Double getTCAVL3() {
        return TCAVL3;
    }

    /**
     * Sets the tcavl3.
     *
     * @param TCAVL3 the new tcavl3
     */
    public void setTCAVL3(Double TCAVL3) {
        this.TCAVL3 = TCAVL3;
    }

    /**
     * Gets the tcapr3.
     *
     * @return the tcapr3
     */
    public Double getTCAPR3() {
        return TCAPR3;
    }

    /**
     * Sets the tcapr3.
     *
     * @param TCAPR3 the new tcapr3
     */
    public void setTCAPR3(Double TCAPR3) {
        this.TCAPR3 = TCAPR3;
    }

    /**
     * Gets the tcavl4.
     *
     * @return the tcavl4
     */
    public Double getTCAVL4() {
        return TCAVL4;
    }

    /**
     * Sets the tcavl4.
     *
     * @param TCAVL4 the new tcavl4
     */
    public void setTCAVL4(Double TCAVL4) {
        this.TCAVL4 = TCAVL4;
    }

    /**
     * Gets the tcapr4.
     *
     * @return the tcapr4
     */
    public Double getTCAPR4() {
        return TCAPR4;
    }

    /**
     * Sets the tcapr4.
     *
     * @param TCAPR4 the new tcapr4
     */
    public void setTCAPR4(Double TCAPR4) {
        this.TCAPR4 = TCAPR4;
    }

    /**
     * Gets the tcafec.
     *
     * @return the tcafec
     */
    public Integer getTCAFEC() {
        return TCAFEC;
    }

    /**
     * Sets the tcafec.
     *
     * @param TCAFEC the new tcafec
     */
    public void setTCAFEC(Integer TCAFEC) {
        this.TCAFEC = TCAFEC;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[11];
        array[0] = this.TCAULT;
        array[1] = this.TCAMX1;
        array[2] = this.TCAVL1;
        array[3] = this.TCAPR1;
        array[4] = this.TCAVL2;
        array[5] = this.TCAPR2;
        array[6] = this.TCAVL3;
        array[7] = this.TCAPR3;
        array[8] = this.TCAVL4;
        array[9] = this.TCAPR4;
        array[10] = this.TCAFEC;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[11];
        array[0] = "TCAULT";
        array[1] = "TCAMX1";
        array[2] = "TCAVL1";
        array[3] = "TCAPR1";
        array[4] = "TCAVL2";
        array[5] = "TCAPR2";
        array[6] = "TCAVL3";
        array[7] = "TCAPR3";
        array[8] = "TCAVL4";
        array[9] = "TCAPR4";
        array[10] = "TCAFEC";

        return array;
    }
}