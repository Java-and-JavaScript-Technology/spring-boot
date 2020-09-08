/**
 * Nickname: Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.io.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.richard.application.io.entities.UserEntity;

/**
 * @author richard
 *
 */
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {

 /**
  * @param email
  * @return
  */
 UserEntity findByEmail(String email);
 
}
