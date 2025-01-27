package com.example.spring_sber_dz15.Service;

import com.example.spring_sber_dz15.Model.Product;
import com.example.spring_sber_dz15.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductRepository{

    private final List<Product> products = Arrays.asList(
            new Product(1L, "Laptop", 1000.0),
            new Product(2L, "Smartphone", 500.0),
            new Product(3L, "Headphones", 100.0)
    );

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProductById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
