/*
 * ReadCupamortProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.cupamort;

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
import ve.com.sios.gpff.beans.Cupamort;

/**
 * The Class ReadCupamortProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 24/03/2014
 */
@Service
public class ReadCupamortProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadCupamort";

    /**
     * Instantiates a new read cupamort procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadCupamortProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ROWID", Types.BIGINT));
        declareParameter(new SqlParameter("P_CUPEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CUPDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CUPTIP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CUPVAL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CUPFEC", Types.INTEGER));
        declareParameter(new SqlParameter("P_CUPMNT", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CUPIMP", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CUPCOB", Types.INTEGER));
        declareParameter(new SqlParameter("P_CUPVEN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CUPMCB", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CUPCBT", Types.VARCHAR));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new CupamortMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param cupamort the cupamort
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Cupamort cupamort, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (cupamort == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", cupamort.getRowid());
        inParams.put("P_CUPEMP", cupamort.getCupemp());
        inParams.put("P_CUPDEL", cupamort.getCupdel());
        inParams.put("P_CUPTIP", cupamort.getCuptip());
        inParams.put("P_CUPVAL", cupamort.getCupval());
        inParams.put("P_CUPFEC", cupamort.getCupfec());
        inParams.put("P_CUPMNT", cupamort.getCupmnt());
        inParams.put("P_CUPIMP", cupamort.getCupimp());
        inParams.put("P_CUPCOB", cupamort.getCupcob());
        inParams.put("P_CUPVEN", cupamort.getCupven());
        inParams.put("P_CUPMCB", cupamort.getCupmcb());
        inParams.put("P_CUPCBT", cupamort.getCupcbt());

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

class CupamortMapper implements RowMapper<Cupamort> {

    public Cupamort mapRow(ResultSet rs, int i) throws SQLException {
        Cupamort cupamort = new Cupamort();
        cupamort.setRowid(rs.getLong("ROWID"));
        cupamort.setCupemp(rs.getString("CUPEMP"));
        cupamort.setCupdel(rs.getString("CUPDEL"));
        cupamort.setCuptip(rs.getString("CUPTIP"));
        cupamort.setCupval(rs.getString("CUPVAL"));
        cupamort.setCupfec(rs.getInt("CUPFEC"));
        cupamort.setCupmnt(rs.getBigDecimal("CUPMNT"));
        cupamort.setCupimp(rs.getBigDecimal("CUPIMP"));
        cupamort.setCupcob(rs.getInt("CUPCOB"));
        cupamort.setCupven(rs.getString("CUPVEN"));
        cupamort.setCupmcb(rs.getString("CUPMCB"));
        cupamort.setCupcbt(rs.getString("CUPCBT"));

        return cupamort;
    }
}
