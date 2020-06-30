package com.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
