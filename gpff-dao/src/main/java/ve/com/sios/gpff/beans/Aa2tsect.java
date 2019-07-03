/*
 * Aa2tsect.java
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
 * The Class Aa2tsect.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 12/02/2014
 */
public class Aa2tsect implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5211896257528645813L;

    /** The seccla. */
    private Long seccla;

    /** The secnom. */
    private String secnom;

    /**
     * Instantiates a new aa 2 tsect.
     */
    public Aa2tsect() {
        super();
        this.seccla = null;
        this.secnom = null;

    }

    /**
     * Gets the seccla.
     *
     * @return the seccla
     */
    public Long getSeccla() {
        return seccla;
    }

    /**
     * Sets the seccla.
     *
     * @param seccla the new seccla
     */
    public void setSeccla(Long seccla) {
        this.seccla = seccla;
    }

    /**
     * Gets the secnom.
     *
     * @return the secnom
     */
    public String getSecnom() {
        return secnom;
    }

    /**
     * Sets the secnom.
     *
     * @param secnom the new secnom
     */
    public void setSecnom(String secnom) {
        this.secnom = secnom;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[2];
        array[0] = this.seccla;
        array[1] = this.secnom;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[2];
        array[0] = "seccla";
        array[1] = "secnom";

        return array;
    }
}