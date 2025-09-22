package com.aloha.exercise_record.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aloha.exercise_record.domain.Exercise;

@RestController
public class info {
  
  @GetMapping()
  public ResponseEntity<?> getAll() {
      try {
          return new ResponseEntity<>("GetAll Results", HttpStatus.OK);
      } catch (Exception e) {
          return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
  }
  
  @GetMapping("/{id}")
  public ResponseEntity<?> getOne(@PathVariable Integer id) {
      try {
          return new ResponseEntity<>("GetOne Result", HttpStatus.OK);
      } catch (Exception e) {
          return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
  }
  
  @PostMapping()
  public ResponseEntity<?> create(@RequestBody Exercise dto) {
      try {
          return new ResponseEntity<>("Create Result", HttpStatus.OK);
      } catch (Exception e) {
          return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
  }
  
  @PutMapping()
  public ResponseEntity<?> update(@RequestBody Exercise dto) {
      try {
          return new ResponseEntity<>("Update Result", HttpStatus.OK);
      } catch (Exception e) {
          return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
  }
  
  @DeleteMapping("/{id}")
  public ResponseEntity<?> destroy(@PathVariable Integer id) {
      try {
          return new ResponseEntity<>("Destroy Result", HttpStatus.OK);
      } catch (Exception e) {
          return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
  }
}
