/*
 * Aa2modal.java
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
 * The Class Aa2modal.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 20/02/2014
 */
public class Aa2modal implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6257560695617319591L;

    /** The modcla. */
    private String modcla;

    /** The modaso. */
    private String modaso;

    /** The modnom. */
    private String modnom;

    /** The modnas. */
    private String modnas;

    /**
     * Instantiates a new aa 2 modal.
     */
    public Aa2modal() {
        super();
        this.modcla = null;
        this.modaso = null;
        this.modnom = null;
        this.modnas = null;

    }

    /**
     * Gets the modcla.
     *
     * @return the modcla
     */
    public String getModcla() {
        return modcla;
    }

    /**
     * Sets the modcla.
     *
     * @param modcla the new modcla
     */
    public void setModcla(String modcla) {
        this.modcla = modcla;
    }

    /**
     * Gets the modaso.
     *
     * @return the modaso
     */
    public String getModaso() {
        return modaso;
    }

    /**
     * Sets the modaso.
     *
     * @param modaso the new modaso
     */
    public void setModaso(String modaso) {
        this.modaso = modaso;
    }

    /**
     * Gets the modnom.
     *
     * @return the modnom
     */
    public String getModnom() {
        return modnom;
    }

    /**
     * Sets the modnom.
     *
     * @param modnom the new modnom
     */
    public void setModnom(String modnom) {
        this.modnom = modnom;
    }

    /**
     * Gets the modnas.
     *
     * @return the modnas
     */
    public String getModnas() {
        return modnas;
    }

    /**
     * Sets the modnas.
     *
     * @param modnas the new modnas
     */
    public void setModnas(String modnas) {
        this.modnas = modnas;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[4];
        array[0] = this.modcla;
        array[1] = this.modaso;
        array[2] = this.modnom;
        array[3] = this.modnas;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[4];
        array[0] = "modcla";
        array[1] = "modaso";
        array[2] = "modnom";
        array[3] = "modnas";

        return array;
    }
}