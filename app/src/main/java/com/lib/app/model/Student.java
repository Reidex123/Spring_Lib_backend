package com.lib.app.model;

import java.time.LocalDate;

import com.lib.app.enums.MemberStatus;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Student extends User{
    private String studentNumber;
    private MemberStatus status;
    private LocalDate registeredOn;
}
