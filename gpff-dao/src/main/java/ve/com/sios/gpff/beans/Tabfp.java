/*
 * Tabfp.java
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
 * The Class Tabfp.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 12/02/2014
 */
public class Tabfp implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3962734046154685092L;

    /** The codigo. */
    private Integer codigo;

    /** The texto. */
    private String texto;

    /** The cdcnx. */
    private Integer cdcnx;

    /** The cuenta. */
    private String cuenta;

    /**
     * Instantiates a new tabfp.
     */
    public Tabfp() {
        super();
        this.codigo = null;
        this.texto = null;
        this.cdcnx = null;
        this.cuenta = null;

    }

    /**
     * Gets the codigo.
     *
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Sets the codigo.
     *
     * @param codigo the new codigo
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * Gets the texto.
     *
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Sets the texto.
     *
     * @param texto the new texto
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * Gets the cdcnx.
     *
     * @return the cdcnx
     */
    public Integer getCdcnx() {
        return cdcnx;
    }

    /**
     * Sets the cdcnx.
     *
     * @param cdcnx the new cdcnx
     */
    public void setCdcnx(Integer cdcnx) {
        this.cdcnx = cdcnx;
    }

    /**
     * Gets the cuenta.
     *
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Sets the cuenta.
     *
     * @param cuenta the new cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[4];
        array[0] = this.codigo;
        array[1] = this.texto;
        array[2] = this.cdcnx;
        array[3] = this.cuenta;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[4];
        array[0] = "codigo";
        array[1] = "texto";
        array[2] = "cdcnx";
        array[3] = "cuenta";

        return array;
    }
}