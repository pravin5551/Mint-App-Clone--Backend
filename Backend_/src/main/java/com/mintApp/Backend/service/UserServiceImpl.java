package com.mintApp.Backend.service;


import com.mintApp.Backend.entity.User;
import com.mintApp.Backend.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;


    @Override
    public String saveUser(User user) {
        userDAO.save(user);
        return "Signup successfully";
    }


    @Override
    public Iterable<User> getAllUser() {
        return userDAO.findAll();
    }


}
