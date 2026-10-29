package com.lib.app.DTOs.RESERVATIONS;

@AllArgsConstructor
@Getter
@Setter
public class ReservationDetailResponse {
    private Long reservationId;
    private Long studentId;
    private String studentNumber;
    private String studentName;
    private Long bookId;
    private String bookTitle;
    private LocalDate reservedOn;
    private LocalDate expiresOn;
    private ReservationStatus status;
}
