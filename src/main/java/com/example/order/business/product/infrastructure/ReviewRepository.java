package com.example.order.business.product.infrastructure;

import com.example.order.business.product.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}