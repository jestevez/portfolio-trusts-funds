/*
 * Tiposfid.java
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
 * The Class Tiposfid.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 16/01/2014
 */
public class Tiposfid implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4132337256981694670L;

    /** The fidtip. */
    private Integer fidtip;

    /** The fidtxt. */
    private String fidtxt;

    /**
     * Instantiates a new tiposfid.
     */
    public Tiposfid() {
        super();
        this.fidtip = null;
        this.fidtxt = null;
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
     * Gets the fidtxt.
     *
     * @return the fidtxt
     */
    public String getFidtxt() {
        return fidtxt;
    }

    /**
     * Sets the fidtxt.
     *
     * @param fidtxt the new fidtxt
     */
    public void setFidtxt(String fidtxt) {
        this.fidtxt = fidtxt;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[2];
        array[0] = this.fidtip;
        array[1] = this.fidtxt;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[2];
        array[0] = "fidtip";
        array[1] = "fidtxt";

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
        result = prime * result + ((fidtip == null) ? 0 : fidtip.hashCode());
        result = prime * result + ((fidtxt == null) ? 0 : fidtxt.hashCode());
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
        Tiposfid other = (Tiposfid) obj;
        return this.hashCode() == other.hashCode();
    }
}
