package com.gridu.scalable.be.catalog.manager;

import com.gridu.scalable.be.catalog.domain.Product;
import com.gridu.scalable.be.catalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Optional<Product> findById(String id) {
        return productRepository.findById(id);
    }

    public List<Product> findBySku(String sku) {
        return productRepository.findBySku(sku);
    }

}
