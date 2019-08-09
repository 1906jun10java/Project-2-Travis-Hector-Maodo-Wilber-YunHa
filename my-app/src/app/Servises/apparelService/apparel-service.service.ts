import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { Item } from 'src/app/Beans/Item';
@Injectable({
  providedIn: 'root'
})
export class ApparelServiceService {
  baseURL:string="http://localhost:8082/p2/product";
  constructor(private http: HttpClient) { }

  getColorList():Observable<any>{
    return this.http.get(this.baseURL+"/colors")
  }

  getSizeList():Observable<any>{
    return this.http.get(this.baseURL+"/sizes")
  }

  getTypeList():Observable<any>{
    return this.http.get(this.baseURL+"/Types")
  }

  getItemsColor(color:String):Observable<Item[]>{
    return this.http.get<Item[]>(`${this.baseURL}/getColor/${color}`)
      
  }

  getItemsGender(gender:String):Observable<Item[]>{
    return this.http.get<Item[]>(`${this.baseURL}/getGender/${gender}`)
      
  }

  getItemsTypes(type:String):Observable<Item[]>{
    return this.http.get<Item[]>(`${this.baseURL}/getType/${type}`)
      
  }

  getItemsSize(size:String):Observable<Item[]>{
    return this.http.get<Item[]>(`${this.baseURL}/getSize/${size}`)
      
  }
}
