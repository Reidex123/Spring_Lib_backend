package com.lib.app.DTOs.COPIES;

import com.lib.app.enums.CopyStatus;

import jakarta.validation.constraints.NotNull;

public record UpdateCopyStatusRequest(
    @NotNull CopyStatus status
) {}
