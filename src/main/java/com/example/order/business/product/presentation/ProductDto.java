package com.example.order.business.product.presentation;

import lombok.Data;

public class ProductDto {

    @Data
    public static class Create{
        private String name;
        private int price;
        private int stockQuantity;
    }
}
