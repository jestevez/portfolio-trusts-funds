/*
 * TransactionAccDefinitionSocket.java
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
 * The Class TransactionAccDefinition.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 17/01/2013
 */
public class TransactionAccDefinition implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2152710577341389214L;

    /** The type. */
    private String type;

    /** The name. */
    private String name;

    /** The operation code. */
    private long operationCode;

    /** The operation name. */
    private String operationName;

    /** The modality code. */
    private long modalityCode;

    /** The modality name. */
    private String modalityName;

    /** The concept. */
    private String concept;

    /** The account debit. */
    private String accountDebit;

    /** The account credit. */
    private String accountCredit;

    /** The discount amount. */
    private String discountAmount;

    /**
     * Instantiates a new transaction acc definition.
     */
    public TransactionAccDefinition() {
        super();
        this.type = "";
        this.name = "";
        this.operationCode = 0;
        this.operationName = "";
        this.modalityCode = 0;
        this.modalityName = "";
        this.concept = "";
        this.accountDebit = "";
        this.accountCredit = "";
        this.discountAmount = "";

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
     * Gets the operation code.
     *
     * @return the operation code
     */
    public long getOperationCode() {
        return operationCode;
    }

    /**
     * Sets the operation code.
     *
     * @param operationCode the new operation code
     */
    public void setOperationCode(long operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * Gets the operation name.
     *
     * @return the operation name
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the operation name.
     *
     * @param operationName the new operation name
     */
    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * Gets the modality code.
     *
     * @return the modality code
     */
    public long getModalityCode() {
        return modalityCode;
    }

    /**
     * Sets the modality code.
     *
     * @param modalityCode the new modality code
     */
    public void setModalityCode(long modalityCode) {
        this.modalityCode = modalityCode;
    }

    /**
     * Gets the modality name.
     *
     * @return the modality name
     */
    public String getModalityName() {
        return modalityName;
    }

    /**
     * Sets the modality name.
     *
     * @param modalityName the new modality name
     */
    public void setModalityName(String modalityName) {
        this.modalityName = modalityName;
    }

    /**
     * Gets the concept.
     *
     * @return the concept
     */
    public String getConcept() {
        return concept;
    }

    /**
     * Sets the concept.
     *
     * @param concept the new concept
     */
    public void setConcept(String concept) {
        this.concept = concept;
    }

    /**
     * Gets the account debit.
     *
     * @return the account debit
     */
    public String getAccountDebit() {
        return accountDebit;
    }

    /**
     * Sets the account debit.
     *
     * @param accountDebit the new account debit
     */
    public void setAccountDebit(String accountDebit) {
        this.accountDebit = accountDebit;
    }

    /**
     * Gets the account credit.
     *
     * @return the account credit
     */
    public String getAccountCredit() {
        return accountCredit;
    }

    /**
     * Sets the account credit.
     *
     * @param accountCredit the new account credit
     */
    public void setAccountCredit(String accountCredit) {
        this.accountCredit = accountCredit;
    }

    /**
     * Gets the discount amount.
     *
     * @return the discount amount
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the discount amount.
     *
     * @param discountAmount the new discount amount
     */
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[10];
        array[0] = this.type;
        array[1] = this.name;
        array[2] = this.operationCode;
        array[3] = this.operationName;
        array[4] = this.modalityCode;
        array[5] = this.modalityName;
        array[6] = this.concept;
        array[7] = this.accountDebit;
        array[8] = this.accountCredit;
        array[9] = this.discountAmount;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[10];
        array[0] = "type";
        array[1] = "name";
        array[2] = "operationCode";
        array[3] = "operationName";
        array[4] = "modalityCode";
        array[5] = "modalityName";
        array[6] = "concept";
        array[7] = "accountDebit";
        array[8] = "accountCredit";
        array[9] = "discountAmount";

        return array;
    }
}