package com.lib.app.DTOs.CATALOGUE;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record UpdateBookRequest(
    @NotBlank String title,
    String edition,
    @NotBlank String publisher,
    @Positive int publicationYear,
    @NotEmpty List<Long> authorIds,
    @NotNull Long categoryId
) {

}
