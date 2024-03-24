package com.lus.dawm.eshop.serviceImpl;

import com.lus.dawm.eshop.model.Product;
import com.lus.dawm.eshop.repository.ProductRepository;
import com.lus.dawm.eshop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product save(Product entity) {
        return productRepository.save(entity);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void delete(Product entity) {
        productRepository.delete(entity);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

}
