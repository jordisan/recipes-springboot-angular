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
	
	private long id;
	private String title;
	private String description;
	private String instructions;
	private java.net.URL photoUrl;
	private java.util.Date creationDate;

	// Constructors 

	public Recipe() {}
	public Recipe(String title, String description, String instructions, URL photoUrl) {
		super();
		this.title = title;
		this.description = description;
		this.instructions = instructions;
		this.photoUrl = photoUrl;
	}
	
	// Getters / setters
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "title", nullable = false)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "description", nullable = true)
	public String getDescription() {
		return description;
	}	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "instructions", nullable = true, columnDefinition="TEXT")
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	@Column(name = "photo_url", nullable = true)
	public java.net.URL getPhotoUrl() {
		return photoUrl;
	}
	public void setPhotoUrl(java.net.URL photoUrl) {
		this.photoUrl = photoUrl;
	}

	@Column(name = "creation_date", nullable = false)
	@CreationTimestamp
	public java.util.Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(java.util.Date creationDate) {
		this.creationDate = creationDate;
	}

}
