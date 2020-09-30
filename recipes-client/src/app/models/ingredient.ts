import { Url } from 'url';
import { BaseModel } from './base-model';

/**
 * Single ingredient
 */
export class Ingredient extends BaseModel {
    name: string;
    description: string;
    photoUrl: Url;
}