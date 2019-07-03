/*
 * Ctlfondo.java
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
 * The Class Ctlfondo.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 26/04/2014
 */
public class Ctlfondo implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3028630492638070230L;

    /** The rowid. */
    private Long rowid;

    /** The ctfemp. */
    private String ctfemp;

    /** The ctfdel. */
    private String ctfdel;

    /** The ctfcli. */
    private Long ctfcli;

    /**
     * Instantiates a new ctlfondo.
     */
    public Ctlfondo() {
        super();
        this.ctfemp = null;
        this.ctfdel = null;
        this.ctfcli = null;

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
     * Gets the ctfemp.
     *
     * @return the ctfemp
     */
    public String getCtfemp() {
        return ctfemp;
    }

    /**
     * Sets the ctfemp.
     *
     * @param ctfemp the new ctfemp
     */
    public void setCtfemp(String ctfemp) {
        this.ctfemp = ctfemp;
    }

    /**
     * Gets the ctfdel.
     *
     * @return the ctfdel
     */
    public String getCtfdel() {
        return ctfdel;
    }

    /**
     * Sets the ctfdel.
     *
     * @param ctfdel the new ctfdel
     */
    public void setCtfdel(String ctfdel) {
        this.ctfdel = ctfdel;
    }

    /**
     * Gets the ctfcli.
     *
     * @return the ctfcli
     */
    public Long getCtfcli() {
        return ctfcli;
    }

    /**
     * Sets the ctfcli.
     *
     * @param ctfcli the new ctfcli
     */
    public void setCtfcli(Long ctfcli) {
        this.ctfcli = ctfcli;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[3];
        array[0] = this.ctfemp;
        array[1] = this.ctfdel;
        array[2] = this.ctfcli;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[3];
        array[0] = "ctfemp";
        array[1] = "ctfdel";
        array[2] = "ctfcli";

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
        string += "ctfemp: " + this.ctfemp + "\n";
        string += "ctfdel: " + this.ctfdel + "\n";
        string += "ctfcli: " + this.ctfcli + "\n";

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
        Ctlfondo other = (Ctlfondo) obj;
        return this.hashCode() == other.hashCode();
    }

}