/*
 * ReadCotfondoProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.cotfondo;

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

import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;
import ve.com.sios.gpff.beans.Cotfondo;

/**
 * The Class ReadCotfondoProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 09/05/2014
 */
@Service
public class ReadCotfondoProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadCotfondo";

    /**
     * Instantiates a new read cotfondo procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadCotfondoProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ROWID", Types.BIGINT));
        declareParameter(new SqlParameter("P_COFEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COFDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COFCLA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COFFEC", Types.BIGINT));
        declareParameter(new SqlParameter("P_COFFECH", Types.BIGINT));
        declareParameter(new SqlParameter("P_COFCOT", Types.DOUBLE));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new CotfondoMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param cotfondo the cotfondo
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Cotfondo cotfondo, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (cotfondo == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", cotfondo.getRowid());
        inParams.put("P_COFEMP", cotfondo.getCofemp());
        inParams.put("P_COFDEL", cotfondo.getCofdel());
        inParams.put("P_COFCLA", cotfondo.getCofcla());
        inParams.put("P_COFFEC", cotfondo.getCoffec());
        inParams.put("P_COFFECH", cotfondo.getCoffech());
        inParams.put("P_COFCOT", cotfondo.getCofcot());

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

class CotfondoMapper implements RowMapper<Cotfondo> {

    public Cotfondo mapRow(ResultSet rs, int i) throws SQLException {
        Cotfondo cotfondo = new Cotfondo();
        cotfondo.setRowid(rs.getLong("ROWID"));
        cotfondo.setCofemp(rs.getString("COFEMP"));
        cotfondo.setCofdel(rs.getString("COFDEL"));
        cotfondo.setCofcla(rs.getString("COFCLA"));
        cotfondo.setCoffec(rs.getLong("COFFEC"));
        cotfondo.setCofcot(rs.getBigDecimal("COFCOT"));

        return cotfondo;
    }
}
