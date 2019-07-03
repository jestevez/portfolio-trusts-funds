/*
 * Aa2toc.java
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
 * The Class Aa2toc.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 11/03/2014
 */
public class Aa2toc implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6692424612435802913L;

    /** The toctip. */
    private String toctip;

    /** The tocdes. */
    private String tocdes;

    /**
     * Instantiates a new aa 2 toc.
     */
    public Aa2toc() {
        super();
        this.toctip = null;
        this.tocdes = null;

    }

    /**
     * Gets the toctip.
     *
     * @return the toctip
     */
    public String getToctip() {
        return toctip;
    }

    /**
     * Sets the toctip.
     *
     * @param toctip the new toctip
     */
    public void setToctip(String toctip) {
        this.toctip = toctip;
    }

    /**
     * Gets the tocdes.
     *
     * @return the tocdes
     */
    public String getTocdes() {
        return tocdes;
    }

    /**
     * Sets the tocdes.
     *
     * @param tocdes the new tocdes
     */
    public void setTocdes(String tocdes) {
        this.tocdes = tocdes;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[2];
        array[0] = this.toctip;
        array[1] = this.tocdes;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[2];
        array[0] = "toctip";
        array[1] = "tocdes";

        return array;
    }
}