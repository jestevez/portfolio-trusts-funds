/*
 * ReadAa2balsiProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2balsi;

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

import ve.com.sios.gpff.beans.Aa2balsi;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class ReadAa2balsiProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 03/03/2014
 */
@Service
public class ReadAa2balsiProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2balsi";

    /**
     * Instantiates a new read aa 2 balsi procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2balsiProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_BSIEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_BSIDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_BSICTR", Types.INTEGER));
        declareParameter(new SqlParameter("P_BSIAP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_BSIDIV", Types.INTEGER));
        declareParameter(new SqlParameter("P_BSICTA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_BSITEX", Types.VARCHAR));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new Aa2balsiMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2balsi the aa 2 balsi
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Aa2balsi aa2balsi, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2balsi == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_BSIEMP", aa2balsi.getBsiemp());
        inParams.put("P_BSIDEL", aa2balsi.getBsidel());
        inParams.put("P_BSICTR", aa2balsi.getBsictr());
        inParams.put("P_BSIAP", aa2balsi.getBsiap());
        inParams.put("P_BSIDIV", aa2balsi.getBsidiv());
        inParams.put("P_BSICTA", aa2balsi.getBsicta());
        inParams.put("P_BSITEX", aa2balsi.getBsitex());

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
            
            throw new GpffDaoException(e);
        }
    }

}

class Aa2balsiMapper implements RowMapper<Aa2balsi> {

    public Aa2balsi mapRow(ResultSet rs, int i) throws SQLException {
        Aa2balsi aa2balsi = new Aa2balsi();
        aa2balsi.setBsiemp(rs.getString("BSIEMP"));
        aa2balsi.setBsidel(rs.getString("BSIDEL"));
        aa2balsi.setBsictr(rs.getInt("BSICTR"));
        aa2balsi.setBsiap(rs.getString("BSIAP"));
        aa2balsi.setBsidiv(rs.getInt("BSIDIV"));
        aa2balsi.setBsicta(rs.getString("BSICTA"));
        aa2balsi.setBsitex(rs.getString("BSITEX"));

        return aa2balsi;
    }
}
