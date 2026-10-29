package com.lib.app.DTOs.LOANS;

public record ReturnLoanRequest(
    @NotNull CopyCondition copyCondition,
    @Positive BigDecimal damageFineAmount
) {}
