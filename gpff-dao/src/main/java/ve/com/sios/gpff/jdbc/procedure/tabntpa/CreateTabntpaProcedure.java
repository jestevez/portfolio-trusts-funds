/*
 * CreateTabntpaProcedure.java
 *
 * Copyright 2014 - Soluciones Integrales Open-Source SiOS
 * Copyright 2014 - Fundación para la Investigación y Desarrollo del Software Libre en Venezuela
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
package ve.com.sios.gpff.jdbc.procedure.tabntpa;

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
import ve.com.sios.gpff.beans.Tabntpa;

/**
 * The Class CreateTabntpaProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 03/04/2014
 */
@Service
public class CreateTabntpaProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCreateTabntpa";

    /**
     * Instantiates a new creates the tabntpa procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CreateTabntpaProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_NTITIP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NTICOD", Types.INTEGER));
        declareParameter(new SqlParameter("P_NTINOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NTICTD", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NTIPRD", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NTICTH", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NTIPRH", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NTIDES", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NTICLI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NTIOPE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NTIMOD", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("P_MSGCODE", Types.INTEGER));
        compile();
    }

    /**
     * Execute.
     *
     * @param tabntpa the tabntpa
     * @param authorizationData the authorization data
     * @return the int
     * @throws Exception the exception
     */
    public int execute(Tabntpa tabntpa, AuthorizationData authorizationData) throws Exception {

        if (tabntpa == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_NTITIP", tabntpa.getNtitip());
        inParams.put("P_NTICOD", tabntpa.getNticod());
        inParams.put("P_NTINOM", tabntpa.getNtinom());
        inParams.put("P_NTICTD", tabntpa.getNtictd());
        inParams.put("P_NTIPRD", tabntpa.getNtiprd());
        inParams.put("P_NTICTH", tabntpa.getNticth());
        inParams.put("P_NTIPRH", tabntpa.getNtiprh());
        inParams.put("P_NTIDES", tabntpa.getNtides());
        inParams.put("P_NTICLI", tabntpa.getNticli());
        inParams.put("P_NTIOPE", tabntpa.getNtiope());
        inParams.put("P_NTIMOD", tabntpa.getNtimod());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);
            return (Integer) maps.get("P_MSGCODE");

        } catch (Exception e) {
            logger.error("Error invocando el metodo execute: ", e);
            throw e;
        }
    }

}