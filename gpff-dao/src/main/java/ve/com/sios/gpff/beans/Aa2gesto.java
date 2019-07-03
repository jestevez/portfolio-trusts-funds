/*
 * Aa2gesto.java
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
 * The Class Aa2gesto.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 14/02/2014
 */
public class Aa2gesto implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7860819281143749002L;

    /** The gescla. */
    private Long gescla;

    /** The gesnom. */
    private String gesnom;

    /** The gescli. */
    private Integer gescli;

    /**
     * Instantiates a new aa 2 gesto.
     */
    public Aa2gesto() {
        super();
        this.gescla = null;
        this.gesnom = null;
        this.gescli = null;

    }

    /**
     * Gets the gescla.
     *
     * @return the gescla
     */
    public Long getGescla() {
        return gescla;
    }

    /**
     * Sets the gescla.
     *
     * @param gescla the new gescla
     */
    public void setGescla(Long gescla) {
        this.gescla = gescla;
    }

    /**
     * Gets the gesnom.
     *
     * @return the gesnom
     */
    public String getGesnom() {
        return gesnom;
    }

    /**
     * Sets the gesnom.
     *
     * @param gesnom the new gesnom
     */
    public void setGesnom(String gesnom) {
        this.gesnom = gesnom;
    }

    /**
     * Gets the gescli.
     *
     * @return the gescli
     */
    public Integer getGescli() {
        return gescli;
    }

    /**
     * Sets the gescli.
     *
     * @param gescli the new gescli
     */
    public void setGescli(Integer gescli) {
        this.gescli = gescli;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[3];
        array[0] = this.gescla;
        array[1] = this.gesnom;
        array[2] = this.gescli;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[3];
        array[0] = "gescla";
        array[1] = "gesnom";
        array[2] = "gescli";

        return array;
    }
}