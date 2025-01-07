package com.example.recipe_api.model;

public record Recipe(
        String publisher,
        String tittle,
        String source_url,
        String recipe_url,
        String image_url,
        Integer social_rank,
        String publisher_url
        ) {

}
