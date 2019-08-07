import { TestBed } from '@angular/core/testing';

import { ItemPageService } from './item-page.service';

describe('ItemPageService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ItemPageService = TestBed.get(ItemPageService);
    expect(service).toBeTruthy();
  });
});
