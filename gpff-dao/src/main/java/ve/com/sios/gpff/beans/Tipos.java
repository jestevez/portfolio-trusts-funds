/*
 * Tipos.java
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
 * The Class Tipos.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 27/02/2014
 */
public class Tipos implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5162188213694780929L;

    /** The tipo. */
    private Integer tipo;

    /** The tipdes. */
    private String tipdes;

    /**
     * Instantiates a new tipos.
     */
    public Tipos() {
        super();
        this.tipo = null;
        this.tipdes = null;

    }

    /**
     * Gets the tipo.
     *
     * @return the tipo
     */
    public Integer getTipo() {
        return tipo;
    }

    /**
     * Sets the tipo.
     *
     * @param tipo the new tipo
     */
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    /**
     * Gets the tipdes.
     *
     * @return the tipdes
     */
    public String getTipdes() {
        return tipdes;
    }

    /**
     * Sets the tipdes.
     *
     * @param tipdes the new tipdes
     */
    public void setTipdes(String tipdes) {
        this.tipdes = tipdes;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[2];
        array[0] = this.tipo;
        array[1] = this.tipdes;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[2];
        array[0] = "tipo";
        array[1] = "tipdes";

        return array;
    }
}