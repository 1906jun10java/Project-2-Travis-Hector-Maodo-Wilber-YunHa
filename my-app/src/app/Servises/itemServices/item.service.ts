import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { Item } from 'src/app/Beans/Item';
import {Employee} from "src/app/Beans/EmployeeTest";


@Injectable({
  providedIn: 'root'
})
export class ItemService {

  private itemUrl='http://localhost:8082/p2/product';
 // private employeeUrl='http://localhost:8082/Project1/allEmployees';

  constructor( private http: HttpClient) { }

  getTopItems(): Observable<Item[]>{
    return this.http.get<Item[]>(this.itemUrl+"/allproducts")
    .pipe(
      catchError(this.handleError<Item[]>('getTopItems', []))
    );
  }

  getItemById(id:string): Observable<Item>{
    return this.http.get<Item>(`${this.itemUrl}/${id}`)
    .pipe(
      catchError(this.handleError<Item>('getTopItems', ))
    );
  }

  getItemByList(type:string,gender:string,size:string,color:string):Observable<Item[]>{
    return this.http.get<Item[]>(`${this.itemUrl}/${type}/${gender}/${size}/${color}`)  
    .pipe(
      catchError(this.handleError<Item[]>('getTopItems',[] ))
    );
  }
/*
  getEmployees():Observable<Employee[]>{
    return this.http.get<Employee[]>(this.employeeUrl)
    .pipe(
      catchError(this.handleError<Employee[]>('getTopItems', []))
    );
  }
*/
  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }

}
