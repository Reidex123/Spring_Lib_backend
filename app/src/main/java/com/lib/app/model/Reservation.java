package com.lib.app.model;

import java.time.LocalDate;

import com.lib.app.enums.ReservationStatus;

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
@Table(name="reservations")
@NoArgsConstructor
@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long reservationId;

    private LocalDate reservedOn;
    private LocalDate expiresOn;

    @Enumerated(EnumType.STRING)
    private ReservationStatus status;

    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    @JoinColumn(name="student_id")
    private Student student;

    @ManyToOne(fetch=FetchType.LAZY , optional=false)
    @JoinColumn(name="book_id")
    private Book book;
}
