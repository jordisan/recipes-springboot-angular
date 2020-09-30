import { Url } from 'url';
import { BaseModel } from './base-model';
import { RecipeIngredient } from './recipe-ingredient';

/**
 * Single recipe
 */
export class Recipe extends BaseModel {
    title: string;
    description: string;
    instructions: string;
    photoUrl: Url;
    recipesIngredients: RecipeIngredient[];
}