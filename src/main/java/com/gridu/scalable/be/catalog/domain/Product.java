package com.gridu.scalable.be.catalog.domain;

public class Product {

    /*
        uniq_id	sku	name_title	description	list_price	sale_price	category	category_tree	average_product_rating	product_url	product_image_urls	brand	total_number_reviews	Reviews
     */
    private String id;
    private String sku;

    public Product(String id, String sku) {
        this.id = id;
        this.sku = sku;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
