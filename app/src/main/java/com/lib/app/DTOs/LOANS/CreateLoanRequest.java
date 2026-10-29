package com.lib.app.DTOs.LOANS;

import jakarta.validation.constraints.NotNull;

public record CreateLoanRequest(
    @NotNull Long bookId
) {}
