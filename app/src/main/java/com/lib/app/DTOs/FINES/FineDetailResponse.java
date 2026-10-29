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
public class FineDetailResponse {
    private Long fineId;
    private Long loadId;
    private Long studentId;
    private String studentNumber;
    private String bookTiTle;
    private FineReason reason;
    private BigDecimal amount;
    private BigDecimal amountPaid;
    private BigDecimal amountOutStanding;
    private LocalDate issuedOn;
    private FineStatus status;
}
