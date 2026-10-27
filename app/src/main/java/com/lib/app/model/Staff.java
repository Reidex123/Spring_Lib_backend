package com.lib.app.model;

import java.time.LocalDate;

import com.lib.app.enums.StaffRole;

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
public class Staff extends User{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long employeeId;

    private StaffRole role;
    private LocalDate hiredOn;
}
