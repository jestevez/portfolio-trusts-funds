/*
 * ReadAa2atoProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2ato;

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

import ve.com.sios.gpff.beans.Aa2ato;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class ReadAa2atoProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 11/03/2014
 */
@Service
public class ReadAa2atoProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2ato";

    /**
     * Instantiates a new read aa 2 ato procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2atoProcedure(DataSource dataSource) {
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

        declareParameter(new SqlReturnResultSet("RS", new Aa2atoMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2ato the aa 2 ato
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Aa2ato aa2ato, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2ato == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", aa2ato.getRowid());
        inParams.put("P_ATOEMP", aa2ato.getAtoemp());
        inParams.put("P_ATODEL", aa2ato.getAtodel());
        inParams.put("P_ATOFEC", aa2ato.getAtofec());
        inParams.put("P_ATODTO", aa2ato.getAtodto());
        inParams.put("P_ATONRO", aa2ato.getAtonro());
        inParams.put("P_ATODIV", aa2ato.getAtodiv());
        inParams.put("P_ATOCTA", aa2ato.getAtocta());
        inParams.put("P_ATOIMD", aa2ato.getAtoimd());
        inParams.put("P_ATOIMP", aa2ato.getAtoimp());
        inParams.put("P_ATOCON", aa2ato.getAtocon());
        inParams.put("P_ATOVAL", aa2ato.getAtoval());
        inParams.put("P_ATODH", aa2ato.getAtodh());
        inParams.put("P_ATOFCO", aa2ato.getAtofco());
        inParams.put("P_ATOMAT", aa2ato.getAtomat());
        inParams.put("P_ATOBAJ", aa2ato.getAtobaj());
        inParams.put("P_ATOUSU", aa2ato.getAtousu());
        inParams.put("P_ATOCLI", aa2ato.getAtocli());
        inParams.put("P_ATOCOY", aa2ato.getAtocoy());
        inParams.put("P_ATOVAY", aa2ato.getAtovay());
        inParams.put("P_ATORE1", aa2ato.getAtore1());
        inParams.put("P_ATORE2", aa2ato.getAtore2());
        inParams.put("P_ATODPR", aa2ato.getAtodpr());
        inParams.put("P_ATOBVI", aa2ato.getAtobvi());

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

class Aa2atoMapper implements RowMapper<Aa2ato> {

    public Aa2ato mapRow(ResultSet rs, int i) throws SQLException {
        Aa2ato aa2ato = new Aa2ato();
        aa2ato.setRowid(rs.getLong("ROWID"));
        aa2ato.setAtoemp(rs.getString("ATOEMP"));
        aa2ato.setAtodel(rs.getString("ATODEL"));
        aa2ato.setAtofec(rs.getInt("ATOFEC"));
        aa2ato.setAtodto(rs.getInt("ATODTO"));
        aa2ato.setAtonro(rs.getInt("ATONRO"));
        aa2ato.setAtodiv(rs.getInt("ATODIV"));
        aa2ato.setAtocta(rs.getLong("ATOCTA"));
        aa2ato.setAtoimd(rs.getDouble("ATOIMD"));
        aa2ato.setAtoimp(rs.getDouble("ATOIMP"));
        aa2ato.setAtocon(rs.getString("ATOCON"));
        aa2ato.setAtoval(rs.getInt("ATOVAL"));
        aa2ato.setAtodh(rs.getString("ATODH"));
        aa2ato.setAtofco(rs.getInt("ATOFCO"));
        aa2ato.setAtomat(rs.getString("ATOMAT"));
        aa2ato.setAtobaj(rs.getString("ATOBAJ"));
        aa2ato.setAtousu(rs.getString("ATOUSU"));
        aa2ato.setAtocli(rs.getInt("ATOCLI"));
        aa2ato.setAtocoy(rs.getInt("ATOCOY"));
        aa2ato.setAtovay(rs.getInt("ATOVAY"));
        aa2ato.setAtore1(rs.getString("ATORE1"));
        aa2ato.setAtore2(rs.getInt("ATORE2"));
        aa2ato.setAtodpr(rs.getString("ATODPR"));
        aa2ato.setAtobvi(rs.getInt("ATOBVI"));

        return aa2ato;
    }
}
