package com.lib.app.DTOs.CATALOGUE;

public record CreateAuthorRequest(
    @NotBlank String name
) {

}
