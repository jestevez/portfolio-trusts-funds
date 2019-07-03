/*
 * Perfil.java
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
 * The Class Perfil.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 15/01/2014
 */
public class Perfil implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -645677776928161977L;

    /** The prfprf. */
    private String prfprf;

    /** The prfnom. */
    private String prfnom;

    /** The prfced. */
    private String prfced;

    /**
     * Instantiates a new perfil.
     */
    public Perfil() {
        super();
        this.prfprf = null;
        this.prfnom = null;
        this.prfced = null;

    }

    /**
     * Gets the prfprf.
     *
     * @return the prfprf
     */
    public String getPrfprf() {
        return prfprf;
    }

    /**
     * Sets the prfprf.
     *
     * @param prfprf the new prfprf
     */
    public void setPrfprf(String prfprf) {
        this.prfprf = prfprf;
    }

    /**
     * Gets the prfnom.
     *
     * @return the prfnom
     */
    public String getPrfnom() {
        return prfnom;
    }

    /**
     * Sets the prfnom.
     *
     * @param prfnom the new prfnom
     */
    public void setPrfnom(String prfnom) {
        this.prfnom = prfnom;
    }

    /**
     * Gets the prfced.
     *
     * @return the prfced
     */
    public String getPrfced() {
        return prfced;
    }

    /**
     * Sets the prfced.
     *
     * @param prfced the new prfced
     */
    public void setPrfced(String prfced) {
        this.prfced = prfced;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[3];
        array[0] = this.prfprf;
        array[1] = this.prfnom;
        array[2] = this.prfced;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[3];
        array[0] = "prfprf";
        array[1] = "prfnom";
        array[2] = "prfced";

        return array;
    }
}