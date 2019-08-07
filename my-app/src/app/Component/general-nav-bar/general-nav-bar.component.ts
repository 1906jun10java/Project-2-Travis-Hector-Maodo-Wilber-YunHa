import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/Beans';
import { Subscription } from 'rxjs';
import { AuthenticationService, UserService } from 'src/app/Servises/authenticationService';
import { Router } from '@angular/router';

@Component({
  selector: 'app-general-nav-bar',
  templateUrl: './general-nav-bar.component.html',
  styleUrls: ['./general-nav-bar.component.css']
})
export class GeneralNavBarComponent implements OnInit {
  currentUser: User;
  currentUserSubscription: Subscription;
  users: User[] = [];
  constructor(
    private router: Router,
    private authenticationService: AuthenticationService,
    private userService: UserService
) {
    this.currentUserSubscription = this.authenticationService.currentUser.subscribe(user => {
        this.currentUser = user;
    });
}
  ngOnInit() {
  }
  logout() {
    this.authenticationService.logout();
    this.router.navigate(['/home']);
}

}
