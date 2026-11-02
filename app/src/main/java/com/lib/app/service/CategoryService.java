package com.lib.app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lib.app.DTOs.CATALOGUE.CategoryResponse;
import com.lib.app.DTOs.CATALOGUE.CreateCategoryResponse;
import com.lib.app.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly=true)
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<CategoryResponse> getAll(){
        return null;
    }

    public CategoryResponse getById(Long id){
        return null;
    }

    public CategoryResponse create(CreateCategoryResponse request){
        return null;
    }
    
}
