import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GreetingBoxComponent } from './greeting-box.component';

describe('GreetingBoxComponent', () => {
  let component: GreetingBoxComponent;
  let fixture: ComponentFixture<GreetingBoxComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GreetingBoxComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GreetingBoxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
