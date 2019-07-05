/*
 * CountAa2tbderProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2tbder;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2tbder;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class CountAa2tbderProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 03/03/2014
 */
@Service
public class CountAa2tbderProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCountAa2tbder";

    /**
     * Instantiates a new count aa 2 tbder procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CountAa2tbderProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_TCAULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_TCAMX1", Types.DOUBLE));
        declareParameter(new SqlParameter("P_TCAVL1", Types.DOUBLE));
        declareParameter(new SqlParameter("P_TCAPR1", Types.DOUBLE));
        declareParameter(new SqlParameter("P_TCAVL2", Types.DOUBLE));
        declareParameter(new SqlParameter("P_TCAPR2", Types.DOUBLE));
        declareParameter(new SqlParameter("P_TCAVL3", Types.DOUBLE));
        declareParameter(new SqlParameter("P_TCAPR3", Types.DOUBLE));
        declareParameter(new SqlParameter("P_TCAVL4", Types.DOUBLE));
        declareParameter(new SqlParameter("P_TCAPR4", Types.DOUBLE));
        declareParameter(new SqlParameter("P_TCAFEC", Types.INTEGER));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("TOTAL", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2tbder the aa 2 tbder
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Aa2tbder aa2tbder, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2tbder == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_TCAULT", aa2tbder.getTCAULT());
        inParams.put("P_TCAMX1", aa2tbder.getTCAMX1());
        inParams.put("P_TCAVL1", aa2tbder.getTCAVL1());
        inParams.put("P_TCAPR1", aa2tbder.getTCAPR1());
        inParams.put("P_TCAVL2", aa2tbder.getTCAVL2());
        inParams.put("P_TCAPR2", aa2tbder.getTCAPR2());
        inParams.put("P_TCAVL3", aa2tbder.getTCAVL3());
        inParams.put("P_TCAPR3", aa2tbder.getTCAPR3());
        inParams.put("P_TCAVL4", aa2tbder.getTCAVL4());
        inParams.put("P_TCAPR4", aa2tbder.getTCAPR4());
        inParams.put("P_TCAFEC", aa2tbder.getTCAFEC());

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
