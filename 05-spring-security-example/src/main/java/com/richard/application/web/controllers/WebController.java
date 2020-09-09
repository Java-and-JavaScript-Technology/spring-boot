/**
 * Nickname: Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author richard
 *
 */
@Controller
public class WebController {
 
 @GetMapping(value = {"/", "/home"})
 public String homepage() {
     return "home";
 }

 @GetMapping("/hello")
 public String hello() {
     return "hello";
 }
 
}
