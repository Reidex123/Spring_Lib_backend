package com.lib.app.DTOs.AUTH;

@AllArgsConstructor
@Getter
@Setter
public class AuthResponse {
    private Long userId;
    private String firstName;
    private String lastName;
    private Role role;
}
