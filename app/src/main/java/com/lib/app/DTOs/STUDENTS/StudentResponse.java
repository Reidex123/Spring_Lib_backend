package com.lib.app.DTOs.STUDENTS;

import java.time.LocalDate;

import com.lib.app.enums.MemberStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor 
@Setter
@Getter 
public class StudentResponse {
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String studentNumber;
    private MemberStatus status;
    private LocalDate registeredOn;
}
