package com.example.messageboardbackend.repositories;

import com.example.messageboardbackend.models.User;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findBy_id(ObjectId _id);

    User findByName(String name);

    User findByAlias(String alias);

    User findByNameAndPassword(String name, String password);

}
