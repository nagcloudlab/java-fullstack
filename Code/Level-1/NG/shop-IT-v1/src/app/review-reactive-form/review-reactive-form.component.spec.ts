import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReviewReactiveFormComponent } from './review-reactive-form.component';

describe('ReviewReactiveFormComponent', () => {
  let component: ReviewReactiveFormComponent;
  let fixture: ComponentFixture<ReviewReactiveFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReviewReactiveFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReviewReactiveFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
