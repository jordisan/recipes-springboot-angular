/**
 * 
 */
package net.jordisan.recipesapi.model;

import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Base class for entities with common data
 * @author jordisan
 *
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@JsonIdentityInfo(
		generator = ObjectIdGenerators.PropertyGenerator.class, 
		property = "id"
)
public abstract class BaseEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@Column(name = "creation_date", nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@CreationTimestamp
	public java.util.Date creationDate;
}
