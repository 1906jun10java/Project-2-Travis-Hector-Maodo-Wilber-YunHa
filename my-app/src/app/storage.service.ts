import { Inject, Injectable } from '@angular/core';
import { LOCAL_STORAGE, StorageService } from 'ngx-webstorage-service';
import { Item } from './Beans/Item';




@Injectable({
  providedIn: 'root'
})

export class LocalStorageService {
  
  cartList=[];
  constructor(@Inject(LOCAL_STORAGE) private storage: StorageService) { }

  
}
