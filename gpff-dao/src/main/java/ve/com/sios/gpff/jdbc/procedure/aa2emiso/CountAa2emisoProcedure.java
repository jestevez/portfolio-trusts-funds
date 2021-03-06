/*
 * CountAa2emisoProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2emiso;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2emiso;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class CountAa2emisoProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 13/03/2014
 */
@Service
public class CountAa2emisoProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCountAa2emiso";

    /**
     * Instantiates a new count aa 2 emiso procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CountAa2emisoProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_EMIEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_EMIDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_EMICLA", Types.BIGINT));
        declareParameter(new SqlParameter("P_EMINOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_EMIMAX", Types.DOUBLE));
        declareParameter(new SqlParameter("P_EMIUTI", Types.BIGINT));
        declareParameter(new SqlParameter("P_EMIUFE", Types.BIGINT));
        declareParameter(new SqlParameter("P_EMITIP", Types.INTEGER));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("TOTAL", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2emiso the aa 2 emiso
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Aa2emiso aa2emiso, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2emiso == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_EMIEMP", aa2emiso.getEmiemp());
        inParams.put("P_EMIDEL", aa2emiso.getEmidel());
        inParams.put("P_EMICLA", aa2emiso.getEmicla());
        inParams.put("P_EMINOM", aa2emiso.getEminom());
        inParams.put("P_EMIMAX", aa2emiso.getEnimax());
        inParams.put("P_EMIUTI", aa2emiso.getEmiuti());
        inParams.put("P_EMIUFE", aa2emiso.getEmiufe());
        inParams.put("P_EMITIP", aa2emiso.getEmitip());

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
