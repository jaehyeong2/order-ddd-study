package com.example.order.business.product.infrastructure;

import com.example.order.business.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}