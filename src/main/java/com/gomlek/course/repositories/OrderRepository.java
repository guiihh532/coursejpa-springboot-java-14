package com.gomlek.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gomlek.course.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
