package com.lib.app.DTOs.AUTH;

public record LogInRequest(
    @Email String email,
    @Size(min=8, max=20) @NotBlank String password
) {

}
