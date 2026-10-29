package com.lib.app.DTOs.COPIES;

import java.time.LocalDate;

import com.lib.app.enums.CopyCondition;
import com.lib.app.enums.CopyStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

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
