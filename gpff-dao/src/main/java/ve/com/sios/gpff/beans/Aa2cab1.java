/*
 * Aa2cab1.java
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
 * The Class Aa2cab1.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 11/03/2014
 */
public class Aa2cab1 implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3580587872575919349L;

    /** The area. */
    private String area;

    /** The nbanco. */
    private String nbanco;

    /** The nrif. */
    private String nrif;

    /** The nnif. */
    private String nnif;

    /** The ndire. */
    private String ndire;

    /** The nbanc. */
    private Integer nbanc;

    /** The ntele. */
    private String ntele;

    /** The nrespo. */
    private String nrespo;

    /** The nfiller. */
    private String nfiller;

    /** The usuario. */
    private String usuario;

    /** The pantalla. */
    private String pantalla;

    /** The fecha. */
    private Integer fecha;

    /**
     * Instantiates a new aa 2 cab 1.
     */
    public Aa2cab1() {
        super();
        this.area = null;
        this.nbanco = null;
        this.nrif = null;
        this.nnif = null;
        this.ndire = null;
        this.nbanc = null;
        this.ntele = null;
        this.nrespo = null;
        this.nfiller = null;
        this.usuario = null;
        this.pantalla = null;
        this.fecha = null;

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
     * Gets the nbanco.
     *
     * @return the nbanco
     */
    public String getNbanco() {
        return nbanco;
    }

    /**
     * Sets the nbanco.
     *
     * @param nbanco the new nbanco
     */
    public void setNbanco(String nbanco) {
        this.nbanco = nbanco;
    }

    /**
     * Gets the nrif.
     *
     * @return the nrif
     */
    public String getNrif() {
        return nrif;
    }

    /**
     * Sets the nrif.
     *
     * @param nrif the new nrif
     */
    public void setNrif(String nrif) {
        this.nrif = nrif;
    }

    /**
     * Gets the nnif.
     *
     * @return the nnif
     */
    public String getNnif() {
        return nnif;
    }

    /**
     * Sets the nnif.
     *
     * @param nnif the new nnif
     */
    public void setNnif(String nnif) {
        this.nnif = nnif;
    }

    /**
     * Gets the ndire.
     *
     * @return the ndire
     */
    public String getNdire() {
        return ndire;
    }

    /**
     * Sets the ndire.
     *
     * @param ndire the new ndire
     */
    public void setNdire(String ndire) {
        this.ndire = ndire;
    }

    /**
     * Gets the nbanc.
     *
     * @return the nbanc
     */
    public Integer getNbanc() {
        return nbanc;
    }

    /**
     * Sets the nbanc.
     *
     * @param nbanc the new nbanc
     */
    public void setNbanc(Integer nbanc) {
        this.nbanc = nbanc;
    }

    /**
     * Gets the ntele.
     *
     * @return the ntele
     */
    public String getNtele() {
        return ntele;
    }

    /**
     * Sets the ntele.
     *
     * @param ntele the new ntele
     */
    public void setNtele(String ntele) {
        this.ntele = ntele;
    }

    /**
     * Gets the nrespo.
     *
     * @return the nrespo
     */
    public String getNrespo() {
        return nrespo;
    }

    /**
     * Sets the nrespo.
     *
     * @param nrespo the new nrespo
     */
    public void setNrespo(String nrespo) {
        this.nrespo = nrespo;
    }

    /**
     * Gets the nfiller.
     *
     * @return the nfiller
     */
    public String getNfiller() {
        return nfiller;
    }

    /**
     * Sets the nfiller.
     *
     * @param nfiller the new nfiller
     */
    public void setNfiller(String nfiller) {
        this.nfiller = nfiller;
    }

    /**
     * Gets the usuario.
     *
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the usuario.
     *
     * @param usuario the new usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Gets the pantalla.
     *
     * @return the pantalla
     */
    public String getPantalla() {
        return pantalla;
    }

    /**
     * Sets the pantalla.
     *
     * @param pantalla the new pantalla
     */
    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    /**
     * Gets the fecha.
     *
     * @return the fecha
     */
    public Integer getFecha() {
        return fecha;
    }

    /**
     * Sets the fecha.
     *
     * @param fecha the new fecha
     */
    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[12];
        array[0] = this.area;
        array[1] = this.nbanco;
        array[2] = this.nrif;
        array[3] = this.nnif;
        array[4] = this.ndire;
        array[5] = this.nbanc;
        array[6] = this.ntele;
        array[7] = this.nrespo;
        array[8] = this.nfiller;
        array[9] = this.usuario;
        array[10] = this.pantalla;
        array[11] = this.fecha;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[12];
        array[0] = "area";
        array[1] = "nbanco";
        array[2] = "nrif";
        array[3] = "nnif";
        array[4] = "ndire";
        array[5] = "nbanc";
        array[6] = "ntele";
        array[7] = "nrespo";
        array[8] = "nfiller";
        array[9] = "usuario";
        array[10] = "pantalla";
        array[11] = "fecha";

        return array;
    }
}
