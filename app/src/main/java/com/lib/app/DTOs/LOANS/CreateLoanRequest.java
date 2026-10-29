package com.lib.app.DTOs.LOANS;

public record CreateLoanRequest(
    @NotNull Long bookId
) {}
