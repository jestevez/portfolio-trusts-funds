/*
 * Option.java
 *
 * Copyright 2012 SIOS www.sios.com.ve.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package ve.com.sios.gpff.beans;

import java.io.Serializable;

/**
 * The Class Option.
 *
 * @author Jose Luis Estevez jestevez@indesoft.org.ve jose.estevez.prieto@gmail.com
 * @version 1.0
 * @date 12/12/2012
 */
public class Option implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6669567049811526847L;

    /** The code. */
    private String code; // OPCMNU

    /** The program. */
    private String program; // OPCPGM

    /** The name. */
    private String name; // OPCDSC

    /** The parent code. */
    private String parentCode; // OPCPAD

    /** The type. */
    private String type; // OPCTIP

    /**
     * Gets the code.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the code.
     *
     * @param code the new code
     */
    public void setCode(String code) {
        this.code = code;
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
     * Gets the parent code.
     *
     * @return the parent code
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * Sets the parent code.
     *
     * @param parentCode the new parent code
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    /**
     * Gets the program.
     *
     * @return the program
     */
    public String getProgram() {
        return program;
    }

    /**
     * Sets the program.
     *
     * @param program the new program
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType(String type) {
        this.type = type;
    }
}
