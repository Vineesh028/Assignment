package com.product.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.data.entity.PromotionEntity;

public interface PromotionRepository extends JpaRepository<PromotionEntity, String>{

}
