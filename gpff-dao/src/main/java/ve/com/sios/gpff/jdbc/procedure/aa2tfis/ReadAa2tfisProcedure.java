/*
 * ReadAa2tfisProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2tfis;

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

import ve.com.sios.gpff.beans.Aa2tfis;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class ReadAa2tfisProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 01/04/2014
 */
@Service
public class ReadAa2tfisProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2tfis";

    /**
     * Instantiates a new read aa 2 tfis procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2tfisProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ROWID", Types.BIGINT));
        declareParameter(new SqlParameter("P_FISEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FISDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FISCLA", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISNOR", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISBEL", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISBE1", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISDIV", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISINV", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISGIN", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISCAP", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISRDI", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISRD1", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISCOR", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISIVA", Types.DOUBLE));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new Aa2tfisMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2tfis the aa 2 tfis
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Aa2tfis aa2tfis, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2tfis == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", aa2tfis.getRowid());
        inParams.put("P_FISEMP", aa2tfis.getFisemp());
        inParams.put("P_FISDEL", aa2tfis.getFisdel());
        inParams.put("P_FISCLA", aa2tfis.getFiscla());
        inParams.put("P_FISNOR", aa2tfis.getFisnor());
        inParams.put("P_FISBEL", aa2tfis.getFisbel());
        inParams.put("P_FISBE1", aa2tfis.getFisbe1());
        inParams.put("P_FISDIV", aa2tfis.getFisdiv());
        inParams.put("P_FISINV", aa2tfis.getFisinv());
        inParams.put("P_FISGIN", aa2tfis.getFisgin());
        inParams.put("P_FISCAP", aa2tfis.getFiscap());
        inParams.put("P_FISRDI", aa2tfis.getFisrdi());
        inParams.put("P_FISRD1", aa2tfis.getFisrd1());
        inParams.put("P_FISCOR", aa2tfis.getFiscor());
        inParams.put("P_FISIVA", aa2tfis.getFisiva());

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

class Aa2tfisMapper implements RowMapper<Aa2tfis> {

    public Aa2tfis mapRow(ResultSet rs, int i) throws SQLException {
        Aa2tfis aa2tfis = new Aa2tfis();
        aa2tfis.setRowid(rs.getLong("ROWID"));
        aa2tfis.setFisemp(rs.getString("FISEMP"));
        aa2tfis.setFisdel(rs.getString("FISDEL"));
        aa2tfis.setFiscla(rs.getDouble("FISCLA"));
        aa2tfis.setFisnor(rs.getDouble("FISNOR"));
        aa2tfis.setFisbel(rs.getDouble("FISBEL"));
        aa2tfis.setFisbe1(rs.getDouble("FISBE1"));
        aa2tfis.setFisdiv(rs.getDouble("FISDIV"));
        aa2tfis.setFisinv(rs.getDouble("FISINV"));
        aa2tfis.setFisgin(rs.getDouble("FISGIN"));
        aa2tfis.setFiscap(rs.getDouble("FISCAP"));
        aa2tfis.setFisrdi(rs.getDouble("FISRDI"));
        aa2tfis.setFisrd1(rs.getDouble("FISRD1"));
        aa2tfis.setFiscor(rs.getDouble("FISCOR"));
        aa2tfis.setFisiva(rs.getDouble("FISIVA"));

        return aa2tfis;
    }
}
