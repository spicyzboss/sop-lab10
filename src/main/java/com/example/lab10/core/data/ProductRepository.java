package com.example.lab10.core.data;

import com.example.lab10.core.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
    ProductEntity findByProductId(String productId);

    ProductEntity findByProductIdOrTitle(String productId, String title);
}
