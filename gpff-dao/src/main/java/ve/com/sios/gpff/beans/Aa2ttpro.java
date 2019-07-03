/*
 * Aa2ttpro.java
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
 * The Class Aa2ttpro.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 31/03/2014
 */
public class Aa2ttpro implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4083567400205244854L;

    /** The rowid. */
    private Long rowid;

    /** The proemp. */
    private String proemp;

    /** The prodel. */
    private String prodel;

    /** The procla. */
    private Long procla;

    /** The pronom. */
    private String pronom;

    /**
     * Instantiates a new aa 2 ttpro.
     */
    public Aa2ttpro() {
        super();
        this.proemp = null;
        this.prodel = null;
        this.procla = null;
        this.pronom = null;

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
     * Gets the proemp.
     *
     * @return the proemp
     */
    public String getProemp() {
        return proemp;
    }

    /**
     * Sets the proemp.
     *
     * @param proemp the new proemp
     */
    public void setProemp(String proemp) {
        this.proemp = proemp;
    }

    /**
     * Gets the prodel.
     *
     * @return the prodel
     */
    public String getProdel() {
        return prodel;
    }

    /**
     * Sets the prodel.
     *
     * @param prodel the new prodel
     */
    public void setProdel(String prodel) {
        this.prodel = prodel;
    }

    /**
     * Gets the procla.
     *
     * @return the procla
     */
    public Long getProcla() {
        return procla;
    }

    /**
     * Sets the procla.
     *
     * @param procla the new procla
     */
    public void setProcla(Long procla) {
        this.procla = procla;
    }

    /**
     * Gets the pronom.
     *
     * @return the pronom
     */
    public String getPronom() {
        return pronom;
    }

    /**
     * Sets the pronom.
     *
     * @param pronom the new pronom
     */
    public void setPronom(String pronom) {
        this.pronom = pronom;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[4];
        array[0] = this.proemp;
        array[1] = this.prodel;
        array[2] = this.procla;
        array[3] = this.pronom;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[4];
        array[0] = "proemp";
        array[1] = "prodel";
        array[2] = "procla";
        array[3] = "pronom";

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
        string += "proemp: " + this.proemp + "\n";
        string += "prodel: " + this.prodel + "\n";
        string += "procla: " + this.procla + "\n";
        string += "pronom: " + this.pronom + "\n";

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
        Aa2ttpro other = (Aa2ttpro) obj;
        return this.hashCode() == other.hashCode();
    }

}
