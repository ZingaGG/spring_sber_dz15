package com.example.spring_sber_dz15.Repository;

import com.example.spring_sber_dz15.Model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {
    List<Product> getAllProducts();
    Product getProductById(Long id);
}
