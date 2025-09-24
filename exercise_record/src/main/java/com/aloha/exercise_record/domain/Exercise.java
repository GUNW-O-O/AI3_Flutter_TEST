package com.aloha.exercise_record.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "exercises")
public class Exercise {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  @Enumerated(EnumType.STRING)
  @Column(nullable = false)
  private swimmingStyles styles;
  
  @Column(nullable = false)
  private Integer time;

  @Column(nullable = false)
  private Integer distance;

  @Column
  private String memo;

  @Column
  private Integer calories;

  public void calcCalories() {
    if (user == null || styles == null || distance == null) {
        calories = 0;
        return;
    }
    double weight = user.getWeight();
    Integer distanceMeters = this.distance;
    double factor;

    switch (styles) {
        case BreastStroke:factor = 17; break;
        case Backstroke:  factor = 13; break;
        case Freestyle:   factor = 14; break;
        case Butterfly:   factor = 18; break;
        default: factor = 0;
    }
    double kcal = (distanceMeters / 100.0) * (weight / 70.0) * factor;
    this.calories = (int) Math.round(kcal);
  }
  

  public enum swimmingStyles {
    BreastStroke, Backstroke, Freestyle, Butterfly
  }
}
