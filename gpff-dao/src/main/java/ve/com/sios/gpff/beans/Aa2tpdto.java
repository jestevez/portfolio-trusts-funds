/*
 * Aa2tpdto.java
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
 * The Class Aa2tpdto.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 27/02/2014
 */
public class Aa2tpdto implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2455759003141524524L;

    /** The depemp. */
    private String depemp;

    /** The depdel. */
    private String depdel;

    /** The depcla. */
    private Long depcla;

    /** The depnom. */
    private String depnom;

    /**
     * Instantiates a new aa 2 tpdto.
     */
    public Aa2tpdto() {
        super();
        this.depemp = null;
        this.depdel = null;
        this.depcla = null;
        this.depnom = null;

    }

    /**
     * Gets the depemp.
     *
     * @return the depemp
     */
    public String getDepemp() {
        return depemp;
    }

    /**
     * Sets the depemp.
     *
     * @param depemp the new depemp
     */
    public void setDepemp(String depemp) {
        this.depemp = depemp;
    }

    /**
     * Gets the depdel.
     *
     * @return the depdel
     */
    public String getDepdel() {
        return depdel;
    }

    /**
     * Sets the depdel.
     *
     * @param depdel the new depdel
     */
    public void setDepdel(String depdel) {
        this.depdel = depdel;
    }

    /**
     * Gets the depcla.
     *
     * @return the depcla
     */
    public Long getDepcla() {
        return depcla;
    }

    /**
     * Sets the depcla.
     *
     * @param depcla the new depcla
     */
    public void setDepcla(Long depcla) {
        this.depcla = depcla;
    }

    /**
     * Gets the depnom.
     *
     * @return the depnom
     */
    public String getDepnom() {
        return depnom;
    }

    /**
     * Sets the depnom.
     *
     * @param depnom the new depnom
     */
    public void setDepnom(String depnom) {
        this.depnom = depnom;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[4];
        array[0] = this.depemp;
        array[1] = this.depdel;
        array[2] = this.depcla;
        array[3] = this.depnom;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[4];
        array[0] = "depemp";
        array[1] = "depdel";
        array[2] = "depcla";
        array[3] = "depnom";

        return array;
    }
}