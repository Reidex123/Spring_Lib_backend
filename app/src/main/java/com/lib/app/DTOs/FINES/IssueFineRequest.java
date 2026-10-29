package com.lib.app.DTOs.FINES;

import java.math.BigDecimal;

import com.lib.app.enums.FineReason;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record IssueFineRequest(
    @NotNull Long loanId,
    @NotNull FineReason reason,
    @Positive BigDecimal amount
) {}