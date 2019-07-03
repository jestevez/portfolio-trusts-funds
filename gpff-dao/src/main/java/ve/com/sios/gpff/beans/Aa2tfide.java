/*
 * Aa2tfide.java
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
 * The Class Aa2tfide.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 27/02/2014
 */
public class Aa2tfide implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8542595983355967140L;

    /** The fidcla. */
    private String fidcla;

    /** The fidnom. */
    private String fidnom;

    /** The fidtip. */
    private Integer fidtip;

    /** The fidfin. */
    private String fidfin;

    /** The divisa. */
    private Integer divisa;

    /**
     * Instantiates a new aa 2 tfide.
     */
    public Aa2tfide() {
        super();
        this.fidcla = null;
        this.fidnom = null;
        this.fidtip = null;
        this.fidfin = null;
        this.divisa = null;

    }

    /**
     * Gets the fidcla.
     *
     * @return the fidcla
     */
    public String getFidcla() {
        return fidcla;
    }

    /**
     * Sets the fidcla.
     *
     * @param fidcla the new fidcla
     */
    public void setFidcla(String fidcla) {
        this.fidcla = fidcla;
    }

    /**
     * Gets the fidnom.
     *
     * @return the fidnom
     */
    public String getFidnom() {
        return fidnom;
    }

    /**
     * Sets the fidnom.
     *
     * @param fidnom the new fidnom
     */
    public void setFidnom(String fidnom) {
        this.fidnom = fidnom;
    }

    /**
     * Gets the fidtip.
     *
     * @return the fidtip
     */
    public Integer getFidtip() {
        return fidtip;
    }

    /**
     * Sets the fidtip.
     *
     * @param fidtip the new fidtip
     */
    public void setFidtip(Integer fidtip) {
        this.fidtip = fidtip;
    }

    /**
     * Gets the fidfin.
     *
     * @return the fidfin
     */
    public String getFidfin() {
        return fidfin;
    }

    /**
     * Sets the fidfin.
     *
     * @param fidfin the new fidfin
     */
    public void setFidfin(String fidfin) {
        this.fidfin = fidfin;
    }

    /**
     * Gets the divisa.
     *
     * @return the divisa
     */
    public Integer getDivisa() {
        return divisa;
    }

    /**
     * Sets the divisa.
     *
     * @param divisa the new divisa
     */
    public void setDivisa(Integer divisa) {
        this.divisa = divisa;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[4];
        array[0] = this.fidcla;
        array[1] = this.fidnom;
        array[2] = this.fidtip;
        array[3] = this.fidfin;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[4];
        array[0] = "fidcla";
        array[1] = "fidnom";
        array[2] = "fidtip";
        array[3] = "fidfin";

        return array;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fidcla == null) ? 0 : fidcla.hashCode());
        result = prime * result + ((fidnom == null) ? 0 : fidnom.hashCode());
        result = prime * result + ((fidnom == null) ? 0 : fidnom.hashCode());
        result = prime * result + ((fidtip == null) ? 0 : fidtip.hashCode());
        result = prime * result + ((fidfin == null) ? 0 : fidfin.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Aa2tfide other = (Aa2tfide) obj;
        return this.hashCode() == other.hashCode();
    }
}
