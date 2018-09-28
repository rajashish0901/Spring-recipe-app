package com.spring.framework.recipeapp.springrecipeapp.repository;

import com.spring.framework.recipeapp.springrecipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository <Recipe, Long> {

}
