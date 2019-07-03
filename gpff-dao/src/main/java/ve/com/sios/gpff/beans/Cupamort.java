/*
 * Cupamort.java
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
 * The Class Cupamort.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 24/03/2014
 */
public class Cupamort implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5722467377900930590L;

    /** The rowid. */
    private Long rowid;

    /** The cupemp. */
    private String cupemp;

    /** The cupdel. */
    private String cupdel;

    /** The cuptip. */
    private String cuptip;

    /** The cupval. */
    private String cupval;

    /** The cupfec. */
    private Integer cupfec;

    /** The cupmnt. */
    private BigDecimal cupmnt;

    /** The cupimp. */
    private BigDecimal cupimp;

    /** The cupcob. */
    private Integer cupcob;

    /** The cupven. */
    private String cupven;

    /** The cupmcb. */
    private String cupmcb;

    /** The cupcbt. */
    private String cupcbt;

    /**
     * Instantiates a new cupamort.
     */
    public Cupamort() {
        super();
        this.cupemp = null;
        this.cupdel = null;
        this.cuptip = null;
        this.cupval = null;
        this.cupfec = null;
        this.cupmnt = null;
        this.cupimp = null;
        this.cupcob = null;
        this.cupven = null;
        this.cupmcb = null;
        this.cupcbt = null;

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
     * Gets the cupemp.
     *
     * @return the cupemp
     */
    public String getCupemp() {
        return cupemp;
    }

    /**
     * Sets the cupemp.
     *
     * @param cupemp the new cupemp
     */
    public void setCupemp(String cupemp) {
        this.cupemp = cupemp;
    }

    /**
     * Gets the cupdel.
     *
     * @return the cupdel
     */
    public String getCupdel() {
        return cupdel;
    }

    /**
     * Sets the cupdel.
     *
     * @param cupdel the new cupdel
     */
    public void setCupdel(String cupdel) {
        this.cupdel = cupdel;
    }

    /**
     * Gets the cuptip.
     *
     * @return the cuptip
     */
    public String getCuptip() {
        return cuptip;
    }

    /**
     * Sets the cuptip.
     *
     * @param cuptip the new cuptip
     */
    public void setCuptip(String cuptip) {
        this.cuptip = cuptip;
    }

    /**
     * Gets the cupval.
     *
     * @return the cupval
     */
    public String getCupval() {
        return cupval;
    }

    /**
     * Sets the cupval.
     *
     * @param cupval the new cupval
     */
    public void setCupval(String cupval) {
        this.cupval = cupval;
    }

    /**
     * Gets the cupfec.
     *
     * @return the cupfec
     */
    public Integer getCupfec() {
        return cupfec;
    }

    /**
     * Sets the cupfec.
     *
     * @param cupfec the new cupfec
     */
    public void setCupfec(Integer cupfec) {
        this.cupfec = cupfec;
    }

    /**
     * Gets the cupmnt.
     *
     * @return the cupmnt
     */
    public BigDecimal getCupmnt() {
        return cupmnt;
    }

    /**
     * Sets the cupmnt.
     *
     * @param cupmnt the new cupmnt
     */
    public void setCupmnt(BigDecimal cupmnt) {
        this.cupmnt = cupmnt;
    }

    /**
     * Gets the cupimp.
     *
     * @return the cupimp
     */
    public BigDecimal getCupimp() {
        return cupimp;
    }

    /**
     * Sets the cupimp.
     *
     * @param cupimp the new cupimp
     */
    public void setCupimp(BigDecimal cupimp) {
        this.cupimp = cupimp;
    }

    /**
     * Gets the cupcob.
     *
     * @return the cupcob
     */
    public Integer getCupcob() {
        return cupcob;
    }

    /**
     * Sets the cupcob.
     *
     * @param cupcob the new cupcob
     */
    public void setCupcob(Integer cupcob) {
        this.cupcob = cupcob;
    }

    /**
     * Gets the cupven.
     *
     * @return the cupven
     */
    public String getCupven() {
        return cupven;
    }

    /**
     * Sets the cupven.
     *
     * @param cupven the new cupven
     */
    public void setCupven(String cupven) {
        this.cupven = cupven;
    }

    /**
     * Gets the cupmcb.
     *
     * @return the cupmcb
     */
    public String getCupmcb() {
        return cupmcb;
    }

    /**
     * Sets the cupmcb.
     *
     * @param cupmcb the new cupmcb
     */
    public void setCupmcb(String cupmcb) {
        this.cupmcb = cupmcb;
    }

    /**
     * Gets the cupcbt.
     *
     * @return the cupcbt
     */
    public String getCupcbt() {
        return cupcbt;
    }

    /**
     * Sets the cupcbt.
     *
     * @param cupcbt the new cupcbt
     */
    public void setCupcbt(String cupcbt) {
        this.cupcbt = cupcbt;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[11];
        array[0] = this.cupemp;
        array[1] = this.cupdel;
        array[2] = this.cuptip;
        array[3] = this.cupval;
        array[4] = this.cupfec;
        array[5] = this.cupmnt;
        array[6] = this.cupimp;
        array[7] = this.cupcob;
        array[8] = this.cupven;
        array[9] = this.cupmcb;
        array[10] = this.cupcbt;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[11];
        array[0] = "cupemp";
        array[1] = "cupdel";
        array[2] = "cuptip";
        array[3] = "cupval";
        array[4] = "cupfec";
        array[5] = "cupmnt";
        array[6] = "cupimp";
        array[7] = "cupcob";
        array[8] = "cupven";
        array[9] = "cupmcb";
        array[10] = "cupcbt";

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
        string += "cupemp: " + this.cupemp + "\n";
        string += "cupdel: " + this.cupdel + "\n";
        string += "cuptip: " + this.cuptip + "\n";
        string += "cupval: " + this.cupval + "\n";
        string += "cupfec: " + this.cupfec + "\n";
        string += "cupmnt: " + this.cupmnt + "\n";
        string += "cupimp: " + this.cupimp + "\n";
        string += "cupcob: " + this.cupcob + "\n";
        string += "cupven: " + this.cupven + "\n";
        string += "cupmcb: " + this.cupmcb + "\n";
        string += "cupcbt: " + this.cupcbt + "\n";

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
        Cupamort other = (Cupamort) obj;
        return this.hashCode() == other.hashCode();
    }

}
