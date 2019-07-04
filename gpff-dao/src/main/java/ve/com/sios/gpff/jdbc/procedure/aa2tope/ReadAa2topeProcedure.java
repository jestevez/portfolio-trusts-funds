/*
 * ReadAa2topeProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2tope;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2tope;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class ReadAa2topeProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 07/03/2014
 */
@Service
public class ReadAa2topeProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2tope";

    /**
     * Instantiates a new read aa 2 tope procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2topeProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_OPECLA", Types.INTEGER));
        declareParameter(new SqlParameter("P_OPENOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_OPETIP", Types.INTEGER));
        declareParameter(new SqlParameter("P_OPESIG", Types.VARCHAR));
        declareParameter(new SqlParameter("P_OPEAUX", Types.VARCHAR));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new Aa2topeMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2tope the aa 2 tope
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws Exception the exception
     */
    public List execute(Aa2tope aa2tope, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws Exception {

        if (aa2tope == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_OPECLA", aa2tope.getOpecla());
        inParams.put("P_OPENOM", aa2tope.getOpenom());
        inParams.put("P_OPETIP", aa2tope.getOpetip());
        inParams.put("P_OPESIG", aa2tope.getOpesig());
        inParams.put("P_OPEAUX", aa2tope.getOpeaux());

        inParams.put("P_FIRSTRESULT", firstResult);
        inParams.put("P_MAXRESULT", maxResults);
        inParams.put("P_SORT", sortClause);
        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);
            for (Iterator it = maps.entrySet().iterator(); it.hasNext();) {
                list = (List) ((Map.Entry) it.next()).getValue();
            }
            return list;
        } catch (Exception e) {
            logger.error("Error invocando el metodo execute: ", e);
            throw e;
        }
    }

}

class Aa2topeMapper implements RowMapper<Aa2tope> {

    public Aa2tope mapRow(ResultSet rs, int i) throws SQLException {
        Aa2tope aa2tope = new Aa2tope();
        aa2tope.setOpecla(rs.getLong("OPECLA"));
        aa2tope.setOpenom(rs.getString("OPENOM"));
        aa2tope.setOpetip(rs.getInt("OPETIP"));
        aa2tope.setOpesig(rs.getString("OPESIG"));
        aa2tope.setOpeaux(rs.getString("OPEAUX"));

        return aa2tope;
    }
}
