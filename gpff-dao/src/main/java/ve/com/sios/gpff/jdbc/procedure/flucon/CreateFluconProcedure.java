/*
 * CreateFluconProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.flucon;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;
import ve.com.sios.gpff.beans.Flucon;

/**
 * The Class CreateFluconProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 13/02/2014
 */
@Service
public class CreateFluconProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCreateFlucon";

    /**
     * Instantiates a new creates the flucon procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CreateFluconProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_FLCEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FLCDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FLCCLI", Types.INTEGER));
        declareParameter(new SqlParameter("P_FLCTIP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FLCCON", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FLCHOR", Types.INTEGER));
        declareParameter(new SqlParameter("P_FLCPAN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FLCUSU", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_FLCCOD", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param flucon the flucon
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Flucon flucon, AuthorizationData authorizationData) throws GpffDaoException {

        if (flucon == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_FLCEMP", flucon.getFlcemp());
        inParams.put("P_FLCDEL", flucon.getFlcdel());
        inParams.put("P_FLCCLI", flucon.getFlccli());
        inParams.put("P_FLCTIP", flucon.getFlctip());
        inParams.put("P_FLCCON", flucon.getFlccon());
        inParams.put("P_FLCHOR", flucon.getFlchor());
        inParams.put("P_FLCPAN", flucon.getFlcpan());
        inParams.put("P_FLCUSU", flucon.getFlcusu());
        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Integer) maps.get("P_FLCCOD");
        } catch (Exception e) {
            
            throw new GpffDaoException(e);
        }
    }

}
