package com.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
