import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ingredient } from '../models/ingredient';
import { Recipe } from '../models/recipe';

@Injectable({
  providedIn: 'root'
})
export class RecipeService {

  private baseUrl = 'http://localhost:8080/recipes-api/api/v1';

  constructor(private http: HttpClient) { }

  getIngredientsList(): Observable<Ingredient[]> {
    return this.http.get<Ingredient[]>(`${this.baseUrl}/ingredients`);
  }

  getRecipesList(): Observable<Recipe[]> {
    return this.http.get<Recipe[]>(`${this.baseUrl}/recipes`);
  }

  getRecipe(id: number): Observable<Recipe> {
    return this.http.get<Recipe>(`${this.baseUrl}/recipes/${id}`);
  }
}
