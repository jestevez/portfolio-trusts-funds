/*
 * Master.java
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
 * The Class Master.
 *
 * @author Jose Luis Estevez jestevez@indesoft.org.ve jose.estevez.prieto@gmail.com
 * @version 1.0
 * @date 17/12/2012
 */
public class Master implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7784381888603065144L;

    /** The key. */
    private String key;

    /** The value. */
    private String value;

    /**
     * Gets the key.
     *
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the key.
     *
     * @param key the new key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value.
     *
     * @param value the new value
     */
    public void setValue(String value) {
        this.value = value;
    }
}
