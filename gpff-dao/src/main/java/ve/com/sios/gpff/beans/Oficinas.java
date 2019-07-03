/*
 * Oficinas.java
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
 * The Class Oficinas.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 14/02/2014
 */
public class Oficinas implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6384475459389433230L;

    /** The ofinum. */
    private Integer ofinum;

    /** The ofinom. */
    private String ofinom;

    /**
     * Instantiates a new oficinas.
     */
    public Oficinas() {
        super();
        this.ofinum = null;
        this.ofinom = null;

    }

    /**
     * Gets the ofinum.
     *
     * @return the ofinum
     */
    public Integer getOfinum() {
        return ofinum;
    }

    /**
     * Sets the ofinum.
     *
     * @param ofinum the new ofinum
     */
    public void setOfinum(Integer ofinum) {
        this.ofinum = ofinum;
    }

    /**
     * Gets the ofinom.
     *
     * @return the ofinom
     */
    public String getOfinom() {
        return ofinom;
    }

    /**
     * Sets the ofinom.
     *
     * @param ofinom the new ofinom
     */
    public void setOfinom(String ofinom) {
        this.ofinom = ofinom;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[2];
        array[0] = this.ofinum;
        array[1] = this.ofinom;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[2];
        array[0] = "ofinum";
        array[1] = "ofinom";

        return array;
    }
}