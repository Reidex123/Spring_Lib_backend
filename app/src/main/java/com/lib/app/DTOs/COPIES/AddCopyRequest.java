package com.lib.app.DTOs.COPIES;

public record AddCopyRequest(
    @NotBlank String barcode,
    @NotNull CopyCondition condition,
    @NotBlank String shelfLocation,
    LocalDate acquiredOn
) {}
