/**
 * 
 */
package net.jordisan.recipesapi.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import net.jordisan.recipesapi.model.Ingredient;

/**
 * @author jordisan
 *
 */
@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
