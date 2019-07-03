/*
 * Aa2tprcl.java
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
 * The Class Aa2tprcl.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 31/03/2014
 */
public class Aa2tprcl implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1244977357914190695L;

    /** The rowid. */
    private Long rowid;

    /** The pclemp. */
    private String pclemp;

    /** The pcldel. */
    private String pcldel;

    /** The pclcla. */
    private Long pclcla;

    /** The pclnom. */
    private String pclnom;

    /** The pclcta. */
    private String pclcta;

    /**
     * Instantiates a new aa 2 tprcl.
     */
    public Aa2tprcl() {
        super();
        this.pclemp = null;
        this.pcldel = null;
        this.pclcla = null;
        this.pclnom = null;
        this.pclcta = null;

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
     * Gets the pclemp.
     *
     * @return the pclemp
     */
    public String getPclemp() {
        return pclemp;
    }

    /**
     * Sets the pclemp.
     *
     * @param pclemp the new pclemp
     */
    public void setPclemp(String pclemp) {
        this.pclemp = pclemp;
    }

    /**
     * Gets the pcldel.
     *
     * @return the pcldel
     */
    public String getPcldel() {
        return pcldel;
    }

    /**
     * Sets the pcldel.
     *
     * @param pcldel the new pcldel
     */
    public void setPcldel(String pcldel) {
        this.pcldel = pcldel;
    }

    /**
     * Gets the pclcla.
     *
     * @return the pclcla
     */
    public Long getPclcla() {
        return pclcla;
    }

    /**
     * Sets the pclcla.
     *
     * @param pclcla the new pclcla
     */
    public void setPclcla(Long pclcla) {
        this.pclcla = pclcla;
    }

    /**
     * Gets the pclnom.
     *
     * @return the pclnom
     */
    public String getPclnom() {
        return pclnom;
    }

    /**
     * Sets the pclnom.
     *
     * @param pclnom the new pclnom
     */
    public void setPclnom(String pclnom) {
        this.pclnom = pclnom;
    }

    /**
     * Gets the pclcta.
     *
     * @return the pclcta
     */
    public String getPclcta() {
        return pclcta;
    }

    /**
     * Sets the pclcta.
     *
     * @param pclcta the new pclcta
     */
    public void setPclcta(String pclcta) {
        this.pclcta = pclcta;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[5];
        array[0] = this.pclemp;
        array[1] = this.pcldel;
        array[2] = this.pclcla;
        array[3] = this.pclnom;
        array[4] = this.pclcta;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[5];
        array[0] = "pclemp";
        array[1] = "pcldel";
        array[2] = "pclcla";
        array[3] = "pclnom";
        array[4] = "pclcta";

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
        string += "pclemp: " + this.pclemp + "\n";
        string += "pcldel: " + this.pcldel + "\n";
        string += "pclcla: " + this.pclcla + "\n";
        string += "pclnom: " + this.pclnom + "\n";
        string += "pclcta: " + this.pclcta + "\n";

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
        Aa2tprcl other = (Aa2tprcl) obj;
        return this.hashCode() == other.hashCode();
    }

}
