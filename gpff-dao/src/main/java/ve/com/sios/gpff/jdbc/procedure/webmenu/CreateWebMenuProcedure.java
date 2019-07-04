/*
 * CreateWebMenuProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.webmenu;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.AuthorizationData;
import ve.com.sios.gpff.beans.WebMenu;

/**
 * The Class CreateWebMenuProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 28/08/2013
 */
@Service
public class CreateWebMenuProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCreateWebMenu";

    /**
     * Instantiates a new creates the web menu procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CreateWebMenuProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_NAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_URL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PGM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PARENTID", Types.INTEGER));
        declareParameter(new SqlParameter("P_ORDERS", Types.INTEGER));
        declareParameter(new SqlParameter("P_STATUSID", Types.INTEGER));
        declareParameter(new SqlParameter("P_ISMENU", Types.INTEGER));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_ID", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param webMenu the web menu
     * @param authorizationData the authorization data
     * @return the int
     * @throws Exception the exception
     */
    public int execute(WebMenu webMenu, AuthorizationData authorizationData) throws Exception {

        if (webMenu == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_NAME", webMenu.getName());
        inParams.put("P_URL", webMenu.getUrl());
        inParams.put("P_PGM", webMenu.getPgm());
        inParams.put("P_PARENTID", webMenu.getParentId());
        inParams.put("P_ORDERS", webMenu.getOrders());
        inParams.put("P_STATUSID", webMenu.getStatusId());
        inParams.put("P_ISMENU", webMenu.getIsmenu());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Integer) maps.get("P_ID");
        } catch (Exception e) {
            logger.error("Error invocando el metodo execute: ", e);
            throw e;
        }
    }

}