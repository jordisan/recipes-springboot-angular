/**
 * 
 */
package net.jordisan.recipesapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import net.jordisan.recipesapi.model.Recipe;
import net.jordisan.recipesapi.model.Ingredient;
import net.jordisan.recipesapi.repository.RecipeRepository;
import net.jordisan.recipesapi.repository.IngredientRepository;

/**
 * @author jordisan
 *
 */
@RestController @CrossOrigin(origins = {"http://localhost:4200", "http://localhost:9876"})
@RequestMapping("/api/v1")
public class RecipeController {
    @Autowired
    private RecipeRepository recipeRepository;
    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }
    
    @GetMapping("/recipes/{id}")
    public Recipe getRecipeById(@PathVariable Long id) {
        return recipeRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe with id " + id + " not found"));
    }
    
    @GetMapping("/ingredients")
    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }
}
