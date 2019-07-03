/*
 * Contratoau.java
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
import java.math.BigDecimal;

/**
 * The Class Contratoau.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 24/03/2014
 */
public class Contratoau implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3164097332371476274L;

    /** The rowid. */
    private Long rowid;

    /** The conema. */
    private String conema;

    /** The condea. */
    private String condea;

    /** The cosami. */
    private BigDecimal cosami;

    /** The mosami. */
    private BigDecimal mosami;

    /** The salmin. */
    private BigDecimal salmin;

    /**
     * Instantiates a new contratoau.
     */
    public Contratoau() {
        super();
        this.conema = null;
        this.condea = null;
        this.cosami = null;
        this.mosami = null;
        this.salmin = null;

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
     * Gets the conema.
     *
     * @return the conema
     */
    public String getConema() {
        return conema;
    }

    /**
     * Sets the conema.
     *
     * @param conema the new conema
     */
    public void setConema(String conema) {
        this.conema = conema;
    }

    /**
     * Gets the condea.
     *
     * @return the condea
     */
    public String getCondea() {
        return condea;
    }

    /**
     * Sets the condea.
     *
     * @param condea the new condea
     */
    public void setCondea(String condea) {
        this.condea = condea;
    }

    /**
     * Gets the cosami.
     *
     * @return the cosami
     */
    public BigDecimal getCosami() {
        return cosami;
    }

    /**
     * Sets the cosami.
     *
     * @param cosami the new cosami
     */
    public void setCosami(BigDecimal cosami) {
        this.cosami = cosami;
    }

    /**
     * Gets the mosami.
     *
     * @return the mosami
     */
    public BigDecimal getMosami() {
        return mosami;
    }

    /**
     * Sets the mosami.
     *
     * @param mosami the new mosami
     */
    public void setMosami(BigDecimal mosami) {
        this.mosami = mosami;
    }

    /**
     * Gets the salmin.
     *
     * @return the salmin
     */
    public BigDecimal getSalmin() {
        return salmin;
    }

    /**
     * Sets the salmin.
     *
     * @param salmin the new salmin
     */
    public void setSalmin(BigDecimal salmin) {
        this.salmin = salmin;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[5];
        array[0] = this.conema;
        array[1] = this.condea;
        array[2] = this.cosami;
        array[3] = this.mosami;
        array[4] = this.salmin;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[5];
        array[0] = "conema";
        array[1] = "condea";
        array[2] = "cosami";
        array[3] = "mosami";
        array[4] = "salmin";

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
        string += "conema: " + this.conema + "\n";
        string += "condea: " + this.condea + "\n";
        string += "cosami: " + this.cosami + "\n";
        string += "mosami: " + this.mosami + "\n";
        string += "salmin: " + this.salmin + "\n";

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
        Contratoau other = (Contratoau) obj;
        return this.hashCode() == other.hashCode();
    }

}
