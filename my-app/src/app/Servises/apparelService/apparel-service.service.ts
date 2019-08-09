import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ApparelServiceService {
  baseURL:string="http://localhost:8080/Items";
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
}
