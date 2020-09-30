import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Recipe } from 'app/models/recipe';
import { RecipeService } from 'app/services/recipe.service';

@Component({
  selector: 'app-recipe-detail',
  templateUrl: './recipe-detail.component.html',
  styleUrls: ['./recipe-detail.component.scss']
})
export class RecipeDetailComponent implements OnInit {
  
  id: number;
  recipe: Recipe;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private recipeService: RecipeService
  ) { }

  ngOnInit(): void {
    this.recipe = new Recipe();
    this.id = this.route.snapshot.params['id'];    
    this.recipeService.getRecipe(this.id)
      .subscribe(data => {
        this.recipe = data;
      }, error => console.log(error));
  }

}
