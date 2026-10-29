package com.lib.app.DTOs.LOANS;

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
    private LOcalDate issuedOn;
    private LOcalDate dueOn;
    private LOcalDate returnedOn;
    private int renewalCount;
    private String issuedByStaffName;
    private String recievedByStaffName;
}
