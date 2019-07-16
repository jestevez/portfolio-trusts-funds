/*
 * UserTypeDao.java
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
package ve.com.sios.gpff.dao;

import java.util.List;

import ve.com.sios.gpff.beans.UserType;
import ve.com.sios.gpff.exception.MessageException;

/**
 * The Interface UserTypeDao.
 *
 * @author jdelgado
 */
public interface UserTypeDao {

    /**
     * Gets the list usr.
     *
     * @param username the username
     * @param firstResult the first result
     * @param maxResults the max results
     * @param description the description
     * @return the list usr
     * @throws MessageException the message exception
     */
    List<UserType> getListUsr(String username, String firstResult, String maxResults, String description) throws MessageException;

    /**
     * Gets the count list usr.
     *
     * @param userName the user name
     * @param description the description
     * @return the count list usr
     * @throws MessageException the message exception
     */
    long getCountListUsr(String userName, String description) throws MessageException;

    /**
     * Adds the type user.
     *
     * @param typeUser the type user
     * @param userName the user name
     * @return true, if successful
     * @throws MessageException the message exception
     */
    boolean addTypeUser(UserType typeUser, String userName) throws MessageException;

    /**
     * Edits the type user.
     *
     * @param typeUser the type user
     * @param userName the user name
     * @return true, if successful
     * @throws MessageException the message exception
     */
    boolean editTypeUser(UserType typeUser, String userName) throws MessageException;
}
