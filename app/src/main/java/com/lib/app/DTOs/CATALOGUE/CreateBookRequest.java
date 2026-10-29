package com.lib.app.DTOs.CATALOGUE;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record CreateBookRequest(
    @NotBlank String isbn,
    @NotBlank String title,
    String edition,
    @Positive int publicationYear,
    @NotBlank String publisher,
    @NotEmpty List<Long> authorIds,
    @NotNull Long categoryId
) {

}
