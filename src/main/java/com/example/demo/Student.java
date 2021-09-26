package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Student model
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {
    /** Name */
    String firstName;
    /** Surname */
    String lastName;
    /** Middle name */
    String middleName;
}
