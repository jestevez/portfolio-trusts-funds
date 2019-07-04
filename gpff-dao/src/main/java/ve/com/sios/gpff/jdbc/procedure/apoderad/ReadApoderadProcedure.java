/*
 * ReadApoderadProcedure.java
 *
 * Copyright 2014 - Soluciones Integrales Open-Source SiOS
 * Copyright 2014 - E-TRUST SISTEMAS
 *
 * http://www.sios.com.ve
 * http://www.etrustsistemas.com
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
package ve.com.sios.gpff.jdbc.procedure.apoderad;

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

import ve.com.sios.gpff.beans.Apoderad;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class ReadApoderadProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 26/03/2014
 */
@Service
public class ReadApoderadProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadApoderad";

    /**
     * Instantiates a new read apoderad procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadApoderadProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ROWID", Types.BIGINT));
        declareParameter(new SqlParameter("P_NUMAPO", Types.INTEGER));
        declareParameter(new SqlParameter("P_NOMAPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ECAPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PROAPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_POBAPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CEDAPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FOLAPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_TOMAPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_ASIAPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_REPPOR", Types.VARCHAR));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new ApoderadMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param apoderad the apoderad
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws Exception the exception
     */
    public List execute(Apoderad apoderad, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws Exception {

        if (apoderad == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", apoderad.getRowid());
        inParams.put("P_NUMAPO", apoderad.getNumapo());
        inParams.put("P_NOMAPO", apoderad.getNomapo());
        inParams.put("P_ECAPO", apoderad.getEcapo());
        inParams.put("P_PROAPO", apoderad.getProapo());
        inParams.put("P_POBAPO", apoderad.getPobapo());
        inParams.put("P_CEDAPO", apoderad.getCedapo());
        inParams.put("P_FOLAPO", apoderad.getFolapo());
        inParams.put("P_TOMAPO", apoderad.getTomapo());
        inParams.put("P_ASIAPO", apoderad.getAsiapo());
        inParams.put("P_REPPOR", apoderad.getReppor());

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

class ApoderadMapper implements RowMapper<Apoderad> {

    public Apoderad mapRow(ResultSet rs, int i) throws SQLException {
        Apoderad apoderad = new Apoderad();
        apoderad.setRowid(rs.getLong("ROWID"));
        apoderad.setNumapo(rs.getInt("NUMAPO"));
        apoderad.setNomapo(rs.getString("NOMAPO"));
        apoderad.setEcapo(rs.getString("ECAPO"));
        apoderad.setProapo(rs.getString("PROAPO"));
        apoderad.setPobapo(rs.getString("POBAPO"));
        apoderad.setCedapo(rs.getString("CEDAPO"));
        apoderad.setFolapo(rs.getString("FOLAPO"));
        apoderad.setTomapo(rs.getString("TOMAPO"));
        apoderad.setAsiapo(rs.getString("ASIAPO"));
        apoderad.setReppor(rs.getString("REPPOR"));

        return apoderad;
    }
}
