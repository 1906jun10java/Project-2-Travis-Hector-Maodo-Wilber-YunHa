import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { User } from 'src/app/Beans/User';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private userUrl='localhost:8080/User';

  constructor( private http: HttpClient) { }
getAll() {
    return this.http.get<User[]>(`/users`);
}

register(user: User) {
    return this.http.post(`/users/register`, user);
}

delete(id: number) {
    return this.http.delete(`/users/${id}`);
}
  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }
}
