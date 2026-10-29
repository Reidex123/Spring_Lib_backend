package com.lib.app.DTOs.COMMON;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor 
@Getter 
@Setter 
public class FieldErrorResponse {
    private String field;
    private String message;
}
