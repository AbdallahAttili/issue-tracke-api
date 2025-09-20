package com.example.issue_tracker.dao;

import com.example.issue_tracker.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends MongoRepository<User, ObjectId> {
    User findByUsername(String username);
    User findByEmail(String email);
}
