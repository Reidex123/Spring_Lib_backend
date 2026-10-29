package com.lib.app.DTOs.CATALOGUE;

@AllArgsConstructor
@Getter
@Setter
public class BookSummaryResponse {
    private Long bookId;
    private String isbn;
    private String title;
    private List<String> authors;
    private String categoryName;
    private int availableCopies;
    private int totalCopies;
}
