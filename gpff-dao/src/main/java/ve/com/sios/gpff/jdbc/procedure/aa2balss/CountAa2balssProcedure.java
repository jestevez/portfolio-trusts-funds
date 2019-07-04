/*
 * CountAa2balssProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2balss;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2balss;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class CountAa2balssProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 03/03/2014
 */
@Service
public class CountAa2balssProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCountAa2balss";

    /**
     * Instantiates a new count aa 2 balss procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CountAa2balssProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_BSIEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_BSIDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_BSICTR", Types.INTEGER));
        declareParameter(new SqlParameter("P_BSIAP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_BSIDIV", Types.INTEGER));
        declareParameter(new SqlParameter("P_BSICTA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_BSITEX", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("TOTAL", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2balss the aa 2 balss
     * @param authorizationData the authorization data
     * @return the int
     * @throws Exception the exception
     */
    public int execute(Aa2balss aa2balss, AuthorizationData authorizationData) throws Exception {

        if (aa2balss == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_BSIEMP", aa2balss.getBsiemp());
        inParams.put("P_BSIDEL", aa2balss.getBsidel());
        inParams.put("P_BSICTR", aa2balss.getBsictr());
        inParams.put("P_BSIAP", aa2balss.getBsiap());
        inParams.put("P_BSIDIV", aa2balss.getBsidiv());
        inParams.put("P_BSICTA", aa2balss.getBsicta());
        inParams.put("P_BSITEX", aa2balss.getBsitex());

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
