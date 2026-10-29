package com.lib.app.DTOs.STUDENTS;

import com.lib.app.enums.MemberStatus;

import jakarta.validation.constraints.NotNull;

public record UpdateStudentStatusRequest(
    @NotNull MemberStatus status
) {}