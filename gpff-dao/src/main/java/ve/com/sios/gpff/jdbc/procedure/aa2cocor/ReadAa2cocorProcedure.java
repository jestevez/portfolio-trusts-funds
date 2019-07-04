/*
 * ReadAa2cocorProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2cocor;

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

import ve.com.sios.gpff.beans.Aa2cocor;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class ReadAa2cocorProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 13/03/2014
 */
@Service
public class ReadAa2cocorProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2cocor";

    /**
     * Instantiates a new read aa 2 cocor procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2cocorProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_CODARE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CODCOR", Types.INTEGER));
        declareParameter(new SqlParameter("P_CODNOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CODUSU", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CODPAN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CODFEC", Types.INTEGER));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new Aa2cocorMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2cocor the aa 2 cocor
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws Exception the exception
     */
    public List execute(Aa2cocor aa2cocor, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws Exception {

        if (aa2cocor == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_CODARE", aa2cocor.getCodare());
        inParams.put("P_CODCOR", aa2cocor.getCodcor());
        inParams.put("P_CODNOM", aa2cocor.getCodnom());
        inParams.put("P_CODUSU", aa2cocor.getCodusu());
        inParams.put("P_CODPAN", aa2cocor.getCodpan());
        inParams.put("P_CODFEC", aa2cocor.getCodfec());

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

class Aa2cocorMapper implements RowMapper<Aa2cocor> {

    public Aa2cocor mapRow(ResultSet rs, int i) throws SQLException {
        Aa2cocor aa2cocor = new Aa2cocor();
        aa2cocor.setCodare(rs.getString("CODARE"));
        aa2cocor.setCodcor(rs.getInt("CODCOR"));
        aa2cocor.setCodnom(rs.getString("CODNOM"));
        aa2cocor.setCodusu(rs.getString("CODUSU"));
        aa2cocor.setCodpan(rs.getString("CODPAN"));
        aa2cocor.setCodfec(rs.getInt("CODFEC"));

        return aa2cocor;
    }
}
