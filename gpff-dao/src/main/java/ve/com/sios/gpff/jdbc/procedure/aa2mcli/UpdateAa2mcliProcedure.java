/*
 * UpdateAa2mcliProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2mcli;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2mcli;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class UpdateAa2mcliProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 17/02/2014
 */
@Service
public class UpdateAa2mcliProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procUpdateAa2mcli";

    /**
     * Instantiates a new update aa 2 mcli procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public UpdateAa2mcliProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_CLIEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLICLA", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLINIF", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIASO", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLIANA", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLINOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIAPE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIAP2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLICAL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIDI1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIDI2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIPOS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIPRO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIPAI", Types.INTEGER));
        declareParameter(new SqlParameter("P_CLIPOB", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIGES", Types.INTEGER));
        declareParameter(new SqlParameter("P_CLITC1", Types.INTEGER));
        declareParameter(new SqlParameter("P_CLICLS", Types.INTEGER));
        declareParameter(new SqlParameter("P_CLISEX", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLITEL", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLITE2", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLITE3", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLIFAX", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIFA2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIFA3", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLITC2", Types.INTEGER));
        declareParameter(new SqlParameter("P_CLIRES", Types.INTEGER));
        declareParameter(new SqlParameter("P_CLICOR", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLITCO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIEXC", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIOBS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIREG", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIOCU", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIGRU", Types.INTEGER));
        declareParameter(new SqlParameter("P_CLIPAS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIORD", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLINUM", Types.INTEGER));
        declareParameter(new SqlParameter("P_CLICRE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLITID", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLINAC", Types.INTEGER));
        declareParameter(new SqlParameter("P_CLIMEF", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIESC", Types.INTEGER));
        declareParameter(new SqlParameter("P_CLIGID", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIDPR", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIDAT", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLIVOZ", Types.INTEGER));
        declareParameter(new SqlParameter("P_CLIDPD", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CLIFEA", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLIFEB", Types.BIGINT));
        declareParameter(new SqlParameter("P_CLIUSU", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_MSGCODE", Types.INTEGER));
        compile();
    }

    /**
     * Execute.
     *
     * @param aa2mcli the aa 2 mcli
     * @param authorizationData the authorization data
     * @return the int
     * @throws Exception the exception
     */
    public int execute(Aa2mcli aa2mcli, AuthorizationData authorizationData) throws Exception {

        if (aa2mcli == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_CLIEMP", aa2mcli.getCliemp());
        inParams.put("P_CLIDEL", aa2mcli.getClidel());
        inParams.put("P_CLICLA", aa2mcli.getClicla());
        inParams.put("P_CLINIF", aa2mcli.getClinif());
        inParams.put("P_CLIASO", aa2mcli.getCliaso());
        inParams.put("P_CLIANA", aa2mcli.getCliana());
        inParams.put("P_CLINOM", aa2mcli.getClinom());
        inParams.put("P_CLIAPE", aa2mcli.getCliape());
        inParams.put("P_CLIAP2", aa2mcli.getCliap2());
        inParams.put("P_CLICAL", aa2mcli.getClical());
        inParams.put("P_CLIDI1", aa2mcli.getClidi1());
        inParams.put("P_CLIDI2", aa2mcli.getClidi2());
        inParams.put("P_CLIPOS", aa2mcli.getClipos());
        inParams.put("P_CLIPRO", aa2mcli.getClipro());
        inParams.put("P_CLIPAI", aa2mcli.getClipai());
        inParams.put("P_CLIPOB", aa2mcli.getClipob());
        inParams.put("P_CLIGES", aa2mcli.getCliges());
        inParams.put("P_CLITC1", aa2mcli.getClitc1());
        inParams.put("P_CLICLS", aa2mcli.getClicls());
        inParams.put("P_CLISEX", aa2mcli.getClisex());
        inParams.put("P_CLITEL", aa2mcli.getClitel());
        inParams.put("P_CLITE2", aa2mcli.getClite2());
        inParams.put("P_CLITE3", aa2mcli.getClite3());
        inParams.put("P_CLIFAX", aa2mcli.getClifax());
        inParams.put("P_CLIFA2", aa2mcli.getClifa2());
        inParams.put("P_CLIFA3", aa2mcli.getClifa3());
        inParams.put("P_CLITC2", aa2mcli.getClitc2());
        inParams.put("P_CLIRES", aa2mcli.getClires());
        inParams.put("P_CLICOR", aa2mcli.getClicor());
        inParams.put("P_CLITCO", aa2mcli.getClitco());
        inParams.put("P_CLIEXC", aa2mcli.getCliexc());
        inParams.put("P_CLIOBS", aa2mcli.getCliobs());
        inParams.put("P_CLIREG", aa2mcli.getClireg());
        inParams.put("P_CLIOCU", aa2mcli.getCliocu());
        inParams.put("P_CLIGRU", aa2mcli.getCligru());
        inParams.put("P_CLIPAS", aa2mcli.getClipas());
        inParams.put("P_CLIORD", aa2mcli.getCliord());
        inParams.put("P_CLINUM", aa2mcli.getClinum());
        inParams.put("P_CLICRE", aa2mcli.getClicre());
        inParams.put("P_CLITID", aa2mcli.getClitid());
        inParams.put("P_CLINAC", aa2mcli.getClinac());
        inParams.put("P_CLIMEF", aa2mcli.getClimef());
        inParams.put("P_CLIESC", aa2mcli.getCliesc());
        inParams.put("P_CLIGID", aa2mcli.getCligid());
        inParams.put("P_CLIDPR", aa2mcli.getClidpr());
        inParams.put("P_CLIDAT", aa2mcli.getClidat());
        inParams.put("P_CLIVOZ", aa2mcli.getClivoz());
        inParams.put("P_CLIDPD", aa2mcli.getClidpd());
        inParams.put("P_CLIFEA", aa2mcli.getClifea());
        inParams.put("P_CLIFEB", aa2mcli.getClifeb());
        inParams.put("P_CLIUSU", aa2mcli.getCliusu());

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
