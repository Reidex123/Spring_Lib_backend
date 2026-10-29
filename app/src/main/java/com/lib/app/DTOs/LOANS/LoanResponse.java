package com.lib.app.DTOs.LOANS;

@AllArgsConstructor
@Getter
@Setter
public class LoanResponse {
    private Long loanId;
    private String bookTitle;
    private LoanStatus status;
    private LocalDate requestedOn;
    private LocalDate pickedupBy;
    private LocalDate issuedOn;
    private LocalDate dueOn;
    private LocalDate returnedOn;
    private int renewalCount;
}
