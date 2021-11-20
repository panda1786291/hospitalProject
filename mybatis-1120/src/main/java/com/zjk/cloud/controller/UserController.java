package com.zjk.cloud.controller;

import com.zjk.cloud.entity.User;
import com.zjk.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //username=zjk&userAge=25&email=123@qq.com
    @PostMapping("/user")
    public int createUser(User user){
        return userService.createUser(user);
    }
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id")Long id){
        return userService.queryById(id);
    }
}
