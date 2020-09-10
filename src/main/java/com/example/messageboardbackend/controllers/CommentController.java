package com.example.messageboardbackend.controllers;

import com.example.messageboardbackend.models.Comment;
import com.example.messageboardbackend.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/allcomments")
    public List<Comment> getComments(){
        List<Comment> comments = commentService.getAll();
        return comments;
    }

    @PostMapping("/addcomment")
    public Comment addComment(@RequestBody Comment newComment){
        return commentService.create(newComment);
    }
}
