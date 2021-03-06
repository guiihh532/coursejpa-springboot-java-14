package com.gomlek.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gomlek.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
