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
        userDao.saveUser(user);
    }

    @Transactional
    public void saveTwoUsersWithRollback(User user1, User user2) {
        userDao.saveUser(user1);

        // Giả lập lỗi để kiểm tra rollback
        if (true) {
            throw new RuntimeException("Intentional Exception to trigger rollback");
        }

        userDao.saveUser(user2);
    }
}
