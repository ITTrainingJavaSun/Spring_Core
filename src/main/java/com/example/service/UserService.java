package com.example.service;

import com.example.dao.UserDao;
import com.example.model.User;
import org.springframework.transaction.annotation.Transactional;

public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public void registerUser(String name) {
        User user = new User(name);
        userDao.save(user);
    }
}
