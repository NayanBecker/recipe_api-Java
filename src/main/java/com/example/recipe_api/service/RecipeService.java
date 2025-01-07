package com.example.recipe_api.service;

import org.springframework.stereotype.Service;

import com.example.recipe_api.api.RecipeAPI;
import com.example.recipe_api.response.RecipeResponse;

@Service
public class RecipeService {

    private final RecipeAPI recipeAPI;

    public RecipeService(final RecipeAPI recipeAPI) {
        this.recipeAPI = recipeAPI;
    }

    public RecipeResponse find(final String name){
        return recipeAPI.find(name);
    }
}
