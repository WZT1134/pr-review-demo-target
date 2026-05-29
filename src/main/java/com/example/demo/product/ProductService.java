package com.example.demo.product;

import java.math.BigDecimal;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final List<Product> products = List.of(
            new Product(1L, "Keyboard", new BigDecimal("89.00"), true),
            new Product(2L, "Mouse", new BigDecimal("39.00"), true),
            new Product(3L, "Monitor", new BigDecimal("249.00"), false)
    );

    public List<Product> findAll(boolean activeOnly) {
        if (!activeOnly) {
            return products;
        }
        return products.stream()
                .filter(Product::active)
                .toList();
    }

    public Product findById(Long id) {
        return products.stream()
                .filter(product -> product.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Product not found: " + id));
    }
}
