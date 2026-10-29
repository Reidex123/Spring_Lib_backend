package com.lib.app.DTOs.CATALOGUE;

@AllArgsConstructor
@Getter
@Setter
public class BookDetailResponse {
    private LOng bookId;
    private String isbn;
    private String title;
    private String edition;
    private String publisher;
    private int publicationYear;
    private List<AuthorResponse> authors;
    private CategoryResponse category;
    private int availableCopies;
    private int totalCopies;
}
