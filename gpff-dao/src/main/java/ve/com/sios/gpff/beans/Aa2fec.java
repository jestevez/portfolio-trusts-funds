/*
 * Aa2fec.java
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
 * The Class Aa2fec.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 27/02/2014
 */
public class Aa2fec implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 171655311109243471L;

    /** The fecha. */
    private Integer fecha;

    /** The fecfie. */
    private String fecfie;

    /**
     * Instantiates a new aa 2 fec.
     */
    public Aa2fec() {
        super();
        this.fecha = null;
        this.fecfie = null;

    }

    /**
     * Gets the fecha.
     *
     * @return the fecha
     */
    public Integer getFecha() {
        return fecha;
    }

    /**
     * Sets the fecha.
     *
     * @param fecha the new fecha
     */
    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    /**
     * Gets the fecfie.
     *
     * @return the fecfie
     */
    public String getFecfie() {
        return fecfie;
    }

    /**
     * Sets the fecfie.
     *
     * @param fecfie the new fecfie
     */
    public void setFecfie(String fecfie) {
        this.fecfie = fecfie;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[2];
        array[0] = this.fecha;
        array[1] = this.fecfie;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[2];
        array[0] = "fecha";
        array[1] = "fecfie";

        return array;
    }
}