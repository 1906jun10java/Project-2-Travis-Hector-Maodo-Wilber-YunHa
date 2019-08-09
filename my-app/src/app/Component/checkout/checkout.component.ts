import { Component, OnInit } from '@angular/core';
import { CheckoutService } from 'src/app/Servises/checkoutService/checkout.service';
import { CartServiceService } from 'src/app/Servises/CartService/cart-service.service';
import { AuthenticationService } from 'src/app/Servises/authenticationService';
import { ShippingInfoService } from 'src/app/Servises/shippingService/shipping-info.service';
import { BillingInfoService } from 'src/app/Servises/billingService/billing-info.service';
import { User } from 'src/app/Beans/User';
import { Subscription } from 'rxjs';
import { Billing } from 'src/app/Beans/Billing';
import { Address } from 'src/app/Beans/Address';
import { Item } from 'src/app/Beans/Item';
import { Purchase } from 'src/app/Beans/purchase';

@Component({
  selector: 'app-checkout',
  templateUrl: './checkout.component.html',
  styleUrls: ['./checkout.component.css']
})
export class CheckoutComponent implements OnInit {

  currentUser: User;
  currentUserSubscription: Subscription;

  billingInfo:Billing;

  value=false;

  addressInfo:Address;

  valueCheck(){
    if(this.billingInfo[0]===undefined || this.addressInfo[0]===undefined){
      this.value=false
    }
    else{
      this.value=true;
    }
  }

  isNotEmpty:boolean;

  grandTotal:number=0;

  constructor(private checkoutService:CheckoutService,private cartService:CartServiceService,
    private authenticationService:AuthenticationService,private shippingInfoService:ShippingInfoService,
    private billingInfoService:BillingInfoService) {
      this.currentUserSubscription = this.authenticationService.currentUser.subscribe(user => {
        this.currentUser = user;
        console.log(this.currentUser);
    });
     }

     cartList:Item[];

     

  ngOnInit() {
    this.billingInfoService.getCurrentUserBilling(this.currentUser.userId)
   .subscribe(billing => this.billingInfo=billing);

   this.shippingInfoService.getCurrentUserShipping(this.currentUser.userId)
   .subscribe(address=> this.addressInfo=address);

   this.cartList= this.cartService.seeItemList();

  

   
   for(let i:number=0;i<this.cartList.length;i++){
    this.grandTotal=this.grandTotal+(this.cartList[i].price)*(this.cartList[i].quantityInCart);
    console.log(this.grandTotal);
  }
    
  }
  


  

  currentDate= new Date();
  totalNum:Number;
  

  submitOrderUser(){

    this.valueCheck();
    if(this.value){
      this.totalNum=this.grandTotal;
     let obj:object[]=[this.currentUser,this.totalNum,this.billingInfo[0],this.addressInfo[0],this.currentDate,this.cartList]
    this.checkoutService.sendOrder(obj);
    }
   else{
     alert("Update your info to procede")
   }
  }

  ngOnDestroy() {
    // unsubscribe to ensure no memory leaks
    this.currentUserSubscription.unsubscribe();
    
    
}

}
