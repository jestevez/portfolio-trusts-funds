/*
 * UpdateTableHelpProcedure.java
 *
 * Copyright 2013 - Soluciones Integrales Open-Source SiOS
 * Copyright 2013 - Fundacion para la Investigacion y Desarrollo del Software Libre en Venezuela
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
package ve.com.sios.gpff.jdbc.procedure.tablehelp;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.common.beans.AuthorizationData;
import ve.com.sios.gpff.exception.GpffDaoException;
import ve.com.sios.gpff.beans.TableHelp;

/**
 * The Class UpdateTableHelpProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 25/08/2013
 */
@Service
public class UpdateTableHelpProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procUpdateTableHelp";

    /**
     * Instantiates a new update table help procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public UpdateTableHelpProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ID", Types.BIGINT));
        declareParameter(new SqlParameter("P_CODE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_NAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_TABLENAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_TABLECODE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_TABLEDESC", Types.VARCHAR));
        declareParameter(new SqlParameter("P_TABLEPARENT", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        compile();
    }

    /**
     * Execute.
     *
     * @param tableHelp the table help
     * @param authorizationData the authorization data
     * @return true, if successful
     * @throws GpffDaoException the exception
     */
    public boolean execute(TableHelp tableHelp, AuthorizationData authorizationData) throws GpffDaoException {

        if (tableHelp == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ID", tableHelp.getId());
        inParams.put("P_CODE", tableHelp.getCode());
        inParams.put("P_NAME", tableHelp.getName());
        inParams.put("P_TABLENAME", tableHelp.getTableName());
        inParams.put("P_TABLECODE", tableHelp.getTableCode());
        inParams.put("P_TABLEDESC", tableHelp.getTableDesc());
        inParams.put("P_TABLEPARENT", tableHelp.getTableParent());

        inParams.put("P_USERNAME", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return true;
        } catch (Exception e) {
            
            throw new GpffDaoException(e);
        }
    }
}