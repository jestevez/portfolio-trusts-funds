/*
 * WebMenuDao.java
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
package ve.com.sios.gpff.dao;

import java.util.HashMap;
import java.util.List;

import ve.com.sios.gpff.beans.WebMenu;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.common.dao.GenericDao;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Interface WebMenuDao.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 26/08/2013
 */
public interface WebMenuDao extends GenericDao<WebMenu, Integer> {

    /**
     * Gets the parents options.
     *
     * @param authorizationData the authorization data
     * @return the parents options
     * @throws GpffDaoException the gpff dao exception
     */
    List<WebMenu> getParentsOptions(AuthorizationData authorizationData) throws GpffDaoException;

    /**
     * Gets the childs options.
     *
     * @param authorizationData the authorization data
     * @return the childs options
     * @throws GpffDaoException the gpff dao exception
     */
    HashMap<Long, List<WebMenu>> getChildsOptions(AuthorizationData authorizationData) throws GpffDaoException;

    /**
     * Checks for children.
     *
     * @param optionHashTree the option hash tree
     * @param parent the parent
     * @return true, if successful
     * @throws GpffDaoException the gpff dao exception
     */
    boolean hasChildren(HashMap<Long, List<WebMenu>> optionHashTree, WebMenu parent) throws GpffDaoException;

}
