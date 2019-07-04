/*
 * CountInversProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.invers;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.AuthorizationData;
import ve.com.sios.gpff.beans.Invers;

/**
 * The Class CountInversProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 23/03/2014
 */
@Service
public class CountInversProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCountInvers";

    /**
     * Instantiates a new count invers procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CountInversProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_INVEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INVDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INVCLI", Types.BIGINT));
        declareParameter(new SqlParameter("P_INVVAL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INVINT", Types.BIGINT));
        declareParameter(new SqlParameter("P_INVCLA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INVVEN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INVINE", Types.BIGINT));
        declareParameter(new SqlParameter("P_INVVTE", Types.BIGINT));
        declareParameter(new SqlParameter("P_INVPRE", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVINI", Types.BIGINT));
        declareParameter(new SqlParameter("P_INVINA", Types.BIGINT));
        declareParameter(new SqlParameter("P_INVVTO", Types.BIGINT));
        declareParameter(new SqlParameter("P_INVVTA", Types.BIGINT));
        declareParameter(new SqlParameter("P_INVEFI", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVEFF", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVPRC", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INV036", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INVTIT", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVPME", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVPIN", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVINF", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVRDE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INVLIS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INVANU", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INVSIR", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INVICO", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVNOP", Types.BIGINT));
        declareParameter(new SqlParameter("P_INVPER", Types.INTEGER));
        declareParameter(new SqlParameter("P_INVFDE", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVFUI", Types.BIGINT));
        declareParameter(new SqlParameter("P_INVNTI", Types.BIGINT));
        declareParameter(new SqlParameter("P_INVAPR", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVIBS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INVIGC", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVAGD", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVBVI", Types.BIGINT));
        declareParameter(new SqlParameter("P_INVMAR", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVTA1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INVTA2", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVIAN", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVBOL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INVIPP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INVVFV", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INVPRO", Types.INTEGER));
        declareParameter(new SqlParameter("P_INVPEN", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVPRX", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVVAC", Types.VARCHAR));
        declareParameter(new SqlParameter("P_INVNUC", Types.BIGINT));
        declareParameter(new SqlParameter("P_INVPOP", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVBAD", Types.INTEGER));
        declareParameter(new SqlParameter("P_INVVNO", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVLIQ", Types.BIGINT));
        declareParameter(new SqlParameter("P_INVRES", Types.DOUBLE));
        declareParameter(new SqlParameter("P_INVTIM", Types.DOUBLE));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("TOTAL", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param invers the invers
     * @param authorizationData the authorization data
     * @return the int
     * @throws Exception the exception
     */
    public int execute(Invers invers, AuthorizationData authorizationData) throws Exception {

        if (invers == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_INVEMP", invers.getInvemp());
        inParams.put("P_INVDEL", invers.getInvdel());
        inParams.put("P_INVCLI", invers.getInvcli());
        inParams.put("P_INVVAL", invers.getInvval());
        inParams.put("P_INVINT", invers.getInvint());
        inParams.put("P_INVCLA", invers.getInvcla());
        inParams.put("P_INVVEN", invers.getInvven());
        inParams.put("P_INVINE", invers.getInvine());
        inParams.put("P_INVVTE", invers.getInvvte());
        inParams.put("P_INVPRE", invers.getInvpre());
        inParams.put("P_INVINI", invers.getInvini());
        inParams.put("P_INVINA", invers.getInvina());
        inParams.put("P_INVVTO", invers.getInvvto());
        inParams.put("P_INVVTA", invers.getInvvta());
        inParams.put("P_INVEFI", invers.getInvefi());
        inParams.put("P_INVEFF", invers.getInveff());
        inParams.put("P_INVPRC", invers.getInvprc());
        inParams.put("P_INV036", invers.getInv036());
        inParams.put("P_INVTIT", invers.getInvtit());
        inParams.put("P_INVPME", invers.getInvpme());
        inParams.put("P_INVPIN", invers.getInvpin());
        inParams.put("P_INVINF", invers.getInvinf());
        inParams.put("P_INVRDE", invers.getInvrde());
        inParams.put("P_INVLIS", invers.getInvlis());
        inParams.put("P_INVANU", invers.getInvanu());
        inParams.put("P_INVSIR", invers.getInvsir());
        inParams.put("P_INVICO", invers.getInvico());
        inParams.put("P_INVNOP", invers.getInvnop());
        inParams.put("P_INVPER", invers.getInvper());
        inParams.put("P_INVFDE", invers.getInvfde());
        inParams.put("P_INVFUI", invers.getInvfui());
        inParams.put("P_INVNTI", invers.getInvnti());
        inParams.put("P_INVAPR", invers.getInvapr());
        inParams.put("P_INVIBS", invers.getInvibs());
        inParams.put("P_INVIGC", invers.getInvigc());
        inParams.put("P_INVAGD", invers.getInvagd());
        inParams.put("P_INVBVI", invers.getInvbvi());
        inParams.put("P_INVMAR", invers.getInvmar());
        inParams.put("P_INVTA1", invers.getInvta1());
        inParams.put("P_INVTA2", invers.getInvta2());
        inParams.put("P_INVIAN", invers.getInvian());
        inParams.put("P_INVBOL", invers.getInvbol());
        inParams.put("P_INVIPP", invers.getInvipp());
        inParams.put("P_INVVFV", invers.getInvvfv());
        inParams.put("P_INVPRO", invers.getInvpro());
        inParams.put("P_INVPEN", invers.getInvpen());
        inParams.put("P_INVPRX", invers.getInvprx());
        inParams.put("P_INVVAC", invers.getInvvac());
        inParams.put("P_INVNUC", invers.getInvnuc());
        inParams.put("P_INVPOP", invers.getInvpop());
        inParams.put("P_INVBAD", invers.getInvbad());
        inParams.put("P_INVVNO", invers.getInvvno());
        inParams.put("P_INVLIQ", invers.getInvliq());
        inParams.put("P_INVRES", invers.getInvres());
        inParams.put("P_INVTIM", invers.getInvtim());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Integer) maps.get("TOTAL");
        } catch (Exception e) {
            logger.error("Error invocando el metodo execute: ", e);
            throw e;
        }
    }

}
