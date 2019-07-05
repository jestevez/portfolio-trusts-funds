/*
 * CreateAa2modalProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2modal;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2modal;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class CreateAa2modalProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 20/02/2014
 */
@Service
public class CreateAa2modalProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCreateAa2modal";

    /**
     * Instantiates a new creates the aa 2 modal procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CreateAa2modalProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);
        declareParameter(new SqlParameter("P_MODCLA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_MODASO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_MODNOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_MODNAS", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_MODCLA_O", Types.VARCHAR));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2modal the aa 2 modal
     * @param authorizationData the authorization data
     * @return the string
     * @throws GpffDaoException the exception
     */
    public String execute(Aa2modal aa2modal, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2modal == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_MODCLA", aa2modal.getModcla());
        inParams.put("P_MODASO", aa2modal.getModaso());
        inParams.put("P_MODNOM", aa2modal.getModnom());
        inParams.put("P_MODNAS", aa2modal.getModnas());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return aa2modal.getModcla();
        } catch (Exception e) {
            
            throw new GpffDaoException(e);
        }
    }

}