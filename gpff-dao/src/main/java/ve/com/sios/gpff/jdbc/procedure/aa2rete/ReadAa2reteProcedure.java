/*
 * ReadAa2reteProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2rete;

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

import ve.com.sios.gpff.beans.Aa2rete;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class ReadAa2reteProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 28/02/2014
 */
@Service
public class ReadAa2reteProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2rete";

    /**
     * Instantiates a new read aa 2 rete procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2reteProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_RETCOD", Types.INTEGER));
        declareParameter(new SqlParameter("P_RETLIT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RETFIS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RETRES", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RETFEC", Types.INTEGER));
        declareParameter(new SqlParameter("P_RETNOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RETTRA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RETBAS", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RETPOR", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RETIDE", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RETIEX", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RETALI", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RETUSU", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RETPAN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RETHOR", Types.INTEGER));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new Aa2reteMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2rete the aa 2 rete
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Aa2rete aa2rete, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2rete == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_RETCOD", aa2rete.getRetcod());
        inParams.put("P_RETLIT", aa2rete.getRetlit());
        inParams.put("P_RETFIS", aa2rete.getRetfis());
        inParams.put("P_RETRES", aa2rete.getRetres());
        inParams.put("P_RETFEC", aa2rete.getRetfec());
        inParams.put("P_RETNOM", aa2rete.getRetnom());
        inParams.put("P_RETTRA", aa2rete.getRettra());
        inParams.put("P_RETBAS", aa2rete.getRetbas());
        inParams.put("P_RETPOR", aa2rete.getRetpor());
        inParams.put("P_RETIDE", aa2rete.getRetide());
        inParams.put("P_RETIEX", aa2rete.getRetiex());
        inParams.put("P_RETALI", aa2rete.getRetali());
        inParams.put("P_RETUSU", aa2rete.getRetusu());
        inParams.put("P_RETPAN", aa2rete.getRetpan());
        inParams.put("P_RETHOR", aa2rete.getRethor());

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

class Aa2reteMapper implements RowMapper<Aa2rete> {

    public Aa2rete mapRow(ResultSet rs, int i) throws SQLException {
        Aa2rete aa2rete = new Aa2rete();
        aa2rete.setRetcod(rs.getInt("RETCOD"));
        aa2rete.setRetlit(rs.getString("RETLIT"));
        aa2rete.setRetfis(rs.getString("RETFIS"));
        aa2rete.setRetres(rs.getString("RETRES"));
        aa2rete.setRetfec(rs.getInt("RETFEC"));
        aa2rete.setRetnom(rs.getString("RETNOM"));
        aa2rete.setRettra(rs.getString("RETTRA"));
        aa2rete.setRetbas(rs.getDouble("RETBAS"));
        aa2rete.setRetpor(rs.getDouble("RETPOR"));
        aa2rete.setRetide(rs.getDouble("RETIDE"));
        aa2rete.setRetiex(rs.getDouble("RETIEX"));
        aa2rete.setRetali(rs.getDouble("RETALI"));
        aa2rete.setRetusu(rs.getString("RETUSU"));
        aa2rete.setRetpan(rs.getString("RETPAN"));
        aa2rete.setRethor(rs.getInt("RETHOR"));

        return aa2rete;
    }
}
