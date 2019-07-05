/*
 * CreateAa2tpaisProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2tpais;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2tpais;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class CreateAa2tpaisProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 17/02/2014
 */
@Service
public class CreateAa2tpaisProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCreateAa2tpais";

    /**
     * Instantiates a new creates the aa 2 tpais procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CreateAa2tpaisProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);
        declareParameter(new SqlParameter("P_PAICLA", Types.BIGINT));
        declareParameter(new SqlParameter("P_PAINOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PAICTR", Types.INTEGER));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_PAICLA_O", Types.BIGINT));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2tpais the aa 2 tpais
     * @param authorizationData the authorization data
     * @return the long
     * @throws GpffDaoException the exception
     */
    public Long execute(Aa2tpais aa2tpais, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2tpais == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_PAICLA", aa2tpais.getPaicla());
        inParams.put("P_PAINOM", aa2tpais.getPainom());
        inParams.put("P_PAICTR", aa2tpais.getPaictr());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Long) maps.get("P_PAICLA_O");
        } catch (Exception e) {
            
            throw new GpffDaoException(e);
        }
    }

}
