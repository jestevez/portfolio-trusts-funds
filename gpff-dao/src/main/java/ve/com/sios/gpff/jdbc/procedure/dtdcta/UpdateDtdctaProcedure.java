/*
 * UpdateDtdctaProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.dtdcta;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.AuthorizationData;
import ve.com.sios.gpff.beans.Dtdcta;

/**
 * The Class UpdateDtdctaProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 19/02/2014
 */
@Service
public class UpdateDtdctaProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procUpdateDtdcta";

    /**
     * Instantiates a new update dtdcta procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public UpdateDtdctaProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_DTINIF", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTINOC", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTICTA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTINBA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTIEJC", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTITEF", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTINOH", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTICTH", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTINBH", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTIEJH", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTITEH", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTIELN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTIELC", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTIELR", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTIREN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTIREC", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTIRER", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTIAPN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTIAPC", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DTIAPR", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_MSGCODE", Types.INTEGER));
        compile();
    }

    /**
     * Execute.
     *
     * @param dtdcta the dtdcta
     * @param authorizationData the authorization data
     * @return the int
     * @throws Exception the exception
     */
    public int execute(Dtdcta dtdcta, AuthorizationData authorizationData) throws Exception {

        if (dtdcta == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_DTINIF", dtdcta.getDtinif());
        inParams.put("P_DTINOC", dtdcta.getDtinoc());
        inParams.put("P_DTICTA", dtdcta.getDticta());
        inParams.put("P_DTINBA", dtdcta.getDtinba());
        inParams.put("P_DTIEJC", dtdcta.getDtiejc());
        inParams.put("P_DTITEF", dtdcta.getDtitef());
        inParams.put("P_DTINOH", dtdcta.getDtinoh());
        inParams.put("P_DTICTH", dtdcta.getDticth());
        inParams.put("P_DTINBH", dtdcta.getDtinbh());
        inParams.put("P_DTIEJH", dtdcta.getDtiejh());
        inParams.put("P_DTITEH", dtdcta.getDtiteh());
        inParams.put("P_DTIELN", dtdcta.getDtieln());
        inParams.put("P_DTIELC", dtdcta.getDtielc());
        inParams.put("P_DTIELR", dtdcta.getDtielr());
        inParams.put("P_DTIREN", dtdcta.getDtiren());
        inParams.put("P_DTIREC", dtdcta.getDtirec());
        inParams.put("P_DTIRER", dtdcta.getDtirer());
        inParams.put("P_DTIAPN", dtdcta.getDtiapn());
        inParams.put("P_DTIAPC", dtdcta.getDtiapc());
        inParams.put("P_DTIAPR", dtdcta.getDtiapr());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Integer) maps.get("P_MSGCODE");
        } catch (Exception e) {
            logger.error("Error invocando el metodo execute: ", e);
            throw e;
        }
    }

}