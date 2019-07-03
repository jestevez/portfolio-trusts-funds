/*
 * Tabsb42.java
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
 * The Class Tabsb42.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 19/02/2014
 */
public class Tabsb42 implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8013911244819805237L;

    /** The t 42 cod. */
    private Integer t42cod;

    /** The t 42 nom. */
    private String t42nom;

    /**
     * Instantiates a new tabsb 42.
     */
    public Tabsb42() {
        super();
        this.t42cod = null;
        this.t42nom = null;

    }

    /**
     * Gets the t 42 cod.
     *
     * @return the t 42 cod
     */
    public Integer getT42cod() {
        return t42cod;
    }

    /**
     * Sets the t 42 cod.
     *
     * @param t42cod the new t 42 cod
     */
    public void setT42cod(Integer t42cod) {
        this.t42cod = t42cod;
    }

    /**
     * Gets the t 42 nom.
     *
     * @return the t 42 nom
     */
    public String getT42nom() {
        return t42nom;
    }

    /**
     * Sets the t 42 nom.
     *
     * @param t42nom the new t 42 nom
     */
    public void setT42nom(String t42nom) {
        this.t42nom = t42nom;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[2];
        array[0] = this.t42cod;
        array[1] = this.t42nom;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[2];
        array[0] = "t42cod";
        array[1] = "t42nom";

        return array;
    }
}
