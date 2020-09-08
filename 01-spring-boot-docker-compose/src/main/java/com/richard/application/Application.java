package com.richard.application;

import org.springframework.boot.SpringApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

 @GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
 public String home() {

  return "Welcome to JJST! Demo project for Spring Boot and Docker Compose";
 }

 public static void main(String[] args) {
  SpringApplication.run(Application.class, args);
 }

}
