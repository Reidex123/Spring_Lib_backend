package com.lib.app.DTOs.COMMON;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class PageResponse {
    private List content;
    private int page;
    private int size;
    private Long totalElements;
    private int totalPages;
}
