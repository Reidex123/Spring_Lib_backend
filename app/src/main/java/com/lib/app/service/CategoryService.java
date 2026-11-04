package com.lib.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lib.app.DTOs.CATALOGUE.CategoryResponse;
import com.lib.app.DTOs.CATALOGUE.CreateCategoryResponse;
import com.lib.app.model.Category;
import com.lib.app.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly=true)
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<CategoryResponse> getAll(){
        ArrayList<CategoryResponse> response = new ArrayList<>();
        List<Category> categories = categoryRepository.findAll();

        if (categories.isEmpty()){
            CategoryResponse cat = new CategoryResponse("test");
        
            response.add(cat);
        }

        CategoryResponse cat_response = null;

        for (Category cat: categories){            
            cat_response.setName(cat.getName());
            response.add(cat_response);
        }

        return response;
    }

    public CategoryResponse getById(Long id){
        return null;
    }

    public CategoryResponse create(CreateCategoryResponse request){
        return null;
    }
    
}
