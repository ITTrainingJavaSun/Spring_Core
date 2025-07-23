package com.example.dao;

import com.example.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    @Override
    public void saveProduct(Product product) {

        sessionFactory.getCurrentSession().save(product);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Product> getAllProducts() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Product", Product.class)
                .list();
    }
}
