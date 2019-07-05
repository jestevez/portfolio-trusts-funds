/*
 * ReadAa2cabProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2cab;

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

import ve.com.sios.gpff.beans.Aa2cab;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class ReadAa2cabProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 11/03/2014
 */
@Service
public class ReadAa2cabProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2cab";

    /**
     * Instantiates a new read aa 2 cab procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2cabProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_AREA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NAREA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USUARIO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PANTALLA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FECHA", Types.BIGINT));
        declareParameter(new SqlParameter("P_LITERAL1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LITERAL2", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NCTA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NCTAC", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NCTACU", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NCTCHE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NCTCHA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NCTBCV", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NCTAFL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NCTAIS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NCTGAO", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NCTRIV", Types.VARCHAR));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new Aa2cabMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2cab the aa 2 cab
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Aa2cab aa2cab, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2cab == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_AREA", aa2cab.getArea());
        inParams.put("P_NAREA", aa2cab.getNarea());
        inParams.put("P_USUARIO", aa2cab.getUsuario());
        inParams.put("P_PANTALLA", aa2cab.getPantalla());
        inParams.put("P_FECHA", aa2cab.getFecha());
        inParams.put("P_LITERAL1", aa2cab.getLiteral1());
        inParams.put("P_LITERAL2", aa2cab.getLiteral2());
        inParams.put("P_NCTA", aa2cab.getNcta());
        inParams.put("P_NCTAC", aa2cab.getNctac());
        inParams.put("P_NCTACU", aa2cab.getNctacu());
        inParams.put("P_NCTCHE", aa2cab.getNctche());
        inParams.put("P_NCTCHA", aa2cab.getNctcha());
        inParams.put("P_NCTBCV", aa2cab.getNctbcv());
        inParams.put("P_NCTAFL", aa2cab.getNctafl());
        inParams.put("P_NCTAIS", aa2cab.getNctais());
        inParams.put("P_NCTGAO", aa2cab.getNctgao());
        inParams.put("P_NCTRIV", aa2cab.getNctriv());

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

class Aa2cabMapper implements RowMapper<Aa2cab> {

    public Aa2cab mapRow(ResultSet rs, int i) throws SQLException {
        Aa2cab aa2cab = new Aa2cab();
        aa2cab.setArea(rs.getString("AREA"));
        aa2cab.setNarea(rs.getString("NAREA"));
        aa2cab.setUsuario(rs.getString("USUARIO"));
        aa2cab.setPantalla(rs.getString("PANTALLA"));
        aa2cab.setFecha(rs.getInt("FECHA"));
        aa2cab.setLiteral1(rs.getString("LITERAL1"));
        aa2cab.setLiteral2(rs.getString("LITERAL2"));
        aa2cab.setNcta(rs.getString("NCTA"));
        aa2cab.setNctac(rs.getString("NCTAC"));
        aa2cab.setNctacu(rs.getString("NCTACU"));
        aa2cab.setNctche(rs.getString("NCTCHE"));
        aa2cab.setNctcha(rs.getString("NCTCHA"));
        aa2cab.setNctbcv(rs.getString("NCTBCV"));
        aa2cab.setNctafl(rs.getString("NCTAFL"));
        aa2cab.setNctais(rs.getString("NCTAIS"));
        aa2cab.setNctgao(rs.getString("NCTGAO"));
        aa2cab.setNctriv(rs.getString("NCTRIV"));

        return aa2cab;
    }
}
