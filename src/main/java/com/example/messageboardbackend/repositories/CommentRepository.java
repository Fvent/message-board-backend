package com.example.messageboardbackend.repositories;

import com.example.messageboardbackend.models.Comment;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
    Comment findBy_id(ObjectId _id);

    Comment findByUser(String user);

    Comment findByComment(String comment);
}
