/*
 * ReadValoraProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.valora;

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
import ve.com.sios.gpff.beans.Valora;

/**
 * The Class ReadValoraProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 19/02/2014
 */
@Service
public class ReadValoraProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadValora";

    /**
     * Instantiates a new read valora procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadValoraProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_VLOEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLODEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOCOA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOCON", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLONOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOUNI", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOLIQ", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLODIV", Types.INTEGER));
        declareParameter(new SqlParameter("P_VLOCLS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOISI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOCAT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOCBE", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOFIS", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOIIN", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLONMI", Types.INTEGER));
        declareParameter(new SqlParameter("P_VLOFIN", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOPIN", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOIAM", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLONMA", Types.INTEGER));
        declareParameter(new SqlParameter("P_VLOFAM", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOPAM", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOTAM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOMAM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOUDE", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOUCA", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOOUC", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOBEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOFUI", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOFUA", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOFON", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOSE1", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOSE2", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOCME", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOFAC", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOGAR", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOGAD", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOCBR", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOTUN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOHOR", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOTIP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOSPR", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOTFO", Types.INTEGER));
        declareParameter(new SqlParameter("P_VLOTAS", Types.DOUBLE));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new ValoraMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param valora the valora
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws Exception the exception
     */
    public List execute(Valora valora, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws Exception {

        if (valora == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_VLOEMP", valora.getVloemp());
        inParams.put("P_VLODEL", valora.getVlodel());
        inParams.put("P_VLOCOA", valora.getVlocoa());
        inParams.put("P_VLOCON", valora.getVlocon());
        inParams.put("P_VLONOM", valora.getVlonom());
        inParams.put("P_VLOUNI", valora.getVlouni());
        inParams.put("P_VLOLIQ", valora.getVloliq());
        inParams.put("P_VLODIV", valora.getVlodiv());
        inParams.put("P_VLOCLS", valora.getVlocls());
        inParams.put("P_VLOISI", valora.getVloisi());
        inParams.put("P_VLOCAT", valora.getVlocat());
        inParams.put("P_VLOCBE", valora.getVlocbe());
        inParams.put("P_VLOFIS", valora.getVlofis());
        inParams.put("P_VLOIIN", valora.getVloiin());
        inParams.put("P_VLONMI", valora.getVlonmi());
        inParams.put("P_VLOFIN", valora.getVlofin());
        inParams.put("P_VLOPIN", valora.getVlopin());
        inParams.put("P_VLOIAM", valora.getVloiam());
        inParams.put("P_VLONMA", valora.getVlonma());
        inParams.put("P_VLOFAM", valora.getVlofam());
        inParams.put("P_VLOPAM", valora.getVlopam());
        inParams.put("P_VLOTAM", valora.getVlotam());
        inParams.put("P_VLOMAM", valora.getVlomam());
        inParams.put("P_VLOUDE", valora.getVloude());
        inParams.put("P_VLOUCA", valora.getVlouca());
        inParams.put("P_VLOOUC", valora.getVloouc());
        inParams.put("P_VLOBEL", valora.getVlobel());
        inParams.put("P_VLOFUI", valora.getVlofui());
        inParams.put("P_VLOFUA", valora.getVlofua());
        inParams.put("P_VLOFON", valora.getVlofon());
        inParams.put("P_VLOSE1", valora.getVlose1());
        inParams.put("P_VLOSE2", valora.getVlose2());
        inParams.put("P_VLOCME", valora.getVlocme());
        inParams.put("P_VLOFAC", valora.getVlofac());
        inParams.put("P_VLOGAR", valora.getVlogar());
        inParams.put("P_VLOGAD", valora.getVlogad());
        inParams.put("P_VLOCBR", valora.getVlocbr());
        inParams.put("P_VLOTUN", valora.getVlotun());
        inParams.put("P_VLOHOR", valora.getVlohor());
        inParams.put("P_VLOTIP", valora.getVlotip());
        inParams.put("P_VLOSPR", valora.getVlospr());
        inParams.put("P_VLOTFO", valora.getVlotfo());
        inParams.put("P_VLOTAS", valora.getVlotas());

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

class ValoraMapper implements RowMapper<Valora> {

    public Valora mapRow(ResultSet rs, int i) throws SQLException {
        Valora valora = new Valora();
        valora.setVloemp(rs.getString("VLOEMP"));
        valora.setVlodel(rs.getString("VLODEL"));
        valora.setVlocoa(rs.getString("VLOCOA"));
        valora.setVlocon(rs.getLong("VLOCON"));
        valora.setVlonom(rs.getString("VLONOM"));
        valora.setVlouni(rs.getDouble("VLOUNI"));
        valora.setVloliq(rs.getString("VLOLIQ"));
        valora.setVlodiv(rs.getInt("VLODIV"));
        valora.setVlocls(rs.getString("VLOCLS"));
        valora.setVloisi(rs.getString("VLOISI"));
        valora.setVlocat(rs.getString("VLOCAT"));
        valora.setVlocbe(rs.getLong("VLOCBE"));
        valora.setVlofis(rs.getLong("VLOFIS"));
        valora.setVloiin(rs.getLong("VLOIIN"));
        valora.setVlonmi(rs.getInt("VLONMI"));
        valora.setVlofin(rs.getLong("VLOFIN"));
        valora.setVlopin(rs.getDouble("VLOPIN"));
        valora.setVloiam(rs.getLong("VLOIAM"));
        valora.setVlonma(rs.getInt("VLONMA"));
        valora.setVlofam(rs.getLong("VLOFAM"));
        valora.setVlopam(rs.getDouble("VLOPAM"));
        valora.setVlotam(rs.getString("VLOTAM"));
        valora.setVlomam(rs.getString("VLOMAM"));
        valora.setVloude(rs.getLong("VLOUDE"));
        valora.setVlouca(rs.getLong("VLOUCA"));
        valora.setVloouc(rs.getLong("VLOOUC"));
        valora.setVlobel(rs.getString("VLOBEL"));
        valora.setVlofui(rs.getLong("VLOFUI"));
        valora.setVlofua(rs.getLong("VLOFUA"));
        valora.setVlofon(rs.getDouble("VLOFON"));
        valora.setVlose1(rs.getDouble("VLOSE1"));
        valora.setVlose2(rs.getLong("VLOSE2"));
        valora.setVlocme(rs.getLong("VLOCME"));
        valora.setVlofac(rs.getDouble("VLOFAC"));
        valora.setVlogar(rs.getDouble("VLOGAR"));
        valora.setVlogad(rs.getDouble("VLOGAD"));
        valora.setVlocbr(rs.getDouble("VLOCBR"));
        valora.setVlotun(rs.getString("VLOTUN"));
        valora.setVlohor(rs.getString("VLOHOR"));
        valora.setVlotip(rs.getString("VLOTIP"));
        valora.setVlospr(rs.getDouble("VLOSPR"));
        valora.setVlotfo(rs.getInt("VLOTFO"));
        valora.setVlotas(rs.getDouble("VLOTAS"));

        return valora;
    }
}
