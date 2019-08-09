import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ItemService } from 'src/app/Servises/itemServices/item.service';
import { Item } from 'src/app/Beans/Item';
import { CartServiceService } from 'src/app/Servises/CartService/cart-service.service';
import { User } from 'src/app/Beans';
import { Subscription } from 'rxjs';
import { UserService, AuthenticationService } from 'src/app/Servises/authenticationService';

@Component({
  selector: 'app-item-detail',
  templateUrl: './item-detail.component.html',
  styleUrls: ['./item-detail.component.css']
})
export class ItemDetailComponent implements OnInit {
  currentUser: User;
  currentUserSubscription: Subscription;
  users: User[] = [];

  public href: String = "";
  constructor(private router: Router,private authenticationService: AuthenticationService,
    private userService: UserService,private itemService:ItemService,private cartService : CartServiceService) {
    this.currentUserSubscription = this.authenticationService.currentUser.subscribe(user => {
    this.currentUser = user;
});
 }
  currentItem:Item;
  
  

  addToCart(){
    let split=this.href.split("/item/",2);
    this.cartService.addToList(this.currentItem);
  }
  
  ngOnInit() {
    this.href = this.router.url;
    let split=this.href.split("/item/",2);
    
        console.log(split[1]);
        this.itemService.getItemById(split[1])
        .subscribe(item=>this.currentItem=item);
  }

}
