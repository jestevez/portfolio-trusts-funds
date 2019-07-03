/*
 * MenuTypeSocket.java
 *
 * Copyright 2013 - Soluciones Integrales Open-Source SiOS
 * Copyright 2013 - Fundacion para la Investigacion y Desarrollo del Software Libre en Venezuela
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
 * The Class MenuType.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 11/01/2013
 */
public class MenuType implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7159348058831510957L;

    /** The name. */
    private String name;

    /** The description. */
    private String description;

    /** The relative record. */
    private int relative_record;

    /**
     * Instantiates a new menu type.
     */
    public MenuType() {
        super();
        this.name = "";
        this.description = "";
        this.relative_record = 0;

    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the relative record.
     *
     * @param relative_record the new relative record
     */
    public void setRelative_record(int relative_record) {
        this.relative_record = relative_record;
    }

    /**
     * Gets the relative record.
     *
     * @return the relative record
     */
    public int getRelative_record() {
        return relative_record;
    }

}