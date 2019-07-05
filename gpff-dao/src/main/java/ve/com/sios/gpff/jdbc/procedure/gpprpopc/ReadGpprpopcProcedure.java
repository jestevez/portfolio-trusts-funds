/*
 * ReadGpprpopcProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.gpprpopc;

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
import ve.com.sios.gpff.beans.Gpprpopc;

/**
 * The Class ReadGpprpopcProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 26/03/2014
 */
@Service
public class ReadGpprpopcProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadGpprpopc";

    /**
     * Instantiates a new read gpprpopc procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadGpprpopcProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ROWID", Types.BIGINT));
        declareParameter(new SqlParameter("P_OPCARE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_OPCOPC", Types.VARCHAR));
        declareParameter(new SqlParameter("P_OPCEDA", Types.INTEGER));
        declareParameter(new SqlParameter("P_OPCCLI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_OPCEDD", Types.INTEGER));
        declareParameter(new SqlParameter("P_OPCEDH", Types.INTEGER));
        declareParameter(new SqlParameter("P_OPCFIJ", Types.DOUBLE));
        declareParameter(new SqlParameter("P_OPCVAR", Types.DOUBLE));
        declareParameter(new SqlParameter("P_OPCUSR", Types.VARCHAR));
        declareParameter(new SqlParameter("P_OPCDSP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_OPCFEC", Types.INTEGER));
        declareParameter(new SqlParameter("P_OPCTIM", Types.INTEGER));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new GpprpopcMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param gpprpopc the gpprpopc
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(Gpprpopc gpprpopc, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException {

        if (gpprpopc == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", gpprpopc.getRowid());
        inParams.put("P_OPCARE", gpprpopc.getOpcare());
        inParams.put("P_OPCOPC", gpprpopc.getOpcopc());
        inParams.put("P_OPCEDA", gpprpopc.getOpceda());
        inParams.put("P_OPCCLI", gpprpopc.getOpccli());
        inParams.put("P_OPCEDD", gpprpopc.getOpcedd());
        inParams.put("P_OPCEDH", gpprpopc.getOpcedh());
        inParams.put("P_OPCFIJ", gpprpopc.getOpcfij());
        inParams.put("P_OPCVAR", gpprpopc.getOpcvar());
        inParams.put("P_OPCUSR", gpprpopc.getOpcusr());
        inParams.put("P_OPCDSP", gpprpopc.getOpcdsp());
        inParams.put("P_OPCFEC", gpprpopc.getOpcfec());
        inParams.put("P_OPCTIM", gpprpopc.getOpctim());

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

class GpprpopcMapper implements RowMapper<Gpprpopc> {

    public Gpprpopc mapRow(ResultSet rs, int i) throws SQLException {
        Gpprpopc gpprpopc = new Gpprpopc();
        gpprpopc.setRowid(rs.getLong("ROWID"));
        gpprpopc.setOpcare(rs.getString("OPCARE"));
        gpprpopc.setOpcopc(rs.getString("OPCOPC"));
        gpprpopc.setOpceda(rs.getInt("OPCEDA"));
        gpprpopc.setOpccli(rs.getString("OPCCLI"));
        gpprpopc.setOpcedd(rs.getInt("OPCEDD"));
        gpprpopc.setOpcedh(rs.getInt("OPCEDH"));
        gpprpopc.setOpcfij(rs.getBigDecimal("OPCFIJ"));
        gpprpopc.setOpcvar(rs.getBigDecimal("OPCVAR"));
        gpprpopc.setOpcusr(rs.getString("OPCUSR"));
        gpprpopc.setOpcdsp(rs.getString("OPCDSP"));
        gpprpopc.setOpcfec(rs.getInt("OPCFEC"));
        gpprpopc.setOpctim(rs.getInt("OPCTIM"));

        return gpprpopc;
    }
}
