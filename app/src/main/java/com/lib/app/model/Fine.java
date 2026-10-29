package com.lib.app.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.lib.app.enums.FineReason;
import com.lib.app.enums.FineStatus;

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
@Table(name="fines")
@NoArgsConstructor
@Getter
@Setter
public class Fine {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long fineId;

    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private FineReason reason;
    
    private LocalDate issuedOn;

    @Enumerated(EnumType.STRING)
    private FineStatus status;

    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    @JoinColumn(name="loan_id")
    private Loan loan;
    
}
