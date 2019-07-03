/*
 * UserProfile.java
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
import java.util.Date;

/**
 * The Class UserProfile.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 23/09/2013
 */
public class UserProfile implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4638996462052133072L;

    /** The id. */
    private long id;

    /** The username. */
    private String username;

    /** The document number. */
    private String documentNumber;

    /** The first name. */
    private String firstName;

    /** The second name. */
    private String secondName;

    /** The last name. */
    private String lastName;

    /** The second last name. */
    private String secondLastName;

    /** The gender. */
    private String gender;

    /** The civil status. */
    private String civilStatus;

    /** The email. */
    private String email;

    /** The phone. */
    private String phone;

    /** The mobile. */
    private String mobile;

    /** The brithday. */
    private Date brithday;

    /** The enabled. */
    private String enabled;

    /** The deleted. */
    private String deleted;

    /** The created at. */
    private Date createdAt;

    /** The created by. */
    private String createdBy;

    /** The updated at. */
    private Date updatedAt;

    /** The updated by. */
    private String updatedBy;

    /**
     * Instantiates a new user profile.
     */
    public UserProfile() {
        super();
        this.id = 0;
        this.username = "";
        this.documentNumber = "";
        this.firstName = "";
        this.secondName = "";
        this.lastName = "";
        this.secondLastName = "";
        this.gender = "";
        this.civilStatus = "";
        this.email = "";
        this.phone = "";
        this.mobile = "";
        this.brithday = new Date();
        this.enabled = "";
        this.deleted = "";
        this.createdAt = new Date();
        this.createdBy = "";
        this.updatedAt = new Date();
        this.updatedBy = "";

    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username.
     *
     * @param username the new username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the document number.
     *
     * @return the document number
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the document number.
     *
     * @param documentNumber the new document number
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    /**
     * Gets the first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     *
     * @param firstName the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the second name.
     *
     * @return the second name
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Sets the second name.
     *
     * @param secondName the new second name
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * Gets the last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     *
     * @param lastName the new last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the second last name.
     *
     * @return the second last name
     */
    public String getSecondLastName() {
        return secondLastName;
    }

    /**
     * Sets the second last name.
     *
     * @param secondLastName the new second last name
     */
    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    /**
     * Gets the gender.
     *
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender.
     *
     * @param gender the new gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the civil status.
     *
     * @return the civil status
     */
    public String getCivilStatus() {
        return civilStatus;
    }

    /**
     * Sets the civil status.
     *
     * @param civilStatus the new civil status
     */
    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    /**
     * Gets the email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     *
     * @param email the new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the phone.
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone.
     *
     * @param phone the new phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the mobile.
     *
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the mobile.
     *
     * @param mobile the new mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * Gets the brithday.
     *
     * @return the brithday
     */
    public Date getBrithday() {
        return brithday;
    }

    /**
     * Sets the brithday.
     *
     * @param brithday the new brithday
     */
    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    /**
     * Gets the enabled.
     *
     * @return the enabled
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * Sets the enabled.
     *
     * @param enabled the new enabled
     */
    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    /**
     * Gets the deleted.
     *
     * @return the deleted
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * Sets the deleted.
     *
     * @param deleted the new deleted
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    /**
     * Gets the created at.
     *
     * @return the created at
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the created at.
     *
     * @param createdAt the new created at
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Gets the created by.
     *
     * @return the created by
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the created by.
     *
     * @param createdBy the new created by
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets the updated at.
     *
     * @return the updated at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the updated at.
     *
     * @param updatedAt the new updated at
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Gets the updated by.
     *
     * @return the updated by
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the updated by.
     *
     * @param updatedBy the new updated by
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * To array.
     *
     * @return the object[]
     */
    public Object[] toArray() {
        Object[] array = new Object[19];
        array[0] = this.id;
        array[1] = this.username;
        array[2] = this.documentNumber;
        array[3] = this.firstName;
        array[4] = this.secondName;
        array[5] = this.lastName;
        array[6] = this.secondLastName;
        array[7] = this.gender;
        array[8] = this.civilStatus;
        array[9] = this.email;
        array[10] = this.phone;
        array[11] = this.mobile;
        array[12] = this.brithday;
        array[13] = this.enabled;
        array[14] = this.deleted;
        array[15] = this.createdAt;
        array[16] = this.createdBy;
        array[17] = this.updatedAt;
        array[18] = this.updatedBy;

        return array;
    }

    /**
     * Gets the headers.
     *
     * @return the headers
     */
    public static String[] getHeaders() {
        String[] array = new String[19];
        array[0] = "id";
        array[1] = "username";
        array[2] = "documentNumber";
        array[3] = "firstName";
        array[4] = "secondName";
        array[5] = "lastName";
        array[6] = "secondLastName";
        array[7] = "gender";
        array[8] = "civilStatus";
        array[9] = "email";
        array[10] = "phone";
        array[11] = "mobile";
        array[12] = "brithday";
        array[13] = "enabled";
        array[14] = "deleted";
        array[15] = "createdAt";
        array[16] = "createdBy";
        array[17] = "updatedAt";
        array[18] = "updatedBy";

        return array;
    }
}