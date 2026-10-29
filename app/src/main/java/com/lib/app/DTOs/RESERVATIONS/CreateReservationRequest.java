package com.lib.app.DTOs.RESERVATIONS;

public record CreateReservationRequest(
    @NotNull Long bookId
) {}