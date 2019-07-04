/*
 * CountSplfileProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.splfile;

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
import ve.com.sios.gpff.beans.Splfile;

/**
 * The Class CountSplfileProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 10/02/2014
 */
@Service
public class CountSplfileProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCountSplfile";

    /**
     * Instantiates a new count splfile procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CountSplfileProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ID", Types.BIGINT));
        declareParameter(new SqlParameter("P_SPLDATA", Types.BLOB));
        declareParameter(new SqlParameter("P_SPLNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_SPLMIME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_SPLDATE", Types.TIMESTAMP));
        declareParameter(new SqlParameter("P_SPLTYPE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_SPLUSER", Types.VARCHAR));
        declareParameter(new SqlParameter("P_SPLSTATUS", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("TOTAL", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param splfile the splfile
     * @param authorizationData the authorization data
     * @return the int
     * @throws Exception the exception
     */
    public int execute(Splfile splfile, AuthorizationData authorizationData) throws Exception {

        if (splfile == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ID", splfile.getId());
        inParams.put("P_SPLDATA", splfile.getSpldata());
        inParams.put("P_SPLNAME", splfile.getSplname());
        inParams.put("P_SPLMIME", splfile.getSplmime());
        inParams.put("P_SPLDATE", splfile.getSpldate());
        inParams.put("P_SPLTYPE", splfile.getSpltype());
        inParams.put("P_SPLUSER", splfile.getSpluser());
        inParams.put("P_SPLSTATUS", splfile.getSplstatus());

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
