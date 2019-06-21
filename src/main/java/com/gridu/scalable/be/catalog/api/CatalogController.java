package com.gridu.scalable.be.catalog.api;

import com.gridu.scalable.be.catalog.domain.Product;
import com.gridu.scalable.be.catalog.manager.ProductService;
import com.gridu.scalable.be.catalog.exception.ProductNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class CatalogController {

    private final ProductService productService;

    @Autowired
    public CatalogController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product productById(@PathVariable String id) {
        return productService.findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    @GetMapping("")
    public List<Product> productsBySku2(@RequestParam String sku) {
        return productService.findBySku(sku);
    }

    @GetMapping("/error")
    public String allProducts() {
        throw new ProductNotFoundException("Product not found");
    }

}
