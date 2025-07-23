package com.example.dao;

import com.example.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

public class UserDaoImpl implements UserDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
    }
}
