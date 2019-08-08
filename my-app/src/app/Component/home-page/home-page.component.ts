import { Component, OnInit } from '@angular/core';
import { Item } from 'src/app/Beans/Item';
import {ItemService} from 'src/app/Servises/itemServices/item.service';
import {Employee} from "src/app/Beans/EmployeeTest";
import { Subscription } from 'rxjs';
import { first } from 'rxjs/operators';
import { User } from '../../Beans';
import { UserService, AuthenticationService } from '../../Servises/authenticationService';
import { CompileShallowModuleMetadata } from '@angular/compiler';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {
  currentUser: User;
  currentUserSubscription: Subscription;
  users: User[] = [];
  constructor(
    private authenticationService: AuthenticationService,
    private userService: UserService,
    private itemService:ItemService
) {
    this.currentUserSubscription = this.authenticationService.currentUser.subscribe(user => {
        this.currentUser = user;
    });
}

coolNum:number=Math.floor((Math.random() * 5) + 1);
memeNum:number=Math.floor((Math.random() * 4) + 1)


ngOnDestroy() {
    // unsubscribe to ensure no memory leaks
    this.currentUserSubscription.unsubscribe();
}

  items:Item[];
  

  
  ngOnInit() {
    
    
    this.itemService.getTopItems()
    .subscribe(items => this.items=items);
    
    
  }
  
}  