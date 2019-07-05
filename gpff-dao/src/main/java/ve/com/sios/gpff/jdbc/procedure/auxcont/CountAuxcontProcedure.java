/*
 * CountAuxcontProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.auxcont;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;
import ve.com.sios.gpff.beans.Auxcont;

/**
 * The Class CountAuxcontProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 17/05/2014
 */
@Service
public class CountAuxcontProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCountAuxcont";

    /**
     * Instantiates a new count auxcont procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CountAuxcontProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_AXCARE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_AXCNCT", Types.BIGINT));
        declareParameter(new SqlParameter("P_AXCCAP", Types.INTEGER));
        declareParameter(new SqlParameter("P_AXCCPP", Types.INTEGER));
        declareParameter(new SqlParameter("P_AXCAMP", Types.INTEGER));
        declareParameter(new SqlParameter("P_AXCEDM", Types.INTEGER));
        declareParameter(new SqlParameter("P_AXCEMH", Types.INTEGER));
        declareParameter(new SqlParameter("P_AXCEMM", Types.INTEGER));
        declareParameter(new SqlParameter("P_AXCPRT", Types.DOUBLE));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("TOTAL", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param auxcont the auxcont
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Auxcont auxcont, AuthorizationData authorizationData) throws GpffDaoException {

        if (auxcont == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_AXCARE", auxcont.getAxcare());
        inParams.put("P_AXCNCT", auxcont.getAxcnct());
        inParams.put("P_AXCCAP", auxcont.getAxccap());
        inParams.put("P_AXCCPP", auxcont.getAxccpp());
        inParams.put("P_AXCAMP", auxcont.getAxcamp());
        inParams.put("P_AXCEDM", auxcont.getAxcedm());
        inParams.put("P_AXCEMH", auxcont.getAxcemh());
        inParams.put("P_AXCEMM", auxcont.getAxcemm());
        inParams.put("P_AXCPRT", auxcont.getAxcprt());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Integer) maps.get("TOTAL");
        } catch (Exception e) {
            
            throw new GpffDaoException(e);
        }
    }

}
