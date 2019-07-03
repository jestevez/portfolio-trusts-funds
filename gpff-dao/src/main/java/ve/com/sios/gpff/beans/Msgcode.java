/*
 * Msgcode.java
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
 * The Class Msgcode.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 21/02/2014
 */
public class Msgcode implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5576879217115075119L;

    /** The id. */
    private Integer id;

    /** The msglan. */
    private String msglan;

    /** The msgnum. */
    private Integer msgnum;

    /** The msgtxt. */
    private String msgtxt;

    /**
     * Instantiates a new msgcode.
     */
    public Msgcode() {
        super();
        this.id = null;
        this.msglan = null;
        this.msgnum = null;
        this.msgtxt = null;

    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the msglan.
     *
     * @return the msglan
     */
    public String getMsglan() {
        return msglan;
    }

    /**
     * Sets the msglan.
     *
     * @param msglan the new msglan
     */
    public void setMsglan(String msglan) {
        this.msglan = msglan;
    }

    /**
     * Gets the msgnum.
     *
     * @return the msgnum
     */
    public Integer getMsgnum() {
        return msgnum;
    }

    /**
     * Sets the msgnum.
     *
     * @param msgnum the new msgnum
     */
    public void setMsgnum(Integer msgnum) {
        this.msgnum = msgnum;
    }

    /**
     * Gets the msgtxt.
     *
     * @return the msgtxt
     */
    public String getMsgtxt() {
        return msgtxt;
    }

    /**
     * Sets the msgtxt.
     *
     * @param msgtxt the new msgtxt
     */
    public void setMsgtxt(String msgtxt) {
        this.msgtxt = msgtxt;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[4];
        array[0] = this.id;
        array[1] = this.msglan;
        array[2] = this.msgnum;
        array[3] = this.msgtxt;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[4];
        array[0] = "id";
        array[1] = "msglan";
        array[2] = "msgnum";
        array[3] = "msgtxt";

        return array;
    }
}
