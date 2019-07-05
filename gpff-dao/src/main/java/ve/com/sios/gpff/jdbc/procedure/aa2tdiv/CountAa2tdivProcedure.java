/*
 * CountAa2tdivProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2tdiv;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2tdiv;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class CountAa2tdivProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 14/02/2014
 */
@Service
public class CountAa2tdivProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCountAa2tdiv";

    /**
     * Instantiates a new count aa 2 tdiv procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CountAa2tdivProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_DIVCLA", Types.INTEGER));
        declareParameter(new SqlParameter("P_DIVNOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DIVABR", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DIVCCO", Types.INTEGER));
        declareParameter(new SqlParameter("P_DIVCVE", Types.INTEGER));
        declareParameter(new SqlParameter("P_DIVFIX", Types.INTEGER));
        declareParameter(new SqlParameter("P_DIVCTA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DIVFIB", Types.INTEGER));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("TOTAL", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2tdiv the aa 2 tdiv
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Aa2tdiv aa2tdiv, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2tdiv == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_DIVCLA", aa2tdiv.getDivcla());
        inParams.put("P_DIVNOM", aa2tdiv.getDivnom());
        inParams.put("P_DIVABR", aa2tdiv.getDivabr());
        inParams.put("P_DIVCCO", aa2tdiv.getDivcco());
        inParams.put("P_DIVCVE", aa2tdiv.getDivcve());
        inParams.put("P_DIVFIX", aa2tdiv.getDivfix());
        inParams.put("P_DIVCTA", aa2tdiv.getDivcta());
        inParams.put("P_DIVFIB", aa2tdiv.getDivfib());

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
