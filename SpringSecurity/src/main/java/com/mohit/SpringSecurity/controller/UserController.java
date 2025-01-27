package com.mohit.SpringSecurity.controller;

import com.mohit.SpringSecurity.model.Users;
import com.mohit.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users  register(@RequestBody Users user){

        return service.register(user);
    }

}
