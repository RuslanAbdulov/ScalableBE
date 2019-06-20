package com.gridu.scalable.be.catalog.repository;

import com.gridu.scalable.be.catalog.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(new Product(id, "generic"));
    }

    public List<Product> findBySku(String sku) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L, sku));
        products.add(new Product(2L, sku));

        return products;
    }
}
