package net.jordisan.recipesapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.assertj.core.util.Arrays;

import net.jordisan.recipesapi.controller.RecipeController;
import net.jordisan.recipesapi.model.*;

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

}
