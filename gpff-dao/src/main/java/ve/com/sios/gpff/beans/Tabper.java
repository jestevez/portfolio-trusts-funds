/*
 * Tabper.java
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
 * The Class Tabper.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 17/03/2014
 */
public class Tabper implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1761109923038777609L;

    /** The pertip. */
    private String pertip;

    /** The perdes. */
    private String perdes;

    /**
     * Instantiates a new tabper.
     */
    public Tabper() {
        super();
        this.pertip = null;
        this.perdes = null;

    }

    /**
     * Gets the pertip.
     *
     * @return the pertip
     */
    public String getPertip() {
        return pertip;
    }

    /**
     * Sets the pertip.
     *
     * @param pertip the new pertip
     */
    public void setPertip(String pertip) {
        this.pertip = pertip;
    }

    /**
     * Gets the perdes.
     *
     * @return the perdes
     */
    public String getPerdes() {
        return perdes;
    }

    /**
     * Sets the perdes.
     *
     * @param perdes the new perdes
     */
    public void setPerdes(String perdes) {
        this.perdes = perdes;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[2];
        array[0] = this.pertip;
        array[1] = this.perdes;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[2];
        array[0] = "pertip";
        array[1] = "perdes";

        return array;
    }
}