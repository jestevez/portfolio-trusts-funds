/*
 * Apoderad.java
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

/**
 * The Class Apoderad.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 26/03/2014
 */
public class Apoderad implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1081004062726714167L;

    /** The rowid. */
    private Long rowid;

    /** The numapo. */
    private Integer numapo;

    /** The nomapo. */
    private String nomapo;

    /** The ecapo. */
    private String ecapo;

    /** The proapo. */
    private String proapo;

    /** The pobapo. */
    private String pobapo;

    /** The cedapo. */
    private String cedapo;

    /** The folapo. */
    private String folapo;

    /** The tomapo. */
    private String tomapo;

    /** The asiapo. */
    private String asiapo;

    /** The reppor. */
    private String reppor;

    /**
     * Instantiates a new apoderad.
     */
    public Apoderad() {
        super();
        this.numapo = null;
        this.nomapo = null;
        this.ecapo = null;
        this.proapo = null;
        this.pobapo = null;
        this.cedapo = null;
        this.folapo = null;
        this.tomapo = null;
        this.asiapo = null;
        this.reppor = null;

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
     * Gets the numapo.
     *
     * @return the numapo
     */
    public Integer getNumapo() {
        return numapo;
    }

    /**
     * Sets the numapo.
     *
     * @param numapo the new numapo
     */
    public void setNumapo(Integer numapo) {
        this.numapo = numapo;
    }

    /**
     * Gets the nomapo.
     *
     * @return the nomapo
     */
    public String getNomapo() {
        return nomapo;
    }

    /**
     * Sets the nomapo.
     *
     * @param nomapo the new nomapo
     */
    public void setNomapo(String nomapo) {
        this.nomapo = nomapo;
    }

    /**
     * Gets the ecapo.
     *
     * @return the ecapo
     */
    public String getEcapo() {
        return ecapo;
    }

    /**
     * Sets the ecapo.
     *
     * @param ecapo the new ecapo
     */
    public void setEcapo(String ecapo) {
        this.ecapo = ecapo;
    }

    /**
     * Gets the proapo.
     *
     * @return the proapo
     */
    public String getProapo() {
        return proapo;
    }

    /**
     * Sets the proapo.
     *
     * @param proapo the new proapo
     */
    public void setProapo(String proapo) {
        this.proapo = proapo;
    }

    /**
     * Gets the pobapo.
     *
     * @return the pobapo
     */
    public String getPobapo() {
        return pobapo;
    }

    /**
     * Sets the pobapo.
     *
     * @param pobapo the new pobapo
     */
    public void setPobapo(String pobapo) {
        this.pobapo = pobapo;
    }

    /**
     * Gets the cedapo.
     *
     * @return the cedapo
     */
    public String getCedapo() {
        return cedapo;
    }

    /**
     * Sets the cedapo.
     *
     * @param cedapo the new cedapo
     */
    public void setCedapo(String cedapo) {
        this.cedapo = cedapo;
    }

    /**
     * Gets the folapo.
     *
     * @return the folapo
     */
    public String getFolapo() {
        return folapo;
    }

    /**
     * Sets the folapo.
     *
     * @param folapo the new folapo
     */
    public void setFolapo(String folapo) {
        this.folapo = folapo;
    }

    /**
     * Gets the tomapo.
     *
     * @return the tomapo
     */
    public String getTomapo() {
        return tomapo;
    }

    /**
     * Sets the tomapo.
     *
     * @param tomapo the new tomapo
     */
    public void setTomapo(String tomapo) {
        this.tomapo = tomapo;
    }

    /**
     * Gets the asiapo.
     *
     * @return the asiapo
     */
    public String getAsiapo() {
        return asiapo;
    }

    /**
     * Sets the asiapo.
     *
     * @param asiapo the new asiapo
     */
    public void setAsiapo(String asiapo) {
        this.asiapo = asiapo;
    }

    /**
     * Gets the reppor.
     *
     * @return the reppor
     */
    public String getReppor() {
        return reppor;
    }

    /**
     * Sets the reppor.
     *
     * @param reppor the new reppor
     */
    public void setReppor(String reppor) {
        this.reppor = reppor;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[10];
        array[0] = this.numapo;
        array[1] = this.nomapo;
        array[2] = this.ecapo;
        array[3] = this.proapo;
        array[4] = this.pobapo;
        array[5] = this.cedapo;
        array[6] = this.folapo;
        array[7] = this.tomapo;
        array[8] = this.asiapo;
        array[9] = this.reppor;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[10];
        array[0] = "numapo";
        array[1] = "nomapo";
        array[2] = "ecapo";
        array[3] = "proapo";
        array[4] = "pobapo";
        array[5] = "cedapo";
        array[6] = "folapo";
        array[7] = "tomapo";
        array[8] = "asiapo";
        array[9] = "reppor";

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
        string += "numapo: " + this.numapo + "\n";
        string += "nomapo: " + this.nomapo + "\n";
        string += "ecapo: " + this.ecapo + "\n";
        string += "proapo: " + this.proapo + "\n";
        string += "pobapo: " + this.pobapo + "\n";
        string += "cedapo: " + this.cedapo + "\n";
        string += "folapo: " + this.folapo + "\n";
        string += "tomapo: " + this.tomapo + "\n";
        string += "asiapo: " + this.asiapo + "\n";
        string += "reppor: " + this.reppor + "\n";

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
        Apoderad other = (Apoderad) obj;
        return this.hashCode() == other.hashCode();
    }

}
