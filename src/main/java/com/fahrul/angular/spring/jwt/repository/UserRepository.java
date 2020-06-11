package com.fahrul.angular.spring.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fahrul.angular.spring.jwt.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByUserName(String username);

}
