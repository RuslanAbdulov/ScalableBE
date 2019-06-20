package com.gridu.scalable.be.catalog.domain;

public class Product {

    private Long id;
    private String sku;

    public Product(Long id, String sku) {
        this.id = id;
        this.sku = sku;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
