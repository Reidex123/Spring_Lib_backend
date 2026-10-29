package com.lib.app.DTOs.COMMON;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor 
@Getter 
@Setter 
public abstract class PageResponse<T> {
    private List<T> contenet;
    private int page;
    private int size;
    private Long totalElements;
    private int totalPages;
}
