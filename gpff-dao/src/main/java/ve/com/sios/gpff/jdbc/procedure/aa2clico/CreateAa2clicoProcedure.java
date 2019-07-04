/*
 * CreateAa2clicoProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2clico;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2clico;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class CreateAa2clicoProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 05/04/2014
 */
@Service
public class CreateAa2clicoProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCreateAa2clico";

    /**
     * Instantiates a new creates the aa 2 clico procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CreateAa2clicoProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_CLCCLA", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLCCTR", Types.INTEGER));
        declareParameter(new SqlParameter("P_CLCNOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLCAPE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLCAP2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLCDI1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLCDI2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLCPOS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLCPRO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLCPAI", Types.INTEGER));
        declareParameter(new SqlParameter("P_CLCPOB", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLCCAL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLCNUM", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLCANA", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLCTID", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLCNIF", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLCTEL", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLCUSU", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("P_MSGCODE", Types.INTEGER));
        compile();
    }

    /**
     * Execute.
     *
     * @param aa2clico the aa 2 clico
     * @param authorizationData the authorization data
     * @return the int
     * @throws Exception the exception
     */
    public int execute(Aa2clico aa2clico, AuthorizationData authorizationData) throws Exception {

        if (aa2clico == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_CLCCLA", aa2clico.getClccla());
        inParams.put("P_CLCCTR", aa2clico.getClcctr());
        inParams.put("P_CLCNOM", aa2clico.getClcnom());
        inParams.put("P_CLCAPE", aa2clico.getClcape());
        inParams.put("P_CLCAP2", aa2clico.getClcap2());
        inParams.put("P_CLCDI1", aa2clico.getClcdi1());
        inParams.put("P_CLCDI2", aa2clico.getClcdi2());
        inParams.put("P_CLCPOS", aa2clico.getClcpos());
        inParams.put("P_CLCPRO", aa2clico.getClcpro());
        inParams.put("P_CLCPAI", aa2clico.getClcpai());
        inParams.put("P_CLCPOB", aa2clico.getClcpob());
        inParams.put("P_CLCCAL", aa2clico.getClccal());
        inParams.put("P_CLCNUM", aa2clico.getClcnum());
        inParams.put("P_CLCANA", aa2clico.getClcana());
        inParams.put("P_CLCTID", aa2clico.getClctid());
        inParams.put("P_CLCNIF", aa2clico.getClcnif());
        inParams.put("P_CLCTEL", aa2clico.getClctel());
        inParams.put("P_CLCUSU", aa2clico.getClcusu());

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
