/*
 * ReadAa2tdihProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2tdih;

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

import ve.com.sios.gpff.beans.Aa2tdih;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class ReadAa2tdihProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 19/02/2014
 */
@Service
public class ReadAa2tdihProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2tdih";

    /**
     * Instantiates a new read aa 2 tdih procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2tdihProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_DIHCLA", Types.BIGINT));
        declareParameter(new SqlParameter("P_DIHNOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DIHABR", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DIHCCO", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DIHCVE", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DIHFIX", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DIHCTA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DIHFIB", Types.DOUBLE));
        declareParameter(new SqlParameter("P_DIHFEH", Types.BIGINT));
        declareParameter(new SqlParameter("P_DIHFEG", Types.BIGINT));
        declareParameter(new SqlParameter("P_DIHHOR", Types.BIGINT));
        declareParameter(new SqlParameter("P_DIHPAN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DIHUSU", Types.VARCHAR));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new Aa2tdihMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2tdih the aa 2 tdih
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Aa2tdih aa2tdih, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2tdih == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_DIHCLA", aa2tdih.getDihcla());
        inParams.put("P_DIHNOM", aa2tdih.getDihnom());
        inParams.put("P_DIHABR", aa2tdih.getDihabr());
        inParams.put("P_DIHCCO", aa2tdih.getDihcco());
        inParams.put("P_DIHCVE", aa2tdih.getDihcve());
        inParams.put("P_DIHFIX", aa2tdih.getDihfix());
        inParams.put("P_DIHCTA", aa2tdih.getDihcta());
        inParams.put("P_DIHFIB", aa2tdih.getDihfib());
        inParams.put("P_DIHFEH", aa2tdih.getDihfeh());
        inParams.put("P_DIHFEG", aa2tdih.getDihfeg());
        inParams.put("P_DIHHOR", aa2tdih.getDihhor());
        inParams.put("P_DIHPAN", aa2tdih.getDihpan());
        inParams.put("P_DIHUSU", aa2tdih.getDihusu());

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

class Aa2tdihMapper implements RowMapper<Aa2tdih> {

    public Aa2tdih mapRow(ResultSet rs, int i) throws SQLException {
        Aa2tdih aa2tdih = new Aa2tdih();
        aa2tdih.setDihcla(rs.getLong("DIHCLA"));
        aa2tdih.setDihnom(rs.getString("DIHNOM"));
        aa2tdih.setDihabr(rs.getString("DIHABR"));
        aa2tdih.setDihcco(rs.getDouble("DIHCCO"));
        aa2tdih.setDihcve(rs.getDouble("DIHCVE"));
        aa2tdih.setDihfix(rs.getDouble("DIHFIX"));
        aa2tdih.setDihcta(rs.getString("DIHCTA"));
        aa2tdih.setDihfib(rs.getDouble("DIHFIB"));
        aa2tdih.setDihfeh(rs.getLong("DIHFEH"));
        aa2tdih.setDihfeg(rs.getLong("DIHFEG"));
        aa2tdih.setDihhor(rs.getLong("DIHHOR"));
        aa2tdih.setDihpan(rs.getString("DIHPAN"));
        aa2tdih.setDihusu(rs.getString("DIHUSU"));

        return aa2tdih;
    }
}
