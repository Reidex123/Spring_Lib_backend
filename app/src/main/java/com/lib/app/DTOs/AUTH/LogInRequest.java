package com.lib.app.DTOs.AUTH;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LogInRequest(
    @Email String email,
    @Size(min=8, max=20) @NotBlank String password
) {

}
