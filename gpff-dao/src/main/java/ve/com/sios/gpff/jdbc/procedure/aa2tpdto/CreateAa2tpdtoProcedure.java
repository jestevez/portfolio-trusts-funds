/*
 * CreateAa2tpdtoProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2tpdto;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2tpdto;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class CreateAa2tpdtoProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 27/02/2014
 */
@Service
public class CreateAa2tpdtoProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCreateAa2tpdto";

    /**
     * Instantiates a new creates the aa 2 tpdto procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CreateAa2tpdtoProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);
        declareParameter(new SqlParameter("P_DEPCLA", Types.BIGINT));
        declareParameter(new SqlParameter("P_DEPEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DEPDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DEPNOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_DEPCLA_O", Types.BIGINT));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2tpdto the aa 2 tpdto
     * @param authorizationData the authorization data
     * @return the long
     * @throws Exception the exception
     */
    public Long execute(Aa2tpdto aa2tpdto, AuthorizationData authorizationData) throws Exception {

        if (aa2tpdto == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_DEPCLA", aa2tpdto.getDepcla());
        inParams.put("P_DEPEMP", aa2tpdto.getDepemp());
        inParams.put("P_DEPDEL", aa2tpdto.getDepdel());
        inParams.put("P_DEPNOM", aa2tpdto.getDepnom());
        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Long) maps.get("P_DEPCLA_O");
        } catch (Exception e) {
            logger.error("Error invocando el metodo execute: ", e);
            throw e;
        }
    }

}