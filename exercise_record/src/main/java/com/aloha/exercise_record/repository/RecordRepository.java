package com.aloha.exercise_record.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aloha.exercise_record.entity.Exercise;

public interface RecordRepository extends JpaRepository<Exercise, Integer> {
  
  
}
