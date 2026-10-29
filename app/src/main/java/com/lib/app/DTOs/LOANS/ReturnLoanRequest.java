package com.lib.app.DTOs.LOANS;

import java.math.BigDecimal;

import com.lib.app.enums.CopyCondition;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ReturnLoanRequest(
    @NotNull CopyCondition copyCondition,
    @Positive BigDecimal damageFineAmount
) {}
