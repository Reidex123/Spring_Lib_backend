package com.lib.app.DTOs.FINES;

public record IssueFineRequest(
    @NotNull Long loanId,
    @NotNull FineReason reason,
    @Positive BigDecimal amount;
) {}