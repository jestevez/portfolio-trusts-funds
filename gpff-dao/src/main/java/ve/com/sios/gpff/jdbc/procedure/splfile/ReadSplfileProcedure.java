/*
 * ReadSplfileProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.splfile;

import java.sql.Blob;
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

import ve.com.sios.gpff.beans.AuthorizationData;
import ve.com.sios.gpff.beans.Splfile;

/**
 * The Class ReadSplfileProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 10/02/2014
 */
@Service
public class ReadSplfileProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadSplfile";

    /**
     * Instantiates a new read splfile procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadSplfileProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ID", Types.BIGINT));
        declareParameter(new SqlParameter("P_SPLDATA", Types.BLOB));
        declareParameter(new SqlParameter("P_SPLNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_SPLMIME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_SPLDATE", Types.TIMESTAMP));
        declareParameter(new SqlParameter("P_SPLTYPE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_SPLUSER", Types.VARCHAR));
        declareParameter(new SqlParameter("P_SPLSTATUS", Types.VARCHAR));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new SplfileMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param splfile the splfile
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws Exception the exception
     */
    public List execute(Splfile splfile, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws Exception {

        if (splfile == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ID", splfile.getId());
        inParams.put("P_SPLDATA", splfile.getSpldata());
        inParams.put("P_SPLNAME", splfile.getSplname());
        inParams.put("P_SPLMIME", splfile.getSplmime());
        inParams.put("P_SPLDATE", splfile.getSpldate());
        inParams.put("P_SPLTYPE", splfile.getSpltype());
        inParams.put("P_SPLUSER", splfile.getSpluser());
        inParams.put("P_SPLSTATUS", splfile.getSplstatus());

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

class SplfileMapper implements RowMapper<Splfile> {

    public Splfile mapRow(ResultSet rs, int i) throws SQLException {
        Splfile splfile = new Splfile();
        splfile.setId(rs.getLong("ID"));

        byte[] data = null;
        Blob salida = (Blob) rs.getBlob("SPLDATA");
        if (salida != null) {
            try {
                data = salida.getBytes(1, (int) salida.length());
            } catch (SQLException e) {
                data = null;
            }
        }
        splfile.setSpldata(data);

        splfile.setSplname(rs.getString("SPLNAME"));
        splfile.setSplmime(rs.getString("SPLMIME"));
        splfile.setSpldate(rs.getDate("SPLDATE"));
        splfile.setSpltype(rs.getString("SPLTYPE"));
        splfile.setSpluser(rs.getString("SPLUSER"));
        splfile.setSplstatus(rs.getString("SPLSTATUS"));

        return splfile;
    }
}
