/*
 * UpdateCuentasProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.cuentas;

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
import ve.com.sios.gpff.beans.Cuentas;

/**
 * The Class UpdateCuentasProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 20/02/2014
 */
@Service
public class UpdateCuentasProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procUpdateCuentas";

    /**
     * Instantiates a new update cuentas procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public UpdateCuentasProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_CTCCLI", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTCCTA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTCEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTCDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTCTIP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTCAGE", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTCSAL", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTCDIV", Types.INTEGER));
        declareParameter(new SqlParameter("P_CTCAUX", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTCREF", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTCBAN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTCDES", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_MSGCODE", Types.INTEGER));
        compile();
    }

    /**
     * Execute.
     *
     * @param cuentas the cuentas
     * @param authorizationData the authorization data
     * @return the int
     * @throws Exception the exception
     */
    public int execute(Cuentas cuentas, AuthorizationData authorizationData) throws Exception {

        if (cuentas == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_CTCCLI", cuentas.getCtccli());
        inParams.put("P_CTCCTA", cuentas.getCtccta());
        inParams.put("P_CTCEMP", cuentas.getCtcemp());
        inParams.put("P_CTCDEL", cuentas.getCtcdel());
        inParams.put("P_CTCTIP", cuentas.getCtctip());
        inParams.put("P_CTCAGE", cuentas.getCtcage());
        inParams.put("P_CTCSAL", cuentas.getCtcsal());
        inParams.put("P_CTCDIV", cuentas.getCtcdiv());
        inParams.put("P_CTCAUX", cuentas.getCtcaux());
        inParams.put("P_CTCREF", cuentas.getCtcref());
        inParams.put("P_CTCBAN", cuentas.getCtcban());
        inParams.put("P_CTCDES", cuentas.getCtcdes());

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
