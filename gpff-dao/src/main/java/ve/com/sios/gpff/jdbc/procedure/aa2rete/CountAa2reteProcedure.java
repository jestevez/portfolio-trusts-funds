/*
 * CountAa2reteProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2rete;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2rete;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class CountAa2reteProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 28/02/2014
 */
@Service
public class CountAa2reteProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCountAa2rete";

    /**
     * Instantiates a new count aa 2 rete procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CountAa2reteProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_RETCOD", Types.INTEGER));
        declareParameter(new SqlParameter("P_RETLIT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RETFIS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RETRES", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RETFEC", Types.INTEGER));
        declareParameter(new SqlParameter("P_RETNOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RETTRA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RETBAS", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RETPOR", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RETIDE", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RETIEX", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RETALI", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RETUSU", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RETPAN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RETHOR", Types.INTEGER));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("TOTAL", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2rete the aa 2 rete
     * @param authorizationData the authorization data
     * @return the int
     * @throws Exception the exception
     */
    public int execute(Aa2rete aa2rete, AuthorizationData authorizationData) throws Exception {

        if (aa2rete == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_RETCOD", aa2rete.getRetcod());
        inParams.put("P_RETLIT", aa2rete.getRetlit());
        inParams.put("P_RETFIS", aa2rete.getRetfis());
        inParams.put("P_RETRES", aa2rete.getRetres());
        inParams.put("P_RETFEC", aa2rete.getRetfec());
        inParams.put("P_RETNOM", aa2rete.getRetnom());
        inParams.put("P_RETTRA", aa2rete.getRettra());
        inParams.put("P_RETBAS", aa2rete.getRetbas());
        inParams.put("P_RETPOR", aa2rete.getRetpor());
        inParams.put("P_RETIDE", aa2rete.getRetide());
        inParams.put("P_RETIEX", aa2rete.getRetiex());
        inParams.put("P_RETALI", aa2rete.getRetali());
        inParams.put("P_RETUSU", aa2rete.getRetusu());
        inParams.put("P_RETPAN", aa2rete.getRetpan());
        inParams.put("P_RETHOR", aa2rete.getRethor());

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
