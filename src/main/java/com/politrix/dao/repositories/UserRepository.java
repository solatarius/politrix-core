package com.politrix.dao.repositories;

import com.politrix.dao.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by stdavis on 2/5/17.
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findUserByEmail(String email);
}
