import { HttpClientModule } from '@angular/common/http';
import { inject, TestBed, waitForAsync } from '@angular/core/testing';
import { RecipeService } from './recipe.service';

describe('RecipeService', () => {
  let service: RecipeService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientModule],
      providers: [RecipeService]
    });
    service = TestBed.inject(RecipeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  it('expects to get recipes', waitForAsync(
    inject(
      [RecipeService],
      (service: RecipeService) => {
        // We call the service
        service.getRecipesList().subscribe(data => {
          expect(data.length).toBeGreaterThan(0);
          console.log(data.length + ' recipes(s)');
        });
      })
  ));

  it('expects to get recipe with id 1', waitForAsync(
    inject(
      [RecipeService],
      (service: RecipeService) => {
        // We call the service
        service.getRecipe(1).subscribe(data => {
          expect(data).toBeTruthy();
          console.log('Recipe: ' + data.title);
          console.log('with ingredients: ' + data.recipesIngredients?.length);
        });
      })
  ));

  it('expects to get ingredients', waitForAsync(
    inject(
      [RecipeService],
      (service: RecipeService) => {
        // We call the service
        service.getIngredientsList().subscribe(data => {
          expect(data.length).toBeGreaterThan(0);
          console.log(data.length + ' ingredient(s)');
        });
      })
  ));

});
