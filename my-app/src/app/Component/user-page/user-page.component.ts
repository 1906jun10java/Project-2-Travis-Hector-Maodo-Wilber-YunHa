import { Component, OnInit } from '@angular/core';
import { User } from '../../Beans';
import { UserService, AuthenticationService } from '../../Servises/authenticationService';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-user-page',
  templateUrl: './user-page.component.html',
  styleUrls: ['./user-page.component.css']
})
export class UserPageComponent implements OnInit {
  currentUser: User;
  currentUserSubscription: Subscription;
  constructor(private authenticationService: AuthenticationService) {
    this.currentUserSubscription = this.authenticationService.currentUser.subscribe(user => {
      this.currentUser = user;
  });
   }
  
  ngOnInit() {
   
  }

  ngOnDestroy() {
    // unsubscribe to ensure no memory leaks
    this.currentUserSubscription.unsubscribe();
}

}
