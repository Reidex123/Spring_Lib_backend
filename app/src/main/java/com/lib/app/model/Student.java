package com.lib.app.model;

import java.time.LocalDate;

import com.lib.app.enums.MemberStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Student extends User{
    @Column(nullable=false, unique=true)
    private String studentNumber;
    @Enumerated(EnumType.STRING)
    private MemberStatus status;
    private LocalDate registeredOn;
}
