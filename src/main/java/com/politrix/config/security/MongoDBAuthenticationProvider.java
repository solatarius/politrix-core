package com.politrix.config.security;

import com.google.common.collect.Sets;
import com.politrix.dao.User;
import com.politrix.dao.UserRoles;
import com.politrix.dao.repositories.UserRepository;
import org.jongo.MongoCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.HashSet;

/**
 * Created by stdavis on 2/11/17.
 */
@Service
public class MongoDBAuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {
    @Autowired
    private MongoCollection users;

    @Autowired
    UserRepository userRepository;

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken) throws AuthenticationException {

    }

    @Override
    protected UserDetails retrieveUser(String email, UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken) throws AuthenticationException {

        User test = new User("test", "pass", Sets.newHashSet(UserRoles.ADMIN));
        userRepository.save(test);

        UserDetails loadedUser;
        User user = users.findOne("{#: #}", User.UserFields.EMAIL, email).as(User.class);
        User repo = userRepository.findUserByEmail(email);
        loadedUser = new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPasswordHash(), user.getRoles());

        if(loadedUser == null)
            throw new InternalAuthenticationServiceException("UserDetailsService returned null, which is a interface contract violation");

        return loadedUser;
    }
}
