package com.example.order.business.product.domain;

public interface ProductService {
    public Product findProduct(Long id);
    public String deleteProduct(Long id);
    public String updateProduct(Long id);
}
