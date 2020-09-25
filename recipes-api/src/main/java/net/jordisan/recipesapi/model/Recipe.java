/**
 * 
 */
package net.jordisan.recipesapi.model;

import java.net.URL;

import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

/**
 * @author jordisan
 *
 */
@Entity
@Table(name="recipes")
public class Recipe {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@Column(name = "title", nullable = false)
	public String title;
	
	@Column(name = "description", nullable = true)
	public String description;
	
	@Column(name = "instructions", nullable = true, columnDefinition="TEXT")
	public String instructions;
	
	@Column(name = "photo_url", nullable = true)
	public java.net.URL photoUrl;
	
	@Column(name = "creation_date", nullable = false)
	@CreationTimestamp
	public java.util.Date creationDate;

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
