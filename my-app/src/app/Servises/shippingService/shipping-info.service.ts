import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { User } from 'src/app/Beans/User';

@Injectable({
  providedIn: 'root'
})
export class ShippingInfoService {

  constructor(private http: HttpClient) { }

  
}
