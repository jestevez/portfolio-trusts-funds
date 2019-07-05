/*
 * CreateAa2cocorProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2cocor;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2cocor;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class CreateAa2cocorProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 13/03/2014
 */
@Service
public class CreateAa2cocorProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCreateAa2cocor";

    /**
     * Instantiates a new creates the aa 2 cocor procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CreateAa2cocorProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_CODCOR", Types.INTEGER));
        declareParameter(new SqlParameter("P_CODARE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CODNOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CODUSU", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CODPAN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CODFEC", Types.INTEGER));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_CODCOR_O", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2cocor the aa 2 cocor
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Aa2cocor aa2cocor, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2cocor == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_CODCOR", aa2cocor.getCodcor());
        inParams.put("P_CODARE", aa2cocor.getCodare());
        inParams.put("P_CODNOM", aa2cocor.getCodnom());
        inParams.put("P_CODUSU", aa2cocor.getCodusu());
        inParams.put("P_CODPAN", aa2cocor.getCodpan());
        inParams.put("P_CODFEC", aa2cocor.getCodfec());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Integer) maps.get("P_CODCOR_O");
        } catch (Exception e) {
            
            throw new GpffDaoException(e);
        }
    }

}