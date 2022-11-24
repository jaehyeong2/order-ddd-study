package com.example.order.business.product.infrastructure;

import com.example.order.business.product.domain.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, Long> {
}