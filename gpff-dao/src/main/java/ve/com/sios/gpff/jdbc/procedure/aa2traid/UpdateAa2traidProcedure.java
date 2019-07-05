/*
 * UpdateAa2traidProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2traid;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2traid;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class UpdateAa2traidProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 21/02/2014
 */
@Service
public class UpdateAa2traidProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procUpdateAa2traid";

    /**
     * Instantiates a new update aa 2 traid procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public UpdateAa2traidProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_TRAEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_TRADEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_TRACLA", Types.INTEGER));
        declareParameter(new SqlParameter("P_TRANOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_TRAMAX", Types.DOUBLE));
        declareParameter(new SqlParameter("P_TRAUTI", Types.DOUBLE));
        declareParameter(new SqlParameter("P_TRAUFE", Types.INTEGER));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_MSGCODE", Types.INTEGER));
        compile();
    }

    /**
     * Execute.
     *
     * @param aa2traid the aa 2 traid
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Aa2traid aa2traid, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2traid == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_TRAEMP", aa2traid.getTraemp());
        inParams.put("P_TRADEL", aa2traid.getTradel());
        inParams.put("P_TRACLA", aa2traid.getTracla());
        inParams.put("P_TRANOM", aa2traid.getTranom());
        inParams.put("P_TRAMAX", aa2traid.getTramax());
        inParams.put("P_TRAUTI", aa2traid.getTrauti());
        inParams.put("P_TRAUFE", aa2traid.getTraufe());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Integer) maps.get("P_MSGCODE");
        } catch (Exception e) {
            
            throw new GpffDaoException(e);
        }
    }

}