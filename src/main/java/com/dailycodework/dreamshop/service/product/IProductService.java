package com.dailycodework.dreamshop.service.product;

import com.dailycodework.dreamshop.model.Product;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);
    Product getProductById(Long id);
    void deleteProductById(Long id);
    void updateProduct(Product product, Long productId);
    List<Product> getAllProduct();
    List<Product> getProductsByCategoryId(Long categoryID);
}
