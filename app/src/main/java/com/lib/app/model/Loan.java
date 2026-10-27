package com.lib.app.model;

import java.time.LocalDate;

import com.lib.app.enums.LoanStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Loan {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long loanId;

    private LocalDate requestedOn;
    private LocalDate pickedUpBy;
    private LocalDate issuedOn;
    private LocalDate dueOn;
    private LocalDate returnedOn;
    private Integer renewalCount;
    private LoanStatus status;
}
