import { HttpClientModule } from '@angular/common/http';
import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';
import { ActivatedRoute, convertToParamMap } from '@angular/router';
import { RouterTestingModule } from '@angular/router/testing';

import { RecipeDetailComponent } from './recipe-detail.component';

describe('RecipeDetailComponent', () => {
  let component: RecipeDetailComponent;
  let fixture: ComponentFixture<RecipeDetailComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ RecipeDetailComponent ],
      providers: [{ 
        provide: ActivatedRoute, 
        useValue: {snapshot: {params: {'id': '1'}}}
      }],
      imports: [HttpClientModule, RouterTestingModule]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RecipeDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should render the recipe (title)', waitForAsync(() => {
    fixture.whenStable().then(() => {
      // wait for async data to be loaded and rendered by the component
      // https://angular.io/guide/testing-components-scenarios#async-test-with-waitforasync
      fixture.detectChanges();
      const title: HTMLElement = fixture.nativeElement.querySelector('.recipe-title');
      expect(title.innerText).toBeTruthy();
      console.log('Recipe detail rendered for: ' + title.innerText);
    });
  }));  

  it('should render some ingredient(s)', waitForAsync(() => {
    fixture.whenStable().then(() => {
      // wait for async data to be loaded and rendered by the component
      // https://angular.io/guide/testing-components-scenarios#async-test-with-waitforasync
      fixture.detectChanges();
      const ingredients: HTMLElement[] = fixture.nativeElement.querySelectorAll('.recipe-ingredient');
      expect(ingredients.length).toBeGreaterThan(0);  
    });
  }));  
});
