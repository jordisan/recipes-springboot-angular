import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Recipe } from '../models/recipe';
import { RecipeService, SortDirection } from '../services/recipe.service';
import '../global.js';

@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.scss']
})
export class RecipeListComponent implements OnInit {

  recipes: Observable<Recipe[]>;

  sortBy: string = 'title';
  sortDirection: SortDirection = SortDirection.ASC;

  constructor(
    private recipeService: RecipeService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.reloadData();
  }

  getSortDirection(): string {
    return SortDirection[this.sortDirection];
  }

  getSortCssClass(col: string): string {
    let cssClass: string = 'sort';
    if (col === this.sortBy) {
      cssClass += ' active ' + this.getSortDirection();
    }
    return cssClass
  }

  reloadData(col: string = null) {
    if (col !== null) {
      if (col === this.sortBy) {
        // if current col, invert direction
        this.sortDirection = this.sortDirection === SortDirection.ASC ? SortDirection.DESC : SortDirection.ASC;
      } else {
        // diferent col
        this.sortBy = col;
        this.sortDirection = SortDirection.ASC;
      }
    }
    this.recipes = this.recipeService.getRecipesList(this.sortBy, this.sortDirection);
  }

}
