package com.politrix.dao;

import com.politrix.dao.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by stdavis on 2/17/17.
 */
@Service
public class UserWebServiceImpl implements UserWebService {
    private static final Logger LOG = LoggerFactory.getLogger(UserWebServiceImpl.class);

    @Autowired
    UserRepository users;

    @Override
    public Boolean createUser(String username, String email, String password, Set<UserRoles> roles) {
        if(users.findUserByEmail(email) != null) {
            LOG.error("User {} with email {} already exists", username, email);
            return false;
        }

        User newUser = new User(email, password, roles);

        return users.save(newUser) != null;
    }

    @Override
    public User getUser(String email) {
        return users.findUserByEmail(email);
    }
}
