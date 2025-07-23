package com.example.dao;

import com.example.model.Product;

import java.util.List;

public interface ProductDao {
    void saveProduct(Product product);
    List<Product> getAllProducts();
}
