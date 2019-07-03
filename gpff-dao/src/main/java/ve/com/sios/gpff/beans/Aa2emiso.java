/*
 * Aa2emiso.java
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
 * The Class Aa2emiso.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 13/03/2014
 */
public class Aa2emiso implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -138261359627387051L;

    /** The rowid. */
    private Long rowid;

    /** The emiemp. */
    private String emiemp;

    /** The emidel. */
    private String emidel;

    /** The emicla. */
    private Long emicla;

    /** The eminom. */
    private String eminom;

    /** The enimax. */
    private Double enimax;

    /** The emiuti. */
    private Long emiuti;

    /** The emiufe. */
    private Long emiufe;

    /** The emitip. */
    private Integer emitip;

    /**
     * Instantiates a new aa 2 emiso.
     */
    public Aa2emiso() {
        super();
        this.emiemp = null;
        this.emidel = null;
        this.emicla = null;
        this.eminom = null;
        this.enimax = null;
        this.emiuti = null;
        this.emiufe = null;
        this.emitip = null;

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
     * Gets the emiemp.
     *
     * @return the emiemp
     */
    public String getEmiemp() {
        return emiemp;
    }

    /**
     * Sets the emiemp.
     *
     * @param emiemp the new emiemp
     */
    public void setEmiemp(String emiemp) {
        this.emiemp = emiemp;
    }

    /**
     * Gets the emidel.
     *
     * @return the emidel
     */
    public String getEmidel() {
        return emidel;
    }

    /**
     * Sets the emidel.
     *
     * @param emidel the new emidel
     */
    public void setEmidel(String emidel) {
        this.emidel = emidel;
    }

    /**
     * Gets the emicla.
     *
     * @return the emicla
     */
    public Long getEmicla() {
        return emicla;
    }

    /**
     * Sets the emicla.
     *
     * @param emicla the new emicla
     */
    public void setEmicla(Long emicla) {
        this.emicla = emicla;
    }

    /**
     * Gets the eminom.
     *
     * @return the eminom
     */
    public String getEminom() {
        return eminom;
    }

    /**
     * Sets the eminom.
     *
     * @param eminom the new eminom
     */
    public void setEminom(String eminom) {
        this.eminom = eminom;
    }

    /**
     * Gets the enimax.
     *
     * @return the enimax
     */
    public Double getEnimax() {
        return enimax;
    }

    /**
     * Sets the enimax.
     *
     * @param enimax the new enimax
     */
    public void setEnimax(Double enimax) {
        this.enimax = enimax;
    }

    /**
     * Gets the emiuti.
     *
     * @return the emiuti
     */
    public Long getEmiuti() {
        return emiuti;
    }

    /**
     * Sets the emiuti.
     *
     * @param emiuti the new emiuti
     */
    public void setEmiuti(Long emiuti) {
        this.emiuti = emiuti;
    }

    /**
     * Gets the emiufe.
     *
     * @return the emiufe
     */
    public Long getEmiufe() {
        return emiufe;
    }

    /**
     * Sets the emiufe.
     *
     * @param emiufe the new emiufe
     */
    public void setEmiufe(Long emiufe) {
        this.emiufe = emiufe;
    }

    /**
     * Gets the emitip.
     *
     * @return the emitip
     */
    public Integer getEmitip() {
        return emitip;
    }

    /**
     * Sets the emitip.
     *
     * @param emitip the new emitip
     */
    public void setEmitip(Integer emitip) {
        this.emitip = emitip;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[8];
        array[0] = this.emiemp;
        array[1] = this.emidel;
        array[2] = this.emicla;
        array[3] = this.eminom;
        array[4] = this.enimax;
        array[5] = this.emiuti;
        array[6] = this.emiufe;
        array[7] = this.emitip;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[8];
        array[0] = "emiemp";
        array[1] = "emidel";
        array[2] = "emicla";
        array[3] = "eminom";
        array[4] = "enimax";
        array[5] = "emiuti";
        array[6] = "emiufe";
        array[7] = "emitip";

        return array;
    }
}
