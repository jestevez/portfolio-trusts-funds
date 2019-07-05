/*
 * CreateSplfileProcedure.java
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
import org.springframework.jdbc.core.support.SqlLobValue;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;
import ve.com.sios.gpff.beans.Splfile;

/**
 * The Class CreateSplfileProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 10/02/2014
 */
@Service
public class CreateSplfileProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCreateSplfile";

    /**
     * Instantiates a new creates the splfile procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CreateSplfileProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

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
        declareParameter(new SqlOutParameter("P_ID", Types.BIGINT));

        compile();
    }

    /**
     * Execute.
     *
     * @param splfile the splfile
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Splfile splfile, AuthorizationData authorizationData) throws GpffDaoException {

        if (splfile == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        LobHandler lobHandler = new DefaultLobHandler();

        // inParams.put("P_SPLDATA", splfile.getSpldata());
        inParams.put("P_SPLNAME", splfile.getSplname());
        inParams.put("P_SPLMIME", splfile.getSplmime());
        inParams.put("P_SPLDATE", splfile.getSpldate());
        inParams.put("P_SPLTYPE", splfile.getSpltype());
        inParams.put("P_SPLUSER", splfile.getSpluser());
        inParams.put("P_SPLSTATUS", splfile.getSplstatus());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());

        inParams.put("P_SPLDATA",
                splfile.getSpldata() != null && splfile.getSpldata().length > 0 ? new SqlLobValue(splfile.getSpldata(), lobHandler) : null);

        try {
            Map<String, Object> maps = super.execute(inParams);

            return (maps.get("P_ID") != null ? ((Long) maps.get("P_ID")).intValue() : 0);
        } catch (Exception e) {
            
            throw new GpffDaoException(e);
        }
    }
}