package com.gridu.scalable.be.catalog.repository;

import com.github.skjolber.unzip.FileEntryHandler;
import com.github.skjolber.unzip.FileEntryStreamHandler;
import com.gridu.scalable.be.catalog.domain.Product;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.concurrent.ThreadPoolExecutor;

@Repository
public class ProductRepository {

    private Map<String, Product> idKeyMap = new HashMap<>();
    private Map<String, Product> skuKeyMap = new HashMap<>();

    public Optional<Product> findById(String id) {
        return Optional.ofNullable(new Product(id, "generic"));
    }

    public List<Product> findBySku(String sku) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("1", sku));
        products.add(new Product("2", sku));

        return products;
    }

    @PostConstruct
    public void prepareMap() {
        FileEntryHandler handler = new FileEntryHandler() {
            @Override
            public void beginFileCollection(String name) {

            }

            @Override
            public void beginFileEntry(String name) {

            }

            @Override
            public FileEntryStreamHandler getFileEntryStreamHandler(String name, long size, ThreadPoolExecutor executor) throws Exception {
                return null;
            }

            @Override
            public void endFileEntry(String name, ThreadPoolExecutor executor) {

            }

            @Override
            public void endFileCollection(String name, ThreadPoolExecutor executor) {

            }
        };

//        ZipFileEngine engine = new ZipFileEngine(handler);
//        boolean success = engine.handle(new FileZipFileFactory(file));

    }
}
