/*
 * Aa2tpais.java
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
 * The Class Aa2tpais.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 17/02/2014
 */
public class Aa2tpais implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5931181510387927994L;

    /** The paicla. */
    private Long paicla;

    /** The painom. */
    private String painom;

    /** The paictr. */
    private Long paictr;

    /**
     * Instantiates a new aa 2 tpais.
     */
    public Aa2tpais() {
        super();
        this.paicla = null;
        this.painom = null;
        this.paictr = null;

    }

    /**
     * Gets the paicla.
     *
     * @return the paicla
     */
    public Long getPaicla() {
        return paicla;
    }

    /**
     * Sets the paicla.
     *
     * @param paicla the new paicla
     */
    public void setPaicla(Long paicla) {
        this.paicla = paicla;
    }

    /**
     * Gets the painom.
     *
     * @return the painom
     */
    public String getPainom() {
        return painom;
    }

    /**
     * Sets the painom.
     *
     * @param painom the new painom
     */
    public void setPainom(String painom) {
        this.painom = painom;
    }

    /**
     * Gets the paictr.
     *
     * @return the paictr
     */
    public Long getPaictr() {
        return paictr;
    }

    /**
     * Sets the paictr.
     *
     * @param paictr the new paictr
     */
    public void setPaictr(Long paictr) {
        this.paictr = paictr;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[3];
        array[0] = this.paicla;
        array[1] = this.painom;
        array[2] = this.paictr;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[3];
        array[0] = "paicla";
        array[1] = "painom";
        array[2] = "paictr";

        return array;
    }
}
