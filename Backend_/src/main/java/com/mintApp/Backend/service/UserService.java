package com.mintApp.Backend.service;


import com.mintApp.Backend.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    String saveUser(User user);

    Iterable<User> getAllUser();

}
