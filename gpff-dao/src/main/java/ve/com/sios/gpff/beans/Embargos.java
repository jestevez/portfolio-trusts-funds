/*
 * Embargos.java
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
 * The Class Embargos.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 07/05/2014
 */
public class Embargos implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 469630970949942221L;

    /** The rowid. */
    private Long rowid;

    /** The eempre. */
    private String eempre;

    /** The edeleg. */
    private String edeleg;

    /** The emovni. */
    private String emovni;

    /** The emonto. */
    private BigDecimal emonto;

    /** The emontt. */
    private BigDecimal emontt;

    /** The efecha. */
    private Long efecha;

    /** The efechf. */
    private Long efechf;

    /** The eusuar. */
    private String eusuar;

    /** The epanta. */
    private String epanta;

    /** The efecmo. */
    private Long efecmo;

    /**
     * Instantiates a new embargos.
     */
    public Embargos() {
        super();
        this.eempre = null;
        this.edeleg = null;
        this.emovni = null;
        this.emonto = null;
        this.emontt = null;
        this.efecha = null;
        this.efechf = null;
        this.eusuar = null;
        this.epanta = null;
        this.efecmo = null;

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
     * Gets the eempre.
     *
     * @return the eempre
     */
    public String getEempre() {
        return eempre;
    }

    /**
     * Sets the eempre.
     *
     * @param eempre the new eempre
     */
    public void setEempre(String eempre) {
        this.eempre = eempre;
    }

    /**
     * Gets the edeleg.
     *
     * @return the edeleg
     */
    public String getEdeleg() {
        return edeleg;
    }

    /**
     * Sets the edeleg.
     *
     * @param edeleg the new edeleg
     */
    public void setEdeleg(String edeleg) {
        this.edeleg = edeleg;
    }

    /**
     * Gets the emovni.
     *
     * @return the emovni
     */
    public String getEmovni() {
        return emovni;
    }

    /**
     * Sets the emovni.
     *
     * @param emovni the new emovni
     */
    public void setEmovni(String emovni) {
        this.emovni = emovni;
    }

    /**
     * Gets the emonto.
     *
     * @return the emonto
     */
    public BigDecimal getEmonto() {
        return emonto;
    }

    /**
     * Sets the emonto.
     *
     * @param emonto the new emonto
     */
    public void setEmonto(BigDecimal emonto) {
        this.emonto = emonto;
    }

    /**
     * Gets the emontt.
     *
     * @return the emontt
     */
    public BigDecimal getEmontt() {
        return emontt;
    }

    /**
     * Sets the emontt.
     *
     * @param emontt the new emontt
     */
    public void setEmontt(BigDecimal emontt) {
        this.emontt = emontt;
    }

    /**
     * Gets the efecha.
     *
     * @return the efecha
     */
    public Long getEfecha() {
        return efecha;
    }

    /**
     * Sets the efecha.
     *
     * @param efecha the new efecha
     */
    public void setEfecha(Long efecha) {
        this.efecha = efecha;
    }

    /**
     * Gets the efechf.
     *
     * @return the efechf
     */
    public Long getEfechf() {
        return efechf;
    }

    /**
     * Sets the efechf.
     *
     * @param efechf the new efechf
     */
    public void setEfechf(Long efechf) {
        this.efechf = efechf;
    }

    /**
     * Gets the eusuar.
     *
     * @return the eusuar
     */
    public String getEusuar() {
        return eusuar;
    }

    /**
     * Sets the eusuar.
     *
     * @param eusuar the new eusuar
     */
    public void setEusuar(String eusuar) {
        this.eusuar = eusuar;
    }

    /**
     * Gets the epanta.
     *
     * @return the epanta
     */
    public String getEpanta() {
        return epanta;
    }

    /**
     * Sets the epanta.
     *
     * @param epanta the new epanta
     */
    public void setEpanta(String epanta) {
        this.epanta = epanta;
    }

    /**
     * Gets the efecmo.
     *
     * @return the efecmo
     */
    public Long getEfecmo() {
        return efecmo;
    }

    /**
     * Sets the efecmo.
     *
     * @param efecmo the new efecmo
     */
    public void setEfecmo(Long efecmo) {
        this.efecmo = efecmo;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[10];
        array[0] = this.eempre;
        array[1] = this.edeleg;
        array[2] = this.emovni;
        array[3] = this.emonto;
        array[4] = this.emontt;
        array[5] = this.efecha;
        array[6] = this.efechf;
        array[7] = this.eusuar;
        array[8] = this.epanta;
        array[9] = this.efecmo;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[10];
        array[0] = "eempre";
        array[1] = "edeleg";
        array[2] = "emovni";
        array[3] = "emonto";
        array[4] = "emontt";
        array[5] = "efecha";
        array[6] = "efechf";
        array[7] = "eusuar";
        array[8] = "epanta";
        array[9] = "efecmo";

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
        string += "eempre: " + this.eempre + "\n";
        string += "edeleg: " + this.edeleg + "\n";
        string += "emovni: " + this.emovni + "\n";
        string += "emonto: " + this.emonto + "\n";
        string += "emontt: " + this.emontt + "\n";
        string += "efecha: " + this.efecha + "\n";
        string += "efechf: " + this.efechf + "\n";
        string += "eusuar: " + this.eusuar + "\n";
        string += "epanta: " + this.epanta + "\n";
        string += "efecmo: " + this.efecmo + "\n";

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
        Embargos other = (Embargos) obj;
        return this.hashCode() == other.hashCode();
    }

}
