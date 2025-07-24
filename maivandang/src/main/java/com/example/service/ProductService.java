package com.example.service;

import com.example.dao.ProductDao;
import com.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    @Transactional
    public void saveTwoProductsWithRollback(Product p1, Product p2) {
        productDao.saveProduct(p1);

        // Giả lập lỗi để rollback
        if (true) {
            throw new RuntimeException("Fake Error to rollback Hibernate transaction");
        }

        productDao.saveProduct(p2);
    }
}
