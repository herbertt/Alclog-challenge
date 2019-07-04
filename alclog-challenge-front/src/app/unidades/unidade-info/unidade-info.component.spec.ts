import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UnidadeInfoComponent } from './unidade-info.component';

describe('UnidadeInfoComponent', () => {
  let component: UnidadeInfoComponent;
  let fixture: ComponentFixture<UnidadeInfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UnidadeInfoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UnidadeInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
