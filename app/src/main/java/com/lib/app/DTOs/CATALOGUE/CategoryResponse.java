package com.lib.app.DTOs.CATALOGUE;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CategoryResponse {
    private Long categoryId;
    private String name;
}
