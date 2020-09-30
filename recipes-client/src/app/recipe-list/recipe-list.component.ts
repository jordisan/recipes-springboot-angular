import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Recipe } from '../models/recipe';
import { RecipeService } from '../services/recipe.service';
import '../global.js';

@Component({
  selector: 'app-recipe-list',
  templateUrl: './recipe-list.component.html',
  styleUrls: ['./recipe-list.component.scss']
})
export class RecipeListComponent implements OnInit {

  recipes: Observable<Recipe[]>;

  constructor(
    private recipeService: RecipeService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.reloadData();
  }

  reloadData() {
    this.recipes = this.recipeService.getRecipesList();
  }

}
