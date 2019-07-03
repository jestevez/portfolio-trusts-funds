/*
 * Aa2tfis.java
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
 * The Class Aa2tfis.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 01/04/2014
 */
public class Aa2tfis implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2579392365506372149L;

    /** The rowid. */
    private Long rowid;

    /** The fisemp. */
    private String fisemp;

    /** The fisdel. */
    private String fisdel;

    /** The fiscla. */
    private Double fiscla;

    /** The fisnor. */
    private Double fisnor;

    /** The fisbel. */
    private Double fisbel;

    /** The fisbe 1. */
    private Double fisbe1;

    /** The fisdiv. */
    private Double fisdiv;

    /** The fisinv. */
    private Double fisinv;

    /** The fisgin. */
    private Double fisgin;

    /** The fiscap. */
    private Double fiscap;

    /** The fisrdi. */
    private Double fisrdi;

    /** The fisrd 1. */
    private Double fisrd1;

    /** The fiscor. */
    private Double fiscor;

    /** The fisiva. */
    private Double fisiva;

    /**
     * Instantiates a new aa 2 tfis.
     */
    public Aa2tfis() {
        super();
        this.fisemp = null;
        this.fisdel = null;
        this.fiscla = null;
        this.fisnor = null;
        this.fisbel = null;
        this.fisbe1 = null;
        this.fisdiv = null;
        this.fisinv = null;
        this.fisgin = null;
        this.fiscap = null;
        this.fisrdi = null;
        this.fisrd1 = null;
        this.fiscor = null;
        this.fisiva = null;

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
     * Gets the fisemp.
     *
     * @return the fisemp
     */
    public String getFisemp() {
        return fisemp;
    }

    /**
     * Sets the fisemp.
     *
     * @param fisemp the new fisemp
     */
    public void setFisemp(String fisemp) {
        this.fisemp = fisemp;
    }

    /**
     * Gets the fisdel.
     *
     * @return the fisdel
     */
    public String getFisdel() {
        return fisdel;
    }

    /**
     * Sets the fisdel.
     *
     * @param fisdel the new fisdel
     */
    public void setFisdel(String fisdel) {
        this.fisdel = fisdel;
    }

    /**
     * Gets the fiscla.
     *
     * @return the fiscla
     */
    public Double getFiscla() {
        return fiscla;
    }

    /**
     * Sets the fiscla.
     *
     * @param fiscla the new fiscla
     */
    public void setFiscla(Double fiscla) {
        this.fiscla = fiscla;
    }

    /**
     * Gets the fisnor.
     *
     * @return the fisnor
     */
    public Double getFisnor() {
        return fisnor;
    }

    /**
     * Sets the fisnor.
     *
     * @param fisnor the new fisnor
     */
    public void setFisnor(Double fisnor) {
        this.fisnor = fisnor;
    }

    /**
     * Gets the fisbel.
     *
     * @return the fisbel
     */
    public Double getFisbel() {
        return fisbel;
    }

    /**
     * Sets the fisbel.
     *
     * @param fisbel the new fisbel
     */
    public void setFisbel(Double fisbel) {
        this.fisbel = fisbel;
    }

    /**
     * Gets the fisbe 1.
     *
     * @return the fisbe 1
     */
    public Double getFisbe1() {
        return fisbe1;
    }

    /**
     * Sets the fisbe 1.
     *
     * @param fisbe1 the new fisbe 1
     */
    public void setFisbe1(Double fisbe1) {
        this.fisbe1 = fisbe1;
    }

    /**
     * Gets the fisdiv.
     *
     * @return the fisdiv
     */
    public Double getFisdiv() {
        return fisdiv;
    }

    /**
     * Sets the fisdiv.
     *
     * @param fisdiv the new fisdiv
     */
    public void setFisdiv(Double fisdiv) {
        this.fisdiv = fisdiv;
    }

    /**
     * Gets the fisinv.
     *
     * @return the fisinv
     */
    public Double getFisinv() {
        return fisinv;
    }

    /**
     * Sets the fisinv.
     *
     * @param fisinv the new fisinv
     */
    public void setFisinv(Double fisinv) {
        this.fisinv = fisinv;
    }

    /**
     * Gets the fisgin.
     *
     * @return the fisgin
     */
    public Double getFisgin() {
        return fisgin;
    }

    /**
     * Sets the fisgin.
     *
     * @param fisgin the new fisgin
     */
    public void setFisgin(Double fisgin) {
        this.fisgin = fisgin;
    }

    /**
     * Gets the fiscap.
     *
     * @return the fiscap
     */
    public Double getFiscap() {
        return fiscap;
    }

    /**
     * Sets the fiscap.
     *
     * @param fiscap the new fiscap
     */
    public void setFiscap(Double fiscap) {
        this.fiscap = fiscap;
    }

    /**
     * Gets the fisrdi.
     *
     * @return the fisrdi
     */
    public Double getFisrdi() {
        return fisrdi;
    }

    /**
     * Sets the fisrdi.
     *
     * @param fisrdi the new fisrdi
     */
    public void setFisrdi(Double fisrdi) {
        this.fisrdi = fisrdi;
    }

    /**
     * Gets the fisrd 1.
     *
     * @return the fisrd 1
     */
    public Double getFisrd1() {
        return fisrd1;
    }

    /**
     * Sets the fisrd 1.
     *
     * @param fisrd1 the new fisrd 1
     */
    public void setFisrd1(Double fisrd1) {
        this.fisrd1 = fisrd1;
    }

    /**
     * Gets the fiscor.
     *
     * @return the fiscor
     */
    public Double getFiscor() {
        return fiscor;
    }

    /**
     * Sets the fiscor.
     *
     * @param fiscor the new fiscor
     */
    public void setFiscor(Double fiscor) {
        this.fiscor = fiscor;
    }

    /**
     * Gets the fisiva.
     *
     * @return the fisiva
     */
    public Double getFisiva() {
        return fisiva;
    }

    /**
     * Sets the fisiva.
     *
     * @param fisiva the new fisiva
     */
    public void setFisiva(Double fisiva) {
        this.fisiva = fisiva;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[14];
        array[0] = this.fisemp;
        array[1] = this.fisdel;
        array[2] = this.fiscla;
        array[3] = this.fisnor;
        array[4] = this.fisbel;
        array[5] = this.fisbe1;
        array[6] = this.fisdiv;
        array[7] = this.fisinv;
        array[8] = this.fisgin;
        array[9] = this.fiscap;
        array[10] = this.fisrdi;
        array[11] = this.fisrd1;
        array[12] = this.fiscor;
        array[13] = this.fisiva;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[14];
        array[0] = "fisemp";
        array[1] = "fisdel";
        array[2] = "fiscla";
        array[3] = "fisnor";
        array[4] = "fisbel";
        array[5] = "fisbe1";
        array[6] = "fisdiv";
        array[7] = "fisinv";
        array[8] = "fisgin";
        array[9] = "fiscap";
        array[10] = "fisrdi";
        array[11] = "fisrd1";
        array[12] = "fiscor";
        array[13] = "fisiva";

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
        string += "fisemp: " + this.fisemp + "\n";
        string += "fisdel: " + this.fisdel + "\n";
        string += "fiscla: " + this.fiscla + "\n";
        string += "fisnor: " + this.fisnor + "\n";
        string += "fisbel: " + this.fisbel + "\n";
        string += "fisbe1: " + this.fisbe1 + "\n";
        string += "fisdiv: " + this.fisdiv + "\n";
        string += "fisinv: " + this.fisinv + "\n";
        string += "fisgin: " + this.fisgin + "\n";
        string += "fiscap: " + this.fiscap + "\n";
        string += "fisrdi: " + this.fisrdi + "\n";
        string += "fisrd1: " + this.fisrd1 + "\n";
        string += "fiscor: " + this.fiscor + "\n";
        string += "fisiva: " + this.fisiva + "\n";

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
        Aa2tfis other = (Aa2tfis) obj;
        return this.hashCode() == other.hashCode();
    }

}
