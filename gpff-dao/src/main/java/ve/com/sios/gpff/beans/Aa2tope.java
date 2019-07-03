/*
 * Aa2tope.java
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
 * The Class Aa2tope.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 07/03/2014
 */
public class Aa2tope implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1643628267402882130L;

    /** The opecla. */
    private Long opecla;

    /** The openom. */
    private String openom;

    /** The opetip. */
    private Integer opetip;

    /** The opesig. */
    private String opesig;

    /** The opeaux. */
    private String opeaux;

    /**
     * Instantiates a new aa 2 tope.
     */
    public Aa2tope() {
        super();
        this.opecla = null;
        this.openom = null;
        this.opetip = null;
        this.opesig = null;
        this.opeaux = null;

    }

    /**
     * Gets the opecla.
     *
     * @return the opecla
     */
    public Long getOpecla() {
        return opecla;
    }

    /**
     * Sets the opecla.
     *
     * @param opecla the new opecla
     */
    public void setOpecla(Long opecla) {
        this.opecla = opecla;
    }

    /**
     * Gets the openom.
     *
     * @return the openom
     */
    public String getOpenom() {
        return openom;
    }

    /**
     * Sets the openom.
     *
     * @param openom the new openom
     */
    public void setOpenom(String openom) {
        this.openom = openom;
    }

    /**
     * Gets the opetip.
     *
     * @return the opetip
     */
    public Integer getOpetip() {
        return opetip;
    }

    /**
     * Sets the opetip.
     *
     * @param opetip the new opetip
     */
    public void setOpetip(Integer opetip) {
        this.opetip = opetip;
    }

    /**
     * Gets the opesig.
     *
     * @return the opesig
     */
    public String getOpesig() {
        return opesig;
    }

    /**
     * Sets the opesig.
     *
     * @param opesig the new opesig
     */
    public void setOpesig(String opesig) {
        this.opesig = opesig;
    }

    /**
     * Gets the opeaux.
     *
     * @return the opeaux
     */
    public String getOpeaux() {
        return opeaux;
    }

    /**
     * Sets the opeaux.
     *
     * @param opeaux the new opeaux
     */
    public void setOpeaux(String opeaux) {
        this.opeaux = opeaux;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[5];
        array[0] = this.opecla;
        array[1] = this.openom;
        array[2] = this.opetip;
        array[3] = this.opesig;
        array[4] = this.opeaux;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[5];
        array[0] = "opecla";
        array[1] = "openom";
        array[2] = "opetip";
        array[3] = "opesig";
        array[4] = "opeaux";

        return array;
    }
}