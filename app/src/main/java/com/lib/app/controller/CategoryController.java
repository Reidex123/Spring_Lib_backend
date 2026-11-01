package com.lib.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lib.app.DTOs.CATALOGUE.CategoryResponse;
import com.lib.app.DTOs.CATALOGUE.CreateCategoryResponse;
import com.lib.app.service.CategoryService;
import java.util.List;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/categories")
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping
    public List<CategoryResponse> getAll(){
        return categoryService.getAll().orElseThrow(() -> new RuntimeException("Error retrieving the categories!!")); 
    }
    @GetMapping("/{id}")
    public CategoryResponse getById(@PathVariable Long id){
        return categoryService.getById(id).orElseThrow(() -> new RuntimeException("Speified category does not exist"));
    }
    @PostMapping
    public ResponseEntity<CategoryResponse> create(@Valid @RequestBody CreateCategoryResponse request){
        CategoryResponse created = categoryService.create(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }
}
