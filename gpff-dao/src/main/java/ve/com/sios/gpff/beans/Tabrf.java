/*
 * Tabrf.java
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
 * The Class Tabrf.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 20/02/2014
 */
public class Tabrf implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4829924149856464745L;

    /** The tasa. */
    private String tasa;

    /** The texto. */
    private String texto;

    /** The porcen. */
    private Double porcen;

    /**
     * Instantiates a new tabrf.
     */
    public Tabrf() {
        super();
        this.tasa = null;
        this.texto = null;
        this.porcen = null;

    }

    /**
     * Gets the tasa.
     *
     * @return the tasa
     */
    public String getTasa() {
        return tasa;
    }

    /**
     * Sets the tasa.
     *
     * @param tasa the new tasa
     */
    public void setTasa(String tasa) {
        this.tasa = tasa;
    }

    /**
     * Gets the texto.
     *
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Sets the texto.
     *
     * @param texto the new texto
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * Gets the porcen.
     *
     * @return the porcen
     */
    public Double getPorcen() {
        return porcen;
    }

    /**
     * Sets the porcen.
     *
     * @param porcen the new porcen
     */
    public void setPorcen(Double porcen) {
        this.porcen = porcen;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[3];
        array[0] = this.tasa;
        array[1] = this.texto;
        array[2] = this.porcen;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[3];
        array[0] = "tasa";
        array[1] = "texto";
        array[2] = "porcen";

        return array;
    }
}