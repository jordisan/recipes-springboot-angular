/**
 * 
 */
package net.jordisan.recipesapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
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
@RestController @CrossOrigin(origins = {"http://localhost:4200", "http://localhost:9876", "https://recipes-client-angular.herokuapp.com"})
@RequestMapping("/api/v1")
public class RecipeController {
    @Autowired
    private RecipeRepository recipeRepository;
    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes(
		@RequestParam(defaultValue = "title") String sortBy, 
		@RequestParam(defaultValue = "ASC") Sort.Direction sortDirection
	) {
        return recipeRepository.findAll(Sort.by(sortDirection, sortBy));
    }
    
    @GetMapping("/recipes/{id}")
    public Recipe getRecipeById(@PathVariable Long id) {
        return recipeRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe with id " + id + " not found"));
    }
    
    @GetMapping("/ingredients")
    public List<Ingredient> getAllIngredients(
		@RequestParam(defaultValue = "name") String sortBy, 
		@RequestParam(defaultValue = "ASC") Sort.Direction sortDirection    		
	) {
        return ingredientRepository.findAll(Sort.by(sortDirection, sortBy));
    }
}
