/*
 * ReadEmbargosProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.embargos;

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
import ve.com.sios.gpff.beans.Embargos;

/**
 * The Class ReadEmbargosProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 07/05/2014
 */
@Service
public class ReadEmbargosProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadEmbargos";

    /**
     * Instantiates a new read embargos procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadEmbargosProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ROWID", Types.BIGINT));
        declareParameter(new SqlParameter("P_EEMPRE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_EDELEG", Types.VARCHAR));
        declareParameter(new SqlParameter("P_EMOVNI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_EMONTO", Types.DOUBLE));
        declareParameter(new SqlParameter("P_EMONTT", Types.DOUBLE));
        declareParameter(new SqlParameter("P_EFECHA", Types.BIGINT));
        declareParameter(new SqlParameter("P_EFECHF", Types.BIGINT));
        declareParameter(new SqlParameter("P_EUSUAR", Types.VARCHAR));
        declareParameter(new SqlParameter("P_EPANTA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_EFECMO", Types.BIGINT));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new EmbargosMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param embargos the embargos
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Embargos embargos, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (embargos == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", embargos.getRowid());
        inParams.put("P_EEMPRE", embargos.getEempre());
        inParams.put("P_EDELEG", embargos.getEdeleg());
        inParams.put("P_EMOVNI", embargos.getEmovni());
        inParams.put("P_EMONTO", embargos.getEmonto());
        inParams.put("P_EMONTT", embargos.getEmontt());
        inParams.put("P_EFECHA", embargos.getEfecha());
        inParams.put("P_EFECHF", embargos.getEfechf());
        inParams.put("P_EUSUAR", embargos.getEusuar());
        inParams.put("P_EPANTA", embargos.getEpanta());
        inParams.put("P_EFECMO", embargos.getEfecmo());

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

class EmbargosMapper implements RowMapper<Embargos> {

    public Embargos mapRow(ResultSet rs, int i) throws SQLException {
        Embargos embargos = new Embargos();
        embargos.setRowid(rs.getLong("ROWID"));
        embargos.setEempre(rs.getString("EEMPRE"));
        embargos.setEdeleg(rs.getString("EDELEG"));
        embargos.setEmovni(rs.getString("EMOVNI"));
        embargos.setEmonto(rs.getBigDecimal("EMONTO"));
        embargos.setEmontt(rs.getBigDecimal("EMONTT"));
        embargos.setEfecha(rs.getLong("EFECHA"));
        embargos.setEfechf(rs.getLong("EFECHF"));
        embargos.setEusuar(rs.getString("EUSUAR"));
        embargos.setEpanta(rs.getString("EPANTA"));
        embargos.setEfecmo(rs.getLong("EFECMO"));

        return embargos;
    }
}
