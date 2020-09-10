package com.example.messageboardbackend.services;

import com.example.messageboardbackend.models.User;
import com.example.messageboardbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public User getUserByName(String name){
        return userRepository.findByName(name);
    }

    public User getUserByAlias(String alias){
        return userRepository.findByAlias(alias);
    }

    public User getUserByNameAndPassword(String name, String password) { return userRepository. findByNameAndPassword(name, password); }

    public User create(User user){
        return userRepository.save(user);
    }
}