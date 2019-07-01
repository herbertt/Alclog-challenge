import { TestBed } from '@angular/core/testing';

import { ProdutoInfoService } from './produto-info.service';

describe('ProdutoInfoService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ProdutoInfoService = TestBed.get(ProdutoInfoService);
    expect(service).toBeTruthy();
  });
});
