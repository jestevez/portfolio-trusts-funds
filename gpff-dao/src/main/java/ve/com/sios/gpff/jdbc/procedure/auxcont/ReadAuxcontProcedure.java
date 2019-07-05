/*
 * ReadAuxcontProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.auxcont;

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
import ve.com.sios.gpff.beans.Auxcont;

/**
 * The Class ReadAuxcontProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 17/05/2014
 */
@Service
public class ReadAuxcontProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAuxcont";

    /**
     * Instantiates a new read auxcont procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAuxcontProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ROWID", Types.BIGINT));
        declareParameter(new SqlParameter("P_AXCARE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_AXCNCT", Types.BIGINT));
        declareParameter(new SqlParameter("P_AXCCAP", Types.INTEGER));
        declareParameter(new SqlParameter("P_AXCCPP", Types.INTEGER));
        declareParameter(new SqlParameter("P_AXCAMP", Types.INTEGER));
        declareParameter(new SqlParameter("P_AXCEDM", Types.INTEGER));
        declareParameter(new SqlParameter("P_AXCEMH", Types.INTEGER));
        declareParameter(new SqlParameter("P_AXCEMM", Types.INTEGER));
        declareParameter(new SqlParameter("P_AXCPRT", Types.DOUBLE));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new AuxcontMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param auxcont the auxcont
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Auxcont auxcont, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (auxcont == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", auxcont.getRowid());
        inParams.put("P_AXCARE", auxcont.getAxcare());
        inParams.put("P_AXCNCT", auxcont.getAxcnct());
        inParams.put("P_AXCCAP", auxcont.getAxccap());
        inParams.put("P_AXCCPP", auxcont.getAxccpp());
        inParams.put("P_AXCAMP", auxcont.getAxcamp());
        inParams.put("P_AXCEDM", auxcont.getAxcedm());
        inParams.put("P_AXCEMH", auxcont.getAxcemh());
        inParams.put("P_AXCEMM", auxcont.getAxcemm());
        inParams.put("P_AXCPRT", auxcont.getAxcprt());

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

class AuxcontMapper implements RowMapper<Auxcont> {

    public Auxcont mapRow(ResultSet rs, int i) throws SQLException {
        Auxcont auxcont = new Auxcont();
        auxcont.setRowid(rs.getLong("ROWID"));
        auxcont.setAxcare(rs.getString("AXCARE"));
        auxcont.setAxcnct(rs.getLong("AXCNCT"));
        auxcont.setAxccap(rs.getInt("AXCCAP"));
        auxcont.setAxccpp(rs.getInt("AXCCPP"));
        auxcont.setAxcamp(rs.getInt("AXCAMP"));
        auxcont.setAxcedm(rs.getInt("AXCEDM"));
        auxcont.setAxcemh(rs.getInt("AXCEMH"));
        auxcont.setAxcemm(rs.getInt("AXCEMM"));
        auxcont.setAxcprt(rs.getDouble("AXCPRT"));

        return auxcont;
    }
}
