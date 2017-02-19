package com.politrix.dao;

import com.politrix.individual.Individual;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Optional;
import java.util.Set;

/**
 * Created by stdavis on 2/5/17.
 */
@Data
@Document(collection="users")
public class User {
    @Id
    String email;

    String passwordHash;

    Set<UserRoles> roles;

    //Optional<Individual> self;

    public enum UserFields {
        EMAIL("email"),
        PASSWORD_HASH("passwordHash"),
        ROLES("roles"),
        SELF("self");

        private final String fieldName;

        UserFields(String fieldName) { this.fieldName = fieldName; }
    }

    public User(String email, String passwordHash, Set<UserRoles> roles) {
        this.email = email;
        this.passwordHash = passwordHash;
        this.roles = roles;
    }
}
