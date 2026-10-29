package com.lib.app.DTOs.AUTH;

import com.lib.app.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class AuthResponse {
    private Long userId;
    private String firstName;
    private String lastName;
    private Role role;
}
