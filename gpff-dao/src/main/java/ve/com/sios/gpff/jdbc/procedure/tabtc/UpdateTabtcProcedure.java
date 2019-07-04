/*
 * UpdateTabtcProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.tabtc;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.AuthorizationData;
import ve.com.sios.gpff.beans.Tabtc;

/**
 * The Class UpdateTabtcProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 13/02/2014
 */
@Service
public class UpdateTabtcProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procUpdateTabtc";

    /**
     * Instantiates a new update tabtc procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public UpdateTabtcProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_CODIG2", Types.INTEGER));
        declareParameter(new SqlParameter("P_TEXTO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FIMACU", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        compile();
    }

    /**
     * Execute.
     *
     * @param tabtc the tabtc
     * @param authorizationData the authorization data
     * @return true, if successful
     * @throws Exception the exception
     */
    public boolean execute(Tabtc tabtc, AuthorizationData authorizationData) throws Exception {

        if (tabtc == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_CODIG2", tabtc.getCodig2());
        inParams.put("P_TEXTO", tabtc.getTexto());
        inParams.put("P_FIMACU", tabtc.getFimacu());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return true;
        } catch (Exception e) {
            logger.error("Error invocando el metodo execute: ", e);
            throw e;
        }
    }

}