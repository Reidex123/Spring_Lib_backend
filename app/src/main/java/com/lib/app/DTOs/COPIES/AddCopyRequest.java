package com.lib.app.DTOs.COPIES;

import java.time.LocalDate;

import com.lib.app.enums.CopyCondition;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AddCopyRequest(
    @NotBlank String barcode,
    @NotNull CopyCondition condition,
    @NotBlank String shelfLocation,
    LocalDate acquiredOn
) {}
