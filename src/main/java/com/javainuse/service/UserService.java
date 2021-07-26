package com.javainuse.service;

import com.javainuse.model.User;
import com.javainuse.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> listUser(){
        return userRepository.findAll();
    }
    public User addUser(User user){
        return userRepository.save(user);
    }
    public User findUser(User user){
        if (user.getPassword().equals(userRepository.getOne(user.getUsername()).getPassword()))
            return userRepository.getOne(user.getUsername());
        else return null;
    }
}
