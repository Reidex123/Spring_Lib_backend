package com.lib.app.DTOs.CATALOGUE;

public record UpdateBookRequest(
    @NotBlank String title,
    String edition,
    @NotBlank String publisher,
    @Positive int publicationYear,
    @NotEmpty List<Long> authorIds,
    @NotNull Long categoryId
) {

}
