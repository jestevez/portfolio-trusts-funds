/*
 * ReadMfondoinPenProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.mfondoinpen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;
import ve.com.sios.gpff.beans.MfondoinPen;

/**
 * The Class ReadMfondoinPenProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 09/06/2014
 */
@Service
public class ReadMfondoinPenProcedure extends StoredProcedure {

    /** The Constant bundle. */
    public static final ResourceBundle bundle = ResourceBundle.getBundle("gpff");

    /** The Constant AS400_LIBRARY. */
    public static final String AS400_LIBRARY = bundle.getString("as400.library");

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadMfondoinPen";

    /**
     * Instantiates a new read mfondoin pen procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadMfondoinPenProcedure(DataSource dataSource) {
        super(dataSource, AS400_LIBRARY + "." + SP_NAME);

        declareParameter(new SqlParameter("P_MFOEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_MFODEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new MfondoinPenMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param mfondoinPen the mfondoin pen
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws GpffDaoException the exception
     */
    public List execute(MfondoinPen mfondoinPen, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData)
            throws GpffDaoException {

        if (mfondoinPen == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_MFOEMP", mfondoinPen.getArea().substring(0, 2));
        inParams.put("P_MFODEL", mfondoinPen.getArea().substring(2, 4));
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

class MfondoinPenMapper implements RowMapper<MfondoinPen> {

    public MfondoinPen mapRow(ResultSet rs, int i) throws SQLException {
        MfondoinPen mfondoinPen = new MfondoinPen();
        mfondoinPen.setArea(rs.getString("AREA"));
        mfondoinPen.setNombre(rs.getString("NOMBRE"));
        mfondoinPen.setConcepto(rs.getString("CONCEPTO"));
        mfondoinPen.setMfoadq(rs.getInt("MFOADQ"));
        mfondoinPen.setMonto(rs.getDouble("MONTO"));
        return mfondoinPen;
    }
}
