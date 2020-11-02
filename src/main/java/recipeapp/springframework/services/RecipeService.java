package recipeapp.springframework.services;

import recipeapp.springframework.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();
}
