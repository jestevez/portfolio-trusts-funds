/*
 * ReadAa2tconcProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2tconc;

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

import ve.com.sios.gpff.beans.Aa2tconc;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class ReadAa2tconcProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 07/03/2014
 */
@Service
public class ReadAa2tconcProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2tconc";

    /**
     * Instantiates a new read aa 2 tconc procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2tconcProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_CONEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CONDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CONCLA", Types.BIGINT));
        declareParameter(new SqlParameter("P_CONNOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CONDIA", Types.INTEGER));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new Aa2tconcMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2tconc the aa 2 tconc
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws Exception the exception
     */
    public List execute(Aa2tconc aa2tconc, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws Exception {

        if (aa2tconc == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_CONEMP", aa2tconc.getConemp());
        inParams.put("P_CONDEL", aa2tconc.getCondel());
        inParams.put("P_CONCLA", aa2tconc.getConcla());
        inParams.put("P_CONNOM", aa2tconc.getConnom());
        inParams.put("P_CONDIA", aa2tconc.getCondia());

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

class Aa2tconcMapper implements RowMapper<Aa2tconc> {

    public Aa2tconc mapRow(ResultSet rs, int i) throws SQLException {
        Aa2tconc aa2tconc = new Aa2tconc();
        aa2tconc.setConemp(rs.getString("CONEMP"));
        aa2tconc.setCondel(rs.getString("CONDEL"));
        aa2tconc.setConcla(rs.getLong("CONCLA"));
        aa2tconc.setConnom(rs.getString("CONNOM"));
        aa2tconc.setCondia(rs.getInt("CONDIA"));

        return aa2tconc;
    }
}
