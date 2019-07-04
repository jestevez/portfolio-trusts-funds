/*
 * ReadAa2traidProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2traid;

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

import ve.com.sios.gpff.beans.Aa2traid;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class ReadAa2traidProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 21/02/2014
 */
@Service
public class ReadAa2traidProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2traid";

    /**
     * Instantiates a new read aa 2 traid procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2traidProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_TRAEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_TRADEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_TRACLA", Types.INTEGER));
        declareParameter(new SqlParameter("P_TRANOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_TRAMAX", Types.DOUBLE));
        declareParameter(new SqlParameter("P_TRAUTI", Types.DOUBLE));
        declareParameter(new SqlParameter("P_TRAUFE", Types.INTEGER));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new Aa2traidMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2traid the aa 2 traid
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws Exception the exception
     */
    public List execute(Aa2traid aa2traid, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws Exception {

        if (aa2traid == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_TRAEMP", aa2traid.getTraemp());
        inParams.put("P_TRADEL", aa2traid.getTradel());
        inParams.put("P_TRACLA", aa2traid.getTracla());
        inParams.put("P_TRANOM", aa2traid.getTranom());
        inParams.put("P_TRAMAX", aa2traid.getTramax());
        inParams.put("P_TRAUTI", aa2traid.getTrauti());
        inParams.put("P_TRAUFE", aa2traid.getTraufe());

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

class Aa2traidMapper implements RowMapper<Aa2traid> {

    public Aa2traid mapRow(ResultSet rs, int i) throws SQLException {
        Aa2traid aa2traid = new Aa2traid();
        aa2traid.setTraemp(rs.getString("TRAEMP"));
        aa2traid.setTradel(rs.getString("TRADEL"));
        aa2traid.setTracla(rs.getLong("TRACLA"));
        aa2traid.setTranom(rs.getString("TRANOM"));
        aa2traid.setTramax(rs.getDouble("TRAMAX"));
        aa2traid.setTrauti(rs.getDouble("TRAUTI"));
        aa2traid.setTraufe(rs.getInt("TRAUFE"));

        return aa2traid;
    }
}
