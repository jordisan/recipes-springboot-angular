/**
 * 
 */
package net.jordisan.recipesapi.repository;

import org.springframework.stereotype.Repository;
import net.jordisan.recipesapi.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jordisan
 *
 */
@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
