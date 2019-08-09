import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Item } from 'src/app/Beans/Item';
import { Purchase } from 'src/app/Beans/purchase';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CheckoutService {
  url="http://localhost:8082/p2/something";
  constructor(private http: HttpClient) { }

  
  sendOrder(cartList:Item[],p:Purchase):Observable<any>{
    let obj:object[]=[cartList,p];
    console.log(obj);
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json'
        
      })
    };
    return this.http.post(this.url,obj,httpOptions)
  }






}
