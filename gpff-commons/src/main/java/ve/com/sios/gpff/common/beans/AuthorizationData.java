/*
 * AuthorizationData.java
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

package ve.com.sios.gpff.common.beans;

import java.io.Serializable;

/**
 * The Class AuthorizationData.
 *
 * @author Jose Luis Estevez jose.estevez.prieto@gmail.com
 * @version 1.0
 * @date 17/02/2013
 */
public class AuthorizationData implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3256224327914303603L;

    /** The user name. */
    private String userName;

    /** The ip address. */
    private String ipAddress;

    /** The user agent. */
    private String userAgent;

    /** The area of work. */
    private String areaOfWork;

    /**
     * Instantiates a new authorization data.
     *
     * @param userName the user name
     * @param ipAddress the ip address
     * @param userAgent the user agent
     * @param areaOfWork the area of work
     */
    public AuthorizationData(String userName, String ipAddress, String userAgent, String areaOfWork) {
        this.userName = userName;
        this.ipAddress = ipAddress;
        this.userAgent = userAgent;
        this.areaOfWork = areaOfWork;
    }

    /**
     * Gets the ip address.
     *
     * @return the ip address
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Sets the ip address.
     *
     * @param ipAddress the new ip address
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * Gets the user agent.
     *
     * @return the user agent
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * Sets the user agent.
     *
     * @param userAgent the new user agent
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * Gets the user name.
     *
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the user name.
     *
     * @param userName the new user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets the area of work.
     *
     * @return the area of work
     */
    public String getAreaOfWork() {
        return areaOfWork;
    }

    /**
     * Sets the area of work.
     *
     * @param areaOfWork the new area of work
     */
    public void setAreaOfWork(String areaOfWork) {
        this.areaOfWork = areaOfWork;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
        result = prime * result + ((ipAddress == null) ? 0 : ipAddress.hashCode());
        result = prime * result + ((userAgent == null) ? 0 : userAgent.hashCode());
        result = prime * result + ((areaOfWork == null) ? 0 : areaOfWork.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        AuthorizationData other = (AuthorizationData) obj;
        return this.hashCode() == other.hashCode();
    }

}
