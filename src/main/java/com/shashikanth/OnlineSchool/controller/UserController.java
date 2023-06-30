package com.shashikanth.OnlineSchool.controller;

import com.shashikanth.OnlineSchool.models.User;
import com.shashikanth.OnlineSchool.services.UserService;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user/")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping()
    public User getUserByHandle(@RequestParam String handle){
        return userService.getUserByHandle(handle);
    }

    @PostMapping()
    public User addUsers(@RequestBody  User user){
        return userService.addUsers(user);
    }
}
