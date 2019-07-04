/*
 * ReadAa2coopeProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2coope;

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

import ve.com.sios.gpff.beans.Aa2coope;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class ReadAa2coopeProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 10/03/2014
 */
@Service
public class ReadAa2coopeProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2coope";

    /**
     * Instantiates a new read aa 2 coope procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2coopeProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_COPEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPCLI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPOPE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPMOD", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPCTR", Types.INTEGER));
        declareParameter(new SqlParameter("P_COPCTA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPCON", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPIMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPDEH", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPFEC", Types.VARCHAR));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new Aa2coopeMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2coope the aa 2 coope
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws Exception the exception
     */
    public List execute(Aa2coope aa2coope, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws Exception {

        if (aa2coope == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_COPEMP", aa2coope.getCopemp());
        inParams.put("P_COPDEL", aa2coope.getCopdel());
        inParams.put("P_COPCLI", aa2coope.getCopcli());
        inParams.put("P_COPOPE", aa2coope.getCopope());
        inParams.put("P_COPMOD", aa2coope.getCopmod());
        inParams.put("P_COPCTR", aa2coope.getCopctr());
        inParams.put("P_COPCTA", aa2coope.getCopcta());
        inParams.put("P_COPCON", aa2coope.getCopcon());
        inParams.put("P_COPIMP", aa2coope.getCopimp());
        inParams.put("P_COPDEH", aa2coope.getCopdeh());
        inParams.put("P_COPFEC", aa2coope.getCopfec());

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

class Aa2coopeMapper implements RowMapper<Aa2coope> {

    public Aa2coope mapRow(ResultSet rs, int i) throws SQLException {
        Aa2coope aa2coope = new Aa2coope();
        aa2coope.setCopemp(rs.getString("COPEMP"));
        aa2coope.setCopdel(rs.getString("COPDEL"));
        aa2coope.setCopcli(rs.getString("COPCLI"));
        aa2coope.setCopope(rs.getString("COPOPE"));
        aa2coope.setCopmod(rs.getString("COPMOD"));
        aa2coope.setCopctr(rs.getInt("COPCTR"));
        aa2coope.setCopcta(rs.getString("COPCTA"));
        aa2coope.setCopcon(rs.getString("COPCON"));
        aa2coope.setCopimp(rs.getString("COPIMP"));
        aa2coope.setCopdeh(rs.getString("COPDEH"));
        aa2coope.setCopfec(rs.getString("COPFEC"));

        return aa2coope;
    }
}
