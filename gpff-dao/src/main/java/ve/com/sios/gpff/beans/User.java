/*
 * StringUtilities.java
 *
 * Copyright 2012 Banco Agrícola de Venezuela www.bav.com.ve.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package ve.com.sios.gpff.beans;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * The Class User.
 *
 * @author Jose Luis Estevez jestevez@indesoft.org.ve jose.estevez.prieto@gmail.com
 * @version 1.0
 * @date 06/12/2012
 */
public class User implements UserDetails {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3768764334070760494L;

    /** The user. */
    private String user;

    /** The identification. */
    private String identification;

    /** The name. */
    private String name;

    /**
     * Gets the identification.
     *
     * @return the identification
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * Sets the identification.
     *
     * @param identification the new identification
     */
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the user.
     *
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the user.
     *
     * @param user the new user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.springframework.security.core.userdetails.UserDetails#getAuthorities()
     */
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> list = new ArrayList<GrantedAuthority>();

        return list;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonExpired()
     */
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonLocked()
     */
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.springframework.security.core.userdetails.UserDetails#isCredentialsNonExpired()
     */
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.springframework.security.core.userdetails.UserDetails#isEnabled()
     */
    public boolean isEnabled() {
        return true;
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.springframework.security.core.userdetails.UserDetails#getPassword()
     */
    public String getPassword() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.springframework.security.core.userdetails.UserDetails#getUsername()
     */
    public String getUsername() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
