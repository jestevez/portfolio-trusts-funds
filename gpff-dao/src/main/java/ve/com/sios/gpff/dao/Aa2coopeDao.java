/*
 * Aa2coopeDao.java
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

import ve.com.sios.gpff.beans.Aa2coope;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.common.dao.GenericDao;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Interface Aa2coopeDao.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 10/03/2014
 */
public interface Aa2coopeDao extends GenericDao<Aa2coope, Integer> {

    /**
     * Do count group by.
     *
     * @param aa2coope the aa 2 coope
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the gpff dao exception
     */
    int doCountGroupBy(Aa2coope aa2coope, AuthorizationData authorizationData) throws GpffDaoException;

    /**
     * Do select group by.
     *
     * @param aa2coope the aa 2 coope
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the gpff dao exception
     */
    List<Aa2coope> doSelectGroupBy(Aa2coope aa2coope, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData)
            throws GpffDaoException;

}