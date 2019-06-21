package com.gridu.scalable.be.catalog.repository;

import com.gridu.scalable.be.catalog.domain.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductContainer {

    private Map<String, Product> idKeyMap = new HashMap<>();
    private Map<String, Product> skuKeyMap = new HashMap<>();


}
