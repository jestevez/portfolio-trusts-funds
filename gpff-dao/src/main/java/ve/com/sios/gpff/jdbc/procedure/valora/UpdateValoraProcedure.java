/*
 * UpdateValoraProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.valora;

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
import ve.com.sios.gpff.beans.Valora;

/**
 * The Class UpdateValoraProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 19/02/2014
 */
@Service
public class UpdateValoraProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procUpdateValora";

    /**
     * Instantiates a new update valora procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public UpdateValoraProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_VLOEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLODEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOCOA", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOCON", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLONOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOUNI", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOLIQ", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLODIV", Types.INTEGER));
        declareParameter(new SqlParameter("P_VLOCLS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOISI", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOCAT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOCBE", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOFIS", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOIIN", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLONMI", Types.INTEGER));
        declareParameter(new SqlParameter("P_VLOFIN", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOPIN", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOIAM", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLONMA", Types.INTEGER));
        declareParameter(new SqlParameter("P_VLOFAM", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOPAM", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOTAM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOMAM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOUDE", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOUCA", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOOUC", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOBEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOFUI", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOFUA", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOFON", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOSE1", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOSE2", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOCME", Types.BIGINT));
        declareParameter(new SqlParameter("P_VLOFAC", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOGAR", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOGAD", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOCBR", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOTUN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOHOR", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOTIP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_VLOSPR", Types.DOUBLE));
        declareParameter(new SqlParameter("P_VLOTFO", Types.INTEGER));
        declareParameter(new SqlParameter("P_VLOTAS", Types.DOUBLE));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_MSGCODE", Types.INTEGER));
        compile();
    }

    /**
     * Execute.
     *
     * @param valora the valora
     * @param authorizationData the authorization data
     * @return the int
     * @throws GpffDaoException the exception
     */
    public int execute(Valora valora, AuthorizationData authorizationData) throws GpffDaoException {

        if (valora == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_VLOEMP", valora.getVloemp());
        inParams.put("P_VLODEL", valora.getVlodel());
        inParams.put("P_VLOCOA", valora.getVlocoa());
        inParams.put("P_VLOCON", valora.getVlocon());
        inParams.put("P_VLONOM", valora.getVlonom());
        inParams.put("P_VLOUNI", valora.getVlouni());
        inParams.put("P_VLOLIQ", valora.getVloliq());
        inParams.put("P_VLODIV", valora.getVlodiv());
        inParams.put("P_VLOCLS", valora.getVlocls());
        inParams.put("P_VLOISI", valora.getVloisi());
        inParams.put("P_VLOCAT", valora.getVlocat());
        inParams.put("P_VLOCBE", valora.getVlocbe());
        inParams.put("P_VLOFIS", valora.getVlofis());
        inParams.put("P_VLOIIN", valora.getVloiin());
        inParams.put("P_VLONMI", valora.getVlonmi());
        inParams.put("P_VLOFIN", valora.getVlofin());
        inParams.put("P_VLOPIN", valora.getVlopin());
        inParams.put("P_VLOIAM", valora.getVloiam());
        inParams.put("P_VLONMA", valora.getVlonma());
        inParams.put("P_VLOFAM", valora.getVlofam());
        inParams.put("P_VLOPAM", valora.getVlopam());
        inParams.put("P_VLOTAM", valora.getVlotam());
        inParams.put("P_VLOMAM", valora.getVlomam());
        inParams.put("P_VLOUDE", valora.getVloude());
        inParams.put("P_VLOUCA", valora.getVlouca());
        inParams.put("P_VLOOUC", valora.getVloouc());
        inParams.put("P_VLOBEL", valora.getVlobel());
        inParams.put("P_VLOFUI", valora.getVlofui());
        inParams.put("P_VLOFUA", valora.getVlofua());
        inParams.put("P_VLOFON", valora.getVlofon());
        inParams.put("P_VLOSE1", valora.getVlose1());
        inParams.put("P_VLOSE2", valora.getVlose2());
        inParams.put("P_VLOCME", valora.getVlocme());
        inParams.put("P_VLOFAC", valora.getVlofac());
        inParams.put("P_VLOGAR", valora.getVlogar());
        inParams.put("P_VLOGAD", valora.getVlogad());
        inParams.put("P_VLOCBR", valora.getVlocbr());
        inParams.put("P_VLOTUN", valora.getVlotun());
        inParams.put("P_VLOHOR", valora.getVlohor());
        inParams.put("P_VLOTIP", valora.getVlotip());
        inParams.put("P_VLOSPR", valora.getVlospr());
        inParams.put("P_VLOTFO", valora.getVlotfo());
        inParams.put("P_VLOTAS", valora.getVlotas());

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