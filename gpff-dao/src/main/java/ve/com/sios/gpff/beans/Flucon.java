/*
 * Flucon.java
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
 * The Class Flucon.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 13/02/2014
 */
public class Flucon implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4047524281313741869L;

    /** The flcemp. */
    private String flcemp;

    /** The flcdel. */
    private String flcdel;

    /** The flccli. */
    private Integer flccli;

    /** The flctip. */
    private String flctip;

    /** The flccod. */
    private Integer flccod;

    /** The flccon. */
    private String flccon;

    /** The flchor. */
    private Integer flchor;

    /** The flcpan. */
    private String flcpan;

    /** The flcusu. */
    private String flcusu;

    /**
     * Instantiates a new flucon.
     */
    public Flucon() {
        super();
        this.flcemp = null;
        this.flcdel = null;
        this.flccli = null;
        this.flctip = null;
        this.flccod = null;
        this.flccon = null;
        this.flchor = null;
        this.flcpan = null;
        this.flcusu = null;

    }

    /**
     * Gets the flcemp.
     *
     * @return the flcemp
     */
    public String getFlcemp() {
        return flcemp;
    }

    /**
     * Sets the flcemp.
     *
     * @param flcemp the new flcemp
     */
    public void setFlcemp(String flcemp) {
        this.flcemp = flcemp;
    }

    /**
     * Gets the flcdel.
     *
     * @return the flcdel
     */
    public String getFlcdel() {
        return flcdel;
    }

    /**
     * Sets the flcdel.
     *
     * @param flcdel the new flcdel
     */
    public void setFlcdel(String flcdel) {
        this.flcdel = flcdel;
    }

    /**
     * Gets the flccli.
     *
     * @return the flccli
     */
    public Integer getFlccli() {
        return flccli;
    }

    /**
     * Sets the flccli.
     *
     * @param flccli the new flccli
     */
    public void setFlccli(Integer flccli) {
        this.flccli = flccli;
    }

    /**
     * Gets the flctip.
     *
     * @return the flctip
     */
    public String getFlctip() {
        return flctip;
    }

    /**
     * Sets the flctip.
     *
     * @param flctip the new flctip
     */
    public void setFlctip(String flctip) {
        this.flctip = flctip;
    }

    /**
     * Gets the flccod.
     *
     * @return the flccod
     */
    public Integer getFlccod() {
        return flccod;
    }

    /**
     * Sets the flccod.
     *
     * @param flccod the new flccod
     */
    public void setFlccod(Integer flccod) {
        this.flccod = flccod;
    }

    /**
     * Gets the flccon.
     *
     * @return the flccon
     */
    public String getFlccon() {
        return flccon;
    }

    /**
     * Sets the flccon.
     *
     * @param flccon the new flccon
     */
    public void setFlccon(String flccon) {
        this.flccon = flccon;
    }

    /**
     * Gets the flchor.
     *
     * @return the flchor
     */
    public Integer getFlchor() {
        return flchor;
    }

    /**
     * Sets the flchor.
     *
     * @param flchor the new flchor
     */
    public void setFlchor(Integer flchor) {
        this.flchor = flchor;
    }

    /**
     * Gets the flcpan.
     *
     * @return the flcpan
     */
    public String getFlcpan() {
        return flcpan;
    }

    /**
     * Sets the flcpan.
     *
     * @param flcpan the new flcpan
     */
    public void setFlcpan(String flcpan) {
        this.flcpan = flcpan;
    }

    /**
     * Gets the flcusu.
     *
     * @return the flcusu
     */
    public String getFlcusu() {
        return flcusu;
    }

    /**
     * Sets the flcusu.
     *
     * @param flcusu the new flcusu
     */
    public void setFlcusu(String flcusu) {
        this.flcusu = flcusu;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[9];
        array[0] = this.flcemp;
        array[1] = this.flcdel;
        array[2] = this.flccli;
        array[3] = this.flctip;
        array[4] = this.flccod;
        array[5] = this.flccon;
        array[6] = this.flchor;
        array[7] = this.flcpan;
        array[8] = this.flcusu;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[9];
        array[0] = "flcemp";
        array[1] = "flcdel";
        array[2] = "flccli";
        array[3] = "flctip";
        array[4] = "flccod";
        array[5] = "flccon";
        array[6] = "flchor";
        array[7] = "flcpan";
        array[8] = "flcusu";

        return array;
    }
}
