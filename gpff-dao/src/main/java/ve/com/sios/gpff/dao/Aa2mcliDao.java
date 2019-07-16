/*
 * Aa2mcliDao.java
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

import ve.com.sios.gpff.beans.Aa2mcli;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.common.dao.GenericDao;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Interface Aa2mcliDao.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 17/02/2014
 */
public interface Aa2mcliDao extends GenericDao<Aa2mcli, Integer> {

    /**
     * Gets the max clicla.
     *
     * @param authorizationData the authorization data
     * @return the max clicla
     * @throws GpffDaoException the gpff dao exception
     */
    long getMaxClicla(AuthorizationData authorizationData) throws GpffDaoException;

    /**
     * Do count CLIFID.
     *
     * @param aa2mcli the aa 2 mcli
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the gpff dao exception
     */
    int doCountCLIFID(Aa2mcli aa2mcli, AuthorizationData authorizationData) throws GpffDaoException;

    /**
     * Do select CLIFID.
     *
     * @param aa2mcli the aa 2 mcli
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the gpff dao exception
     */
    List<Aa2mcli> doSelectCLIFID(Aa2mcli aa2mcli, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData)
            throws GpffDaoException;

}
