package com.politrix.controllers;

import com.politrix.dao.User;
import com.politrix.dao.UserCreationForm;
import com.politrix.dao.UserWebService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by stdavis on 2/17/17.
 */
@RestController
@RequestMapping("/rs")
public class AdminController {
    private static final Logger LOG = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    UserWebService userWebService;

    @RequestMapping(value = "/users", method = RequestMethod.POST, produces = "application/json")
    public String createUser(@RequestBody UserCreationForm newUserForm) {
        return userWebService.createUser(newUserForm.getUsername(), newUserForm.getEmail(),
                newUserForm.getPasswordHash(), newUserForm.getRoles()).toString();
    }

    @RequestMapping(value = "/users/{email}", method = RequestMethod.GET, produces = "application/json")
    public User getUser(String email) {
        return userWebService.getUser(email);
    }
}
