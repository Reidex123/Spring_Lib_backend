package com.lib.app.DTOs.COPIES;

public record UpdateCopyStatusRequest(
    @NotNull CopyStatus status
) {}
