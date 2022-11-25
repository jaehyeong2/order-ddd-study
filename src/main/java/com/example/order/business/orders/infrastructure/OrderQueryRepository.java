package com.example.order.business.orders.infrastructure;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class OrderQueryRepository {
    private final JPAQueryFactory queryFactory;


}
