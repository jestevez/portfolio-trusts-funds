/*
 * SplfileDao.java
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

import javax.servlet.ServletContext;

import ve.com.sios.gpff.beans.Splfile;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.common.dao.GenericDao;
import ve.com.sios.gpff.exception.GpffDaoException;
import ve.com.sios.gpff.legacy.sockets.MessageRecord;

/**
 * The Interface SplfileDao.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 10/02/2014
 */
public interface SplfileDao extends GenericDao<Splfile, Integer> {

    /**
     * Prints the.
     *
     * @param message the message
     * @param authorizationData the authorization data
     * @param context the context
     * @return the int
     * @throws GpffDaoException the gpff dao exception
     */
    int print(MessageRecord message, AuthorizationData authorizationData, ServletContext context) throws GpffDaoException;
}