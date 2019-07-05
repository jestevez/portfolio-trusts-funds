/*
 * CreateCupamortProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.cupamort;

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
import ve.com.sios.gpff.beans.Cupamort;

/**
 * The Class CreateCupamortProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 24/03/2014
 */
@Service
public class CreateCupamortProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCreateCupamort";

    /**
     * Instantiates a new creates the cupamort procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CreateCupamortProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_CUPEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CUPDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CUPTIP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CUPVAL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CUPFEC", Types.INTEGER));
        declareParameter(new SqlParameter("P_CUPMNT", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CUPIMP", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CUPCOB", Types.INTEGER));
        declareParameter(new SqlParameter("P_CUPVEN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CUPMCB", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CUPCBT", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("P_MSGCODE", Types.INTEGER));
        compile();
    }

    /**
     * Execute.
     *
     * @param cupamort the cupamort
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Cupamort cupamort, AuthorizationData authorizationData) throws GpffDaoException {

        if (cupamort == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_CUPEMP", cupamort.getCupemp());
        inParams.put("P_CUPDEL", cupamort.getCupdel());
        inParams.put("P_CUPTIP", cupamort.getCuptip());
        inParams.put("P_CUPVAL", cupamort.getCupval());
        inParams.put("P_CUPFEC", cupamort.getCupfec());
        inParams.put("P_CUPMNT", cupamort.getCupmnt());
        inParams.put("P_CUPIMP", cupamort.getCupimp());
        inParams.put("P_CUPCOB", cupamort.getCupcob());
        inParams.put("P_CUPVEN", cupamort.getCupven());
        inParams.put("P_CUPMCB", cupamort.getCupmcb());
        inParams.put("P_CUPCBT", cupamort.getCupcbt());

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
