import { BaseModel } from './base-model';
import { Ingredient } from './ingredient';

/**
 * Use of an ingredient in a recipe
 */
export class RecipeIngredient extends BaseModel {
    ingredient: Ingredient;
    quantity: number;
    units: string;
    details: string;
}