package com.lib.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lib.app.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    boolean existsByName(String name);
}
