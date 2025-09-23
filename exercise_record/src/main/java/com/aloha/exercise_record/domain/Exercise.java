package com.aloha.exercise_record.domain;

import lombok.Data;

@Data
public class Exercise {

  private Long id;
  private String styles;
  private Integer time;
  private Integer distance;
  
}
