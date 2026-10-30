package com.lib.app.DTOs.AUTH;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record LogInRequest(
    @Email @NotNull String email,
    @NotBlank String password
) {

}
