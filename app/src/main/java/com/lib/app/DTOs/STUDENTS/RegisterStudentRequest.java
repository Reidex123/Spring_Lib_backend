package com.lib.app.DTOs.STUDENTS;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record RegisterStudentRequest(
    @NotBlank String firstName,
    @NotBlank String lastName,
    @Email String email,
    String phone,
    @NotNull @NotBlank String studentNumber,
    @Size(min=8, max=20) String initialPassword
) {}