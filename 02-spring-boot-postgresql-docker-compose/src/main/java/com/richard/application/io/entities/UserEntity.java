/**
 * Nickname: Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.io.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * @author richard
 *
 */
@Getter
@Setter
@Entity(name="users")
public class UserEntity {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 
 @Column(name = "first_name")
 private String firstName;
 
 @Column(name = "last_name")
 private String lastName;
 
 @Column(name = "email")
 private String email;
 
 @Column(name = "password")
 private String password;
 
}
