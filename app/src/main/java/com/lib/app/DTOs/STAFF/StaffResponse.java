package com.lib.app.DTOs.STAFF;

import java.time.LocalDate;

import com.lib.app.enums.StaffRole;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor 
@Getter 
@Setter 
public class StaffResponse {
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    private String employeeNumber;

    private StaffRole role;

    private LocalDate hiredOn;
}
