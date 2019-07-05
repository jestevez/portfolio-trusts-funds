/*
 * CreateEmbargosProcedure.java
 *
 * Copyright 2014 - Soluciones Integrales Open-Source SiOS
 * Copyright 2014 - Fundación para la Investigación y Desarrollo del Software Libre en Venezuela
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
package ve.com.sios.gpff.jdbc.procedure.embargos;

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
import ve.com.sios.gpff.beans.Embargos;

/**
 * The Class CreateEmbargosProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 07/05/2014
 */
@Service
public class CreateEmbargosProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCreateEmbargos";

    /**
     * Instantiates a new creates the embargos procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CreateEmbargosProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_EEMPRE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_EDELEG", Types.VARCHAR));
        declareParameter(new SqlParameter("P_EMOVNI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_EMONTO", Types.DOUBLE));
        declareParameter(new SqlParameter("P_EMONTT", Types.DOUBLE));
        declareParameter(new SqlParameter("P_EFECHA", Types.BIGINT));
        declareParameter(new SqlParameter("P_EFECHF", Types.BIGINT));
        declareParameter(new SqlParameter("P_EUSUAR", Types.VARCHAR));
        declareParameter(new SqlParameter("P_EPANTA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_EFECMO", Types.BIGINT));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("P_MSGCODE", Types.INTEGER));
        compile();
    }

    /**
     * Execute.
     *
     * @param embargos the embargos
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Embargos embargos, AuthorizationData authorizationData) throws GpffDaoException {

        if (embargos == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_EEMPRE", embargos.getEempre());
        inParams.put("P_EDELEG", embargos.getEdeleg());
        inParams.put("P_EMOVNI", embargos.getEmovni());
        inParams.put("P_EMONTO", embargos.getEmonto());
        inParams.put("P_EMONTT", embargos.getEmontt());
        inParams.put("P_EFECHA", embargos.getEfecha());
        inParams.put("P_EFECHF", embargos.getEfechf());
        inParams.put("P_EUSUAR", embargos.getEusuar());
        inParams.put("P_EPANTA", embargos.getEpanta());
        inParams.put("P_EFECMO", embargos.getEfecmo());

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
