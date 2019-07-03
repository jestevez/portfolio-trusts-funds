/*
 * MfondoinPen.java
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
 * The Class MfondoinPen.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 09/06/2014
 */
public class MfondoinPen implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2534963643696907188L;

    /** The rowid. */
    private Long rowid;

    /** The area. */
    private String area;

    /** The nombre. */
    private String nombre;

    /** The concepto. */
    private String concepto;

    /** The mfoadq. */
    private Integer mfoadq;

    /** The monto. */
    private Double monto;

    /**
     * Instantiates a new mfondoin pen.
     */
    public MfondoinPen() {
        super();
        this.area = null;
        this.nombre = null;
        this.concepto = null;
        this.mfoadq = null;
        this.monto = null;

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
     * Gets the nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the nombre.
     *
     * @param nombre the new nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Gets the concepto.
     *
     * @return the concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * Sets the concepto.
     *
     * @param concepto the new concepto
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    /**
     * Gets the mfoadq.
     *
     * @return the mfoadq
     */
    public Integer getMfoadq() {
        return mfoadq;
    }

    /**
     * Sets the mfoadq.
     *
     * @param mfoadq the new mfoadq
     */
    public void setMfoadq(Integer mfoadq) {
        this.mfoadq = mfoadq;
    }

    /**
     * Gets the monto.
     *
     * @return the monto
     */
    public Double getMonto() {
        return monto;
    }

    /**
     * Sets the monto.
     *
     * @param monto the new monto
     */
    public void setMonto(Double monto) {
        this.monto = monto;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[5];
        array[0] = this.area;
        array[1] = this.nombre;
        array[2] = this.concepto;
        array[3] = this.mfoadq;
        array[4] = this.monto;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[5];
        array[0] = "area";
        array[1] = "nombre";
        array[2] = "concepto";
        array[3] = "mfoadq";
        array[4] = "monto";

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
        string += "nombre: " + this.nombre + "\n";
        string += "concepto: " + this.concepto + "\n";
        string += "mfoadq: " + this.mfoadq + "\n";
        string += "monto: " + this.monto + "\n";

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
        MfondoinPen other = (MfondoinPen) obj;
        return this.hashCode() == other.hashCode();
    }

}