/*
 * WebMenu.java
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
 * The Class WebMenu.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 13/01/2014
 */
public class WebMenu implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8961853802740000785L;

    /** The id. */
    private Long id;

    /** The name. */
    private String name;

    /** The url. */
    private String url;

    /** The pgm. */
    private String pgm;

    /** The parent id. */
    private Long parentId;

    /** The orders. */
    private Long orders;

    /** The status id. */
    private Long statusId;

    /** The ismenu. */
    private Long ismenu;

    /**
     * Instantiates a new web menu.
     */
    public WebMenu() {
        super();
        this.id = null;
        this.name = null;
        this.url = null;
        this.pgm = null;
        this.parentId = null;
        this.orders = null;
        this.statusId = null;
        this.ismenu = null;

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
     * Gets the url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the url.
     *
     * @param url the new url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Gets the pgm.
     *
     * @return the pgm
     */
    public String getPgm() {
        return pgm;
    }

    /**
     * Sets the pgm.
     *
     * @param pgm the new pgm
     */
    public void setPgm(String pgm) {
        this.pgm = pgm;
    }

    /**
     * Gets the parent id.
     *
     * @return the parent id
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * Sets the parent id.
     *
     * @param parentId the new parent id
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * Gets the orders.
     *
     * @return the orders
     */
    public Long getOrders() {
        return orders;
    }

    /**
     * Sets the orders.
     *
     * @param orders the new orders
     */
    public void setOrders(Long orders) {
        this.orders = orders;
    }

    /**
     * Gets the status id.
     *
     * @return the status id
     */
    public Long getStatusId() {
        return statusId;
    }

    /**
     * Sets the status id.
     *
     * @param statusId the new status id
     */
    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    /**
     * Gets the ismenu.
     *
     * @return the ismenu
     */
    public Long getIsmenu() {
        return ismenu;
    }

    /**
     * Sets the ismenu.
     *
     * @param ismenu the new ismenu
     */
    public void setIsmenu(Long ismenu) {
        this.ismenu = ismenu;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[8];
        array[0] = this.id;
        array[1] = this.name;
        array[2] = this.url;
        array[3] = this.pgm;
        array[4] = this.parentId;
        array[5] = this.orders;
        array[6] = this.statusId;
        array[7] = this.ismenu;

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
        array[1] = "name";
        array[2] = "url";
        array[3] = "pgm";
        array[4] = "parentId";
        array[5] = "orders";
        array[6] = "statusId";
        array[7] = "ismenu";

        return array;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((url == null) ? 0 : url.hashCode());
        result = prime * result + ((pgm == null) ? 0 : pgm.hashCode());
        result = prime * result + ((parentId == null) ? 0 : parentId.hashCode());
        result = prime * result + ((orders == null) ? 0 : orders.hashCode());
        result = prime * result + ((statusId == null) ? 0 : statusId.hashCode());
        result = prime * result + ((ismenu == null) ? 0 : ismenu.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Tiposfid other = (Tiposfid) obj;
        return this.hashCode() == other.hashCode();
    }
}