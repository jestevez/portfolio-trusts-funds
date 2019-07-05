/*
 * UpdateAa2tautProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2taut;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2taut;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class UpdateAa2tautProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 27/02/2014
 */
@Service
public class UpdateAa2tautProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procUpdateAa2taut";

    /**
     * Instantiates a new update aa 2 taut procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public UpdateAa2tautProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);
        declareParameter(new SqlParameter("P_AUTEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_AUTDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_AUTCLA", Types.INTEGER));
        declareParameter(new SqlParameter("P_AUTNOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_AUTANU", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_MSGCODE", Types.INTEGER));
        compile();
    }

    /**
     * Execute.
     *
     * @param aa2taut the aa 2 taut
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Aa2taut aa2taut, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2taut == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_AUTEMP", aa2taut.getAutemp());
        inParams.put("P_AUTDEL", aa2taut.getAutdel());
        inParams.put("P_AUTCLA", aa2taut.getAutcla());
        inParams.put("P_AUTNOM", aa2taut.getAutnom());
        inParams.put("P_AUTANU", aa2taut.getAutanu());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Integer) maps.get("P_MSGCODE");
        } catch (Exception e) {
            
            throw new GpffDaoException(e);
        }
    }

}
