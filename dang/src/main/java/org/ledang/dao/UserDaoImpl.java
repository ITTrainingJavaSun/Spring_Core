package org.ledang.dao;

import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.ledang.entity.User;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDaoImpl implements UserDao {
    final private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void save(User user) {
        getSession().persist(user);
    }

    @Override
    public User findById(long id) {
        return getSession().get(User.class, id);
    }

    @Override
    public User findByUsername(String username) {
        String hql = "FROM User WHERE username = :username";
        return getSession()
                .createQuery(hql, User.class)
                .setParameter("username", username)
                .setMaxResults(1)
                .uniqueResult();
    }

    @Override
    public void update(User user) {
        getSession().merge(user);
    }

    @Override
    public void deleteById(long id) {
        getSession().remove(this.findById(id));
    }

}
