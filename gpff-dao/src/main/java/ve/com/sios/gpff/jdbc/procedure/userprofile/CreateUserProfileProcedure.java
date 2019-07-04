/*
 * CreateUserProfileProcedure.java
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
package ve.com.sios.gpff.jdbc.procedure.userprofile;

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
import ve.com.sios.gpff.beans.UserProfile;

/**
 * The Class CreateUserProfileProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 23/09/2013
 */
@Service
public class CreateUserProfileProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procCreateUserProfile";

    /**
     * Instantiates a new creates the user profile procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public CreateUserProfileProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_USERNAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_DOCUMENT_NUMBER", Types.VARCHAR));
        declareParameter(new SqlParameter("P_FIRST_NAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_SECOND_NAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_LAST_NAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_SECOND_LAST_NAME", Types.VARCHAR));
        declareParameter(new SqlParameter("P_GENDER", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CIVIL_STATUS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_EMAIL", Types.VARCHAR));
        declareParameter(new SqlParameter("P_PHONE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_MOBILE", Types.VARCHAR));
        declareParameter(new SqlParameter("P_BIRTHDAY", Types.DATE));
        declareParameter(new SqlParameter("P_ENABLED", Types.VARCHAR));

        declareParameter(new SqlParameter("P_USER", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));
        declareParameter(new SqlOutParameter("P_ID", Types.INTEGER));

        compile();
    }

    /**
     * Execute.
     *
     * @param userProfile the user profile
     * @param authorizationData the authorization data
     * @return the int
     * @throws Exception the exception
     */
    public int execute(UserProfile userProfile, AuthorizationData authorizationData) throws Exception {

        if (userProfile == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_USERNAME", userProfile.getUsername());
        inParams.put("P_DOCUMENT_NUMBER", userProfile.getDocumentNumber());
        inParams.put("P_FIRST_NAME", userProfile.getFirstName());
        inParams.put("P_SECOND_NAME", userProfile.getSecondName());
        inParams.put("P_LAST_NAME", userProfile.getLastName());
        inParams.put("P_SECOND_LAST_NAME", userProfile.getSecondLastName());
        inParams.put("P_GENDER", userProfile.getGender());
        inParams.put("P_CIVIL_STATUS", userProfile.getCivilStatus());
        inParams.put("P_EMAIL", userProfile.getEmail());
        inParams.put("P_PHONE", userProfile.getPhone());
        inParams.put("P_MOBILE", userProfile.getMobile());
        inParams.put("P_BIRTHDAY", userProfile.getBrithday());
        inParams.put("P_ENABLED", userProfile.getEnabled());
        inParams.put("P_USER", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);

            return (Integer) maps.get("P_ID");
        } catch (Exception e) {
            logger.error("Error invocando el metodo execute: ", e);
            throw e;
        }
    }
}