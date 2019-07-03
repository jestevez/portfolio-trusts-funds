/*
 * Tabtc.java
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
 * The Class Tabtc.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 13/02/2014
 */
public class Tabtc implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5247618346611350463L;

    /** The codig 2. */
    private Long codig2;

    /** The texto. */
    private String texto;

    /** The fimacu. */
    private String fimacu;

    /**
     * Instantiates a new tabtc.
     */
    public Tabtc() {
        super();
        this.codig2 = null;
        this.texto = null;
        this.fimacu = null;

    }

    /**
     * Gets the codig 2.
     *
     * @return the codig 2
     */
    public Long getCodig2() {
        return codig2;
    }

    /**
     * Sets the codig 2.
     *
     * @param codig2 the new codig 2
     */
    public void setCodig2(Long codig2) {
        this.codig2 = codig2;
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
     * Gets the fimacu.
     *
     * @return the fimacu
     */
    public String getFimacu() {
        return fimacu;
    }

    /**
     * Sets the fimacu.
     *
     * @param fimacu the new fimacu
     */
    public void setFimacu(String fimacu) {
        this.fimacu = fimacu;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[3];
        array[0] = this.codig2;
        array[1] = this.texto;
        array[2] = this.fimacu;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[3];
        array[0] = "codig2";
        array[1] = "texto";
        array[2] = "fimacu";

        return array;
    }
}