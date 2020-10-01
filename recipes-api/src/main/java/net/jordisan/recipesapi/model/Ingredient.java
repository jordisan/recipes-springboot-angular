/**
 * 
 */
package net.jordisan.recipesapi.model;

import java.net.URL;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Generic ingredient
 * @author jordisan
 *
 */
@Entity
@Table(name="ingredients")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id", scope = Ingredient.class)
public class Ingredient extends BaseEntity {

	@Column(name = "name", nullable = false)
	public String name;
	
	@Column(name = "description", nullable = true)
	public String description;
	
	@Column(name = "photo_url", nullable = true)
	public java.net.URL photoUrl;
	
	@OneToMany(mappedBy = "ingredient")
	@JsonIgnore
	public Set<RecipeIngredient> recipesIngredients = new HashSet<>();	
	
	// Constructors 

	public Ingredient() {}
	public Ingredient(String name, String description, URL photoUrl) {
		super();
		this.name = name;
		this.description = description;
		this.photoUrl = photoUrl;
	}

}
