/*
 * CountAa2coopeProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2coope;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2coope;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class CountAa2coopeProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 10/03/2014
 */
@Service
public class CountAa2coopeProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCountAa2coope";

    /**
     * Instantiates a new count aa 2 coope procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CountAa2coopeProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_COPEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPCLI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPOPE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPMOD", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPCTR", Types.INTEGER));
        declareParameter(new SqlParameter("P_COPCTA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPCON", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPIMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPDEH", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPFEC", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("TOTAL", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2coope the aa 2 coope
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Aa2coope aa2coope, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2coope == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_COPEMP", aa2coope.getCopemp());
        inParams.put("P_COPDEL", aa2coope.getCopdel());
        inParams.put("P_COPCLI", aa2coope.getCopcli());
        inParams.put("P_COPOPE", aa2coope.getCopope());
        inParams.put("P_COPMOD", aa2coope.getCopmod());
        inParams.put("P_COPCTR", aa2coope.getCopctr());
        inParams.put("P_COPCTA", aa2coope.getCopcta());
        inParams.put("P_COPCON", aa2coope.getCopcon());
        inParams.put("P_COPIMP", aa2coope.getCopimp());
        inParams.put("P_COPDEH", aa2coope.getCopdeh());
        inParams.put("P_COPFEC", aa2coope.getCopfec());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Integer) maps.get("TOTAL");
        } catch (Exception e) {
            
            throw new GpffDaoException(e);
        }
    }

}
