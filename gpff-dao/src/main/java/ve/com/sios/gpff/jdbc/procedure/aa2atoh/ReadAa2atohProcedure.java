/*
 * ReadAa2atohProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2atoh;

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

import ve.com.sios.gpff.beans.Aa2atoh;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class ReadAa2atohProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 13/03/2014
 */
@Service
public class ReadAa2atohProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2atoh";

    /**
     * Instantiates a new read aa 2 atoh procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2atohProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ROWID", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATOEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATODEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATOFEC", Types.INTEGER));
        declareParameter(new SqlParameter("P_ATODTO", Types.INTEGER));
        declareParameter(new SqlParameter("P_ATONRO", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATODIV", Types.INTEGER));
        declareParameter(new SqlParameter("P_ATOCTA", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATOIMD", Types.DOUBLE));
        declareParameter(new SqlParameter("P_ATOIMP", Types.DOUBLE));
        declareParameter(new SqlParameter("P_ATOCON", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATOVAL", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATODH", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATOFCO", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATOMAT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATOBAJ", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATOUSU", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATOCLI", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATOCOY", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATOVAY", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATORE1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATORE2", Types.BIGINT));
        declareParameter(new SqlParameter("P_ATODPR", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ATOBVI", Types.BIGINT));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new Aa2atohMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2atoh the aa 2 atoh
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Aa2atoh aa2atoh, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2atoh == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", aa2atoh.getRowid());
        inParams.put("P_ATOEMP", aa2atoh.getAtoemp());
        inParams.put("P_ATODEL", aa2atoh.getAtodel());
        inParams.put("P_ATOFEC", aa2atoh.getAtofec());
        inParams.put("P_ATODTO", aa2atoh.getAtodto());
        inParams.put("P_ATONRO", aa2atoh.getAtonro());
        inParams.put("P_ATODIV", aa2atoh.getAtodiv());
        inParams.put("P_ATOCTA", aa2atoh.getAtocta());
        inParams.put("P_ATOIMD", aa2atoh.getAtoimd());
        inParams.put("P_ATOIMP", aa2atoh.getAtoimp());
        inParams.put("P_ATOCON", aa2atoh.getAtocon());
        inParams.put("P_ATOVAL", aa2atoh.getAtoval());
        inParams.put("P_ATODH", aa2atoh.getAtodh());
        inParams.put("P_ATOFCO", aa2atoh.getAtofco());
        inParams.put("P_ATOMAT", aa2atoh.getAtomat());
        inParams.put("P_ATOBAJ", aa2atoh.getAtobaj());
        inParams.put("P_ATOUSU", aa2atoh.getAtousu());
        inParams.put("P_ATOCLI", aa2atoh.getAtocli());
        inParams.put("P_ATOCOY", aa2atoh.getAtocoy());
        inParams.put("P_ATOVAY", aa2atoh.getAtovay());
        inParams.put("P_ATORE1", aa2atoh.getAtore1());
        inParams.put("P_ATORE2", aa2atoh.getAtore2());
        inParams.put("P_ATODPR", aa2atoh.getAtodpr());
        inParams.put("P_ATOBVI", aa2atoh.getAtobvi());

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

class Aa2atohMapper implements RowMapper<Aa2atoh> {

    public Aa2atoh mapRow(ResultSet rs, int i) throws SQLException {
        Aa2atoh aa2atoh = new Aa2atoh();
        aa2atoh.setRowid(rs.getLong("ROWID"));
        aa2atoh.setAtoemp(rs.getString("ATOEMP"));
        aa2atoh.setAtodel(rs.getString("ATODEL"));
        aa2atoh.setAtofec(rs.getInt("ATOFEC"));
        aa2atoh.setAtodto(rs.getInt("ATODTO"));
        aa2atoh.setAtonro(rs.getLong("ATONRO"));
        aa2atoh.setAtodiv(rs.getInt("ATODIV"));
        aa2atoh.setAtocta(rs.getLong("ATOCTA"));
        aa2atoh.setAtoimd(rs.getDouble("ATOIMD"));
        aa2atoh.setAtoimp(rs.getDouble("ATOIMP"));
        aa2atoh.setAtocon(rs.getString("ATOCON"));
        aa2atoh.setAtoval(rs.getLong("ATOVAL"));
        aa2atoh.setAtodh(rs.getString("ATODH"));
        aa2atoh.setAtofco(rs.getLong("ATOFCO"));
        aa2atoh.setAtomat(rs.getString("ATOMAT"));
        aa2atoh.setAtobaj(rs.getString("ATOBAJ"));
        aa2atoh.setAtousu(rs.getString("ATOUSU"));
        aa2atoh.setAtocli(rs.getLong("ATOCLI"));
        aa2atoh.setAtocoy(rs.getLong("ATOCOY"));
        aa2atoh.setAtovay(rs.getLong("ATOVAY"));
        aa2atoh.setAtore1(rs.getString("ATORE1"));
        aa2atoh.setAtore2(rs.getLong("ATORE2"));
        aa2atoh.setAtodpr(rs.getString("ATODPR"));
        aa2atoh.setAtobvi(rs.getLong("ATOBVI"));

        return aa2atoh;
    }
}
