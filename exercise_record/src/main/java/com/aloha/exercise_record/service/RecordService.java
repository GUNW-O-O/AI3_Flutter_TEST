package com.aloha.exercise_record.service;

import java.util.List;

import com.aloha.exercise_record.domain.Exercise;

public interface RecordService {

  List<Exercise> getAll();

  Exercise getOne(Integer id);

  Exercise create(Exercise dto);

  Exercise update(Exercise dto);

  boolean destroy(Integer id);

}
