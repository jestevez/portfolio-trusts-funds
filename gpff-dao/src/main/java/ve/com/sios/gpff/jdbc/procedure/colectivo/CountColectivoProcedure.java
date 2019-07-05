/*
 * CountColectivoProcedure.java
 *
 * Copyright 2014 - Soluciones Integrales Open-Source SiOS
 * Copyright 2014 - Fundación para la Investigación y Desarrollo del Software Libre en Venezuela
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
package ve.com.sios.gpff.jdbc.procedure.colectivo;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;
import ve.com.sios.gpff.beans.Colectivo;

/**
 * The Class CountColectivoProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 07/05/2014
 */
@Service
public class CountColectivoProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCountColectivo";

    /**
     * Instantiates a new count colectivo procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CountColectivoProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_CLICLA", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLINIF", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLINOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLVEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLVDEL", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("TOTAL", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param colectivo the colectivo
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Colectivo colectivo, AuthorizationData authorizationData) throws GpffDaoException {

        if (colectivo == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_CLICLA", colectivo.getClicla());
        inParams.put("P_CLINIF", colectivo.getClinif());
        inParams.put("P_CLINOM", colectivo.getClinom());
        inParams.put("P_CLVEMP", colectivo.getClvemp());
        inParams.put("P_CLVDEL", colectivo.getClvdel());

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
