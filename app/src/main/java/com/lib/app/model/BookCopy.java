package com.lib.app.model;

import java.time.LocalDate;

import com.lib.app.enums.CopyCondition;
import com.lib.app.enums.CopyStatus;

import jakarta.persistence.Column;
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
@Table(name="book_copies")
@NoArgsConstructor
@Getter
@Setter
public class BookCopy {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long copyId;

    @Column(nullable=false, unique=true)
    private String barcode;

    @Enumerated(EnumType.STRING)
    private CopyStatus status;

    @Enumerated(EnumType.STRING)
    private CopyCondition copyCondition;

    private String shelfLocation;

    private LocalDate acquiredOn;

    @ManyToOne(fetch=FetchType.LAZY, optional=false)
    @JoinColumn(name="book_id")
    private Book book;
}
