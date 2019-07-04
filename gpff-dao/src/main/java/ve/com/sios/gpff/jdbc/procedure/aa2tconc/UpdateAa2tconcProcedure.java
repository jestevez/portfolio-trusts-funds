/*
 * UpdateAa2tconcProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2tconc;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2tconc;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class UpdateAa2tconcProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 07/03/2014
 */
@Service
public class UpdateAa2tconcProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procUpdateAa2tconc";

    /**
     * Instantiates a new update aa 2 tconc procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public UpdateAa2tconcProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_CONEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CONDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CONCLA", Types.BIGINT));
        declareParameter(new SqlParameter("P_CONNOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CONDIA", Types.INTEGER));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_MSGCODE", Types.INTEGER));
        compile();
    }

    /**
     * Execute.
     *
     * @param aa2tconc the aa 2 tconc
     * @param authorizationData the authorization data
     * @return the int
     * @throws Exception the exception
     */
    public int execute(Aa2tconc aa2tconc, AuthorizationData authorizationData) throws Exception {

        if (aa2tconc == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_CONEMP", aa2tconc.getConemp());
        inParams.put("P_CONDEL", aa2tconc.getCondel());
        inParams.put("P_CONCLA", aa2tconc.getConcla());
        inParams.put("P_CONNOM", aa2tconc.getConnom());
        inParams.put("P_CONDIA", aa2tconc.getCondia());

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