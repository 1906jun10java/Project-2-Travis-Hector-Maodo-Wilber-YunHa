import { TestBed } from '@angular/core/testing';

import { BillingInfoService } from './billing-info.service';

describe('BillingInfoService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BillingInfoService = TestBed.get(BillingInfoService);
    expect(service).toBeTruthy();
  });
});
