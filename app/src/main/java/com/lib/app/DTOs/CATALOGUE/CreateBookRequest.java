package com.lib.app.DTOs.CATALOGUE;

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
