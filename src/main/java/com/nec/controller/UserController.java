package com.nec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nec.entity.User;
import com.nec.repository.UserRepository;

@RestController
@RequestMapping("/postdata")
@CrossOrigin(origins = "https://react-github-push-practice.netlify.app/") 
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // ✅ New endpoint to get all users
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
