/*
 * Aa2amp.java
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
 * The Class Aa2amp.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 11/03/2014
 */
public class Aa2amp implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3126370115234586327L;

    /** The amptip. */
    private String amptip;

    /** The ampdes. */
    private String ampdes;

    /** The ampcau. */
    private String ampcau;

    /**
     * Instantiates a new aa 2 amp.
     */
    public Aa2amp() {
        super();
        this.amptip = null;
        this.ampdes = null;
        this.ampcau = null;

    }

    /**
     * Gets the amptip.
     *
     * @return the amptip
     */
    public String getAmptip() {
        return amptip;
    }

    /**
     * Sets the amptip.
     *
     * @param amptip the new amptip
     */
    public void setAmptip(String amptip) {
        this.amptip = amptip;
    }

    /**
     * Gets the ampdes.
     *
     * @return the ampdes
     */
    public String getAmpdes() {
        return ampdes;
    }

    /**
     * Sets the ampdes.
     *
     * @param ampdes the new ampdes
     */
    public void setAmpdes(String ampdes) {
        this.ampdes = ampdes;
    }

    /**
     * Gets the ampcau.
     *
     * @return the ampcau
     */
    public String getAmpcau() {
        return ampcau;
    }

    /**
     * Sets the ampcau.
     *
     * @param ampcau the new ampcau
     */
    public void setAmpcau(String ampcau) {
        this.ampcau = ampcau;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[3];
        array[0] = this.amptip;
        array[1] = this.ampdes;
        array[2] = this.ampcau;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[3];
        array[0] = "amptip";
        array[1] = "ampdes";
        array[2] = "ampcau";

        return array;
    }
}