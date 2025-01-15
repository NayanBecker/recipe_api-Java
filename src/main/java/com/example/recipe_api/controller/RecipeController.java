package com.example.recipe_api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.recipe_api.response.RecipeResponse;
import com.example.recipe_api.service.RecipeService;

@RestController
@RequestMapping(value = "/recipes")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(final RecipeService recipeService){
        this.recipeService = recipeService;
    }

    @GetMapping("/dishes")
    public ResponseEntity<RecipeResponse> find(@RequestParam("name") String name){
        return ResponseEntity.ok().body(recipeService.find(name));
    }

    @GetMapping("/metodoResponseEntity")
    public ResponseEntity<Object> metodoResponseEntity() {
        return ResponseEntity.status(400).body("Mensagem de erro");
    }
}
