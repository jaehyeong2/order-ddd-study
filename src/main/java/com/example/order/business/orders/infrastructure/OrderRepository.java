package com.example.order.business.orders.infrastructure;

import com.example.order.business.orders.domain.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}