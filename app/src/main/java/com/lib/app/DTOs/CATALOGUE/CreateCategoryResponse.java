package com.lib.app.DTOs.CATALOGUE;

public record CreateCategoryResponse(
    @NotBlank String name
) {

}
