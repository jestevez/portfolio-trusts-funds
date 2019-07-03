/*
 * Tabsex.java
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
 * The Class Tabsex.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 13/03/2014
 */
public class Tabsex implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1362377258092229778L;

    /** The sextip. */
    private String sextip;

    /** The sexdes. */
    private String sexdes;

    /**
     * Instantiates a new tabsex.
     */
    public Tabsex() {
        super();
        this.sextip = null;
        this.sexdes = null;

    }

    /**
     * Gets the sextip.
     *
     * @return the sextip
     */
    public String getSextip() {
        return sextip;
    }

    /**
     * Sets the sextip.
     *
     * @param sextip the new sextip
     */
    public void setSextip(String sextip) {
        this.sextip = sextip;
    }

    /**
     * Gets the sexdes.
     *
     * @return the sexdes
     */
    public String getSexdes() {
        return sexdes;
    }

    /**
     * Sets the sexdes.
     *
     * @param sexdes the new sexdes
     */
    public void setSexdes(String sexdes) {
        this.sexdes = sexdes;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[2];
        array[0] = this.sextip;
        array[1] = this.sexdes;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[2];
        array[0] = "sextip";
        array[1] = "sexdes";

        return array;
    }
}