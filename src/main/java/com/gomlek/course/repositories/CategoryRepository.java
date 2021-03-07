package com.gomlek.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gomlek.course.entities.Category;



public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
