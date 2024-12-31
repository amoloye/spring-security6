package org.example.springsecurity6.controller;

import org.example.springsecurity6.entity.User;
import org.example.springsecurity6.repository.UserRepository;
import org.example.springsecurity6.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;




    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }


    @PostMapping("/register")
    public User register(@RequestBody User user){
//        return userRepository.save(user);
        return userService.register(user);


    }
    @GetMapping("/login")
    public String login(@RequestBody User user){

        return userService.verify(user);

    }


}