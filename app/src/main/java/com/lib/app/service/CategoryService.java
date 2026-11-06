package com.lib.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lib.app.DTOs.CATALOGUE.CategoryResponse;
import com.lib.app.DTOs.CATALOGUE.CreateCategoryResponse;
import com.lib.app.exceptions.NoCategoryException;
import com.lib.app.model.Category;
import com.lib.app.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly=true)
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<CategoryResponse> getAll(){
        List<CategoryResponse> response = new ArrayList<>();
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
        Optional<Category> getCategory = categoryRepository.findById(id);
        
        Category foundCategory = getCategory.orElseThrow(() -> new NoCategoryException("Category with id=" + id + " not found"));

        return new CategoryResponse(foundCategory.getName());

    }

    public CategoryResponse create(CreateCategoryResponse request){
        Category category = new Category();
        category.setName(request.name());

        Category savedCategory = categoryRepository.save(category);
        
        return new CategoryResponse(savedCategory.getName());
    }
    
}
