package org.example.repository;

import org.example.entitiy.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {




}
