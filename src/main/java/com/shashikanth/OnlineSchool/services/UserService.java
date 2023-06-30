package com.shashikanth.OnlineSchool.services;

import com.shashikanth.OnlineSchool.models.User;
import com.shashikanth.OnlineSchool.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUserByHandle(String handle){
        return userRepository.getUserByHandle(handle);
    }
    public User addUsers(User user){
        return userRepository.save(user);
    }
}
