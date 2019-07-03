/*
 * Splfile.java
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
import java.util.Date;

/**
 * The Class Splfile.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 10/02/2014
 */
public class Splfile implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7257594764381956584L;

    /** The id. */
    private Long id;

    /** The spldata. */
    private byte[] spldata;

    /** The splname. */
    private String splname;

    /** The splmime. */
    private String splmime;

    /** The spldate. */
    private Date spldate;

    /** The spltype. */
    private String spltype;

    /** The spluser. */
    private String spluser;

    /** The splstatus. */
    private String splstatus;

    /**
     * Instantiates a new splfile.
     */
    public Splfile() {
        super();
        this.id = null;
        this.spldata = null;
        this.splname = null;
        this.splmime = null;
        this.spldate = null;
        this.spltype = null;
        this.spluser = null;
        this.splstatus = null;

    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the spldata.
     *
     * @return the spldata
     */
    public byte[] getSpldata() {
        return spldata;
    }

    /**
     * Sets the spldata.
     *
     * @param spldata the new spldata
     */
    public void setSpldata(byte[] spldata) {
        this.spldata = spldata;
    }

    /**
     * Gets the splname.
     *
     * @return the splname
     */
    public String getSplname() {
        return splname;
    }

    /**
     * Sets the splname.
     *
     * @param splname the new splname
     */
    public void setSplname(String splname) {
        this.splname = splname;
    }

    /**
     * Gets the splmime.
     *
     * @return the splmime
     */
    public String getSplmime() {
        return splmime;
    }

    /**
     * Sets the splmime.
     *
     * @param splmime the new splmime
     */
    public void setSplmime(String splmime) {
        this.splmime = splmime;
    }

    /**
     * Gets the spldate.
     *
     * @return the spldate
     */
    public Date getSpldate() {
        return spldate;
    }

    /**
     * Sets the spldate.
     *
     * @param spldate the new spldate
     */
    public void setSpldate(Date spldate) {
        this.spldate = spldate;
    }

    /**
     * Gets the spltype.
     *
     * @return the spltype
     */
    public String getSpltype() {
        return spltype;
    }

    /**
     * Sets the spltype.
     *
     * @param spltype the new spltype
     */
    public void setSpltype(String spltype) {
        this.spltype = spltype;
    }

    /**
     * Gets the spluser.
     *
     * @return the spluser
     */
    public String getSpluser() {
        return spluser;
    }

    /**
     * Sets the spluser.
     *
     * @param spluser the new spluser
     */
    public void setSpluser(String spluser) {
        this.spluser = spluser;
    }

    /**
     * Gets the splstatus.
     *
     * @return the splstatus
     */
    public String getSplstatus() {
        return splstatus;
    }

    /**
     * Sets the splstatus.
     *
     * @param splstatus the new splstatus
     */
    public void setSplstatus(String splstatus) {
        this.splstatus = splstatus;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[8];
        array[0] = this.id;
        array[1] = this.spldata;
        array[2] = this.splname;
        array[3] = this.splmime;
        array[4] = this.spldate;
        array[5] = this.spltype;
        array[6] = this.spluser;
        array[7] = this.splstatus;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[8];
        array[0] = "id";
        array[1] = "spldata";
        array[2] = "splname";
        array[3] = "splmime";
        array[4] = "spldate";
        array[5] = "spltype";
        array[6] = "spluser";
        array[7] = "splstatus";

        return array;
    }
}