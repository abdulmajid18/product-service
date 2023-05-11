package com.rozz.productservice.repository;

import com.rozz.productservice.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ProductRepository extends CrudRepository<Product, UUID> {
    
}
