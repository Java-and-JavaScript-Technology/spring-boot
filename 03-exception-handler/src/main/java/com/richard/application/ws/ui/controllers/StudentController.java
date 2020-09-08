/**
 * Nickname: Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.ws.ui.controllers;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.richard.application.exceptions.InvaliFielException;
import com.richard.application.ws.ui.model.request.StudentRequest;

/**
 * @author richard
 *
 */
@RestController
@RequestMapping("/student")
public class StudentController {

 @PostMapping
 /**
 * 
 */
 public String saveStudentInformation(@RequestBody StudentRequest studentRequest) {
  String isNull = "";

  if (studentRequest.getFirstName().equals(isNull)) {
   throw new InvaliFielException("Invali Fiel Exception!");
  }

  return "Student Information was saved!";
 }

 @ExceptionHandler
 public String handleInvaliFielException(InvaliFielException e){
  return e.getMessage();
 }
}
