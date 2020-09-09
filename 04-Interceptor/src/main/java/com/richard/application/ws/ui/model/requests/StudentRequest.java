/**
 * Nickname: Richard
 * Email: richardvu.work@gmail.com
 * Skype: luongvu.work@gmail.com
 * Phone: (+84) 0935710974 - (+84) 0935810974
 * Country: Viet Nam
 * Year: 2020
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER
 */
package com.richard.application.ws.ui.model.requests;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * @author richard
 *
 */
@Getter
@Setter
public class StudentRequest implements Serializable {

 private static final long serialVersionUID = 5660424244498885335L;

 private String firstName;

 private String lastName;

 private String age;
 
}
