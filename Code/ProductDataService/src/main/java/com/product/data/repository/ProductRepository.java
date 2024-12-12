package com.product.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.data.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String>{

}
