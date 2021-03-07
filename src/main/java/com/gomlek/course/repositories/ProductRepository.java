package com.gomlek.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gomlek.course.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
