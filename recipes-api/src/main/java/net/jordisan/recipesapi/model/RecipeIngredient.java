/**
 * 
 */
package net.jordisan.recipesapi.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Use of an ingredient in a recipe
 * @author jordisan
 *
 */
@Entity
@Table(name="recipes_ingredients")
public class RecipeIngredient extends BaseEntity {
	
	// We will use the explicit id instead of a composite primary key;
	// it seems possible that the same ingredient is used multiple times in a recipe 

	@ManyToOne
    @JoinColumn(name = "recipe_id")
	@JsonIgnore	// to avoid infinite loops, we won't include recipes when serializing ingredients 
    public Recipe recipe;
	
	@ManyToOne
    @JoinColumn(name = "ingredient_id")
    public Ingredient ingredient;
	
	@Column(name = "quantity", nullable = true)
	public int quantity;
	
	@Column(name = "units", nullable = true)
	public String units;
	
	@Column(name = "details", nullable = true)
	public String details;
	
	// Constructors 

	public RecipeIngredient() {}

}
