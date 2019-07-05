/*
 * ReadAa2rettProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2rett;

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

import ve.com.sios.gpff.beans.Aa2rett;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class ReadAa2rettProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 28/02/2014
 */
@Service
public class ReadAa2rettProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadAa2rett";

    /**
     * Instantiates a new read aa 2 rett procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadAa2rettProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_RTTCOD", Types.INTEGER));
        declareParameter(new SqlParameter("P_RTTLIT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RTTFIS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RTTRES", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RTTFEC", Types.INTEGER));
        declareParameter(new SqlParameter("P_RTTIMH", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RTTBAS", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RTTPOR", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RTTIDE", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RTTIEX", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RTTALI", Types.DOUBLE));
        declareParameter(new SqlParameter("P_RTTUSU", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RTTPAN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_RTTHOR", Types.INTEGER));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new Aa2rettMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2rett the aa 2 rett
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Aa2rett aa2rett, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2rett == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_RTTCOD", aa2rett.getRttcod());
        inParams.put("P_RTTLIT", aa2rett.getRttlit());
        inParams.put("P_RTTFIS", aa2rett.getRttfis());
        inParams.put("P_RTTRES", aa2rett.getRttres());
        inParams.put("P_RTTFEC", aa2rett.getRttfec());
        inParams.put("P_RTTIMH", aa2rett.getRttimh());
        inParams.put("P_RTTBAS", aa2rett.getRttbas());
        inParams.put("P_RTTPOR", aa2rett.getRttpor());
        inParams.put("P_RTTIDE", aa2rett.getRttide());
        inParams.put("P_RTTIEX", aa2rett.getRttiex());
        inParams.put("P_RTTALI", aa2rett.getRttali());
        inParams.put("P_RTTUSU", aa2rett.getRttusu());
        inParams.put("P_RTTPAN", aa2rett.getRttpan());
        inParams.put("P_RTTHOR", aa2rett.getRtthor());

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

class Aa2rettMapper implements RowMapper<Aa2rett> {

    public Aa2rett mapRow(ResultSet rs, int i) throws SQLException {
        Aa2rett aa2rett = new Aa2rett();
        aa2rett.setRttcod(rs.getInt("RTTCOD"));
        aa2rett.setRttlit(rs.getString("RTTLIT"));
        aa2rett.setRttfis(rs.getString("RTTFIS"));
        aa2rett.setRttres(rs.getString("RTTRES"));
        aa2rett.setRttfec(rs.getInt("RTTFEC"));
        aa2rett.setRttimh(rs.getDouble("RTTIMH"));
        aa2rett.setRttbas(rs.getDouble("RTTBAS"));
        aa2rett.setRttpor(rs.getDouble("RTTPOR"));
        aa2rett.setRttide(rs.getDouble("RTTIDE"));
        aa2rett.setRttiex(rs.getDouble("RTTIEX"));
        aa2rett.setRttali(rs.getDouble("RTTALI"));
        aa2rett.setRttusu(rs.getString("RTTUSU"));
        aa2rett.setRttpan(rs.getString("RTTPAN"));
        aa2rett.setRtthor(rs.getInt("RTTHOR"));

        return aa2rett;
    }
}
