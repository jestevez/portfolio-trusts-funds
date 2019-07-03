/*
 * Cgmaxmin.java
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
 * The Class Cgmaxmin.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 25/03/2014
 */
public class Cgmaxmin implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7739301821987789556L;

    /** The rowid. */
    private Long rowid;

    /** The cgmemp. */
    private String cgmemp;

    /** The cgmdel. */
    private String cgmdel;

    /** The cgmfmt. */
    private Integer cgmfmt;

    /** The cgmnct. */
    private Integer cgmnct;

    /** The cgmcli. */
    private Integer cgmcli;

    /** The cgmcod. */
    private Integer cgmcod;

    /** The cgmmax. */
    private BigDecimal cgmmax;

    /** The cgmmin. */
    private BigDecimal cgmmin;

    /** The cgmds 1. */
    private BigDecimal cgmds1;

    /** The cgmhs 1. */
    private BigDecimal cgmhs1;

    /** The cgmpr 1. */
    private BigDecimal cgmpr1;

    /** The cgmds 2. */
    private BigDecimal cgmds2;

    /** The cgmhs 2. */
    private BigDecimal cgmhs2;

    /** The cgmpr 2. */
    private BigDecimal cgmpr2;

    /** The cgmds 3. */
    private BigDecimal cgmds3;

    /** The cgmhs 3. */
    private BigDecimal cgmhs3;

    /** The cgmpr 3. */
    private BigDecimal cgmpr3;

    /** The cgmds 4. */
    private BigDecimal cgmds4;

    /** The cgmhs 4. */
    private BigDecimal cgmhs4;

    /** The cgmpr 4. */
    private BigDecimal cgmpr4;

    /** The cgmds 5. */
    private BigDecimal cgmds5;

    /** The cgmhs 5. */
    private BigDecimal cgmhs5;

    /** The cgmpr 5. */
    private BigDecimal cgmpr5;

    /** The cgmds 6. */
    private BigDecimal cgmds6;

    /** The cgmhs 6. */
    private BigDecimal cgmhs6;

    /** The cgmpr 6. */
    private BigDecimal cgmpr6;

    /**
     * Instantiates a new cgmaxmin.
     */
    public Cgmaxmin() {
        super();
        this.cgmemp = null;
        this.cgmdel = null;
        this.cgmfmt = null;
        this.cgmnct = null;
        this.cgmcli = null;
        this.cgmcod = null;
        this.cgmmax = null;
        this.cgmmin = null;
        this.cgmds1 = null;
        this.cgmhs1 = null;
        this.cgmpr1 = null;
        this.cgmds2 = null;
        this.cgmhs2 = null;
        this.cgmpr2 = null;
        this.cgmds3 = null;
        this.cgmhs3 = null;
        this.cgmpr3 = null;
        this.cgmds4 = null;
        this.cgmhs4 = null;
        this.cgmpr4 = null;
        this.cgmds5 = null;
        this.cgmhs5 = null;
        this.cgmpr5 = null;
        this.cgmds6 = null;
        this.cgmhs6 = null;
        this.cgmpr6 = null;

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
     * Gets the cgmemp.
     *
     * @return the cgmemp
     */
    public String getCgmemp() {
        return cgmemp;
    }

    /**
     * Sets the cgmemp.
     *
     * @param cgmemp the new cgmemp
     */
    public void setCgmemp(String cgmemp) {
        this.cgmemp = cgmemp;
    }

    /**
     * Gets the cgmdel.
     *
     * @return the cgmdel
     */
    public String getCgmdel() {
        return cgmdel;
    }

    /**
     * Sets the cgmdel.
     *
     * @param cgmdel the new cgmdel
     */
    public void setCgmdel(String cgmdel) {
        this.cgmdel = cgmdel;
    }

    /**
     * Gets the cgmfmt.
     *
     * @return the cgmfmt
     */
    public Integer getCgmfmt() {
        return cgmfmt;
    }

    /**
     * Sets the cgmfmt.
     *
     * @param cgmfmt the new cgmfmt
     */
    public void setCgmfmt(Integer cgmfmt) {
        this.cgmfmt = cgmfmt;
    }

    /**
     * Gets the cgmnct.
     *
     * @return the cgmnct
     */
    public Integer getCgmnct() {
        return cgmnct;
    }

    /**
     * Sets the cgmnct.
     *
     * @param cgmnct the new cgmnct
     */
    public void setCgmnct(Integer cgmnct) {
        this.cgmnct = cgmnct;
    }

    /**
     * Gets the cgmcli.
     *
     * @return the cgmcli
     */
    public Integer getCgmcli() {
        return cgmcli;
    }

    /**
     * Sets the cgmcli.
     *
     * @param cgmcli the new cgmcli
     */
    public void setCgmcli(Integer cgmcli) {
        this.cgmcli = cgmcli;
    }

    /**
     * Gets the cgmcod.
     *
     * @return the cgmcod
     */
    public Integer getCgmcod() {
        return cgmcod;
    }

    /**
     * Sets the cgmcod.
     *
     * @param cgmcod the new cgmcod
     */
    public void setCgmcod(Integer cgmcod) {
        this.cgmcod = cgmcod;
    }

    /**
     * Gets the cgmmax.
     *
     * @return the cgmmax
     */
    public BigDecimal getCgmmax() {
        return cgmmax;
    }

    /**
     * Sets the cgmmax.
     *
     * @param cgmmax the new cgmmax
     */
    public void setCgmmax(BigDecimal cgmmax) {
        this.cgmmax = cgmmax;
    }

    /**
     * Gets the cgmmin.
     *
     * @return the cgmmin
     */
    public BigDecimal getCgmmin() {
        return cgmmin;
    }

    /**
     * Sets the cgmmin.
     *
     * @param cgmmin the new cgmmin
     */
    public void setCgmmin(BigDecimal cgmmin) {
        this.cgmmin = cgmmin;
    }

    /**
     * Gets the cgmds 1.
     *
     * @return the cgmds 1
     */
    public BigDecimal getCgmds1() {
        return cgmds1;
    }

    /**
     * Sets the cgmds 1.
     *
     * @param cgmds1 the new cgmds 1
     */
    public void setCgmds1(BigDecimal cgmds1) {
        this.cgmds1 = cgmds1;
    }

    /**
     * Gets the cgmhs 1.
     *
     * @return the cgmhs 1
     */
    public BigDecimal getCgmhs1() {
        return cgmhs1;
    }

    /**
     * Sets the cgmhs 1.
     *
     * @param cgmhs1 the new cgmhs 1
     */
    public void setCgmhs1(BigDecimal cgmhs1) {
        this.cgmhs1 = cgmhs1;
    }

    /**
     * Gets the cgmpr 1.
     *
     * @return the cgmpr 1
     */
    public BigDecimal getCgmpr1() {
        return cgmpr1;
    }

    /**
     * Sets the cgmpr 1.
     *
     * @param cgmpr1 the new cgmpr 1
     */
    public void setCgmpr1(BigDecimal cgmpr1) {
        this.cgmpr1 = cgmpr1;
    }

    /**
     * Gets the cgmds 2.
     *
     * @return the cgmds 2
     */
    public BigDecimal getCgmds2() {
        return cgmds2;
    }

    /**
     * Sets the cgmds 2.
     *
     * @param cgmds2 the new cgmds 2
     */
    public void setCgmds2(BigDecimal cgmds2) {
        this.cgmds2 = cgmds2;
    }

    /**
     * Gets the cgmhs 2.
     *
     * @return the cgmhs 2
     */
    public BigDecimal getCgmhs2() {
        return cgmhs2;
    }

    /**
     * Sets the cgmhs 2.
     *
     * @param cgmhs2 the new cgmhs 2
     */
    public void setCgmhs2(BigDecimal cgmhs2) {
        this.cgmhs2 = cgmhs2;
    }

    /**
     * Gets the cgmpr 2.
     *
     * @return the cgmpr 2
     */
    public BigDecimal getCgmpr2() {
        return cgmpr2;
    }

    /**
     * Sets the cgmpr 2.
     *
     * @param cgmpr2 the new cgmpr 2
     */
    public void setCgmpr2(BigDecimal cgmpr2) {
        this.cgmpr2 = cgmpr2;
    }

    /**
     * Gets the cgmds 3.
     *
     * @return the cgmds 3
     */
    public BigDecimal getCgmds3() {
        return cgmds3;
    }

    /**
     * Sets the cgmds 3.
     *
     * @param cgmds3 the new cgmds 3
     */
    public void setCgmds3(BigDecimal cgmds3) {
        this.cgmds3 = cgmds3;
    }

    /**
     * Gets the cgmhs 3.
     *
     * @return the cgmhs 3
     */
    public BigDecimal getCgmhs3() {
        return cgmhs3;
    }

    /**
     * Sets the cgmhs 3.
     *
     * @param cgmhs3 the new cgmhs 3
     */
    public void setCgmhs3(BigDecimal cgmhs3) {
        this.cgmhs3 = cgmhs3;
    }

    /**
     * Gets the cgmpr 3.
     *
     * @return the cgmpr 3
     */
    public BigDecimal getCgmpr3() {
        return cgmpr3;
    }

    /**
     * Sets the cgmpr 3.
     *
     * @param cgmpr3 the new cgmpr 3
     */
    public void setCgmpr3(BigDecimal cgmpr3) {
        this.cgmpr3 = cgmpr3;
    }

    /**
     * Gets the cgmds 4.
     *
     * @return the cgmds 4
     */
    public BigDecimal getCgmds4() {
        return cgmds4;
    }

    /**
     * Sets the cgmds 4.
     *
     * @param cgmds4 the new cgmds 4
     */
    public void setCgmds4(BigDecimal cgmds4) {
        this.cgmds4 = cgmds4;
    }

    /**
     * Gets the cgmhs 4.
     *
     * @return the cgmhs 4
     */
    public BigDecimal getCgmhs4() {
        return cgmhs4;
    }

    /**
     * Sets the cgmhs 4.
     *
     * @param cgmhs4 the new cgmhs 4
     */
    public void setCgmhs4(BigDecimal cgmhs4) {
        this.cgmhs4 = cgmhs4;
    }

    /**
     * Gets the cgmpr 4.
     *
     * @return the cgmpr 4
     */
    public BigDecimal getCgmpr4() {
        return cgmpr4;
    }

    /**
     * Sets the cgmpr 4.
     *
     * @param cgmpr4 the new cgmpr 4
     */
    public void setCgmpr4(BigDecimal cgmpr4) {
        this.cgmpr4 = cgmpr4;
    }

    /**
     * Gets the cgmds 5.
     *
     * @return the cgmds 5
     */
    public BigDecimal getCgmds5() {
        return cgmds5;
    }

    /**
     * Sets the cgmds 5.
     *
     * @param cgmds5 the new cgmds 5
     */
    public void setCgmds5(BigDecimal cgmds5) {
        this.cgmds5 = cgmds5;
    }

    /**
     * Gets the cgmhs 5.
     *
     * @return the cgmhs 5
     */
    public BigDecimal getCgmhs5() {
        return cgmhs5;
    }

    /**
     * Sets the cgmhs 5.
     *
     * @param cgmhs5 the new cgmhs 5
     */
    public void setCgmhs5(BigDecimal cgmhs5) {
        this.cgmhs5 = cgmhs5;
    }

    /**
     * Gets the cgmpr 5.
     *
     * @return the cgmpr 5
     */
    public BigDecimal getCgmpr5() {
        return cgmpr5;
    }

    /**
     * Sets the cgmpr 5.
     *
     * @param cgmpr5 the new cgmpr 5
     */
    public void setCgmpr5(BigDecimal cgmpr5) {
        this.cgmpr5 = cgmpr5;
    }

    /**
     * Gets the cgmds 6.
     *
     * @return the cgmds 6
     */
    public BigDecimal getCgmds6() {
        return cgmds6;
    }

    /**
     * Sets the cgmds 6.
     *
     * @param cgmds6 the new cgmds 6
     */
    public void setCgmds6(BigDecimal cgmds6) {
        this.cgmds6 = cgmds6;
    }

    /**
     * Gets the cgmhs 6.
     *
     * @return the cgmhs 6
     */
    public BigDecimal getCgmhs6() {
        return cgmhs6;
    }

    /**
     * Sets the cgmhs 6.
     *
     * @param cgmhs6 the new cgmhs 6
     */
    public void setCgmhs6(BigDecimal cgmhs6) {
        this.cgmhs6 = cgmhs6;
    }

    /**
     * Gets the cgmpr 6.
     *
     * @return the cgmpr 6
     */
    public BigDecimal getCgmpr6() {
        return cgmpr6;
    }

    /**
     * Sets the cgmpr 6.
     *
     * @param cgmpr6 the new cgmpr 6
     */
    public void setCgmpr6(BigDecimal cgmpr6) {
        this.cgmpr6 = cgmpr6;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[26];
        array[0] = this.cgmemp;
        array[1] = this.cgmdel;
        array[2] = this.cgmfmt;
        array[3] = this.cgmnct;
        array[4] = this.cgmcli;
        array[5] = this.cgmcod;
        array[6] = this.cgmmax;
        array[7] = this.cgmmin;
        array[8] = this.cgmds1;
        array[9] = this.cgmhs1;
        array[10] = this.cgmpr1;
        array[11] = this.cgmds2;
        array[12] = this.cgmhs2;
        array[13] = this.cgmpr2;
        array[14] = this.cgmds3;
        array[15] = this.cgmhs3;
        array[16] = this.cgmpr3;
        array[17] = this.cgmds4;
        array[18] = this.cgmhs4;
        array[19] = this.cgmpr4;
        array[20] = this.cgmds5;
        array[21] = this.cgmhs5;
        array[22] = this.cgmpr5;
        array[23] = this.cgmds6;
        array[24] = this.cgmhs6;
        array[25] = this.cgmpr6;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[26];
        array[0] = "cgmemp";
        array[1] = "cgmdel";
        array[2] = "cgmfmt";
        array[3] = "cgmnct";
        array[4] = "cgmcli";
        array[5] = "cgmcod";
        array[6] = "cgmmax";
        array[7] = "cgmmin";
        array[8] = "cgmds1";
        array[9] = "cgmhs1";
        array[10] = "cgmpr1";
        array[11] = "cgmds2";
        array[12] = "cgmhs2";
        array[13] = "cgmpr2";
        array[14] = "cgmds3";
        array[15] = "cgmhs3";
        array[16] = "cgmpr3";
        array[17] = "cgmds4";
        array[18] = "cgmhs4";
        array[19] = "cgmpr4";
        array[20] = "cgmds5";
        array[21] = "cgmhs5";
        array[22] = "cgmpr5";
        array[23] = "cgmds6";
        array[24] = "cgmhs6";
        array[25] = "cgmpr6";

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
        string += "cgmemp: " + this.cgmemp + "\n";
        string += "cgmdel: " + this.cgmdel + "\n";
        string += "cgmfmt: " + this.cgmfmt + "\n";
        string += "cgmnct: " + this.cgmnct + "\n";
        string += "cgmcli: " + this.cgmcli + "\n";
        string += "cgmcod: " + this.cgmcod + "\n";
        string += "cgmmax: " + this.cgmmax + "\n";
        string += "cgmmin: " + this.cgmmin + "\n";
        string += "cgmds1: " + this.cgmds1 + "\n";
        string += "cgmhs1: " + this.cgmhs1 + "\n";
        string += "cgmpr1: " + this.cgmpr1 + "\n";
        string += "cgmds2: " + this.cgmds2 + "\n";
        string += "cgmhs2: " + this.cgmhs2 + "\n";
        string += "cgmpr2: " + this.cgmpr2 + "\n";
        string += "cgmds3: " + this.cgmds3 + "\n";
        string += "cgmhs3: " + this.cgmhs3 + "\n";
        string += "cgmpr3: " + this.cgmpr3 + "\n";
        string += "cgmds4: " + this.cgmds4 + "\n";
        string += "cgmhs4: " + this.cgmhs4 + "\n";
        string += "cgmpr4: " + this.cgmpr4 + "\n";
        string += "cgmds5: " + this.cgmds5 + "\n";
        string += "cgmhs5: " + this.cgmhs5 + "\n";
        string += "cgmpr5: " + this.cgmpr5 + "\n";
        string += "cgmds6: " + this.cgmds6 + "\n";
        string += "cgmhs6: " + this.cgmhs6 + "\n";
        string += "cgmpr6: " + this.cgmpr6 + "\n";

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
        Cgmaxmin other = (Cgmaxmin) obj;
        return this.hashCode() == other.hashCode();
    }

}
