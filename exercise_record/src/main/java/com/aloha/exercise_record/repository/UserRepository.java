package com.aloha.exercise_record.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aloha.exercise_record.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
  
}
