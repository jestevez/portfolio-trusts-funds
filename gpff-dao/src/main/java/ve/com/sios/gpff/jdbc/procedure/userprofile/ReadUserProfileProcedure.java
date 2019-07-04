/*
 * ReadUserProfileProcedure.java
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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Service;

import ve.com.sios.gpff.beans.AuthorizationData;
import ve.com.sios.gpff.beans.UserProfile;

/**
 * The Class ReadUserProfileProcedure.
 *
 * @author Soluciones Integrales Open-Source SiOS http://www.sios.com.ve
 * @version 1.0
 * @date 23/09/2013
 */
@Service
public class ReadUserProfileProcedure extends StoredProcedure {

    /** The Constant SP_NAME. */
    private static final String SP_NAME = "procReadUserProfile";

    /**
     * Instantiates a new read user profile procedure.
     *
     * @param dataSource the data source
     */
    @Autowired
    public ReadUserProfileProcedure(DataSource dataSource) {
        super(dataSource, SP_NAME);

        declareParameter(new SqlParameter("P_ID", Types.INTEGER));
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
        declareParameter(new SqlParameter("P_DELETED", Types.VARCHAR));
        declareParameter(new SqlParameter("P_CREATED_AT", Types.TIMESTAMP));
        declareParameter(new SqlParameter("P_CREATED_BY", Types.VARCHAR));
        declareParameter(new SqlParameter("P_UPDATED_AT", Types.TIMESTAMP));
        declareParameter(new SqlParameter("P_UPDATED_BY", Types.VARCHAR));

        declareParameter(new SqlParameter("P_FIRSTRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_MAXRESULT", Types.INTEGER));
        declareParameter(new SqlParameter("P_SORT", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERNAME1", Types.VARCHAR));
        declareParameter(new SqlParameter("P_IPADDRESS", Types.VARCHAR));
        declareParameter(new SqlParameter("P_USERAGENT", Types.VARCHAR));

        declareParameter(new SqlReturnResultSet("RS", new UserProfileMapper()));

        compile();
    }

    /**
     * Execute.
     *
     * @param userProfile the user profile
     * @param firstResult the first result
     * @param maxResults the max results
     * @param sortClause the sort clause
     * @param authorizationData the authorization data
     * @return the list
     * @throws Exception the exception
     */
    public List execute(UserProfile userProfile, int firstResult, int maxResults, String sortClause, AuthorizationData authorizationData)
            throws Exception {

        if (userProfile == null || authorizationData == null) {
            throw new IllegalArgumentException("El metodo execute no se puede llamar con paramentros nulos");
        }

        List list = new ArrayList();
        Map<String, Object> inParams = new HashMap<String, Object>();
        inParams.put("P_ID", userProfile.getId());
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
        inParams.put("P_DELETED", userProfile.getDeleted());
        inParams.put("P_CREATED_AT", userProfile.getCreatedAt());
        inParams.put("P_CREATED_BY", userProfile.getCreatedBy());
        inParams.put("P_UPDATED_AT", userProfile.getUpdatedAt());
        inParams.put("P_UPDATED_BY", userProfile.getUpdatedBy());

        inParams.put("P_FIRSTRESULT", firstResult);
        inParams.put("P_MAXRESULT", maxResults);
        inParams.put("P_SORT", sortClause);
        inParams.put("P_USERNAME1", authorizationData.getUserName());
        inParams.put("P_IPADDRESS", authorizationData.getIpAddress());
        inParams.put("P_USERAGENT", authorizationData.getUserAgent());
        try {
            Map<String, Object> maps = super.execute(inParams);
            for (Iterator it = maps.entrySet().iterator(); it.hasNext();) {
                list = (List) ((Map.Entry) it.next()).getValue();
            }
            return list;
        } catch (Exception e) {
            logger.error("Error invocando el metodo execute: ", e);
            throw e;
        }
    }
}

class UserProfileMapper implements RowMapper<UserProfile> {

    public UserProfile mapRow(ResultSet rs, int i) throws SQLException {
        UserProfile userProfile = new UserProfile();
        userProfile.setId(rs.getInt("ID"));
        userProfile.setUsername(rs.getString("USERNAME"));
        userProfile.setDocumentNumber(rs.getString("DOCUMENT_NUMBER"));
        userProfile.setFirstName(rs.getString("FIRST_NAME"));
        userProfile.setSecondName(rs.getString("SECOND_NAME"));
        userProfile.setLastName(rs.getString("LAST_NAME"));
        userProfile.setSecondLastName(rs.getString("SECOND_LAST_NAME"));
        userProfile.setGender(rs.getString("GENDER"));
        userProfile.setCivilStatus(rs.getString("CIVIL_STATUS"));
        userProfile.setEmail(rs.getString("EMAIL"));
        userProfile.setPhone(rs.getString("PHONE"));
        userProfile.setMobile(rs.getString("MOBILE"));
        userProfile.setBrithday(rs.getDate("BIRTHDAY"));
        userProfile.setEnabled(rs.getString("ENABLED"));
        userProfile.setDeleted(rs.getString("DELETED"));
        userProfile.setCreatedAt(rs.getDate("CREATED_AT"));
        userProfile.setCreatedBy(rs.getString("CREATED_BY"));
        userProfile.setUpdatedAt(rs.getDate("UPDATED_AT"));
        userProfile.setUpdatedBy(rs.getString("UPDATED_BY"));

        return userProfile;
    }
}
