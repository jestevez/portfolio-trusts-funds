/*
 * ReadAa2tfideProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2tfide;

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

import ve.com.sios.gpff.beans.Aa2tfide;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class ReadAa2tfideProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 27/02/2014
 */
@Service
public class ReadAa2tfideProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2tfide";

    /**
     * Instantiates a new read aa 2 tfide procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2tfideProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);
        declareParameter(new SqlParameter("P_FIDCLA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FIDNOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FIDTIP", Types.INTEGER));
        declareParameter(new SqlParameter("P_FIDFIN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlReturnResultSet("RS", new Aa2tfideMapper()));
        compile();
    }

    /**
     * Execute.
     *
     * @param aa2tfide the aa 2 tfide
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Aa2tfide aa2tfide, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2tfide == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_FIDCLA", aa2tfide.getFidcla());
        inParams.put("P_FIDNOM", aa2tfide.getFidnom());
        inParams.put("P_FIDTIP", aa2tfide.getFidtip());
        inParams.put("P_FIDFIN", aa2tfide.getFidfin());
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

class Aa2tfideMapper implements RowMapper<Aa2tfide> {

    public Aa2tfide mapRow(ResultSet rs, int i) throws SQLException {
        Aa2tfide aa2tfide = new Aa2tfide();
        aa2tfide.setFidcla(rs.getString("FIDCLA"));
        aa2tfide.setFidnom(rs.getString("FIDNOM"));
        aa2tfide.setFidtip(rs.getInt("FIDTIP"));
        aa2tfide.setFidfin(rs.getString("FIDFIN"));

        return aa2tfide;
    }
}
