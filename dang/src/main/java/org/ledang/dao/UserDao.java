package org.ledang.dao;

import org.ledang.entity.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    User findById(long id);
    User findByUsername(String username);
    void update(User user);
    void deleteById(long id);
}
