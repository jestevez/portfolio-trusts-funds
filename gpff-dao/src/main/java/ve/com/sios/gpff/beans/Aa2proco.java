/*
 * Aa2proco.java
 *
 * Copyright 2014 - Soluciones Integrales Open-Source SiOS
 * Copyright 2014 - Fundación para la Investigación y Desarrollo del Software Libre en Venezuela
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
 * The Class Aa2proco.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 03/04/2014
 */
public class Aa2proco implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4338428240357123004L;

    /** The rowid. */
    private Long rowid;

    /** The rtipo. */
    private String rtipo;

    /** The rtico. */
    private Integer rtico;

    /** The rprod. */
    private Integer rprod;

    /**
     * Instantiates a new aa 2 proco.
     */
    public Aa2proco() {
        super();
        this.rtipo = null;
        this.rtico = null;
        this.rprod = null;

    }

    /**
     * Gets the rowid.
     *
     * @return the rowid
     */
    public Long getRowid() {
        return rowid;
    }

    /**
     * Sets the rowid.
     *
     * @param rowid the new rowid
     */
    public void setRowid(Long rowid) {
        this.rowid = rowid;
    }

    /**
     * Gets the rtipo.
     *
     * @return the rtipo
     */
    public String getRtipo() {
        return rtipo;
    }

    /**
     * Sets the rtipo.
     *
     * @param rtipo the new rtipo
     */
    public void setRtipo(String rtipo) {
        this.rtipo = rtipo;
    }

    /**
     * Gets the rtico.
     *
     * @return the rtico
     */
    public Integer getRtico() {
        return rtico;
    }

    /**
     * Sets the rtico.
     *
     * @param rtico the new rtico
     */
    public void setRtico(Integer rtico) {
        this.rtico = rtico;
    }

    /**
     * Gets the rprod.
     *
     * @return the rprod
     */
    public Integer getRprod() {
        return rprod;
    }

    /**
     * Sets the rprod.
     *
     * @param rprod the new rprod
     */
    public void setRprod(Integer rprod) {
        this.rprod = rprod;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[3];
        array[0] = this.rtipo;
        array[1] = this.rtico;
        array[2] = this.rprod;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[3];
        array[0] = "rtipo";
        array[1] = "rtico";
        array[2] = "rprod";

        return array;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String string = "";
        string += "rtipo: " + this.rtipo + "\n";
        string += "rtico: " + this.rtico + "\n";
        string += "rprod: " + this.rprod + "\n";

        return string;
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

        Object[] array = toArray();
        for (Object object : array) {
            result = prime * result + ((object == null) ? 0 : object.hashCode());
        }
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
        Aa2proco other = (Aa2proco) obj;
        return this.hashCode() == other.hashCode();
    }

}