/*
 * CountAa2clipoProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2clipo;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2clipo;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class CountAa2clipoProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 04/04/2014
 */
@Service
public class CountAa2clipoProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCountAa2clipo";

    /**
     * Instantiates a new count aa 2 clipo procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CountAa2clipoProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_CLPCLA", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLPNOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLPAPE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLPAP2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLPDI1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLPDI2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLPPOS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLPPRO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLPPAI", Types.INTEGER));
        declareParameter(new SqlParameter("P_CLPPOB", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLPANA", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLPTID", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLPNIF", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLPTEL", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLPUSU", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("TOTAL", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2clipo the aa 2 clipo
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Aa2clipo aa2clipo, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2clipo == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_CLPCLA", aa2clipo.getClpcla());
        inParams.put("P_CLPNOM", aa2clipo.getClpnom());
        inParams.put("P_CLPAPE", aa2clipo.getClpape());
        inParams.put("P_CLPAP2", aa2clipo.getClpap2());
        inParams.put("P_CLPDI1", aa2clipo.getClpdi1());
        inParams.put("P_CLPDI2", aa2clipo.getClpdi2());
        inParams.put("P_CLPPOS", aa2clipo.getClppos());
        inParams.put("P_CLPPRO", aa2clipo.getClppro());
        inParams.put("P_CLPPAI", aa2clipo.getClppai());
        inParams.put("P_CLPPOB", aa2clipo.getClppob());
        inParams.put("P_CLPANA", aa2clipo.getClpana());
        inParams.put("P_CLPTID", aa2clipo.getClptid());
        inParams.put("P_CLPNIF", aa2clipo.getClpnif());
        inParams.put("P_CLPTEL", aa2clipo.getClptel());
        inParams.put("P_CLPUSU", aa2clipo.getClpusu());

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
