/*
 * UpdateAa2tfisProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2tfis;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2tfis;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class UpdateAa2tfisProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 01/04/2014
 */
@Service
public class UpdateAa2tfisProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procUpdateAa2tfis";

    /**
     * Instantiates a new update aa 2 tfis procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public UpdateAa2tfisProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ROWID", Types.BIGINT));
        declareParameter(new SqlParameter("P_FISEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FISDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FISCLA", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISNOR", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISBEL", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISBE1", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISDIV", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISINV", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISGIN", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISCAP", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISRDI", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISRD1", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISCOR", Types.DOUBLE));
        declareParameter(new SqlParameter("P_FISIVA", Types.DOUBLE));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_MSGCODE", Types.INTEGER));
        compile();
    }

    /**
     * Execute.
     *
     * @param aa2tfis the aa 2 tfis
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Aa2tfis aa2tfis, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2tfis == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", aa2tfis.getRowid());
        inParams.put("P_FISEMP", aa2tfis.getFisemp());
        inParams.put("P_FISDEL", aa2tfis.getFisdel());
        inParams.put("P_FISCLA", aa2tfis.getFiscla());
        inParams.put("P_FISNOR", aa2tfis.getFisnor());
        inParams.put("P_FISBEL", aa2tfis.getFisbel());
        inParams.put("P_FISBE1", aa2tfis.getFisbe1());
        inParams.put("P_FISDIV", aa2tfis.getFisdiv());
        inParams.put("P_FISINV", aa2tfis.getFisinv());
        inParams.put("P_FISGIN", aa2tfis.getFisgin());
        inParams.put("P_FISCAP", aa2tfis.getFiscap());
        inParams.put("P_FISRDI", aa2tfis.getFisrdi());
        inParams.put("P_FISRD1", aa2tfis.getFisrd1());
        inParams.put("P_FISCOR", aa2tfis.getFiscor());
        inParams.put("P_FISIVA", aa2tfis.getFisiva());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Integer) maps.get("P_MSGCODE");
        } catch (Exception e) {
            
            throw new GpffDaoException(e);
        }
    }

}
