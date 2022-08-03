package com.example.thiead.repository.repository;

import com.example.thiead.entity.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
