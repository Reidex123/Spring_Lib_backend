package com.lib.app.model;

import java.time.LocalDate;

import com.lib.app.enums.StaffRole;

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
public class Staff extends User {

    @Column(nullable=false, unique=true)
    private String employeeNumber;

    @Enumerated(EnumType.STRING)
    private StaffRole role;

    private LocalDate hiredOn;

}
