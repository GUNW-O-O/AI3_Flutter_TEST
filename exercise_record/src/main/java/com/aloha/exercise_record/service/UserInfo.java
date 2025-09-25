package com.aloha.exercise_record.service;

import com.aloha.exercise_record.entity.User;

public interface UserInfo {

  User getOne(Integer id);
  User create(User user);
  User update(User user);
  boolean destroy(Integer id);

}
