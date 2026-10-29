package com.lib.app.DTOs.RESERVATIONS;

@AllArgsConstructor
@Getter
@Setter
public class ReservationResponse {
    private Long reservationId;
    private Long bookId;
    private String bookTitle;
    private LocalDate reservedOn;
    private LocalDate expiresOn;
    private ReservationStatus status;
    private int queuePosition;
}
