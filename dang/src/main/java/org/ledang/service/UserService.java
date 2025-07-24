package org.ledang.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.ledang.dao.UserDao;
import org.ledang.entity.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    final UserDao userDao;

    @Transactional
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Transactional
    public User findById(long id) {
        return userDao.findById(id);
    }

    @Transactional
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Transactional
    public void updateUser(User user) {
        userDao.update(user);
    }

    @Transactional
    public void deleteById(long id) {
        userDao.deleteById(id);
    }

    @Transactional
    public void testRollback() {
        User user = new User();
        user.setName("Dang");
        user.setUsername("dangne");
        user.setPassword("123456");
        user.setBirthday("2004-08-29");
        userDao.save(user);
        System.out.println("Da luu tai khoan " + user.getUsername() + " vao trong db");
        user.setPassword(null);
        userDao.update(user);
    }

}
