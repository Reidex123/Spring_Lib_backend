package com.lib.app.DTOs.STAFF;

import java.time.LocalDate;

import com.lib.app.enums.StaffRole;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateStaffRequest(
    @NotBlank String firstName,
    @NotBlank String lastName,
    @Email String email,
    String phone,
    @NotBlank  String employeeNumber,
    @NotNull StaffRole role,
    LocalDate hiredOn,
    @NotBlank String initialPassword
) {}