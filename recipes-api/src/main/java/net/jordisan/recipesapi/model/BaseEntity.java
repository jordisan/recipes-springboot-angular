/**
 * 
 */
package net.jordisan.recipesapi.model;

import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

/**
 * Base class for entities with common data
 * @author jordisan
 *
 */
@MappedSuperclass
public abstract class BaseEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@Column(name = "creation_date", nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@CreationTimestamp
	public java.util.Date creationDate;
}
