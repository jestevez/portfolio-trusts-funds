/*
 * CountAa2tprclProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2tprcl;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2tprcl;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class CountAa2tprclProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 31/03/2014
 */
@Service
public class CountAa2tprclProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCountAa2tprcl";

    /**
     * Instantiates a new count aa 2 tprcl procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CountAa2tprclProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_PCLEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PCLDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PCLCLA", Types.BIGINT));
        declareParameter(new SqlParameter("P_PCLNOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PCLCTA", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("TOTAL", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2tprcl the aa 2 tprcl
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Aa2tprcl aa2tprcl, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2tprcl == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_PCLEMP", aa2tprcl.getPclemp());
        inParams.put("P_PCLDEL", aa2tprcl.getPcldel());
        inParams.put("P_PCLCLA", aa2tprcl.getPclcla());
        inParams.put("P_PCLNOM", aa2tprcl.getPclnom());
        inParams.put("P_PCLCTA", aa2tprcl.getPclcta());

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
