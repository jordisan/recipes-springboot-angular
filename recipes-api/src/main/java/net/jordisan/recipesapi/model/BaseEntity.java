/**
 * 
 */
package net.jordisan.recipesapi.model;

import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

/**
 * @author jordisan
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.TABLE)
	public long id;
	
	@Column(name = "creation_date", nullable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@CreationTimestamp
	public java.util.Date creationDate;
}
