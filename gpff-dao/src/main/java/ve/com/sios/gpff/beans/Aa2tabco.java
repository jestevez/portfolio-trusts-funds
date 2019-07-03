/*
 * Aa2tabco.java
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
 * The Class Aa2tabco.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 17/03/2014
 */
public class Aa2tabco implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5789264197962818068L;

    /** The tabtip. */
    private Integer tabtip;

    /** The tabnti. */
    private String tabnti;

    /**
     * Instantiates a new aa 2 tabco.
     */
    public Aa2tabco() {
        super();
        this.tabtip = null;
        this.tabnti = null;

    }

    /**
     * Gets the tabtip.
     *
     * @return the tabtip
     */
    public Integer getTabtip() {
        return tabtip;
    }

    /**
     * Sets the tabtip.
     *
     * @param tabtip the new tabtip
     */
    public void setTabtip(Integer tabtip) {
        this.tabtip = tabtip;
    }

    /**
     * Gets the tabnti.
     *
     * @return the tabnti
     */
    public String getTabnti() {
        return tabnti;
    }

    /**
     * Sets the tabnti.
     *
     * @param tabnti the new tabnti
     */
    public void setTabnti(String tabnti) {
        this.tabnti = tabnti;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[2];
        array[0] = this.tabtip;
        array[1] = this.tabnti;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[2];
        array[0] = "tabtip";
        array[1] = "tabnti";

        return array;
    }
}