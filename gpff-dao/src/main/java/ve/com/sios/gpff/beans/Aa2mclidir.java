/*
 * Aa2mclidir.java
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
 * The Class Aa2mclidir.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 04/04/2014
 */
public class Aa2mclidir implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4686248416064886411L;

    /** The rowid. */
    private Long rowid;

    /** The clinif. */
    private String clinif;

    /** The clidir. */
    private String clidir;

    /**
     * Instantiates a new aa 2 mclidir.
     */
    public Aa2mclidir() {
        super();
        this.clinif = null;
        this.clidir = null;

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
     * Gets the clinif.
     *
     * @return the clinif
     */
    public String getClinif() {
        return clinif;
    }

    /**
     * Sets the clinif.
     *
     * @param clinif the new clinif
     */
    public void setClinif(String clinif) {
        this.clinif = clinif;
    }

    /**
     * Gets the clidir.
     *
     * @return the clidir
     */
    public String getClidir() {
        return clidir;
    }

    /**
     * Sets the clidir.
     *
     * @param clidir the new clidir
     */
    public void setClidir(String clidir) {
        this.clidir = clidir;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[2];
        array[0] = this.clinif;
        array[1] = this.clidir;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[2];
        array[0] = "clinif";
        array[1] = "clidir";

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
        string += "clinif: " + this.clinif + "\n";
        string += "clidir: " + this.clidir + "\n";

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
        Aa2mclidir other = (Aa2mclidir) obj;
        return this.hashCode() == other.hashCode();
    }

}
