package com.api.HuellitasFelices.controllers;

import com.api.HuellitasFelices.models.UserModel;
import com.api.HuellitasFelices.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ArrayList<UserModel> getUser(){
        return this.userService.getUsers();
    }

    @PostMapping
    public UserModel saveUser(@RequestBody)
 }
