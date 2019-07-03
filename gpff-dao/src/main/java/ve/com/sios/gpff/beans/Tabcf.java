/*
 * Tabcf.java
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
import java.math.BigDecimal;

/**
 * The Class Tabcf.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 31/03/2014
 */
public class Tabcf implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -9036188633194444458L;

    /** The rowid. */
    private Long rowid;

    /** The ntab. */
    private Integer ntab;

    /** The nomtab. */
    private String nomtab;

    /** The comaef. */
    private BigDecimal comaef;

    /** The comapf. */
    private BigDecimal comapf;

    /** The comanf. */
    private BigDecimal comanf;

    /** The commof. */
    private BigDecimal commof;

    /** The comcof. */
    private BigDecimal comcof;

    /** The commaf. */
    private BigDecimal commaf;

    /** The commif. */
    private BigDecimal commif;

    /** The compol. */
    private BigDecimal compol;

    /**
     * Instantiates a new tabcf.
     */
    public Tabcf() {
        super();
        this.ntab = null;
        this.nomtab = null;
        this.comaef = null;
        this.comapf = null;
        this.comanf = null;
        this.commof = null;
        this.comcof = null;
        this.commaf = null;
        this.commif = null;
        this.compol = null;

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
     * Gets the ntab.
     *
     * @return the ntab
     */
    public Integer getNtab() {
        return ntab;
    }

    /**
     * Sets the ntab.
     *
     * @param ntab the new ntab
     */
    public void setNtab(Integer ntab) {
        this.ntab = ntab;
    }

    /**
     * Gets the nomtab.
     *
     * @return the nomtab
     */
    public String getNomtab() {
        return nomtab;
    }

    /**
     * Sets the nomtab.
     *
     * @param nomtab the new nomtab
     */
    public void setNomtab(String nomtab) {
        this.nomtab = nomtab;
    }

    /**
     * Gets the comaef.
     *
     * @return the comaef
     */
    public BigDecimal getComaef() {
        return comaef;
    }

    /**
     * Sets the comaef.
     *
     * @param comaef the new comaef
     */
    public void setComaef(BigDecimal comaef) {
        this.comaef = comaef;
    }

    /**
     * Gets the comapf.
     *
     * @return the comapf
     */
    public BigDecimal getComapf() {
        return comapf;
    }

    /**
     * Sets the comapf.
     *
     * @param comapf the new comapf
     */
    public void setComapf(BigDecimal comapf) {
        this.comapf = comapf;
    }

    /**
     * Gets the comanf.
     *
     * @return the comanf
     */
    public BigDecimal getComanf() {
        return comanf;
    }

    /**
     * Sets the comanf.
     *
     * @param comanf the new comanf
     */
    public void setComanf(BigDecimal comanf) {
        this.comanf = comanf;
    }

    /**
     * Gets the commof.
     *
     * @return the commof
     */
    public BigDecimal getCommof() {
        return commof;
    }

    /**
     * Sets the commof.
     *
     * @param commof the new commof
     */
    public void setCommof(BigDecimal commof) {
        this.commof = commof;
    }

    /**
     * Gets the comcof.
     *
     * @return the comcof
     */
    public BigDecimal getComcof() {
        return comcof;
    }

    /**
     * Sets the comcof.
     *
     * @param comcof the new comcof
     */
    public void setComcof(BigDecimal comcof) {
        this.comcof = comcof;
    }

    /**
     * Gets the commaf.
     *
     * @return the commaf
     */
    public BigDecimal getCommaf() {
        return commaf;
    }

    /**
     * Sets the commaf.
     *
     * @param commaf the new commaf
     */
    public void setCommaf(BigDecimal commaf) {
        this.commaf = commaf;
    }

    /**
     * Gets the commif.
     *
     * @return the commif
     */
    public BigDecimal getCommif() {
        return commif;
    }

    /**
     * Sets the commif.
     *
     * @param commif the new commif
     */
    public void setCommif(BigDecimal commif) {
        this.commif = commif;
    }

    /**
     * Gets the compol.
     *
     * @return the compol
     */
    public BigDecimal getCompol() {
        return compol;
    }

    /**
     * Sets the compol.
     *
     * @param compol the new compol
     */
    public void setCompol(BigDecimal compol) {
        this.compol = compol;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[10];
        array[0] = this.ntab;
        array[1] = this.nomtab;
        array[2] = this.comaef;
        array[3] = this.comapf;
        array[4] = this.comanf;
        array[5] = this.commof;
        array[6] = this.comcof;
        array[7] = this.commaf;
        array[8] = this.commif;
        array[9] = this.compol;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[10];
        array[0] = "ntab";
        array[1] = "nomtab";
        array[2] = "comaef";
        array[3] = "comapf";
        array[4] = "comanf";
        array[5] = "commof";
        array[6] = "comcof";
        array[7] = "commaf";
        array[8] = "commif";
        array[9] = "compol";

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
        string += "ntab: " + this.ntab + "\n";
        string += "nomtab: " + this.nomtab + "\n";
        string += "comaef: " + this.comaef + "\n";
        string += "comapf: " + this.comapf + "\n";
        string += "comanf: " + this.comanf + "\n";
        string += "commof: " + this.commof + "\n";
        string += "comcof: " + this.comcof + "\n";
        string += "commaf: " + this.commaf + "\n";
        string += "commif: " + this.commif + "\n";
        string += "compol: " + this.compol + "\n";

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
        Tabcf other = (Tabcf) obj;
        return this.hashCode() == other.hashCode();
    }

}
