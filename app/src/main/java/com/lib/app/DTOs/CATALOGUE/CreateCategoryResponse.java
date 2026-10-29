package com.lib.app.DTOs.CATALOGUE;

import jakarta.validation.constraints.NotBlank;

public record CreateCategoryResponse(
    @NotBlank String name
) {

}
