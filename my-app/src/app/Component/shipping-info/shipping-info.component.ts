import { Component, OnInit,Input } from '@angular/core';
import { User } from 'src/app/Beans/User';
import { Subscription } from 'rxjs';
import { AuthenticationService } from 'src/app/Servises/authenticationService/authentication.service';


@Component({
  selector: 'app-shipping-info',
  templateUrl: './shipping-info.component.html',
  styleUrls: ['./shipping-info.component.css'],
  
})
export class ShippingInfoComponent implements OnInit {
  ngOnInit(): void {
   
  }

  currentUser: User;
  currentUserSubscription: Subscription;

  constructor(  private authenticationService: AuthenticationService) { 
    this.currentUserSubscription = this.authenticationService.currentUser.subscribe(user => {
      this.currentUser = user;
  });
}

ngOnDestroy() {
  // unsubscribe to ensure no memory leaks
  this.currentUserSubscription.unsubscribe();
}



}

