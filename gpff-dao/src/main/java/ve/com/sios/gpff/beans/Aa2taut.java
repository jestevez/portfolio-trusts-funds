/*
 * Aa2taut.java
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
 * The Class Aa2taut.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 27/02/2014
 */
public class Aa2taut implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5284462628303358995L;

    /** The autemp. */
    private String autemp;

    /** The autdel. */
    private String autdel;

    /** The autcla. */
    private Long autcla;

    /** The autnom. */
    private String autnom;

    /** The autanu. */
    private String autanu;

    /**
     * Instantiates a new aa 2 taut.
     */
    public Aa2taut() {
        super();
        this.autemp = null;
        this.autdel = null;
        this.autcla = null;
        this.autnom = null;
        this.autanu = null;

    }

    /**
     * Gets the autemp.
     *
     * @return the autemp
     */
    public String getAutemp() {
        return autemp;
    }

    /**
     * Sets the autemp.
     *
     * @param autemp the new autemp
     */
    public void setAutemp(String autemp) {
        this.autemp = autemp;
    }

    /**
     * Gets the autdel.
     *
     * @return the autdel
     */
    public String getAutdel() {
        return autdel;
    }

    /**
     * Sets the autdel.
     *
     * @param autdel the new autdel
     */
    public void setAutdel(String autdel) {
        this.autdel = autdel;
    }

    /**
     * Gets the autcla.
     *
     * @return the autcla
     */
    public Long getAutcla() {
        return autcla;
    }

    /**
     * Sets the autcla.
     *
     * @param autcla the new autcla
     */
    public void setAutcla(Long autcla) {
        this.autcla = autcla;
    }

    /**
     * Gets the autnom.
     *
     * @return the autnom
     */
    public String getAutnom() {
        return autnom;
    }

    /**
     * Sets the autnom.
     *
     * @param autnom the new autnom
     */
    public void setAutnom(String autnom) {
        this.autnom = autnom;
    }

    /**
     * Gets the autanu.
     *
     * @return the autanu
     */
    public String getAutanu() {
        return autanu;
    }

    /**
     * Sets the autanu.
     *
     * @param autanu the new autanu
     */
    public void setAutanu(String autanu) {
        this.autanu = autanu;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[5];
        array[0] = this.autemp;
        array[1] = this.autdel;
        array[2] = this.autcla;
        array[3] = this.autnom;
        array[4] = this.autanu;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[5];
        array[0] = "autemp";
        array[1] = "autdel";
        array[2] = "autcla";
        array[3] = "autnom";
        array[4] = "autanu";

        return array;
    }
}