package com.example.messageboardbackend.controllers;

import com.example.messageboardbackend.services.UserService;
import com.example.messageboardbackend.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getuserbyname/{name}")
    public User getUserFromName(@PathVariable("name") String name){
        return userService.getUserByName(name);
    }

    @GetMapping("/getuserbyalias/{alias}")
    public User getUserFromAlias(@PathVariable("alias") String alias){
        return userService.getUserByAlias(alias);
    }

    @PostMapping("/userlogin")
    public User loginAuthentication(@RequestBody User user){
        return userService.getUserByNameAndPassword(user.getName(),user.getPassword());
    }

    @PostMapping("/registeruser")
    public User addUser(@RequestBody User newUser){
        return userService.create(newUser);
    }

}
