/**
 * 
 */
package net.jordisan.recipesapi.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import net.jordisan.recipesapi.model.Recipe;

/**
 * @author jordisan
 *
 */
@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
