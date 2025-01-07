package com.example.recipe_api.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.recipe_api.response.RecipeResponse;

@FeignClient(name = "recipes", url= "https://forkify-api.herokuapp.com/api/search")
public interface RecipeAPI {
    
    @GetMapping
    public RecipeResponse find(@RequestParam("q") String name);
}
