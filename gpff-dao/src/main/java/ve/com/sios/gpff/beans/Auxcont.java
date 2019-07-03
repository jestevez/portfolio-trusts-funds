/*
 * Auxcont.java
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
 * The Class Auxcont.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 17/05/2014
 */
public class Auxcont implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4046587645154427773L;

    /** The rowid. */
    private Long rowid;

    /** The axcare. */
    private String axcare;

    /** The axcnct. */
    private Long axcnct;

    /** The axccap. */
    private Integer axccap;

    /** The axccpp. */
    private Integer axccpp;

    /** The axcamp. */
    private Integer axcamp;

    /** The axcedm. */
    private Integer axcedm;

    /** The axcemh. */
    private Integer axcemh;

    /** The axcemm. */
    private Integer axcemm;

    /** The axcprt. */
    private Double axcprt;

    /**
     * Instantiates a new auxcont.
     */
    public Auxcont() {
        super();
        this.axcare = null;
        this.axcnct = null;
        this.axccap = null;
        this.axccpp = null;
        this.axcamp = null;
        this.axcedm = null;
        this.axcemh = null;
        this.axcemm = null;
        this.axcprt = null;

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
     * Gets the axcare.
     *
     * @return the axcare
     */
    public String getAxcare() {
        return axcare;
    }

    /**
     * Sets the axcare.
     *
     * @param axcare the new axcare
     */
    public void setAxcare(String axcare) {
        this.axcare = axcare;
    }

    /**
     * Gets the axcnct.
     *
     * @return the axcnct
     */
    public Long getAxcnct() {
        return axcnct;
    }

    /**
     * Sets the axcnct.
     *
     * @param axcnct the new axcnct
     */
    public void setAxcnct(Long axcnct) {
        this.axcnct = axcnct;
    }

    /**
     * Gets the axccap.
     *
     * @return the axccap
     */
    public Integer getAxccap() {
        return axccap;
    }

    /**
     * Sets the axccap.
     *
     * @param axccap the new axccap
     */
    public void setAxccap(Integer axccap) {
        this.axccap = axccap;
    }

    /**
     * Gets the axccpp.
     *
     * @return the axccpp
     */
    public Integer getAxccpp() {
        return axccpp;
    }

    /**
     * Sets the axccpp.
     *
     * @param axccpp the new axccpp
     */
    public void setAxccpp(Integer axccpp) {
        this.axccpp = axccpp;
    }

    /**
     * Gets the axcamp.
     *
     * @return the axcamp
     */
    public Integer getAxcamp() {
        return axcamp;
    }

    /**
     * Sets the axcamp.
     *
     * @param axcamp the new axcamp
     */
    public void setAxcamp(Integer axcamp) {
        this.axcamp = axcamp;
    }

    /**
     * Gets the axcedm.
     *
     * @return the axcedm
     */
    public Integer getAxcedm() {
        return axcedm;
    }

    /**
     * Sets the axcedm.
     *
     * @param axcedm the new axcedm
     */
    public void setAxcedm(Integer axcedm) {
        this.axcedm = axcedm;
    }

    /**
     * Gets the axcemh.
     *
     * @return the axcemh
     */
    public Integer getAxcemh() {
        return axcemh;
    }

    /**
     * Sets the axcemh.
     *
     * @param axcemh the new axcemh
     */
    public void setAxcemh(Integer axcemh) {
        this.axcemh = axcemh;
    }

    /**
     * Gets the axcemm.
     *
     * @return the axcemm
     */
    public Integer getAxcemm() {
        return axcemm;
    }

    /**
     * Sets the axcemm.
     *
     * @param axcemm the new axcemm
     */
    public void setAxcemm(Integer axcemm) {
        this.axcemm = axcemm;
    }

    /**
     * Gets the axcprt.
     *
     * @return the axcprt
     */
    public Double getAxcprt() {
        return axcprt;
    }

    /**
     * Sets the axcprt.
     *
     * @param axcprt the new axcprt
     */
    public void setAxcprt(Double axcprt) {
        this.axcprt = axcprt;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[9];
        array[0] = this.axcare;
        array[1] = this.axcnct;
        array[2] = this.axccap;
        array[3] = this.axccpp;
        array[4] = this.axcamp;
        array[5] = this.axcedm;
        array[6] = this.axcemh;
        array[7] = this.axcemm;
        array[8] = this.axcprt;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[9];
        array[0] = "axcare";
        array[1] = "axcnct";
        array[2] = "axccap";
        array[3] = "axccpp";
        array[4] = "axcamp";
        array[5] = "axcedm";
        array[6] = "axcemh";
        array[7] = "axcemm";
        array[8] = "axcprt";

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
        string += "axcare: " + this.axcare + "\n";
        string += "axcnct: " + this.axcnct + "\n";
        string += "axccap: " + this.axccap + "\n";
        string += "axccpp: " + this.axccpp + "\n";
        string += "axcamp: " + this.axcamp + "\n";
        string += "axcedm: " + this.axcedm + "\n";
        string += "axcemh: " + this.axcemh + "\n";
        string += "axcemm: " + this.axcemm + "\n";
        string += "axcprt: " + this.axcprt + "\n";

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
        Auxcont other = (Auxcont) obj;
        return this.hashCode() == other.hashCode();
    }

}
