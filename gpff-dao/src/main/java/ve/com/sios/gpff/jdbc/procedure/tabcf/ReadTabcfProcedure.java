/*
 * ReadTabcfProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.tabcf;

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

import ve.com.sios.gpff.beans.AuthorizationData;
import ve.com.sios.gpff.beans.Tabcf;

/**
 * The Class ReadTabcfProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 31/03/2014
 */
@Service
public class ReadTabcfProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadTabcf";

    /**
     * Instantiates a new read tabcf procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadTabcfProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ROWID", Types.BIGINT));
        declareParameter(new SqlParameter("P_NTAB", Types.INTEGER));
        declareParameter(new SqlParameter("P_NOMTAB", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COMAEF", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMAPF", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMANF", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMMOF", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMCOF", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMMAF", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMMIF", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMPOL", Types.DOUBLE));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new TabcfMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param tabcf the tabcf
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws Exception the exception
     */
    public List execute(Tabcf tabcf, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws Exception {

        if (tabcf == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", tabcf.getRowid());
        inParams.put("P_NTAB", tabcf.getNtab());
        inParams.put("P_NOMTAB", tabcf.getNomtab());
        inParams.put("P_COMAEF", tabcf.getComaef());
        inParams.put("P_COMAPF", tabcf.getComapf());
        inParams.put("P_COMANF", tabcf.getComanf());
        inParams.put("P_COMMOF", tabcf.getCommof());
        inParams.put("P_COMCOF", tabcf.getComcof());
        inParams.put("P_COMMAF", tabcf.getCommaf());
        inParams.put("P_COMMIF", tabcf.getCommif());
        inParams.put("P_COMPOL", tabcf.getCompol());

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

class TabcfMapper implements RowMapper<Tabcf> {

    public Tabcf mapRow(ResultSet rs, int i) throws SQLException {
        Tabcf tabcf = new Tabcf();
        tabcf.setRowid(rs.getLong("ROWID"));
        tabcf.setNtab(rs.getInt("NTAB"));
        tabcf.setNomtab(rs.getString("NOMTAB"));
        tabcf.setComaef(rs.getBigDecimal("COMAEF"));
        tabcf.setComapf(rs.getBigDecimal("COMAPF"));
        tabcf.setComanf(rs.getBigDecimal("COMANF"));
        tabcf.setCommof(rs.getBigDecimal("COMMOF"));
        tabcf.setComcof(rs.getBigDecimal("COMCOF"));
        tabcf.setCommaf(rs.getBigDecimal("COMMAF"));
        tabcf.setCommif(rs.getBigDecimal("COMMIF"));
        tabcf.setCompol(rs.getBigDecimal("COMPOL"));

        return tabcf;
    }
}
