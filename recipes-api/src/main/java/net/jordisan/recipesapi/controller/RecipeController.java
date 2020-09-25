/**
 * 
 */
package net.jordisan.recipesapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import net.jordisan.recipesapi.model.Recipe;
import net.jordisan.recipesapi.repository.RecipeRepository;

/**
 * @author jordisan
 *
 */
@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class RecipeController {
    @Autowired
    private RecipeRepository recipeRepository;

    @GetMapping("/recipes")
    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }
}
