package com.lib.app.DTOs.COPIES;

@AllArgsConstructor
@Getter
@Setter
public class BookCopyResponse {
    private Long copyId;
    private Long bookId;
    private String barcode;
    private CopyStatus status;
    private CopyCondition condition;
    private String shelfLocation;
    private LocalDate acquiredOn;
}
