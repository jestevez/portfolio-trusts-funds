/*
 * ReadTabsdbProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.tabsdb;

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
import ve.com.sios.gpff.beans.Tabsdb;

/**
 * The Class ReadTabsdbProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 19/02/2014
 */
@Service
public class ReadTabsdbProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadTabsdb";

    /**
     * Instantiates a new read tabsdb procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadTabsdbProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_TSBMOD", Types.VARCHAR));
        declareParameter(new SqlParameter("P_TSBDIN", Types.INTEGER));
        declareParameter(new SqlParameter("P_TSBTIN", Types.INTEGER));
        declareParameter(new SqlParameter("P_TSBCIN", Types.INTEGER));
        declareParameter(new SqlParameter("P_TSBNSI", Types.INTEGER));
        declareParameter(new SqlParameter("P_TSBCRE", Types.INTEGER));
        declareParameter(new SqlParameter("P_TSBIDI", Types.INTEGER));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new TabsdbMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param tabsdb the tabsdb
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws Exception the exception
     */
    public List execute(Tabsdb tabsdb, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws Exception {

        if (tabsdb == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_TSBMOD", tabsdb.getTsbmod());
        inParams.put("P_TSBDIN", tabsdb.getTsbdin());
        inParams.put("P_TSBTIN", tabsdb.getTsbtin());
        inParams.put("P_TSBCIN", tabsdb.getTsbcin());
        inParams.put("P_TSBNSI", tabsdb.getTsbnsi());
        inParams.put("P_TSBCRE", tabsdb.getTsbcre());
        inParams.put("P_TSBIDI", tabsdb.getTsbidi());

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

class TabsdbMapper implements RowMapper<Tabsdb> {

    public Tabsdb mapRow(ResultSet rs, int i) throws SQLException {
        Tabsdb tabsdb = new Tabsdb();
        tabsdb.setTsbmod(rs.getString("TSBMOD"));
        tabsdb.setTsbdin(rs.getInt("TSBDIN"));
        tabsdb.setTsbtin(rs.getInt("TSBTIN"));
        tabsdb.setTsbcin(rs.getInt("TSBCIN"));
        tabsdb.setTsbnsi(rs.getInt("TSBNSI"));
        tabsdb.setTsbcre(rs.getInt("TSBCRE"));
        tabsdb.setTsbidi(rs.getInt("TSBIDI"));

        return tabsdb;
    }
}
