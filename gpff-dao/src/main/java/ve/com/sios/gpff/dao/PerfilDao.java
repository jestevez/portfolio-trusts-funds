/*
 * PerfilDao.java
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

import ve.com.sios.gpff.beans.Perfil;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.common.dao.GenericDao;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Interface PerfilDao.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 15/01/2014
 */
public interface PerfilDao extends GenericDao<Perfil, Integer> {

    /**
     * Adds the carfiusf.
     *
     * @param usuarf the usuarf
     * @param tiposfid the tiposfid
     * @param pantal the pantal
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the gpff dao exception
     */
    int addCarfiusf(String usuarf, String tiposfid, String pantal, AuthorizationData authorizationData) throws GpffDaoException;

    /**
     * Gets the carfiusf.
     *
     * @param usuarf the usuarf
     * @param authorizationData the authorization data
     * @return the carfiusf
     * @throws GpffDaoException the gpff dao exception
     */
    List<String> getCarfiusf(String usuarf, AuthorizationData authorizationData) throws GpffDaoException;

    /**
     * Adds the perfil 2.
     *
     * @param prfprf the prfprf
     * @param tipos the tipos
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the gpff dao exception
     */
    int addPerfil2(String prfprf, String tipos, AuthorizationData authorizationData) throws GpffDaoException;

    /**
     * Gets the perfil 2.
     *
     * @param prfprf the prfprf
     * @param authorizationData the authorization data
     * @return the perfil 2
     * @throws GpffDaoException the gpff dao exception
     */
    List<String> getPerfil2(String prfprf, AuthorizationData authorizationData) throws GpffDaoException;

    /**
     * Adds the perfil 3.
     *
     * @param prfprf the prfprf
     * @param tipos the tipos
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the gpff dao exception
     */
    int addPerfil3(String prfprf, String tipos, AuthorizationData authorizationData) throws GpffDaoException;

    /**
     * Gets the perfil 3.
     *
     * @param prfprf the prfprf
     * @param authorizationData the authorization data
     * @return the perfil 3
     * @throws GpffDaoException the gpff dao exception
     */
    List<String> getPerfil3(String prfprf, AuthorizationData authorizationData) throws GpffDaoException;
}