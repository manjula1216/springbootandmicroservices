package com.vlm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vlm.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	
}
