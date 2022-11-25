package com.example.order.business.product.domain;

import com.example.order.business.orders.domain.OrderProduct;
import com.example.order.business.product.presentation.ProductDto;
import com.example.order.global.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Branch branch;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private Set<OrderProduct> orderProducts = new HashSet<>();

    private String name;
    private int price;

    private int stockQuantity;

    @Formula("select count(*) from Review r where r.product_id = id")
    private int reviewCount;

    @Builder
    public Product(Branch branch, String name, int price, int stockQuantity, int reviewCount) {
        this.branch = branch;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.reviewCount = reviewCount;
    }

    public static Product create(Branch branch,ProductDto.Create dto){
        return Product.builder()
                .branch(branch)
                .price(dto.getPrice())
                .name(dto.getName())
                .stockQuantity(dto.getStockQuantity())
                .build();
    }
}
