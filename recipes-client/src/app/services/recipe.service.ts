import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Ingredient } from '../models/ingredient';
import { Recipe } from '../models/recipe';
import { environment } from "../../environments/environment";

export enum SortDirection {
  ASC,
  DESC
}

@Injectable({
  providedIn: 'root'
})
export class RecipeService {

  private baseUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  getIngredientsList(sortBy: string = 'name', sortDirection: SortDirection = SortDirection.ASC): Observable<Ingredient[]> {
    return this.http.get<Ingredient[]>(`${this.baseUrl}/ingredients`, { params: {
      sortBy: sortBy,
      sortDirection: SortDirection[sortDirection]
    }});
  }

  getRecipesList(sortBy: string = 'title', sortDirection: SortDirection = SortDirection.DESC): Observable<Recipe[]> {
    return this.http.get<Recipe[]>(`${this.baseUrl}/recipes`, { params: {
      sortBy: sortBy,
      sortDirection: SortDirection[sortDirection]
    }});
  }

  getRecipe(id: number): Observable<Recipe> {
    return this.http.get<Recipe>(`${this.baseUrl}/recipes/${id}`);
  }
}
