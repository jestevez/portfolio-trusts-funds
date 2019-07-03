/*
 * Conact1.java
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
 * The Class Conact1.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 07/05/2014
 */
public class Conact1 implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7877375958780768459L;

    /** The rowid. */
    private Long rowid;

    /** The area. */
    private String area;

    /** The invval. */
    private String invval;

    /** The invnop. */
    private Long invnop;

    /** The invina. */
    private Long invina;

    /** The invvta. */
    private Long invvta;

    /** The invvno. */
    private Double invvno;

    /** The cupmnt. */
    private Double cupmnt;

    /** The vlotas. */
    private Double vlotas;

    /** The cupfec. */
    private Long cupfec;

    /**
     * Instantiates a new conact 1.
     */
    public Conact1() {
        super();
        this.area = null;
        this.invval = null;
        this.invnop = null;
        this.invina = null;
        this.invvta = null;
        this.invvno = null;
        this.cupmnt = null;
        this.vlotas = null;
        this.cupfec = null;

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
     * Gets the area.
     *
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the area.
     *
     * @param area the new area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Gets the invval.
     *
     * @return the invval
     */
    public String getInvval() {
        return invval;
    }

    /**
     * Sets the invval.
     *
     * @param invval the new invval
     */
    public void setInvval(String invval) {
        this.invval = invval;
    }

    /**
     * Gets the invnop.
     *
     * @return the invnop
     */
    public Long getInvnop() {
        return invnop;
    }

    /**
     * Sets the invnop.
     *
     * @param invnop the new invnop
     */
    public void setInvnop(Long invnop) {
        this.invnop = invnop;
    }

    /**
     * Gets the invina.
     *
     * @return the invina
     */
    public Long getInvina() {
        return invina;
    }

    /**
     * Sets the invina.
     *
     * @param invina the new invina
     */
    public void setInvina(Long invina) {
        this.invina = invina;
    }

    /**
     * Gets the invvta.
     *
     * @return the invvta
     */
    public Long getInvvta() {
        return invvta;
    }

    /**
     * Sets the invvta.
     *
     * @param invvta the new invvta
     */
    public void setInvvta(Long invvta) {
        this.invvta = invvta;
    }

    /**
     * Gets the invvno.
     *
     * @return the invvno
     */
    public Double getInvvno() {
        return invvno;
    }

    /**
     * Sets the invvno.
     *
     * @param invvno the new invvno
     */
    public void setInvvno(Double invvno) {
        this.invvno = invvno;
    }

    /**
     * Gets the cupmnt.
     *
     * @return the cupmnt
     */
    public Double getCupmnt() {
        return cupmnt;
    }

    /**
     * Sets the cupmnt.
     *
     * @param cupmnt the new cupmnt
     */
    public void setCupmnt(Double cupmnt) {
        this.cupmnt = cupmnt;
    }

    /**
     * Gets the vlotas.
     *
     * @return the vlotas
     */
    public Double getVlotas() {
        return vlotas;
    }

    /**
     * Sets the vlotas.
     *
     * @param vlotas the new vlotas
     */
    public void setVlotas(Double vlotas) {
        this.vlotas = vlotas;
    }

    /**
     * Gets the cupfec.
     *
     * @return the cupfec
     */
    public Long getCupfec() {
        return cupfec;
    }

    /**
     * Sets the cupfec.
     *
     * @param cupfec the new cupfec
     */
    public void setCupfec(Long cupfec) {
        this.cupfec = cupfec;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[9];
        array[0] = this.area;
        array[1] = this.invval;
        array[2] = this.invnop;
        array[3] = this.invina;
        array[4] = this.invvta;
        array[5] = this.invvno;
        array[6] = this.cupmnt;
        array[7] = this.vlotas;
        array[8] = this.cupfec;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[9];
        array[0] = "area";
        array[1] = "invval";
        array[2] = "invnop";
        array[3] = "invina";
        array[4] = "invvta";
        array[5] = "invvno";
        array[6] = "cupmnt";
        array[7] = "vlotas";
        array[8] = "cupfec";

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
        string += "area: " + this.area + "\n";
        string += "invval: " + this.invval + "\n";
        string += "invnop: " + this.invnop + "\n";
        string += "invina: " + this.invina + "\n";
        string += "invvta: " + this.invvta + "\n";
        string += "invvno: " + this.invvno + "\n";
        string += "cupmnt: " + this.cupmnt + "\n";
        string += "vlotas: " + this.vlotas + "\n";
        string += "cupfec: " + this.cupfec + "\n";

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
        Conact1 other = (Conact1) obj;
        return this.hashCode() == other.hashCode();
    }

}
