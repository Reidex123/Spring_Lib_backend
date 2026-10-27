package com.lib.app.model;

import java.time.LocalDate;

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
public class Payment {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long paymentId;

    private Double amount;
    private LocalDate paidOn;
    private String reference;
}
