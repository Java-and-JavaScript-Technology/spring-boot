/**
 * Nickname: Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.exceptions.handlers;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.richard.application.exceptions.StudentException;
import com.richard.application.ws.ui.model.responses.ErrorMessage;

/**
 * @author richard
 *
 */
@ControllerAdvice
public class StudentExceptionHandler {

 @ExceptionHandler(value = { StudentException.class })
 public ResponseEntity<Object> handleUserServiceException(StudentException ex, WebRequest request) {

  ErrorMessage errorMessage = new ErrorMessage(new Date(), ex.getMessage());

  return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);

 }

}
