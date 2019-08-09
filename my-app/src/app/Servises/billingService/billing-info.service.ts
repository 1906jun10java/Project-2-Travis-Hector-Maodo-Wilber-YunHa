import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';

import { Billing } from 'src/app/Beans/Billing';

@Injectable({
  providedIn: 'root'
})
export class BillingInfoService {
  baseUrl:string="http://localhost:8082/payment"
  constructor(private http: HttpClient) { }


  getCurrentUserBilling(userid:number): Observable<Billing>{
    return this.http.get<Billing>(`${this.baseUrl}/getPaymentsByUserId/${userid}`)
  }

  putCurrentUserBilling(billing:Billing):Observable<any>{
    return this.http.put<any>(this.baseUrl,billing)
  }
  
}

