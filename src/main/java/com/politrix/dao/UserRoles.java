package com.politrix.dao;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by stdavis on 2/7/17.
 */
public enum UserRoles implements GrantedAuthority {
    ADMIN("admin"),
    BASIC("basic"),
    REPRESENTATIVE("representative");

    private final String grantedAuthority;

    UserRoles(String grantedAuthority) { this.grantedAuthority = grantedAuthority.toLowerCase(); }

    @Override
    public String getAuthority() {
        return grantedAuthority;
    }
}
