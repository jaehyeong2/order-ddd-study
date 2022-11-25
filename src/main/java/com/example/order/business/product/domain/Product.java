package com.example.order.business.product.domain;

import com.example.order.business.product.presentation.ProductDto;
import com.example.order.global.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Product extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Branch branch;

    private String name;
    private int price;

    private int stockQuantity;

    @Builder
    public Product(Branch branch, String name, int price, int stockQuantity) {
        this.branch = branch;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
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
