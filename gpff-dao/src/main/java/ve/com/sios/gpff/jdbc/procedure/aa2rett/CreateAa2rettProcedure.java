/*
 * CreateAa2rettProcedure.java
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

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2rett;
import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;

/**
 * The Class CreateAa2rettProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 28/02/2014
 */
@Service
public class CreateAa2rettProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCreateAa2rett";

    /**
     * Instantiates a new creates the aa 2 rett procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CreateAa2rettProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_RTTCOD", Types.VARCHAR));
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

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_RTTCOD_O", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param aa2rett the aa 2 rett
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Aa2rett aa2rett, AuthorizationData authorizationData) throws GpffDaoException {

        if (aa2rett == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

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
        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Integer) maps.get("P_RTTCOD_O");
        } catch (Exception e) {
            
            throw new GpffDaoException(e);
        }
    }

}