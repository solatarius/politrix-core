package com.politrix.dao;

import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by stdavis on 2/17/17.
 */

public interface UserWebService {
    Boolean createUser(String username, String email, String password, Set<UserRoles> roles);
    User getUser(String email);
}
