/*
 * Aa2tipcl.java
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
 * The Class Aa2tipcl.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 14/02/2014
 */
public class Aa2tipcl implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 9146035240993183261L;

    /** The ticcla. */
    private Integer ticcla;

    /** The ticnom. */
    private String ticnom;

    /**
     * Instantiates a new aa 2 tipcl.
     */
    public Aa2tipcl() {
        super();
        this.ticcla = null;
        this.ticnom = null;

    }

    /**
     * Gets the ticcla.
     *
     * @return the ticcla
     */
    public Integer getTiccla() {
        return ticcla;
    }

    /**
     * Sets the ticcla.
     *
     * @param ticcla the new ticcla
     */
    public void setTiccla(Integer ticcla) {
        this.ticcla = ticcla;
    }

    /**
     * Gets the ticnom.
     *
     * @return the ticnom
     */
    public String getTicnom() {
        return ticnom;
    }

    /**
     * Sets the ticnom.
     *
     * @param ticnom the new ticnom
     */
    public void setTicnom(String ticnom) {
        this.ticnom = ticnom;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[2];
        array[0] = this.ticcla;
        array[1] = this.ticnom;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[2];
        array[0] = "ticcla";
        array[1] = "ticnom";

        return array;
    }
}