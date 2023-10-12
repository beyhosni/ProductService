package com.progammingTech.productserviceMaven.repository;

import com.progammingTech.productserviceMaven.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}