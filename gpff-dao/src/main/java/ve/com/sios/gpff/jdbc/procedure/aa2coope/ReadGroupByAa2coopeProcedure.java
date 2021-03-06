/*
 * ReadAa2coopeProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2coope;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.*;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;
import ve.com.sios.gpff.beans.Aa2coope;
    

/**
 * @date 10/03/2014
 *
 * @version 1.0
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 */
@Service
public class ReadGroupByAa2coopeProcedure extends StoredProcedure implements Serializable {

    

    
    private static final String SP_NAME = "procReadGroupByAa2coope";
    
    @Autowired
    public ReadGroupByAa2coopeProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);
        
        declareParameter(new SqlParameter("P_COPEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_COPDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new Aa2coopeGroupByMapper()));
        
        compile();
    }

    public List execute(Aa2coope aa2coope, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData) throws GpffDaoException{
        
        if(aa2coope == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }
        
        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_COPEMP", aa2coope.getCopemp());
        inParams.put("P_COPDEL", aa2coope.getCopdel());
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
class Aa2coopeGroupByMapper implements RowMapper<Aa2coope> {

    public Aa2coope mapRow(ResultSet rs, int i) throws SQLException {
    Aa2coope aa2coope = new Aa2coope();
    aa2coope.setCopcli(rs.getString("COPCLI"));
    aa2coope.setCopope(rs.getString("COPOPE"));
    aa2coope.setCopmod(rs.getString("COPMOD"));
        return aa2coope;
    }
}
