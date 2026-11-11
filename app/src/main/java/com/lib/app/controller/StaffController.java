package com.lib.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lib.app.DTOs.STAFF.CreateStaffRequest;
import com.lib.app.DTOs.STAFF.StaffResponse;
import com.lib.app.service.UserDetailsService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/staff")
public class StaffController {
    private final UserDetailsService staffService;

    @GetMapping("/all")
    public List<StaffResponse> getAll() {
        return staffService.getAllStaff();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StaffResponse> getById(@PathVariable Long id){
        StaffResponse response = staffService.getStaffById(id);

        return ResponseEntity.status(HttpStatus.FOUND).body(response);
    }
    
    @PostMapping
    public ResponseEntity<StaffResponse> createStaff(@Valid @RequestBody CreateStaffRequest request){
        return null;
    }
}
