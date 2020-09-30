import { HttpClientModule } from '@angular/common/http';
import { ComponentFixture, TestBed, waitForAsync } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';

import { RecipeListComponent } from './recipe-list.component';

describe('RecipeListComponent', () => {
  let component: RecipeListComponent;
  let fixture: ComponentFixture<RecipeListComponent>;

  beforeEach(waitForAsync(() => {
    TestBed.configureTestingModule({
      declarations: [ RecipeListComponent ],
      imports: [HttpClientModule, RouterTestingModule]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RecipeListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should render some recipe', waitForAsync(() => {
    fixture.whenStable().then(() => {
      // wait for async data to be loaded and rendered by the component
      // https://angular.io/guide/testing-components-scenarios#async-test-with-waitforasync
      fixture.detectChanges();
      const rows: HTMLElement[] = fixture.nativeElement.querySelectorAll('tr');
      expect(rows.length).toBeGreaterThan(0);
      console.log(rows.length + ' recipes rendered');
    });
  }));
});
