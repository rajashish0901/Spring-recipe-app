package com.spring.framework.recipeapp.springrecipeapp.repository;

import com.spring.framework.recipeapp.springrecipeapp.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository <Category,Long> {
    Optional<Category> findByDescription(String description);
}
