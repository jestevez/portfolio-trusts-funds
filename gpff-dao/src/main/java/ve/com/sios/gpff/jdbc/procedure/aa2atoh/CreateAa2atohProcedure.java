/*
 * CreateAa2atohProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2atoh;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2atoh;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class CreateAa2atohProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 13/03/2014
 */
@Service
public class CreateAa2atohProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCreateAa2atoh";

    /**
     * Instantiates a new creates the aa 2 atoh procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CreateAa2atohProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ATOEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATODEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATOFEC", Types.INTEGER));
        declareParameter(new SqlParameter("P_ATODTO", Types.INTEGER));
        declareParameter(new SqlParameter("P_ATONRO", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATODIV", Types.INTEGER));
        declareParameter(new SqlParameter("P_ATOCTA", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATOIMD", Types.DOUBLE));
        declareParameter(new SqlParameter("P_ATOIMP", Types.DOUBLE));
        declareParameter(new SqlParameter("P_ATOCON", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATOVAL", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATODH", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATOFCO", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATOMAT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATOBAJ", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATOUSU", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATOCLI", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATOCOY", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATOVAY", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATORE1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATORE2", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATODPR", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATOBVI", Types.BIGINT));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("P_MSGCODE", Types.INTEGER));
        compile();
    }

    /**
     * Execute.
     *
     * @param aa2atoh the aa 2 atoh
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Aa2atoh aa2atoh, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2atoh == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ATOEMP", aa2atoh.getAtoemp());
        inParams.put("P_ATODEL", aa2atoh.getAtodel());
        inParams.put("P_ATOFEC", aa2atoh.getAtofec());
        inParams.put("P_ATODTO", aa2atoh.getAtodto());
        inParams.put("P_ATONRO", aa2atoh.getAtonro());
        inParams.put("P_ATODIV", aa2atoh.getAtodiv());
        inParams.put("P_ATOCTA", aa2atoh.getAtocta());
        inParams.put("P_ATOIMD", aa2atoh.getAtoimd());
        inParams.put("P_ATOIMP", aa2atoh.getAtoimp());
        inParams.put("P_ATOCON", aa2atoh.getAtocon());
        inParams.put("P_ATOVAL", aa2atoh.getAtoval());
        inParams.put("P_ATODH", aa2atoh.getAtodh());
        inParams.put("P_ATOFCO", aa2atoh.getAtofco());
        inParams.put("P_ATOMAT", aa2atoh.getAtomat());
        inParams.put("P_ATOBAJ", aa2atoh.getAtobaj());
        inParams.put("P_ATOUSU", aa2atoh.getAtousu());
        inParams.put("P_ATOCLI", aa2atoh.getAtocli());
        inParams.put("P_ATOCOY", aa2atoh.getAtocoy());
        inParams.put("P_ATOVAY", aa2atoh.getAtovay());
        inParams.put("P_ATORE1", aa2atoh.getAtore1());
        inParams.put("P_ATORE2", aa2atoh.getAtore2());
        inParams.put("P_ATODPR", aa2atoh.getAtodpr());
        inParams.put("P_ATOBVI", aa2atoh.getAtobvi());

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
