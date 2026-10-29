package com.lib.app.DTOs.CATALOGUE;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BookDetailResponse {
    private Long bookId;
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
