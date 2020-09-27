/**
 * 
 */
package net.jordisan.recipesapi.model;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Single recipe
 * @author jordisan
 *
 */
@Entity
@Table(name="recipes")
@JsonIdentityInfo(
		scope = Recipe.class,
		generator = ObjectIdGenerators.PropertyGenerator.class, 
		property = "id"
)
public class Recipe extends BaseEntity {
	
	@Column(name = "title", nullable = false)
	public String title;
	
	@Column(name = "description", nullable = true)
	public String description;
	
	/**
	 * Recipe instructions as a single text; 
	 * TODO: separate this as steps in a different table?
	 */
	@Column(name = "instructions", nullable = true, columnDefinition="TEXT")
	public String instructions;
	
	@Column(name = "photo_url", nullable = true)
	public java.net.URL photoUrl;
	
	@OneToMany(mappedBy = "recipe")
	public Set<RecipeIngredient> recipesIngredients = new HashSet<>();
	
	// Constructors 

	public Recipe() {}
	public Recipe(String title, String description, String instructions, URL photoUrl) {
		super();
		this.title = title;
		this.description = description;
		this.instructions = instructions;
		this.photoUrl = photoUrl;
	}

}
