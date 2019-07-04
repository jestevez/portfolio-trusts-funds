/*
 * ReadCgmaxminProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.cgmaxmin;

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
import ve.com.sios.gpff.beans.Cgmaxmin;

/**
 * The Class ReadCgmaxminProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 25/03/2014
 */
@Service
public class ReadCgmaxminProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadCgmaxmin";

    /**
     * Instantiates a new read cgmaxmin procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadCgmaxminProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ROWID", Types.BIGINT));
        declareParameter(new SqlParameter("P_CGMEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CGMDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CGMFMT", Types.INTEGER));
        declareParameter(new SqlParameter("P_CGMNCT", Types.INTEGER));
        declareParameter(new SqlParameter("P_CGMCLI", Types.INTEGER));
        declareParameter(new SqlParameter("P_CGMCOD", Types.INTEGER));
        declareParameter(new SqlParameter("P_CGMMAX", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMMIN", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMDS1", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMHS1", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMPR1", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMDS2", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMHS2", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMPR2", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMDS3", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMHS3", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMPR3", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMDS4", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMHS4", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMPR4", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMDS5", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMHS5", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMPR5", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMDS6", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMHS6", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CGMPR6", Types.DOUBLE));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new CgmaxminMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param cgmaxmin the cgmaxmin
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws Exception the exception
     */
    public List execute(Cgmaxmin cgmaxmin, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws Exception {

        if (cgmaxmin == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", cgmaxmin.getRowid());
        inParams.put("P_CGMEMP", cgmaxmin.getCgmemp());
        inParams.put("P_CGMDEL", cgmaxmin.getCgmdel());
        inParams.put("P_CGMFMT", cgmaxmin.getCgmfmt());
        inParams.put("P_CGMNCT", cgmaxmin.getCgmnct());
        inParams.put("P_CGMCLI", cgmaxmin.getCgmcli());
        inParams.put("P_CGMCOD", cgmaxmin.getCgmcod());
        inParams.put("P_CGMMAX", cgmaxmin.getCgmmax());
        inParams.put("P_CGMMIN", cgmaxmin.getCgmmin());
        inParams.put("P_CGMDS1", cgmaxmin.getCgmds1());
        inParams.put("P_CGMHS1", cgmaxmin.getCgmhs1());
        inParams.put("P_CGMPR1", cgmaxmin.getCgmpr1());
        inParams.put("P_CGMDS2", cgmaxmin.getCgmds2());
        inParams.put("P_CGMHS2", cgmaxmin.getCgmhs2());
        inParams.put("P_CGMPR2", cgmaxmin.getCgmpr2());
        inParams.put("P_CGMDS3", cgmaxmin.getCgmds3());
        inParams.put("P_CGMHS3", cgmaxmin.getCgmhs3());
        inParams.put("P_CGMPR3", cgmaxmin.getCgmpr3());
        inParams.put("P_CGMDS4", cgmaxmin.getCgmds4());
        inParams.put("P_CGMHS4", cgmaxmin.getCgmhs4());
        inParams.put("P_CGMPR4", cgmaxmin.getCgmpr4());
        inParams.put("P_CGMDS5", cgmaxmin.getCgmds5());
        inParams.put("P_CGMHS5", cgmaxmin.getCgmhs5());
        inParams.put("P_CGMPR5", cgmaxmin.getCgmpr5());
        inParams.put("P_CGMDS6", cgmaxmin.getCgmds6());
        inParams.put("P_CGMHS6", cgmaxmin.getCgmhs6());
        inParams.put("P_CGMPR6", cgmaxmin.getCgmpr6());

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

class CgmaxminMapper implements RowMapper<Cgmaxmin> {

    public Cgmaxmin mapRow(ResultSet rs, int i) throws SQLException {
        Cgmaxmin cgmaxmin = new Cgmaxmin();
        cgmaxmin.setRowid(rs.getLong("ROWID"));
        cgmaxmin.setCgmemp(rs.getString("CGMEMP"));
        cgmaxmin.setCgmdel(rs.getString("CGMDEL"));
        cgmaxmin.setCgmfmt(rs.getInt("CGMFMT"));
        cgmaxmin.setCgmnct(rs.getInt("CGMNCT"));
        cgmaxmin.setCgmcli(rs.getInt("CGMCLI"));
        cgmaxmin.setCgmcod(rs.getInt("CGMCOD"));
        cgmaxmin.setCgmmax(rs.getBigDecimal("CGMMAX"));
        cgmaxmin.setCgmmin(rs.getBigDecimal("CGMMIN"));
        cgmaxmin.setCgmds1(rs.getBigDecimal("CGMDS1"));
        cgmaxmin.setCgmhs1(rs.getBigDecimal("CGMHS1"));
        cgmaxmin.setCgmpr1(rs.getBigDecimal("CGMPR1"));
        cgmaxmin.setCgmds2(rs.getBigDecimal("CGMDS2"));
        cgmaxmin.setCgmhs2(rs.getBigDecimal("CGMHS2"));
        cgmaxmin.setCgmpr2(rs.getBigDecimal("CGMPR2"));
        cgmaxmin.setCgmds3(rs.getBigDecimal("CGMDS3"));
        cgmaxmin.setCgmhs3(rs.getBigDecimal("CGMHS3"));
        cgmaxmin.setCgmpr3(rs.getBigDecimal("CGMPR3"));
        cgmaxmin.setCgmds4(rs.getBigDecimal("CGMDS4"));
        cgmaxmin.setCgmhs4(rs.getBigDecimal("CGMHS4"));
        cgmaxmin.setCgmpr4(rs.getBigDecimal("CGMPR4"));
        cgmaxmin.setCgmds5(rs.getBigDecimal("CGMDS5"));
        cgmaxmin.setCgmhs5(rs.getBigDecimal("CGMHS5"));
        cgmaxmin.setCgmpr5(rs.getBigDecimal("CGMPR5"));
        cgmaxmin.setCgmds6(rs.getBigDecimal("CGMDS6"));
        cgmaxmin.setCgmhs6(rs.getBigDecimal("CGMHS6"));
        cgmaxmin.setCgmpr6(rs.getBigDecimal("CGMPR6"));

        return cgmaxmin;
    }
}
