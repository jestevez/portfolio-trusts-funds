/*
 * TableHelp.java
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
 * The Class TableHelp.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 25/08/2013
 */
public class TableHelp implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8315875342567519921L;

    /** The id. */
    private Long id;

    /** The code. */
    private String code;

    /** The name. */
    private String name;

    /** The table name. */
    private String tableName;

    /** The table code. */
    private String tableCode;

    /** The table desc. */
    private String tableDesc;

    /** The table parent. */
    private String tableParent;

    /**
     * Instantiates a new table help.
     */
    public TableHelp() {
        super();
        this.id = 0L;
        this.code = "";
        this.name = "";
        this.tableName = "";
        this.tableCode = "";
        this.tableDesc = "";
        this.tableParent = "";

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
     * Gets the table name.
     *
     * @return the table name
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the table name.
     *
     * @param tableName the new table name
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * Gets the table code.
     *
     * @return the table code
     */
    public String getTableCode() {
        return tableCode;
    }

    /**
     * Sets the table code.
     *
     * @param tableCode the new table code
     */
    public void setTableCode(String tableCode) {
        this.tableCode = tableCode;
    }

    /**
     * Gets the table desc.
     *
     * @return the table desc
     */
    public String getTableDesc() {
        return tableDesc;
    }

    /**
     * Sets the table desc.
     *
     * @param tableDesc the new table desc
     */
    public void setTableDesc(String tableDesc) {
        this.tableDesc = tableDesc;
    }

    /**
     * Gets the table parent.
     *
     * @return the table parent
     */
    public String getTableParent() {
        return tableParent;
    }

    /**
     * Sets the table parent.
     *
     * @param tableParent the new table parent
     */
    public void setTableParent(String tableParent) {
        this.tableParent = tableParent;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[7];
        array[0] = this.id;
        array[1] = this.code;
        array[2] = this.name;
        array[3] = this.tableName;
        array[4] = this.tableCode;
        array[5] = this.tableDesc;
        array[6] = this.tableParent;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[7];
        array[0] = "id";
        array[1] = "code";
        array[2] = "name";
        array[3] = "tableName";
        array[4] = "tableCode";
        array[5] = "tableDesc";
        array[6] = "tableParent";

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
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((tableName == null) ? 0 : tableName.hashCode());
        result = prime * result + ((tableCode == null) ? 0 : tableCode.hashCode());
        result = prime * result + ((tableDesc == null) ? 0 : tableDesc.hashCode());
        result = prime * result + ((tableParent == null) ? 0 : tableParent.hashCode());
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
        TableHelp other = (TableHelp) obj;
        return this.hashCode() == other.hashCode();
    }
}