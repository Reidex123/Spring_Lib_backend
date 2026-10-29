package com.lib.app.DTOs.FINES;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.lib.app.enums.FineReason;
import com.lib.app.enums.FineStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FineResponse {
    private Long fineId;
    private Long loanId;
    private String bookTitle;
    private FineReason reason;
    private BigDecimal amount;
    private BigDecimal amountPaid;
    private BigDecimal amountOutStanding;
    private LocalDate issuedOn;
    private FineStatus status;
}
