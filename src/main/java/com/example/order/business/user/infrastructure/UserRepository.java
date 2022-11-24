package com.example.order.business.user.infrastructure;

import com.example.order.business.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}