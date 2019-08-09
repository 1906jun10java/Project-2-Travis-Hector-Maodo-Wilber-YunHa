import { TestBed } from '@angular/core/testing';

import { ApparelServiceService } from './apparel-service.service';

describe('ApparelServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ApparelServiceService = TestBed.get(ApparelServiceService);
    expect(service).toBeTruthy();
  });
});
