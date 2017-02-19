package com.politrix.dao;

import lombok.Data;

import java.util.Set;

/**
 * Created by stdavis on 2/17/17.
 */
@Data
public class UserCreationForm {
    String email;
    String username;
    String passwordHash;
    Set<UserRoles> roles;
}
