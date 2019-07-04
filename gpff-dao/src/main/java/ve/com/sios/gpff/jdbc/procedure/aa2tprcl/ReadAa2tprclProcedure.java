/*
 * ReadAa2tprclProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2tprcl;

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

import ve.com.sios.gpff.beans.Aa2tprcl;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class ReadAa2tprclProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 31/03/2014
 */
@Service
public class ReadAa2tprclProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2tprcl";

    /**
     * Instantiates a new read aa 2 tprcl procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2tprclProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ROWID", Types.BIGINT));
        declareParameter(new SqlParameter("P_PCLEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PCLDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PCLCLA", Types.BIGINT));
        declareParameter(new SqlParameter("P_PCLNOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PCLCTA", Types.VARCHAR));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new Aa2tprclMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2tprcl the aa 2 tprcl
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws Exception the exception
     */
    public List execute(Aa2tprcl aa2tprcl, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws Exception {

        if (aa2tprcl == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", aa2tprcl.getRowid());
        inParams.put("P_PCLEMP", aa2tprcl.getPclemp());
        inParams.put("P_PCLDEL", aa2tprcl.getPcldel());
        inParams.put("P_PCLCLA", aa2tprcl.getPclcla());
        inParams.put("P_PCLNOM", aa2tprcl.getPclnom());
        inParams.put("P_PCLCTA", aa2tprcl.getPclcta());

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

class Aa2tprclMapper implements RowMapper<Aa2tprcl> {

    public Aa2tprcl mapRow(ResultSet rs, int i) throws SQLException {
        Aa2tprcl aa2tprcl = new Aa2tprcl();
        aa2tprcl.setRowid(rs.getLong("ROWID"));
        aa2tprcl.setPclemp(rs.getString("PCLEMP"));
        aa2tprcl.setPcldel(rs.getString("PCLDEL"));
        aa2tprcl.setPclcla(rs.getLong("PCLCLA"));
        aa2tprcl.setPclnom(rs.getString("PCLNOM"));
        aa2tprcl.setPclcta(rs.getString("PCLCTA"));

        return aa2tprcl;
    }
}
