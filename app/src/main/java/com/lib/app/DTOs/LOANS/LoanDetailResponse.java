package com.lib.app.DTOs.LOANS;

import java.time.LocalDate;

import com.lib.app.enums.LoanStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class LoanDetailResponse {
    private Long loanId;
    private Long studentId;
    private String staudentName;
    private String studentNumber;
    private String bookTitle;
    private Long copyId;
    private String copyBarcode;
    private LoanStatus status;
    private LocalDate requestedOn;
    private LocalDate pickedupBy;
    private LocalDate issuedOn;
    private LocalDate dueOn;
    private LocalDate returnedOn;
    private int renewalCount;
    private String issuedByStaffName;
    private String recievedByStaffName;
}
