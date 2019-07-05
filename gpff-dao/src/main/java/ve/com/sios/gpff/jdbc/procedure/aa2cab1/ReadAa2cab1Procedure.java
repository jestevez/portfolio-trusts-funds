/*
 * ReadAa2cab1Procedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2cab1;

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

import ve.com.sios.gpff.beans.Aa2cab1;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class ReadAa2cab1Procedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 11/03/2014
 */
@Service
public class ReadAa2cab1Procedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2cab1";

    /**
     * Instantiates a new read aa 2 cab 1 procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2cab1Procedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_AREA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NBANCO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NRIF", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NNIF", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NDIRE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NBANC", Types.INTEGER));
        declareParameter(new SqlParameter("P_NTELE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NRESPO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NFILLER", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USUARIO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PANTALLA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FECHA", Types.INTEGER));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new Aa2cab1Mapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2cab1 the aa 2 cab 1
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Aa2cab1 aa2cab1, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2cab1 == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_AREA", aa2cab1.getArea());
        inParams.put("P_NBANCO", aa2cab1.getNbanco());
        inParams.put("P_NRIF", aa2cab1.getNrif());
        inParams.put("P_NNIF", aa2cab1.getNnif());
        inParams.put("P_NDIRE", aa2cab1.getNdire());
        inParams.put("P_NBANC", aa2cab1.getNbanc());
        inParams.put("P_NTELE", aa2cab1.getNtele());
        inParams.put("P_NRESPO", aa2cab1.getNrespo());
        inParams.put("P_NFILLER", aa2cab1.getNfiller());
        inParams.put("P_USUARIO", aa2cab1.getUsuario());
        inParams.put("P_PANTALLA", aa2cab1.getPantalla());
        inParams.put("P_FECHA", aa2cab1.getFecha());

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

class Aa2cab1Mapper implements RowMapper<Aa2cab1> {

    public Aa2cab1 mapRow(ResultSet rs, int i) throws SQLException {
        Aa2cab1 aa2cab1 = new Aa2cab1();
        aa2cab1.setArea(rs.getString("AREA"));
        aa2cab1.setNbanco(rs.getString("NBANCO"));
        aa2cab1.setNrif(rs.getString("NRIF"));
        aa2cab1.setNnif(rs.getString("NNIF"));
        aa2cab1.setNdire(rs.getString("NDIRE"));
        aa2cab1.setNbanc(rs.getInt("NBANC"));
        aa2cab1.setNtele(rs.getString("NTELE"));
        aa2cab1.setNrespo(rs.getString("NRESPO"));
        aa2cab1.setNfiller(rs.getString("NFILLER"));
        aa2cab1.setUsuario(rs.getString("USUARIO"));
        aa2cab1.setPantalla(rs.getString("PANTALLA"));
        aa2cab1.setFecha(rs.getInt("FECHA"));

        return aa2cab1;
    }
}
