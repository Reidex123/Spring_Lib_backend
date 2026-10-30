package com.lib.app.model;

import java.time.LocalDate;

import com.lib.app.enums.LoanStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="loans")
@NoArgsConstructor
@Getter
@Setter
public class Loan {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long loanId;

    private LocalDate requestedOn;
    private LocalDate pickedupBy;
    private LocalDate issuedOn;
    private LocalDate dueOn;
    private LocalDate returnedOn;
    private int renewalCount;

    @Enumerated(EnumType.STRING)
    private LoanStatus status;

    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    @JoinColumn(name="student_id")
    private Student student;

    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    @JoinColumn(name="copy_id")
    private BookCopy copy;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="issued_by_id")
    private Staff issuedBy;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="received_by_id")
    private Staff receivedBy;
}
