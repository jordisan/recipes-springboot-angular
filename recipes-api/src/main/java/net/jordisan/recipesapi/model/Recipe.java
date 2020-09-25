/**
 * 
 */
package net.jordisan.recipesapi.model;

import java.net.URL;

import javax.persistence.*;

/**
 * @author jordisan
 *
 */
@Entity
@Table(name="recipes")
public class Recipe extends BaseEntity {
	
	@Column(name = "title", nullable = false)
	public String title;
	
	@Column(name = "description", nullable = true)
	public String description;
	
	@Column(name = "instructions", nullable = true, columnDefinition="TEXT")
	public String instructions;
	
	@Column(name = "photo_url", nullable = true)
	public java.net.URL photoUrl;
	
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
