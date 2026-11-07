package com.lib.app.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lib.app.service.UserDetailsService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/staff")
public class StaffController {
    private final UserDetailsService staffService;
}
