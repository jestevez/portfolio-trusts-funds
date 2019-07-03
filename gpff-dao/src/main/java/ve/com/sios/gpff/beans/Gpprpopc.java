/*
 * Gpprpopc.java
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
 * The Class Gpprpopc.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 26/03/2014
 */
public class Gpprpopc implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2142658494169948247L;

    /** The rowid. */
    private Long rowid;

    /** The opcare. */
    private String opcare;

    /** The opcopc. */
    private String opcopc;

    /** The opceda. */
    private Integer opceda;

    /** The opccli. */
    private String opccli;

    /** The opcedd. */
    private Integer opcedd;

    /** The opcedh. */
    private Integer opcedh;

    /** The opcfij. */
    private BigDecimal opcfij;

    /** The opcvar. */
    private BigDecimal opcvar;

    /** The opcusr. */
    private String opcusr;

    /** The opcdsp. */
    private String opcdsp;

    /** The opcfec. */
    private Integer opcfec;

    /** The opctim. */
    private Integer opctim;

    /**
     * Instantiates a new gpprpopc.
     */
    public Gpprpopc() {
        super();
        this.opcare = null;
        this.opcopc = null;
        this.opceda = null;
        this.opccli = null;
        this.opcedd = null;
        this.opcedh = null;
        this.opcfij = null;
        this.opcvar = null;
        this.opcusr = null;
        this.opcdsp = null;
        this.opcfec = null;
        this.opctim = null;

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
     * Gets the opcare.
     *
     * @return the opcare
     */
    public String getOpcare() {
        return opcare;
    }

    /**
     * Sets the opcare.
     *
     * @param opcare the new opcare
     */
    public void setOpcare(String opcare) {
        this.opcare = opcare;
    }

    /**
     * Gets the opcopc.
     *
     * @return the opcopc
     */
    public String getOpcopc() {
        return opcopc;
    }

    /**
     * Sets the opcopc.
     *
     * @param opcopc the new opcopc
     */
    public void setOpcopc(String opcopc) {
        this.opcopc = opcopc;
    }

    /**
     * Gets the opceda.
     *
     * @return the opceda
     */
    public Integer getOpceda() {
        return opceda;
    }

    /**
     * Sets the opceda.
     *
     * @param opceda the new opceda
     */
    public void setOpceda(Integer opceda) {
        this.opceda = opceda;
    }

    /**
     * Gets the opccli.
     *
     * @return the opccli
     */
    public String getOpccli() {
        return opccli;
    }

    /**
     * Sets the opccli.
     *
     * @param opccli the new opccli
     */
    public void setOpccli(String opccli) {
        this.opccli = opccli;
    }

    /**
     * Gets the opcedd.
     *
     * @return the opcedd
     */
    public Integer getOpcedd() {
        return opcedd;
    }

    /**
     * Sets the opcedd.
     *
     * @param opcedd the new opcedd
     */
    public void setOpcedd(Integer opcedd) {
        this.opcedd = opcedd;
    }

    /**
     * Gets the opcedh.
     *
     * @return the opcedh
     */
    public Integer getOpcedh() {
        return opcedh;
    }

    /**
     * Sets the opcedh.
     *
     * @param opcedh the new opcedh
     */
    public void setOpcedh(Integer opcedh) {
        this.opcedh = opcedh;
    }

    /**
     * Gets the opcfij.
     *
     * @return the opcfij
     */
    public BigDecimal getOpcfij() {
        return opcfij;
    }

    /**
     * Sets the opcfij.
     *
     * @param opcfij the new opcfij
     */
    public void setOpcfij(BigDecimal opcfij) {
        this.opcfij = opcfij;
    }

    /**
     * Gets the opcvar.
     *
     * @return the opcvar
     */
    public BigDecimal getOpcvar() {
        return opcvar;
    }

    /**
     * Sets the opcvar.
     *
     * @param opcvar the new opcvar
     */
    public void setOpcvar(BigDecimal opcvar) {
        this.opcvar = opcvar;
    }

    /**
     * Gets the opcusr.
     *
     * @return the opcusr
     */
    public String getOpcusr() {
        return opcusr;
    }

    /**
     * Sets the opcusr.
     *
     * @param opcusr the new opcusr
     */
    public void setOpcusr(String opcusr) {
        this.opcusr = opcusr;
    }

    /**
     * Gets the opcdsp.
     *
     * @return the opcdsp
     */
    public String getOpcdsp() {
        return opcdsp;
    }

    /**
     * Sets the opcdsp.
     *
     * @param opcdsp the new opcdsp
     */
    public void setOpcdsp(String opcdsp) {
        this.opcdsp = opcdsp;
    }

    /**
     * Gets the opcfec.
     *
     * @return the opcfec
     */
    public Integer getOpcfec() {
        return opcfec;
    }

    /**
     * Sets the opcfec.
     *
     * @param opcfec the new opcfec
     */
    public void setOpcfec(Integer opcfec) {
        this.opcfec = opcfec;
    }

    /**
     * Gets the opctim.
     *
     * @return the opctim
     */
    public Integer getOpctim() {
        return opctim;
    }

    /**
     * Sets the opctim.
     *
     * @param opctim the new opctim
     */
    public void setOpctim(Integer opctim) {
        this.opctim = opctim;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[12];
        array[0] = this.opcare;
        array[1] = this.opcopc;
        array[2] = this.opceda;
        array[3] = this.opccli;
        array[4] = this.opcedd;
        array[5] = this.opcedh;
        array[6] = this.opcfij;
        array[7] = this.opcvar;
        array[8] = this.opcusr;
        array[9] = this.opcdsp;
        array[10] = this.opcfec;
        array[11] = this.opctim;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[12];
        array[0] = "opcare";
        array[1] = "opcopc";
        array[2] = "opceda";
        array[3] = "opccli";
        array[4] = "opcedd";
        array[5] = "opcedh";
        array[6] = "opcfij";
        array[7] = "opcvar";
        array[8] = "opcusr";
        array[9] = "opcdsp";
        array[10] = "opcfec";
        array[11] = "opctim";

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
        string += "opcare: " + this.opcare + "\n";
        string += "opcopc: " + this.opcopc + "\n";
        string += "opceda: " + this.opceda + "\n";
        string += "opccli: " + this.opccli + "\n";
        string += "opcedd: " + this.opcedd + "\n";
        string += "opcedh: " + this.opcedh + "\n";
        string += "opcfij: " + this.opcfij + "\n";
        string += "opcvar: " + this.opcvar + "\n";
        string += "opcusr: " + this.opcusr + "\n";
        string += "opcdsp: " + this.opcdsp + "\n";
        string += "opcfec: " + this.opcfec + "\n";
        string += "opctim: " + this.opctim + "\n";

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
        Gpprpopc other = (Gpprpopc) obj;
        return this.hashCode() == other.hashCode();
    }

}
