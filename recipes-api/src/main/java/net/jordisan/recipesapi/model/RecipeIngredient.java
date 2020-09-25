/**
 * 
 */
package net.jordisan.recipesapi.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author jordisan
 *
 */
@Entity
@Table(name="recipes_ingredients")
public class RecipeIngredient extends BaseEntity {

	@ManyToOne
    @JoinColumn(name = "recipe_id")
	@JsonIgnore
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
