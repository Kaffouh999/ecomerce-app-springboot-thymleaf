package com.lus.dawm.eshop.service;

import com.lus.dawm.eshop.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public Product save(Product entity);

    public Optional<Product> findById(Long id);

    public void delete(Product entity);

    public List<Product> findAll();
}
