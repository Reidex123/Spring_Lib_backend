package com.lib.app.DTOs.PAYMENTS;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.lib.app.enums.FineStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PaymentResponse {
    private Long paymentId;
    private Long fineId;
    private BigDecimal amount;
    private LocalDate paidOn;
    private String reference;
    private FineStatus status;
}
