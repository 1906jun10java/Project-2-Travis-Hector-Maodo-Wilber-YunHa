import { Component, OnInit } from '@angular/core';
import { CartServiceService } from 'src/app/Servises/CartService/cart-service.service';
import { Item } from 'src/app/Beans/Item';
import { User} from 'src/app/Beans/User';
import { AuthenticationService } from 'src/app/Servises/authenticationService';
import { Subscription } from 'rxjs';


@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {

  constructor(private cartService:CartServiceService,private authenticationService:AuthenticationService) {

    this.currentUserSubscription = this.authenticationService.currentUser.subscribe(user => {
      this.currentUser = user;
  });
   }

  cartList:Item[];
  isNotEmpty:boolean;
  currentUser:User;
  currentUserSubscription: Subscription;
   grandTotal:number=0;
  
  remove(id:number){
   this.cartList= this.cartService.deleteFromList(id);
   this.grandTotal=0;
   this.ngOnInit()

  }

  ngOnInit() {
   this.cartList= this.cartService.seeItemList();
   if(this.cartList.length===0){
     this.isNotEmpty=false;
   }
   else{
     this.isNotEmpty=true;
   }
  for(let i:number=0;i<this.cartList.length;i++){
    this.grandTotal=this.grandTotal+(this.cartList[i].price)*(this.cartList[i].quantityInCart);
  }


  }

}
