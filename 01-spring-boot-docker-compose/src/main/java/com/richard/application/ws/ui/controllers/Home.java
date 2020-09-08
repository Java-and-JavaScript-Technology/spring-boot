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

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author richard
 *
 */
@RestController
public class Home {

 @RequestMapping("/")
 public String home() {
     return "Welcome to JJST! Demo project for Spring Boot and Docker Compose";
 }
 
}
