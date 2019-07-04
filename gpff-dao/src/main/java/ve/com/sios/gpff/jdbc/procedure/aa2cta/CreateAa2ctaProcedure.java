/*
 * CreateAa2ctaProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.aa2cta;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.Aa2cta;
import ve.com.sios.gpff.beans.AuthorizationData;

/**
 * The Class CreateAa2ctaProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 31/03/2014
 */
@Service
public class CreateAa2ctaProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCreateAa2cta";

    /**
     * Instantiates a new creates the aa 2 cta procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CreateAa2ctaProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_CTAEMP", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTADEL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTADIV", Types.INTEGER));
        declareParameter(new SqlParameter("P_CTAGEN", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTACTE", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTACAT", Types.INTEGER));
        declareParameter(new SqlParameter("P_CTASUB", Types.INTEGER));
        declareParameter(new SqlParameter("P_CTATCT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTANOM", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTAMDD", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTAMDC", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTAMED", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTAMEC", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTAAPE", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTAULM", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTACAN", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTABLO", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTALIQ", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTAFRL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTAIID", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTAFID", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTATDB", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTASDB", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTAIND", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTAIMD", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTAIXD", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTAIIC", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTAFIC", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTATCR", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTASCR", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTAINC", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTAIMC", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTAIXC", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTALIM", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTAIEX", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTACOM", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTALCD", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTALCC", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTAILC", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTAILD", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTAAID", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTAAIA", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTAARE", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTABL1", Types.INTEGER));
        declareParameter(new SqlParameter("P_CTABL2", Types.INTEGER));
        declareParameter(new SqlParameter("P_CTABCD", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTABCC", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTABBD", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTABBC", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTABSD", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTABSC", Types.BIGINT));
        declareParameter(new SqlParameter("P_CTASFD", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTASFP", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTASDI", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTASPT", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTASVD", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTASVP", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTABL4", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTAFRE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTASIT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTARES", Types.INTEGER));
        declareParameter(new SqlParameter("P_CTACGE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CTAADD", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTAADC", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTAAPD", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTAAPC", Types.DOUBLE));
        declareParameter(new SqlParameter("P_CTADPR", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlOutParameter("P_MSGCODE", Types.INTEGER));
        compile();
    }

    /**
     * Execute.
     *
     * @param aa2cta the aa 2 cta
     * @param authorizationData the authorization data
     * @return the int
     * @throws Exception the exception
     */
    public int execute(Aa2cta aa2cta, AuthorizationData authorizationData) throws Exception {

        if (aa2cta == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_CTAEMP", aa2cta.getCtaemp());
        inParams.put("P_CTADEL", aa2cta.getCtadel());
        inParams.put("P_CTADIV", aa2cta.getCtadiv());
        inParams.put("P_CTAGEN", aa2cta.getCtagen());
        inParams.put("P_CTACTE", aa2cta.getCtacte());
        inParams.put("P_CTACAT", aa2cta.getCtacat());
        inParams.put("P_CTASUB", aa2cta.getCtasub());
        inParams.put("P_CTATCT", aa2cta.getCtatct());
        inParams.put("P_CTANOM", aa2cta.getCtanom());
        inParams.put("P_CTAMDD", aa2cta.getCtamdd());
        inParams.put("P_CTAMDC", aa2cta.getCtamdc());
        inParams.put("P_CTAMED", aa2cta.getCtamed());
        inParams.put("P_CTAMEC", aa2cta.getCtamec());
        inParams.put("P_CTAAPE", aa2cta.getCtaape());
        inParams.put("P_CTAULM", aa2cta.getCtaulm());
        inParams.put("P_CTACAN", aa2cta.getCtacan());
        inParams.put("P_CTABLO", aa2cta.getCtablo());
        inParams.put("P_CTALIQ", aa2cta.getCtaliq());
        inParams.put("P_CTAFRL", aa2cta.getCtafrl());
        inParams.put("P_CTAIID", aa2cta.getCtaiid());
        inParams.put("P_CTAFID", aa2cta.getCtafid());
        inParams.put("P_CTATDB", aa2cta.getCtatdb());
        inParams.put("P_CTASDB", aa2cta.getCtasdb());
        inParams.put("P_CTAIND", aa2cta.getCtaind());
        inParams.put("P_CTAIMD", aa2cta.getCtaimd());
        inParams.put("P_CTAIXD", aa2cta.getCtaixd());
        inParams.put("P_CTAIIC", aa2cta.getCtaiic());
        inParams.put("P_CTAFIC", aa2cta.getCtafic());
        inParams.put("P_CTATCR", aa2cta.getCtatcr());
        inParams.put("P_CTASCR", aa2cta.getCtascr());
        inParams.put("P_CTAINC", aa2cta.getCtainc());
        inParams.put("P_CTAIMC", aa2cta.getCtaimc());
        inParams.put("P_CTAIXC", aa2cta.getCtaixc());
        inParams.put("P_CTALIM", aa2cta.getCtalim());
        inParams.put("P_CTAIEX", aa2cta.getCtaiex());
        inParams.put("P_CTACOM", aa2cta.getCtacom());
        inParams.put("P_CTALCD", aa2cta.getCtalcd());
        inParams.put("P_CTALCC", aa2cta.getCtalcc());
        inParams.put("P_CTAILC", aa2cta.getCtailc());
        inParams.put("P_CTAILD", aa2cta.getCtaild());
        inParams.put("P_CTAAID", aa2cta.getCtaaid());
        inParams.put("P_CTAAIA", aa2cta.getCtaaia());
        inParams.put("P_CTAARE", aa2cta.getCtaare());
        inParams.put("P_CTABL1", aa2cta.getCtabl1());
        inParams.put("P_CTABL2", aa2cta.getCtabl2());
        inParams.put("P_CTABCD", aa2cta.getCtabcd());
        inParams.put("P_CTABCC", aa2cta.getCtabcc());
        inParams.put("P_CTABBD", aa2cta.getCtabbd());
        inParams.put("P_CTABBC", aa2cta.getCtabbc());
        inParams.put("P_CTABSD", aa2cta.getCtabsd());
        inParams.put("P_CTABSC", aa2cta.getCtabsc());
        inParams.put("P_CTASFD", aa2cta.getCtasfd());
        inParams.put("P_CTASFP", aa2cta.getCtasfp());
        inParams.put("P_CTASDI", aa2cta.getCtasdi());
        inParams.put("P_CTASPT", aa2cta.getCtaspt());
        inParams.put("P_CTASVD", aa2cta.getCtasvd());
        inParams.put("P_CTASVP", aa2cta.getCtasvp());
        inParams.put("P_CTABL4", aa2cta.getCtabl4());
        inParams.put("P_CTAFRE", aa2cta.getCtafre());
        inParams.put("P_CTASIT", aa2cta.getCtasit());
        inParams.put("P_CTARES", aa2cta.getCtares());
        inParams.put("P_CTACGE", aa2cta.getCtacge());
        inParams.put("P_CTAADD", aa2cta.getCtaadd());
        inParams.put("P_CTAADC", aa2cta.getCtaadc());
        inParams.put("P_CTAAPD", aa2cta.getCtaapd());
        inParams.put("P_CTAAPC", aa2cta.getCtaapc());
        inParams.put("P_CTADPR", aa2cta.getCtadpr());

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
