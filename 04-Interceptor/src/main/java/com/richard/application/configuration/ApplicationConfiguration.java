/**
 * Nickname: Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.richard.application.intercepter.RequestHeaderIntercepter;

/**
 * @author richard
 *
 */
@Configuration
public class ApplicationConfiguration implements WebMvcConfigurer{
 
 @Autowired
 private RequestHeaderIntercepter requestHeaderIntercepter;
 
 @Override
 public void addInterceptors(InterceptorRegistry registry) {
  registry.addInterceptor(requestHeaderIntercepter);
 }

}
