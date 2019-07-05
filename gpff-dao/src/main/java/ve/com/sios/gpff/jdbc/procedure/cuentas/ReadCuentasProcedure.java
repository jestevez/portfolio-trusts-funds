/*
 * ReadCuentasProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.cuentas;

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
import ve.com.sios.gpff.beans.Cuentas;

/**
 * The Class ReadCuentasProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 20/02/2014
 */
@Service
public class ReadCuentasProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadCuentas";

    /**
     * Instantiates a new read cuentas procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadCuentasProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_CTCCLI", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTCCTA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTCEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTCDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTCTIP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTCAGE", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTCSAL", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTCDIV", Types.INTEGER));
        declareParameter(new SqlParameter("P_CTCAUX", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTCREF", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTCBAN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTCDES", Types.VARCHAR));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new CuentasMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param cuentas the cuentas
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Cuentas cuentas, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (cuentas == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_CTCCLI", cuentas.getCtccli());
        inParams.put("P_CTCCTA", cuentas.getCtccta());
        inParams.put("P_CTCEMP", cuentas.getCtcemp());
        inParams.put("P_CTCDEL", cuentas.getCtcdel());
        inParams.put("P_CTCTIP", cuentas.getCtctip());
        inParams.put("P_CTCAGE", cuentas.getCtcage());
        inParams.put("P_CTCSAL", cuentas.getCtcsal());
        inParams.put("P_CTCDIV", cuentas.getCtcdiv());
        inParams.put("P_CTCAUX", cuentas.getCtcaux());
        inParams.put("P_CTCREF", cuentas.getCtcref());
        inParams.put("P_CTCBAN", cuentas.getCtcban());
        inParams.put("P_CTCDES", cuentas.getCtcdes());

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

class CuentasMapper implements RowMapper<Cuentas> {

    public Cuentas mapRow(ResultSet rs, int i) throws SQLException {
        Cuentas cuentas = new Cuentas();
        cuentas.setCtccli(rs.getLong("CTCCLI"));
        cuentas.setCtccta(rs.getString("CTCCTA"));
        cuentas.setCtcemp(rs.getString("CTCEMP"));
        cuentas.setCtcdel(rs.getString("CTCDEL"));
        cuentas.setCtctip(rs.getString("CTCTIP"));
        cuentas.setCtcage(rs.getLong("CTCAGE"));
        cuentas.setCtcsal(rs.getDouble("CTCSAL"));
        cuentas.setCtcdiv(rs.getInt("CTCDIV"));
        cuentas.setCtcaux(rs.getString("CTCAUX"));
        cuentas.setCtcref(rs.getString("CTCREF"));
        cuentas.setCtcban(rs.getString("CTCBAN"));
        cuentas.setCtcdes(rs.getString("CTCDES"));

        return cuentas;
    }
}
