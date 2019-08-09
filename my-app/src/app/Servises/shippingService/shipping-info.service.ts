import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { User } from 'src/app/Beans/User';
import { Address } from 'src/app/Beans/Address';

@Injectable({
  providedIn: 'root'
})
export class ShippingInfoService {

  baseUrl:string="http://localhost:8082/p2/address"
  constructor(private http: HttpClient) { }
  getCurrentUserShipping(userid:number): Observable<Address>{
    return this.http.get<Address>(`${this.baseUrl}/getAddressesByUserId/${userid}`)

  }

  putCurrentUserShipping(address:Address):Observable<any>{
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json'
        
      })
    };
    return this.http.put<any>(this.baseUrl+"/addOrUpdate",address,httpOptions)
  }
 

  
}
