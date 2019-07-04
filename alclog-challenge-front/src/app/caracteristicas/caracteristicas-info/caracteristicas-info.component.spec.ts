import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CaracteristicasInfoComponent } from './caracteristicas-info.component';

describe('CaracteristicasInfoComponent', () => {
  let component: CaracteristicasInfoComponent;
  let fixture: ComponentFixture<CaracteristicasInfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CaracteristicasInfoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CaracteristicasInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
