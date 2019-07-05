/*
 * UpdateCgmaxminProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.cgmaxmin;

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
import ve.com.sios.gpff.beans.Cgmaxmin;

/**
 * The Class UpdateCgmaxminProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 25/03/2014
 */
@Service
public class UpdateCgmaxminProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procUpdateCgmaxmin";

    /**
     * Instantiates a new update cgmaxmin procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public UpdateCgmaxminProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ROWID", Types.BIGINT));
        declareParameter(new SqlParameter("P_CGMEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CGMDEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CGMFMT", Types.INTEGER));
        declareParameter(new SqlParameter("P_CGMNCT", Types.INTEGER));
        declareParameter(new SqlParameter("P_CGMCLI", Types.INTEGER));
        declareParameter(new SqlParameter("P_CGMCOD", Types.INTEGER));
        declareParameter(new SqlParameter("P_CGMMAX", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMMIN", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMDS1", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMHS1", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMPR1", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMDS2", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMHS2", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMPR2", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMDS3", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMHS3", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMPR3", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMDS4", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMHS4", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMPR4", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMDS5", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMHS5", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMPR5", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMDS6", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMHS6", Types.DECIMAL));
        declareParameter(new SqlParameter("P_CGMPR6", Types.DECIMAL));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_MSGCODE", Types.INTEGER));
        compile();
    }

    /**
     * Execute.
     *
     * @param cgmaxmin the cgmaxmin
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Cgmaxmin cgmaxmin, AuthorizationData authorizationData) throws GpffDaoException {

        if (cgmaxmin == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ROWID", cgmaxmin.getRowid());
        inParams.put("P_CGMEMP", cgmaxmin.getCgmemp());
        inParams.put("P_CGMDEL", cgmaxmin.getCgmdel());
        inParams.put("P_CGMFMT", cgmaxmin.getCgmfmt());
        inParams.put("P_CGMNCT", cgmaxmin.getCgmnct());
        inParams.put("P_CGMCLI", cgmaxmin.getCgmcli());
        inParams.put("P_CGMCOD", cgmaxmin.getCgmcod());
        inParams.put("P_CGMMAX", cgmaxmin.getCgmmax());
        inParams.put("P_CGMMIN", cgmaxmin.getCgmmin());
        inParams.put("P_CGMDS1", cgmaxmin.getCgmds1());
        inParams.put("P_CGMHS1", cgmaxmin.getCgmhs1());
        inParams.put("P_CGMPR1", cgmaxmin.getCgmpr1());
        inParams.put("P_CGMDS2", cgmaxmin.getCgmds2());
        inParams.put("P_CGMHS2", cgmaxmin.getCgmhs2());
        inParams.put("P_CGMPR2", cgmaxmin.getCgmpr2());
        inParams.put("P_CGMDS3", cgmaxmin.getCgmds3());
        inParams.put("P_CGMHS3", cgmaxmin.getCgmhs3());
        inParams.put("P_CGMPR3", cgmaxmin.getCgmpr3());
        inParams.put("P_CGMDS4", cgmaxmin.getCgmds4());
        inParams.put("P_CGMHS4", cgmaxmin.getCgmhs4());
        inParams.put("P_CGMPR4", cgmaxmin.getCgmpr4());
        inParams.put("P_CGMDS5", cgmaxmin.getCgmds5());
        inParams.put("P_CGMHS5", cgmaxmin.getCgmhs5());
        inParams.put("P_CGMPR5", cgmaxmin.getCgmpr5());
        inParams.put("P_CGMDS6", cgmaxmin.getCgmds6());
        inParams.put("P_CGMHS6", cgmaxmin.getCgmhs6());
        inParams.put("P_CGMPR6", cgmaxmin.getCgmpr6());

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
