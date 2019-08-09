import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';

import { User } from 'src/app/Beans/User';
import { map } from 'rxjs/operators';
import { Credentials } from 'src/app/Beans/creds';

@Injectable({ providedIn: 'root'})
export class AuthenticationService {
    private currentUserSubject:
    BehaviorSubject<User>;
    public currentUser: Observable<User>;

    userUrl="http://localhost:8082/p2/login";

    constructor(private http: HttpClient) {
        this.currentUserSubject = new
        BehaviorSubject<User>(JSON.parse
        (localStorage.getItem('currentUser')));
        this.currentUser = 
        this.currentUserSubject.asObservable();
    }

    

   

    public get currentUserValue(): User {
        return this.currentUserSubject.value;
    }

    login(Email: string, Password: string) {
        const httpOptions = {
            headers: new HttpHeaders({
              'Content-Type':  'application/json'
              
            })
          };

        let cridentials=new Credentials(Email,Password);
       
        let creds=JSON.stringify(cridentials);
        console.log(creds);
        return this.http.post<any>(this.userUrl,creds,httpOptions )
            .pipe(map(user => {
                // login successful if there's a jwt token in the response
                if (user && true) {
                    // store user details and jwt token in local storage to keep user logged in between page refreshes
                    localStorage.setItem('currentUser', JSON.stringify(user));
                    this.currentUserSubject.next(user);
                    localStorage.removeItem('cartList');
                    localStorage.setItem("cartList",JSON.stringify([]));
                }

                return user;
            }));
    }

    logout() {
        // remove user from local storage to log user out
        localStorage.removeItem('currentUser');
        localStorage.removeItem('cartList');
        localStorage.setItem("cartList",JSON.stringify([]));
        this.currentUserSubject.next(null);
    }
}