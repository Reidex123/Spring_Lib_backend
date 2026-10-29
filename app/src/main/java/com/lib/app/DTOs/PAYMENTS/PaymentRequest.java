package com.lib.app.DTOs.PAYMENTS;

import java.math.BigDecimal;

import jakarta.validation.constraints.Positive;

public record PaymentRequest(
    @Positive BigDecimal amount
) {}