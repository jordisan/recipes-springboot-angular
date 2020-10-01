package net.jordisan.recipesapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.*;

import net.jordisan.recipesapi.controller.RecipeController;
import net.jordisan.recipesapi.model.*;

/**
 * We will consider H2 data (data.sql) as test data.
 * Also, we implement integration tests instead of unit tests because there's little business logic
 * and we expect errors to be caused more likely by integration between layers.
 * @author jordisan
 *
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class RecipesApiApplicationTests {
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@LocalServerPort
	private int port;
	
	@Autowired
	private RecipeController controller;
	
	private String getBaseUrl() {
		return "http://localhost:" + port + "/recipes-api/api/v1";
	}

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
	
	@Test
	public void thereAreRecipes() throws Exception {
		ResponseEntity<Recipe[]> response = this.restTemplate.getForEntity(getBaseUrl() + "/recipes", Recipe[].class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Recipe[] recipes = response.getBody();
		assertThat(recipes).isNotEmpty();
		System.out.println(recipes.length + " recipe(s)");
	}
	
	@Test
	public void thereAreIngredients() throws Exception {
		ResponseEntity<Ingredient[]> response = this.restTemplate.getForEntity(getBaseUrl() + "/ingredients", Ingredient[].class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Ingredient[] ingredients = response.getBody();
		assertThat(ingredients).isNotEmpty();
		System.out.println(ingredients.length + " ingredient(s)");
	}
	
	@Test
	public void getRecipeById() throws Exception {
		int ID = 1;
		ResponseEntity<Recipe> response = this.restTemplate.getForEntity(getBaseUrl() + "/recipes/" + ID, Recipe.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Recipe recipe = response.getBody();
		assertThat(recipe).isNotNull();
		assertThat(recipe.id).isEqualTo(ID);
		System.out.println("Recipe '" + recipe.title 
				+ "' has " + (recipe.recipesIngredients == null ? 0 : recipe.recipesIngredients.size()) + " ingredient(s)");
	}
	
	@Test
	public void getRecipeByIdReturns404() throws Exception {
		int ID = 0; // should not exist
		ResponseEntity<Recipe> response = this.restTemplate.getForEntity(getBaseUrl() + "/recipes/" + ID, Recipe.class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	}
	
	@Test
	public void getRecipesOrderBy() throws Exception {
		ResponseEntity<Recipe[]> response = this.restTemplate.getForEntity(getBaseUrl() + "/recipes?sortBy=id&sortDirection=ASC", Recipe[].class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Recipe[] recipesAsc = response.getBody();
		assertThat(recipesAsc).isNotEmpty();
		
		response = this.restTemplate.getForEntity(getBaseUrl() + "/recipes?sortBy=id&sortDirection=DESC", Recipe[].class);
		assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
		Recipe[] recipesDesc = response.getBody();
		assertThat(recipesDesc).isNotEmpty();
		
		assertThat(recipesAsc[0].id).isNotEqualTo(recipesDesc[0].id);	// make sure that they return recipes in different order 
	}

}
