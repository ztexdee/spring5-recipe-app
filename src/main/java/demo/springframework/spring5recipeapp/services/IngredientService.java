package demo.springframework.spring5recipeapp.services;

import demo.springframework.spring5recipeapp.commands.IngredientCommand;
import demo.springframework.spring5recipeapp.domain.Ingredient;

public interface IngredientService {


    Ingredient add(Ingredient ingredient);
    IngredientCommand findCommandById(Long id);
}
