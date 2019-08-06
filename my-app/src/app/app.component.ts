import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from 'src/app/Servises/authenticationService';
import { User } from 'src/app/Beans/User';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Name of Company';
  currentUser: User;
 
 /*
 currentUser:User={
    id:1,
    name:'stuff',
    email:'emailand stuff'




  };
*/
//currentUser:User= new User();

    constructor(
        private router: Router,
        private authenticationService: AuthenticationService
    ) {
        this.authenticationService.currentUser.subscribe(x => this.currentUser = x);
    }

    logout() {
        this.authenticationService.logout();
        this.router.navigate(['/login']);
    }
    ngOnInit(){
      console.log(this.title);
    }
}
