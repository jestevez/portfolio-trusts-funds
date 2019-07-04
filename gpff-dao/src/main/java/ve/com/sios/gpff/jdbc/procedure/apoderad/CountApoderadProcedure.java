/*
 * CountApoderadProcedure.java
 *
 * Copyright 2014 - Soluciones Integrales Open-Source SiOS
 * Copyright 2014 - E-TRUST SISTEMAS
 *
 * http://www.sios.com.ve
 * http://www.etrustsistemas.com
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
package ve.com.sios.gpff.jdbc.procedure.apoderad;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Apoderad;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class CountApoderadProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 26/03/2014
 */
@Service
public class CountApoderadProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCountApoderad";

    /**
     * Instantiates a new count apoderad procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CountApoderadProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_NUMAPO", Types.INTEGER));
        declareParameter(new SqlParameter("P_NOMAPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ECAPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PROAPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_POBAPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEDAPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FOLAPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_TOMAPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ASIAPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_REPPOR", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("TOTAL", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param apoderad the apoderad
     * @param authorizationData the authorization data
     * @return the int
     * @throws Exception the exception
     */
    public int execute(Apoderad apoderad, AuthorizationData authorizationData) throws Exception {

        if (apoderad == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_NUMAPO", apoderad.getNumapo());
        inParams.put("P_NOMAPO", apoderad.getNomapo());
        inParams.put("P_ECAPO", apoderad.getEcapo());
        inParams.put("P_PROAPO", apoderad.getProapo());
        inParams.put("P_POBAPO", apoderad.getPobapo());
        inParams.put("P_CEDAPO", apoderad.getCedapo());
        inParams.put("P_FOLAPO", apoderad.getFolapo());
        inParams.put("P_TOMAPO", apoderad.getTomapo());
        inParams.put("P_ASIAPO", apoderad.getAsiapo());
        inParams.put("P_REPPOR", apoderad.getReppor());

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