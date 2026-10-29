package com.lib.app.DTOs.RESERVATIONS;

import jakarta.validation.constraints.NotNull;

public record CreateReservationRequest(
    @NotNull Long bookId
) {}