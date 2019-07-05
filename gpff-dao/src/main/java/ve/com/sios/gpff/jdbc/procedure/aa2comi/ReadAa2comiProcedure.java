/*
 * ReadAa2comiProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2comi;

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

import ve.com.sios.gpff.beans.Aa2comi;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class ReadAa2comiProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 07/04/2014
 */
@Service
public class ReadAa2comiProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2comi";

    /**
     * Instantiates a new read aa 2 comi procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2comiProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ROWID", Types.BIGINT));
        declareParameter(new SqlParameter("P_COMEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COMDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COMFIC", Types.BIGINT));
        declareParameter(new SqlParameter("P_COMCOB", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMNCO", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMVIV", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMCPJ", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMCFL", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMINP", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMMOP", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMSCF", Types.DOUBLE));
        declareParameter(new SqlParameter("P_COMDIS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COMINV", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COMFEC", Types.BIGINT));
        declareParameter(new SqlParameter("P_COMUSU", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COMHOR", Types.BIGINT));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new Aa2comiMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2comi the aa 2 comi
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Aa2comi aa2comi, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2comi == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", aa2comi.getRowid());
        inParams.put("P_COMEMP", aa2comi.getComemp());
        inParams.put("P_COMDEL", aa2comi.getComdel());
        inParams.put("P_COMFIC", aa2comi.getComfic());
        inParams.put("P_COMCOB", aa2comi.getComcob());
        inParams.put("P_COMNCO", aa2comi.getComnco());
        inParams.put("P_COMVIV", aa2comi.getComviv());
        inParams.put("P_COMCPJ", aa2comi.getComcpj());
        inParams.put("P_COMCFL", aa2comi.getComcfl());
        inParams.put("P_COMINP", aa2comi.getCominp());
        inParams.put("P_COMMOP", aa2comi.getCommop());
        inParams.put("P_COMSCF", aa2comi.getComscf());
        inParams.put("P_COMDIS", aa2comi.getComdis());
        inParams.put("P_COMINV", aa2comi.getCominv());
        inParams.put("P_COMFEC", aa2comi.getComfec());
        inParams.put("P_COMUSU", aa2comi.getComusu());
        inParams.put("P_COMHOR", aa2comi.getComhor());

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

class Aa2comiMapper implements RowMapper<Aa2comi> {

    public Aa2comi mapRow(ResultSet rs, int i) throws SQLException {
        Aa2comi aa2comi = new Aa2comi();
        aa2comi.setRowid(rs.getLong("ROWID"));
        aa2comi.setComemp(rs.getString("COMEMP"));
        aa2comi.setComdel(rs.getString("COMDEL"));
        aa2comi.setComfic(rs.getLong("COMFIC"));
        aa2comi.setComcob(rs.getDouble("COMCOB"));
        aa2comi.setComnco(rs.getDouble("COMNCO"));
        aa2comi.setComviv(rs.getDouble("COMVIV"));
        aa2comi.setComcpj(rs.getDouble("COMCPJ"));
        aa2comi.setComcfl(rs.getDouble("COMCFL"));
        aa2comi.setCominp(rs.getDouble("COMINP"));
        aa2comi.setCommop(rs.getDouble("COMMOP"));
        aa2comi.setComscf(rs.getDouble("COMSCF"));
        aa2comi.setComdis(rs.getString("COMDIS"));
        aa2comi.setCominv(rs.getString("COMINV"));
        aa2comi.setComfec(rs.getLong("COMFEC"));
        aa2comi.setComusu(rs.getString("COMUSU"));
        aa2comi.setComhor(rs.getLong("COMHOR"));

        return aa2comi;
    }
}
