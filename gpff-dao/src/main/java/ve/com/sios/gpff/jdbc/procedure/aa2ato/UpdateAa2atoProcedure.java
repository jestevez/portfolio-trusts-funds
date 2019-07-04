/*
 * UpdateAa2atoProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2ato;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2ato;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class UpdateAa2atoProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 11/03/2014
 */
@Service
public class UpdateAa2atoProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procUpdateAa2ato";

    /**
     * Instantiates a new update aa 2 ato procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public UpdateAa2atoProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);
        declareParameter(new SqlParameter("P_ROWID", Types.BIGINT));
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
     * @param aa2ato the aa 2 ato
     * @param authorizationData the authorization data
     * @return the int
     * @throws Exception the exception
     */
    public int execute(Aa2ato aa2ato, AuthorizationData authorizationData) throws Exception {

        if (aa2ato == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", aa2ato.getRowid());
        inParams.put("P_ATOEMP", aa2ato.getAtoemp());
        inParams.put("P_ATODEL", aa2ato.getAtodel());
        inParams.put("P_ATOFEC", aa2ato.getAtofec());
        inParams.put("P_ATODTO", aa2ato.getAtodto());
        inParams.put("P_ATONRO", aa2ato.getAtonro());
        inParams.put("P_ATODIV", aa2ato.getAtodiv());
        inParams.put("P_ATOCTA", aa2ato.getAtocta());
        inParams.put("P_ATOIMD", aa2ato.getAtoimd());
        inParams.put("P_ATOIMP", aa2ato.getAtoimp());
        inParams.put("P_ATOCON", aa2ato.getAtocon());
        inParams.put("P_ATOVAL", aa2ato.getAtoval());
        inParams.put("P_ATODH", aa2ato.getAtodh());
        inParams.put("P_ATOFCO", aa2ato.getAtofco());
        inParams.put("P_ATOMAT", aa2ato.getAtomat());
        inParams.put("P_ATOBAJ", aa2ato.getAtobaj());
        inParams.put("P_ATOUSU", aa2ato.getAtousu());
        inParams.put("P_ATOCLI", aa2ato.getAtocli());
        inParams.put("P_ATOCOY", aa2ato.getAtocoy());
        inParams.put("P_ATOVAY", aa2ato.getAtovay());
        inParams.put("P_ATORE1", aa2ato.getAtore1());
        inParams.put("P_ATORE2", aa2ato.getAtore2());
        inParams.put("P_ATODPR", aa2ato.getAtodpr());
        inParams.put("P_ATOBVI", aa2ato.getAtobvi());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Integer) maps.get("P_MSGCODE");
        } catch (Exception e) {
            logger.error("Error invocando el metodo execute: ", e);
            throw e;
        }
    }

}
