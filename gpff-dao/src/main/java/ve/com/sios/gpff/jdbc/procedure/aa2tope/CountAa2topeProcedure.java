/*
 * CountAa2topeProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2tope;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2tope;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class CountAa2topeProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 07/03/2014
 */
@Service
public class CountAa2topeProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCountAa2tope";

    /**
     * Instantiates a new count aa 2 tope procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CountAa2topeProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_OPECLA", Types.INTEGER));
        declareParameter(new SqlParameter("P_OPENOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_OPETIP", Types.INTEGER));
        declareParameter(new SqlParameter("P_OPESIG", Types.VARCHAR));
        declareParameter(new SqlParameter("P_OPEAUX", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("TOTAL", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2tope the aa 2 tope
     * @param authorizationData the authorization data
     * @return the int
     * @throws Exception the exception
     */
    public int execute(Aa2tope aa2tope, AuthorizationData authorizationData) throws Exception {

        if (aa2tope == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_OPECLA", aa2tope.getOpecla());
        inParams.put("P_OPENOM", aa2tope.getOpenom());
        inParams.put("P_OPETIP", aa2tope.getOpetip());
        inParams.put("P_OPESIG", aa2tope.getOpesig());
        inParams.put("P_OPEAUX", aa2tope.getOpeaux());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Integer) maps.get("TOTAL");
        } catch (Exception e) {
            logger.error("Error invocando el metodo execute: ", e);
            throw e;
        }
    }

}
