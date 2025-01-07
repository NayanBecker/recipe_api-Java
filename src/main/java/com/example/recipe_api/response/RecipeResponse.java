package com.example.recipe_api.response;

import java.util.List;

import com.example.recipe_api.model.Recipe;

public record RecipeResponse(
    Integer count,
    List<Recipe> recipes
) {
    
}
